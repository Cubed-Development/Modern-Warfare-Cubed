package com.paneedah.mwc.weaponlib.compatibility;

import com.paneedah.mwc.vectors.Vector3D;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import java.util.ArrayList;
import java.util.List;

public class CompatibleRayTraceResult {
	public static enum Type {
		MISS,
		BLOCK,
		ENTITY;
	};

	private RayTraceResult position;
	private Vector3D hitVec;
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
	    this.hitVec = position.hitVec != null ? new Vector3D(position.hitVec) : null;
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

	public void setSideHit(EnumFacing sideHit) {
	    position.sideHit = sideHit;
	}

	public EnumFacing getSideHit() {

		EnumFacing result = null;
	    switch(position.sideHit) {
	    case UP:
	        result = EnumFacing.UP;
	        break;
	    case DOWN:
            result = EnumFacing.DOWN;
            break;
	    case EAST:
            result = EnumFacing.EAST;
            break;
	    case WEST:
            result = EnumFacing.WEST;
            break;
	    case NORTH:
	        result = EnumFacing.NORTH;
            break;
	    case SOUTH:
	        result = EnumFacing.SOUTH;
            break;
	    }
	    return result;
	}

    public Vector3D getHitVec() {
        return hitVec;
    }

    public void setHitVec(Vector3D hitVec) {
        position.hitVec = new Vec3d(hitVec.x, hitVec.y, hitVec.z);
        this.hitVec = hitVec;
    }
}
