package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.GL11;

public class Framebuffers {

    public static int getCurrentTexture() {
        return GlStateManager.glGetInteger(GL11.GL_TEXTURE_BINDING_2D);
    }
    
    public static void bindTexture(int textureId) {
        GlStateManager.bindTexture(textureId);
    }

    public static int getCurrentFramebuffer() {
        return GlStateManager.glGetInteger(ARBFramebufferObject.GL_FRAMEBUFFER_BINDING);
    }

    public static void unbindFramebuffer() {
        if (OpenGlHelper.isFramebufferEnabled()) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
        }
    }

    public static void bindFramebuffer(int framebufferId, boolean depthEnabled, int width, int height) {
        if (OpenGlHelper.isFramebufferEnabled()) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, framebufferId);
            if(depthEnabled) {
                GlStateManager.viewport(0, 0, width,height);
            }
        }
    }
}
