package cc.panada.MWC.Blocks;

import cc.panada.MWC.MWC;
import cc.panada.MWC.Utils.IHasModel;
import cc.panada.MWC.init.ModBlocks;
import cc.panada.MWC.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material material, float Hardness, CreativeTabs creativeTabs) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(creativeTabs);
        setHardness(Hardness);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        MWC.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
