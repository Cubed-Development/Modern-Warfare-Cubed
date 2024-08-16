package com.paneedah.weaponlib.render;

public class SpriteSheetTools {
	
	public static class Sprite {
		private double minU, minV, maxU, maxV;
		
		public Sprite(double minU, double minV, double maxU, double maxV) {
			this.minU = minU;
			this.minV = minV;
			this.maxU = maxU;
			this.maxV = maxV;
		}

		public double getMinU() {
			return minU;
		}

		public void setMinU(double minU) {
			this.minU = minU;
		}

		public double getMinV() {
			return minV;
		}

		public void setMinV(double minV) {
			this.minV = minV;
		}

		public double getMaxU() {
			return maxU;
		}

		public void setMaxU(double maxU) {
			this.maxU = maxU;
		}

		public double getMaxV() {
			return maxV;
		}

		public void setMaxV(double maxV) {
			this.maxV = maxV;
		}
		
	}
	
	
	public static Sprite getSquareSprite(int id, double spriteSize, double width, double height) {
		
		//id = 2;
		int columns = (int) Math.floor(width/spriteSize);
		int rows = (int) Math.floor(height/spriteSize);
		double u = (id%columns)*spriteSize/width;
		double v = Math.floor(id/columns)*spriteSize/height;
		//System.out.println(u + " | " + v + " | " + (columns));
		
		return new Sprite(u, v, u+(spriteSize/width), v+(spriteSize/height));
	}
	
	public static Sprite getRectSprite(int id, double spriteWidth, double spriteHeight, double width, double height, boolean flip) {
		int columns = (int) Math.floor(width/spriteWidth);
		int rows = (int) Math.floor(height/spriteHeight);
		double u = (id%columns)*spriteWidth/width;
		double v = (id/columns)*spriteWidth/height;
		
		if(flip) {
			
			
			
			return new Sprite(u, v, u+(spriteWidth/width), v+(spriteHeight/height));
			
		} else {
			return new Sprite(u, v, u+(spriteWidth/width), v+(spriteHeight/height));
			
		}
		
	}

}
