package com.paneedah.mwc.init;

import com.paneedah.weaponlib.crafting.CraftingFileManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.paneedah.mwc.utils.ModReference.ID;

@Mod.EventBusSubscriber(modid =ID)
public class MWCRecipes {
    public static void register() {
        // Smelting Recipes not supported by JSON.

        GameRegistry.addSmelting(MWCBlocks.copperOre, new ItemStack(MWCItems.copperIngot), 3f);
        GameRegistry.addSmelting(MWCBlocks.leadOre, new ItemStack(MWCItems.leadIngot), 2f);
        GameRegistry.addSmelting(MWCBlocks.tinOre, new ItemStack(MWCItems.tinIngot), 3f);
        GameRegistry.addSmelting(MWCItems.gunmetalComposite, new ItemStack(MWCItems.gunmetalIngot), 5f);
        GameRegistry.addSmelting(MWCItems.steelDust, new ItemStack(MWCItems.steelIngot), 1f);
        GameRegistry.addSmelting(MWCItems.sulfurDust, new ItemStack(Items.GUNPOWDER), 0.7f);
        GameRegistry.addSmelting(Items.COAL, new ItemStack(MWCItems.graphiteChunk), 2f);
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<IRecipe> itemRegistryEvent) {
        CraftingFileManager.getInstance().loadDirectory();
    }
}
