package com.paneedah.weaponlib.vehicle.collisions;

import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix3f;
import javax.vecmath.Vector3d;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class OreintedBB {
	
	// designed according to Morgan Kaufmann's Real Time Collision
	//http://www.r-5.org/files/books/computers/algo-list/realtime-3d/Christer_Ericson-Real-Time_Collision_Detection-EN.pdf
	
	// also inspiration taken from Create mod 
	//https://github.com/Creators-of-Create/Create/blob/mc1.15/dev/src/main/java/com/simibubi/create/foundation/collision/OBBCollider.java
	
	public Matrix3d inverse;
	
	
	public AxisAlignedBB aabb;
	
	public Vec3d c;
	public Matrix3d axis;
	
	
	// PURELY FOR INTERPOLATION PURPOSES
	public Vector3d previousEuler = new Vector3d(0, 0, 0);
	
	
	
	public boolean doPhysics = false;
	public Vec3d localCentroid = Vec3d.ZERO;
	public Matrix3f inertiaTensor;
	public double mass;
	
	
	
	
	
	public OreintedBB(AxisAlignedBB aabb) {
		//this.e = getExtentFromAABB(aabb);
		this.axis = new Matrix3d();
		this.axis.setIdentity();
		this.c = Vec3d.ZERO;
		this.aabb = aabb;
		
		
	}
	
	public void setupPhysically(double mass) {
		this.doPhysics = true;
		this.mass = mass;
		AxisAlignedBB box = this.aabb;
		this.inertiaTensor = InertiaKit.inertiaTensorCube((float) mass, (float) (box.maxX-box.minX), (float) (box.maxY-box.minY), (float) (box.maxZ-box.minZ));
	}
	
	public Vec3d getGlobalCentroid() {
		return this.localCentroid.add(c);
	}
	


	
	
	public double[] doubleArrayFromMatrix(Matrix3d mat) {
		double[] dAr = new double[9];
		dAr[0] = mat.m00;
		dAr[1] = mat.m01;
		dAr[2] = mat.m02;
		
		dAr[3] = mat.m10;
		dAr[4] = mat.m11;
		dAr[5] = mat.m12;
		
		dAr[6] = mat.m20;
		dAr[7] = mat.m21;
		dAr[8] = mat.m22;
		return dAr;
		
	}
	
	public static Vector3d matrixToEuler(Matrix3d mat) {
		
		double sy = Math.sqrt(mat.m00*mat.m00 + mat.m10*mat.m10);
		boolean singular = sy < 1e-6;
		double x,y,z;
		if(!singular) {
			x = Math.atan2( mat.m21,mat.m22);
			y = Math.atan2(-mat.m20,sy);
			z = Math.atan2( mat.m10,mat.m00);
		} else {
			x = Math.atan2(-mat.m12, mat.m11);
			y = Math.atan2(-mat.m20, sy);
			z = 0;
		}
		return new Vector3d(x,y,z);
	}
	
	public void move(double x, double y, double z) {
		this.c = this.c.add(x, y, z);
	}
	
	public double qPTI(double a, double b, float t) {
		return InterpolationKit.interpolateValue(a, b, t);
	}
	
	public void renderOBB() {
		
		//updateInverse();
		
		GL11.glPushMatrix();
		
		Vector3d eulerRotations = matrixToEuler(this.axis);
		
		// shitty debug line plz remove later
		//GL11.glTranslated(0.0, -5.0, 0.0);
		
		
		//GL11.glTranslated(c.x, c.y, c.z);
		
		float t = mc.getRenderPartialTicks();
		
		GL11.glRotated(Math.toDegrees(eulerRotations.x), 1, 0, 0);
		GL11.glRotated(Math.toDegrees(eulerRotations.y), 0, 1, 0);
		GL11.glRotated(Math.toDegrees(eulerRotations.z), 0, 0, 1);
		
		this.previousEuler = eulerRotations;
		GL11.glLineWidth(2.0f);
		RenderGlobal.drawBoundingBox(aabb.minX, aabb.minY, aabb.minZ, aabb.maxX, aabb.maxY, aabb.maxZ, 1.0f, 0.0f, 0.0f, 1.0f);
		
		
		GL11.glPopMatrix();
	}

	
	
	public void setRotation(double yaw, double pitch, double roll) {
		this.axis.setIdentity();
		rotate(yaw, pitch, roll);
	}
	
	public void rotatePitch(double pitch) {
		this.axis.rotY(pitch);
	}
	
	public void rotateYaw(double yaw) {
		this.axis.rotZ(yaw);
	}
	
	public void rotateRoll(double roll) {
		this.axis.rotX(roll);
	}
	
	
	public void rotate(double yaw, double pitch, double roll) {
		
		 Matrix3d mY = new Matrix3d();
         mY.rotY(yaw);
         Matrix3d mP = new Matrix3d();
         mP.rotX(pitch);
         Matrix3d mR = new Matrix3d();
         mR.rotZ(roll);
         mR.mul(mP);
         mR.mul(mY);
	     this.axis.mul(mR);
	}

	public double cleanVal(double d) {
		if(Math.abs(d) < 0.001) {
			return 0.0;
		} else {
			return d;
		}
	}
	
	public void cleanMatrix(Matrix3d m) {
		m.m00 = cleanVal(m.m00);
		m.m01 = cleanVal(m.m01);
		m.m02 = cleanVal(m.m02);
		
		m.m10 = cleanVal(m.m10);
		m.m11 = cleanVal(m.m11);
		m.m12 = cleanVal(m.m12);
		
		m.m20 = cleanVal(m.m20);
		m.m21 = cleanVal(m.m21);
		m.m22 = cleanVal(m.m22);
		
	}
	
	public static OreintedBB fromAABB(AxisAlignedBB aabb) {
		Vec3d center = aabb.getCenter();
		Vec3d pos = new Vec3d(aabb.maxX-0.5, aabb.maxY-0.5, aabb.maxZ-0.5);
		
		//System.out.println(pos);
	 	AxisAlignedBB fixedBB = aabb.offset(pos.scale(-1));
	 	return fromAABB(fixedBB, pos);
	}
	
	public static OreintedBB fromAABB(AxisAlignedBB aabb, Vec3d position) {
		OreintedBB o = new OreintedBB(aabb);
		o.setPosition(position.x, position.y, position.z);
		return o;
	}
	
	
	
	public void setPosition(double x, double y, double z) {
		this.c = new Vec3d(x, y, z);
	}
	
	public Vec3d transformVec3dWithMatrix(Vec3d v, Matrix3d m) {
		Vector3d v1 = new Vector3d(v.x, v.y, v.z);
		m.transform(v1);
		return new Vec3d(v1.x, v1.y, v1.z);
	}
	
	public void updateInverse() {
		Matrix3d inverseM = (Matrix3d) this.axis.clone();
		inverseM.invert();
		this.inverse = inverseM;
	}
	
	public RayTraceResult doRayTrace(Vec3d start, Vec3d end) {
		
		updateInverse();
		
		Vec3d a = transformToLocalSpace(start);
		Vec3d b = transformToLocalSpace(end);
		
		//System.out.println(" TRZ: " + a + " | " + b);
		
		
		RayTraceResult rtr = aabb.calculateIntercept(a, b);
		//rtr.hitVec = transformVec3dWithMatrix(rtr.hitVec, this.axis);
		if(rtr != null) {
			rtr.hitVec = transformBackToWorld(rtr.hitVec);
		}
		
		return rtr;
	}
	
	
	public Vec3d support(Vec3d direction) {
		
		updateInverse();
		
		// transform direction to local space
		
		direction = transformVec3dWithMatrix(direction, this.inverse);
		
		
		//System.out.println((direction == null) + " | " + (this.inverse == null) + " | " + (this.aabb == null));
		
	    Vec3d s = new Vec3d(
	                direction.x > 0 ? aabb.maxX : aabb.minX,
	                direction.y > 0 ? aabb.maxY : aabb.minY,
	                direction.z > 0 ? aabb.maxZ : aabb.minZ);
	    
	    s = transformBackToWorld(s);
	    
		return s;
	}
	
	public Vec3d transformToLocalSpace(Vec3d v) {
		
		v = v.subtract(c);
		v = transformVec3dWithMatrix(v, this.inverse);
		//System.out.println("Breh vec: " + v);
		
		return v;
	}
	
	public Vec3d transformBackToWorld(Vec3d v) {
		v = transformVec3dWithMatrix(v, this.axis);
		v = v.add(c);
		
		return v;
	}
	
	
	public static Vec3d getExtentFromAABB(AxisAlignedBB ab) {
		double sizeX = Math.abs(ab.maxX - ab.minX);
		double sizeY = Math.abs(ab.maxY - ab.minY);
		double sizeZ = Math.abs(ab.maxZ - ab.minZ);	
		return new Vec3d(sizeX/2, sizeY/2, sizeZ/2);
	}
	


}
