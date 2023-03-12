package com.paneedah.mwc;

import com.paneedah.mwc.init.MwBlocks;
import com.paneedah.mwc.init.MwItems;
import com.paneedah.weaponlib.ModContext;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class RecipeManager {

    public static void init(ModContext modContext) {
        compatibility.addSmelting(MwBlocks.copperOre, new ItemStack(MwItems.copperIngot), 5f);
        compatibility.addSmelting(MwBlocks.leadOre, new ItemStack(MwItems.leadIngot), 5f);
        compatibility.addSmelting(MwBlocks.tinOre, new ItemStack(MwItems.tinIngot), 5f);
        compatibility.addSmelting(MwItems.gunmetalComposite, new ItemStack(MwItems.gunmetalIngot), 5f);
        compatibility.addSmelting(MwItems.steelDust, new ItemStack(MwItems.steelIngot), 1f);
        compatibility.addSmelting(Items.COAL, new ItemStack(MwItems.graphiteChunk), 3f);
    }
}
