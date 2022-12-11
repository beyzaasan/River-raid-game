package main;

import object.OBJ_Fuel;
import object.OBJ_Helicopter;
import object.OBJ_Ship;

public class AssetSetter {

	GamePanel gp;
	public AssetSetter(GamePanel gp) {
		this.gp=gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new OBJ_Helicopter();
		gp.obj[0].worldX = 210;
		gp.obj[0].worldY = 7300;
		
		gp.obj[1] = new OBJ_Helicopter();
		gp.obj[1].worldX = 450;
		gp.obj[1].worldY = 7100;
		
		gp.obj[2] = new OBJ_Helicopter();
		gp.obj[2].worldX = 275;
		gp.obj[2].worldY = 5950;
		
		gp.obj[3] = new OBJ_Helicopter();
		gp.obj[3].worldX = 450;
		gp.obj[3].worldY = 5850;
		
		/*gp.obj[4] = new OBJ_Helicopter();
		gp.obj[4].worldX = 250;
		gp.obj[4].worldY = 7500;
		
		gp.obj[0] = new OBJ_Helicopter();
		gp.obj[0].worldX = 250;
		gp.obj[0].worldY = 7500;
		
		gp.obj[5] = new OBJ_Helicopter();
		gp.obj[5].worldX = 250;
		gp.obj[5].worldY = 7500;
		
		gp.obj[6] = new OBJ_Helicopter();
		gp.obj[6].worldX = 250;
		gp.obj[6].worldY = 7500;
		
		gp.obj[7] = new OBJ_Helicopter();
		gp.obj[7].worldX = 450;
		//gp.ob7[1].worldX = 72 * gp.tileSize;
		gp.obj[7].worldY = 7450;	*/
		
		gp.obj[8] = new OBJ_Fuel();
		gp.obj[8].worldX = 350;
		gp.obj[8].worldY = 7000;
		
		gp.obj[9] = new OBJ_Fuel();
		gp.obj[9].worldX = 230;
		gp.obj[9].worldY = 6300;
		
		gp.obj[10] = new OBJ_Fuel();
		gp.obj[10].worldX = 500;
		gp.obj[10].worldY = 6300;
		
		gp.obj[11] = new OBJ_Fuel();
		gp.obj[11].worldX = 215;
		gp.obj[11].worldY = 5600;
		
		/*gp.obj[12] = new OBJ_Fuel();
		gp.obj[12].worldX = 280;
		gp.obj[12].worldY = 7400;
		
		gp.obj[13] = new OBJ_Fuel();
		gp.obj[13].worldX = 280;
		gp.obj[13].worldY = 7400;
		
		gp.obj[14] = new OBJ_Fuel();
		gp.obj[14].worldX = 280;
		gp.obj[14].worldY = 7400;
		
		gp.obj[15] = new OBJ_Fuel();
		gp.obj[15].worldX = 280;
		gp.obj[15].worldY = 7400;
		       
		gp.obj[16] = new OBJ_Fuel();
		gp.obj[16].worldX = 280;
		gp.obj[16].worldY = 7400;
		
		gp.obj[17] = new OBJ_Fuel();
		gp.obj[17].worldX = 280;
		gp.obj[17].worldY = 7400;*/
		
		gp.obj[18] = new OBJ_Ship();
		gp.obj[18].worldX = 175;
		gp.obj[18].worldY = 5500;
		
		gp.obj[19] = new OBJ_Ship();
		gp.obj[19].worldX = 500;
		gp.obj[19].worldY = 6750;
		
		gp.obj[20] = new OBJ_Ship();
		gp.obj[20].worldX = 250;
		gp.obj[20].worldY = 6900;
		
		gp.obj[21] = new OBJ_Ship();
		gp.obj[21].worldX = 370;
		gp.obj[21].worldY = 6050;
		
		/*gp.obj[22] = new OBJ_Ship();
		gp.obj[22].worldX = 450;
		gp.obj[22].worldY = 7300;
		
		gp.obj[23] = new OBJ_Ship();
		gp.obj[23].worldX = 450;
		gp.obj[23].worldY = 7300;
		
		gp.obj[24] = new OBJ_Ship();
		gp.obj[24].worldX = 450;
		gp.obj[24].worldY = 7300;*/
		
	}
}
