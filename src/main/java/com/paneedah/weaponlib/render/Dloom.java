package com.paneedah.weaponlib.render;

import com.paneedah.weaponlib.render.bgl.GLCompatible;
import com.paneedah.weaponlib.shader.jim.Shader;
import com.paneedah.weaponlib.shader.jim.ShaderLoader;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.GlStateManager.DestFactor;
import net.minecraft.client.renderer.GlStateManager.SourceFactor;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.opengl.*;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class Dloom {

	public static Shader downsample2 = ShaderLoader.loadShader("downsample2");
	public static Shader bloom_h = ShaderLoader.loadShader("bloom_h");
	public static Shader bloom_v = ShaderLoader.loadShader("bloom_v");
	
	public static final int bloomLayers = 4;
    public static Framebuffer[] bloomBuffers;
    public static Framebuffer bloomData;
    
    public static int height, width;
    public static int depthFrameBuffer = -1;
    public static int depthTexture = -1;
    
    public static void blitDepth(){
    	
    	//depthFrameBuffer = -1;
    	
    	if(height != Minecraft.getMinecraft().displayHeight || width != Minecraft.getMinecraft().displayWidth || depthFrameBuffer == -1){
    		System.out.println("CREATED DEPTH BOOFER");
    		height = Minecraft.getMinecraft().displayHeight;
    		width = Minecraft.getMinecraft().displayWidth;
    		
    		
    		GL11.glDeleteTextures(depthTexture);
    		OpenGlHelper.glDeleteFramebuffers(depthFrameBuffer);
    		
    		
    		depthFrameBuffer = OpenGlHelper.glGenFramebuffers();
    		OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, depthFrameBuffer);
    		depthTexture = GL11.glGenTextures();
    		GlStateManager.bindTexture(depthTexture);
			GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL14.GL_DEPTH_COMPONENT24, Minecraft.getMinecraft().displayWidth, Minecraft.getMinecraft().displayHeight, 0, GL11.GL_DEPTH_COMPONENT, GL11.GL_FLOAT, (FloatBuffer)null);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_NEAREST);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_NEAREST);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
			GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
			OpenGlHelper.glFramebufferTexture2D(OpenGlHelper.GL_FRAMEBUFFER, OpenGlHelper.GL_DEPTH_ATTACHMENT, GL11.GL_TEXTURE_2D, depthTexture, 0);
			int bruh = OpenGlHelper.glCheckFramebufferStatus(OpenGlHelper.GL_FRAMEBUFFER);
			if(bruh != OpenGlHelper.GL_FRAMEBUFFER_COMPLETE){
				System.out.println("Failed to create depth texture framebuffer! This is an error!");
			}
			
			
			
    		
    	}
    	
    
    	
    	OpenGlHelper.glBindFramebuffer(GLCompatible.GL_READ_FRAMEBUFFER, Minecraft.getMinecraft().getFramebuffer().framebufferObject);
    	OpenGlHelper.glBindFramebuffer(GLCompatible.GL_DRAW_FRAMEBUFFER, depthFrameBuffer);
    	GLCompatible.glBlitFramebuffer(0, 0, width, height, 0, 0, width, height, GL11.GL_DEPTH_BUFFER_BIT, GL11.GL_NEAREST);
    	
    	Minecraft.getMinecraft().getFramebuffer().bindFramebuffer(false);
    }
    
    public static void doPost() {
    	//recreateBloomFBOs();
    	bloom();
    	//
    	GlStateManager.enableDepth();
    }
    
    private static void bloom(){
		downsampleBloomData();
		GlStateManager.enableBlend();
		for(int i = bloomLayers-1; i >= 0; i --){
			GlStateManager.blendFunc(SourceFactor.ONE, DestFactor.ZERO);
			bloomBuffers[i*2+1].bindFramebuffer(true);
			bloom_h.use();
			GL20.glUniform1f(GL20.glGetUniformLocation(bloom_h.getShaderId(), "frag_width"), 1F/(float)bloomBuffers[i*2].framebufferWidth);
			renderFboTriangle(bloomBuffers[i*2], bloomBuffers[i*2+1].framebufferWidth, bloomBuffers[i*2+1].framebufferHeight);
			
			GlStateManager.blendFunc(SourceFactor.ONE, DestFactor.ONE);
			int tWidth, tHeight;
			if(i == 0){
				Minecraft.getMinecraft().getFramebuffer().bindFramebuffer(true);
				tWidth = Minecraft.getMinecraft().getFramebuffer().framebufferWidth;
				tHeight = Minecraft.getMinecraft().getFramebuffer().framebufferHeight;
			} else {
				GlStateManager.glBlendEquation(GL14.GL_MAX);
				bloomBuffers[(i-1)*2].bindFramebuffer(true);
				tWidth = bloomBuffers[(i-1)*2].framebufferWidth;
				tHeight = bloomBuffers[(i-1)*2].framebufferHeight;
			}
			bloom_v.use();
			GL20.glUniform1f(GL20.glGetUniformLocation(bloom_v.getShaderId(), "frag_height"), 1f/(float)bloomBuffers[i*2].framebufferHeight);
			renderFboTriangle(bloomBuffers[i*2+1], tWidth, tHeight);
			GlStateManager.glBlendEquation(GL14.GL_FUNC_ADD);
		}
		OpenGlHelper.glUseProgram(0);
//		GLCompat.useProgram(0);
		GlStateManager.blendFunc(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA);
		GlStateManager.disableBlend();
		bloomData.bindFramebuffer(true);
		GlStateManager.clearColor(bloomData.framebufferColor[0], bloomData.framebufferColor[1], bloomData.framebufferColor[2], bloomData.framebufferColor[3]);
		GlStateManager.clear(GL11.GL_COLOR_BUFFER_BIT);
		Minecraft.getMinecraft().getFramebuffer().bindFramebuffer(true);
		
		GlStateManager.enableAlpha();
		GlStateManager.enableLighting();
		GlStateManager.enableDepth();
	}

    
    public static void recreateBloomFBOs(){
    	int width = Minecraft.getMinecraft().displayWidth;
    	int height = Minecraft.getMinecraft().displayHeight;
    	
		if(bloomBuffers != null)
			for(Framebuffer buf : bloomBuffers){
				buf.deleteFramebuffer();
			}
		if(bloomData != null)
			bloomData.deleteFramebuffer();
		bloomData = new Framebuffer(width, height, true);
		bloomData.bindFramebufferTexture();
		GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL30.GL_RGBA16F, width, height, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_SHORT, (IntBuffer)null);
		bloomData.bindFramebuffer(false);
		OpenGlHelper.glBindRenderbuffer(GL30.GL_RENDERBUFFER, Minecraft.getMinecraft().getFramebuffer().depthBuffer);
		OpenGlHelper.glFramebufferRenderbuffer(GL30.GL_FRAMEBUFFER, GL30.GL_DEPTH_ATTACHMENT, GL30.GL_RENDERBUFFER, Minecraft.getMinecraft().getFramebuffer().depthBuffer);
		bloomData.setFramebufferFilter(GL11.GL_LINEAR);
		bloomData.setFramebufferColor(0, 0, 0, 0);
		bloomData.framebufferClear();
		bloomBuffers = new Framebuffer[bloomLayers*2];
		float bloomW = width;
		float bloomH = height;
		for(int i = 0; i < bloomLayers; i ++){
			
			bloomBuffers[i*2] = new Framebuffer((int)bloomW, (int)bloomH, false);
			bloomBuffers[i*2+1] = new Framebuffer((int)bloomW, (int)bloomH, false);
			bloomBuffers[i*2].bindFramebufferTexture();
			GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL30.GL_RGBA16F, (int)bloomW, (int)bloomH, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_SHORT, (IntBuffer)null);
			bloomBuffers[i*2+1].bindFramebufferTexture();
			GL11.glTexImage2D(GL11.GL_TEXTURE_2D, 0, GL30.GL_RGBA16F, (int)bloomW, (int)bloomH, 0, GL11.GL_RGBA, GL11.GL_UNSIGNED_SHORT, (IntBuffer)null);
			bloomBuffers[i*2].setFramebufferFilter(GL11.GL_LINEAR);
			bloomBuffers[i*2+1].setFramebufferFilter(GL11.GL_LINEAR);
			bloomBuffers[i*2].setFramebufferColor(0, 0, 0, 0);
			bloomBuffers[i*2+1].setFramebufferColor(0, 0, 0, 0);
			if(i < 2){
				bloomW *= 0.25F;
				bloomH *= 0.25F;
			} else {
				bloomW *= 0.5F;
				bloomH *= 0.5F;
			}
		}
	}
    
    public static void renderFboTriangle(Framebuffer buf){
		renderFboTriangle(buf, buf.framebufferWidth, buf.framebufferHeight);
	}
	
	public static void renderFboTriangle(Framebuffer buf, int width, int height){
		GlStateManager.colorMask(true, true, true, false);
        GlStateManager.disableDepth();
        GlStateManager.depthMask(false);
        GlStateManager.viewport(0, 0, width, height);
        GlStateManager.enableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableAlpha();

        GlStateManager.enableColorMaterial();

        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
        buf.bindFramebufferTexture();
        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferbuilder = tessellator.getBuffer();
        bufferbuilder.begin(GL11.GL_TRIANGLES, DefaultVertexFormats.POSITION_TEX);
        bufferbuilder.pos(-1, -1, 0.0D).tex(0, 0).endVertex();
        bufferbuilder.pos(3, -1, 0.0D).tex(2, 0).endVertex();
        bufferbuilder.pos(-1, 3, 0.0D).tex(0, 2).endVertex();
        tessellator.draw();
        buf.unbindFramebufferTexture();
        GlStateManager.depthMask(true);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.colorMask(true, true, true, true);
	}
	
	public static void downsampleBloomData(){
		/*
		bloomBuffers[0].bindFramebuffer(true);
		Bloom.downsample.use();
		
		GL20.glUniform2f(GL20.glGetUniformLocation(Bloom.downsample.getShaderId(), "texel"), 1F/(float) bloomData.framebufferTextureWidth, 1F/(float) bloomData.framebufferTextureHeight);
		renderFboTriangle(bloomData, bloomBuffers[0].framebufferWidth, bloomBuffers[0].framebufferHeight);
		for(int i = 1; i < bloomLayers; i++) {
			bloomBuffers[i].bindFramebuffer(true);
			GL20.glUniform2f(GL20.glGetUniformLocation(downsample.getShaderId(), "texel"), 1F/(float) bloomBuffers[i-1].framebufferTextureWidth, 1F/(float) buffers[i-1].framebufferTextureHeight);
			renderFboTriangle(bloomBuffers[i-1], bloomBuffers[i].framebufferWidth, bloomBuffers[i].framebufferHeight);
		}
		
		Bloom.downsample.release();*/
		
		//Bloom.downsample = ShaderLoader.loadShader(new ResourceLocation("mw" + ":" + "shaders/downsample"));
		
		
		bloomBuffers[0].bindFramebuffer(true);
		Shaders.downsample.use();
		GL20.glUniform2f(GL20.glGetUniformLocation(downsample2.getShaderId(), "texel"), 1F/(float)bloomData.framebufferTextureWidth, 1F/(float)bloomData.framebufferTextureHeight);
		renderFboTriangle(bloomData, bloomBuffers[0].framebufferWidth, bloomBuffers[0].framebufferHeight);
		for(int i = 1; i < bloomLayers; i ++){
			bloomBuffers[i*2].bindFramebuffer(true);
			GL20.glUniform2f(GL20.glGetUniformLocation(downsample2.getShaderId(), "texel"), 1F/(float)bloomBuffers[(i-1)*2].framebufferTextureWidth, 1F/(float)bloomBuffers[(i-1)*2].framebufferTextureHeight);
			renderFboTriangle(bloomBuffers[(i-1)*2], bloomBuffers[i*2].framebufferWidth, bloomBuffers[i*2].framebufferHeight);
		}
		Shaders.downsample.release();
		
	}
}
