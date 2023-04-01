package com.paneedah.weaponlib.compatibility;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
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

    protected CompatibleBlockContainer(Material materialIn) {
        super(materialIn);
    }

    public void setBlockTextureName(String string) {
        // Do nothing
    }
    
    public Block setBlockName(String name) {
        return super.setTranslationKey(name);
    }

    @Override
    public final boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return isNormalCube(state, pos);
    }
    
    public boolean isNormalCube(IBlockState state, BlockPos pos) {
        return false;
    }
    
    @Override
    public final EnumBlockRenderType getRenderType(IBlockState state) {
        return getCompatibleRenderType(state).getRenderType();
    }

    public CompatibleBlockRenderType getCompatibleRenderType(IBlockState state) {
        return CompatibleBlockRenderType.INVISIBLE;
    }
    
    @Override
    public boolean isOpaqueCube(IBlockState iBlockState) {
        return true;
    }
    
    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        return false;
    }
    
    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
    }
}
