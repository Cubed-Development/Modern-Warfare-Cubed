package com.paneedah.mwc.bases;

import com.paneedah.mwc.MWC;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBase extends Block {

    public BlockBase(String registryName) {
        super(Material.ROCK);
        setRegistryName(registryName);
        setTranslationKey(registryName);

        setHardness(6F);
        setResistance(15F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(MWC.BLOCKS_TAB);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }

}
