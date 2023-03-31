package com.paneedah.weaponlib.compatibility;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class CompatibleBlockState {

    private IBlockState blockState;

    static CompatibleBlockState fromBlockState(IBlockState blockState) {
        return blockState != null ? new CompatibleBlockState(blockState) : null;
    }

    CompatibleBlockState(IBlockState blockState) {
        this.blockState = blockState;
    }

    public IBlockState getBlockState() {
        return blockState;
    }

    public Material getMaterial() {
        return blockState.getMaterial();
    }
}
