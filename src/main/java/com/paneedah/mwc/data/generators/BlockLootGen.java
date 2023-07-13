package com.paneedah.mwc.data.generators;

import com.paneedah.mwc.client.ModRegistry;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class BlockLootGen extends BlockLootSubProvider {
    public BlockLootGen() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        add(ModRegistry.ALUMINUM_ORE.get(),
                (block) -> createOreDrop(ModRegistry.ALUMINUM_ORE.get(), ModRegistry.RAW_ALUMINUM.get()));
        add(ModRegistry.LEAD_ORE.get(),
                (block) -> createOreDrop(ModRegistry.LEAD_ORE.get(), ModRegistry.RAW_LEAD.get()));
        add(ModRegistry.SULFUR_ORE.get(),
                (block) -> createOreDrop(ModRegistry.SULFUR_ORE.get(), ModRegistry.SULFUR.get()));
        add(ModRegistry.NITER_ORE.get(),
                (block) -> createOreDrop(ModRegistry.NITER_ORE.get(), ModRegistry.RAW_POTASSIUM.get()));
        add(ModRegistry.TITANIUM_ORE.get(),
                (block) -> createOreDrop(ModRegistry.TITANIUM_ORE.get(), ModRegistry.RAW_TITANIUM.get()));
        add(ModRegistry.TUNGSTEN_ORE.get(),
                (block) -> createOreDrop(ModRegistry.TUNGSTEN_ORE.get(), ModRegistry.RAW_TUNGSTEN.get()));
        add(ModRegistry.URANIUM_ORE.get(),
                (block) -> createOreDrop(ModRegistry.URANIUM_ORE.get(), ModRegistry.RAW_URANIUM.get()));
        add(ModRegistry.GRAPHITE_ORE.get(),
                (block) -> createOreDrop(ModRegistry.GRAPHITE_ORE.get(), ModRegistry.GRAPHITE.get()));
        //this.dropSelf(Blockthing.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
