package net.lavender.lavsdelight.datagen.world.features;


import net.lavender.lavsdelight.LavsDelight;
import net.lavender.lavsdelight.datagen.tree.custom.SmallTreeFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, LavsDelight.MOD_ID);

    public static final RegistryObject<FoliagePlacerType<SmallTreeFoliagePlacer>> SMALL_TREE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("small_tree_foliage_placer", () -> new FoliagePlacerType<>(SmallTreeFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}