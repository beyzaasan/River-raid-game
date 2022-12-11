package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Entity {

	public int worldX,worldY;
	public int speed;
	
	public BufferedImage ship, plane, helicopter, tree, house, fuel, water, grass;
	
	public String direction;
	public Rectangle solidArea;
	public int solidAreaDefaultX, solidAreaDefaultY;
	public boolean collisionOn = false;
	
}
