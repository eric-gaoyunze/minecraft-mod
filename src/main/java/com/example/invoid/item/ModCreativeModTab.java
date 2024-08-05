package com.example.invoid.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab INVOID_TAB = new CreativeModeTab("invoidtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.VOID_POWDER.get());
        }
    };
}
