package VideoGame;
import java.awt.Color;
import java.awt.Graphics;
public class HUD {
	public static int bounds = 0;
	public static float HEALTH = 100;
	public static float HEALTH2 = 100;
	private float greenValue = 255;	
	private float greenValue2 = 255;
	public static int score = 0;
	public static int level = 1;
	public void tick() {
		HEALTH = Game.clamp(HEALTH, 0, 100+(bounds/2));
		HEALTH2 = Game.clamp(HEALTH2, 0, 100+(bounds/2));
		greenValue = HEALTH*2;
		greenValue = Game.clamp(greenValue, 0 , 255);
		greenValue2 = HEALTH2*2;
		greenValue2 = Game.clamp(greenValue2, 0, 255);
		score++;
	}
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15, 15, 200 + bounds, 32);
		
		g.setColor(new Color(75, (int)greenValue, 0));
		g.fillRect((int)15, (int)15, (int)HEALTH * 2, (int)32);
		
		g.setColor(Color.white);
		g.drawRect(15, 15, 200 + bounds, 32);
		
		if(Menu.multiplayer == true) {
			g.setColor(Color.gray);
			g.fillRect(Game.WIDTH - (220 + bounds), 15, 200 + bounds, 32);
			
			g.setColor(new Color(75, (int)greenValue2, 0));
			g.fillRect((int)Game.WIDTH - (220 + bounds), (int)15, (int)HEALTH2 * 2, (int)32);
			
			g.setColor(Color.white);
			g.drawRect(Game.WIDTH - (220 + bounds), 15, 200 + bounds, 32);
		}
		
		g.drawString("Score: " + score, 15, 64);
		g.drawString("Level: " + level, 15, 80);
		g.drawString("Press space for shop", 15, 94);
	}
}