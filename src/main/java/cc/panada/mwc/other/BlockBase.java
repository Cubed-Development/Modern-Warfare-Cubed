package cc.panada.mwc.other;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import org.jetbrains.annotations.NotNull;

public class BlockBase extends Block {

    private final AxisAlignedBB BlockModel;

    private final boolean opaqueCub;
    private final boolean FullCube;

    public BlockBase(@NotNull final String name,
                     @NotNull final Material soundMaterial,
                     final float hardness,
                     final float resistance,
                     @NotNull final CreativeTabs creativeTabs,
                     final boolean opaqueCube,
                     final boolean FullCube,
                     @NotNull final AxisAlignedBB axisAlignedBB) {
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
    public boolean isOpaqueCube(@NotNull final IBlockState state) {
        return opaqueCub;
    }

    @Override
    public boolean isFullCube(@NotNull final IBlockState state) {
        return FullCube;
    }

    @Override
    public @NotNull AxisAlignedBB getBoundingBox(@NotNull final IBlockState state, @NotNull final IBlockAccess source, @NotNull final BlockPos pos) {
        return BlockModel;
    }
}
