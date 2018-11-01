package VideoGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class SmartEnemy2 extends GameObject{
	
	private Handler handler;
	private GameObject player;
	private Menu menu;
	
	public SmartEnemy2(int x, int y, ID id, Handler handler, Menu menu) {
		super(x, y, id);
		this.handler = handler;
		this.menu = menu;
		for(int i = 0; i < handler.object.size(); i++) {
			if(handler.object.get(i).getId() == ID.Player2) player = handler.object.get(i);
		}
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 16, 16);
	}
	
	public void tick() {	
		x += velX;
		y += velY;	
		float diffX = x-player.getX() - 16;
		float diffY = y-player.getY() - 16;
		float distance = (int) Math.sqrt((x - player.getX()) * (x - player.getX()) + (y - player.getY()) * (y - player.getY()));
		velX = (int) ((-1.0 / distance) * diffX * 2);
		velY = (int) ((-1.0 / distance) * diffY * 2);
		if(menu.toggleTrails == true) handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.green, 16, 16, 0.02f, handler));
	}
	
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.fillRect((int)x, (int)y, 16, 16);
	}
}
