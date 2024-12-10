package com.paneedah.weaponlib.tile;

import dev.redstudio.redcore.utils.AABBUtil;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class CustomTileEntityBlock extends BlockContainer {

    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    private final Class<? extends TileEntity> tileEntityClass;
    private Function<IBlockState, ArrayList<AxisAlignedBB>> customBoundingBoxes;

    public CustomTileEntityBlock(Material material, Class<? extends TileEntity> tileEntityClass) {
        super(material);
        this.tileEntityClass = tileEntityClass;
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, FACING);
    }

    public void setBoundingBoxes(Function<IBlockState, ArrayList<AxisAlignedBB>> customBoundingBoxes) {
        this.customBoundingBoxes = customBoundingBoxes;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        if (customBoundingBoxes != null) {
            // Get the block's facing direction
            EnumFacing facing = state.getValue(FACING);

            // Retrieve the list of bounding boxes based on the block state
            List<AxisAlignedBB> boundingBoxes = customBoundingBoxes.apply(state);

            // Orient and combine all bounding boxes dynamically
            if (!boundingBoxes.isEmpty()) {
                AxisAlignedBB combinedBoundingBox = null;

                for (AxisAlignedBB boundingBox : boundingBoxes) {
                    AxisAlignedBB orientedBoundingBox = AABBUtil.orientAABB(facing, boundingBox);
                    if (combinedBoundingBox == null) {
                        combinedBoundingBox = orientedBoundingBox;
                    } else {
                        combinedBoundingBox = combinedBoundingBox.union(orientedBoundingBox);
                    }
                }

                return combinedBoundingBox != null ? combinedBoundingBox : super.getBoundingBox(state, source, pos);
            }
        }

        // Default bounding box if no custom bounding boxes are defined
        return super.getBoundingBox(state, source, pos);
    }

    @Override
    public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
        return false;
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState iBlockState) {
        return EnumBlockRenderType.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public boolean isOpaqueCube(IBlockState iBlockState) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int p_149915_2_) {
        try {
            return tileEntityClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Cannot create tile entity from class " + tileEntityClass, e);
        }
    }

    @Override
    public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        CustomTileEntity<?> entity = (CustomTileEntity<?>) world.getTileEntity(pos);

        if (entity != null) {
            entity.onEntityBlockActivated(world, pos, player);
        }

        world.markBlockRangeForRenderUpdate(pos.getX(), pos.getY(), pos.getZ(), pos.getX(), pos.getY(), pos.getZ());

        return true;
    }

    @Override
    public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase player, ItemStack stack) {
        CustomTileEntity<?> entity = (CustomTileEntity<?>) world.getTileEntity(pos);
        if (entity != null) {
            int side = MathHelper.floor(player.rotationYaw / 90f + 0.5) & 3;
            entity.setSide(side);
        }
    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.byHorizontalIndex(meta & 3));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | state.getValue(FACING).getHorizontalIndex();
        return i;
    }

    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        EnumFacing enumfacing = placer.getHorizontalFacing();

        try {
            return super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer)
                    .withProperty(FACING, enumfacing);
        } catch (IllegalArgumentException var11) {
            if (!worldIn.isRemote) {

                if (placer instanceof EntityPlayer) {
                    placer.sendMessage(new TextComponentString("Invalid damage property. Please pick in [0, 1, 2]"));
                }
            }

            return super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, 0, placer).withProperty(FACING, enumfacing);
        }
    }
}
