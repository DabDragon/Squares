package VideoGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class MirrorXPlayer extends GameObject{
	
	Handler handler;
	Menu menu;
	
	public MirrorXPlayer(int x, int y, ID id, Handler handler, Menu menu) {
		super(x, y, id);
		this.handler = handler;
		this.menu = menu;
	}
	
	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 32, 32);
	}
	
	public void tick() {
		x += velX;
		y += velY;	
		x = Game.clamp(x, 0, Game.WIDTH - 38);
		y = Game.clamp(y, 0, Game.HEIGHT - 64);	
		if(menu.toggleTrails == true) handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.gray, 32, 32, 0.08f, handler));
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect((int)x, (int)y, 32, 32);
	}
}