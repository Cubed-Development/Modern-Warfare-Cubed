package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

@Deprecated
public class CompatibleTileEntitySpecialRenderer<T extends TileEntity> extends TileEntitySpecialRenderer<T> {

    @Override
    public void render(T te, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        super.render(te, x, y, z, partialTicks, destroyStage, alpha);
    }
}
