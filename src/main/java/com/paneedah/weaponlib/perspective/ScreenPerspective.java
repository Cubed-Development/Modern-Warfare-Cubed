package com.paneedah.weaponlib.perspective;

import com.paneedah.weaponlib.RenderableState;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.opengl.ARBFramebufferObject;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public abstract class ScreenPerspective extends Perspective<RenderableState> {

    public ScreenPerspective() {
        this.width = 427; //mc.displayWidth >> 1;
        this.height = 240; //mc.displayHeight >> 1;
    }

    @Override
    public void update(TickEvent.RenderTickEvent event) {
    	//if(true) return;
        int originalFramebufferId = GlStateManager.glGetInteger(ARBFramebufferObject.GL_FRAMEBUFFER_BINDING);
        
        GL11.glPushMatrix();
        GL11.glPushAttrib(GL11.GL_ENABLE_BIT | GL11.GL_CURRENT_BIT);
        //mc.entityRenderer.disableLightmap();
        enable2DRenderingMode(427, 240);
        
        framebuffer.framebufferClear();
        framebuffer.bindFramebuffer(true);
        
        drawScreen();

        restoreRenderingMode();
  
        //mc.entityRenderer.enableLightmap();
        GL11.glPopAttrib();
        GL11.glPopMatrix();

        if (OpenGlHelper.isFramebufferEnabled()) {
            OpenGlHelper.glBindFramebuffer(OpenGlHelper.GL_FRAMEBUFFER, originalFramebufferId);
            GlStateManager.viewport(0, 0, mc.getFramebuffer().framebufferWidth, mc.getFramebuffer().framebufferHeight);
        }
    }

    protected abstract void drawScreen();

    
    private void enable2DRenderingMode(double projectionWidth, double projectionHeight) {
        //GL11.glClear(GL11.GL_DEPTH_BUFFER_BIT);
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0D, projectionWidth, projectionHeight, 0, -1, 1); //0.0D, 1000.0D, 3000.0D);
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        //GL11.glTranslatef(0.0F, 0.0F, -2000.0F);
    }

    private void restoreRenderingMode() {
        GL11.glMatrixMode(GL11.GL_PROJECTION);
        GL11.glPopMatrix();   
        GL11.glMatrixMode(GL11.GL_MODELVIEW);
        GL11.glPopMatrix();

    }
}
