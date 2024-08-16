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
        this.renderEndNanoTime = System.nanoTime();
        this.width = MC.displayWidth;
        this.height = MC.displayHeight;
    }

    protected void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
        ClientProxy.renderingPhase = RenderingPhase.RENDER_PERSPECTIVE;
        long p_78471_2_ = this.renderEndNanoTime + (long) (1000000000 / 60);
        int origDisplayWidth = MC.displayWidth;
        int origDisplayHeight = MC.displayHeight;

        //RenderGlobal origRenderGlobal = MC.renderGlobal;
        EntityRenderer origEntityRenderer = MC.entityRenderer;

        framebuffer.bindFramebuffer(true);


        MC.displayWidth = width;
        MC.displayHeight = height;

        MC.entityRenderer = this.entityRenderer;

        //MC.renderGlobal = this.renderGlobal;
        //MC.effectRenderer = this.effectRenderer;

        this.entityRenderer.setPrepareTerrain(false);
        this.entityRenderer.updateRenderer();


        prepareRenderWorld(event);


        this.entityRenderer.renderWorld(event.renderTickTime, p_78471_2_);

        if (PostProcessPipeline.shouldDoFog()) {
            // Blits onto custom scope depth texture
            // TO-DO: Just use a depth-texture compatible framebuffer w/ the scope. more efficient.
            PostProcessPipeline.blitScopeDepthTexture(framebuffer);
        }


//PostProcessPipeline.blitDepth();

        //	PostProcessPipeline.setupDistortionBufferEffects();

        //PostProcessPipeline.doWorldProcessing();


        postRenderWorld(event);
        
        
       
       

       /*
        GlStateManager.pushMatrix();
        EntityPlayer p = MC.player;
        GlStateManager.translate(-p.posX, -p.posY, -p.posZ);
        GlStateManager.disableCull();
        GlStateManager.disableAlpha();
//       / GlStateManager.disableDepth();
        GlStateManager.disableTexture2D();
       
        Tessellator t = Tessellator.getInstance();
        BufferBuilder bb = t.getBuffer();
        bb.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION);
        
        double nX = 0;
        double nY = 0;
        double nZ = 0;
        
        bb.pos(0+nX, 0+nY, nZ).endVertex();
        bb.pos(0+nX, 10+nY, nZ).endVertex();
        bb.pos(10+nX, 10+nY, nZ).endVertex();
        bb.pos(10+nX, 0+nY, nZ).endVertex();
        t.draw();
        GlStateManager.popMatrix();
        */

        //MC.renderGlobal = origRenderGlobal;
        //MC.effectRenderer = origEffectRenderer;
        MC.entityRenderer = origEntityRenderer;

        MC.getFramebuffer().bindFramebuffer(true);
        MC.displayWidth = origDisplayWidth;
        MC.displayHeight = origDisplayHeight;
        this.renderEndNanoTime = System.nanoTime();


        ClientProxy.renderingPhase = RenderingPhase.NORMAL;
    }

    protected void prepareRenderWorld(TickEvent.RenderTickEvent event) {
    }

    protected void postRenderWorld(TickEvent.RenderTickEvent event) {
    }

}
