package VideoGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import VideoGame.Game.STATE;

public class Menu extends MouseAdapter {	
	private Game game;
	private Handler handler;
	private Random r = new Random();
	
	public boolean toggleTrails = true;
	public static boolean multiplayer = false;
	
	int timer = 10;
	public Menu(Game game, Handler handler) {
		this.handler = handler;
		this.game = game;	
	}
	
	public void mousePressed(MouseEvent e) {
	}
	
	public void mouseReleased(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();
		if(Game.gameState == STATE.Menu) {
			//play button
			if (mouseOver(mx, my, 380, 250, 200, 64)) {
				Game.gameState = STATE.Select;
				return;
			}
			//help button
			if (mouseOver(mx, my, 380, 350, 200, 64)) {
				Game.gameState = STATE.Help;
			}
			//quit button
			if (mouseOver(mx, my, 380, 450, 200, 64)) {
				System.exit(1);
			}
		}
		
		if(Game.gameState == STATE.End || Game.gameState == STATE.Finish) {
			if (mouseOver(mx, my, 380, 450, 200, 64)) {
				Game.gameState = STATE.Menu;
				HUD.score = 0;
				HUD.level = 1;
				Spawn.scoreKeep = 0;
				Shop.itemsBought = 0;
				handler.speed = 5;
				HUD.HEALTH = 100;
				HUD.bounds = 0;
				Shop.B1 = 2000;
				Shop.B2 = 2000;
				Shop.B3 = 2000;
			}
		}
		
		if(timer <= 0) {
			if (Game.gameState == STATE.Help) {
				//back button
				if (mouseOver(mx, my, 380, 550, 200, 64)) {
					Game.gameState = STATE.Menu;
					return;
				}
				
				if(mouseOver(mx, my, 380, 350, 200, 64)) {
					if(toggleTrails == true) {
						toggleTrails = false;
					}
					
					else if(toggleTrails == false) {
						toggleTrails = true;
					}
				}
				
				if(mouseOver(mx, my, 380, 450, 200, 64)) {
					if(multiplayer == false) {
						 multiplayer = true;
					}
					
					else if(multiplayer == true) {
						multiplayer = false;
					}
				}
			}
			
			if(Game.gameState == STATE.Select) {
				if (mouseOver(mx, my, 380, 250, 200, 64)) {
					Game.gameState = STATE.Game;
					if(multiplayer == false) {
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler, this, game));
						handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, this));
					}
					
					else if(multiplayer == true) {
						HUD.HEALTH2 = 100;
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler, this, game));
						handler.addObject(new Player2(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player2, handler, this, game));
						handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, this));
					}
					game.diff = 0;
				}
				
				if (mouseOver(mx, my, 380, 350, 200, 64)) {
					Game.gameState = STATE.Game;
					if(multiplayer == false) {
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler, this, game));
						handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, this));
					}
					
					else if(multiplayer == true) {
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler, this, game));
						handler.addObject(new Player2(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player2, handler, this, game));
						handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, this));
					}
					game.diff = 1;
				}
				
				if (mouseOver(mx, my, 380, 450, 200, 64)) {
					Game.gameState = STATE.Menu;
					return;
				}
			}
		}
	}
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height ) {
		if (mx > x && mx < x + width) {
			if (my > y && my < y + height) {
				return true;
			}
			else return false;
		}
		else return false;
	}
	
	public void tick() {
		if(Game.gameState == STATE.Help || Game.gameState == STATE.Select)timer--;
		if(Game.gameState == STATE.Menu) timer = 10; 
	}
	
	public void render(Graphics g) {
		if(Game.gameState == STATE.Menu) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Squares", 380, 100);
			g.setFont(fnt2);
			g.setColor(Color.white);
			g.drawRect(380, 250, 200, 64);
			g.drawString("Play", 445, 290);
			g.setColor(Color.white);
			g.drawRect(380, 350, 200, 64);
			g.drawString("Help", 445, 390);
			g.setColor(Color.white);
			g.drawRect(380, 450, 200, 64);
			g.drawString("Quit", 445, 490);
		}
		
		else if (Game.gameState == STATE.Help) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Options", 380, 100);
			g.setFont(fnt2);
			g.drawString("Use WASD to move the player.  Don't get hit by the enemies.", 50, 164);
			g.drawString("Press space to go to the shop. Their are 50 levels on", 50, 216);
			g.drawString("Normal mode, and their are 40 levels on Hard mode, but it", 50, 264);
			g.drawString("spawns hard enemies only.", 50, 316);
			if(toggleTrails == true) {
				g.setColor(Color.white);
				g.drawRect(380, 350, 200, 64);
				g.drawString("Trails: On", 410, 390);
			}
			
			else if(toggleTrails == false) {
				g.setColor(Color.white);
				g.drawRect(380, 350, 200, 64);
				g.drawString("Trails: Off", 410, 390);
			}
			
			if(multiplayer == false) {
				g.setColor(Color.white);
				g.drawRect(380, 450, 200, 64);
				g.drawString("Singleplayer", 393, 490);
			}
			
			else if(multiplayer == true) {
				g.setColor(Color.white);
				g.drawRect(380, 450, 200, 64);
				g.drawString("2 players", 415, 490);
			}
			g.setColor(Color.white);
			g.drawRect(380, 550, 200, 64);
			g.drawString("Back", 445, 590);
		}
		
		else if(Game.gameState == STATE.Select) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Select Difficulty", 290, 100);
			g.setFont(fnt2);
			g.setColor(Color.white);
			g.drawRect(380, 250, 200, 64);
			g.drawString("Normal", 430, 290);
			g.setColor(Color.white);
			g.drawRect(380, 350, 200, 64);
			g.drawString("Hard", 445, 390);
			g.setColor(Color.white);
			g.drawRect(380, 450, 200, 64);
			g.drawString("Back", 445, 490);
		}
		
		else if (Game.gameState == STATE.End) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("You Lose", 380, 100);
			g.setFont(fnt2);
			g.drawString("You lost with a score of " + HUD.score, 100, 200);
			g.setColor(Color.white);
			g.drawRect(380, 450, 200, 64);
			g.drawString("Back", 445, 490);
		}
		
		else if (Game.gameState == STATE.Finish) {
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("You Win", 380, 100);
			g.setFont(fnt2);
			g.drawString("You won with a score of " + HUD.score, 100, 200);
			if(Shop.itemsBought == 1) g.drawString("You bought " + Shop.itemsBought + " item.", 100, 248);
			else g.drawString("You bought " + Shop.itemsBought + " items.", 100, 248);
			if(game.diff == 1) {
				g.drawString("And you did it on hard mode!", 100, 296);
				if(Shop.itemsBought == 0) {
					g.drawString("Wait, did you hack!?!", 100, 344);
				}
				
				else {
					g.drawString("You should play some other bullet hell game ", 100, 344);
					g.drawString("that is better than this one.", 100, 392);
				}
			}
			g.setColor(Color.white);
			g.drawRect(380, 450, 200, 64);
			g.drawString("Back", 445, 490);
		}
	}
}