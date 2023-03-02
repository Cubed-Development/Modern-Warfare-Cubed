package cc.panada.mwc.other;

import cc.panada.mwc.registry.MainRegistry;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class BlockOreBase extends BlockOre {

    private final Item itemDrop;

    public BlockOreBase(@NotNull final String name,
                        @NotNull final Item itemDrop,
                        final float hardness,
                        final float resistance,
                        @NotNull final String harvest,
                        final int harvestLevel,
                        @NotNull final CreativeTabs creativeTabs) {
        setHardness(hardness);
        setResistance(resistance);

        setRegistryName(name);
        setTranslationKey(name);

        setHarvestLevel(harvest, harvestLevel);
        setCreativeTab(creativeTabs);

        this.itemDrop = itemDrop;

        MainRegistry.blocks.add(this);
    }

    @Override
    public @NotNull Item getItemDropped(@NotNull final IBlockState state, @NotNull final Random rand, final int fortune) {
        return itemDrop;
    }

}
