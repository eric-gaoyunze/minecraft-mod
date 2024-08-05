package com.example.invoid.entity;

import com.example.invoid.InVoid;
import com.example.invoid.entity.custom.GhostEntity;

import com.example.invoid.entity.custom.LavaBehemothEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, InVoid.MOD_ID);
    public static final RegistryObject<EntityType<GhostEntity>> GHOST =
            ENTITY_TYPES.register("ghost",()->EntityType.Builder.of(GhostEntity::new, MobCategory.CREATURE)
                    .sized(0.8f,0.6f)
                    .build(new ResourceLocation(InVoid.MOD_ID,"ghost").toString()));
    public static final RegistryObject<EntityType<LavaBehemothEntity>> LAVA_BEHEMOTH =
            ENTITY_TYPES.register("lava_behemoth",()->EntityType.Builder.of(LavaBehemothEntity::new, MobCategory.CREATURE)
                    .sized(1.2f,1.2f)
                    .build(new ResourceLocation(InVoid.MOD_ID,"lava_behemoth").toString()));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}