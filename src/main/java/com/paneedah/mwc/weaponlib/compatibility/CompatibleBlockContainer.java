package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class CompatibleBlockContainer extends BlockContainer {

    protected CompatibleBlockContainer(CompatibleMaterial materialIn) {
        super(materialIn.getMaterial());
    }

    public void setBlockTextureName(String string) {
        // Do nothing
    }
    
    public Block setBlockName(String name) {
        return super.setTranslationKey(name);
    }

    @Override
    public final boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return isNormalCube(new CompatibleBlockState(state), new CompatibleBlockPos(pos));
    }
    
    public boolean isNormalCube(CompatibleBlockState state, CompatibleBlockPos pos) {
        return false;
    }
    
    @Override
    public final EnumBlockRenderType getRenderType(IBlockState state) {
        return getRenderType(new CompatibleBlockState(state)).getRenderType();
    }
    
    public CompatibleBlockRenderType getRenderType(CompatibleBlockState state) {
        return CompatibleBlockRenderType.INVISIBLE;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return isOpaqueCube(new CompatibleBlockState(state));
    }
    
    public boolean isOpaqueCube(CompatibleBlockState state) {
        return true;
    }
    
    @Override
    public final boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return onBlockActivated(worldIn, new CompatibleBlockPos(pos), new CompatibleBlockState(state), playerIn, CompatibleEnumHand.valueOf(hand), facing, hitX, hitY, hitZ);
    }
    
    public boolean onBlockActivated(World worldIn, CompatibleBlockPos pos, CompatibleBlockState state, EntityPlayer playerIn,
            CompatibleEnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return false;
    }
    
    @Override
    public final void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer,
            ItemStack stack) {
        onBlockPlacedBy(worldIn, new CompatibleBlockPos(pos), new CompatibleBlockState(state), placer, stack);
    }
    
    public void onBlockPlacedBy(World worldIn, CompatibleBlockPos pos, CompatibleBlockState state, EntityLivingBase placer,
            ItemStack stack) {
    }
}
