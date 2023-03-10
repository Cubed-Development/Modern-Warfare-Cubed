package com.paneedah.weaponlib.ai;

import com.paneedah.weaponlib.compatibility.CompatibleRenderBiped;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.util.ResourceLocation;

public class RenderCustomMob extends CompatibleRenderBiped<EntityCustomMob> {

    //private ResourceLocation texture;

    public RenderCustomMob(ModelBiped model) {
        super(model, 0.5F);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called
     * unless you call Render.bindEntityTexture.
     */
    @Override
    protected ResourceLocation getCompatibleEntityTexture(EntityCustomMob entity) {
        EntityConfiguration configuration = entity.getConfiguration();
        return configuration.getTexturedModelVariants().get(entity.getVariant()).textureResource;
    }
    
    @Override
    public void prepareCompatibleRender(EntityCustomMob entity, double x, double y, double z, float entityYaw, float partialTicks) {
        EntityConfiguration configuration = entity.getConfiguration();
        this.mainModel = configuration.getTexturedModelVariants().get(entity.getVariant()).model;
    }
}