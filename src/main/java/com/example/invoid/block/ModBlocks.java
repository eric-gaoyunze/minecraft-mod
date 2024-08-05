package com.example.invoid.block;

import com.example.invoid.InVoid;
import com.example.invoid.block.custom.AppleTreeWoodBlock;
import com.example.invoid.block.custom.CornPlantBlock;
import com.example.invoid.block.custom.GemCuttingStationBlock;
import com.example.invoid.block.custom.PeanutPlantBlock;
import com.example.invoid.item.ModItems;
import com.example.invoid.item.ModCreativeModTab;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, InVoid.MOD_ID);
    public static final RegistryObject<Block> PINK_GEM_ORE = registerBlock("pink_gem_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.INVOID_TAB);
    public static final RegistryObject<Block> APPLE_LEAF = registerBlock("apple_leaf",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModTab.INVOID_TAB);
    public static final RegistryObject<Block> APPLE_TREE_WOOD = registerBlock("apple_tree_wood",
            () -> new AppleTreeWoodBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).noOcclusion()),
            ModCreativeModTab.INVOID_TAB);
    public static final RegistryObject<Block> GEM_CUTTING_STATION = registerBlock("gem_cutting_station",
            () -> new GemCuttingStationBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()),
            ModCreativeModTab.INVOID_TAB);
    public static final RegistryObject<Block> PEANUT_PLANT = registerBlockWithoutBlockItem("peanut_plant",
            () -> new PeanutPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> CORN_PLANT = registerBlockWithoutBlockItem("corn_plant",
            () -> new CornPlantBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name,Supplier<T> block){
        return BLOCKS.register(name,block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
