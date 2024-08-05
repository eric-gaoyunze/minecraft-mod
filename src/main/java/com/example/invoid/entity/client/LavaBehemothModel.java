package com.example.invoid.entity.client;

import com.example.invoid.InVoid;
import com.example.invoid.entity.custom.LavaBehemothEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LavaBehemothModel extends AnimatedGeoModel<LavaBehemothEntity> {
    @Override
    public ResourceLocation getModelLocation(LavaBehemothEntity lavaBehemothEntity) {
        return new ResourceLocation(InVoid.MOD_ID,"geo/lava_behemoth.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(LavaBehemothEntity lavaBehemothEntity) {
        return new ResourceLocation(InVoid.MOD_ID,"textures/entity/lava_behemoth/lava_behemoth.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(LavaBehemothEntity lavaBehemothEntity) {
        return new ResourceLocation(InVoid.MOD_ID,"animations/lava_behemoth.animation.json");
    }
}
