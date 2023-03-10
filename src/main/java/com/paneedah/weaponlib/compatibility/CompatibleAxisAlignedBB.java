package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.math.AxisAlignedBB;

public class CompatibleAxisAlignedBB {

    private AxisAlignedBB boundingBox;

    public CompatibleAxisAlignedBB(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.boundingBox = new AxisAlignedBB(x1, y1, z1, x2, y2, z2);
    }

    CompatibleAxisAlignedBB(AxisAlignedBB boundingBox) {
        this.boundingBox = boundingBox;
    }

    public CompatibleAxisAlignedBB(CompatibleBlockPos blockPos) {
        this.boundingBox = new AxisAlignedBB(blockPos.getBlockPos());
    }

    AxisAlignedBB getBoundingBox() {
        return boundingBox;
    }

    public CompatibleAxisAlignedBB offset(double x, double y, double z) {
        return new CompatibleAxisAlignedBB(boundingBox.offset(x, y, z));
    }

    public boolean intersectsWith(CompatibleAxisAlignedBB other) {
        return boundingBox.intersects(other.boundingBox);
    }

    public CompatibleRayTraceResult calculateIntercept(CompatibleVec3 vec3, CompatibleVec3 vec31) {
        return CompatibleRayTraceResult.fromRayTraceResult(boundingBox.calculateIntercept(vec3.getVec(), vec31.getVec()));
    }

    public CompatibleAxisAlignedBB addCoord(double x, double y, double z) {
        return new CompatibleAxisAlignedBB(this.boundingBox.expand(x, y, z));
    }

    public CompatibleAxisAlignedBB expand(double x, double y, double z) {
        return new CompatibleAxisAlignedBB(boundingBox.grow(x, y, z));
    }

    public double getAverageEdgeLength() {
        return boundingBox.getAverageEdgeLength();
    }

    public double getMinY() {
        return boundingBox.minY;
    }
}
