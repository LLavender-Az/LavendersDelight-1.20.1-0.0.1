package net.lavender.lavsdelight.common.item.custom;

import net.lavender.lavsdelight.common.item.common.ConsumableItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class Candy extends ConsumableItem {
	public Candy(Properties pProperties) {
		super(pProperties);
	}

	@Override
	public UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.EAT;
	}
	@Override
	public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
		{
			components.add(Component.literal("Haste (0:08)").withStyle(ChatFormatting.GOLD));
		}

		super.appendHoverText(itemStack, level, components, flag);
	}
}