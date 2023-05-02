package com.paneedah.weaponlib.vehicle.jimphysics.solver;

import com.paneedah.weaponlib.network.IEncodable;
import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.jimphysics.Engine;
import com.paneedah.weaponlib.vehicle.jimphysics.PhysicsConfiguration;
import com.paneedah.weaponlib.vehicle.jimphysics.Transmission;
import com.paneedah.weaponlib.vehicle.jimphysics.VehiclePhysUtil;
import com.paneedah.weaponlib.vehicle.jimphysics.engines.FlywheelSolver;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.aero.IAeroComponent;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.components.EngineSolver;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.material.Material;
import net.minecraft.entity.MoverType;
import net.minecraft.util.math.Vec3d;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix3f;
import javax.vecmath.Vector2d;
import java.util.ArrayList;

public class VehiclePhysicsSolver implements IEncodable<VehiclePhysicsSolver> {
	

	
	public FlywheelSolver flywheel = new FlywheelSolver(9.07, 0.1651, 0.0025);
	
	public Matrix3d rotMat;
	
	public WheelAxel frontAxel;
	public WheelAxel rearAxel;
	public EntityVehicle vehicle;
	public Engine engine;
	int revolutions = 0;
	public double timeStep = 0.05;
	public Vec3d positonDelta = new Vec3d(0, 0, 0);
	double mass;
	
	
	public Vec3d acceleration = Vec3d.ZERO;
	public Vec3d velocity = new Vec3d(0, 0, 0);
	double brakeTorque = 12000;
	double COGHeight = 0.3;
	
	
	// Component Solvers
	public Transmission transmission;
	public EngineSolver engineSolver;
	
	public float[] angles;
	

	// forces
	public double angularVelocity = 0;
	double yawspeed = 0;
	
	// various properties
	double wheelBase = 1.0;
	
	// aceel
	public double synthAccelFor = 0.0;
	public double synthAccelSide = 0.0;
	
	
	
	public double accelerationValue = 0.0;
	
	
	// 
	
	public double rotationalImpulse = 0.0;
	
	
	public int physicsStep = 0;
	
	// side and forward accel
	Vec3d sideForAccel = new Vec3d(0, 0, 0);
	Vector2d longLatVal = new Vector2d(0, 0);
	Vector2d accelLongLat = new Vector2d(0, 0);
	
	// KONSEI DORIFTO?!
	public boolean isDrifting = true;
	
	
	public Material materialBelow;
	
	
	public ArrayList<WheelSolver> wheels = new ArrayList<>();
	
	
	public PhysicsConfiguration configuration;
	
	public ArrayList<IAeroComponent> aeroComponents = new ArrayList<>();
	
	public double collisionTorque = 0;
	
	public VehiclePhysicsSolver(PhysicsConfiguration config) {
		//this.vehicle = vehicle;
		this.configuration = config;
		setupConfiguration(config);
		
		
		
		//(new VehicleInertiaBuilder(1660)).basicSedanConstruct(d, heightOffGround, wheelBase, wheelRadius, wheelThickness);
		//this.transmission = vehicle.getConfiguration().getVehicleTransmission().cloneTransmission();
		//initTestingVehicle();
	}
	
	public VehiclePhysicsSolver withAero(IAeroComponent aeroPiece) {
		this.aeroComponents.add(aeroPiece);
		return this;
	}
	
	public void step() {
		this.physicsStep += 1;
	}
	
	public void resetStep() {
		this.physicsStep = 0;
	}
	
	public ArrayList<IAeroComponent> getAeroEquipment() {
		return this.aeroComponents;
	}
	
	
	public double getCurrentRPM() {
		return this.engineSolver.rpm;
	}
	
	public double getPreviousRPM() {
		return this.engineSolver.previousRPM;
	}
	
	public VehiclePhysicsSolver clone() {
		VehiclePhysicsSolver solv = new VehiclePhysicsSolver(this.configuration);
		solv.withAxels(this.frontAxel.newInstance(), this.rearAxel.newInstance());
		solv.aeroComponents = this.aeroComponents;
		return solv;
		
	}
	
	public PhysicsConfiguration compileStructure() {
		return configuration;
	}
	
