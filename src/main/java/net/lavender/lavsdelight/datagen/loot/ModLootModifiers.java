package net.lavender.lavsdelight.datagen.loot;

import com.mojang.serialization.Codec;
import net.lavender.lavsdelight.LavsDelight;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, LavsDelight.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_CHANCE_ITEM =
            LOOT_MODIFIER_SERIALIZERS.register("add_chance_item", AddChanceModifer.CODEC);


    public static void register(IEventBus eventBus) {
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}