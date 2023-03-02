package cc.panada.mwc.other;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBase extends Block {

    private final boolean canBlockStayBoolean;

    private boolean canBlockStay(World worldIn, BlockPos pos) {
        return worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos, EnumFacing.UP);
    }

    public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL); {
        this.setDefaultState(blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    private final AxisAlignedBB BlockModel;
    private final AxisAlignedBB BlockModel_WE;

    private final boolean opaqueCub;
    private final boolean FullCube;

    public BlockBase(String name, Material soundMaterial, float hardness, float resistance, String harvest, int harvestLevel, CreativeTabs creativeTabs, boolean opaqueCube, boolean FullCube, AxisAlignedBB axisAlignedBB, AxisAlignedBB axisAlignedBB_WE, Boolean underBlockDestructionInverted) {
        super(soundMaterial);

        this.opaqueCub = opaqueCube;
        this.FullCube = FullCube;
        this.BlockModel = axisAlignedBB;
        this.BlockModel_WE = axisAlignedBB_WE;
        this.canBlockStayBoolean = underBlockDestructionInverted;

        setHardness(hardness);
        setResistance(resistance);

        setTranslationKey(name);
        setRegistryName(name);

        setCreativeTab(creativeTabs);
        setHarvestLevel(harvest, harvestLevel);

        MainRegistry.blocks.add(this);
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        EnumFacing facing = EnumFacing.byIndex(meta);

        if(facing.getAxis() == EnumFacing.Axis.Y)
            facing = EnumFacing.NORTH;

        return getDefaultState().withProperty(FACING, facing);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        return ((EnumFacing) state.getValue(FACING)).getIndex();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos,EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return getDefaultState().withProperty(FACING, placer.getHorizontalFacing());
    }

    @Override
    public boolean canPlaceBlockAt(World worldIn, BlockPos pos) {
        return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos) : canBlockStayBoolean;
    }

    @Override
    public void observedNeighborChange(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
        if(!this.canBlockStayBoolean) {
            worldIn.setBlockToAir(pos);
            InventoryHelper.spawnItemStack(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(MainRegistry.WORKBENCH));
        }
    }

    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return opaqueCub;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return FullCube;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        switch(((EnumFacing)state.getValue(FACING))) {
            case SOUTH:
                default:
                return BlockModel;
            case EAST:
            case WEST:
                return BlockModel_WE;
        }
    }
}