package net.lavender.lavsdelight.common.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;

public class FloweringBlossom extends ItemNameBlockItem {
    public FloweringBlossom(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 16;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        {
            components.add(Component.literal("Speed (0:08)").withStyle(ChatFormatting.GOLD));
        }

        super.appendHoverText(itemStack, level, components, flag);
    }
}