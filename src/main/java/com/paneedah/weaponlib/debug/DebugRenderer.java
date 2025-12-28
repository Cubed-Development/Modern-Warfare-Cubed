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
        GlStateManager.glBegin(GL11.GL_POINTS);
        GlStateManager.glVertex3f((float) vec.x, (float) vec.y, (float) vec.z); // Was `glVertex3d` before transition to `GlStateManager` - Luna Mira Lage (Desoroxxx) 2025-12-28
        GlStateManager.glEnd();
    }

    public static void renderLine(Vec3d start, Vec3d line, Vec3d color) {
        GlStateManager.color((float) color.x, (float) color.y, (float) color.z);
        GlStateManager.glBegin(GL11.GL_LINE_STRIP);
        GlStateManager.glVertex3f((float) start.x, (float) start.y, (float) start.z);
        GlStateManager.glVertex3f((float) line.x, (float) line.y, (float) line.z);

        GlStateManager.glEnd();
    }

}
