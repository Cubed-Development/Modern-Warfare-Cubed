package com.paneedah.mwc.gui.inventory;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

/**
 * The default Minecraft Inventory as one of our tabs
 */
public class StandardPlayerInventoryTab extends InventoryTab {
    public StandardPlayerInventoryTab() {
        super(0, 0, 0, new ItemStack(Blocks.CRAFTING_TABLE));
    }

    @Override
    public void onTabClicked() {
        InventoryTabHandler.getInstance().openInventoryGui();
    }
}
