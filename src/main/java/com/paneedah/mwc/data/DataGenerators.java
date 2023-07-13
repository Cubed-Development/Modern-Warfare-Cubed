package com.paneedah.mwc.data;

import com.paneedah.mwc.ModernWarfare;
import com.paneedah.mwc.data.generators.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.Set;

@Mod.EventBusSubscriber(modid = ModernWarfare.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new RecipeGen(packOutput));
        generator.addProvider(true, new LootTableProvider(packOutput, Set.of(), List.of(new LootTableProvider.SubProviderEntry(BlockLootGen::new, LootContextParamSets.BLOCK))));
        generator.addProvider(true, new BlockStateGen(packOutput, fileHelper));
        generator.addProvider(true, new ItemModelGen(packOutput, fileHelper));
        generator.addProvider(true, new LangGen(packOutput));
    }
}
