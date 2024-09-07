package net.lavender.lavsdelight.common.item.common;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ArtisanGoodItem extends Item {
    public ArtisanGoodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        {
            components.add(Component.literal("Artisan Goods").withStyle(ChatFormatting.GOLD, ChatFormatting.BOLD));
        }

        super.appendHoverText(itemStack, level, components, flag);
    }
}

