package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.ItemCarryableInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class StorageSlot extends Slot {

    private Predicate<Item> validItemPredicate;

    public StorageSlot(StorageInventory inv, int index, int xPos, int yPos) {
        super(inv, index, xPos, yPos);
        this.validItemPredicate = inv.getItemCarryableInventory().getValidItemPredicate();
    }

    @Override
    public boolean isItemValid(ItemStack itemstack) {
        return !(itemstack.getItem() instanceof ItemCarryableInventory) && validItemPredicate.test(itemstack.getItem());
    }

    @Override
    public void onSlotChanged() {
        super.onSlotChanged();
    }
}
