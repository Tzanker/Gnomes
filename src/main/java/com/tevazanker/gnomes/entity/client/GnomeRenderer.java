package com.tevazanker.gnomes.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.tevazanker.gnomes.Gnomes;
import com.tevazanker.gnomes.entity.custom.GnomeEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GnomeRenderer extends GeoEntityRenderer<GnomeEntity> {
    public GnomeRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GnomeModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(GnomeEntity instance) {
        return new ResourceLocation(Gnomes.MOD_ID, "textures/entity/gnome/gnome.png");
    }

    @Override
    public RenderType getRenderType(GnomeEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

}
