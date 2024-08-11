package com.paneedah.weaponlib.vehicle;

import org.lwjgl.opengl.GL11;

public class Positioners {

    public static void position(float posX, float posY, float posZ, float rotationX, float rotationY, float rotationZ) {
        position(posX, posY, posZ, rotationX, rotationY, rotationZ, 0f, 0f, 0f, 1f, 1f, 1f);
    }

    public static void position(
            float posX, float posY, float posZ,
            float rotationX, float rotationY, float rotationZ,
            float rOffsetX, float rOffsetY, float rOffsetZ,
            float scaleX, float scaleY, float scaleZ) {

        GL11.glScalef(scaleX, scaleY, scaleZ);
        GL11.glTranslatef(posX, posY, posZ);

        GL11.glTranslatef(rOffsetX, rOffsetY, rOffsetZ);

        GL11.glRotatef(rotationZ, 0f, 0f, 1f);
        GL11.glRotatef(rotationY, 0f, 1f, 0f);
        GL11.glRotatef(rotationX, 1f, 0f, 0f);

        GL11.glTranslatef(-rOffsetX, -rOffsetY, -rOffsetZ);
    }

}
