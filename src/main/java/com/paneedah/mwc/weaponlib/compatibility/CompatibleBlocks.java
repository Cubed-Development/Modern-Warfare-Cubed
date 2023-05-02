package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class CompatibleBlocks {

    public static final CompatibleBlocks PLANK = new CompatibleBlocks(Blocks.PLANKS);
    public static final CompatibleBlocks AIR = new CompatibleBlocks(Blocks.AIR);
    public static final CompatibleBlocks TALLGRASS = new CompatibleBlocks(Blocks.TALLGRASS);
    public static final CompatibleBlocks LEAVES = new CompatibleBlocks(Blocks.LEAVES);
    public static final CompatibleBlocks LEAVES2 = new CompatibleBlocks(Blocks.LEAVES2);
    public static final CompatibleBlocks FIRE = new CompatibleBlocks(Blocks.FIRE);
    public static final CompatibleBlocks HAY = new CompatibleBlocks(Blocks.HAY_BLOCK);
    public static final CompatibleBlocks DOUBLE_PLANT = new CompatibleBlocks(Blocks.DOUBLE_PLANT);
    public static final CompatibleBlocks WEB = new CompatibleBlocks(Blocks.WEB);
    public static final CompatibleBlocks WHEAT = new CompatibleBlocks(Blocks.WHEAT);

    public static final CompatibleBlocks STONE = new CompatibleBlocks(Blocks.STONE);
    public static final CompatibleBlocks SAND = new CompatibleBlocks(Blocks.SAND);
    public static final CompatibleBlocks TNT = new CompatibleBlocks(Blocks.TNT);
    public static final CompatibleBlocks GLASS_PANE = new CompatibleBlocks(Blocks.GLASS_PANE);
    public static final CompatibleBlocks WOOL = new CompatibleBlocks(Blocks.WOOL);
    public static final CompatibleBlocks SANDSTONE = new CompatibleBlocks(Blocks.SANDSTONE);
    public static final CompatibleBlocks STONE_BUTTON = new CompatibleBlocks(Blocks.STONE_BUTTON);
    public static final CompatibleBlocks CRAFTING_TABLE = new CompatibleBlocks(Blocks.CRAFTING_TABLE);

    private Block block;

    private CompatibleBlocks(Block block) {
        this.block = block;
    }

    public Block getBlock() {
        return block;
    }
}
