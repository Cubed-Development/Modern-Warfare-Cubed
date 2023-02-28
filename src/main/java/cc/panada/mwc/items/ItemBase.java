package cc.panada.mwc.items;

import cc.panada.mwc.MWC;
import cc.panada.mwc.init.ModItems;
import cc.panada.mwc.utils.IHasModel;
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
