package com.paneedah.weaponlib.compatibility;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;

import java.util.ArrayList;
import java.util.List;

public class CompatibleRayTraceResult {
	public static enum Type {
		MISS,
		BLOCK,
		ENTITY;
	};

	private RayTraceResult position;
	private CompatibleVec3 hitVec;
	private CompatibleBlockPos blockPos;
	private List<BlockPos> passThrus = new ArrayList<>();

	static CompatibleRayTraceResult fromRayTraceResult (RayTraceResult position) {
		return position != null ? new CompatibleRayTraceResult(position) : null;
	}
	
	protected CompatibleRayTraceResult() {
		
	}
	
	protected void postInit(RayTraceResult position) {
		this.position = position;
		init();
	}

	private CompatibleRayTraceResult(RayTraceResult position) {
	    this.position = position;
	    init();
	}

	public CompatibleRayTraceResult(Entity entity) {
	    this.position = new RayTraceResult(entity);
	    init();
    }
	
	public void addPassThru(BlockPos pos) {
		this.passThrus.add(pos);
	}

	private void init() {
	    this.hitVec = position.hitVec != null ? new CompatibleVec3(position.hitVec) : null;
	    this.blockPos = position.getBlockPos() != null ? new CompatibleBlockPos(position.getBlockPos()) : null;

	}

    protected RayTraceResult getPosition() {
		return position;
	}

	public Entity getEntityHit() {
		return position.entityHit;
	}

	public Type getTypeOfHit() {
		Type result = null;
		switch(position.typeOfHit) {
		case BLOCK: result = Type.BLOCK; break;
		case ENTITY: result = Type.ENTITY; break;
		case MISS: result = Type.MISS; break;
		}
		return result;
	}

	public int getBlockPosX() {
		return blockPos.getBlockPos().getX();
	}

	public int getBlockPosY() {
		return blockPos.getBlockPos().getY();
	}

	public int getBlockPosZ() {
		return blockPos.getBlockPos().getZ();
	}
	
	public List<BlockPos> getPassThrus() {
		return passThrus;
	}

	public CompatibleBlockPos getBlockPos() {
	    return blockPos;
	}

	public void setSideHit(CompatibleEnumFacing sideHit) {
	    position.sideHit = sideHit.getEnumFacing();
	}

	public CompatibleEnumFacing getSideHit() {

	    CompatibleEnumFacing result = null;
	    switch(position.sideHit) {
	    case UP:
	        result = CompatibleEnumFacing.UP;
	        break;
	    case DOWN:
            result = CompatibleEnumFacing.DOWN;
            break;
	    case EAST:
            result = CompatibleEnumFacing.EAST;
            break;
	    case WEST:
            result = CompatibleEnumFacing.WEST;
            break;
	    case NORTH:
	        result = CompatibleEnumFacing.NORTH;
            break;
	    case SOUTH:
	        result = CompatibleEnumFacing.SOUTH;
            break;
	    }
	    return result;
	}

    public CompatibleVec3 getHitVec() {
        return hitVec;
    }

    public void setHitVec(CompatibleVec3 hitVec) {
        position.hitVec = hitVec.getVec();
        this.hitVec = hitVec;
    }
}
