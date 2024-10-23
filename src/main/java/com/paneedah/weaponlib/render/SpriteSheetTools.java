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

    /**
     * Retrieves a square sprite from a sprite sheet.
     *
     * @param id        The index of the sprite.
     * @param spriteSize The size of the sprite.
     * @param width     The width of the sprite sheet.
     * @param height    The height of the sprite sheet.
     * @return          A new Sprite object representing the sprite's coordinates.
     */
    public static Sprite getSquareSprite(int id, double spriteSize, double width, double height) {
        int columns = (int) Math.floor(width / spriteSize);
        int rows = (int) Math.floor(height / spriteSize);
        double u = (id % columns) * spriteSize / width;
        double v = Math.floor(id / columns) * spriteSize / height;

        return new Sprite(u, v, u + (spriteSize / width), v + (spriteSize / height));
    }

    /**
     * Retrieves a rectangular sprite from a sprite sheet, with an option to flip the sprite.
     *
     * @param id           The index of the sprite.
     * @param spriteWidth  The width of the sprite.
     * @param spriteHeight The height of the sprite.
     * @param width        The width of the sprite sheet.
     * @param height       The height of the sprite sheet.
     * @param flip         Whether to flip the sprite horizontally.
     * @return             A new Sprite object representing the sprite's coordinates.
     */
    public static Sprite getRectSprite(int id, double spriteWidth, double spriteHeight, double width, double height, boolean flip) {
        int columns = (int) Math.floor(width / spriteWidth);
        int rows = (int) Math.floor(height / spriteHeight);
        double u = (id % columns) * spriteWidth / width;
        double v = Math.floor(id / columns) * spriteHeight / height;

        double minU = u;
        double maxU = u + (spriteWidth / width);
        double minV = v;
        double maxV = v + (spriteHeight / height);

        // If flipping horizontally, swap minU and maxU
        if (flip) {
            double temp = minU;
            minU = maxU;
            maxU = temp;
        }

        return new Sprite(minU, minV, maxU, maxV);
    }
}
