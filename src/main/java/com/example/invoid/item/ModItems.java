package com.example.invoid.item;

import com.example.invoid.InVoid;
import com.example.invoid.block.ModBlocks;
import com.example.invoid.entity.ModEntityTypes;
import com.example.invoid.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InVoid.MOD_ID);
    public static final RegistryObject<Item> PINK_GEM = ITEMS.register("pink_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PURPLE_GEM = ITEMS.register("purple_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> ORANGE_GEM = ITEMS.register("orange_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PURPLE_GEM_WITH_OBSIDIAN = ITEMS.register("purple_gem_with_obsidian",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> VOID_POWDER = ITEMS.register("void_powder",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> RAW_PINK_GEM = ITEMS.register("raw_pink_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> FOUR_COLOR_GEM = ITEMS.register("four_color_gem",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PINK_GEM_SWORD = ITEMS.register("pink_gem_sword",
            () -> new PinkGemSword(ModTiers.PINK_GEM,2,9f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PINK_GEM_PICKAXE = ITEMS.register("pink_gem_pickaxe",
            () -> new PickaxeItem(ModTiers.PINK_GEM,2,9f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PINK_GEM_AXE = ITEMS.register("pink_gem_axe",
            () -> new AxeItem(ModTiers.PINK_GEM,2,9f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> ORANGE_GEM_SWORD = ITEMS.register("orange_gem_sword",
            () -> new OrangeGemSword(ModTiers.OEANGE_GEM,2,3f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> ORANGE_PICKAXE = ITEMS.register("orange_gem_pickaxe",
            () -> new PickaxeItem(ModTiers.OEANGE_GEM,2,3f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> ORANGE_GEM_AXE = ITEMS.register("orange_gem_axe",
            () -> new AxeItem(ModTiers.OEANGE_GEM,2,3f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PURPLE_GEM_SWORD = ITEMS.register("purple_gem_sword",
            () -> new PurpleGemSword(ModTiers.PURPLE_GEM,2,1f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PURPLE_GEM_PICKAXE = ITEMS.register("purple_gem_pickaxe",
            () -> new PickaxeItem(ModTiers.PURPLE_GEM,2,1f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PURPLE_GEM_AXE = ITEMS.register("purple_gem_axe",
            () -> new AxeItem(ModTiers.PURPLE_GEM,2,1f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> FOUR_COLOR_GEM_SWORD = ITEMS.register("four_color_gem_sword",
            () -> new FourColorGemSword(ModTiers.FOUR_COLOR_GEM,2,9f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> FOUR_COLOR_GEM_PICKAXE = ITEMS.register("four_color_gem_pickaxe",
            () -> new PickaxeItem(ModTiers.FOUR_COLOR_GEM,2,9f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> FOUR_COLOR_GEM_AXE = ITEMS.register("four_color_gem_axe",
            () -> new AxeItem(ModTiers.FOUR_COLOR_GEM,2,9f,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> PEANUT = ITEMS.register("peanut",
            () -> new ItemNameBlockItem(ModBlocks.PEANUT_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> CORN = ITEMS.register("corn",
            () -> new ItemNameBlockItem(ModBlocks.CORN_PLANT.get(),
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> GHOST_SPAWN_EGG = ITEMS.register("ghost_spawn_egg",
            ()->new ForgeSpawnEggItem(ModEntityTypes.GHOST,0x948e8d,0x3b3685,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));
    public static final RegistryObject<Item> LAVA_BEHEMOTH_SPAWN_EGG = ITEMS.register("lava_behemoth_spawn_egg",
            ()->new ForgeSpawnEggItem(ModEntityTypes.LAVA_BEHEMOTH,0x948e8d,0x3b3685,
                    new Item.Properties().tab(ModCreativeModTab.INVOID_TAB)));

    public static final RegistryObject<Item> DOWSING_ROD = ITEMS.register("dowsing_rod",
            () -> new DowsingRodItem(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB).durability(16)));
    public static final RegistryObject<Item> DOWSING_ROD_PRO = ITEMS.register("dowsing_rod_pro",
            () -> new DowsingRodProItem(new Item.Properties().tab(ModCreativeModTab.INVOID_TAB).durability(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
