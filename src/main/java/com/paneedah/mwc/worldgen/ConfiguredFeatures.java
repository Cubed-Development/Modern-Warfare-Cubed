package com.paneedah.mwc.worldgen;

import com.paneedah.mwc.ModernWarfareCubed;
import com.paneedah.mwc.client.ModRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> ALUMINUM_ORE = registerKey("aluminum_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE = registerKey("lead_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TITANIUM_ORE = registerKey("titanium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TUNGSTEN_ORE = registerKey("tungsten_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> URANIUM_ORE = registerKey("uranium_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GRAPHITE_ORE = registerKey("graphite_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SULFUR_ORE = registerKey("sulfur_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NITER_ORE = registerKey("niter_ore");
    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> aluminumOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.ALUMINUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.ALUMINUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> leadOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.LEAD_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.LEAD_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> titaniumOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.TITANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.TITANIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> tungstenOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.TUNGSTEN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.TUNGSTEN_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> uraniumOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.URANIUM_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.URANIUM_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> graphiteOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.GRAPHITE_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.GRAPHITE_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> niterOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.NITER_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.NITER_ORE.get().defaultBlockState()));
        List<OreConfiguration.TargetBlockState> sulfurOre = List.of(OreConfiguration.target(stoneReplaceables, ModRegistry.SULFUR_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModRegistry.SULFUR_ORE.get().defaultBlockState()));

        register(context, ALUMINUM_ORE, Feature.ORE, new OreConfiguration(aluminumOre, 8));
        register(context, LEAD_ORE, Feature.ORE, new OreConfiguration(leadOre, 6));
        register(context, TITANIUM_ORE, Feature.ORE, new OreConfiguration(titaniumOre, 4));
        register(context, TUNGSTEN_ORE, Feature.ORE, new OreConfiguration(tungstenOre, 3));
        register(context, URANIUM_ORE, Feature.ORE, new OreConfiguration(uraniumOre, 5));
        register(context, GRAPHITE_ORE, Feature.ORE, new OreConfiguration(graphiteOre, 6));
        register(context, SULFUR_ORE, Feature.ORE, new OreConfiguration(sulfurOre, 5));
        register(context, NITER_ORE, Feature.ORE, new OreConfiguration(niterOre, 7));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(ModernWarfareCubed.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
