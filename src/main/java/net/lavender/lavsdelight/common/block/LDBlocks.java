package net.lavender.lavsdelight.common.block;

import net.lavender.lavsdelight.LavsDelight;
import net.lavender.lavsdelight.common.block.common.*;
import net.lavender.lavsdelight.common.block.custom.*;
import net.lavender.lavsdelight.common.block.custom.plant.LemonSapling;
import net.lavender.lavsdelight.common.block.custom.plant.Rose;
import net.lavender.lavsdelight.common.block.custom.plant.WildBlossom;
import net.lavender.lavsdelight.common.block.custom.plant.Lavender;
import net.lavender.lavsdelight.common.item.LDItems;
import net.lavender.lavsdelight.datagen.tree.LemonTreeGrower;
import net.lavender.lavsdelight.datagen.tree.PeachTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class LDBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, LavsDelight.MOD_ID);

    //crates and sacks
    public static final RegistryObject<Block> CHEESE_WHEEL = registerBlock("cheese_wheel",
            () -> new CheeseWheel(BlockBehaviour.Properties.of().sound(SoundType.WOOL)
                    .pushReaction(PushReaction.IGNORE).strength(0.5f).mapColor(MapColor.COLOR_YELLOW)));
    public static final RegistryObject<Block> PEACH_CRATE = registerBlock("peach_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> PEACH_PIT_SACK = registerBlock("peach_pit_sack",
            () -> new SackBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> SALT_BAG = registerBlock("salt_bag",
            () -> new SackBlock(BlockBehaviour.Properties.copy(Blocks.BROWN_WOOL)));
    public static final RegistryObject<Block> MINT_SACK = registerBlock("mint_sack",
            () -> new SackBlock(BlockBehaviour.Properties.copy(Blocks.GREEN_WOOL)));

    //logs & wood
    public static final RegistryObject<Block> PEACH_LOG = registerBlock("peach_log",
            () -> new PeachLog(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2, 2).pushReaction(PushReaction.NORMAL)));
    public static final RegistryObject<Block> STRIPPED_PEACH_LOG = registerBlock("stripped_peach_log",
            () -> new PeachLog(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2, 2).pushReaction(PushReaction.NORMAL)));
    public static final RegistryObject<Block> PEACH_PLANKS = registerBlock("peach_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> LEMON_LOG = registerBlock("lemon_log",
            () -> new LemonLog(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2, 2).pushReaction(PushReaction.NORMAL)));
    public static final RegistryObject<Block> STRIPPED_LEMON_LOG = registerBlock("stripped_lemon_log",
            () -> new LemonLog(BlockBehaviour.Properties.of().mapColor(MapColor.WOOD).sound(SoundType.WOOD).strength(2, 2).pushReaction(PushReaction.NORMAL)));
    public static final RegistryObject<Block> LEMON_PLANKS = registerBlock("lemon_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));


    //leaves
    public static final RegistryObject<Block> PEACH_LEAVES = registerBlock("peach_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> LEMON_LEAVES = registerBlock("lemon_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> BLOSSOMING_PEACH_LEAVES = registerBlock("blossoming_peach_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> BLOSSOMING_LEMON_LEAVES = registerBlock("blossoming_lemon_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });


    //saplings
    public static final RegistryObject<Block> PEACH_PIT = registerBlock("peach_pit",
            () -> new SeedSapling(new PeachTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> LEMON_STARTER = registerBlock("lemon_starter",
            () -> new LemonSapling(new LemonTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING).sound(SoundType.WET_GRASS)));
    public static final RegistryObject<Block> LEMON_SEED = registerBlock("lemon_seed",
            () -> new SeedSapling(new LemonTreeGrower(), BlockBehaviour.Properties.copy(Blocks.BIRCH_SAPLING).sound(SoundType.WET_GRASS)));


    //ores
    public static final RegistryObject<Block> IRON_RICH_GRAVEL = registerBlock("iron_rich_gravel",
            () -> new IronRichGravel(BlockBehaviour.Properties.copy(Blocks.GRAVEL).sound(SoundType.GRAVEL)
                    .requiresCorrectToolForDrops().mapColor(MapColor.COLOR_LIGHT_GRAY)));
    public static final RegistryObject<Block> HALITE = registerBlock("halite",
            () -> new Halite(BlockBehaviour.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).strength(0.8f, 0.5f).pushReaction(PushReaction.NORMAL)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.CHIME).mapColor(MapColor.CLAY)));
    public static final RegistryObject<Block> HALITE_PILLAR = registerBlock("halite_pillar",
            () -> new HalitePillar(BlockBehaviour.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).strength(0.8f, 0.5f).pushReaction(PushReaction.IGNORE)
                    .requiresCorrectToolForDrops().mapColor(MapColor.CLAY)));
    public static final RegistryObject<Block> POROUS_SEDIMENT = registerBlock("porous_sediment",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(0.8f, 0.8f).pushReaction(PushReaction.NORMAL)
                    .requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM).mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> GEODE = registerBlock("geode",
            () -> new Geode(BlockBehaviour.Properties.of().sound(SoundType.DRIPSTONE_BLOCK).strength(0.8f, 0.5f).pushReaction(PushReaction.IGNORE).dynamicShape()
                    .requiresCorrectToolForDrops().offsetType(BlockBehaviour.OffsetType.XZ).mapColor(MapColor.CLAY)));

    public static final RegistryObject<Block> COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> COBBLESTONE_TILES = registerBlock("cobblestone_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE).requiresCorrectToolForDrops().mapColor(MapColor.STONE)));
    public static final RegistryObject<Block> WEATHERED_BRICKS = registerBlock("weathered_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_BROWN)));


    //flowers
    public static final RegistryObject<Block> MINT = BLOCKS.register("mint",
            () -> new MintCrop(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> WILD_BLOSSOM = BLOCKS.register("wild_blossom",
            () -> new WildBlossom(BlockBehaviour.Properties.copy(Blocks.SWEET_BERRY_BUSH).mapColor(DyeColor.WHITE)));
    public static final RegistryObject<Block> WILD_MINT = registerBlock("wild_mint",
            () -> new WildCropBlock(MobEffects.DAMAGE_RESISTANCE, 160, BlockBehaviour.Properties.of().offsetType(BlockBehaviour.OffsetType.XZ).dynamicShape()
                    .mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> WHITE_BLOSSOM = registerBlock("white_blossom",
            () -> new FlowerBlock(MobEffects.MOVEMENT_SPEED, 160, BlockBehaviour.Properties.of().offsetType(BlockBehaviour.OffsetType.XZ).dynamicShape()
                    .mapColor(DyeColor.WHITE).noCollission().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            () -> new Lavender(MobEffects.REGENERATION, 160, BlockBehaviour.Properties.of().offsetType(BlockBehaviour.OffsetType.XYZ).dynamicShape()
                    .mapColor(MapColor.COLOR_PURPLE).noCollission().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> ROSE = registerBlock("rose",
            () -> new Rose(MobEffects.HEAL, 160, BlockBehaviour.Properties.of().offsetType(BlockBehaviour.OffsetType.XYZ).dynamicShape()
                            .mapColor(MapColor.COLOR_RED).noCollission().instabreak().sound(SoundType.GRASS)));


    public static final RegistryObject<Block> POTTED_WHITE_BLOSSOM = BLOCKS.register("potted_white_blossom",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), LDBlocks.WHITE_BLOSSOM,
                    BlockBehaviour.Properties.of().mapColor(MapColor.TERRACOTTA_WHITE)));
    public static final RegistryObject<Block> POTTED_LAVENDER = BLOCKS.register("potted_lavender",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), LDBlocks.LAVENDER,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PINK)));
    public static final RegistryObject<Block> POTTED_MINT = BLOCKS.register("potted_mint",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), LDBlocks.WILD_MINT,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN)));
    public static final RegistryObject<Block> POTTED_ROSE = BLOCKS.register("potted_rose",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), LDBlocks.ROSE,
                    BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_RED)));



    //decor
    public static final RegistryObject<Block> DREAM_CATCHER = registerBlock("dream_catcher",
            () -> new DreamCatcher(BlockBehaviour.Properties.of().sound(SoundType.WOOD).instabreak()
                    .noCollission().mapColor(MapColor.WOOD)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        if (name.equals("peach_log") || name.equals("stripped_peach_log") || name.equals("peach_planks") || name.equals("peach_pit")
         || name.equals("lemon_log") || name.equals("stripped_lemon_log") || name.equals("lemon_planks") || name.equals("lemon_seed")
         || name.equals("dream_catcher")) {
            registerFuelBlock(name, toReturn);
        } else {
            registerBlockItem(name, toReturn);
        }
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return LDItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<Item> registerFuelBlock(String name, RegistryObject<T> block) {
        return LDItems.ITEMS.register(name, () -> new FuelBlock(block.get(), new Item.Properties(), 300));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}