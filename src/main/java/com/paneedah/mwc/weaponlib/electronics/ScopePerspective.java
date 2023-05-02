package com.paneedah.mwc.weaponlib.electronics;

import com.paneedah.mwc.weaponlib.ClientModContext;
import com.paneedah.mwc.weaponlib.RenderContext;
import com.paneedah.mwc.weaponlib.RenderableState;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleTransformType;
import com.paneedah.mwc.weaponlib.perspective.Perspective;
import com.paneedah.mwc.weaponlib.perspective.PerspectiveRenderer;
import com.paneedah.mwc.weaponlib.render.scopes.Reticle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ScopePerspective extends PerspectiveRenderer {
	
	private Reticle reticle;

	public ScopePerspective(BiConsumer<EntityLivingBase, ItemStack> positioning, Reticle reticle) {
		super(positioning);
		this.reticle = reticle;
	}

	
	@Override
	public void render(RenderContext<RenderableState> renderContext) {

		if(renderContext.getCompatibleTransformType() != CompatibleTransformType.FIRST_PERSON_RIGHT_HAND
				&& renderContext.getCompatibleTransformType() != CompatibleTransformType.FIRST_PERSON_LEFT_HAND) {
			return;
		}

		if(renderContext.getModContext() == null) {
		    return;
		}

		ClientModContext clientModContext = (ClientModContext) renderContext.getModContext();

		@SuppressWarnings("unchecked")
        Perspective<RenderableState> perspective = (Perspective<RenderableState>) clientModContext.getViewManager()
            .getPerspective(renderContext.getPlayerItemInstance(), false);
		if(perspective == null) {
		    perspective = STATIC_TEXTURE_PERSPECTIVE;
		}

	
		float brightness = perspective.getBrightness(renderContext);
		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

		positioning.accept(renderContext.getPlayer(), renderContext.getWeapon());
		//GL11.glBindTexture(GL11.GL_TEXTURE_2D, framebuffer.framebufferTexture);
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, perspective.getTexture(renderContext));
		compatibility.disableLightMap();
		GlStateManager.enableDepth();
		//GL11.glDepthMask(true);
		//GL11.glDisable(GL11.GL_LIGHTING);
		//GL11.glDisable(GL11.GL_ALPHA_TEST);
		//GL11.glDisable(GL11.GL_BLEND);

		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();
		GL11.glColor4f(brightness, brightness, brightness, 1f);
		model.render(this.reticle, renderContext, renderContext.getPlayer(), renderContext.getScale());

		compatibility.enableLightMap();
		GL11.glPopAttrib();
		GL11.glPopMatrix();
	}
}
