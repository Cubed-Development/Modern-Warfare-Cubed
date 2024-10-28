package com.paneedah.mwc.bases;

import com.paneedah.mwc.MWC;
import lombok.Setter;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class OreBase extends BlockOre {

    Item itemBlock, drop;
    @Setter
    int harvestLevel = 2, minDrop = 1, maxDrop = 1;
    boolean smelt = true;

    public OreBase(String registryName) {
        setRegistryName(registryName);
        setTranslationKey(registryName);

        setHardness(6F);
        setResistance(15F);
        setHarvestLevel("pickaxe", harvestLevel);
        setCreativeTab(MWC.BLOCKS_AND_INGOTS_TAB);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        itemBlock = Item.getItemFromBlock(this);
        //If the block is smelt-able (i.e like gold or iron) then drop the block itself, otherwise drop the designated drop.
        if (smelt) {
            if (drop != null) {
                LOGGER.warn("Block {} is smeltable but does not drop itself!", getRegistryName());
            }
            return itemBlock;
        } else {
            return drop;
        }
    }

    @Override
    public int quantityDropped(Random random) {
        int i = 0;
        if (maxDrop - minDrop > 0) {
            i = random.nextInt(maxDrop - minDrop);
        }
        return smelt ? 1 : minDrop + i;
    }

    public void setItemDropped(Item item) {
        drop = item;
    }

    public void isSmeltable(boolean smeltable) {
        smelt = smeltable;
    }

    // Random chance between minDrop and maxDrop amounts
    public void setDropAmount(int minDrop, int maxDrop) {
        this.minDrop = minDrop;
        this.maxDrop = maxDrop;
    }

    //Set amount of dropped items.
    public void setDropAmount(int dropChance) {
        minDrop = dropChance;
        maxDrop = dropChance;
    }
}
