package main;

import entity.Entity;

public class CollisionChecker {

	GamePanel gp;
	
	public CollisionChecker(GamePanel gp) {
		this.gp = gp;
	}
	
	public void checkTile(Entity entity) {
	int entityLeftWorldX = entity.worldX + entity.solidArea.x;	
	int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
	int entityTopWorldY = entity.worldY + entity.solidArea.y;
	int entityBottomWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;
	
	int entityLeftCol = entityLeftWorldX/gp.tileSize;
	int entityRightCol = entityRightWorldX/gp.tileSize;
	int entityTopRow = entityTopWorldY/gp.tileSize;
	int entityBottomRow = entityBottomWorldY/gp.tileSize;
	
	int tileNum1, tileNum2, tileNum3, tileNum4;
	
	tileNum1 =gp.tileM.mapTileNumber[entityLeftCol][entityTopRow];
	tileNum2 =gp.tileM.mapTileNumber[entityRightCol][entityTopRow];
	tileNum3 =gp.tileM.mapTileNumber[entityLeftCol][entityBottomRow];
	tileNum4 =gp.tileM.mapTileNumber[entityRightCol][entityBottomRow];
	
	if(gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true ||
			gp.tileM.tile[tileNum3].collision == true || gp.tileM.tile[tileNum4].collision == true) {
		entity.collisionOn = true;
	}
	
	
	}
	public int checkObject (Entity entity, boolean player) {
		
		int index = 999;
		
		for(int i =0; i< gp.obj.length ; i++) {
			
			if ( gp.obj[i] != null) {
				 
				//get entitiys solid area position
				entity.solidArea.x = entity.worldX + entity.solidArea.x;
				entity.solidArea.y = entity.worldY + entity.solidArea.y;
				
				//get the objects solid are position
				gp.obj[i].solidArea.x = gp.obj[i].worldX + gp.obj[i].solidArea.x;
				gp.obj[i].solidArea.y = gp.obj[i].worldY + gp.obj[i].solidArea.y;
				
				switch(entity.direction) { 
				case "left":
					entity.solidArea.x -= entity.speed;
					if (entity.solidArea.intersects(gp.obj[i].solidArea))
						System.out.println("left collision!");	
						if (gp.obj[i].collision = true) {
							entity.collisionOn  = true;
						}
						if (player == true) {
							index = i;
						}
					break;
				case "right":
					entity.solidArea.x -= entity.speed;
					if (entity.solidArea.intersects(gp.obj[i].solidArea))
						System.out.println("right collision!");	
					if (gp.obj[i].collision = true) {
						entity.collisionOn  = true;    
					}
						if (player == true) {
							index = i;
						}
					break;
				
				}
				entity.solidArea.x = entity.solidAreaDefaultX;
				entity.solidArea.y = entity.solidAreaDefaultY;
				gp.obj[i].solidArea.x = gp.obj[i].solidAreaDefaultX;
				gp.obj[i].solidArea.y = gp.obj[i].solidAreaDefaultY;
				
				
			}
		
}
		return index;
}
}
