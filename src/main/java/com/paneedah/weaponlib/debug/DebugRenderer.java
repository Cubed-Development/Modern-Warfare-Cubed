package com.paneedah.weaponlib.debug;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

/**
 * The Debug Renderer for MWC, used for rendering debug information
 */
public class DebugRenderer {

    /**
     * Setup the renderer, make sure you call {@link #destructBasicRender} when you are done
     */
    public static void setupBasicRender() {
        GlStateManager.disableCull();
        GlStateManager.disableTexture2D();
    }

    /**
     * Deconstruct the renderer
     */
    public static void destructBasicRender() {
        GlStateManager.enableCull();
        GlStateManager.enableTexture2D();
    }

    public static void renderPoint(Vec3d vec, Vec3d color) {
        //GL11.glPointSize(5.0F);
        GlStateManager.color((float) color.x, (float) color.y, (float) color.z);
        GL11.glBegin(GL11.GL_POINTS);
        GL11.glVertex3d(vec.x, vec.y, vec.z);
        GL11.glEnd();
    }

    public static void renderLine(Vec3d start, Vec3d line, Vec3d color) {
        GlStateManager.color((float) color.x, (float) color.y, (float) color.z);
        GL11.glBegin(GL11.GL_LINE_STRIP);
        GL11.glVertex3d(start.x, start.y, start.z);
        GL11.glVertex3d(line.x, line.y, line.z);

        GL11.glEnd();
    }

}
