package VideoGame;
import java.util.Random;
import VideoGame.Game.STATE;
public class Spawn {
	private Handler handler;
	private Random r = new Random();
	private Menu menu;
	private Game game;
	public static int scoreKeep = 0;
	public Spawn(Handler handler, Menu menu, Game game) {
		this.handler = handler;
		this.menu = menu;
		this.game = game;
	}
	public void tick() {
		scoreKeep++;
		if(scoreKeep >= 1000) {
			scoreKeep = 0;
			HUD.level += 1;
			if(game.diff == 0) {
				if(HUD.level == 2) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
				else if(HUD.level == 3) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
				else if(HUD.level == 4) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				else if(HUD.level == 5) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
				else if(HUD.level == 6) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
				else if(HUD.level == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
				else if(HUD.level == 8) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				else if(HUD.level == 9) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
				else if(HUD.level == 10) {
					handler.clearAll();
					handler.addObject(new EnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
				}
				if(HUD.level == 13) {
					handler.clearAll();
					handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
				}
				else if(HUD.level == 14) handler.addObject(new MirrorXPlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
				else if(HUD.level == 15) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				else if(HUD.level == 16) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
				else if(HUD.level == 17) handler.addObject(new MirrorYPlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
				else if(HUD.level == 18) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
				else if(HUD.level == 19) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
				else if (HUD.level == 20) {
					handler.clearAll();
					handler.addObject(new HardEnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
				}
				else if (HUD.level == 23) {
					handler.clearAll();
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 24) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 25) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 26) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 27) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 28) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 29) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 30) {
					handler.clearAll();
					handler.addObject(new EnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
					handler.addObject(new OppositeEnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
				}
				else if (HUD.level == 31) {
					handler.clearAll();
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 32) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 33) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 34) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 35) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 36) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 37) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 38) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 39) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 40) {
					handler.clearAll();
					handler.addObject(new CenterEnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));

				}
				else if (HUD.level == 43) {
					handler.clearAll();
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 44) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 45) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 46) {
					int choice = r.nextInt(10);
					if(choice == 0) handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new FastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 2) handler.addObject(new SmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.ReversePlayer, handler, menu));
					else if(choice == 7) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 8) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 9) handler.addObject(new FastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
					else if(choice == 10) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 48 ) {
					handler.clearAll();
					handler.addObject(new MovingEnemyBoss (r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.EnemyBoss, handler, menu));
				}
				else if(HUD.level == 51) {
					handler.clearAll();
					handler.object.remove();
					Game.gameState = STATE.Finish;
				}
			}
			else if(game.diff == 1) {
				if(HUD.level == 2) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
				else if(HUD.level == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
				else if(HUD.level == 4) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				else if(HUD.level == 5) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
				else if(HUD.level == 6) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
				else if(HUD.level == 7) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
				else if(HUD.level == 8) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				else if(HUD.level == 9) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
				else if (HUD.level == 10) {
					handler.clearAll();
					handler.addObject(new HardEnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
				}
				else if (HUD.level == 13) {
					handler.clearAll();
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 14) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 15) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 16) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 17) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					}
				else if (HUD.level == 18) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 19) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 20) {
					handler.clearAll();
					handler.addObject(new EnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
					handler.addObject(new OppositeEnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
				}
				else if (HUD.level == 23) {
					handler.clearAll();
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 24) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 25) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 26) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));
				}
				else if (HUD.level == 27) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 28) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 29) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 30) {
					handler.clearAll();
					handler.addObject(new CenterEnemyBoss (Game.WIDTH/2 - 48, -120, ID.EnemyBoss, handler, menu));
				}
				else if (HUD.level == 33) {
					handler.clearAll();
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					

				}
				else if (HUD.level == 34) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					

				}
				else if (HUD.level == 35) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 36) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 37) {
					int choice = r.nextInt(5);
					if(choice == 0) handler.addObject(new HardEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler, menu));
					else if(choice == 1) handler.addObject(new HardFastEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
					else if(choice == 2) handler.addObject(new HardSmartEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.SmartEnemy, handler, menu));
					else if(choice == 3) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorXPlayer, handler, menu));
					else if(choice == 4) handler.addObject(new ReversePlayer(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.MirrorYPlayer, handler, menu));
					else if(choice == 5) handler.addObject(new HardFastEnemy2(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.FastEnemy, handler, menu));					
				}
				else if (HUD.level == 38) {
					handler.clearAll();
					handler.addObject(new MovingEnemyBoss (r.nextInt(Game.WIDTH - 100), r.nextInt(Game.HEIGHT - 100), ID.EnemyBoss, handler, menu));
				}
				else if(HUD.level == 41) {
					handler.clearAll();
					handler.object.remove();
					Game.gameState = STATE.Finish;
				}
			}
		}
	}	
}