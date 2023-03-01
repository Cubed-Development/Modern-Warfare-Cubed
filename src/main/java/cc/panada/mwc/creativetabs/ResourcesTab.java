package cc.panada.mwc.creativetabs;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ResourcesTab extends CreativeTabs {

    public ResourcesTab(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(MainRegistry.GUNMETAL_INGOT);
    }
}
