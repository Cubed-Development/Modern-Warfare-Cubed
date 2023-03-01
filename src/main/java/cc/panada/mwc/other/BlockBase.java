package cc.panada.mwc.other;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBase extends Block {

    private final AxisAlignedBB BlockModel;

    private final boolean opaqueCub;
    private final boolean FullCube;

    public BlockBase(String name, Material soundMaterial, float hardness, float resistance, CreativeTabs creativeTabs, boolean opaqueCube, boolean FullCube, AxisAlignedBB axisAlignedBB) {
        super(soundMaterial);

        this.opaqueCub = opaqueCube;
        this.FullCube = FullCube;
        this.BlockModel = axisAlignedBB;

        setHardness(hardness);
        setResistance(resistance);

        setTranslationKey(name);
        setRegistryName(name);

        setCreativeTab(creativeTabs);

        MainRegistry.blocks.add(this);
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
        return BlockModel;
    }
}
