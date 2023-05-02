package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.render.bgl.GLCompatible;
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class MSAABuffer {
	
	public int width;
	public int height;
	public boolean depth;
	
	public int fbo = -1;
	public int depth_tex = -1;
	
	public MSAABuffer(int width, int height, boolean depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
		setupBuffer();
	}
	
	public void setupBuffer() {
		if(GLCompatible.isLoaded && GLCompatible.multisampleType == -1) return;
		
		
		this.fbo  = GLCompatible.glGenFramebuffers();
		GLCompatible.glBindFramebuffer(GLCompatible.GL_FRAMEBUFFER, this.fbo);
		this.fbo = GL11.glGenTextures();
		
		
		GL11.glBindTexture(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, this.fbo);
		GLCompatible.glTexImage2DMultisample(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, 4, GL11.GL_RGBA8, width, height, false);
		GLCompatible.glFramebufferTexture2D(GLCompatible.GL_FRAMEBUFFER, GLCompatible.GL_COLOR_ATTACHMENT0, GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, this.fbo, 0);
		
		/*
		if(depth) {
			depth_tex = GL11.glGenTextures();
			GL11.glBindTexture(GL32.GL_TEXTURE_2D_MULTISAMPLE, depth_tex);
			GLCompatible.glTexImage2DMultisample(GLCompatible.GL_TEXTURE_2D_MULTISAMPLE, 4, GL14.GL_DEPTH_COMPONENT24, width, height, false);
		}
		*/
		GLCompatible.glBindFramebuffer(GLCompatible.GL_FRAMEBUFFER, mc.getFramebuffer().framebufferObject);
		
	}
	
	public void bindMSAABuffer(int initialFBO) {
		
		
		setupBuffer();
		
		GLCompatible.glBindFramebuffer(GLCompatible.GL_READ_FRAMEBUFFER, initialFBO);
		
	
		GLCompatible.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER, this.fbo);
        GLCompatible.glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);
    
      //  GLCompatible.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, this.fbo);
    	GLCompatible.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, initialFBO);
	}
	
	public void unbindMSAABuffer(int initialFBO) {
		GLCompatible.glBindFramebuffer(GLCompatible.GL_READ_FRAMEBUFFER, this.fbo);
    	GLCompatible.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER, initialFBO);
        GLCompatible.glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL11.GL_COLOR_BUFFER_BIT, GL11.GL_NEAREST);
        GLCompatible.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, initialFBO);
	}
	
	
	
	

}
