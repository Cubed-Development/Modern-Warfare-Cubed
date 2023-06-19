// Made with Blockbench 4.1.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports
package com.paneedah.weaponlib.perspective;


import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.CustomRenderer;
import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.model.ScreenModel;
import com.paneedah.weaponlib.render.Shaders;
import com.paneedah.weaponlib.render.scopes.CyclicList;
import com.paneedah.weaponlib.render.scopes.Reticle;
import com.paneedah.weaponlib.shader.jim.Shader;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ReflexScreen extends ModelBase implements CustomRenderer<RenderableState>{
	
	
	public static final Reticle DEFAULT_RETICLE = new Reticle("holo", 0.05f);
	
	private final ModelRenderer bb_main;

	
	// The positioning for the reticle screen
	public BiConsumer<EntityLivingBase, ItemStack> positioning;
	
	// For scopes that are circular.
	public float radius;
	
	// List of reticles
	public CyclicList<Reticle> reticleList = new CyclicList<>();
	
	

	
	public ReflexScreen(BiConsumer<EntityLivingBase, ItemStack> pos, float radius, CyclicList<Reticle> reticles) {
		textureWidth = 16;
		textureHeight = 16;
		
		this.reticleList = reticles;
		this.radius = radius;
		this.positioning = pos;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, false));
	}

	//https://vazgriz.com/158/reflex-sight-shader-in-unity3d/
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
	
		if(1+1==2) return;
		
		Shader reflexReticle = null;
		
		
		GlStateManager.disableTexture2D();
		GlStateManager.enableBlend();
		//GlStateManager.enableAlpha();
		//reflexReticle.use();
		
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0+4);
		ResourceLocation loc = new ResourceLocation(ModReference.ID + ":textures/crosshairs/okp.png");
	
		mc.getTextureManager().bindTexture(loc);
		
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
		GL20.glUniform1i(GL20.glGetUniformLocation(reflexReticle.getShaderId(), "ret"), 4);
		
		GL20.glUniform1f(GL20.glGetUniformLocation(reflexReticle.getShaderId(), "texScale"), 0.08f);
		GL20.glUniform1f(GL20.glGetUniformLocation(reflexReticle.getShaderId(), "radius"), 0.1f);
		
		
		Vec3d bg = new Vec3d(0.0, 0.7, 0.5);
		GL20.glUniform3f(GL20.glGetUniformLocation(reflexReticle.getShaderId(), "background"), (float) bg.x, (float) bg.y, (float) bg.z);
		
		GlStateManager.enableCull();
		
		/* eo tech
		bb_main.offsetY = -2.5f;
		bb_main.offsetX = -0.075f;
		bb_main.offsetZ = 0.275f;
		*/
		GlStateManager.pushMatrix();
		
		/* reflex
		bb_main.offsetY = -2.60f;
		bb_main.offsetX = -0.05f;
		bb_main.offsetZ = 0.0f;
		*/
		
		
		GlStateManager.translate(0.25, -5.05, -0.1);
		GlStateManager.scale(2.0, 2.0, 1.2);
		bb_main.render(f5);
		
		
		GlStateManager.popMatrix();
		reflexReticle.release();
		GlStateManager.disableBlend();
		GlStateManager.enableTexture2D();
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
	public void renderReticle(RenderContext<RenderableState> renderContext, boolean bloom) {

 		//if(true) return;
		Reticle currentReticle = reticleList.current();
		
		if(currentReticle == null) currentReticle = DEFAULT_RETICLE;
		
		//Shaders.reflexReticle = ShaderLoader.loadVMWShader("reflex");

		if(renderContext.getTransformType() != ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND)
			return;

		GlStateManager.disableTexture2D();
		GlStateManager.enableBlend();
		Shaders.reflexReticle.use();
		
		
		//mc.getFramebuffer().bindFramebuffer(true);

		// upload uniforms
		
		// upload texture
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0+4);
		mc.getTextureManager().bindTexture(currentReticle.getReticleTexture());		
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_S, GL12.GL_CLAMP_TO_EDGE);
		GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_WRAP_T, GL12.GL_CLAMP_TO_EDGE);
		GlStateManager.setActiveTexture(GL13.GL_TEXTURE0);
		GL20.glUniform1i(GL20.glGetUniformLocation(Shaders.reflexReticle.getShaderId(), "ret"), 4);
		GL20.glUniform1i(GL20.glGetUniformLocation(Shaders.reflexReticle.getShaderId(), "isBloom"), bloom ? 1 : 0);
		GL20.glUniform1f(GL20.glGetUniformLocation(Shaders.reflexReticle.getShaderId(), "texScale"), currentReticle.getTextureScale());
		GL20.glUniform1f(GL20.glGetUniformLocation(Shaders.reflexReticle.getShaderId(), "radius"), this.radius);
		GL20.glUniform3f(GL20.glGetUniformLocation(Shaders.reflexReticle.getShaderId(), "background"), (float) currentReticle.getBackgroundColor().x, (float) currentReticle.getBackgroundColor().y, (float) currentReticle.getBackgroundColor().z);
		GlStateManager.enableCull();
		
		//glFramebufferTexture2D(GL_FRAMEBUFFER, GL_COLOR_ATTACHMENT2, GL_TEXTURE_2D, gAlbedoSpec, 0);
		
		GlStateManager.pushMatrix();
		positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
		bb_main.render(0.065f);
		
		
		GlStateManager.popMatrix();
		Shaders.reflexReticle.release();
		GlStateManager.disableCull();
		//GlStateManager.disableBlend();
		GlStateManager.enableTexture2D();
		
		//GL20.glDrawBuffers(GL30.GL_COLOR_ATTACHMENT0);
		
	}
	private static ScreenModel screenModel = new ScreenModel();

	@Override
	public void render(RenderContext<RenderableState> renderContext) {
		//renderReticle(renderContext, true);
		
		if(ModernConfigManager.enableAllShaders && ModernConfigManager.enableReticleShaders) {
		//	mc.getFramebuffer().bindFramebuffer(true);
			renderReticle(renderContext, false);
		} else {
			
			
			
			//GlStateManager.disableTexture2D();
			mc.getTextureManager().bindTexture(reticleList.current().getReticleTexture());
			
			GlStateManager.pushMatrix();
			GlStateManager.enableCull();
			
			
		
		//	GlStateManager.translate(0, -3, 0);
			positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
			

			/*
			textureWidth = 4;
			textureHeight = textureWidth;

			ModelRenderer bb2 = new ModelRenderer(this);
			bb2.setRotationPoint(0.0F, 24.0F, 0.0F);
			bb2.cubeList.add(new ModelBox(bb2, 0, 0, -3.0F, -2.0F, 0.0F, 5, 4, 0, 0.0F, false));
			
			bb2.render(0.065f);
			*/
			
			Tessellator t = Tessellator.getInstance();
			BufferBuilder bb = t.getBuffer();
			bb.begin(GL11.GL_QUADS, DefaultVertexFormats.OLDMODEL_POSITION_TEX_NORMAL);
			
			double scaleW = 1.0 * reticleList.current().getTextureScale();
			double scaleH = scaleW;
			double x = -0.03, y = 1.56;
			
			bb.pos(-1*scaleW + x, -1*scaleH + y, 0).tex(0, 0).normal(0, 0, 1).endVertex();
			bb.pos(1*scaleW + x, -1*scaleH + y, 0).tex(1, 0).normal(0, 0, 1).endVertex();
			bb.pos(1*scaleW + x, 1*scaleH + y, 0).tex(1, 1).normal(0, 0, 1).endVertex();
			
			bb.pos(-1*scaleW + x, 1*scaleH + y, 0).tex(0, 1).normal(0, 0, 1).endVertex();
			
			t.draw();
		
			
			GlStateManager.popMatrix();
			
			
			/*
			GlStateManager.disableTexture2D();
			GlStateManager.enableBlend();
			mc.getTextureManager().bindTexture(reticleList.current().getReticleTexture());
			positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
			//bb_main.render(0.065f);
			//GlStateManager.disableTexture2D();
			Tessellator t = Tessellator.getInstance();
			BufferBuilder bb = t.getBuffer();
			bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
			
			double sizeW = 0.12;
			double sizeH = 0.12;
			double x = -0.015;
			double y = 1.525;
			
			double texScale = 2.0;
			double iTS = -1;
			
			
			//GlStateManager.color(10.0f, 10.0f, 10.0f, 2f);
			bb.pos(-1*sizeW + x, -1*sizeH + y, 0).tex(iTS, iTS).endVertex();
			bb.pos(1*sizeW + x, -1*sizeH + y, 0).tex(texScale, iTS).endVertex();
			bb.pos(1*sizeW + x, 1*sizeH + y, 0).tex(texScale, texScale).endVertex();
			bb.pos(-1*sizeW + x, 1*sizeH + y, 0).tex(iTS, texScale).endVertex();
			
			t.draw();
			*/
			
		}
		
		
		

		//reflexReticle = ShaderLoader.loadShader(new ResourceLocation(ModReference.id + ":shaders/reflex"));
	}
}
