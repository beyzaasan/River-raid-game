package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyInputs;
import object.OBJ_Fuel;
import main.*;


public class Player extends Entity{

	GamePanel gp;
	KeyInputs keyI;
	
	public int screenX;
	public int screenY;
	
	int hasFuel= 100;//for now
	
	public Player (GamePanel gp, KeyInputs keyI) {
		this.gp=gp;
		this.keyI=keyI;
		
		screenX = gp.screenWidth/2 - (gp.tileSize/2);
		screenY = 9*gp.screenHeight/10- (gp.tileSize/2);
		
		solidArea = new Rectangle();
		solidArea.x = 5;
		solidArea.y = 6;
		solidAreaDefaultX=solidArea.x;
		solidAreaDefaultY=solidArea.y;
		solidArea.width = 31;
		solidArea.height = 36;
		
		setDefaultValues();
		getPlayerImage();
	}
	public void setDefaultValues() {
		worldX = 360; 
		worldY = 7595;//for now
		speed = 4;
	}
	
	public void getPlayerImage() {
		
		try {
			
			plane = ImageIO.read(getClass().getResourceAsStream("ucak.png")); 
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void update() {
		
		if(keyI.upPressed == true || keyI.downPressed == true || keyI.leftPressed == true ||
				keyI.rightPressed == true ) {
			
			if(collisionOn == false) {
				if(keyI.upPressed == true) {
				worldY -= speed;
				}
				else if(keyI.leftPressed == true) {
				worldX -= speed;
				screenX -=speed;
				}
				else if(keyI.rightPressed == true) {
				worldX += speed;
				screenX +=speed;
				}
			
			}


		}
		// CHECH TILE COLLISION
		collisionOn = false;
		gp.cChecker.checkTile(this);
		
		//int objectindex = gp.cChecker.checkObject(this, false);
		//pickUpObject(objectindex);
		
	}
		
	/**/
		
	
	
	public void pickUpObject(int i) {
		
		if(i != 25) {
			gp.aSetter.setObject();
			String objectName = gp.obj[i].name;
			
				 if(objectName.equals("Fuel")) {
					 if(gp.player.solidAreaDefaultX == gp.obj[i].solidAreaDefaultX
							 && gp.player.solidAreaDefaultY == gp.obj[i].solidAreaDefaultY) {
						 gp.obj[i]=null;
						 System.out.println("Fuel left: " + hasFuel);
					 }
				 }
				 
				 if(objectName.equals("Ship")) {
					 if(gp.obj[i].collision == true && gp.player.solidAreaDefaultX == gp.obj[i].solidAreaDefaultX
							 && gp.player.solidAreaDefaultY == gp.obj[i].solidAreaDefaultY) {
						 gp.obj[i]=null;
						 System.out.println("Fuel left: " + hasFuel);
					 }
				 }
				 
				 if(gp.obj[i].name.equals("Helicopter")) {
					 if(gp.obj[i].collision == true && gp.player.solidAreaDefaultX == gp.obj[i].solidAreaDefaultX
							 && gp.player.solidAreaDefaultY == gp.obj[i].solidAreaDefaultY) {
						 		
						 gp.obj[i]=null;
						 System.out.println("Fuel left: " + hasFuel);
					 }
				 }
	
		}
				 
	}
	
	
	
	public void draw(Graphics2D g2) {
		
		g2.drawImage(plane, screenX, screenY, gp.tileSize, gp.tileSize, null);
		
		
	}
	 
}
