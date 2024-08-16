package com.paneedah.weaponlib.vehicle.collisions;

public interface IDynamicCollision {

    OreintedBB getOreintedBoundingBox();

    void updateOBB();

    void doOBBCollision();

}
