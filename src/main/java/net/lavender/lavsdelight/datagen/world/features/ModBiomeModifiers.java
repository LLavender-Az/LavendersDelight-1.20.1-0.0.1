package net.lavender.lavsdelight.datagen.world.features;


import net.lavender.lavsdelight.LavsDelight;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> ADD_HALITE = registerKey("add_halite");
    public static final ResourceKey<BiomeModifier> ADD_OCEAN_HALITE = registerKey("add_ocean_halite");
    public static final ResourceKey<BiomeModifier> ADD_DEEP_OCEAN_HALITE = registerKey("add_deep_ocean_halite");
    public static final ResourceKey<BiomeModifier> ADD_IRON_RICH_GRAVEL = registerKey("add_iron_rich_gravel");
    public static final ResourceKey<BiomeModifier> ADD_PEACH_TREE = registerKey("add_peach");
    public static final ResourceKey<BiomeModifier> ADD_LAVENDER = registerKey("add_lavender");

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(ADD_LAVENDER, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_MOUNTAIN),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.LAVENDER_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));

        context.register(ADD_OCEAN_HALITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OCEAN),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.OCEAN_HALITE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_HALITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.HALITE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_DEEP_OCEAN_HALITE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_DEEP_OCEAN),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.DEEP_OCEAN_HALITE_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_IRON_RICH_GRAVEL, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.IRON_RICH_GRAVEL_KEY)),
                GenerationStep.Decoration.UNDERGROUND_ORES));

        context.register(ADD_PEACH_TREE, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_FOREST),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.PEACH_TREE_KEY)),
                GenerationStep.Decoration.VEGETAL_DECORATION));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, new ResourceLocation(LavsDelight.MOD_ID, name));
    }
}