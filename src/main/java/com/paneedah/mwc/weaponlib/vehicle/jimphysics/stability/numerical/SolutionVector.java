package com.paneedah.mwc.weaponlib.vehicle.jimphysics.stability.numerical;

public class SolutionVector<T extends SolutionVector<T>> {
	
	public double value = 0.0;
	
	public SolutionVector() {

	}
	
	public void add(double dt, T vec) {
		this.value += dt*vec.value;
	}

}
