package com.tevazanker.gnomes.block;

import com.tevazanker.gnomes.Gnomes;
import com.tevazanker.gnomes.block.custom.SpeedyBlock;
import com.tevazanker.gnomes.item.ModCreativeModeTab;
import com.tevazanker.gnomes.item.ModItems;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Gnomes.MOD_ID);

    public static final RegistryObject<Block> SHORT_MUSHROOM_BLOCK = registerBlock("short_mushroom_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.PLANT).strength(0)),
            ModCreativeModeTab.GNOMES_TAB);
    public static final RegistryObject<Block> SHORT_MUSHROOM = registerBlock("short_mushroom",
            () -> new MushroomBlock(BlockBehaviour.Properties.copy(Blocks.RED_MUSHROOM)
                    .noCollission()
                    .randomTicks()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .speedFactor(0.7F)
                    .jumpFactor(0.4F)
                    .noOcclusion(),
                    () -> {
                        return TreeFeatures.HUGE_RED_MUSHROOM;
                    }),
            ModCreativeModeTab.GNOMES_TAB);
    public static final RegistryObject<Block> POTTED_SHORT_MUSHROOM =
            registerBlockWithoutItem("potted_short_mushroom",
                () -> new FlowerPotBlock(null, ModBlocks.SHORT_MUSHROOM
                        ,BlockBehaviour.Properties.copy(Blocks.POTTED_RED_MUSHROOM)
                        .noOcclusion()),
                ModCreativeModeTab.GNOMES_TAB);

    private static <T extends Block> RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block, CreativeModeTab tab) {
        return BLOCKS.register(name, block);
    }

    public static final RegistryObject<Block> SPEED_BLOCK = registerBlock("speed_block",
            () -> new SpeedyBlock(BlockBehaviour.Properties.of(Material.PLANT).strength(4f)),
            ModCreativeModeTab.GNOMES_TAB);

    //Used to register a block and its associated item
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
