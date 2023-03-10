package com.paneedah.mw.ores;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockSulfurOre extends Block {
    
    public BlockSulfurOre() {
        super(Material.ROCK);

        setTranslationKey(ModReference.id + "_" + "SulfurOre");
        //setBlockTextureName(ModReference.MWC_ID + ":" + "sulfurore");
        setHardness(6F);
        setResistance(15F);
        setSoundType(SoundType.STONE); 
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Ores.SulfurDust;
    }

    public int quantityDropped(Random random) {
        return 4;
    }
}
