package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.render.bgl.GLCompatible;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.EXTPackedDepthStencil;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class MultisampledFBO extends Framebuffer {

    public MultisampledFBO(int width, int height, boolean useDepthIn) {
        super(width, height, useDepthIn);

    }

    public void createBindFramebuffer(int width, int height) {

        if (!OpenGlHelper.isFramebufferEnabled()) {
            framebufferWidth = width;
            framebufferHeight = height;
        } else {
            GlStateManager.enableDepth();

            if (framebufferObject >= 0) {
                deleteFramebuffer();
            }


            createFramebuffer(width, height);


            checkFramebufferComplete();
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);

        }
    }

    public void deleteFramebuffer() {
        if (OpenGlHelper.isFramebufferEnabled()) {
            unbindFramebufferTexture();
            unbindFramebuffer();

            if (depthBuffer > -1) {
                OpenGlHelper.glDeleteRenderbuffers(depthBuffer);
                depthBuffer = -1;
            }

            if (framebufferTexture > -1) {
                TextureUtil.deleteTexture(framebufferTexture);
                framebufferTexture = -1;
            }

            if (framebufferObject > -1) {
                OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, 0);
                OpenGlHelper.glDeleteFramebuffers(framebufferObject);
                framebufferObject = -1;
            }
        }
    }

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


            //this.setFramebufferFilter(9728);

            GL11.glBindTexture(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, framebufferTexture);
            //GlStateManager.bindTexture(this.framebufferTexture);

            GLCompatible.glTexImage2DMultisample(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, 4, GL11.GL_RGBA8, width, height, false);

            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, framebufferObject);


            GLCompatible.glFramebufferTexture2D(GLCompatible.GL_FRAMEBUFFER, GLCompatible.GL_COLOR_ATTACHMENT0, GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, framebufferTexture, 0);


            if (useDepth) {

                OpenGlHelper.glBindRenderbuffer(OpenGlHelper.GL_RENDERBUFFER, depthBuffer);


                GL30.glRenderbufferStorageMultisample(OpenGlHelper.GL_FRAMEBUFFER, 4, EXTPackedDepthStencil.GL_DEPTH24_STENCIL8_EXT, width, height);

                OpenGlHelper.glFramebufferRenderbuffer(OpenGlHelper.GL_FRAMEBUFFER,
                        org.lwjgl.opengl.EXTFramebufferObject.GL_DEPTH_ATTACHMENT_EXT, OpenGlHelper.GL_RENDERBUFFER,
                        depthBuffer);
                OpenGlHelper.glFramebufferRenderbuffer(OpenGlHelper.GL_FRAMEBUFFER,
                        org.lwjgl.opengl.EXTFramebufferObject.GL_STENCIL_ATTACHMENT_EXT, OpenGlHelper.GL_RENDERBUFFER,
                        depthBuffer);

            }

            framebufferClear();
            unbindFramebufferTexture();
        }
    }

    public void checkFramebufferComplete() {
        Bloom.checkFramebufer(0);

        //	System.out.println(i == OpenGlHelper.GL_FRAMEBUFFER_COMPLETE);
    }

    public void bindFramebufferTexture() {

        GL11.glBindTexture(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, framebufferTexture);

    }

    public void unbindFramebufferTexture() {

        GL11.glBindTexture(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, 0);

    }

    public void framebufferRender(int width, int height) {
        framebufferRenderExt(width, height, true);
    }

    public void framebufferRenderExt(int width, int height, boolean p_178038_3_) {
        if (OpenGlHelper.isFramebufferEnabled()) {
            GlStateManager.colorMask(true, true, true, false);
            GlStateManager.disableDepth();
            GlStateManager.depthMask(false);
            GlStateManager.matrixMode(5889);
            GlStateManager.loadIdentity();
            GlStateManager.ortho(0.0D, width, height, 0.0D, 1000.0D, 3000.0D);
            GlStateManager.matrixMode(5888);
            GlStateManager.loadIdentity();
            GlStateManager.translate(0.0F, 0.0F, -2000.0F);
            GlStateManager.viewport(0, 0, width, height);
            GlStateManager.enableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.disableAlpha();

            if (p_178038_3_) {
                GlStateManager.disableBlend();
                GlStateManager.enableColorMaterial();
            }

            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            bindFramebufferTexture();
            float f = (float) width;
            float f1 = (float) height;
            float f2 = (float) framebufferWidth / (float) framebufferTextureWidth;
            float f3 = (float) framebufferHeight / (float) framebufferTextureHeight;
            Tessellator tessellator = Tessellator.getInstance();
            BufferBuilder bufferbuilder = tessellator.getBuffer();
            bufferbuilder.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
            bufferbuilder.pos(0.0D, f1, 0.0D).tex(0.0D, 0.0D).color(255, 255, 255, 255).endVertex();
            bufferbuilder.pos(f, f1, 0.0D).tex(f2, 0.0D).color(255, 255, 255, 255)
                    .endVertex();
            bufferbuilder.pos(f, 0.0D, 0.0D).tex(f2, f3).color(255, 255, 255, 255)
                    .endVertex();
            bufferbuilder.pos(0.0D, 0.0D, 0.0D).tex(0.0D, f3).color(255, 255, 255, 255).endVertex();
            tessellator.draw();
            unbindFramebufferTexture();
            GlStateManager.depthMask(true);
            GlStateManager.colorMask(true, true, true, true);
        }
    }

    public void framebufferClear() {
        bindFramebuffer(true);
        GlStateManager.clearColor(framebufferColor[0], framebufferColor[1], framebufferColor[2],
                framebufferColor[3]);
        int i = 16384;

        if (useDepth) {
            GlStateManager.clearDepth(1.0D);
            i |= 256;
        }

        GlStateManager.clear(i);
        unbindFramebuffer();
    }

}
