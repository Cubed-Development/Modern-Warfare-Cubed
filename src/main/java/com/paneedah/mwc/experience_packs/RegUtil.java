package com.paneedah.mwc.experience_packs;

import com.google.gson.JsonArray;
import org.lwjgl.opengl.GL11;

public class RegUtil {

    static void applyTransform(JsonArray array) {
        float tx = array.get(0).getAsFloat();
        float ty = array.get(1).getAsFloat();
        float tz = array.get(2).getAsFloat();
        float rAngle = array.get(3).getAsFloat();
        float rx = array.get(4).getAsFloat();
        float ry = array.get(5).getAsFloat();
        float rz = array.get(6).getAsFloat();
        float sx = array.get(7).getAsFloat();
        float sy = array.get(8).getAsFloat();
        float sz = array.get(9).getAsFloat();

        GL11.glTranslatef(tx, ty, tz);
        GL11.glRotatef(rAngle, rx, ry, rz);
        GL11.glScalef(sx, sy, sz);
    }
}
