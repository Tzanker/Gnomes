package com.tevazanker.gnomes.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab GNOMES_TAB = new CreativeModeTab("gnomestab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SHORT_MUSHROOM.get());
        }
    };

}
