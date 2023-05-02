package com.paneedah.mwc.weaponlib.vehicle.jimphysics;

import com.paneedah.mwc.weaponlib.vehicle.GearShiftPattern;
import com.paneedah.mwc.weaponlib.vehicle.collisions.VehicleInertiaBuilder;
import com.paneedah.mwc.weaponlib.vehicle.collisions.VehicleMassObject;
import com.paneedah.mwc.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;
import net.minecraft.util.math.Vec3d;

public class PhysicsConfiguration {
	
	public double wheelBase;
	public double frontSurfaceArea;
	public double dragCoefficient;
	
	
	public double finalDriveRatio;
	public double vehicleMass;
	
	public double driveTrainEfficiency;
	
	/**
	 * The height the center of gravity is off the ground
	 */
	public double COGHeight;
	
	public Dimensions realDimensions;
	
	
	public Transmission trans;
	
	public GearShiftPattern shiftPattern;
	
	public VehicleMassObject vmo;
	public Engine engine;
	
	public Vec3d dimensions;
	
	public VehiclePhysicsSolver solver;
	
	
	
	public PhysicsConfiguration(double wheelBase, double frontArea, double dragC,
			double mass, double COGHeight, double driveTrainEfficiency, Transmission trans,
			Engine eng, Dimensions realDim, Vec3d dimensions, Chassis chassis,
			GearShiftPattern pat) {
		this.wheelBase = wheelBase;
		this.frontSurfaceArea = frontArea;
		this.dragCoefficient = dragC;
		this.vehicleMass = mass;
		this.COGHeight = COGHeight;
		this.trans = trans;
		this.realDimensions = realDim;
		this.dimensions = dimensions;
		this.engine = eng;
		this.driveTrainEfficiency = driveTrainEfficiency;
		this.shiftPattern = pat;
		
		this.vmo = (new VehicleInertiaBuilder(mass)).basicConstructor(chassis, realDim).build();
		
		
		//this.vmo = (new VehicleInertiaBuilder(mass)).basicConstructor(chassis, this.dimensions, (float) this.COGHeight, (float) this.wheelBase, 0.33f, 0.33f).build();
		
	}
	
	
	
	public Dimensions getRealDimensions() {
		return realDimensions;
	}
	
	public VehiclePhysicsSolver getPhysicsSolver() {
		return this.solver;
	}
	
	public VehiclePhysicsSolver buildStructure() {
		this.solver = new VehiclePhysicsSolver(this);
		return getPhysicsSolver();
		
	}
	
	public GearShiftPattern getShiftPattern() {
		return this.shiftPattern;
	}
	
	public double getDriveTrainEfficiency() {
		return this.driveTrainEfficiency;
	}
	
	public double getFrontArea() {
		return this.frontSurfaceArea;
	}
	
	public double getDragCoefficient() {
		return this.dragCoefficient;
	}
	
	public Engine getEngine() {
		return this.engine;
	}
	
	public VehicleMassObject getVehicleMassObject() {
		return this.vmo;
	}
	
	

}
