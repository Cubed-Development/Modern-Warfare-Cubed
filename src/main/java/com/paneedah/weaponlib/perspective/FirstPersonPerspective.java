package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.RenderingPhase;
import com.paneedah.weaponlib.render.bgl.PostProcessPipeline;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class FirstPersonPerspective<S> extends Perspective<S> {

    private long renderEndNanoTime;

    public FirstPersonPerspective() {
        this.renderEndNanoTime = System.nanoTime();
        this.width = mc.displayWidth;
        this.height = mc.displayHeight;
    }
    
    protected void setSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
        modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.RENDER_PERSPECTIVE);
        long p_78471_2_ = this.renderEndNanoTime + (long)(1000000000 / 60);
        int origDisplayWidth = mc.displayWidth;
        int origDisplayHeight = mc.displayHeight;

        //RenderGlobal origRenderGlobal = mc.renderGlobal;
        EntityRenderer origEntityRenderer = mc.entityRenderer;

        framebuffer.bindFramebuffer(true);

        
       
        mc.displayWidth = width;
        mc.displayHeight = height;

        mc.entityRenderer = this.entityRenderer;

        //mc.renderGlobal = this.renderGlobal;
        //mc.effectRenderer = this.effectRenderer;

        this.entityRenderer.setPrepareTerrain(false);
        this.entityRenderer.updateRenderer();

        
       
        
        prepareRenderWorld(event);
       
        
       
        this.entityRenderer.renderWorld(event.renderTickTime, p_78471_2_);
     
        if(PostProcessPipeline.shouldDoFog()) {
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
        EntityPlayer p = mc.player;
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
        
        //mc.renderGlobal = origRenderGlobal;
        //mc.effectRenderer = origEffectRenderer;
        mc.entityRenderer = origEntityRenderer;

        mc.getFramebuffer().bindFramebuffer(true);
        mc.displayWidth = origDisplayWidth;
        mc.displayHeight = origDisplayHeight;
        this.renderEndNanoTime = System.nanoTime();
        
       
        
        modContext.getSafeGlobals().renderingPhase.set(RenderingPhase.NORMAL);
    }

    protected void prepareRenderWorld(TickEvent.RenderTickEvent event) {
    }

    protected void postRenderWorld(TickEvent.RenderTickEvent event) {
    }

}
