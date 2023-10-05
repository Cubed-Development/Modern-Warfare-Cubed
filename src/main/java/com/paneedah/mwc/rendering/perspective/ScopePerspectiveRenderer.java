package com.paneedah.mwc.rendering.perspective;

import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.render.scopes.Reticle;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class ScopePerspectiveRenderer extends PerspectiveRenderer {
	
	private final Reticle reticle;

	public ScopePerspectiveRenderer(final Runnable positioning, final Reticle reticle) {
		super(positioning);
		this.reticle = reticle;
	}

	@Override
	public void render(final RenderContext<RenderableState> renderContext) {
		if (!FIRST_PERSON_HANDS_TRANSFORM_TYPES.contains(renderContext.getTransformType()))
			return;
		
        final Perspective perspective = getPerspective(renderContext);
	
		final float brightness = perspective.getBrightness(renderContext);

		GL11.glPushMatrix();
		GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);

		positioning.run();

		//GL11.glBindTexture(GL11.GL_TEXTURE_2D, framebuffer.framebufferTexture);
		GL11.glBindTexture(GL11.GL_TEXTURE_2D, perspective.getTexture());
		MC.entityRenderer.disableLightmap();
		GlStateManager.enableDepth();
		//GL11.glDepthMask(true);
		//GL11.glDisable(GL11.GL_LIGHTING);
		//GL11.glDisable(GL11.GL_ALPHA_TEST);
		//GL11.glDisable(GL11.GL_BLEND);

		GlStateManager.enableAlpha();
		GlStateManager.enableBlend();

		GL11.glColor4f(brightness, brightness, brightness, 1);

		viewfinder.render(reticle, renderContext, renderContext.getScale());

        MC.entityRenderer.enableLightmap();

		GL11.glPopAttrib();
		GL11.glPopMatrix();
	}
}
