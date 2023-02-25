package cc.panada.MWC.Items;

import cc.panada.MWC.MWC;
import cc.panada.MWC.Utils.IHasModel;
import cc.panada.MWC.init.ModItems;
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
