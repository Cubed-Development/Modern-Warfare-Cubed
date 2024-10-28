package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.render.bgl.GLCompatible;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.shader.Framebuffer;

public class HDRFramebuffer extends Framebuffer {

    public HDRFramebuffer(int width, int height, boolean useDepthIn) {
        super(width, height, useDepthIn);
    }

    @Override
    public void createFramebuffer(int width, int height) {
        framebufferWidth = width;
        framebufferHeight = height;
        framebufferTextureWidth = width;
        framebufferTextureHeight = height;

        if (!OpenGlHelper.isFramebufferEnabled()) {
            framebufferClear();
        } else {
            framebufferObject = OpenGlHelper.glGenFramebuffers();
            framebufferTexture = TextureUtil.glGenTextures();

            if (useDepth) {
                depthBuffer = OpenGlHelper.glGenRenderbuffers();
            }

            setFramebufferFilter(9728);
            GlStateManager.bindTexture(framebufferTexture);
            GlStateManager.glTexImage2D(3553, 0, GLCompatible.GL_RGBA16F, framebufferTextureWidth, framebufferTextureHeight, 0, 6408, 5121, null);
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, framebufferObject);
            OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_COLOR_ATTACHMENT0, 3553, framebufferTexture, 0);

            if (useDepth) {
                OpenGlHelper.glBindRenderbuffer(OpenGlHelper.GL_RENDERBUFFER, depthBuffer);
                if (!isStencilEnabled()) {
                    OpenGlHelper.glRenderbufferStorage(OpenGlHelper.GL_RENDERBUFFER, 33190, framebufferTextureWidth, framebufferTextureHeight);
                    OpenGlHelper.glFramebufferRenderbuffer(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT, OpenGlHelper.GL_RENDERBUFFER, depthBuffer);
                } else {
                    OpenGlHelper.glRenderbufferStorage(OpenGlHelper.GL_RENDERBUFFER, org.lwjgl.opengl.EXTPackedDepthStencil.GL_DEPTH24_STENCIL8_EXT, framebufferTextureWidth, framebufferTextureHeight);
                    OpenGlHelper.glFramebufferRenderbuffer(OpenGlHelper.GL_FRAMEBUFFER, org.lwjgl.opengl.EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT, OpenGlHelper.GL_RENDERBUFFER, depthBuffer);
                    OpenGlHelper.glFramebufferRenderbuffer(OpenGlHelper.GL_FRAMEBUFFER, org.lwjgl.opengl.EXTFramebufferObject.GL_STENCIL_ATTACHMENT_EXT, OpenGlHelper.GL_RENDERBUFFER, depthBuffer);
                }
            }

            framebufferClear();
            unbindFramebufferTexture();
        }
    }

}
