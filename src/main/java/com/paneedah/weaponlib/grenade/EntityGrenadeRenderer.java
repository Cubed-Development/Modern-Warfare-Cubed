package com.paneedah.weaponlib.grenade;

import com.paneedah.mwc.utils.ModReference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class EntityGrenadeRenderer extends Render<Entity> {

    //private ModelBase model = new CameraModel();
    //private ResourceLocation textureLocation;
    //private static final String TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/gunmetaltexture.png";

    public EntityGrenadeRenderer() {
        super(mc.getRenderManager());
        //textureLocation = new ResourceLocation(TEXTURE);
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float tick) {

        AbstractEntityGrenade entityGrenade = (AbstractEntityGrenade) entity;
        ItemGrenade itemGrenade = entityGrenade.getItemGrenade();

        if(itemGrenade == null) {
            return;
        }

        GrenadeRenderer renderer = itemGrenade.getRenderer();

        mc.renderEngine.bindTexture(
                new ResourceLocation(ModReference.ID, // TODO: init entity with mod context
                "textures/models/" + itemGrenade.getTextureName()));

        ModelBase model = renderer.getModel();
        GL11.glPushMatrix();

        GL11.glTranslated(x, y, z);

        float rotationOffsetX = renderer.getXRotationCenterOffset().get(); //0.13f;
        float rotationOffsetY = renderer.getYRotationCenterOffset().get(); //0.12f;
        float rotationOffsetZ = renderer.getZRotationCenterOffset().get(); //0.13f;

        GL11.glTranslatef(rotationOffsetX, rotationOffsetY, rotationOffsetZ);
        GL11.glRotatef(entityGrenade.getXRotation(), 1f, 0f, 0f);
        GL11.glRotatef(entityGrenade.getYRotation(), 0f, 1f, 0f);
        GL11.glRotatef(entityGrenade.getZRotation(), 0f, 0f, 1f);
        GL11.glTranslatef(-rotationOffsetX, -rotationOffsetY, -rotationOffsetZ);

        renderer.getThrownEntityPositioning().run();

        GlStateManager.disableCull();
       model.render(entity, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.08F);
       
       GL11.glPopMatrix();
    }

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return null; //textureLocation;
    }
}
