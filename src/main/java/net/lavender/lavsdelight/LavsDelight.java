package net.lavender.lavsdelight;

import com.mojang.logging.LogUtils;
import net.lavender.lavsdelight.common.Composting;
import net.lavender.lavsdelight.common.block.LDBlocks;
import net.lavender.lavsdelight.common.block.painting.ModPaintings;
import net.lavender.lavsdelight.common.item.LDItems;
import net.lavender.lavsdelight.common.item.MusicDiscs;
import net.lavender.lavsdelight.datagen.loot.ModLootModifiers;
import net.lavender.lavsdelight.datagen.world.features.ModFoliagePlacers;
import net.lavender.lavsdelight.event.ModBrewingRecipeSetup;
import net.lavender.lavsdelight.sound.ModSounds;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(LavsDelight.MOD_ID)
public class LavsDelight {
    public static final String MOD_ID = "lavsdelight";
    public static final Logger LOGGER = LogUtils.getLogger();

    public LavsDelight() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModPaintings.register(modEventBus);
        ModFoliagePlacers.register(modEventBus);
        ModLootModifiers.register(modEventBus);
        ModCreativeTab.CREATIVE_MODE_TABS.register(modEventBus);
        MusicDiscs.ITEMS.register(modEventBus);
        LDItems.ITEMS.register(modEventBus);
        LDBlocks.BLOCKS.register(modEventBus);
        ModSounds.SOUND_EVENTS.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(Composting::addCompostValues);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

        BrewingRecipeRegistry.addRecipe(new ModBrewingRecipeSetup(Potions.AWKWARD,
                LDItems.FLOWERING_BLOSSOM.get(), Potions.SWIFTNESS));

        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(LDBlocks.WHITE_BLOSSOM.getId(), LDBlocks.POTTED_WHITE_BLOSSOM);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(LDBlocks.LAVENDER.getId(), LDBlocks.POTTED_LAVENDER);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(LDBlocks.WILD_MINT.getId(), LDBlocks.POTTED_MINT);
        });
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(LDBlocks.ROSE.getId(), LDBlocks.POTTED_ROSE);
        });

    }
    private void addCreative(BuildCreativeModeTabContentsEvent event){
            if (event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
                event.accept(LDItems.SWEET_BERRY_JUICE);

            }

        }




    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
