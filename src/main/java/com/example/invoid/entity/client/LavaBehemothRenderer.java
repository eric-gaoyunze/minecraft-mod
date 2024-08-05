package com.example.invoid.entity.client;

import com.example.invoid.InVoid;
import com.example.invoid.entity.custom.LavaBehemothEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LavaBehemothRenderer extends GeoEntityRenderer<LavaBehemothEntity> {
    public LavaBehemothRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LavaBehemothModel());
    }
    @Override
    public ResourceLocation getTextureLocation(LavaBehemothEntity instance){
        return new ResourceLocation(InVoid.MOD_ID,"textures/entity/lava_behemoth/lava_behemoth.png");
    }
    @Override
    public RenderType getRenderType(LavaBehemothEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation){
        stack.scale(0.8f,0.8f,0.8f);
        return super.getRenderType(animatable,partialTicks,stack,renderTypeBuffer,vertexBuilder,packedLightIn,textureLocation);
    }
}
