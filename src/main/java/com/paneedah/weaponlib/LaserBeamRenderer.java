package com.paneedah.weaponlib;

import com.paneedah.mwc.instancing.PlayerItemInstance;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.weaponlib.render.Shaders;
import net.minecraft.client.renderer.*;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class LaserBeamRenderer implements CustomRenderer {

    private final float xOffset = 0.5f;
    private final float yOffset = -1.3f;
    private final float zOffset = -1.7f;

    private final BiConsumer<EntityLivingBase, ItemStack> positioning;

    public LaserBeamRenderer(BiConsumer<EntityLivingBase, ItemStack> positioning) {
        this.positioning = positioning;
    }

    @Override
    public void render(RenderContext renderContext) {


        PlayerItemInstance<?> instance = renderContext.getPlayerItemInstance();

        ItemCameraTransforms.TransformType type = renderContext.getTransformType();
        if (instance instanceof PlayerWeaponInstance && ((PlayerWeaponInstance) instance).isLaserOn() && (type == ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND || type == ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND || type == ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND || type == ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND || type == ItemCameraTransforms.TransformType.GROUND)) {


            GlStateManager.pushAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28

            GlStateManager.disableTexture2D();


            //GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28

            GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

            GlStateManager.pushMatrix();
            //GlStateManager.color(1.0f, 0.0f, 0.0f, 1.0f);

            GlStateManager.enableBlend();
            GlStateManager.enableAlpha();


            GlStateManager.glLineWidth(1.0f);
            GlStateManager.color(1f, 0f, 0f, 1.0f);
            //GlStateManager.depthMask(false);


            GlStateManager.shadeModel(GL11.GL_SMOOTH);
            GlStateManager.disableTexture2D();
            GlStateManager.disableLighting();
            if (positioning != null) {
                positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
            }

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

            MC.getFramebuffer().bindFramebuffer(false);
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
            GlStateManager.popMatrix();
            GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28

			/*
			GlStateManager.pushMatrix();

			GlStateManager.pushAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28                                 
			//GlStateManager.disableCull();
			//GlStateManager.disableLighting();
			//GlStateManager.disableTexture2D();

			GlStateManager.enableBlend();
			GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
			GlStateManager.color(1f, 0f, 0f, 0.5f); 
			GlStateManager.glLineWidth(10.5F);
			//GlStateManager.depthMask(false);

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
			
			GlStateManager.depthMask(true);// do we need this?
			
			GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28

			GlStateManager.popMatrix();
			*/
        }
    }
}
