package VideoGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class HardEnemyBoss extends GameObject{

	private Handler handler;
	Random r = new Random();
	private int timer = 70;
	private int timer2 = 50;
	private Menu menu;
	
	public HardEnemyBoss(int x, int y, ID id, Handler handler, Menu menu) {
		super(x, y, id);
		this.handler = handler;
		this.menu = menu;
		
		velX = 0;
		velY = 2;
	}

	public Rectangle getBounds() {
		return new Rectangle((int)x, (int)y, 96, 96);
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		if(timer <= 0) velY = 0;
		else timer--;
		if(timer <= 0) timer2--;
		if(timer2 <= 0) {
			if(velX == 0) velX = 2;
			int spawn = r.nextInt(5);
			if(spawn == 0) handler.addObject(new EnemyBossBullet((int)x + 48, (int)y + 48, ID.BasicEnemy, handler, menu));
		}
		
		//if(y <= 0 || y >= Game.HEIGHT - 55) velY *= -1;
		if(x <= 0 || x >= Game.WIDTH - 96) velX *= -1;
		
		if(menu.toggleTrails == true) handler.addObject(new Trail((int)x, (int)y, ID.Trail, Color.ORANGE, 96, 96, 0.08f, handler));
	}

	
	public void render(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect((int)x, (int)y, 96, 96);
	}

}
