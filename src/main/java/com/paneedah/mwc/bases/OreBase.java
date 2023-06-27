package com.paneedah.mwc.bases;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class OreBase extends BlockOre {

    Item itemBlock, drop;
    int harvestLevel = 2, minDrop = 1, maxDrop = 1;
    boolean smelt = true;

    public OreBase(String registryName) {
        setRegistryName(registryName);
        setTranslationKey(registryName);

        setHardness(6F);
        setResistance(15F);
        setHarvestLevel("pickaxe", harvestLevel);
        setCreativeTab(MWC.BLOCKS_TAB);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        itemBlock = Item.getItemFromBlock(this);
        //If the block is smelt-able (i.e like gold or iron) then drop the block itself, otherwise drop the designated drop.
        if(this.smelt) {
            if(this.drop != null) ModReference.LOG.warn("Block " + this.getRegistryName() + " is smeltable but does not drop itself!");
            return itemBlock;
        } else {
            return this.drop;
        }
    }

    @Override
    public int quantityDropped(Random random) {
        int i = 0;
        if(this.maxDrop - this.minDrop > 0) i = random.nextInt(this.maxDrop - this.minDrop);
        return this.smelt ? 1 : this.minDrop + i;
    }

    public void setHarvestLevel(int harvestLevel) {
        this.harvestLevel = harvestLevel;
    }

    public void setItemDropped(Item item) {
        this.drop = item;
    }

    public void isSmeltable(boolean smeltable)  {
        this.smelt = smeltable;
    }

    // Random chance between minDrop and maxDrop amounts
    public void setDropAmount(int minDrop, int maxDrop){
        this.minDrop = minDrop;
        this.maxDrop = maxDrop;
    }

    //Set amount of dropped items.
    public void setDropAmount(int dropChance){
        this.minDrop = dropChance;
        this.maxDrop = dropChance;
    }
}
