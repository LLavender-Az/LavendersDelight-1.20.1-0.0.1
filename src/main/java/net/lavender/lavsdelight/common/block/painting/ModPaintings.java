package net.lavender.lavsdelight.common.block.painting;

import net.lavender.lavsdelight.LavsDelight;
import net.minecraft.world.entity.decoration.PaintingVariant;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModPaintings {
    public static final DeferredRegister<PaintingVariant> PAINTING_VARIANTS =
            DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, LavsDelight.MOD_ID);

    public static final RegistryObject<PaintingVariant> LD_MEDITATIVE = PAINTING_VARIANTS.register("ld_meditative",
            () -> new PaintingVariant(16, 16));

    public static final RegistryObject<PaintingVariant> LD_BAROQUE = PAINTING_VARIANTS.register("ld_baroque",
            () -> new PaintingVariant(32, 32));


    public static void register(IEventBus eventBus) {
        PAINTING_VARIANTS.register(eventBus);
    }
}