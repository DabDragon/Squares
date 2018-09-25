package VideoGame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
public class EnemyBossBullet2 extends GameObject{
	private Handler handler;
	Random r = new Random();
	private Menu menu;
	public EnemyBossBullet2(int x, int y, ID id, Handler handler, Menu menu) {
		super(x, y, id);
		this.handler = handler;
		this.menu = menu;
		velX = (r.nextInt(5 - -5) + -5);
		velY = -5;
	}
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 8, 8);
	}
	public void tick() {
		x += velX;
		y += velY;	
		if(y <= 0 || y >= Game.HEIGHT) handler.removeObject(this);
		if(x <= 0 || x >= Game.WIDTH) handler.removeObject(this);
		if(menu.toggleTrails == true) handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.magenta, 8, 8, 0.02f, handler));
	}
	public void render(Graphics g) {
		g.setColor(Color.magenta);
		g.fillRect((int)x, (int)y, 8, 8);
	}
}