package cc.panada.mwc.other;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

public class ItemBase extends Item {

    public ItemBase(@NotNull final String name, @NotNull final CreativeTabs creativeTabs) {
        super();
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(creativeTabs);

        MainRegistry.items.add(this);
    }
}
