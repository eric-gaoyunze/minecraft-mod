package com.example.invoid.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class GemCuttingStationBlock extends Block {
    public GemCuttingStationBlock(Properties p_49795_) {
        super(p_49795_);
    }
    private static final VoxelShape SHAPE =
            Block.box(0,0,0,16,9,16);
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext){
        return SHAPE;
    }
}
