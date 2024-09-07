package net.lavender.lavsdelight.datagen.world.features;

import net.lavender.lavsdelight.LavsDelight;
import net.lavender.lavsdelight.common.block.LDBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final ResourceKey<PlacedFeature> HALITE_KEY = registerKey("halite_placed");
    public static final ResourceKey<PlacedFeature> OCEAN_HALITE_KEY = registerKey("ocean_halite_placed");
    public static final ResourceKey<PlacedFeature> DEEP_OCEAN_HALITE_KEY = registerKey("deep_ocean_halite_placed");
    public static final ResourceKey<PlacedFeature> IRON_RICH_GRAVEL_KEY = registerKey("iron_rich_gravel_placed");
    public static final ResourceKey<PlacedFeature> PEACH_TREE_KEY = registerKey("peach_placed");
    public static final ResourceKey<PlacedFeature> LAVENDER_KEY = registerKey("lavender_key");
    public static final ResourceKey<PlacedFeature> MOUNTAIN_LAVENDER_KEY = registerKey("mountain_lavender_key");

    //placement refers to how many blocks are placed per vein
    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);


        register(context, LAVENDER_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.LAVENDER_KEY),
                List.of(RarityFilter.onAverageOnceEvery(32), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, HALITE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.HALITE_KEY),
                ModOrePlacement.commonOrePlacement(11,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(64))));

        register(context, OCEAN_HALITE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.OCEAN_HALITE_KEY),
                ModOrePlacement.commonOrePlacement(13,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-10), VerticalAnchor.absolute(60))));

        register(context, DEEP_OCEAN_HALITE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEP_OCEAN_HALITE_KEY),
                ModOrePlacement.commonOrePlacement(14,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(-20), VerticalAnchor.absolute(60))));

        register(context, IRON_RICH_GRAVEL_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.IRON_RICH_GRAVEL_KEY),
                ModOrePlacement.commonOrePlacement(13,
                        HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(120))));

        register(context, PEACH_TREE_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEACH_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(1, 0.01f, 1),
                        LDBlocks.PEACH_PIT.get()));

    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(LavsDelight.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}