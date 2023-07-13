package com.paneedah.mwc.data.generators;

import com.paneedah.mwc.ModernWarfareCubed;
import com.paneedah.mwc.client.ModRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class BlockStateGen extends BlockStateProvider {
    public BlockStateGen(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModernWarfareCubed.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModRegistry.ALUMINUM_ORE);
        blockWithItem(ModRegistry.LEAD_ORE);
        blockWithItem(ModRegistry.SULFUR_ORE);
        blockWithItem(ModRegistry.NITER_ORE);
        blockWithItem(ModRegistry.TITANIUM_ORE);
        blockWithItem(ModRegistry.TUNGSTEN_ORE);
        blockWithItem(ModRegistry.URANIUM_ORE);
        blockWithItem(ModRegistry.GRAPHITE_ORE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
