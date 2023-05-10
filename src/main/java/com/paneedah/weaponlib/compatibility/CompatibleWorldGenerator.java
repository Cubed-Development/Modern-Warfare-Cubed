package com.paneedah.weaponlib.compatibility;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public abstract class CompatibleWorldGenerator implements IWorldGenerator {

    public void generate(Block block, int maxVeinSize, World world, Random random, int posX, int posY, int posZ) {
        new WorldGenMinable(block.getDefaultState(), maxVeinSize).generate(world, random, new BlockPos(posX, posY, posZ));
    }
}
