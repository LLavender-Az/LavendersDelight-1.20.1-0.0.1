package net.lavender.lavsdelight;

import net.lavender.lavsdelight.common.block.LDBlocks;
import net.lavender.lavsdelight.common.item.LDItems;
import net.lavender.lavsdelight.common.item.MusicDiscs;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LavsDelight.MOD_ID);
    public static final RegistryObject<CreativeModeTab> LAV_CREATIVE_TAB = CREATIVE_MODE_TABS.register("lav_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(LDBlocks.PEACH_CRATE.get()))
                    .title(Component.literal("Lavenders Delight!"))
                    .displayItems((pParameters, pOutput) -> {

                        //blocks

                        //ores

                        pOutput.accept(LDBlocks.PEACH_CRATE.get());
                        pOutput.accept(LDBlocks.PEACH_PIT_SACK.get());
                        pOutput.accept(LDBlocks.SALT_BAG.get());
                        pOutput.accept(LDBlocks.MINT_SACK.get());
                        pOutput.accept(LDBlocks.IRON_RICH_GRAVEL.get());
                        pOutput.accept(LDBlocks.POROUS_SEDIMENT.get());
                        pOutput.accept(LDBlocks.HALITE.get());
                        pOutput.accept(LDBlocks.HALITE_PILLAR.get());
                        pOutput.accept(LDBlocks.COBBLESTONE_BRICKS.get());
                        pOutput.accept(LDBlocks.COBBLESTONE_TILES.get());
                        pOutput.accept(LDBlocks.WEATHERED_BRICKS.get());
                        pOutput.accept(LDBlocks.PEACH_LEAVES.get());
                        pOutput.accept(LDBlocks.BLOSSOMING_PEACH_LEAVES.get());
                        pOutput.accept(LDBlocks.LEMON_LEAVES.get());
                        pOutput.accept(LDBlocks.BLOSSOMING_LEMON_LEAVES.get());
                        pOutput.accept(LDBlocks.PEACH_LOG.get());
                        pOutput.accept(LDBlocks.STRIPPED_PEACH_LOG.get());
                        pOutput.accept(LDBlocks.LEMON_LOG.get());
                        pOutput.accept(LDBlocks.STRIPPED_LEMON_LOG.get());
                        pOutput.accept(LDBlocks.PEACH_PLANKS.get());
                        pOutput.accept(LDBlocks.LEMON_PLANKS.get());
                        pOutput.accept(LDBlocks.WHITE_BLOSSOM.get());
                        pOutput.accept(LDBlocks.LAVENDER.get());
                        pOutput.accept(LDBlocks.WILD_MINT.get());
                        pOutput.accept(LDBlocks.LEMON_STARTER.get());

                        pOutput.accept(LDItems.PEACH.get());
                        pOutput.accept(LDItems.BAKED_PEACH.get());
                        pOutput.accept(LDItems.PEACH_SLICE.get());
                        pOutput.accept(LDItems.PEACH_TART.get());
                        pOutput.accept(LDItems.PEACH_CANDY.get());
                        pOutput.accept(LDBlocks.PEACH_PIT.get());
                        pOutput.accept(LDItems.LEMON.get());
                        pOutput.accept(LDItems.LEMON_SLICE.get());
                        pOutput.accept(LDItems.LEMON_JUICE.get());
                        pOutput.accept(LDItems.LEMONADE.get());
                        pOutput.accept(LDBlocks.LEMON_SEED.get());
                        pOutput.accept(LDItems.FLOWERING_BLOSSOM.get());
                        pOutput.accept(LDItems.MINT_LEAF.get());
                        pOutput.accept(LDItems.MINT_ROOTS.get());
                        pOutput.accept(LDItems.MINT_EXTRACT.get());
                        pOutput.accept(LDItems.MINT_TEA.get());
                        pOutput.accept(LDBlocks.CHEESE_WHEEL.get());
                        pOutput.accept(LDItems.CHEESE_WEDGE.get());
                        pOutput.accept(LDItems.CHEESE_N_BERRIES.get());
                        pOutput.accept(LDItems.MELON_TANGHULU.get());
                        pOutput.accept(LDItems.POPPY_SEEDS.get());
                        pOutput.accept(LDItems.POPPY_SEED_MUFFIN.get());
                        pOutput.accept(LDItems.LAVENDER_DUMPLING.get());
                        pOutput.accept(LDItems.MILK_CHOCOLATE.get());
                        pOutput.accept(LDItems.SALT.get());
                        pOutput.accept(LDItems.SALTED_MEAT.get());
                        pOutput.accept(LDBlocks.ROSE.get());
                        pOutput.accept(LDItems.RICE_FLOUR.get());
                        pOutput.accept(LDItems.WHEAT_FLOUR.get());
                        pOutput.accept(LDItems.RESIN_SATURATED_TREE_BARK.get());
                        pOutput.accept(LDItems.PINE_RESIN.get());
                        pOutput.accept(LDItems.TATTERED_LEATHER.get());
                        pOutput.accept(LDBlocks.GEODE.get());


                        //decor
                       // pOutput.accept(MusicDiscs.GLOWING_MUSIC_DISC.get());
                        pOutput.accept(LDBlocks.DREAM_CATCHER.get());








                    })
                    .build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}