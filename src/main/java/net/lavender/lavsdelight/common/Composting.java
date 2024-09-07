package net.lavender.lavsdelight.common;

import net.lavender.lavsdelight.common.block.LDBlocks;
import net.lavender.lavsdelight.common.item.LDItems;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraftforge.fml.event.lifecycle.*;

public class Composting {

    public static void addCompostValues(FMLCommonSetupEvent event) {
        registerCompostable(LDBlocks.WHITE_BLOSSOM.get().asItem(), 0.25f);
        registerCompostable(LDBlocks.LAVENDER.get().asItem(), 0.25f);
        registerCompostable(LDBlocks.PEACH_PIT.get().asItem(), 0.15f);
        registerCompostable(LDBlocks.LEMON_SEED.get().asItem(), 0.15f);
        registerCompostable(LDBlocks.ROSE.get().asItem(), 0.25f);
        registerCompostable(LDItems.MINT_LEAF.get(), 0.05f);
        registerCompostable(LDItems.MINT_ROOTS.get(), 0.10f);
        registerCompostable(LDItems.RESIN_SATURATED_TREE_BARK.get(), 0.45f);
        registerCompostable(LDItems.PEACH.get(), 0.65f);
        registerCompostable(LDItems.PEACH_SLICE.get(), 0.35f);
        registerCompostable(LDItems.LEMON.get(), 0.65f);
        registerCompostable(LDItems.LEMON_SLICE.get(), 0.35f);
        registerCompostable(LDItems.POPPY_SEEDS.get(), 0.10f);
        registerCompostable(LDItems.FLOWERING_BLOSSOM.get(), 1.00f);
    }

    public static void registerCompostable(Item item, float chance) {
        ComposterBlock.COMPOSTABLES.put(item, chance);
    }
}