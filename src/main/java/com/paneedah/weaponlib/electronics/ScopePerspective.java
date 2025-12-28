package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.perspective.PerspectiveRenderer;
import com.paneedah.weaponlib.render.scopes.Reticle;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class ScopePerspective extends PerspectiveRenderer {

    private final Reticle reticle;

    public ScopePerspective(Runnable positioning, Reticle reticle) {
        super(positioning);
        this.reticle = reticle;
    }


    @Override
    public void render(RenderContext<RenderableState> renderContext) {

        if (renderContext.getTransformType() != ItemCameraTransforms.TransformType.FIRST_PERSON_RIGHT_HAND && renderContext.getTransformType() != ItemCameraTransforms.TransformType.FIRST_PERSON_LEFT_HAND) {
            return;
        }

        ClientModContext clientModContext = (ClientModContext) MWC.modContext;


        Perspective<RenderableState> perspective = (Perspective<RenderableState>) clientModContext.getViewManager().getPerspective(renderContext.getPlayerItemInstance(), false);
        if (perspective == null) {
            perspective = STATIC_TEXTURE_PERSPECTIVE;
        }


        float brightness = perspective.getBrightness(renderContext);
        GlStateManager.pushMatrix();
        GlStateManager.pushAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28 // Before the transition to GlStateManager it used `GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT`, but GlStateManager don't allow mask so maybe we just don't at all? - Luna Mira Lage (Desoroxxx) - 2025-12-28

        positioning.run();
        //GlStateManager.bindTexture(framebuffer.framebufferTexture);
        GlStateManager.bindTexture(perspective.getTexture(renderContext));
        MC.entityRenderer.disableLightmap();
        GlStateManager.enableDepth();
        //GlStateManager.depthMask(true);
        //GlStateManager.disableLighting();
        //GlStateManager.disableAlpha();
        //GlStateManager.disableBlend();

        GlStateManager.enableAlpha();
        GlStateManager.enableBlend();
        GlStateManager.color(brightness, brightness, brightness, 1f);
        model.render(this.reticle, renderContext, renderContext.getPlayer(), renderContext.getScale());

        MC.entityRenderer.enableLightmap();
        GlStateManager.popAttrib(); // TODO: This fucks up the GlStateManager - Luna Mira Lage (Desoroxxx) 2025-12-28
        GlStateManager.popMatrix();
    }
}
