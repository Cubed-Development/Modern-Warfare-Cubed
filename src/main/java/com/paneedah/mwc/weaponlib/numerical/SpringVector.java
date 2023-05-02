package com.paneedah.mwc.weaponlib.numerical;

import net.minecraft.util.math.Vec3d;

public class SpringVector implements ISimulator {
	

	private SpringValue x, y, z;
	
	public SpringVector(double mass, double constant, double damper) {
		x = new SpringValue(constant, mass, damper);
		y = new SpringValue(constant, mass, damper);
		z = new SpringValue(constant, mass, damper);
	}
	
	public Vec3d getPosition() {
		return new Vec3d(x.getPosition(), y.getPosition(), z.getPosition());
	}
	
	
	
	public void addVelocity(double x, double y, double z) {
		this.x.velocity += x;
		this.y.velocity += y;
		this.z.velocity += z;
	}
	
	public void addPosition(double x, double y, double z) {
		this.x.position += x;
		this.y.position += y;
		this.z.position += z;
	}
	
	public void setXSpringParam(double mass, double constant, double damper) {
		x.setDamping(damper);
		x.setMass(mass);
		x.setSpringConstant(constant);
	}
	
	public void setYSpringParam(double mass, double constant, double damper) {
		y.setDamping(damper);
		y.setMass(mass);
		y.setSpringConstant(constant);
	}
	
	public void setZSpringParam(double mass, double constant, double damper) {
		z.setDamping(damper);
		z.setMass(mass);
		z.setSpringConstant(constant);
	}
	
	public void setDampening(double d) {
		this.x.setDamping(d);
		this.y.setDamping(d);
		this.z.setDamping(d);
	}
	
	public void setConstant(double k) {
		this.x.setSpringConstant(k);
		this.y.setSpringConstant(k);
		this.z.setSpringConstant(k);
	}
	
	public void setMass(double m) {
		this.x.setMass(m);
		this.y.setMass(m);
		this.z.setMass(m);
	}
	
	@Override
	public void update(double dt) {
		this.x.update(dt);
		this.y.update(dt);
		this.z.update(dt);
	}
	
	public void setPosition(double x, double y, double z) {
		this.x.setPosition(x);
		this.y.setPosition(y);
		this.z.setPosition(z);
	}
	
	public Vec3d getInterpolatedVec() {
		return new Vec3d(x.getLerpedPosition(), y.getLerpedPosition(), z.getLerpedPosition());
	}

	public Vec3d getInterpolatedVec(double mu) {
		return new Vec3d(x.getLerpedPosition(mu), y.getLerpedPosition(mu), z.getLerpedPosition(mu));
		
	}
}
