package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.proxies.ClientProxy;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.Container;

import java.io.IOException;

public abstract class CompatibleGuiContainer extends GuiContainer {

    public CompatibleGuiContainer(Container inventorySlotsIn) {
        super(inventorySlotsIn);
    }
    
    public static void renderEntityWithPosYaw(EntityLivingBase entity, double x, double y, double z, float yaw,
            float partialTicks) {
        ClientProxy.mc.getRenderManager().renderEntity(entity, x, y, z, yaw, partialTicks, true);
    }
    
    /**
     * Copied straight out of vanilla - renders the player model on screen
     */
    public static void drawPlayerModel(int x, int y, int scale, float yaw, float pitch, EntityLivingBase entity) {
        /*
    	GL11.glEnable(GL11.GL_COLOR_MATERIAL);
        GL11.glPushMatrix();
        GL11.glTranslatef(x, y, 50.0F);
        GL11.glScalef(-scale, scale, scale);
        GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
        float f2 = entity.renderYawOffset;
        float f3 = entity.rotationYaw;
        float f4 = entity.rotationPitch;
        float f5 = entity.prevRotationYawHead;
        float f6 = entity.rotationYawHead;
        GL11.glRotatef(135.0F, 0.0F, 1.0F, 0.0F);
        RenderHelper.enableStandardItemLighting();
        GL11.glRotatef(-135.0F, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-((float) Math.atan(pitch / 40.0F)) * 20.0F, 1.0F, 0.0F, 0.0F);
        entity.renderYawOffset = (float) Math.atan(yaw / 40.0F) * 20.0F;
        entity.rotationYaw = (float) Math.atan(yaw / 40.0F) * 40.0F;
        entity.rotationPitch = -((float) Math.atan(pitch / 40.0F)) * 20.0F;
        entity.rotationYawHead = entity.rotationYaw;
        entity.prevRotationYawHead = entity.rotationYaw;
        GL11.glTranslatef(0.0F, (float)compatibility.getEntityYOffset(entity), 0.0F);
        
        setPlayerViewY(180f);
        renderEntityWithPosYaw(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F);
        
        entity.renderYawOffset = f2;
        entity.rotationYaw = f3;
        entity.rotationPitch = f4;
        entity.prevRotationYawHead = f5;
        entity.rotationYawHead = f6;
        GL11.glPopMatrix();
        RenderHelper.disableStandardItemLighting();
        //GlStateManager.disableRescaleNormal();
        GlStateManager.color(1, 1, 1, 1);
        */
    	 GlStateManager.enableColorMaterial();
         GlStateManager.pushMatrix();
         GlStateManager.translate((float)x, (float)y, 50.0F);
         GlStateManager.scale((float)(-scale), (float)scale, (float)scale);
         GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
         float f = entity.renderYawOffset;
         float f1 = entity.rotationYaw;
         float f2 = entity.rotationPitch;
         float f3 = entity.prevRotationYawHead;
         float f4 = entity.rotationYawHead;
         GlStateManager.rotate(135.0F, 0.0F, 1.0F, 0.0F);
         RenderHelper.enableStandardItemLighting();
         GlStateManager.rotate(-135.0F, 0.0F, 1.0F, 0.0F);
         GlStateManager.rotate(-((float)Math.atan((double)(pitch / 40.0F))) * 20.0F, 1.0F, 0.0F, 0.0F);
         entity.renderYawOffset = (float)Math.atan((double)(yaw / 40.0F)) * 20.0F;
         entity.rotationYaw = (float)Math.atan((double)(yaw / 40.0F)) * 40.0F;
         entity.rotationPitch = -((float)Math.atan((double)(pitch / 40.0F))) * 20.0F;
         entity.rotationYawHead = entity.rotationYaw;
         entity.prevRotationYawHead = entity.rotationYaw;
         GlStateManager.translate(0.0F, 0.0F, 0.0F);
         RenderManager rendermanager = ClientProxy.mc.getRenderManager();
         rendermanager.setPlayerViewY(180.0F);
         rendermanager.setRenderShadow(false);
         rendermanager.renderEntity(entity, 0.0D, 0.0D, 0.0D, 0.0F, 1.0F, false);
         rendermanager.setRenderShadow(true);
         entity.renderYawOffset = f;
         entity.rotationYaw = f1;
         entity.rotationPitch = f2;
         entity.prevRotationYawHead = f3;
         entity.rotationYawHead = f4;
         GlStateManager.popMatrix();
         RenderHelper.disableStandardItemLighting();
         GlStateManager.disableRescaleNormal();
         GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
         GlStateManager.disableTexture2D();
         GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
        
        /*
        RenderHelper.disableStandardItemLighting();
        GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        OpenGlHelper.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.enableTexture2D();
        OpenGlHelper.setActiveTexture(OpenGlHelper.defaultTexUnit);
   		*/
    }

    protected static void setPlayerViewY(float f) {
        ClientProxy.mc.getRenderManager().playerViewY = 180.0F;
    }
    
    @Override
    protected final void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        compatibleMouseClicked(mouseX, mouseY, mouseButton);
    }

    protected void compatibleMouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        super.mouseClicked(mouseX, mouseY, mouseButton);
    }
}
