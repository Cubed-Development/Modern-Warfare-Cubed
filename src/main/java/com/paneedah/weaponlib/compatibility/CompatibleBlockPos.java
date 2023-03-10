package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.math.BlockPos;

public class CompatibleBlockPos {

    private BlockPos blockPos;

    public CompatibleBlockPos(BlockPos blockPos) {
        this.blockPos = blockPos;
    }

    public CompatibleBlockPos(int xCoord, int yCoord, int zCoord) {
        this.blockPos = new BlockPos(xCoord, yCoord, zCoord);
    }

    public CompatibleBlockPos(CompatibleVec3 projectedPos) {
        this.blockPos = new BlockPos(projectedPos.getVec());
    }

    public BlockPos getBlockPos() {
        return blockPos;
    }

    public int getBlockPosX() {
        return blockPos.getX();
    }

    public int getBlockPosY() {
        return blockPos.getY();
    }

    public int getBlockPosZ() {
        return blockPos.getZ();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((blockPos == null) ? 0 : blockPos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CompatibleBlockPos other = (CompatibleBlockPos) obj;
        if (blockPos == null) {
            if (other.blockPos != null)
                return false;
        } else if (!blockPos.equals(other.blockPos))
            return false;
        return true;
    }
}
