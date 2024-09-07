package net.lavender.lavsdelight.common.block.custom;

import net.lavender.lavsdelight.common.block.LDBlocks;
import net.lavender.lavsdelight.common.block.common.PillarBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;

import javax.annotation.Nullable;

public class PeachLog extends PillarBlock {
    public PeachLog(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }
    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            if(state.is(LDBlocks.PEACH_LOG.get())) {
                return LDBlocks.STRIPPED_PEACH_LOG.get().defaultBlockState().setValue(FACING, state.getValue(FACING));
            }

            if(state.is(LDBlocks.PEACH_LOG.get())) {
                return LDBlocks.STRIPPED_PEACH_LOG.get().defaultBlockState().setValue(FACING, state.getValue(FACING));
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}
