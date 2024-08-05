package com.example.invoid.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier PINK_GEM = new ForgeTier(4,1000,14f,18f,18,
            BlockTags.NEEDS_DIAMOND_TOOL,()-> Ingredient.of(ModItems.PINK_GEM.get()));
    public static final ForgeTier PURPLE_GEM = new ForgeTier(4,6000,1f,2f,18,
            BlockTags.NEEDS_DIAMOND_TOOL,()-> Ingredient.of(ModItems.PURPLE_GEM.get()));
    public static final ForgeTier OEANGE_GEM = new ForgeTier(4,1000,3f,2f,90,
            BlockTags.NEEDS_DIAMOND_TOOL,()-> Ingredient.of(ModItems.ORANGE_GEM.get()));
    public static final ForgeTier FOUR_COLOR_GEM = new ForgeTier(4,9000,14f,46f,90,
            BlockTags.NEEDS_DIAMOND_TOOL,()-> Ingredient.of(ModItems.FOUR_COLOR_GEM.get()));

}
