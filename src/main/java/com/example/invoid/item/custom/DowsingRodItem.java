package com.example.invoid.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class DowsingRodItem extends Item {
    public DowsingRodItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(pContext.getLevel().isClientSide()){
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;
            for(int i = 0;i<=positionClicked.getY()+32;i++){
                Block blockBelow = pContext.getLevel().getBlockState(positionClicked.below(i)).getBlock();
                if(isValuableBlock(blockBelow)){
                    outputValuableCoordinates(positionClicked.below(i),player,blockBelow);
                    foundBlock = true;
                    break;
                }
            }
            if(!foundBlock){
                player.sendMessage(new TranslatableComponent("item.invoid.dowsing_rod.novalues"),
                        player.getUUID());
            }
        }
        pContext.getItemInHand().hurtAndBreak(1,pContext.getPlayer(),
                (player)->player.broadcastBreakEvent(player.getUsedItemHand()));
        return super.useOn(pContext);
    }
    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block blockBelow){
        player.sendMessage(new TextComponent("Found"+blockBelow.asItem().getRegistryName().toString()),player.getUUID());
    }
    private boolean isValuableBlock(Block block){
        return block == Blocks.IRON_ORE || block == Blocks.DIAMOND_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE
                || block == Blocks.GOLD_ORE || block == Blocks.DEEPSLATE_GOLD_ORE;
    }
}
