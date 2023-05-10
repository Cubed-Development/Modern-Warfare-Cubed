package com.paneedah.weaponlib;

import com.paneedah.weaponlib.render.Shaders;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class LaserBeamRenderer implements CustomRenderer {
	
	private float xOffset = 0.5f;
	private float yOffset = -1.3f;
	private float zOffset = -1.7f;
	
	private BiConsumer<EntityLivingBase, ItemStack> positioning;
	
	public LaserBeamRenderer(BiConsumer<EntityLivingBase, ItemStack> positioning) {
	    this.positioning = positioning;
	}

	@Override
	public void render(RenderContext renderContext) {
		
		
		
		PlayerItemInstance<?> instance = renderContext.getPlayerItemInstance();

		ItemCameraTransforms.TransformType type = renderContext.getTransformType();
		if(instance instanceof PlayerWeaponInstance && ((PlayerWeaponInstance) instance).isLaserOn() && (type == ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND || type == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND || type == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND || type == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND || type == ItemCameraTransforms.TransformType.GROUND)) {
			
			
			
		
			
			
			GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
			
			GlStateManager.disableTexture2D();
			
			
			//GL11.glPopAttrib();
			
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			
			GL11.glPushMatrix();
			//GlStateManager.color(1.0f, 0.0f, 0.0f, 1.0f);
			
			GlStateManager.enableBlend();
			GlStateManager.enableAlpha();
			
			
			GL11.glLineWidth(1.0f);
			GL11.glColor4f(1f, 0f, 0f, 1.0f); 
			//GL11.glDepthMask(false);
			
			
			GlStateManager.shadeModel(GL11.GL_SMOOTH);
			GlStateManager.disableTexture2D();
			GlStateManager.disableLighting();
			if(positioning != null) positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
			
			//Shader brightShader = ShaderLoader.loadVMWShader("brightness");
			Shaders.brightnessShader.use();
			Shaders.brightnessShader.uniform1f("brightness", 4f);
			Shaders.brightnessShader.uniform3f("color", 0f, 1f, 0f);

			Tessellator tes = Tessellator.getInstance();
			BufferBuilder bb = tes.getBuffer();
			bb.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
			bb.pos(xOffset, yOffset, -1.5).color(1.0f, 0.0f, 0.0f, 1.0f).endVertex();
			bb.pos(xOffset, yOffset, -50).color(1.0f, 0.0f, 0.0f, 0.1f).endVertex();
			tes.draw();
			
			mc.getFramebuffer().bindFramebuffer(false);
			 tes = Tessellator.getInstance();
			 bb = tes.getBuffer();
			bb.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
			bb.pos(xOffset, yOffset, -1.5).color(1.0f, 0.0f, 0.0f, 1.0f).endVertex();
			bb.pos(xOffset, yOffset, -50).color(1.0f, 0.0f, 0.0f, 0.1f).endVertex();
			tes.draw();
			
			
			Shaders.brightnessShader.release();
			
			
			GlStateManager.enableLighting();
			GlStateManager.enableTexture2D();
			GlStateManager.disableBlend();
			GL11.glPopMatrix();
			GL11.glPopAttrib();
			
			
			
			
		
			/*
			GL11.glPushMatrix();
		
			GL11.glPushAttrib(GL11.GL_ALL_ATTRIB_BITS);
			//GL11.glDisable(GL11.GL_CULL_FACE);
			//GL11.glDisable(GL11.GL_LIGHTING);
			//GL11.glDisable(GL11.GL_TEXTURE_2D);

			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GL11.glColor4f(1f, 0f, 0f, 0.5f); 
			GL11.glLineWidth(10.5F);
			//GL11.glDepthMask(false);

			if(positioning != null) {
			    positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
			}

			Tessellator tessellator = Tessellator.getInstance();
			tessellator.startDrawingLines();

			long time = System.currentTimeMillis();
			Random random = new Random(time - time % 300);
			float start = zOffset; //forwardOffset;
			float length = 100;

			float end = 0;
			for(int i = 0; i < 100 && start < length && end < length; i++) {
				tessellator.addVertex(xOffset, yOffset, start);
				tessellator.endVertex();
		        int ii = 15728880; //this.getBrightnessForRender(partialTicks); // or simply set it to 200?
		        int j = ii >> 16 & 65535;
		        int k = ii & 65535;
		        //tessellator.setLightMap(j, k);
				end = start - ( 1 + random.nextFloat() * 2);
				if(end > length) end = length;
				tessellator.addVertex(xOffset, yOffset, end);
				tessellator.endVertex();
				start = end + random.nextFloat() * 0.5f;
			}

			tessellator.draw();
			
			GL11.glDepthMask(true);// do we need this?
			
			GL11.glPopAttrib();

			GL11.glPopMatrix();
			*/
		}
	}
}
