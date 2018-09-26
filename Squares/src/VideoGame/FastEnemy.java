package VideoGame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
public class FastEnemy extends GameObject{
	private Handler handler;
	private Menu menu;
	public FastEnemy(int x, int y, ID id, Handler handler, Menu menu) {
		super(x, y, id);
		this.handler = handler;
		this.menu = menu;	
			velX = 9;
			velY = 2;
	}
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 16, 16);
	}
	public void tick() {
		x += velX;
		y += velY;
		if(y <= 0 || y >= Game.HEIGHT - 48) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		if(menu.toggleTrails == true) handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.cyan, 16, 16, 0.02f, handler));
	}
	public void render(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect((int)x, (int)y, 16, 16);
	}
}