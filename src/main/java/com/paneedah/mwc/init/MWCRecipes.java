package com.paneedah.mwc.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MWCRecipes {
    public static void register() {
        // Smelting Recipes not supported by JSON.

        GameRegistry.addSmelting(MWCBlocks.copperOre, new ItemStack(MWCItems.copperIngot), 5f);
        GameRegistry.addSmelting(MWCBlocks.leadOre, new ItemStack(MWCItems.leadIngot), 5f);
        GameRegistry.addSmelting(MWCBlocks.tinOre, new ItemStack(MWCItems.tinIngot), 5f);
        GameRegistry.addSmelting(MWCItems.gunmetalComposite, new ItemStack(MWCItems.gunmetalIngot), 5f);
        GameRegistry.addSmelting(MWCItems.steelDust, new ItemStack(MWCItems.steelIngot), 1f);
        GameRegistry.addSmelting(Items.COAL, new ItemStack(MWCItems.graphiteChunk), 3f);
    }
}
