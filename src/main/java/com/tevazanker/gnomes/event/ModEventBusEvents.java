package com.tevazanker.gnomes.event;

import com.tevazanker.gnomes.Gnomes;
import com.tevazanker.gnomes.entity.ModEntityTypes;
import com.tevazanker.gnomes.entity.custom.GnomeEntity;
import net.minecraft.client.tutorial.Tutorial;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Gnomes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.GNOME.get(), GnomeEntity.setAttributes());
    }
}
