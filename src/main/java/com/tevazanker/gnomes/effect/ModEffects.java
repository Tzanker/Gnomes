package com.tevazanker.gnomes.effect;

import com.tevazanker.gnomes.Gnomes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS
            = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Gnomes.MOD_ID);

    public static final RegistryObject<MobEffect> SHRINK = MOB_EFFECTS.register("shrink",
            () -> new ShrinkEffect(MobEffectCategory.NEUTRAL, 0));

    public static void register (IEventBus eventBus){
        MOB_EFFECTS.register(eventBus);
    }

}
