package cc.panada.MWC.init;

import cc.panada.MWC.Blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();
    public static final Block SOMETHINGORE = new BlockBase("cool_ore", Material.IRON, 10f, CreativeTabs.BUILDING_BLOCKS);
}
