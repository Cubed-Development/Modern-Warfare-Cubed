package com.paneedah.weaponlib.vehicle.jimphysics.solver;


import com.paneedah.weaponlib.KeyBindings;
import com.paneedah.weaponlib.network.IEncodable;
import com.paneedah.weaponlib.vehicle.collisions.InertiaKit;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import com.paneedah.weaponlib.vehicle.jimphysics.TyreSize;
import com.paneedah.weaponlib.vehicle.jimphysics.VehiclePhysUtil;
import com.paneedah.weaponlib.vehicle.jimphysics.stability.numerical.vehicle.WheelSolutionVector;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.Vec3d;

import javax.vecmath.Vector3d;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class WheelSolver implements IEncodable<WheelSolver>{
	
	
	public double actualRideHeight = 0;
	
	public double springRate = 271;
	
	VehiclePhysicsSolver solver;
	
	public SuspensionSolver suspension;
	
	
	public WheelAxel axel;

	public double wheelAngularVelocity = 0.0;
	double wheelAngularAcceleration = 0.0;
	public double wheelAngle = 0.0;
	double wheelInertia = 0.0;
	double loadOnWheel = 0.0;
	Vec3d wheelOreintation = new Vec3d(0, 0, 1);
	
	double driveTorque;
	double tractionTorque;
	double lateralForce = 0.0;
	double longForce = 0.0;
	
	boolean isDrive;
	
	// LAT & LONG FORCE
	public Vec3d longitudinalForce = new Vec3d(0, 0, 0);
	public Vec3d lateralForceVec = new Vec3d(0, 0, 0);
	
	/*
	 * Set by external things
	 */
	public Vec3d relativePosition = Vec3d.ZERO;
	public double rideHeight;
	
	
	public double wheelRot = 0.0;
	public double prevWheelRot = 0.0;
	
	public WheelSolutionVector state = new WheelSolutionVector();
	
	public double wheelMass = 0.0;
	
	public TyreSize tyreSize;
	
	
	public double grassCoef = 0.5;
	
	/**
	 * https://tiresize.com/calculator/
	 * This is FANTASTIC!
	 * 
	 */
	
	
	
	
	/**
	 * Creates a new wheel solver
	 * 
	 * @param solver vehicle physics solver
	 * @param axel axel solver
	 * @param mass mass of tire in (kg)
	 * @param radius radius of tire in (m)
	 * @param thickness thickness of tire in (m)
	 * @param isDrive Does the wheel get powered from the engine?
	 */
	public WheelSolver(TyreSize tyreSize, double mass, boolean isDrive) {
		
		this.suspension = new SuspensionSolver(springRate, 1.0);
		this.tyreSize = tyreSize;
		
		//this.axel = axel;
		this.solver = solver;
		this.wheelMass = mass;
		// calculates the wheel's inertia, only ar
		this.wheelInertia = InertiaKit.inertiaTensorCylinder((float) mass, (float) getRadius(), (float) getWidth()).m22;
		this.isDrive = isDrive;
	}
	
public WheelSolver(TyreSize tyreSize, double mass, boolean isDrive, double grassCoef) {
		
		this.suspension = new SuspensionSolver(springRate, 1.0);
		this.tyreSize = tyreSize;
		
		//this.axel = axel;
		this.solver = solver;
		this.wheelMass = mass;
		// calculates the wheel's inertia, only ar
		this.wheelInertia = InertiaKit.inertiaTensorCylinder((float) mass, (float) getRadius(), (float) getWidth()).m22;
		this.isDrive = isDrive;
		this.grassCoef = grassCoef;
	}
	
	
	public void assignSolver(VehiclePhysicsSolver solver) {
		this.solver = solver;
		
	}
	
	public double getRadius() {
		return tyreSize.getRadius();
	}
	
	public double getWidth() {
		return tyreSize.getWidth();
	}
	
	public double getInterpolatedWheelRotation() {
		return Math.toDegrees(InterpolationKit.interpolateValue(prevWheelRot, wheelRot, mc.getRenderPartialTicks()));
	}
	
	public Vec3d getSuspensionPosition() {
		Vec3d relative = this.relativePosition;
		relative = relative.add(0.0, getSuspension().getStretch()*-0.15, 0.0);
		return relative;
	}

	public void setRelativePosition(Vec3d rP) {
		this.relativePosition = rP;
	}
	 
	public boolean isDriveWheel() {
		return this.axel.isDriveWheel;
	}
	
	public void applySuspensionLoad(double force) {
		this.suspension.applyForce(force);
	}
	
	
	public SuspensionSolver getSuspension() {
		return this.suspension;
	}
	
	public double getRenderRideHeight() {
		double d = this.rideHeight;
		
		if(this.axel.solver.vehicle.rideOffset < 0) {
			d += this.axel.solver.vehicle.rideOffset*1.75;
		}
		return d;
	}
	
	
	/**
	 * Applies a braking force to the wheel
	 * @param magnitude 1.0-0.0, lower vals = higher braking
	 */
	public void applyBrake(double magnitude) {
		//wheelAngularVelocity *= 0.01;
		
		//wheelAngularAcceleration = -magnitude;
		//wheelAngularVelocity = 0;
	}
	
	double oldWheelVel = 0;
	
	public double slipRatio = 0.0;
	
	public void doPhysics() {
		double radius = getRadius();
		
		Vec3d vM = solver.velocity.normalize();
		Vec3d oM = solver.getOreintationVector();
		Vector3d oreintation = new Vector3d(oM.x, oM.y, oM.z);
		Vector3d velocity = new Vector3d(vM.x, vM.y, vM.z);
		
		
		wheelAngularVelocity += wheelAngularAcceleration*solver.timeStep;
	
		if(solver.vehicle.throttle != 1.0) {
			wheelAngularVelocity *= 0.995;
		}
		
	
		//if(wheelAngularVelocity < 0) wheelAngularVelocity = 0;
		
		//tractionTorque *= -1;
		if(this.axel.COGoffset < 0.5) {
			//double expected = VehiclePhysUtil.wheelAngularVelocity((int) solver.engineSolver.rpm, solver.transmission.getCurrentGearRatio(), solver.transmission.getDifferentialRatio());
			//System.out.println(wheelAngularVelocity + " | " + expected);
			
			
		}
		
		if(solver.getLongitudinalSpeed() == 0.0) {
			wheelAngularVelocity = 0;
		}
		
		
		// prevents the user from going too fast backwards
		// in reverse. real life example = Mercedes G-Wagon.
		if(solver.transmission.isReverseGear) {
			if(wheelAngularVelocity > 20) wheelAngularVelocity = 20;
		}
		
		
		// RESETS THE WHEEL ANGULAR ACCELERATION
		wheelAngularAcceleration = 0;
		
		// UPDATES THE WHEEL ROTATION
		wheelRot += wheelAngularVelocity*solver.timeStep;
		
		
		// update wheel oreintatio
		Vec3d omega = wheelOreintation.rotateYaw((float) wheelAngle);
		
		
		
		
		
		//System.out.println(wheelAngularVelocity);
		// get slip ratio
		//double slipRatio = VehiclePhysUtil.getSlipRatio(wheelAngularVelocity, radius, solver.getLongitudinalSpeed());
	//	slipRatio = VehiclePhysUtil.getSlipRatio(wheelAngularVelocity, radius, solver.getLongitudinalSpeed());
		double B = 0.91;
		double ls = solver.getLongitudinalSpeed();
		
		
		
		
		double rm = solver.timeStep/2;
		double cx = 75000;
		double n = 1.1;
		double m = loadOnWheel/9.81;
		
		//System.out.println(hashCode());
		
		double lamdaR = -(cx/ls)*((1/m)+((radius*radius)/wheelInertia));
		double r = -1/lamdaR;

		
		
		double umx = rm*cx*(((radius*radius)/wheelInertia) + (1/(m)));
		slipRatio = ((wheelAngularVelocity*radius)-ls)/Math.max(Math.abs(ls), n*umx);
		
		
		if(wheelAngularVelocity < 0 && !solver.transmission.isReverseGear) {
			
			wheelAngularVelocity = 0;
		}
		
	
		
		if(solver.vehicle.getRealSpeed() < 1 && KeyBindings.vehicleBrake.isKeyDown() && !solver.transmission.isReverseGear) {
			solver.velocity = Vec3d.ZERO;
			wheelAngularVelocity = 0;
			wheelAngularAcceleration = 0;
			slipRatio = 0;
		}
	
		
		//System.out.println(slipRatio);
		//slipRatio = 0;
		// Bernard & Clover
		
		
		
		//slipRatio = (-(ls/B)*slipRatio)+((wheelAngularVelocity-ls)/B);
		//System.out.println(slipRatio);
		//System.out.println(solver.getLongitudinalSpeed()*3.6);
		
		//slipRatio += 
		
		//slipRatio = 1-(wheelAngularVelocity/solver.getLongitudinalSpeed());
		
		/*
		slipRatio = 0;
		double B = 0.91;
		 double delta = (wheelAngularVelocity - solver.getLongitudinalSpeed()) - Math.abs(solver.getLongitudinalSpeed()) * slipRatio;
		 delta /= B;
		 
		 double tau = 0.002;
		 if(solver.getLongitudinalSpeed() > 5) tau = 0;
		 
		 
		 slipRatio += delta + tau * solver.timeStep;
		
		 if(this.axel.COGoffset < 0) {
			// System.out.println(slipRatio);
		 }*/
		
		 //slipRatio = wheelAngularVelocity*radius-solver.getLongitudinalSpeed();
			
		 if(Double.isNaN(slipRatio)) slipRatio = 0;
		//double slipRatio = VehiclePhysUtil.getSlipRatio(wheelAngularVelocity, radius, this.solver.vehicle.getRealSpeed());
		
		

	/*
		if(solver.getVelocityVector().lengthSquared() > 3 && solver.getVelocityVector().dotProduct(Vec3d.fromPitchYaw(0.0f, solver.vehicle.rotationYaw)) < 0) {
			 
			solver.velocity = solver.velocity.scale(0.03);
			}
		*/
		
		
		
		// sometimes this can actually be NaN which can cause errors.
		if(Double.isNaN(slipRatio)) {
			longitudinalForce = Vec3d.ZERO;
			return;
		}
		
	
		
		//loadOnWheel *= 5;
		
		// get longitundinal force
		double peak = 1.0;
		if(this.solver.transmission.getClutch().getSlippage() == 1) peak = 1.9;
		longForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, slipRatio, 1.65, peak, 0.97, 10);
		
		
		//longForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, slipRatio, 1.65, 1, 0.97, 10);
		
		
		//longForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, slipRatio, 1.65, 2.5, 0.8, 10);
	
		if(Math.abs(Math.toDegrees(oreintation.angle(velocity))) > 150 && !solver.transmission.isReverseGear && solver.vehicle.throttle < 0.5) {
			this.axel.applyBrakingForce(8000);
			longForce *= -1;
			
		}
		
	
		

		if(solver.vehicle.isBraking) {
			//longForce *= 30.0;
		}
		
		
		// REDUCES THE GRIP ON OTHER MATERIALS (DIRT)
		longitudinalForce = omega.scale(longForce);
		if(this.axel.solver.materialBelow != Material.ROCK) {
			longitudinalForce = longitudinalForce.scale(0.5);
		}
		
		

		// CALCULATES THE TRACTION TORQUE
		tractionTorque = longForce*radius*-1;
		
		

	
	  // System.out.println(tractionTorque);
	   
	   
	   
	   
		
		
		/*
		 * LATERAL FORCES :)
		 */
		
		
		// finds yawspeed - I put absoplute around the offset so might cause errors?
		double yawspeed = solver.wheelBase * axel.COGoffset * solver.angularVelocity;
		
		// finds rotAngle
		double rot_angle = Math.atan(yawspeed / solver.getLongitudinalSpeed());
		
		// finds the sideslip angle
		double sideSlip = solver.getSideSlipAngle();
		
		//System.out.println("YAW: " + Math.toDegrees(yawspeed) + " | ROT: " + Math.toDegrees(rot_angle) + " | SIDE: " + Math.toDegrees(sideSlip));
		// calculates the slipangle
		
	
		double slipAngleTire;
		if(axel.COGoffset < 0) {
			slipAngleTire = sideSlip - rot_angle - wheelAngle;
		} else {
			slipAngleTire = sideSlip + rot_angle - wheelAngle;
		}
		slipAngleTire = Math.toDegrees(slipAngleTire);
		
		double cy = 100000;
		double uym = rm*(cy/m);
	
		//double lateralSlipRatio = ls/max
		
		Vec3d lateralVector = solver.getOreintationVector().rotateYaw((float) Math.toRadians(-90));
		double dotter = lateralVector.dotProduct(solver.velocity);
		
		double lateralSlipRatio = dotter/Math.max(Math.abs(ls), n*uym);
		lateralSlipRatio *= 100000;
		if(lateralSlipRatio == 0.0) lateralSlipRatio = 90.0;
		
		
	//	double lF = VehiclePhysUtil.pacejkaLong(loadOnWheel, lateralSlipRatio, 1.3, 1.0, 1.0, 4);
		//System.out.println(lateralSlipRatio + " | " + slipAngleTire);
		//// LATERAL FORCE
		// https://www.edy.es/dev/docs/pacejka-94-parameters-explained-a-comprehensive-guide/
		// (SHOULD BE UPGRADED FROM '94 FORMULA)
		
		//lateralForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, lateralSlipRatio, 1.3, 1.0, 1.0, 4);
		//lateralForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, slipAngleTire, 1.3, 1.9, 1.0, 4);
		lateralForce = VehiclePhysUtil.pacejkaLong(loadOnWheel, slipAngleTire, 1.3, 1.3, 1.0, 4);
		
		// APPLIES THE FX OF HANDBRAKE
		if(axel.isHandbraking) {
			if(!(Math.abs(Math.toDegrees(solver.vehicle.steerangle)) > 4)) {
				if(this.axel.solver.materialBelow == Material.ROCK) {
					axel.applyBrakingForce(40);
				} else {
					axel.applyBrakingForce(10);
				}
			}
			lateralForce *= 0.15;
		}
		
		
		// REDUCES GRIP ON DIRT
		if(this.axel.COGoffset < 0 && this.axel.solver.materialBelow != Material.ROCK) {
			lateralForce *= this.grassCoef;
		} 

		/*
		double absSlip = Math.abs(slipAngleTire);
		
		if(this.axel.COGoffset < 0) {
			if(this.axel.solver.materialBelow != Material.ROCK) {
				if(absSlip > 1.5) lateralForce *= 0.6;
			} else {
				
				
				if(absSlip > 0.2 && absSlip < 4.5) {
					lateralForce *= 0.6;
					//lateralForce *= 0.4;
				} else if(absSlip > 4.5) {
					lateralForce *= 0.9;
					//lateralForce *= 0.8;
				}

			}
		}*/
		
	
		
		
		
		
		
		// if(absSlip > 1.5 && this.axel.COGoffset < 0) lateralForce *= kC;
		
		// PREVENTS THE LATERAL FORCE VALUE FROM GOING NAN
		if(Double.isNaN(lateralForce)) {
			lateralForce = 0.0;
			lateralForceVec = Vec3d.ZERO;
		} else {
			this.lateralForceVec = wheelOreintation.rotateYaw((float) Math.toRadians(-90)).scale(lateralForce);
			
		}
		
		
		
	
		
		
		
		
		
	}
	
	
	public WheelSolver newInstance() {
		
		WheelSolver newSolve = new WheelSolver(tyreSize, this.wheelMass, this.isDrive, this.grassCoef)
				.withRelativePosition(this.relativePosition);
		
	
		
		
		return newSolve;
	}
	

	public WheelSolver withRelativePosition(Vec3d vec) {
		setRelativePosition(vec);
		return this;
		
	}
	

	@Override
	public WheelSolver readFromBuf(ByteBuf buf) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void writeToBuf(ByteBuf buf) {
		
	}
	


}
