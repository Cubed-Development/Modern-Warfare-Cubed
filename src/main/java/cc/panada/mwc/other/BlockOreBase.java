package cc.panada.mwc.other;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreBase extends BlockOre {

    private final Item itemDrop;

    public BlockOreBase(String name, Item itemDrop, float hardness, float resistance, String harvest, int harvestLevel, CreativeTabs creativeTabs) {
        setHardness(hardness);
        setResistance(resistance);

        setRegistryName(name);
        setTranslationKey(name);

        setHarvestLevel(harvest, harvestLevel);
        setCreativeTab(creativeTabs);

        this.itemDrop = itemDrop;

        MainRegistry.blocks.add(this);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return itemDrop;
    }

}
