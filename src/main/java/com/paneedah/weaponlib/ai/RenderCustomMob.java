package com.paneedah.weaponlib.ai;

import com.paneedah.weaponlib.compatibility.CompatibleModelCustomMob;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class RenderCustomMob<T extends EntityLiving> extends RenderBiped<T> {

    public RenderCustomMob(ModelBiped model) {
        super(mc.getRenderManager(), model, 0.5F);

        this.addLayer(new LayerHeldItem(this));
        this.addLayer(new LayerBipedArmor(this) {
            protected void initArmor() {
                this.modelLeggings = new CompatibleModelCustomMob(0.5F);
                this.modelArmor = new CompatibleModelCustomMob(1.0F);
            }
        });
    }

    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        EntityCustomMob entityCustomMob = (EntityCustomMob) entity;

        EntityConfiguration configuration = entityCustomMob.getConfiguration();
        this.mainModel = configuration.getTexturedModelVariants().get(entityCustomMob.getVariant()).model;

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        EntityCustomMob entityCustomMob = (EntityCustomMob) entity;

        EntityConfiguration configuration = entityCustomMob.getConfiguration();
        return configuration.getTexturedModelVariants().get(entityCustomMob.getVariant()).textureResource;
    }
}
