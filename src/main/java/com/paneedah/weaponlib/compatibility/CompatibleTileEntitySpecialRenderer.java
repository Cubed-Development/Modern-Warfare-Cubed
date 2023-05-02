package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class CompatibleTileEntitySpecialRenderer<T extends CompatibleTileEntity> extends TileEntitySpecialRenderer<T> {

    @Override
    public void render(T te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        super.render(te, x, y, z, partialTicks, destroyStage, alpha);
    }
}
