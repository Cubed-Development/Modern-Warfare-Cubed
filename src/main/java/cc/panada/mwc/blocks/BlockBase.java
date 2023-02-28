package cc.panada.mwc.blocks;

import cc.panada.mwc.MWC;
import cc.panada.mwc.init.ModBlocks;
import cc.panada.mwc.init.ModItems;
import cc.panada.mwc.utils.IHasModel;
import net.minecraft.block.Block;
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
    public void registerModels() { MWC.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory"); }
}
