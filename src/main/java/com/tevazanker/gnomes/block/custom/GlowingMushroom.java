package com.tevazanker.gnomes.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.MushroomBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.phys.BlockHitResult;

import java.util.Random;
import java.util.function.Supplier;

public class GlowingMushroom extends MushroomBlock {

    public static final BooleanProperty GLOWING = BooleanProperty.create("glowing");
    public GlowingMushroom(Properties pProperties, Supplier<Holder<? extends ConfiguredFeature<?, ?>>> pFeatureSupplier) {
        super(pProperties, pFeatureSupplier);
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return true;
    }

    @Override
    public boolean isValidBonemealTarget(BlockGetter pLevel, BlockPos pPos, BlockState pState, boolean pIsClient) {
        return false;
    }

    @Override
    public boolean isBonemealSuccess(Level pLevel, Random pRandom, BlockPos pPos, BlockState pState) {
        return false;
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit){

        if(!pLevel.isClientSide() && pHand == InteractionHand.MAIN_HAND){
            boolean currentState = pState.getValue(GLOWING);
            pLevel.setBlock(pPos, pState.setValue(GLOWING, !currentState), 3);

        }

        return  InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder){
        pBuilder.add(GLOWING);
    }

}
