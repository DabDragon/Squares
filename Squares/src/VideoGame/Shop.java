package VideoGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Shop extends MouseAdapter{
	
	Handler handler;
	HUD hud;
	private int B1 = 2000;
	private int B2 = 2000;
	private int B3 = 2000;
	public static int itemsBought = 0;
	
	public Shop(Handler handler, HUD hud) {
		this.handler = handler;
		this.hud = hud;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.white);
		g.setFont(new Font("arial", 0, 48));
		g.drawString("Shop", Game.WIDTH/2-50, 50);
		
		g.setFont(new Font("arial", 0, 12));
		g.drawString("Upgrade Health", 281, 120);
		g.drawString("Cost: " + B1, 281, 140);
		g.drawRect(271, 100, 100, 80);
		

		g.drawString("Upgrade Speed", 445, 120);
		g.drawString("Cost: " + B2, 445, 140);
		g.drawRect(435, 100, 100, 80);
		

		g.drawString("Refill Health", 610, 120);
		g.drawString("Cost: " + B3, 610, 140);
		g.drawRect(600, 100, 100, 80);
		
		g.setFont(new Font("arial", 0, 24));
		g.drawString("Score: " + HUD.score, 300, 300);
		g.drawString("Items bought: " + itemsBought, 300, 332);
		g.drawString("Press Space to go back to the game.", 300, 364);
	}
	
	public void mousePressed(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		
		if(mx >= 271 && mx <= 371) {
			if(my >= 100 && my <= 180) {
				if(HUD.score >= B1) {
					HUD.score -= B1;
					B1 += 2000;
					HUD.bounds += 20;
					HUD.HEALTH = (100 + (HUD.bounds/2));
					itemsBought++;
				}
			}
		}
		if(mx >= 435 && mx <= 535) {
			if(my >= 100 && my <= 180) {
				if(HUD.score >= B2) {
					HUD.score -= B2;
					B2 += 2000;
					handler.speed++;
					itemsBought++;
				}
			}
		}
		if(mx >= 600 && mx <= 700) {
			if(my >= 100 && my <= 180) {
				if(HUD.score >= B3) {
					HUD.score -= B3;
					HUD.HEALTH = (100 + (HUD.bounds/2));
					itemsBought++;
				}
			}
		}
	}
}
