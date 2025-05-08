package com.paneedah.weaponlib.render.framebuffer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.*;

public class MSAAFramebuffer extends Framebuffer {

    private final int samples;
    private int msaaColorTex;
    private int msaaDepthBuf;

    public MSAAFramebuffer(int width, int height, boolean useDepth, int samples) {
        super(width, height, useDepth);
        this.samples = samples;

        // Overwrite default FBO with MSAA setup
        deleteFramebuffer(); // Remove what Framebuffer class set up
        createMSAAFramebuffer(width, height);
    }

    private void createMSAAFramebuffer(int width, int height) {
        framebufferTextureWidth = width;
        framebufferTextureHeight = height;

        framebufferObject = GL30.glGenFramebuffers();
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, framebufferObject);

        // Create multisampled color texture
        msaaColorTex = GL11.glGenTextures();
        GL11.glBindTexture(GL32.GL_TEXTURE_2D_MULTISAMPLE, msaaColorTex);
        GL32.glTexImage2DMultisample(GL32.GL_TEXTURE_2D_MULTISAMPLE, samples, GL11.GL_RGBA8, width, height, true);
        GL30.glFramebufferTexture2D(GL30.GL_FRAMEBUFFER, GL30.GL_COLOR_ATTACHMENT0, GL32.GL_TEXTURE_2D_MULTISAMPLE, msaaColorTex, 0);

        if (useDepth) {
            msaaDepthBuf = GL30.glGenRenderbuffers();
            GL30.glBindRenderbuffer(GL30.GL_RENDERBUFFER, msaaDepthBuf);
            GL30.glRenderbufferStorageMultisample(GL30.GL_RENDERBUFFER, samples, GL11.GL_DEPTH_COMPONENT, width, height);
            GL30.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER, GL30.GL_DEPTH_ATTACHMENT, GL30.GL_RENDERBUFFER, msaaDepthBuf);
        }

        int status = GL30.glCheckFramebufferStatus(GL30.GL_FRAMEBUFFER);
        if (status != GL30.GL_FRAMEBUFFER_COMPLETE) {
            throw new RuntimeException("MSAA FBO incomplete: " + status);
        }

        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, 0);
    }

    public void bindFramebuffer() {
        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, framebufferObject);
        GL11.glViewport(0, 0, framebufferTextureWidth, framebufferTextureHeight);
    }

    public void unbindAndResolve() {
        int mainFbo = Minecraft.getMinecraft().getFramebuffer().framebufferObject;

        GL30.glBindFramebuffer(GL30.GL_READ_FRAMEBUFFER, framebufferObject);
        GL30.glBindFramebuffer(GL30.GL_DRAW_FRAMEBUFFER, mainFbo);

        GL30.glBlitFramebuffer(
                0, 0, framebufferTextureWidth, framebufferTextureHeight,
                0, 0, framebufferTextureWidth, framebufferTextureHeight,
                GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST
        );

        GL30.glBindFramebuffer(GL30.GL_FRAMEBUFFER, mainFbo);
    }

    @Override
    public void deleteFramebuffer() {
        if (framebufferObject >= 0) {
            GL30.glDeleteFramebuffers(framebufferObject);
            framebufferObject = -1;
        }

        if (msaaColorTex >= 0) {
            GL11.glDeleteTextures(msaaColorTex);
            msaaColorTex = -1;
        }

        if (msaaDepthBuf >= 0) {
            GL30.glDeleteRenderbuffers(msaaDepthBuf);
            msaaDepthBuf = -1;
        }
    }
}
