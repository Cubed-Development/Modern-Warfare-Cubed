package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CompatibleEntityItem extends EntityItem {

    public CompatibleEntityItem(World worldIn, double x, double y, double z, ItemStack stack) {
        super(worldIn, x, y, z, stack);
    }

}
