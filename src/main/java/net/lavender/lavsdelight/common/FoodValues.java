package net.lavender.lavsdelight.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodValues

{

    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes

    public static final FoodProperties PEACH = new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties PEACH_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties BAKED_PEACH = new FoodProperties.Builder().nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties PEACH_TART = new FoodProperties.Builder().nutrition(6).saturationMod(0.5F).build();
    public static final FoodProperties LAVENDER_DUMPLING = new FoodProperties.Builder().nutrition(5).saturationMod(0.5F).build();
    public static final FoodProperties CHEESE_WEDGE = new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties SALTED_MEAT = new FoodProperties.Builder().nutrition(8).saturationMod(0.9F).build();
    public static final FoodProperties CHEESE_N_BERRIES = new FoodProperties.Builder().nutrition(7).saturationMod(0.5F).build();
    public static final FoodProperties FLOWERING_BLOSSOM = new FoodProperties.Builder().nutrition(1).saturationMod(0.85F).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 160, 0), 1.0F).build();
    public static final FoodProperties MINT = new FoodProperties.Builder().nutrition(1).saturationMod(0.0F).build();
    public static final FoodProperties ROSE = new FoodProperties.Builder().nutrition(1).saturationMod(0.0F).build();
    public static final FoodProperties SUNFLOWER_SEEDS = new FoodProperties.Builder().nutrition(1).saturationMod(0.0F).build();
    public static final FoodProperties POPPY_SEEDS = new FoodProperties.Builder().nutrition(1).saturationMod(0.1F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 100, 0), 0.8F).build();
    public static final FoodProperties POPPY_SEED_MUFFIN = new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 300, 0), 1.0F).build();
    public static final FoodProperties LEMON = new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).build();
    public static final FoodProperties LEMON_SLICE = new FoodProperties.Builder().nutrition(2).saturationMod(0.3F).build();
    public static final FoodProperties MELON_TANGHULU = new FoodProperties.Builder().nutrition(4).saturationMod(0.3F).effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1.0F).build();
    public static final FoodProperties PEACH_CANDY = new FoodProperties.Builder().nutrition(2).saturationMod(0.2F).effect(() -> new MobEffectInstance(MobEffects.DIG_SPEED, 160, 0), 1.0F).build();
    public static final FoodProperties MILK_CHOCOLATE = new FoodProperties.Builder().nutrition(5).saturationMod(0.4F).build();
    public static final FoodProperties HEALING = (new FoodProperties.Builder()).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.HEAL, 1, 0), 1.0F).build();
    public static final FoodProperties DAMAGE_RESIST = (new FoodProperties.Builder()).alwaysEat().effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0), 1.0F).build();

}