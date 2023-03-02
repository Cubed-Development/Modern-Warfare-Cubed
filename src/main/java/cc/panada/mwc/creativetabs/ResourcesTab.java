package cc.panada.mwc.creativetabs;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ResourcesTab extends CreativeTabs {

    public ResourcesTab(final int index, @NotNull final String label) {
        super(index, label);
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(MainRegistry.GUNMETAL_INGOT);
    }
}
