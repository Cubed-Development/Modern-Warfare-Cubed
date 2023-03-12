package com.paneedah.mwc.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MwRecipes {
    public static void register() {
        // Smelting Recipes not supported by JSON.

        GameRegistry.addSmelting(MwBlocks.copperOre, new ItemStack(MwItems.copperIngot), 5f);
        GameRegistry.addSmelting(MwBlocks.leadOre, new ItemStack(MwItems.leadIngot), 5f);
        GameRegistry.addSmelting(MwBlocks.tinOre, new ItemStack(MwItems.tinIngot), 5f);
        GameRegistry.addSmelting(MwItems.gunmetalComposite, new ItemStack(MwItems.gunmetalIngot), 5f);
        GameRegistry.addSmelting(MwItems.steelDust, new ItemStack(MwItems.steelIngot), 1f);
        GameRegistry.addSmelting(Items.COAL, new ItemStack(MwItems.graphiteChunk), 3f);
    }
}
