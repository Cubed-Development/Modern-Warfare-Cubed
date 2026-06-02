package com.paneedah.weaponlib.grenade;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class EntityGrenadeRenderer extends Render<Entity> {

    //private ModelBase model = new CameraModel();
    //private ResourceLocation textureLocation;

    public EntityGrenadeRenderer() {
        super(MC.getRenderManager());
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float tick) {

        AbstractEntityGrenade entityGrenade = (AbstractEntityGrenade) entity;
        ItemGrenade itemGrenade = entityGrenade.getItemGrenade();

        if (itemGrenade == null) {
            return;
        }

        GrenadeRenderer renderer = itemGrenade.getRenderer();

        MC.renderEngine.bindTexture(
                new ResourceLocation(ID, // TODO: init entity with mod context
                        "textures/models/" + itemGrenade.getTextureName()));

        ModelBase model = renderer.getModel();
        GlStateManager.pushMatrix();

        GlStateManager.translate(x, y, z);

        float rotationOffsetX = renderer.getXRotationCenterOffset().get(); //0.13f;
        float rotationOffsetY = renderer.getYRotationCenterOffset().get(); //0.12f;
        float rotationOffsetZ = renderer.getZRotationCenterOffset().get(); //0.13f;

        GlStateManager.translate(rotationOffsetX, rotationOffsetY, rotationOffsetZ);

        GlStateManager.rotate(entityGrenade.getRotation().x, 1f, 0f, 0f);
        GlStateManager.rotate(entityGrenade.getRotation().y - entityGrenade.getInitialYaw() - 90f, 0f, 1f, 0f); // TODO Why do we do initalYaw - 90f?
        GlStateManager.rotate(entityGrenade.getRotation().z, 0f, 0f, 1f);

        GlStateManager.translate(-rotationOffsetX, -rotationOffsetY, -rotationOffsetZ);

        renderer.getThrownEntityPositioning().run();

        GlStateManager.disableCull();
        model.render(entity, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.08F);

        GlStateManager.popMatrix();
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return null; //textureLocation;
    }
}
