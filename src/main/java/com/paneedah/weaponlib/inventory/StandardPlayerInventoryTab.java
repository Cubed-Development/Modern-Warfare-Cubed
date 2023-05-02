package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.compatibility.CompatibleBlocks;
import net.minecraft.item.ItemStack;

public class StandardPlayerInventoryTab extends InventoryTab {
    public StandardPlayerInventoryTab() {
        super(0, 0, 0, new ItemStack(CompatibleBlocks.CRAFTING_TABLE.getBlock()));
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
