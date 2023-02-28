package cc.panada.mwc.gui;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ResourcesTab extends CreativeTabs {
    public ResourcesTab(int par1, String label) {
        super(par1, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}
