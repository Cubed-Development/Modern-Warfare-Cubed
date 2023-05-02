package com.paneedah.mwc.weaponlib.tile;

import com.paneedah.mwc.weaponlib.compatibility.*;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.function.Function;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class CustomTileEntityBlock extends CompatibleBlockContainer {
	
    public static final PropertyDirection FACING = BlockHorizontal.FACING;

    private Class<? extends TileEntity> tileEntityClass;
    private Function<IBlockState, AxisAlignedBB> customBoundingBox;
    
    protected CustomTileEntityBlock(CompatibleMaterial material, Class<? extends TileEntity> tileEntityClass) {
        super(material);
        this.tileEntityClass = tileEntityClass;
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }
    
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }
    
    public void setBoundingBox(Function<IBlockState, AxisAlignedBB> customBoundingBox) {
		this.customBoundingBox = customBoundingBox;
	}
    
    @SuppressWarnings("deprecation")
	@Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
    	return customBoundingBox != null ? customBoundingBox.apply(state) : 
    		super.getBoundingBox(state, source, pos);
    }
    
    @Override
    public boolean isNormalCube(CompatibleBlockState state, CompatibleBlockPos pos) {
        return false;
    }
    
    @Override
    public CompatibleBlockRenderType getRenderType(CompatibleBlockState state) {
        return CompatibleBlockRenderType.ENTITYBLOCK_ANIMATED;
    }
    
    
    
    

    @Override
    public boolean isOpaqueCube(CompatibleBlockState state) {
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
    public boolean onBlockActivated(World world, CompatibleBlockPos pos, CompatibleBlockState state,
            EntityPlayer player, CompatibleEnumHand hand, EnumFacing facing, float hitX, float hitY,
            float hitZ) {
        
    	//System.out.println("Hola que pasa? " + getRenderType(getDefaultState()));
    	
        CustomTileEntity<?> entity = (CustomTileEntity<?>)compatibility.getTileEntity(world, pos);
        
        if(entity != null) {
            entity.onEntityBlockActivated(world, pos, player);
        }
        
        compatibility.markBlockForUpdate(world, pos);
        
        return true;
    }
    
    @Override
    public void onBlockPlacedBy(World world, CompatibleBlockPos pos, CompatibleBlockState state,
            EntityLivingBase player, ItemStack stack) {
        CustomTileEntity<?> entity = (CustomTileEntity<?>)compatibility.getTileEntity(world, pos);
        if(entity != null) {
            int side = CompatibleMathHelper.floor_double(player.rotationYaw/90f + 0.5) & 3;
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
        i = i | ((EnumFacing)state.getValue(FACING)).getHorizontalIndex();
        return i;
    }
    
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        EnumFacing enumfacing = placer.getHorizontalFacing();

        try
        {
            return super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer)
            		.withProperty(FACING, enumfacing);
        }
        catch (IllegalArgumentException var11)
        {
            if (!worldIn.isRemote)
            {
                
                if (placer instanceof EntityPlayer)
                {
                    placer.sendMessage(new TextComponentTranslation("Invalid damage property. Please pick in [0, 1, 2]", new Object[0]));
                }
            }

            return super.getStateForPlacement(worldIn, pos, facing, hitX, hitY, hitZ, 0, placer).withProperty(FACING, enumfacing);
        }
    }

	
}
