package net.lavender.lavsdelight.common.item.common;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class DisgustingDrinkItem extends ConsumableItem {
	public DisgustingDrinkItem(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.DRINK;
	}
	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
		{
			components.add(Component.literal("Why would you drink this?..").withStyle(ChatFormatting.DARK_GRAY));
		}

		super.appendHoverText(itemStack, level, components, flag);
	}
}