package net.lavender.lavsdelight.common.item;

import net.lavender.lavsdelight.LavsDelight;
import net.lavender.lavsdelight.common.FoodValues;
import net.lavender.lavsdelight.common.item.common.BlockFoodItem;
import net.lavender.lavsdelight.common.item.custom.MintTea;
import net.lavender.lavsdelight.common.block.LDBlocks;
import net.lavender.lavsdelight.common.item.common.*;
import net.lavender.lavsdelight.common.item.common.ConsumableItem;
import net.lavender.lavsdelight.common.item.custom.Candy;
import net.lavender.lavsdelight.common.item.custom.FloweringBlossom;
import net.lavender.lavsdelight.common.item.common.HealingItem;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class LDItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LavsDelight.MOD_ID);

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }
    public static Item.Properties foodItem(FoodProperties food) {
        return new Item.Properties().food(food);
    }
    public static Item.Properties bowlFoodItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.BOWL).stacksTo(16);
    }
    public static Item.Properties wrappedItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.PAPER).stacksTo(16);
    }
    public static Item.Properties drinkHealingItem(FoodProperties food) {
        return new Item.Properties().food(food).craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }
    public static Item.Properties drinkItem() {
        return new Item.Properties().craftRemainder(Items.GLASS_BOTTLE).stacksTo(16);
    }


    // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z

    // Items

    public static final RegistryObject<Item> SALT = ITEMS.register("salt", () -> new Item(basicItem()));
    public static final RegistryObject<Item> TATTERED_LEATHER = ITEMS.register("tattered_leather", () -> new Item(basicItem()));
    public static final RegistryObject<Item> MINT_ROOTS = ITEMS.register("mint_roots", () -> new ItemNameBlockItem(LDBlocks.MINT.get(), basicItem()));
    public static final RegistryObject<Item> RICE_FLOUR = ITEMS.register("rice_flour", () -> new Item(basicItem()));
    public static final RegistryObject<Item> WHEAT_FLOUR = ITEMS.register("wheat_flour", () -> new Item(basicItem()));
    public static final RegistryObject<Item> PINE_RESIN = ITEMS.register("pine_resin", () -> new Item(basicItem()));
    public static final RegistryObject<Item> RESIN_SATURATED_TREE_BARK = ITEMS.register("resin_saturated_tree_bark", () -> new Item(basicItem()));
    public static final RegistryObject<Item> MINT_EXTRACT = ITEMS.register("mint_extract", () -> new DisgustingDrinkItem(drinkItem()));
    // Edible Flowers
    public static final RegistryObject<Item> FLOWERING_BLOSSOM = ITEMS.register("flowering_blossom", () -> new FloweringBlossom(LDBlocks.WILD_BLOSSOM.get(), foodItem(FoodValues.FLOWERING_BLOSSOM)));
    // Fruits
    public static final RegistryObject<Item> PEACH = ITEMS.register("peach", () -> new Item(foodItem(FoodValues.PEACH)));
    public static final RegistryObject<Item> LEMON = ITEMS.register("lemon", () -> new Item(foodItem(FoodValues.LEMON)));
    public static final RegistryObject<Item> PEACH_SLICE = ITEMS.register("peach_slice", () -> new Item(foodItem(FoodValues.PEACH_SLICE)));
    public static final RegistryObject<Item> LEMON_SLICE = ITEMS.register("lemon_slice", () -> new Item(foodItem(FoodValues.LEMON_SLICE)));

    // Candy
    public static final RegistryObject<Item> PEACH_CANDY = ITEMS.register("peach_candy", () -> new Candy(wrappedItem(FoodValues.PEACH_CANDY)));
    public static final RegistryObject<Item> MELON_TANGHULU = ITEMS.register("melon_tanghulu", () -> new HealingItem(foodItem(FoodValues.MELON_TANGHULU)));
    public static final RegistryObject<Item> MILK_CHOCOLATE = ITEMS.register("milk_chocolate", () -> new Item(foodItem(FoodValues.MILK_CHOCOLATE)));

    // Foods
    public static final RegistryObject<Item> BAKED_PEACH = ITEMS.register("baked_peach", () -> new Item(foodItem(FoodValues.BAKED_PEACH)));
    public static final RegistryObject<Item> PEACH_TART = ITEMS.register("peach_tart", () -> new Item(foodItem(FoodValues.PEACH_TART)));
    public static final RegistryObject<Item> CHEESE_WEDGE = ITEMS.register("cheese_wedge", () -> new Item(foodItem(FoodValues.CHEESE_WEDGE)));
    public static final RegistryObject<Item> CHEESE_N_BERRIES = ITEMS.register("cheese_n_berries", () -> new ConsumableItem(bowlFoodItem(FoodValues.CHEESE_N_BERRIES)));
    public static final RegistryObject<Item> SWEET_BERRY_JUICE = ITEMS.register("sweet_berry_juice", () -> new HealingItem(drinkHealingItem(FoodValues.HEALING)));
    public static final RegistryObject<Item> SALTED_MEAT = ITEMS.register("salted_meat", () -> new Item(foodItem(FoodValues.SALTED_MEAT)));
    public static final RegistryObject<Item> LEMONADE = ITEMS.register("lemonade", () -> new HealingItem(drinkHealingItem(FoodValues.HEALING)));
    public static final RegistryObject<Item> MINT_LEAF = ITEMS.register("mint_leaf", () -> new Item(foodItem(FoodValues.MINT)));
    public static final RegistryObject<Item> POPPY_SEEDS = ITEMS.register("poppy_seeds", () -> new Item(foodItem(FoodValues.POPPY_SEEDS)));
    public static final RegistryObject<Item> POPPY_SEED_MUFFIN = ITEMS.register("poppy_seed_muffin", () -> new Item(foodItem(FoodValues.POPPY_SEED_MUFFIN)));
    public static final RegistryObject<Item> LAVENDER_DUMPLING = ITEMS.register("lavender_dumpling", () -> new Item(foodItem(FoodValues.LAVENDER_DUMPLING)));
    public static final RegistryObject<Item> LEMON_JUICE = ITEMS.register("lemon_juice", () -> new ConsumableItem(drinkItem()));
    public static final RegistryObject<Item> MINT_TEA = ITEMS.register("mint_tea", () -> new MintTea(drinkHealingItem(FoodValues.DAMAGE_RESIST)));

}