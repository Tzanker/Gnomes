package com.tevazanker.gnomes.item;

import net.minecraft.world.food.FoodProperties;

public class GnomeFoods {
    public static final FoodProperties SHORT_MUSHROOM_STEW = stew(6).build();


    private static FoodProperties.Builder stew(int pNutrition) {
        return (new FoodProperties.Builder()).nutrition(pNutrition).saturationMod(0.6F);
    }
}
