package com.paneedah.weaponlib.vehicle.jimphysics;


import net.minecraft.util.math.Vec3d;

public class VehiclePhysUtil {
	
	/*
	 * Spring force
	 */
	
	public static double springEnergy(double k, double x) {
		return 0.5*k*x*x;
	}
	
	public static double springForce(double k, double x) {
		return k*x;
	}
	
	public static double springStretchFromEnergy(double k, double energy) {
		return Math.sqrt(2*energy/k);
	}
	
	
	/*
	 * LONGITUDINAl
	 */
	public static Vec3d simpleTractionForce(Vec3d oreintation, double engineForce) {
		return oreintation.scale(engineForce);
	}
	
	
	/*
	 * RESISTIVE FORCES
	 */
	
	public static double calculateLift(float coF, double longitudinalSpeed, double areaOfCar) {
		return 0.5*1.225*areaOfCar*coF*(longitudinalSpeed*longitudinalSpeed);
	}
	
	public static Vec3d realDrag(float coF, Vec3d speed, double areaOfCar) {
		return speed.scale(0.5).scale(-coF).scale(/*1.225*/0.20).scale(speed.lengthSquared());
	}
	
	public static Vec3d simpleDragForce(float dragC, Vec3d motionVector) {
		return motionVector.scale(-dragC).scale(motionVector.length()*100);
	}
	
	public static Vec3d rollingResistance(float cR, Vec3d motionVector) {
		return motionVector.scale(-cR);
	}
	
	public static Vec3d brakingForce(float brakingC, Vec3d motionVector) {
		 return motionVector.scale(-brakingC);
	}
	
	/*
	 * PHYSICS
	 */
	
	public static double getAcceleration(double netForce, double weight) {
		return netForce/weight;
	}
	
	/*
	 * WEIGHT TRANSFER
	 */
	
	public static double getMaxForce(float mu, double mass) {
		return mu*(mass*9.81);
	}
	
	
	public static double getTotalWeightOfCar(double mass) {
		return mass*9.81;
	}
	
	public static double frontWheelForce(double h, double weight, double wheelBase, double acceleration, double mass) {
		return 0.5*weight-(h/wheelBase)*mass*acceleration;
	}
	
	public static double rearWheelForce(double h, double weight, double wheelBase, double acceleration, double mass) {
		return 0.5*weight+(h/wheelBase)*mass*acceleration;
	}
	
	/*
	
	public static Vec3d getDriveForce(Vec3d oreintation, double torque, double gearRatio, double finalDriveRatio, double tEf, double wheelRadius) {
		return oreintation.scale(torque*gearRatio*finalDriveRatio*tEf), wheelRadius);
	}*/
	
	public static double getHorsePower(double torque, double rpm) {
		return torque*rpm/5252;
	}
	
	public static double getDriveTorque(double engineTorque, double gearRatio, double finalDriveRatio, double tEf) {
		return engineTorque*gearRatio*finalDriveRatio*tEf;
	}
	
	public static double getDrF(double engineTorque, double gearRatio, double finalDriveRatio, double wheelRadius) {
		return engineTorque*gearRatio*finalDriveRatio/wheelRadius;
	}
	
	public static double getEngineRPM(double wheelRotationRate, double gearRatio, double finalDriveRatio) {
		return (wheelRotationRate*gearRatio*finalDriveRatio*60)/(2*Math.PI);
	}
	
	public static double quickWheelSpeed(double carVelocity, double wheelRadius) {
		return carVelocity/wheelRadius;
	}
	
	public static double angularVelocityOfEngine(int rpm) {
		return 2*Math.PI*rpm/60;
	}
	
	public static double wheelAngularVelocity(int rpm, double gearRatio, double finalDriveRatio) {
		return 2*Math.PI*rpm/(60*gearRatio*finalDriveRatio);
	}
	
	public static double translationalVelocity(double wheelAngVelocity, double wheelRadius) {
		return wheelAngVelocity*wheelRadius;
	}
	
	public static Vec3d getAngularVelocityOfNoSlipWheel(Vec3d carSpeed, double wheelRadius) {
		double x = carSpeed.x/(2*Math.PI*wheelRadius);
		double y = carSpeed.y/(2*Math.PI*wheelRadius);
		double z = carSpeed.z/(2*Math.PI*wheelRadius);
		return new Vec3d(x, y, z);
		
	}
	
	public static double getSlipRatio(double wheelAngularVelocity, double wheelRadius, double speed) {
		return (wheelAngularVelocity*wheelRadius-speed)/speed;
	}
	
	/*
	 * PACEJKA
	 */
	
	public static double pacejkaLong(double tireLoad, double slip, double shape, double peak, double curvature, double stiffness) {
		double F = tireLoad*peak*Math.sin(shape*Math.atan(stiffness*slip-curvature * (stiffness*slip-Math.atan(stiffness*slip))));
		return F;
	}
	
	/*
	 * ANGULAR
	 */
	
	public static double inertiaOfACylinder(double mass, double radius) {
		return mass*Math.pow(radius, 2)/2;
	}
	
	
	
	/*
	 * LOW SPEED CORNERING
	 */
	
	public static double doubleRadiusOfLSTurn(double wheelBase, double steeringAngle) {
		return wheelBase/Math.sin(steeringAngle);
	}
	
	public static double carTurnRate(Vec3d speed, double turnRadius) {
		return speed.length()/turnRadius;
		
	}
	
	/*
	public static Vec3d getSlipRatio(Vec3d wheelAngularVelocity, double wheelRadius, Vec3d carSpeed) {
		double x = (wheelAngularVelocity.x*wheelRadius-carSpeed.x)/carSpeed.length();
		double y = (wheelAngularVelocity.y*wheelRadius-carSpeed.y)/carSpeed.length();
		double z = (wheelAngularVelocity.z*wheelRadius-carSpeed.z)/carSpeed.length();
		return new Vec3d(x, y, z);
	}
	*/
	public static Vec3d getActualLongitudinalForce(Vec3d nLongForce, double loadOnWheel) {
		return nLongForce.scale(loadOnWheel);
	}
	
	public static Vec3d longitudinalForce(Vec3d slipRatio, double tractionConstant) {
		return slipRatio.scale(tractionConstant);
	}
	
	public static Vec3d tractionTorque(Vec3d tractionForce, double wheelRadius) {
		return tractionForce.scale(wheelRadius);
	}
	
	public static Vec3d getTotalTorqueOnAxel(Vec3d driveTorque, Vec3d tractionTorqueOne, Vec3d tractionTorqueTwo, Vec3d brakeTorque) {
		return driveTorque.add(tractionTorqueTwo).add(tractionTorqueTwo).add(brakeTorque);
	}
	
	/*
	 * HIGH SPEED CORNERING
	 */
	public static double slipAngleFront(double latMag, double longMag, double angularVelocity, double disToAxel, double steeringAngle) {
		return Math.atan((latMag + (angularVelocity*disToAxel))/(longMag))-(steeringAngle*Math.signum(longMag));
	}
	
	public static double slipAngleRear(double latMag, double longMag, double angularVelocity, double disToAxel) {
		return Math.atan((latMag-(angularVelocity*disToAxel))/longMag);
	}
	
	
	
	
	
	

}
