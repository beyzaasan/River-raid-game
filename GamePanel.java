package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import entity.Player;
import entity.TileManager;
import object.SuperObject;

public class GamePanel extends JPanel implements Runnable{
	// SCREEN SETTINGS
	final int originalSize = 16; //16x16 tile
	final int scale = 3;
	
	public final int tileSize = originalSize * scale;  //48x48
	public final int maxScreenCol = 16;
	public final int maxScreenRow =12;
	public final int screenWidth = tileSize * maxScreenCol;
	public final int screenHeight = tileSize * maxScreenRow;
	
	//WORLD SETTINGS
	public final int maxWorldCol = 16;
	public final int maxWorldRow = 160;
	
	
	int FPS = 60;
	
	TileManager tileM = new TileManager(this);
	KeyInputs keyI = new KeyInputs();
	
	public CollisionChecker cChecker = new CollisionChecker(this);
	public AssetSetter aSetter = new AssetSetter(this);
	Thread gameThread;
	
	public Player player =new Player(this, keyI); 
	public SuperObject[] obj = new SuperObject[25];
	
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.white);
		this.setDoubleBuffered(true);
		this.addKeyListener(keyI);
		this.setFocusable(true);
	}
	
	public void setupGame() {
		aSetter.setObject();//to add other setup stuff in future
	}
	
	
	public void startGameThread() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
  
	public void run() {
		double drawInterval = 1000000000/FPS;
		double delta = 0;
		long lastTime = System.nanoTime();
		long currentTime;
		long timer = 0;
		int drawCount = 0;
		
		while(gameThread != null) {
			
			currentTime = System.nanoTime();
			timer += (currentTime - lastTime);
			delta += (currentTime - lastTime) / drawInterval;
			
			lastTime = currentTime;
			
			if(delta >= 1) {
				update();
				repaint();
				delta--;
				drawCount++;
			}
			
			if(timer >= 1000000000) {
				//System.out.println("FPS: "+ drawCount);
				drawCount = 0;
				timer=0;
			}
		}
	}
	
	public void update() {
		player.update();
	}
	
	
	public void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		//TILE
		tileM.draw(g2);
		
		//OBJECT
		for(int i = 0; i < obj.length; i++) {
			if(obj[i] != null) {
				obj[i].draw(g2,this);
			}
		}
		
		//PLAYER
		player.draw(g2);
		
		g2.dispose();
	}
	
	
}
