package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Fuel extends SuperObject {

	public OBJ_Fuel() {
		name = "Fuel";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("fuel.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}

}
