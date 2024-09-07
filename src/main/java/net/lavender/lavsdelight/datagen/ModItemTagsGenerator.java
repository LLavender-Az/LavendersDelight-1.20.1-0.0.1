package net.lavender.lavsdelight.datagen;

import net.lavender.lavsdelight.LavsDelight;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsGenerator extends ItemTagsProvider {
    public ModItemTagsGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                                CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, LavsDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {









    }
}