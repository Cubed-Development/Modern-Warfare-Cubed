package com.paneedah.mwc.weaponlib.vehicle.collisions;

import net.minecraft.util.math.Vec3d;

public class Contact {

	public RigidBody bodyA;
	public RigidBody bodyB;
	public OreintedBB a;
	public OreintedBB b;
	public Vec3d localA;
	public Vec3d localB;
	public Vec3d globalA;
	public Vec3d globalB;
	public Vec3d normal;
	public float depth;
	public Vec3d tangent;
	public Vec3d bitangent;
	
	public Vec3d rA;
	public Vec3d rB;
	
	public Jacobian normalContact;
	public Jacobian tangentContact;
	public Jacobian bitangentContact;
	
	public Contact(RigidBody bodyA, RigidBody bodyB, OreintedBB a, OreintedBB b, GJKResult info) {
		this.a = a;
		this.b = b;
		if(bodyA == null){
			bodyA = RigidBody.DUMMY;
		}
		if(bodyB == null){
			bodyB = RigidBody.DUMMY;
		}
		this.bodyA = bodyA;
		this.bodyB = bodyB;
		localA = bodyA.globalToLocalPos(info.contactPointA);
		localB = bodyB.globalToLocalPos(info.contactPointB);
		globalA = info.contactPointA;
		globalB = info.contactPointB;
		normal = info.separationVector;
		depth = (float) info.penetrationDepth;
		//https://box2d.org/posts/2014/02/computing-a-basis/
		if(Math.abs(normal.x) >= 0.57735){
			tangent = new Vec3d(normal.y, -normal.x, 0).normalize();
		} else {
			tangent = new Vec3d(0, normal.z, -normal.y).normalize();
		}
		bitangent = normal.crossProduct(tangent);
		
		normalContact = new Jacobian(false);
		tangentContact = new Jacobian(true);
		bitangentContact = new Jacobian(true);
	}
	
	public void init(float dt){
		rA = globalA.subtract(bodyA == RigidBody.DUMMY ? a.localCentroid : bodyA.globalCentroid);
		rB = globalB.subtract(bodyB == RigidBody.DUMMY ? b.localCentroid : bodyB.globalCentroid);
		
		normalContact.init(this, normal, dt);
		tangentContact.init(this, tangent, dt);
		bitangentContact.init(this, bitangent, dt);
	}
	
	public void solve(float dt){
		normalContact.solve(this, dt);
		tangentContact.solve(this, dt);
		bitangentContact.solve(this, dt);
	}
	
	public static class Jacobian {
		
		boolean tangent;
		
		Vec3d j_va;
		Vec3d j_wa;
		Vec3d j_vb;
		Vec3d j_wb;
		
		float bias;
		double effectiveMass;
		double totalLambda;
		
		public Jacobian(boolean tangent) {
			this.tangent = tangent;
		}
		
		public void init(Contact c, Vec3d dir, float dt){
			j_va = dir.scale(-1);
			j_wa = c.rA.crossProduct(dir).scale(-1);
			j_vb = dir;
			j_wb = c.rB.crossProduct(dir);
			
			if(!tangent){
				float closingVel = (float)c.bodyA.linearVelocity.scale(-1)
						.subtract(c.bodyA.angularVelocity.crossProduct(c.rA))
						.add(c.bodyB.linearVelocity)
						.add(c.bodyB.angularVelocity.crossProduct(c.rB))
						.dotProduct(c.normal);
				float restitution = 1.0f;
				//float restitution = c.bodyA.restitution*c.bodyB.restitution;
				
				float beta = 0.2F;
				float dslop = 0.0005F;
				float rslop = 0.5F;
				bias = -(beta/dt)*Math.max(c.depth-dslop, 0)+Math.max(restitution*closingVel-rslop, 0);
			}
			
			effectiveMass = 
					  c.bodyA.inv_mass
					+ j_wa.dotProduct(RigidBody.matrixTransformVector(c.bodyA.inv_globalInertiaTensor, j_wa))
					+ c.bodyB.inv_mass
					+ j_wb.dotProduct(RigidBody.matrixTransformVector(c.bodyB.inv_globalInertiaTensor, j_wb));
			effectiveMass = 1D/effectiveMass;
			
			totalLambda = 0;
		}
		
		public void solve(Contact c, float dt){
			double jv = 
					  j_va.dotProduct(c.bodyA.linearVelocity)
					+ j_wa.dotProduct(c.bodyA.angularVelocity)
					+ j_vb.dotProduct(c.bodyB.linearVelocity)
					+ j_wb.dotProduct(c.bodyB.angularVelocity);
			double lambda = effectiveMass * (-(jv + bias));
			double oldTotalLambda = totalLambda;
			if(tangent){
				float friction = c.bodyA.friction*c.bodyB.friction;
				double maxFriction = friction*c.normalContact.totalLambda;
				
				totalLambda = net.minecraft.util.math.MathHelper.clamp(totalLambda + lambda, -maxFriction, maxFriction);
			} else {
				totalLambda = Math.max(0, oldTotalLambda + lambda);
			}
			lambda = totalLambda - oldTotalLambda;
			
			c.bodyA.addLinearVelocity(j_va.scale(c.bodyA.inv_mass * lambda));
			c.bodyA.addAngularVelocity(RigidBody.matrixTransformVector(c.bodyA.inv_globalInertiaTensor, j_wa).scale(lambda));
			c.bodyB.addLinearVelocity(j_vb.scale(c.bodyB.inv_mass * lambda));
			c.bodyB.addAngularVelocity(RigidBody.matrixTransformVector(c.bodyB.inv_globalInertiaTensor, j_wb).scale(lambda));
		}
	}
}