	public void activate(EntityVehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public PhysicsConfiguration getPhysConf() {
		return this.configuration;
	}
	
	public void setupConfiguration(PhysicsConfiguration conf) {
		this.wheelBase = conf.wheelBase;
		this.COGHeight = conf.COGHeight;
		
		this.transmission = conf.trans.cloneTransmission();
		this.engine = conf.getEngine();
		this.engineSolver = new EngineSolver(this, this.engine);
		
		
	}
	
	public Vec3d getAccelerationVector() {
		return this.acceleration;
	}
	

	
	public Vec3d getOreintationVector() {

		return Vec3d.fromPitchYaw(/*vehicle.rotationPitch*/0f, vehicle.rotationYaw);

	}
	
	public Vec3d getVelocityVector() {
		if(velocity == null) return Vec3d.ZERO;
		return velocity;
	}
	
	public void applyHandbrake() {
		this.isDrifting = true;
		rearAxel.applyHandbrake();
	}
	
	public double getSyntheticAcceleration() {
		if(Double.isNaN(synthAccelFor)) return 0.0;
		return synthAccelFor;
	}
	
	public void releaseHandbrake() {
		this.isDrifting = false;
		rearAxel.releaseHandbrake();
	}
	
	public double getSideSlipAngle() {
		try {

			
			Vec3d uVec = getOreintationVector();
			
			
			//System.out.println(Vec3d.fromPitchYaw(0.0f, vehicle.rotationYaw) + " | " + uVec);
			

			
			
			Vector2d u2D = new Vector2d(uVec.x, uVec.z);
			Vector2d v2D = new Vector2d(velocity.x, velocity.z);
			
			
		
			v2D.normalize();
			double mult = Math.signum(uVec.crossProduct(velocity).y);
			double result = u2D.angle(v2D) * mult;
			
			if(Double.isNaN(result)) {
				return 0.0;
			}
			
			return result;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return 0.0;
		
	}
	
	
	
	public void setupSolver() {
		
	}
	
	
	
	public double getLongSpeedDir() {
		return 0.0;
	}
	
	public double getLongitudinalSpeed() {
		if(Double.isNaN(velocity.length())) return 0.0;
		

		return velocity.length();
		/*
		if(Double.isNaN(velocity.length())) return vehicle.throttle;
		

		return velocity.length()/+(vehicle.throttle/10);*/

	}
	
	public void updateSuspensionPlatform() { 
		
		
		Vec3d pointA = rearAxel.leftWheel.getSuspensionPosition();
		Vec3d pointB = rearAxel.rightWheel.getSuspensionPosition();
		Vec3d pointC = frontAxel.rightWheel.getSuspensionPosition();
		
		double height = (pointA.y+pointB.y+pointC.y)/3.0;
		//System.out.println(height);
		vehicle.rideOffset = height;
		
		 
		System.out.println(pointA + " | " + pointB + " | " + pointC);
		
		Vec3d ab = pointB.subtract(pointA);
		Vec3d ac = pointC.subtract(pointA);
		
		Vec3d planeNormal = ab.crossProduct(ac);
		
		
		
		
		Vec3d oreintation = getOreintationVector();
		
		Vec3d forwardVec = planeNormal.crossProduct(oreintation).crossProduct(oreintation);
		
		Vec3d bitangent = planeNormal.crossProduct(forwardVec);
		
		
		float[] angles = anglesFromVectors(forwardVec.normalize(), planeNormal.normalize());
		
		this.angles = angles;
		
		//System.out.println(planeNormal +  " | " + forwardVec);
		
		System.out.println("Angles (YPR): " + angles[0] + " | " + angles[1] + " | " + angles[2]);
		
		
		this.rotMat = new Matrix3d(planeNormal.x, planeNormal.y, planeNormal.z,
				forwardVec.x, forwardVec.y, forwardVec.z,
				bitangent.x, bitangent.y, bitangent.z);
		
		
		
	}
	
	public float[] anglesFromVectors(Vec3d forward, Vec3d up)
	{
		float[] angles = new float[3];
	    // Yaw is the bearing of the forward vector's shadow in the xy plane.
	    float yaw = (float) Math.atan2(forward.y, forward.x);

	    // Pitch is the altitude of the forward vector off the xy plane, toward the down direction.
	    float pitch = (float) -Math.asin(forward.z);

	    // Find the vector in the xy plane 90 degrees to the right of our bearing.
	    float planeRightX = (float) Math.sin(yaw);
	    float planeRightY = (float) -Math.cos(yaw);

	    // Roll is the rightward lean of our up vector, computed here using a dot product.
	    float roll = (float) Math.asin(up.x*planeRightX + up.y*planeRightY);
	    // If we're twisted upside-down, return a roll in the range +-(pi/2, pi)
	    if(up.z < 0)
	        roll = (float) (Math.signum(roll) * Math.PI - roll);

	    // Convert radians to degrees.
	    angles[0]   =   (float) (yaw * 180 / Math.PI);
	    angles[1] = (float) (pitch * 180 / Math.PI);
	    angles[2]  =  (float) (roll * 180 / Math.PI);
	    return angles;
	}
	
	public double getTractionTorque() {
		return this.rearAxel.tractionTorque;
	}
	
	public void updateEngineForces() {
		
		
		if(this.engineSolver.rpm != 0) {
			this.engineSolver.rpm -= 3;
			if(this.engineSolver.rpm < 0) this.engineSolver.rpm = 0;
		}
		
		// if vehicle is off, there are no engine
		// forces, save the calculation time.
		if(!vehicle.isVehicleRunning()) return;
		
	
		
		// run all the engine calculations
		double driveTorque = this.engineSolver.getDriveTorque();

		// apply the drive torque
		rearAxel.applyDriveTorque(driveTorque);
		
		// Run the automatic transmission
		transmission.runAutomaticTransmission(vehicle, this.engineSolver.rpm);
	}
	
	/*
	public void updateEngineForcesOld() {
		prevRPM = currentRPM;
		//System.out.println(idleRPM);
		/*
		if(!vehicle.isVehicleRunning()) {
			if(currentRPM > 0) {
				currentRPM -= 10;
			}
			if(currentRPM < 0) currentRPM = 0;
		
		
		
		// If the engine is off, this code should not
		// be run.
		
		//System.out.println(vehicle.isVehicleRunning());
		//System.out.println(this.vehicle.vehicleIsRunning);
	
		if(!vehicle.isVehicleRunning()) return;
		
		Transmission t = transmission;
		double gearRatio = t.getCurrentGearRatio();
		double finalDriveRatio = t.getDifferentialRatio();


		int redline = configuration.getEngine().getRedline();
		int maxRPM = configuration.getEngine().getMaxRPM();
		int idleRPM = configuration.getEngine().getIdleRPM();
		
		
		int rpm = 0;
		
		
		//flywheel.doPhysics(0.0001);
		//flywheel.angularVelocity = 0.0;
		
		
		//rpm = (int) flywheel.getRPM();
		
		
		
		
		if(!t.isEngineDeclutched()) {
			
		//	System.out.println("RWAV: " + rearAxel.getWheelAngularVelocity() + " | " + gearRatio + " | " + finalDriveRatio);
			rpm = (int) VehiclePhysUtil.getEngineRPM(rearAxel.getWheelAngularVelocity(), gearRatio, finalDriveRatio);
			
			
			
			if(Math.abs(rpm-currentRPM) > idleRPM) {
				
				double bruv = rpm-currentRPM;
				currentRPM += bruv*0.2;
				rpm = currentRPM;
			}
		} else {
			
			this.currentRPM += 50*vehicle.throttle;
			this.currentRPM -= 10*Math.pow(currentRPM/maxRPM+1.0, 2);
			
			
			
		
			
			rpm = currentRPM;
		}
		
		
		
		//int redline = configuration.getEngine().getRedline();
		

		
		
		if(rpm < idleRPM) {
			rpm = configuration.getEngine().getIdleRPM();
			
		}
		if(rpm > redline) {
			rpm = redline;
		}
		
		//System.out.println(rpm);
		
		//System.out.println(rpm);
		
		
		// for smoothing purposes
		
		
		currentRPM = rpm;
		
		
		
		
		Engine engine = configuration.getEngine();
		
		double efficiency = configuration.getDriveTrainEfficiency();
		
		double torque = engine.getTorqueAtRPM(currentRPM);
		
		double drvT = VehiclePhysUtil.getDriveTorque(torque, gearRatio, finalDriveRatio, efficiency)*(vehicle.throttle);
	
		
		
		flywheel.applyTorque(drvT);
		
		

		// if the engine is declutched,
		// do not apply any force to the wheels.
		// As it is not analog, there is no
		// slippage.
		//System.out.println(t.isEngineDeclutched());
		if(t.isEngineDeclutched()) drvT = 0;

		
		synthAccelFor += drvT*timeStep/1000;
		
		// FIX THIS IN THE FUTURE

		//System.out.println("Drive torque: " + drvT);

		rearAxel.applyDriveTorque(drvT);
		
		transmission.runAutomaticTransmission(vehicle, currentRPM);
	}*/
	
	public double weightRatio;
	
	
	public void updateLoad() {
		
		this.materialBelow = vehicle.world.getBlockState(vehicle.getPosition().down()).getMaterial();
		
		double downForce = 0;
		if(!this.aeroComponents.isEmpty()) {
			for(IAeroComponent comp : getAeroEquipment()) {
				downForce += VehiclePhysUtil.calculateLift((float) comp.getLiftCoefficient(), getLongitudinalSpeed(), comp.getAreaOfWing())*10;
			}
		}
		
		double mass = configuration.vehicleMass;
		double weight = mass*9.81 + downForce;
		double accel = accelerationValue;
		//System.out.println("down force: " + downForce);
		
		//weight *= 2;
		//System.out.println(accelerationValue + " | " + vehicle.getRealSpeed());
		
		//COGHeight = 0.2;
	
		double b = (wheelBase/2);
		double c = -(wheelBase/2);
		
		double weightFront = (b/wheelBase)*weight - (COGHeight/wheelBase)*mass*accel;
		double weightRear = (c/wheelBase)*weight - (COGHeight/wheelBase)*mass*accel;
	
		
		
		
		double newSynth = ((Math.abs(synthAccelFor) * 0.8))*Math.signum(synthAccelFor);
		double newSynthSide = Math.toDegrees(vehicle.steerangle)/5;

		synthAccelFor = newSynth;
		/*
		vehicle.forwardLean = accel/6;
		if(vehicle.forwardLean < 0) vehicle.forwardLean /= 5;
		*/
		
	//	vehicle.prevSideLean = vehicle.sideLean;
	//	vehicle.sideLean = (accel/2) + newSynthSide;
		
		//System.out.println(weightRear);
		
		rearAxel.applySuspensionLoad(weightRear*9.81);
		frontAxel.applySuspensionLoad(weightFront*-9.81);
	
		
		rearAxel.distributeLoad(weightFront);
		frontAxel.distributeLoad(-weightRear);
	}
	
	
	public double prevSuspensionPitch = 0;
	public double suspensionPitch = 0;
	
	public double prevSuspensionRoll = 0;
	public double suspensionRoll = 0;
	
	public void updateSimpleSuspension() {
		
		double acceleration = accelerationValue;
		
		if(physicsStep == 0) {
			this.prevSuspensionPitch = suspensionPitch;
			this.prevSuspensionRoll = suspensionRoll;
		}
		
		Vec3d sideG = velocity.scale(velocity.dotProduct(getOreintationVector().rotateYaw((float) Math.toRadians(-90)))).scale(timeStep);
		
		
		
		double sideAcceleration = 0.0;
		for(WheelSolver ws : wheels) sideAcceleration += ws.lateralForce;
		sideAcceleration *= timeStep;
		
		
		suspensionRoll = 5.53*sideG.length()*Math.signum(getSideSlipAngle());
		suspensionPitch = -1.53*(acceleration*2.81);
		
		
	}
	
	
	public void updateWheels() {
		if(vehicle.isBraking) {
			synthAccelFor -= 3;
			frontAxel.applyBrakingForce(8000);
			
			
			rearAxel.applyBrakingForce(8000);
		}
		frontAxel.setSteeringAngle(vehicle.steerangle);
		frontAxel.doPhysics();
		rearAxel.doPhysics();
	}
	
	public Vec3d calculateResistiveForces(Vec3d speed) {
		//Vec3d drag = Vec3d.ZERO;
		Vec3d drag = VehiclePhysUtil.realDrag((float) configuration.getDragCoefficient(), speed, configuration.getFrontArea());
		Vec3d rolling = VehiclePhysUtil.rollingResistance(0.02F, speed);
		return drag.add(rolling);
		
	}
	
	public double angAccel = 0.0;
	
	public void updateRotationalVelocity() {
		double rC = transmission.isReverseGear ? -1 : 1;
		
		double torqueContributionRear = rearAxel.latNonVec()*rearAxel.COGoffset*rC;
		double torqueContributionFront = Math.cos(vehicle.steerangle)*frontAxel.latNonVec()*frontAxel.COGoffset*rC;

		
		double totalAxelTorque = torqueContributionFront + torqueContributionRear + collisionTorque;
		
		Matrix3f inertia = getPhysConf().getVehicleMassObject().inertia;
		//Matrix3f inertia = InertiaKit.inertiaTensorCube(1660, 1.6f, 3.0f, 6.0f);

		
		// add roll impulse
		if(rotationalImpulse != 0.0) {
			vehicle.rotationRoll += rotationalImpulse;
			rotationalImpulse = 0.0;
		}
		
		
		
		// https://suspensionsecrets.co.uk/calculating-ideal-spring-and-roll-bar-rates/
		/*
		double rollContant = 1.5;
		double rollTorque = (velocity.length()*getSideSlipAngle());
		vehicle.rotationRoll += (float) Math.toDegrees(rollTorque/(inertia.m00));
		double diff = 1.0*Math.sin(Math.toRadians(vehicle.rotationRoll));
		if(vehicle.rotationRoll < 0) {
			 vehicle.rotationRoll += rollContant*Math.abs(diff);
		} else if (vehicle.rotationRoll > 0 ) {
			vehicle.rotationRoll -= rollContant*Math.abs(diff);
		}*/
		
		float mR = 5f;
		if(vehicle.rotationRoll < 0) {
			vehicle.rotationRoll = Math.max(vehicle.rotationRoll, -mR);
		} else if (vehicle.rotationRoll > 0) {
			vehicle.rotationRoll = Math.min(vehicle.rotationRoll, mR);
			
		}
		
		
		//System.out.println(angAccel);
		angAccel += totalAxelTorque/inertia.m11;
		
		if(this.materialBelow == Material.ROCK) {
			//angAccel *= 1.5;
			//angAccel *= 1.5;
		}
		
		
		if(vehicle.getRealSpeed() == 0.0) {
			
			angAccel = 0.0;
			
			// add it back as a roll impulse so it's not abrupt
			if(angularVelocity != 0.0) {
				//rotationalImpulse += -Math.signum(getSideSlipAngle()) * angularVelocity*1.8;
			}
			
			angularVelocity *= 0.2;
		}
		
		
		
		
		
			angularVelocity *= 0.999;
			//angularVelocity *= 0.99;
			angularVelocity += timeStep*angAccel;
			vehicle.rotationYaw += Math.toDegrees(timeStep*angularVelocity);
			
			
			angAccel = 0;
		
		
		
		vehicle.rotationYaw += vehicle.driftTuner;
		

		vehicle.steerangle += Math.toDegrees(timeStep*angularVelocity*-1)*0.02*rC;

		
		
		// pitching
		
		double forwardG = accelerationValue;
		vehicle.forwardLean = forwardG;
		if(Double.isNaN(vehicle.forwardLean)) vehicle.forwardLean = 0.0;
		 
		
		
		
	}
	
	
	
	public void updatePosition() {
		timeStep = 0.001;
		
		double mass = configuration.vehicleMass;
		
		
		
		
		
		
		Vec3d lForce = rearAxel.getLongitudinalForce()/*.rotatePitch((float) Math.toRadians(vehicle.rotationPitch))*/.rotateYaw((float) ((float) Math.toRadians(-vehicle.rotationYaw+vehicle.driftTuner)));
		Vec3d latForce = rearAxel.adjLateralForce().add(frontAxel.adjLateralForce().scale(Math.cos(vehicle.steerangle)));
		Vec3d destructive = calculateResistiveForces(velocity);
		

		
		Vec3d vertForce = Vec3d.ZERO;
		
		boolean b = vehicle.world.getBlockState(vehicle.getPosition()).getMaterial().isLiquid();
		if(!vehicle.onGround) {
			
			vertForce = new Vec3d(0, -mass*(9.81)*2, 0);
		}
		
		//System.out.println(vertForce);
		
		
		Vec3d net = (lForce).add(latForce).add(destructive).add(vertForce);
		Vec3d acceleration = new Vec3d(net.x/mass, net.y/mass, net.z/mass);
		;
		
		//System.out.println(acceleration);
		
		
		
		//this.acceleration = acceleration;
		
		if(acceleration == null) return;
		
		
		// calculate velocity
		double xV = velocity.x + timeStep*acceleration.x;
		double yV = velocity.y + timeStep*acceleration.y;
		double zV = velocity.z + timeStep*acceleration.z;
		Vec3d newVel = new Vec3d(xV, yV, zV);
		
		//System.out.println(hashCode());
		velocity = newVel;
		
		
		
		
		double oYV = yV;
		
		if(b) oYV *= 0.7;
		
	
		
		double r = 1.0;
		if(b) r = 0.8;
 		
		
		
		
		
		velocity = new Vec3d(velocity.x*r, oYV, velocity.z*r);
		

		

		/*
		 * REVERSE VEHICLE, BAD METHOD, BUT IT WORKS.
		 */
		double rG = 1.0;
		if(transmission.isReverseGear) {
			rG = -1;
		}
		
		
		/*
		 * Some stability features
		 * 
		 */
		
		double yT = velocity.y;

		
			boolean wheelThrottle = vehicle.throttle == 0.0 || transmission.isEngineDeclutched();
			//System.out.println(velocity.length());
			if(/*velocity.length() < 10*/vehicle.getRealSpeed() < 2 && wheelThrottle && !transmission.isReverseGear ) {
				
				velocity = velocity.scale(0.01);
				
			}
			
			if(velocity.length() < 0.03 && wheelThrottle) {
				
				velocity = Vec3d.ZERO;
			}
		
			
		
			if(!b) yT = velocity.y;
			
		// calculate position
		double xP = timeStep*velocity.x * rG;
		double yP = timeStep*yT;
		double zP = timeStep*velocity.z * rG;

		
		
	
		//System.out.println(yP);
		
		Vec3d pD = new Vec3d(xP, yP, zP);
		
		
		//this.vehicle.setPosition(vehicle.posX + xP , vehicle.posY + yP, vehicle.posZ + zP);
	this.vehicle.move(MoverType.SELF, xP, yP, zP);
		
//	vehicle.resetPositionToBB();
		if(this.physicsStep % 10 == 0) doBlockCollision();
	
		this.acceleration = acceleration;
		
	}
	
	public void doBlockCollision() {
		this.vehicle.doOBBCollision();
	}
	

	
	public void updatePhysics() {
		
		vehicle.rotationYaw -= vehicle.driftTuner;
		updateEngineForces();
		updateLoad();
		updateWheels();

		updateRotationalVelocity();
		updateSimpleSuspension();
		updatePosition();
		
		
		
		step();
		
		
		
	}

	@Override
	public VehiclePhysicsSolver readFromBuf(ByteBuf buf) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void writeToBuf(ByteBuf buf) {
		
		
		
		
		
	}

	public VehiclePhysicsSolver jimHansen(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * BUILDING TOOLS
	 */
	
	/**
	 * Initializes a testing vehicle with 225/45R17 tires
	 * 
	 */
	
	public VehiclePhysicsSolver withAxels(WheelAxel front, WheelAxel rear) {
		front.assignSolver(this);
		rear.assignSolver(this);
		
		frontAxel = front;
		rearAxel = rear;
		return this;
	}
	
	


	
	

}
