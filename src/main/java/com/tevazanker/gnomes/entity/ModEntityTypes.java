package com.tevazanker.gnomes.entity;
import com.tevazanker.gnomes.Gnomes;
import com.tevazanker.gnomes.entity.custom.GnomeEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Gnomes.MOD_ID);

    public static final RegistryObject<EntityType<GnomeEntity>> GNOME =
            ENTITY_TYPES.register("gnome", ()-> EntityType.Builder.of(GnomeEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.6f)
                    .build(new ResourceLocation(Gnomes.MOD_ID, "gnome").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
