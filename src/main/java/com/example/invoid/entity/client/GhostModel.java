package com.example.invoid.entity.client;

import com.example.invoid.InVoid;
import com.example.invoid.entity.custom.GhostEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GhostModel extends AnimatedGeoModel<GhostEntity> {
    @Override
    public ResourceLocation getModelLocation(GhostEntity ghostEntity) {
        return new ResourceLocation(InVoid.MOD_ID,"geo/ghost.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GhostEntity ghostEntity) {
        return new ResourceLocation(InVoid.MOD_ID,"textures/entity/ghost/ghost.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GhostEntity ghostEntity) {
        return new ResourceLocation(InVoid.MOD_ID,"animations/ghost.animation.json");
    }
}
