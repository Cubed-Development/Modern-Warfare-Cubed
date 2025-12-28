package com.paneedah.weaponlib.vehicle;

import net.minecraft.client.renderer.GlStateManager;

public class Positioners {

    public static void position(float posX, float posY, float posZ, float rotationX, float rotationY, float rotationZ) {
        position(posX, posY, posZ, rotationX, rotationY, rotationZ, 0f, 0f, 0f, 1f, 1f, 1f);
    }

    public static void position(
            float posX, float posY, float posZ,
            float rotationX, float rotationY, float rotationZ,
            float rOffsetX, float rOffsetY, float rOffsetZ,
            float scaleX, float scaleY, float scaleZ) {

        GlStateManager.scale(scaleX, scaleY, scaleZ);
        GlStateManager.translate(posX, posY, posZ);

        GlStateManager.translate(rOffsetX, rOffsetY, rOffsetZ);

        GlStateManager.rotate(rotationZ, 0f, 0f, 1f);
        GlStateManager.rotate(rotationY, 0f, 1f, 0f);
        GlStateManager.rotate(rotationX, 1f, 0f, 0f);

        GlStateManager.translate(-rOffsetX, -rOffsetY, -rOffsetZ);
    }

}
