package com.tevazanker.gnomes.item;

import com.tevazanker.gnomes.Gnomes;
import com.tevazanker.gnomes.entity.ModEntityTypes;
import com.tevazanker.gnomes.item.custom.DowsingRodItem;
import com.tevazanker.gnomes.item.custom.SceptreOfEcognomicsItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
                    .stacksTo(1)
                    .durability(16)));
    public static final RegistryObject<Item> SHORT_MUSHROOM_STEW = ITEMS.register("short_mushroom_stew",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.GNOMES_TAB)
                    .food(GnomeFoods.SHORT_MUSHROOM_STEW)));


    public static final RegistryObject<Item> GNOME_SPAWN_EGG = ITEMS.register("gnome_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.GNOME,0xe60000, 0x3b3635,
                    new Item.Properties().tab(ModCreativeModeTab.GNOMES_TAB)));
    public static final RegistryObject<Item> SCEPTRE_OF_ECOGNOMICS = ITEMS.register("sceptre_of_ecognomics",
            () -> new SceptreOfEcognomicsItem(new Item.Properties()
                    .tab(ModCreativeModeTab.GNOMES_TAB)
                    .stacksTo(1)
                    .durability(16)));

    public static void  register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }



}
