package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.math.Vec3d;

public class CompatibleVec3 {

	private Vec3d vec;

	public CompatibleVec3(Vec3d vec) {
		this.vec = vec;
	}

	public CompatibleVec3(double posX, double posY, double posZ) {
        this.vec = new Vec3d(posX, posY, posZ);
    }

	public CompatibleVec3(CompatibleVec3 hitVec) {
	    this.vec = new Vec3d(hitVec.getVec().x, hitVec.getVec().y, hitVec.getVec().z);
    }

    public Vec3d getVec() {
		return vec;
	}

    public double distanceTo(CompatibleVec3 otherVec) {
        return vec.distanceTo(otherVec.vec);
    }

    public double getXCoord() {
        return vec.x;
    }

    public double getYCoord() {
        return vec.y;
    }

    public double getZCoord() {
        return vec.z;
    }

    public static CompatibleVec3 fromCompatibleVec3(CompatibleVec3 other) {
        return other != null ? new CompatibleVec3(other) : null;
    }
}
