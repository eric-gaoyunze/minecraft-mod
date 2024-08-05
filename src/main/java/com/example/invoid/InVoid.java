package com.example.invoid;

import com.example.invoid.block.ModBlocks;
import com.example.invoid.entity.ModEntityTypes;
import com.example.invoid.entity.client.GhostRenderer;

import com.example.invoid.entity.client.LavaBehemothRenderer;
import com.example.invoid.item.ModItems;

import com.example.invoid.world.structure.ModStructures;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(InVoid.MOD_ID)
public class InVoid {
    public static final String MOD_ID = "invoid";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public InVoid() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModStructures.register(eventBus);
        ModEntityTypes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);
        GeckoLib.initialize();
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void clientSetup(final FMLCommonSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PEANUT_PLANT.get(), RenderType.cutout());
        EntityRenderers.register(ModEntityTypes.GHOST.get(), GhostRenderer::new);
        EntityRenderers.register(ModEntityTypes.LAVA_BEHEMOTH.get(), LavaBehemothRenderer::new);


    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }


}
