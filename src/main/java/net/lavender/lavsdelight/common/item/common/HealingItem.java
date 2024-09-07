package net.lavender.lavsdelight.common.item.common;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class HealingItem extends DrinkableItem
{
	public HealingItem(Properties properties) {
		super(properties, false, true);
	}
	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
		{
			components.add(Component.literal("Minor Instant Healing").withStyle(ChatFormatting.BLUE));
		}

		super.appendHoverText(itemStack, level, components, flag);
	}
}