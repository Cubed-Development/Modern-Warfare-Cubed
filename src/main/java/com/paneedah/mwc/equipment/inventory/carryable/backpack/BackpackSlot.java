package com.paneedah.mwc.equipment.inventory.carryable.backpack;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.function.Predicate;

public class BackpackSlot extends Slot {

    private final Predicate<Item> validItemPredicate;

    public BackpackSlot(final BackpackInventory backpackInventory, final int index, final int x, final int y) {
        super(backpackInventory, index, x, y);

        validItemPredicate = backpackInventory.getOwner().getValidItemPredicate();
    }

    @Override
    public boolean isItemValid(final ItemStack itemStack) {
        return !(itemStack.getItem() instanceof ItemBackpack) && validItemPredicate.test(itemStack.getItem());
    }
}
