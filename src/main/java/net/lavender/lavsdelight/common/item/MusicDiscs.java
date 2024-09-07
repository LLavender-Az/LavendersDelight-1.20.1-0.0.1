package net.lavender.lavsdelight.common.item;

import net.lavender.lavsdelight.LavsDelight;
import net.lavender.lavsdelight.sound.ModSounds;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MusicDiscs {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LavsDelight.MOD_ID);

    public static final RegistryObject<Item> GLOWING_MUSIC_DISC = ITEMS.register("glowing_music_disc",
            () -> new RecordItem(3, ModSounds.GLOWING_AUDIO, new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1760));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}