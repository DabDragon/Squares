package VideoGame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import VideoGame.Game.STATE;
public class KeyInput extends KeyAdapter{
	private Handler handler;
	private boolean[] keyDown = new boolean[4];
	public KeyInput(Handler handler) {
		this.handler = handler;	
		keyDown[0] = false;
		keyDown[1] = false;
		keyDown[2] = false;
		keyDown[3] = false;
	}
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();	
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == ID.Player) {
				if(HUD.HEALTH > 0) {
					if(key == KeyEvent.VK_W) {tempObject.setVelY(-handler.speed); keyDown[0] = true;}
					if(key == KeyEvent.VK_S) {tempObject.setVelY(handler.speed); keyDown[1] = true;}
					if(key == KeyEvent.VK_D) {tempObject.setVelX(handler.speed); keyDown[2] = true;}
					if(key == KeyEvent.VK_A) {tempObject.setVelX(-handler.speed); keyDown[3] = true;}
				}	
			}
			if(tempObject.getId() == ID.Player2) {
				if(HUD.HEALTH2 > 0) {
					if(key == KeyEvent.VK_UP) {tempObject.setVelY(-handler.speed); keyDown[0] = true;}
					if(key == KeyEvent.VK_DOWN) {tempObject.setVelY(handler.speed); keyDown[1] = true;}
					if(key == KeyEvent.VK_RIGHT) {tempObject.setVelX(handler.speed); keyDown[2] = true;}
					if(key == KeyEvent.VK_LEFT) {tempObject.setVelX(-handler.speed); keyDown[3] = true;}
				} 	
			}
			if(tempObject.getId() == ID.ReversePlayer) {
				if(key == KeyEvent.VK_W) {tempObject.setVelY(handler.speed); keyDown[0] = true;}
				if(key == KeyEvent.VK_S) {tempObject.setVelY(-handler.speed); keyDown[1] = true;}
				if(key == KeyEvent.VK_D) {tempObject.setVelX(-handler.speed); keyDown[2] = true;}
				if(key == KeyEvent.VK_A) {tempObject.setVelX(handler.speed); keyDown[3] = true;}
			}
			if(tempObject.getId() == ID.MirrorXPlayer) {
				if(key == KeyEvent.VK_W) {tempObject.setVelY(handler.speed); keyDown[0] = true;}
				if(key == KeyEvent.VK_S) {tempObject.setVelY(-handler.speed); keyDown[1] = true;}
				if(key == KeyEvent.VK_D) {tempObject.setVelX(handler.speed); keyDown[2] = true;}
				if(key == KeyEvent.VK_A) {tempObject.setVelX(-handler.speed); keyDown[3] = true;}
			}
			if(tempObject.getId() == ID.MirrorYPlayer) {
				if(key == KeyEvent.VK_W) {tempObject.setVelY(-handler.speed); keyDown[0] = true;}
				if(key == KeyEvent.VK_S) {tempObject.setVelY(handler.speed); keyDown[1] = true;}
				if(key == KeyEvent.VK_D) {tempObject.setVelX(-handler.speed); keyDown[2] = true;}
				if(key == KeyEvent.VK_A) {tempObject.setVelX(handler.speed); keyDown[3] = true;}
			}
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getId() == ID.Player || tempObject.getId() == ID.ReversePlayer || tempObject.getId() == ID.MirrorXPlayer || tempObject.getId() == ID.MirrorYPlayer) {
				if(key == KeyEvent.VK_W) keyDown[0] = false;
				if(key == KeyEvent.VK_S) keyDown[1] = false;
				if(key == KeyEvent.VK_D) keyDown[2] = false;
				if(key == KeyEvent.VK_A) keyDown[3] = false;
				
				if(!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
				if(!keyDown[2] && !keyDown[3]) tempObject.setVelX(0);
			}
			if(tempObject.getId() == ID.Player2) {
				if(key == KeyEvent.VK_UP) keyDown[0] = false;
				if(key == KeyEvent.VK_DOWN) keyDown[1] = false;
				if(key == KeyEvent.VK_RIGHT) keyDown[2] = false;
				if(key == KeyEvent.VK_LEFT) keyDown[3] = false;
				
				if(!keyDown[0] && !keyDown[1]) tempObject.setVelY(0);
				if(!keyDown[2] && !keyDown[3]) tempObject.setVelX(0);
			}
		}
		if(key == KeyEvent.VK_ESCAPE)System.exit(1);
		if(key == KeyEvent.VK_SPACE) {
			if(Game.gameState == STATE.Game)Game.gameState = STATE.Shop;
			else if(Game.gameState == STATE.Shop) Game.gameState = STATE.Game;
		}
	}
}