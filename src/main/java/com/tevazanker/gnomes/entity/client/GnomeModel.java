package com.tevazanker.gnomes.entity.client;

import com.tevazanker.gnomes.Gnomes;
import com.tevazanker.gnomes.entity.custom.GnomeEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GnomeModel extends AnimatedGeoModel<GnomeEntity> {


    @Override
    public ResourceLocation getModelLocation(GnomeEntity gnomeEntity) {
        return new ResourceLocation(Gnomes.MOD_ID, "geo/gnome.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GnomeEntity gnomeEntity) {

        return new ResourceLocation(Gnomes.MOD_ID, "textures/entity/gnome/gnome.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GnomeEntity gnomeEntity) {
        return new ResourceLocation(Gnomes.MOD_ID, "animations/gnome.animation.json");
    }
}
