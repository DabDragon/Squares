package VideoGame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

public class Game extends Canvas implements Runnable{
	private static final long serialVersionUID = 4074938860981483192L;
	
	public static final int WIDTH = 960, HEIGHT = WIDTH / 12 * 9;
	private Thread thread;
	
	private boolean running = false;
	
	public int diff = 0;
	
	private Handler handler;
	private HUD hud;
	private Spawn spawner;
	private Menu menu;
	private Shop shop;
	
	Random r = new Random();
	
	public enum STATE {
		Menu,
		Select,
		Help,
		Shop,
		Game,
		Finish,
		End
	};
	
	public static STATE gameState = STATE.Menu;
	
	public Game() {
		handler = new Handler();
		menu = new Menu(this, handler);
		hud = new HUD();
		shop = new Shop(handler, hud);
		this.addKeyListener(new KeyInput(handler));
		this.addMouseListener(menu);
		this.addMouseListener(shop);
		new Window(WIDTH, HEIGHT, "Squares", this);
		spawner = new Spawn(handler, menu, this);
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			running = false;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private int frames = 0;
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running) render();
			frames++;
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				frames = 0;
			}
		}
		stop();
	}

	private void tick() {
		if(gameState == STATE.Game) {
			handler.tick();
			hud.tick();
			spawner.tick();
			if(Menu.multiplayer == false) {
				if(HUD.HEALTH <= 0) {
					gameState = STATE.End;
					handler.object.clear();
				}
			}
			if(Menu.multiplayer == true) {
				if(HUD.HEALTH <= 0) {
					for (int i = 0; i < handler.object.size(); i++) {
			            GameObject tempObject = handler.object.get(i);
			            if(tempObject.getId() == ID.Player) {
			            	handler.removeObject(tempObject);
			            	i--;
			            }
			        }
				}
				if(HUD.HEALTH2 <= 0) {
					for (int i = 0; i < handler.object.size(); i++) {
			            GameObject tempObject = handler.object.get(i);
			            if(tempObject.getId() == ID.Player2) {
			            	handler.removeObject(tempObject);
			            	i--;
			            }
			        }
				}
				if(HUD.HEALTH <= 0 && HUD.HEALTH2 <= 0) {
					gameState = STATE.End;
					handler.object.clear();
				}
			}
		}
		else if(gameState == STATE.Menu || gameState == STATE.Help || gameState == STATE.Select || gameState == STATE.End || gameState == STATE.Finish) {
			handler.tick();
			menu.tick();
		}
	}
	
	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		if(gameState == STATE.Game) {
			handler.render(g);
			hud.render(g);
		}
		else if(gameState == STATE.Shop) {
			shop.render(g);
		}
		else if(gameState == STATE.Menu || gameState == STATE.Help || gameState == STATE.Select || gameState == STATE.End || gameState == STATE.Finish) {
			handler.render(g);
			menu.render(g);
		}
		g.setFont(new Font("arial", 0, 12));
		g.drawString("FPS: " + frames, 3, 680);
		
		g.dispose();
		bs.show();
	}

	public static float clamp(float var, float min, float max) {
		if(var >= max) 
			return var = max;
		else if(var <= min) 
			return var = min;
		else 
			return var;
	}
	
	public static void main(String args[]) {
		new Game();
	} 
}