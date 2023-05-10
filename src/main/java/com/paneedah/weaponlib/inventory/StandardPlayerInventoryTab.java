package com.paneedah.weaponlib.inventory;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class StandardPlayerInventoryTab extends InventoryTab {
    public StandardPlayerInventoryTab() {
        super(0, 0, 0, new ItemStack(Blocks.CRAFTING_TABLE));
    }

    @Override
    public void onTabClicked() {
        InventoryTabs.getInstance().openInventoryGui();
    }

    @Override
    public boolean shouldAddToList() {
        return true;
    }
}
