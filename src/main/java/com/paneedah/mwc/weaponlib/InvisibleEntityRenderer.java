package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class InvisibleEntityRenderer extends CompatibleEntityRenderer {

    @Override
    public void doCompatibleRender(Entity entity, double x, double y, double z, float yaw, float tick) {}

    @Override
    protected ResourceLocation getEntityTexture(Entity entity) {
        return null;
    }
}
