package object;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import entity.Entity;
import main.GamePanel;

public class OBJ_Helicopter extends SuperObject{
	
	
	public OBJ_Helicopter() {
		
		name = "Helicopter";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("helicopter.png"));
			collision = true;
		}catch(IOException e) {
			e.printStackTrace();
		}
	

	solidArea = new Rectangle();
	solidArea.x = 5;
	solidArea.y = 6;
	solidAreaDefaultX=solidArea.x;
	solidAreaDefaultY=solidArea.y;
	solidArea.width = 31;
	solidArea.height = 36;
	
	}
}