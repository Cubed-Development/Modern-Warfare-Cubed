package com.paneedah.mwc;

import com.paneedah.mwc.init.MWCBlocks;
import com.paneedah.weaponlib.config.ModernConfigManager;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGeneratorEventHandler implements IWorldGenerator {

    public WorldGeneratorEventHandler() {

    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() != 0) {
            return;
        }

        int x = chunkX * 16;
        int z = chunkZ * 16;

        addOreSpawn(MWCBlocks.copperOre, world, ModernConfigManager.copperSpawnsPerChunk, random, x, z, 9, 9, 6 + random.nextInt(4), 2, 110);

        addOreSpawn(MWCBlocks.sulfurOre, world, ModernConfigManager.sulfurSpawnsPerChunk, random, x, z, 13, 13, 6 + random.nextInt(7), 5, 90);

        addOreSpawn(MWCBlocks.tinOre, world, ModernConfigManager.tinSpawnsPerChunk, random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);

        addOreSpawn(MWCBlocks.leadOre, world, ModernConfigManager.leadSpawnsPerChunk, random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);

        addOreSpawn(MWCBlocks.graphiteOre, world, ModernConfigManager.graphiteSpawnsPerChunk, random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);
    }

    public void addOreSpawn(Block block, World world, int chancesToSpawn, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int minY, int maxY) {

        int diffBetweenMinMaxY = maxY - minY;

        for (int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBetweenMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);

            new WorldGenMinable(block.getDefaultState(), maxVeinSize).generate(world, random, new BlockPos(posX, posY, posZ));
        }
    }
}
