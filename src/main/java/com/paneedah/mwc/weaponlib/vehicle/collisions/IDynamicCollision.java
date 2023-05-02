package com.paneedah.mwc.weaponlib.vehicle.collisions;

public interface IDynamicCollision {
	
	public OreintedBB getOreintedBoundingBox();
	public void updateOBB();
	public void doOBBCollision();

}
