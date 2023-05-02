package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

@SideOnly(Side.CLIENT)
public class CompatibleRenderBiped<T extends EntityLiving> extends RenderBiped<T> {


    public CompatibleRenderBiped(ModelBiped model, float f) {
        super(mc.getRenderManager(), model, f);
        this.addLayer(new LayerHeldItem(this));
        this.addLayer(new LayerBipedArmor(this) {
            protected void initArmor() {
                this.modelLeggings = new CompatibleModelCustomMob(0.5F, true);
                this.modelArmor = new CompatibleModelCustomMob(1.0F, true);
            }
        });
        //this.addLayer(new LayerCustomMobType(this));
    }


    @Override
    protected void preRenderCallback(T entitylivingbaseIn, float partialTickTime) {
//        if (entitylivingbaseIn.getCustomMobType() == CustomMobType.WITHER) {
//            GlStateManager.scale(1.2F, 1.2F, 1.2F);
//        }
    }

    @Override
    public void transformHeldFull3DItemLayer() {
        GL11.glTranslatef(0.09375F, 0.1875F, 0.0F);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return getCompatibleEntityTexture(entity);
    }

    protected ResourceLocation getCompatibleEntityTexture(T entity) {
        return super.getEntityTexture(entity);
    }
    
    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        prepareCompatibleRender(entity, x, y, z, entityYaw, partialTicks);
        super.doRender(entity, x, y, z, entityYaw, partialTicks);

    }

    protected void prepareCompatibleRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
    }


//    /**
//     * Returns the location of an entity's texture. Doesn't seem to be called
//     * unless you call Render.bindEntityTexture.
//     */
//    protected ResourceLocation getEntityTexture(EntityCustomMob entity) {
//        EntityConfiguration configuration = entity.getConfiguration();
//        return configuration.getTexturedModelVariants().get(entity.getVariant()).textureResource;
//    }
//    
//    @Override
//    public void doRender(EntityCustomMob entity, double x, double y, double z, float entityYaw, float partialTicks) {
//        EntityConfiguration configuration = entity.getConfiguration();
//        this.mainModel = configuration.getTexturedModelVariants().get(entity.getVariant()).model;
//        super.doRender(entity, x, y, z, entityYaw, partialTicks);
//    }
}
