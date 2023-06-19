package com.paneedah.mwc.equipment.inventory;

import com.paneedah.mwc.items.equipment.ItemCarryableStorage;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class CarryableStorageSlot extends Slot {

    private final Predicate<Item> validItemPredicate;

    public CarryableStorageSlot(final CarryableStorageInventory carryableStorageInventory, final int index, final int x, final int y) {
        super(carryableStorageInventory, index, x, y);

        validItemPredicate = carryableStorageInventory.getOwner().getValidItemPredicate();
    }

    @Override
    public boolean isItemValid(final ItemStack itemStack) {
        return !(itemStack.getItem() instanceof ItemCarryableStorage) && validItemPredicate.test(itemStack.getItem());
    }
}
