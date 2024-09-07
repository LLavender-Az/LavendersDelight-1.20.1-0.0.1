package net.lavender.lavsdelight.common.item.common;

import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class BlockFoodItem extends ItemNameBlockItem {
    public BlockFoodItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 16;
    }
}