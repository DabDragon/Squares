package VideoGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class HardFastEnemy extends GameObject{

	private Handler handler;
	private Menu menu;
	private Random r = new Random();
	
	public HardFastEnemy(int x, int y, ID id, Handler handler, Menu menu) {
		super(x, y, id);
		this.handler = handler;
		this.menu = menu;
		
		int choice = r.nextInt(1);
		if(choice == 0) {
			velX = 18;
			velY = 4;
		}
		else {
			velX = 4;
			velY = 18;
		}
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 16, 16);
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y >= Game.HEIGHT - 55) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 16) velX *= -1;
		
		if(menu.toggleTrails == true) handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.cyan, 16, 16, 0.02f, handler));
	}

	
	public void render(Graphics g) {
		g.setColor(Color.cyan);
		g.fillRect((int)x, (int)y, 16, 16);
	}

}
