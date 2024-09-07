package net.lavender.lavsdelight.common.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.List;

public class HealingRune extends ItemNameBlockItem {
    public HealingRune(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 1;
    }
    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.TOOT_HORN;
    }


    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        {
            components.add(Component.literal("Speed (0:08)").withStyle(ChatFormatting.GOLD));
        }

        super.appendHoverText(itemStack, level, components, flag);
    }
}