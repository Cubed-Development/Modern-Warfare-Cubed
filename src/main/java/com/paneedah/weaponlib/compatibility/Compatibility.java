package com.paneedah.weaponlib.compatibility;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;

import java.util.List;

@Deprecated
public interface Compatibility {

    boolean isBlockPenetrableByBullets(IBlockState blockState);

    int consumeItemsFromPlayerInventory(List<? extends Item> items, int amount, EntityPlayer player);
}
