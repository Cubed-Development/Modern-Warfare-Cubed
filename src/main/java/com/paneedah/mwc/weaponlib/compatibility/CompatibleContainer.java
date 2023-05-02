package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public abstract class CompatibleContainer extends Container {

    public void onTakeFromSlot(Slot slot, EntityPlayer player, ItemStack stack) {
        slot.onTake(player, stack);
    }
    
}
