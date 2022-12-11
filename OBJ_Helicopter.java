package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Helicopter extends SuperObject{
	//instantiate objects and place them on the map.

	public OBJ_Helicopter() {
		name = "Helicopter";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("helicopter.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
