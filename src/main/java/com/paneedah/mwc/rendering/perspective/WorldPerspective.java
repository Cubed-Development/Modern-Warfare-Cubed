package com.paneedah.mwc.rendering.perspective;

import com.paneedah.mwc.mixininterfaces.IModernEntityRenderer;
import com.paneedah.mwc.proxies.ClientProxy;
import com.paneedah.weaponlib.RenderingPhase;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

/**
 * Used by child classes to render the world
 */
public class WorldPerspective extends Perspective {

    private long renderEndTimeNano;

    public WorldPerspective() {
        renderEndTimeNano = System.nanoTime();
        width = MC.displayWidth;
        height = MC.displayHeight;
    }

    protected void setSize(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void update(final TickEvent.RenderTickEvent renderTickEvent) {
        if (MC.isGamePaused())
            return;

        ClientProxy.renderingPhase = RenderingPhase.RENDER_PERSPECTIVE;

        final int originalDisplayWidth = MC.displayWidth;
        final int originalDisplayHeight = MC.displayHeight;

        framebuffer.bindFramebuffer(true);

        MC.displayWidth = width;
        MC.displayHeight = height;

        ((IModernEntityRenderer) entityRenderer).mwc$setPrepareTerrain(false);

        entityRenderer.updateRenderer();

        entityRenderer.renderWorld(renderTickEvent.renderTickTime, renderEndTimeNano + (1000000000 / 60));

        if (PostProcessPipeline.shouldDoFog()) {
            // Blits onto custom scope depth texture
            // Todo: Just use a depth-texture compatible framebuffer w/ the scope. more efficient.
            PostProcessPipeline.blitScopeDepthTexture(framebuffer);
        }

//        PostProcessPipeline.blitDepth();
//        PostProcessPipeline.setupDistortionBufferEffects();
//        PostProcessPipeline.doWorldProcessing();

        MC.getFramebuffer().bindFramebuffer(true);

        MC.displayWidth = originalDisplayWidth;
        MC.displayHeight = originalDisplayHeight;

        renderEndTimeNano = System.nanoTime();

        ClientProxy.renderingPhase = RenderingPhase.NORMAL;
    }
}
