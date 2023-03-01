package cc.panada.mwc.other;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name, CreativeTabs creativeTabs) {
        super();
        setRegistryName(name);
        setTranslationKey(name);
        setCreativeTab(creativeTabs);

        MainRegistry.items.add(this);
    }
}
