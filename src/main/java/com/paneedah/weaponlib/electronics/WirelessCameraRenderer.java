package com.paneedah.weaponlib.electronics;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class WirelessCameraRenderer extends Render<Entity> {

    public WirelessCameraRenderer() {
        super(MC.getRenderManager());
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float tick) {
        EntityWirelessCamera weaponSpawnEntity = (EntityWirelessCamera) entity;
        ItemWirelessCamera camera = weaponSpawnEntity.getItem();
        if (camera == null) {
            return;
        }
        ModelBase model = camera.getModel();
        if (model != null) {
            String textureName = camera.getTextureName();
            ResourceLocation textureLocation = textureName != null ?
                    new ResourceLocation(ID + ":textures/models/" + textureName) : null;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0f, 0f, 0f);
            if (textureLocation != null) {
                bindTexture(textureLocation);
            }
            GlStateManager.translate(x, y, z);
            model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
            GlStateManager.popMatrix();
        }
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        EntityWirelessCamera camera = (EntityWirelessCamera) entity;
        ItemWirelessCamera item = camera.getItem();
        if (item != null) {
            return new ResourceLocation(ID + ":textures/models/" + item.getTextureName());
        } else {
            return null;
        }
    }
}
