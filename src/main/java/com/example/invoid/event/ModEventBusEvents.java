package com.example.invoid.event;

import com.example.invoid.InVoid;
import com.example.invoid.entity.ModEntityTypes;
import com.example.invoid.entity.custom.GhostEntity;

import com.example.invoid.entity.custom.LavaBehemothEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = InVoid.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event){
        event.put(ModEntityTypes.GHOST.get(), GhostEntity.setAttributes());
        event.put(ModEntityTypes.LAVA_BEHEMOTH.get(), LavaBehemothEntity.setAttributes());

    }
}
