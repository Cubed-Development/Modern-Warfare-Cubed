package com.paneedah.mwc.worldgen;

import com.paneedah.mwc.ModernWarfareCubed;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.*;

public class PlacedFeatures {
    public static final ResourceKey<PlacedFeature> ALUMINUM_ORE_PLACED = createKey("aluminum_ore_placed");
    public static final ResourceKey<PlacedFeature> LEAD_ORE_PLACED = createKey("lead_ore_placed");
    public static final ResourceKey<PlacedFeature> GRAPHITE_ORE_PLACED = createKey("graphite_ore_placed");
    public static final ResourceKey<PlacedFeature> URANIUM_ORE_PLACED = createKey("uranium_ore_placed");
    public static final ResourceKey<PlacedFeature> TUNGSTEN_ORE_PLACED = createKey("tungsten_ore_placed");
    public static final ResourceKey<PlacedFeature> TITANIUM_ORE_PLACED = createKey("titanium_ore_placed");
    public static final ResourceKey<PlacedFeature> SULFUR_ORE_PLACED = createKey("sulfur_ore_placed");
    public static final ResourceKey<PlacedFeature> NITER_ORE_PLACED = createKey("niter_ore_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, ALUMINUM_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.ALUMINUM_ORE),
                OrePlacement.commonOrePlacement(13, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
        register(context, LEAD_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.LEAD_ORE),
                OrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
        register(context, GRAPHITE_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.GRAPHITE_ORE),
                OrePlacement.commonOrePlacement(13, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
        register(context, URANIUM_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.URANIUM_ORE),
                OrePlacement.rareOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
        register(context, TUNGSTEN_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.TUNGSTEN_ORE),
                OrePlacement.commonOrePlacement(7, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
        register(context, TITANIUM_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.TITANIUM_ORE),
                OrePlacement.rareOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
        register(context, SULFUR_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.SULFUR_ORE),
                OrePlacement.commonOrePlacement(12, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
        register(context, NITER_ORE_PLACED, configuredFeatures.getOrThrow(ConfiguredFeatures.NITER_ORE),
                OrePlacement.commonOrePlacement(14, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(30), VerticalAnchor.absolute(80))));
    }


    private static ResourceKey<PlacedFeature> createKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(ModernWarfareCubed.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
