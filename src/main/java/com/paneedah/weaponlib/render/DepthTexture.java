package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.render.bgl.GLCompatible;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import java.nio.FloatBuffer;

import static com.paneedah.mwc.utils.ModReference.LOG;

/**
 * Depth texture class that holds a depth buffer with a depth texture attachment that allows for rendering it into shaders.
 *
 * @author Homer Riva-Cambrin
 * @version October 2nd, 2022
 */
public class DepthTexture {

    private int buffer = -1;
    private int texture = -1;

    private int width, height;

    public DepthTexture(int width, int height) {
        this.width = width;
        this.height = height;

        createDepthTexture();
    }

    public void recreateBuffer(final int width, final int height) {
        if (width == this.width && height == this.height)
            return;

        this.width = width;
        this.height = height;

        createDepthTexture();
    }

    protected void createDepthTexture() {
        // If the buffer already exists, we want to delete it
        if (buffer != -1)
            OpenGlHelper.glDeleteFramebuffers(buffer);

        if (texture == -1)
            texture = GL11.glGenTextures();

        // Bind the scope's depth buffer
        buffer = OpenGlHelper.glGenFramebuffers();
        OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, buffer);

        // Bind the scope depth texture to the buffer with appropriate parameters
        GlStateManager.bindTexture(texture);
        GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GLCompatible.GL_DEPTH_COMPONENT24, this.width, this.height, 0, GL11.GL_DEPTH_COMPONENT, GL11.GL_FLOAT, (FloatBuffer) null);
        GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
        GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
        GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
        GlStateManager.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
        OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT, GL11.GL_TEXTURE_2D, texture, 0);

        // Check status
        checkFramebufferStatus();
    }

    public void blitOn(Framebuffer source, boolean rebind) {
        blitOn(source.framebufferObject, source.framebufferWidth, source.framebufferHeight, rebind);
    }

    public void blitOn(int srcBuf, int srcW, int srcH, boolean rebind) {
        OpenGlHelper.glBindFramebuffer(GLCompatible.GL_READ_FRAMEBUFFER, srcBuf);
        OpenGlHelper.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER, getBuffer());
        GLCompatible.glBlitFramebuffer(0, 0, srcW, srcH, 0, 0, getWidth(), getHeight(), GL11.GL_DEPTH_BUFFER_BIT, GL11.GL_NEAREST);
        safeBindFramebuffer(srcBuf);
    }

    private void safeBindFramebuffer(int buf) {
        if (OpenGlHelper.isFramebufferEnabled()) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, buf);

            /*
            if (p_147610_1_)
            {
                GlStateManager.viewport(0, 0, this.framebufferWidth, this.framebufferHeight);
            }*/
        }
    }

    private void checkFramebufferStatus() {
        int status = OpenGlHelper.glCheckFramebufferStatus(OpenGlHelper.GL_FRAMEBUFFER);

        if (status != OpenGlHelper.GL_FRAMEBUFFER_COMPLETE) {
            if (status == OpenGlHelper.GL_FB_INCOMPLETE_ATTACHMENT) {
                LOG.error("Depth framebuffer creation returned an incomplete attachment error.");
            } else if (status == OpenGlHelper.GL_FB_INCOMPLETE_MISS_ATTACH) {
                LOG.error("Depth framebuffer creation returned a missing attachment error.");
            } else if (status == OpenGlHelper.GL_FB_INCOMPLETE_DRAW_BUFFER) {
                LOG.error("Depth framebuffer creation returned an incomplete draw buffer error.");
            } else if (status == OpenGlHelper.GL_FB_INCOMPLETE_READ_BUFFER) {
                LOG.error("Depth framebuffer creation returned an incomplete read buffer error.");
            } else {
                LOG.error("Depth framebuffer creation returned an unknown status");
            }
        } else {
            LOG.debug("Succesfully created depth buffer.");
        }
    }

    public int getTexture() {
        return texture;
    }

    public int getBuffer() {
        return buffer;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

}
