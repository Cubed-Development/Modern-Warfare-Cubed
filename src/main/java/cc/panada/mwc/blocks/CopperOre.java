package cc.panada.mwc.blocks;

import cc.panada.mwc.main.MainRegistry;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class CopperOre extends BlockOre {

    public CopperOre() {
        setHardness(3.0F);
        setResistance(5.0F);

        setRegistryName("copper_ore");
        setTranslationKey("copper_ore");

        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MainRegistry.resourceTab);

        MainRegistry.blocks.add(this);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.BED;
    }
}
