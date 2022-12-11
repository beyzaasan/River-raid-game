package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Ship extends SuperObject{

	public OBJ_Ship() {
		name = "Ship";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("gemi.png"));
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = true;
	}
}
