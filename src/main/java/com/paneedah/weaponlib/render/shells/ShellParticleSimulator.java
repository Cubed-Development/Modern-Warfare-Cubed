package com.paneedah.weaponlib.render.shells;

import com.paneedah.weaponlib.model.Bullet556;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;

import javax.vecmath.Vector3d;
import java.util.ArrayList;
import java.util.List;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ShellParticleSimulator {
	
	public static final double CHUNK_SIZE = 1.5;
	
	private static final int SHELL_LIFE = 1024;
	private static final double RESTITUTION = 0.3;
	
	public static Bullet556 bulletModel = new Bullet556();
	
	

	public static class Shell {
		
		public static enum Type {
			SHOTGUN,
			ASSAULT,
			PISTOL
		}
		
		private boolean sleeping;
		private Type type;
		public int age = 0;
		public boolean onGround = false;
		public boolean shouldDie = false;
		public Vector3d pos = new Vector3d(0, 0, 0);
		public Vector3d prevPos = new Vector3d(0, 0, 0);
		public Vector3d velocity = new Vector3d(0, 0, 0);
		

		public Vector3d prevRot = new Vector3d(0, 0, 0);
		public Vector3d rot = new Vector3d(0, 0, 0);
		
		private double height;
		
		
		
		public Shell(Type type, Vec3d pos, Vec3d rot, Vec3d velocity) {
			//this.prevPos = this.pos.subtract(velocity);
			
			setType(type);
			this.pos = new Vector3d(pos.x, pos.y, pos.z);
			
			
			this.pos.x += velocity.x;
			this.pos.y += velocity.y;
			this.pos.z += velocity.z;
			
			
			this.rot = new Vector3d(rot.x, rot.y, rot.z);
			//this.rot = new Vector3d(-45, 0, 0);
			this.prevRot = this.rot;
			this.prevPos = new Vector3d(this.pos.x-velocity.x, this.pos.y-velocity.y, this.pos.z-velocity.z);
			//this.prevPos = this.pos;
			
			//this.prevRot = new Vector3d(0, 20, 0);
			
			//this.prevPos = this.prevPos.subtract(-20, 0, 0);
			
			this.prevRot = new Vector3d(Math.random()*100, Math.random()*100, Math.random()*100);
			}
		
		public Type getType() {
			return this.type;
		}
		
		public boolean isSleeping() {
			return this.sleeping;
		}
		
		public void sleep() {
			this.sleeping = true;
		}
		
		public void wake() {
			this.sleeping = false;
		}
		
		public void setType(Type type) {
			this.type = type;
		}
		
		public void ageShell() {
			this.age++;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public void setHeight(double height) {
			this.height = height;
		}
		
		public double getHeight() {
			return this.height;
		}
	
		
		public boolean shouldDie() {
			return this.shouldDie;
		}
		
		public void kill() {
			setShouldDie(true);
		}
		
		public void setShouldDie(boolean state) {
			this.shouldDie = state;
		}
		
	}
	

	
	
	
	public void update(ArrayList<Shell> shells, double dt) {
		
	//	dt = 0.1;
		
		
		
		
		// Removes old shells that were marked for death
		shells.removeIf((s) -> s.shouldDie());
	
		
		
		//dt = 1;
		
		// Don't use an iterator to prevent concurrent
		// modification errors
		
		//System.out.println(shells.size());
		for(int i = 0; i < shells.size(); ++i) {
			
			
			
			Shell sh = shells.get(i);
			
			
			if(sh.getAge() > SHELL_LIFE) {
				sh.kill();
			}
			sh.ageShell();
			
			
			// If the shell is in sleep mode,
			// no need to update it.
			if(sh.isSleeping()) continue;
			
		
			//System.out.println(shells.size());
			
			
			
			Vector3d tempPos = (Vector3d) sh.pos.clone();
			Vector3d tempRot = (Vector3d) sh.rot.clone();
			
			sh.pos.x += sh.pos.x - sh.prevPos.x;
			sh.pos.y += sh.pos.y - sh.prevPos.y - 0.05;
			sh.pos.z += sh.pos.z - sh.prevPos.z;
			
			double decay = 0.9;
			
			sh.rot.x += (sh.rot.x - sh.prevRot.x) * decay;
			sh.rot.y += (sh.rot.y - sh.prevRot.y) * decay;
			sh.rot.z += (sh.rot.z - sh.prevRot.z) * decay;
			
			
			sh.prevPos = tempPos;
			sh.prevRot = tempRot;
		
			
			
			
			
			boolean bounceY = false;
			boolean bounceHorizontal = false;
			
			Vec3d next = new Vec3d(sh.pos.x + (sh.pos.x-sh.prevPos.x)*0.5,
					sh.pos.y + (sh.pos.y-sh.prevPos.y)*0.5,
					sh.pos.z + (sh.pos.z-sh.prevPos.z)*0.5);
			
			/*
			RayTraceResult rtr = mc.world.rayTraceBlocks(new Vec3d(sh.pos.x, sh.pos.y+0.1, sh.pos.z),
					next, false, true, false);
					
			*/
			RayTraceResult rtr = mc.world.rayTraceBlocks(new Vec3d(sh.prevPos.x, sh.prevPos.y, sh.prevPos.z), new Vec3d(sh.pos.x, sh.pos.y, sh.pos.z), false, true, false);
			if(rtr != null) {

				EnumFacing side = rtr.sideHit;
				if(side == EnumFacing.NORTH || side == EnumFacing.SOUTH || side == EnumFacing.WEST || side == EnumFacing.EAST) {
					
					//System.out.println(rtr.hitVec);
					bounceHorizontal = true;
				
				} else {
					//System.out.println(rtr.hitVec);
					bounceY = true;
				}
				
			}
			
			
			
			
			
			

			
			
			double elas = 0.9;
			double friction = 0.3;
			
			if(bounceY) {
				
				double tempY = sh.prevPos.y;
				sh.prevPos.y = sh.pos.y;
				
				sh.pos.y = sh.pos.y + (tempY-sh.prevPos.y)*elas;
				
				sh.prevPos.y = sh.prevPos.y + (sh.pos.y - sh.prevPos.y)*0.7;
				
				
				sh.pos.x = sh.pos.x + (sh.prevPos.x - sh.pos.x)*friction;
				sh.pos.z = sh.pos.z + (sh.prevPos.z - sh.pos.z)*friction;
				
				/*
				Vector3d tempRotation = (Vector3d) sh.rot.clone();
				sh.rot = sh.prevRot;
				sh.prevRot = tempRotation;
				*/
				
				
			}
			
			double hitRotationImpulse = 500;
			
			if(bounceHorizontal) {
				
				double tempX = sh.prevPos.x;
				double tempZ = sh.prevPos.z;
				
				sh.prevPos.x = sh.pos.x;
				sh.prevPos.z = sh.pos.z;
				
				sh.pos.x = sh.pos.x + (tempX-sh.prevPos.x)*elas;
				sh.pos.z = sh.pos.z + (tempZ-sh.prevPos.z)*elas;
				sh.prevRot.x = sh.prevRot.x + (Math.random()*hitRotationImpulse - (hitRotationImpulse/2));
				sh.prevRot.z = sh.prevRot.z + (Math.random()*hitRotationImpulse - (hitRotationImpulse/2));
				
				
				
				
				
				
			}
			
			
			

			
			
			
			
			
			AxisAlignedBB box = new AxisAlignedBB(-0.1, -0.1, -0.1, .1, .1, .1);
			box = box.grow(0.1);
			box = box.offset(new Vec3d(sh.pos.x, sh.pos.y-0.9, sh.pos.z));
			
			List<AxisAlignedBB> list = mc.world.getCollisionBoxes(null, box);
			
			Vec3d separationVector = Vec3d.ZERO;
			double penetrationDepth = Double.MIN_VALUE;
			double zOffset = sh.pos.z;
			double xOffset = sh.pos.x;
			for(AxisAlignedBB b : list) {

				
				zOffset = b.calculateZOffset(box, zOffset);
				xOffset = b.calculateXOffset(box, xOffset);
				
				if(sh.pos.y < b.maxY) {
					sh.pos.y = b.maxY;
				
					// Is this good?
					//sh.prevPos = sh.pos;
					
					
					
					Vector3d tempVector = (Vector3d) sh.pos.clone();
					tempVector.sub(sh.prevPos);
					
					Vector3d tempRotat = (Vector3d) sh.rot.clone();
					tempRotat.sub(sh.prevRot);
					
					if(tempVector.lengthSquared() < 0.05 && tempRotat.lengthSquared() < 0.05) {
						sh.prevPos = sh.pos;
						sh.prevRot = sh.rot;
						sh.sleep();
						continue;
					}
					
						//sh.rot.x = 0;
					//sh.rot.y = 0;
					//sh.rot.z = 90;
					
					double verticalVelocity = sh.pos.y - sh.prevPos.y;
					if(Math.abs(verticalVelocity) < 2) {
						
						double in = 0.1;
						
						/*
						if(Math.abs(90-sh.rot.x) > Math.abs(-90-sh.rot.x)) {
							sh.rot.x = sh.rot.x + (90-sh.rot.x)*in;
						} else {
							sh.rot.x = sh.rot.x + (-90-sh.rot.x)*in;
						}
						
						if(Math.abs(90-sh.rot.z) > Math.abs(-90-sh.rot.z)) {
							sh.rot.z = sh.rot.z + (90-sh.rot.z)*in;
						} else {
							sh.rot.z = sh.rot.z + (-90-sh.rot.z)*in;
						}
						*/
						
						//sh.rot.x = sh.rot.x + (90-sh.rot.x)*in;
						//sh.rot.y = sh.rot.y + (90-sh.rot.y)*in;
						//sh.rot.z = sh.rot.z + (0-sh.rot.z)*in;
						
						
						sh.prevRot.x = sh.prevRot.x + (sh.rot.x - sh.prevRot.x)*0.5;
						sh.prevRot.y = sh.prevRot.y + (sh.rot.y - sh.prevRot.y)*0.5;
						sh.prevRot.z = sh.prevRot.z + (sh.rot.z - sh.prevRot.z)*0.5;
						
						/*
						sh.rot.x = 90;
						sh.rot.y = 0;
						sh.rot.z = 90;
						sh.prevRot = sh.rot;
						*/
					}
					
					
				}
				
			}
			sh.pos.x = xOffset;
			sh.pos.z = zOffset;
			
			
			
			
			
			
		}
	
		
		
		
		
	}






}
