package com.tevazanker.gnomes.item;

import com.tevazanker.gnomes.Gnomes;
import com.tevazanker.gnomes.item.custom.DowsingRodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public  static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Gnomes.MOD_ID);

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties()
                    .tab(ModCreativeModeTab.GNOMES_TAB)
                    .durability(16)));


    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
