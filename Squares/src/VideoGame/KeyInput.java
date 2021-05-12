package VideoGame;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import VideoGame.Game.STATE;

public class KeyInput extends KeyAdapter{
	private Handler handler;
	
	private boolean[] keyDown = new boolean[8];
	public KeyInput(Handler handler) {
		this.handler = handler;	
		keyDown[0] = false;
		keyDown[1] = false;
		keyDown[2] = false;
		keyDown[3] = false;
		keyDown[4] = false;
		keyDown[5] = false;
		keyDown[6] = false;
		keyDown[7] = false;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();	
		for(int i = 0; i < handler.object.size(); i++) {
			GameObject tempObject = handler.object.get(i);
			if(tempObject.getId() == ID.Player) {
				if(key == KeyEvent.VK_W) {keyDown[0] = true;}
				if(key == KeyEvent.VK_S) {keyDown[1] = true;}
				if(key == KeyEvent.VK_D) {keyDown[2] = true;}
				if(key == KeyEvent.VK_A) {keyDown[3] = true;}
				
				if(HUD.HEALTH > 0) {
					if(keyDown[0]) {tempObject.setVelY(-handler.speed);}
					if(keyDown[1]) {tempObject.setVelY(handler.speed);}
					if(keyDown[2]) {tempObject.setVelX(handler.speed);}
					if(keyDown[3]) {tempObject.setVelX(-handler.speed);}
					
					if(keyDown[0] && keyDown[1]) {tempObject.setVelY(0);}
					if(keyDown[2] && keyDown[3]) {tempObject.setVelX(0);}
				}	
			}
			if(tempObject.getId() == ID.ReversePlayer) {
				if(keyDown[0]) {tempObject.setVelY(handler.speed);}
				if(keyDown[1]) {tempObject.setVelY(-handler.speed);}
				if(keyDown[2]) {tempObject.setVelX(-handler.speed);}
				if(keyDown[3]) {tempObject.setVelX(handler.speed);}
				
				if(keyDown[0] && keyDown[1]) {tempObject.setVelY(0);}
				if(keyDown[2] && keyDown[3]) {tempObject.setVelX(0);}
			}
			if(tempObject.getId() == ID.MirrorXPlayer) {
				if(keyDown[0]) {tempObject.setVelY(handler.speed);}
				if(keyDown[1]) {tempObject.setVelY(-handler.speed);}
				if(keyDown[2]) {tempObject.setVelX(handler.speed);}
				if(keyDown[3]) {tempObject.setVelX(-handler.speed);}
				
				if(keyDown[0] && keyDown[1]) {tempObject.setVelY(0);}
				if(keyDown[2] && keyDown[3]) {tempObject.setVelX(0);}
			}
			if(tempObject.getId() == ID.MirrorYPlayer) {
				if(keyDown[0]) {tempObject.setVelY(-handler.speed);}
				if(keyDown[1]) {tempObject.setVelY(handler.speed);}
				if(keyDown[2]) {tempObject.setVelX(-handler.speed);}
				if(keyDown[3]) {tempObject.setVelX(handler.speed);}
				
				if(keyDown[0] && keyDown[1]) {tempObject.setVelY(0);}
				if(keyDown[2] && keyDown[3]) {tempObject.setVelX(0);}
			}
			if(tempObject.getId() == ID.Player2) {
				if(key == KeyEvent.VK_UP) {keyDown[4] = true;}
				if(key == KeyEvent.VK_DOWN) {keyDown[5] = true;}
				if(key == KeyEvent.VK_RIGHT) {keyDown[6] = true;}
				if(key == KeyEvent.VK_LEFT) {keyDown[7] = true;}
				
				if(HUD.HEALTH2 > 0) {
					if(keyDown[4]) {tempObject.setVelY(-handler.speed);}
					if(keyDown[5]) {tempObject.setVelY(handler.speed);}
					if(keyDown[6]) {tempObject.setVelX(handler.speed);}
					if(keyDown[7]) {tempObject.setVelX(-handler.speed);}
					
					if(keyDown[4] && keyDown[5]) {tempObject.setVelY(0);}
					if(keyDown[6] && keyDown[7]) {tempObject.setVelX(0);}
				} 	
			}
			if(tempObject.getId() == ID.ReversePlayer2) {
				if(keyDown[4]) {tempObject.setVelY(handler.speed);}
				if(keyDown[5]) {tempObject.setVelY(-handler.speed);}
				if(keyDown[6]) {tempObject.setVelX(-handler.speed);}
				if(keyDown[7]) {tempObject.setVelX(handler.speed);}
				
				if(keyDown[4] && keyDown[5]) {tempObject.setVelY(0);}
				if(keyDown[6] && keyDown[7]) {tempObject.setVelX(0);}
			}
			if(tempObject.getId() == ID.MirrorXPlayer2) {
				if(keyDown[4]) {tempObject.setVelY(handler.speed);}
				if(keyDown[5]) {tempObject.setVelY(-handler.speed);}
				if(keyDown[6]) {tempObject.setVelX(handler.speed);}
				if(keyDown[7]) {tempObject.setVelX(-handler.speed);}
				
				if(keyDown[4] && keyDown[5]) {tempObject.setVelY(0);}
				if(keyDown[6] && keyDown[7]) {tempObject.setVelX(0);}
			}
			if(tempObject.getId() == ID.MirrorYPlayer2) {
				if(keyDown[4]) {tempObject.setVelY(-handler.speed);}
				if(keyDown[5]) {tempObject.setVelY(handler.speed);}
				if(keyDown[6]) {tempObject.setVelX(-handler.speed);}
				if(keyDown[7]) {tempObject.setVelX(handler.speed);}
				
				if(keyDown[4] && keyDown[5]) {tempObject.setVelY(0);}
				if(keyDown[6] && keyDown[7]) {tempObject.setVelX(0);}
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
			if(tempObject.getId() == ID.Player2 || tempObject.getId() == ID.ReversePlayer2 || tempObject.getId() == ID.MirrorXPlayer2 || tempObject.getId() == ID.MirrorYPlayer2) {
				if(key == KeyEvent.VK_UP) keyDown[4] = false;
				if(key == KeyEvent.VK_DOWN) keyDown[5] = false;
				if(key == KeyEvent.VK_RIGHT) keyDown[6] = false;
				if(key == KeyEvent.VK_LEFT) keyDown[7] = false;
				
				if(!keyDown[4] && !keyDown[5]) tempObject.setVelY(0);
				if(!keyDown[6] && !keyDown[7]) tempObject.setVelX(0);
			}
		}
		if(key == KeyEvent.VK_ESCAPE)System.exit(1);
		if(key == KeyEvent.VK_SPACE) {
			if(Game.gameState == STATE.Game)Game.gameState = STATE.Shop;
			else if(Game.gameState == STATE.Shop) Game.gameState = STATE.Game;
		}
	}
}