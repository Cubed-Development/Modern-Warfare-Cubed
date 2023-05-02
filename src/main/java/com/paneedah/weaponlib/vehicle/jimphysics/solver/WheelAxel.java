package com.paneedah.weaponlib.vehicle.jimphysics.solver;

import com.paneedah.weaponlib.network.IEncodable;
import io.netty.buffer.ByteBuf;
import net.minecraft.util.math.Vec3d;

public class WheelAxel implements IEncodable<WheelAxel> {
	
	public VehiclePhysicsSolver solver;
	
	public WheelSolver leftWheel;
	public WheelSolver rightWheel;
	double loadOnAxel;
	public boolean isDriveWheel;
	public double COGoffset;
	public boolean isHandbraking;
	public double tractionTorque;
	
	public WheelAxel(double offsetFromCOG, boolean isDriveWheel) {
		this.isDriveWheel = isDriveWheel;
		this.COGoffset = offsetFromCOG;
	}
	
	public WheelAxel newInstance() {
		WheelAxel newAxel = new WheelAxel(this.COGoffset, this.isDriveWheel);
		newAxel.withWheels(this.leftWheel.newInstance(), this.rightWheel.newInstance());
		
		return newAxel;
	}
	
	public void addWheels(WheelSolver left, WheelSolver right) {
		this.leftWheel = left;
		this.rightWheel = right;
		
		
	}
	
	public void assignSolver(VehiclePhysicsSolver solver) {
		this.solver = solver;
		
		this.leftWheel.assignSolver(solver);
		this.rightWheel.assignSolver(solver);
		
		this.solver.wheels.add(this.leftWheel);
		this.solver.wheels.add(this.rightWheel);
	}
	
	public void applyHandbrake() {
		this.isHandbraking = true;
	}
	
	public void releaseHandbrake() {
		this.isHandbraking = false;
	}
	/**
	 * Tells the wheels to apply a braking force
	 * (affects wheel acceleration and velocity)
	 * 
	 * @param Magnitude - value between 1.0 - 0.0,
	 *  lower values mean higher braking.
	 */
	public void applyBrakingForce(double magnitude) {
		
		leftWheel.driveTorque += -magnitude;
		rightWheel.driveTorque += -magnitude;
		//leftWheel.applyBrake(100);
		//rightWheel.applyBrake(100);
	}
	
	public void setSteeringAngle(double angle) {
		leftWheel.wheelAngle = -angle;
		rightWheel.wheelAngle = -angle;
	}
	
	public Vec3d getLongitudinalForce() {
		return leftWheel.longitudinalForce.add(rightWheel.longitudinalForce);
	}
	
	public double latNonVec() {
		return leftWheel.lateralForce + rightWheel.lateralForce;
	}
	
	public double longNonVec() {
		return leftWheel.longForce + rightWheel.longForce;
	}
	
	public Vec3d getLateralForce() {
		return leftWheel.lateralForceVec.add(rightWheel.lateralForceVec);
	}
	
	public Vec3d adjLateralForce() {
		
		return getLateralForce()/*.rotatePitch((float) Math.toRadians(solver.vehicle.rotationPitch))*/.rotateYaw((float) Math.toRadians(-solver.vehicle.rotationYaw+solver.vehicle.driftTuner));
	}
	
	public double getWheelAngularVelocity() {
		return this.leftWheel.wheelAngularVelocity;
	}
	
	public void applyDriveTorque(double torque) {
		leftWheel.driveTorque += torque;
		rightWheel.driveTorque += torque;
		
	}
	
	public void applySuspensionLoad(double load) {
		leftWheel.applySuspensionLoad(load);
		rightWheel.applySuspensionLoad(load);
	}
	
	public void distributeLoad(double load) {
		this.loadOnAxel = load;
		
		leftWheel.loadOnWheel = load;
		rightWheel.loadOnWheel = load;
	}
	
	public void doPhysics() {
		
		
		
		leftWheel.doPhysics();
		rightWheel.doPhysics();
		
		double drTorque = leftWheel.driveTorque + rightWheel.driveTorque;
		
		
		tractionTorque = leftWheel.tractionTorque + rightWheel.tractionTorque;

	
		double totalTorque = drTorque + tractionTorque;
		
	
		
	
		
		double inertia = leftWheel.wheelInertia + rightWheel.wheelInertia;
		double angularAccel = totalTorque/inertia;
		
		//System.out.println("Angular Acceleration: " + angularAccel);
		
		leftWheel.wheelAngularAcceleration = angularAccel;
		rightWheel.wheelAngularAcceleration = angularAccel;
		
		
		
		// resetTorque
		leftWheel.driveTorque = 0;
		rightWheel.driveTorque = 0;
		
		
	}
	
	public WheelAxel withWheels(WheelSolver left, WheelSolver right) {
		left.axel = this;
		
		right.axel = this;
		
		
		this.addWheels(left, right);
		return this;
	}

	@Override
	public WheelAxel readFromBuf(ByteBuf buf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void writeToBuf(ByteBuf buf) {
		// TODO Auto-generated method stub
		
	}

}
