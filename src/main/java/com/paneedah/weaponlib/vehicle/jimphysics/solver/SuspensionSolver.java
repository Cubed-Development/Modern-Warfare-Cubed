package com.paneedah.weaponlib.vehicle.jimphysics.solver;

import com.paneedah.weaponlib.vehicle.jimphysics.VehiclePhysUtil;

public class SuspensionSolver {
	
	public double length;
	public double springRate;
	public double currentLength;
	public double joules;
	public double force;
	
	public SuspensionSolver(double k, double l) {
		this.length = l;
		this.springRate = k;
	}
	
	public double getSpringRate() {
		return this.springRate;
	}
	
	public double getStretch() {
		return this.currentLength - this.length;
	}
	
	public void applyForce(double force) {
		double stretch = force/this.springRate;
		this.currentLength = this.length + stretch;
	}
 
	public void setCurrentLength(double len) {
		this.currentLength = len;
		updateEnergy();
		updateForce();
	}
	
	public double getEnergy() {
		return this.joules;
	}
	
	public void updateEnergy() {
		this.joules = VehiclePhysUtil.springEnergy(getSpringRate(), getStretch());
	}
	
	public void updateForce() {
		this.force = VehiclePhysUtil.springForce(getSpringRate(), getStretch());
	}
	
	public void setEnergy(double e) {
		double s = VehiclePhysUtil.springStretchFromEnergy(getSpringRate(), e);
		this.currentLength = this.length - s;
		this.joules = e;
		
		updateForce();
	}

}
