package com.paneedah.mwc.ores;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import java.util.Random;

public class BlockCopperOre extends Block {
    
    public BlockCopperOre() {
        super(Material.ROCK);

        setTranslationKey(ModReference.id + "_" + "CopperOre");
        //setBlockTextureName(ModReference.id + ":" + "copperore");
        setHardness(6F);
        setResistance(15F);
        setSoundType(SoundType.STONE); 
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ModernWarfareMod.BlocksTab);
    }
    
    public Block getBlockDropped(int meta, Random rand, int fortune) {
        return Ores.CopperOre;
    }

    public int quantityDropped(Random random) {
        return 2;
    }
}
