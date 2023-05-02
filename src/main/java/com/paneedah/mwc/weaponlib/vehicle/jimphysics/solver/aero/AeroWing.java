package com.paneedah.mwc.weaponlib.vehicle.jimphysics.solver.aero;

public class AeroWing implements IAeroComponent {
	
	public double area;
	
	public AeroWing(double area) {
		this.area = area;
	}

	@Override
	public double getLiftCoefficient() {
		return 0.1985;
	}

	@Override
	public double getAreaOfWing() {
		// TODO Auto-generated method stub
		return this.area;
	}

}
