package com.paneedah.weaponlib.compatibility;

import com.paneedah.mwc.vectors.Vector3D;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.function.BiPredicate;

public class CompatibleRayTracing {

	
	public static Vec3d directionFromEnumFacing(EnumFacing facing) {
		switch(facing) {
			case UP:
				return new Vec3d(0, 1, 0);
			case DOWN:
				return new Vec3d(0, -1, 0);
			case EAST:
				return new Vec3d(1, 0, 0);
			case WEST:
				return new Vec3d(-1, 0, 0);
			case NORTH:
				return new Vec3d(0, 0, -1);
			case SOUTH:
				return new Vec3d(0, 0, 1);
			default:
				return Vec3d.ZERO;
		}
	}
	
    public static RayTraceResult rayTraceBlocks(World world, Vector3D cvec31, Vector3D cvec32, BiPredicate<Block, IBlockState> isCollidable) {
        //boolean stopOnLiquid,
        Vector3D vec31 = cvec31;
        boolean ignoreBlockWithoutBoundingBox = false;
        boolean returnLastUncollidableBlock = false;

        if (!Double.isNaN(vec31.x) && !Double.isNaN(vec31.y) && !Double.isNaN(vec31.z))
        {
            if (!Double.isNaN(cvec32.x) && !Double.isNaN(cvec32.y) && !Double.isNaN(cvec32.z))
            {
                int i = MathHelper.floor(cvec32.x);
                int j = MathHelper.floor(cvec32.y);
                int k = MathHelper.floor(cvec32.z);
                int l = MathHelper.floor(vec31.x);
                int i1 = MathHelper.floor(vec31.y);
                int j1 = MathHelper.floor(vec31.z);
                BlockPos blockpos = new BlockPos(l, i1, j1);
                IBlockState iBlockState = world.getBlockState(blockpos);
                Block block = iBlockState.getBlock();
                
                if ((!ignoreBlockWithoutBoundingBox || iBlockState.getCollisionBoundingBox(world, blockpos) != Block.NULL_AABB)
                        && isCollidable.test(block, iBlockState))
                {
                    RayTraceResult raytraceresult = iBlockState.collisionRayTrace(world, blockpos, new Vec3d(vec31.x, vec31.y, vec31.z), new Vec3d(cvec32.x, cvec32.y, cvec32.z));

                    if (raytraceresult != null)
                    {
                        return raytraceresult;
                    }
                }

                RayTraceResult raytraceresult2 = null;
                int k1 = 200;

                while (k1-- >= 0)
                {
                    if (Double.isNaN(vec31.x) || Double.isNaN(vec31.y) || Double.isNaN(vec31.z))
                    {
                        return null;
                    }

                    if (l == i && i1 == j && j1 == k)
                    {
                    	if(returnLastUncollidableBlock) {
                    		return raytraceresult2;
                    	} else {
                    		return null;
                    	}
                       // return returnLastUncollidableBlock ? raytraceresult2 : null;
                    }

                    boolean flag2 = true;
                    boolean flag = true;
                    boolean flag1 = true;
                    double d0 = 999.0D;
                    double d1 = 999.0D;
                    double d2 = 999.0D;

                    if (i > l)
                    {
                        d0 = (double)l + 1.0D;
                    }
                    else if (i < l)
                    {
                        d0 = (double)l + 0.0D;
                    }
                    else
                    {
                        flag2 = false;
                    }

                    if (j > i1)
                    {
                        d1 = (double)i1 + 1.0D;
                    }
                    else if (j < i1)
                    {
                        d1 = (double)i1 + 0.0D;
                    }
                    else
                    {
                        flag = false;
                    }

                    if (k > j1)
                    {
                        d2 = (double)j1 + 1.0D;
                    }
                    else if (k < j1)
                    {
                        d2 = (double)j1 + 0.0D;
                    }
                    else
                    {
                        flag1 = false;
                    }

                    double d3 = 999.0D;
                    double d4 = 999.0D;
                    double d5 = 999.0D;
                    double d6 = cvec32.x - vec31.x;
                    double d7 = cvec32.y - vec31.y;
                    double d8 = cvec32.z - vec31.z;

                    if (flag2)
                    {
                        d3 = (d0 - vec31.x) / d6;
                    }

                    if (flag)
                    {
                        d4 = (d1 - vec31.y) / d7;
                    }

                    if (flag1)
                    {
                        d5 = (d2 - vec31.z) / d8;
                    }

                    if (d3 == -0.0D)
                    {
                        d3 = -1.0E-4D;
                    }

                    if (d4 == -0.0D)
                    {
                        d4 = -1.0E-4D;
                    }

                    if (d5 == -0.0D)
                    {
                        d5 = -1.0E-4D;
                    }

                    EnumFacing enumfacing;

                    if (d3 < d4 && d3 < d5)
                    {
                        enumfacing = i > l ? EnumFacing.WEST : EnumFacing.EAST;
                        vec31 = new Vector3D(d0, vec31.y + d7 * d3, vec31.z + d8 * d3);
                    }
                    else if (d4 < d5)
                    {
                        enumfacing = j > i1 ? EnumFacing.DOWN : EnumFacing.UP;
                        vec31 = new Vector3D(vec31.x + d6 * d4, d1, vec31.z + d8 * d4);
                    }
                    else
                    {
                        enumfacing = k > j1 ? EnumFacing.NORTH : EnumFacing.SOUTH;
                        vec31 = new Vector3D(vec31.x + d6 * d5, vec31.y + d7 * d5, d2);
                    }

                    l = MathHelper.floor(vec31.x) - (enumfacing == EnumFacing.EAST ? 1 : 0);
                    i1 = MathHelper.floor(vec31.y) - (enumfacing == EnumFacing.UP ? 1 : 0);
                    j1 = MathHelper.floor(vec31.z) - (enumfacing == EnumFacing.SOUTH ? 1 : 0);
                    blockpos = new BlockPos(l, i1, j1);
                    IBlockState iBlockState1 = world.getBlockState(blockpos);
                    Block block1 = iBlockState1.getBlock();

                    if (!ignoreBlockWithoutBoundingBox || iBlockState1.getMaterial() == Material.PORTAL || iBlockState1.getCollisionBoundingBox(world, blockpos) != Block.NULL_AABB)
                    {
                        if (isCollidable.test(block1, iBlockState1))
                        {
                            RayTraceResult raytraceresult1 = iBlockState1.collisionRayTrace(world, blockpos, new Vec3d(vec31.x, vec31.y, vec31.z), new Vec3d(cvec32.x, cvec32.y, cvec32.z));

                            if (raytraceresult1 != null)
                            {
                            	return raytraceresult1;
                            }
                        }
                        else
                        {
                            raytraceresult2 = new RayTraceResult(RayTraceResult.Type.MISS, new Vec3d(vec31.x, vec31.y, vec31.z), enumfacing, blockpos);
                        }
                    }
                }

                if(returnLastUncollidableBlock) {
                	return raytraceresult2;
                } else return null;
                //return returnLastUncollidableBlock ? raytraceresult2 : null;
            }
            else
            {
                return null;
            }
        }
        else
        {
            return null;
        }
    }
}
