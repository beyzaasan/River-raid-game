package object;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Fuel extends SuperObject {

	public OBJ_Fuel() {
		name = "Fuel";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("fuel.png"));
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
