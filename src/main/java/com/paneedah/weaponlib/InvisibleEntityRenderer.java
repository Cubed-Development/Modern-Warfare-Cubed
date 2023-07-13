package com.paneedah.weaponlib;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import static com.paneedah.mwc.MWC.MC;

public class InvisibleEntityRenderer extends Render<Entity> {

    protected InvisibleEntityRenderer() {
        super(MC.getRenderManager());
    }

    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float tick) {}

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }
}
