package VideoGame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;
public class MovingEnemyBoss extends GameObject{
	private Handler handler;
	Random r = new Random();
	private Menu menu;
	public MovingEnemyBoss(int x, int y, ID id, Handler handler, Menu menu) {
		super(x, y, id);
		this.handler = handler;
		this.menu = menu;	
		velX = 3;
		velY = 3;
	}
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 96, 96);
	}
	public void tick() {
		x += velX;
		y += velY;
		int spawn = r.nextInt(25);
		if(spawn == 0) {
			handler.addObject(new EnemyBossBullet((int)x + 48, (int)y + 48, ID.BasicEnemy, handler, menu));
			handler.addObject(new EnemyBossBullet2((int)x + 48, (int)y + 48, ID.BasicEnemy, handler, menu));
			handler.addObject(new EnemyBossBullet3((int)x + 48, (int)y + 48, ID.BasicEnemy, handler, menu));
			handler.addObject(new EnemyBossBullet4((int)x + 48, (int)y + 48, ID.BasicEnemy, handler, menu));
		}
		if(y <= 0 || y >= Game.HEIGHT - 96) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 96) velX *= -1;
		if(menu.toggleTrails == true) handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.ORANGE, 96, 96, 0.08f, handler));
	}
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect((int)x, (int)y, 96, 96);
	}
}