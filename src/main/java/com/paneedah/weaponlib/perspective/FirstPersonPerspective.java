package com.paneedah.weaponlib.perspective;

import com.paneedah.mwc.proxies.ClientProxy;
import com.paneedah.weaponlib.RenderingPhase;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class FirstPersonPerspective<S> extends Perspective<S> {

    private long renderEndNanoTime;

    public FirstPersonPerspective() {
        renderEndNanoTime = System.nanoTime();
        width = MC.displayWidth;
        height = MC.displayHeight;
    }

    protected void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
        ClientProxy.renderingPhase = RenderingPhase.RENDER_PERSPECTIVE;
        long p_78471_2_ = renderEndNanoTime + (long) (1000000000 / 60);
        int origDisplayWidth = MC.displayWidth;
        int origDisplayHeight = MC.displayHeight;

        //RenderGlobal origRenderGlobal = MC.renderGlobal;
        EntityRenderer origEntityRenderer = MC.entityRenderer;

        framebuffer.bindFramebuffer(true);


        MC.displayWidth = width;
        MC.displayHeight = height;

        MC.entityRenderer = entityRenderer;

        entityRenderer.setPrepareTerrain(false);
        entityRenderer.updateRenderer();


        prepareRenderWorld(event);


        entityRenderer.renderWorld(event.renderTickTime, p_78471_2_);

        if (PostProcessPipeline.shouldDoFog()) {
            // Blits onto custom scope depth texture
            // TO-DO: Just use a depth-texture compatible framebuffer w/ the scope. more efficient.
            PostProcessPipeline.blitScopeDepthTexture(framebuffer);
        }


        postRenderWorld(event);


        MC.entityRenderer = origEntityRenderer;

        MC.getFramebuffer().bindFramebuffer(true);
        MC.displayWidth = origDisplayWidth;
        MC.displayHeight = origDisplayHeight;
        renderEndNanoTime = System.nanoTime();


        ClientProxy.renderingPhase = RenderingPhase.NORMAL;
    }

    protected void prepareRenderWorld(TickEvent.RenderTickEvent event) {
    }

    protected void postRenderWorld(TickEvent.RenderTickEvent event) {
    }

}
