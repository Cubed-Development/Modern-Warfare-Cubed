package com.paneedah.weaponlib.animation;

import com.paneedah.weaponlib.render.Shaders;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

import java.nio.ByteBuffer;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

/**
 * OpenGL ID-based selection system.
 * Renders to FBO → reads pixel under mouse → extracts ID from RGB.
 *
 * Used by AnimationModeProcessor for gizmo picking.
 */
public class OpenGLSelectionHelper {

    private static final ByteBuffer RESULT_BUFFER = BufferUtils.createByteBuffer(4);

    public static boolean isInSelectionPass = false;

    public static int selectID = 30;
    public static int currentlyHovering = 0;

    public static int width = 0;
    public static int height = 0;
    public static Framebuffer fbo;
    public static Framebuffer ballBuf;


    /** Return true if the given ID should render during selection pass */
    public static boolean shouldRender(int id) {
        // During a selection pass we only want to draw objects with non-zero IDs
        return isInSelectionPass && id != 0;
    }


    /** Framebuffer for arcball drawing */
    public static void bindBallBuf() {
        if (ballBuf == null) {
            ballBuf = new Framebuffer(MC.displayWidth, MC.displayHeight, true);
        }
        ballBuf.bindFramebuffer(false);
    }


    /** Framebuffer used for selection pass */
    public static void bindSelectBuffer() {
        if (MC.displayWidth != width || MC.displayHeight != height || fbo == null) {

            width  = MC.displayWidth;
            height = MC.displayHeight;

            if (fbo != null) fbo.deleteFramebuffer();
            if (ballBuf != null) ballBuf.deleteFramebuffer();

            fbo     = new Framebuffer(width, height, true);
            ballBuf = new Framebuffer(width, height, true);
        }

        fbo.framebufferClear();
        fbo.bindFramebuffer(true);
    }


    public static void startSelectionPass() {
        isInSelectionPass = true;
    }

    public static void stopSelectionPass() {
        isInSelectionPass = false;
    }


    /**
     * Reads raw pixel color from FBO at the mouse position.
     */
    public static ByteBuffer readRawColor() {

        ScaledResolution scaled = new ScaledResolution(MC);

        int scaledW = scaled.getScaledWidth();
        int scaledH = scaled.getScaledHeight();

        int mouseX = Mouse.getX() * scaledW / MC.displayWidth;
        int mouseY = scaledH - Mouse.getY() * scaledH / MC.displayHeight - 1;

        // Convert scaled -> real display size
        mouseX = (int) Math.round((mouseX / (double) scaledW) * MC.displayWidth);
        mouseY = (int) Math.round((mouseY / (double) scaledH) * MC.displayHeight);

        // Flip Y because OpenGL origin is bottom-left
        mouseY = MC.displayHeight - mouseY - 1;

        RESULT_BUFFER.rewind();

        GL20.glUseProgram(0);
        GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);

        GL11.glReadPixels(mouseX, mouseY, 1, 1, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, RESULT_BUFFER);
        RESULT_BUFFER.rewind();

        return RESULT_BUFFER;
    }


    /** Read a 10×10 grid centered around the mouse */
    public static ByteBuffer readScreenArea() {

        ScaledResolution scaled = new ScaledResolution(MC);

        int scaledW = scaled.getScaledWidth();
        int scaledH = scaled.getScaledHeight();

        int mouseX = Mouse.getX() * scaledW / MC.displayWidth;
        int mouseY = scaledH - Mouse.getY() * scaledH / MC.displayHeight - 1;

        mouseX = (int) Math.round((mouseX / (double) scaledW) * MC.displayWidth);
        mouseY = (int) Math.round((mouseY / (double) scaledH) * MC.displayHeight);
        mouseY = MC.displayHeight - mouseY - 1;

        ByteBuffer buf = BufferUtils.createByteBuffer(4 * 100);
        buf.rewind();

        GL20.glUseProgram(0);
        GL11.glReadBuffer(GL30.GL_COLOR_ATTACHMENT0);

        GL11.glReadPixels(mouseX - 5, mouseY - 5, 10, 10, GL11.GL_RGBA, GL11.GL_UNSIGNED_BYTE, buf);
        buf.rewind();

        return buf;
    }


    /** Looks for axis colors in a 10×10 region (used for gizmo detection) */
    public static int searchForColorInScreen(ByteBuffer buf) {
        for (int i = 0; i < buf.capacity(); i += 4) {
            int r = buf.get(i)     & 0xFF;
            int g = buf.get(i + 1) & 0xFF;
            int b = buf.get(i + 2) & 0xFF;

            if (r > 240 && g < 20 && b < 20) return 1; // Red axis
            if (g > 240 && r < 20 && b < 20) return 2; // Green axis
            if (b > 240 && r < 20 && g < 20) return 3; // Blue axis
        }
        return -1;
    }


    /** Reads the selected ID from shader output */
    public static int readValueAtMousePosition() {

        ByteBuffer buf = readRawColor();

        int red = buf.get(0) & 0xFF;
        currentlyHovering = red;

        GlStateManager.color(1, 1, 1, 1);
        return red;
    }


    /** Binds shader and writes integer ID to the uniform */
    public static void bindSelectShader(int id) {
        Shaders.select.use();
        Shaders.select.uniform1i("id", id);
        selectID = id;
    }
}
