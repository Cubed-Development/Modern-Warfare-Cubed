package com.paneedah.mwc.worldgen;

import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class OrePlacement {
    public static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    public static List<PlacementModifier> commonOrePlacement(int veinsPerChunk, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(veinsPerChunk), p_195345_);
    }

    public static List<PlacementModifier> rareOrePlacement(int veinsPerChunk, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(veinsPerChunk), p_195351_);
    }
}
