package com.paneedah.weaponlib.render;

import lombok.Getter;
import lombok.Setter;

public class SpriteSheetTools {

    @Setter
    @Getter
    public static class Sprite {
        private double minU, minV, maxU, maxV;

        public Sprite(double minU, double minV, double maxU, double maxV) {
            this.minU = minU;
            this.minV = minV;
            this.maxU = maxU;
            this.maxV = maxV;
        }

    }


    public static Sprite getSquareSprite(int id, double spriteSize, double width, double height) {

        //id = 2;
        int columns = (int) Math.floor(width / spriteSize);
        int rows = (int) Math.floor(height / spriteSize);
        double u = (id % columns) * spriteSize / width;
        double v = (double) ((double) id / columns) * spriteSize / height;
        //System.out.println(u + " | " + v + " | " + (columns));

        return new Sprite(u, v, u + (spriteSize / width), v + (spriteSize / height));
    }

    public static Sprite getRectSprite(int id, double spriteWidth, double spriteHeight, double width, double height, boolean flip) {
        int columns = (int) Math.floor(width / spriteWidth);
        int rows = (int) Math.floor(height / spriteHeight);
        double u = (id % columns) * spriteWidth / width;
        double v = ((double) id / columns) * spriteWidth / height;

        return new Sprite(u, v, u + (spriteWidth / width), v + (spriteHeight / height));

    }

}
