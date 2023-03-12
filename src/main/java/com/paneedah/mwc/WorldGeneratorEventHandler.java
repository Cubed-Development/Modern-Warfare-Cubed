package com.paneedah.mwc;

import com.paneedah.mwc.init.MwBlocks;
import com.paneedah.weaponlib.compatibility.CompatibleBlocks;
import com.paneedah.weaponlib.compatibility.CompatibleWorldGenerator;
import com.paneedah.weaponlib.config.ModernConfigManager;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;

import java.util.Random;

public class WorldGeneratorEventHandler extends CompatibleWorldGenerator {

    public WorldGeneratorEventHandler() {

    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        if (world.provider.getDimension() != 0)
            return;

        int x = chunkX * 16;
        int z = chunkZ * 16;

        addOreSpawn(MwBlocks.copperOre, CompatibleBlocks.STONE, world, ModernConfigManager.copperSpawnsPerChunk,
                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 110);

        addOreSpawn(MwBlocks.sulfurOre, CompatibleBlocks.STONE, world, ModernConfigManager.sulfurSpawnsPerChunk,
                random, x, z, 13, 13, 6 + random.nextInt(7), 5, 90);

        addOreSpawn(MwBlocks.tinOre, CompatibleBlocks.STONE, world, ModernConfigManager.tinSpawnsPerChunk,
                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);

        addOreSpawn(MwBlocks.leadOre, CompatibleBlocks.STONE, world, ModernConfigManager.leadSpawnsPerChunk,
                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);

        addOreSpawn(MwBlocks.graphiteOre, CompatibleBlocks.STONE, world, ModernConfigManager.graphiteSpawnsPerChunk,
                random, x, z, 9, 9, 6 + random.nextInt(4), 2, 80);
    }

    public void addOreSpawn(Block block, CompatibleBlocks target, World world, int chancesToSpawn,
            Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
            int minY, int maxY) {

        int diffBetweenMinMaxY = maxY - minY;

        for (int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBetweenMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);

            generate(block, maxVeinSize, target, world, random, posX, posY, posZ);
        }
    }
}
