package net.lavender.lavsdelight.datagen.world.features;

import net.lavender.lavsdelight.LavsDelight;
import net.lavender.lavsdelight.common.block.LDBlocks;
import net.lavender.lavsdelight.datagen.tree.custom.SmallTreeFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.random.SimpleWeightedRandomList;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.ThreeLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.WeightedStateProvider;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> HALITE_KEY = registerKey("halite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> OCEAN_HALITE_KEY = registerKey("ocean_halite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEP_OCEAN_HALITE_KEY = registerKey("deep_ocean_halite");
    public static final ResourceKey<ConfiguredFeature<?, ?>> IRON_RICH_GRAVEL_KEY = registerKey("iron_rich_gravel");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PEACH_KEY = registerKey("peach");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LEMON_KEY = registerKey("lemon");
    public static final ResourceKey<ConfiguredFeature<?, ?>> LAVENDER_KEY = registerKey("lavender");
    public static final ResourceKey<ConfiguredFeature<?, ?>> MOUNTAIN_LAVENDER_KEY = registerKey("mountain_lavender");


  //  public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_SAPPHIRE_ORE_KEY = registerKey("nether_sapphire_ore");
  //  public static final ResourceKey<ConfiguredFeature<?, ?>> END_SAPPHIRE_ORE_KEY = registerKey("end_sapphire_ore");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest gravelReplaceables = new BlockMatchTest(Blocks.GRAVEL);
        RuleTest sandReplaceables = new BlockMatchTest(Blocks.SAND);

        //list callers

      //  List<OreConfiguration.TargetBlockState> overworldCarbonatedRockOres = List.of(
          //      OreConfiguration.target(stoneReplaceable, BlockInit.CARBONATED_ROCK_ORE.get().defaultBlockState()),
            //    OreConfiguration.target(deepslateReplaceables, BlockInit.CARBONATED_ROCK_ORE.get().defaultBlockState()));

     //   register(context, OVERWORLD_CARBONATED_ROCK_KEY, Feature.ORE, new OreConfiguration(overworldCarbonatedRockOres, 10));


        //single method callers

        //configuration refers to how many VEINS are placed per chunk

        register(context, HALITE_KEY, Feature.ORE, new OreConfiguration(sandReplaceables,
                LDBlocks.HALITE.get().defaultBlockState(), 9));

        register(context, IRON_RICH_GRAVEL_KEY, Feature.ORE, new OreConfiguration(gravelReplaceables,
                LDBlocks.IRON_RICH_GRAVEL.get().defaultBlockState(), 16));

        register(context, OCEAN_HALITE_KEY, Feature.ORE, new OreConfiguration(sandReplaceables,
                LDBlocks.HALITE.get().defaultBlockState(), 11));

        register(context, DEEP_OCEAN_HALITE_KEY, Feature.ORE, new OreConfiguration(sandReplaceables,
                LDBlocks.HALITE.get().defaultBlockState(), 16));

        register(context, LAVENDER_KEY, Feature.FLOWER,
                new RandomPatchConfiguration(124,6,3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(LDBlocks.LAVENDER.get())))));

        register(context, PEACH_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(LDBlocks.PEACH_LOG.get()),
                new StraightTrunkPlacer(2, 1, 1),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(LDBlocks.PEACH_LEAVES.get().defaultBlockState(), 5)
                        .add(LDBlocks.BLOSSOMING_PEACH_LEAVES.get().defaultBlockState(),1)),
                new SmallTreeFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, LEMON_KEY, Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
                BlockStateProvider.simple(LDBlocks.LEMON_LOG.get()),
                new StraightTrunkPlacer(2, 1, 0),
                new WeightedStateProvider(SimpleWeightedRandomList.<BlockState>builder().add(LDBlocks.LEMON_LEAVES.get().defaultBlockState(), 5)
                        .add(LDBlocks.BLOSSOMING_LEMON_LEAVES.get().defaultBlockState(),2)),
                new SmallTreeFoliagePlacer(ConstantInt.of(2), ConstantInt.of(1), 3),
                new TwoLayersFeatureSize(1, 0, 2)).build());



//BlockStateProvider.simple(LDBlocks.LEMON_LEAVES.get()),
    }

    /*
    use when needed

    register(context, NETHER_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(netherrackReplacables,
      BlockInit.NETHER_SAPPHIRE_ORE.get().defaultBlockState(), 9));

    register(context, END_SAPPHIRE_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceables,
     BlockInit.END_STONE_SAPPHIRE_ORE.get().defaultBlockState(), 9));

    */



    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(LavsDelight.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}