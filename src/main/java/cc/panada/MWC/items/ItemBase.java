package cc.panada.MWC.items;

import cc.panada.MWC.MWC;
import cc.panada.MWC.init.ModItems;
import cc.panada.MWC.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name, CreativeTabs creativeTabs)
    {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(creativeTabs);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        MWC.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
