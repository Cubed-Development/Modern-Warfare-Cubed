package com.paneedah.mwc.weaponlib.vehicle.jimphysics.solver.components;

import com.paneedah.mwc.weaponlib.vehicle.jimphysics.Engine;
import com.paneedah.mwc.weaponlib.vehicle.jimphysics.MechanicalClutch;
import com.paneedah.mwc.weaponlib.vehicle.jimphysics.Transmission;
import com.paneedah.mwc.weaponlib.vehicle.jimphysics.VehiclePhysUtil;
import com.paneedah.mwc.weaponlib.vehicle.jimphysics.engines.FlywheelSolver;
import com.paneedah.mwc.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;

public class EngineSolver {

	// ENGINE CLASS
	public Engine engineTemplate;

	// Vehicle Physics Solver
	public VehiclePhysicsSolver solver;

	// Flywheel
	public FlywheelSolver flywheel = new FlywheelSolver(30, 0.2, 0.01);
	
	
	public double previousRPM;
	public double rpm;
	
	

	public EngineSolver(VehiclePhysicsSolver solver, Engine engineTemplate) {
		this.engineTemplate = engineTemplate;
		this.solver = solver;
	}

	public double getDriveTorque() {
		
		//System.out.println(solver.transmission.getClutch().getSlippage());
		
		// if vehicle is off, there are no engine
		// forces, save the calculation time.
		if (!solver.vehicle.isVehicleRunning()) {
			
			return 0.0;
		}
			

		Transmission t = solver.transmission;
		MechanicalClutch clutch = t.getClutch();

		double gearRatio = t.getCurrentGearRatio();
		
		double finalDriveRatio = t.getDifferentialRatio();

		int redline = engineTemplate.getRedline();
		int idleRPM = engineTemplate.getIdleRPM();

		
		int technicalRPM = (int) VehiclePhysUtil.getEngineRPM(solver.rearAxel.getWheelAngularVelocity(), gearRatio,
				finalDriveRatio);
		
	
			
	
//		/System.out.println(clutch.getSlippage());
		if (clutch.getSlippage() == 1 && !t.inNeutral()) {
			// Clutch is fully connected, easiest one to solve!
		//	System.out.println("tech: " + technicalRPM);
			rpm = technicalRPM;
			
			//System.out.println("bru");

			if (rpm < idleRPM) {
				rpm = idleRPM;
			//	solver.vehicle.vehicleIsRunning = false;
			}
		} else if (clutch.getSlippage() == 0 || t.inNeutral()) {
			// Clutch is not connected, solve engine independently.
			
			if (rpm < idleRPM) {
				rpm = engineTemplate.getIdleRPM();
			}
			
			if (rpm > redline) {
				rpm = redline;
			}
			
			double rTorque = engineTemplate.getTorqueAtRPM(this.rpm)*(solver.vehicle.throttle)-200;
			rpm += (((rTorque/flywheel.inertia)*solver.timeStep)*60)/(2*Math.PI);
			
		
			if (rpm < idleRPM) {
				rpm = engineTemplate.getIdleRPM();
			}
			
		} else {
			// Clutch is partially engaged, difficult to solve.

			//solver.vehicle.throttle += solver.vehicle.clutchTimer/10;
			if (rpm > redline) {
				rpm = redline;
			}
			
			double tracTorqueAtAxel = solver.getTractionTorque();
			double tTorque = tracTorqueAtAxel/(gearRatio*finalDriveRatio);
			
			// Angular Acceleration -> Ang Velocity (rad/s) -> RPM
			//double rpmShift = (((rTorque/flywheel.inertia)*solver.timeStep)*60)/(2*Math.PI);
			
			//System.out.println(clutch.getSlippage() + " | " + solver.vehicle.solver.rearAxel.getWheelAngularVelocity());
			
			double rTorque = ((engineTemplate.getTorqueAtRPM(this.rpm)*(solver.vehicle.throttle))*(1-clutch.getSlippage()))-(tTorque*clutch.getSlippage());
			//System.out.println("RPM CHANGE: " + (((rTorque/flywheel.inertia)*solver.timeStep)*60)/(2*Math.PI));
			rpm += (((rTorque/flywheel.inertia)*solver.timeStep)*60)/(2*Math.PI);
			
			
			
			if (rpm < idleRPM) {
				rpm = idleRPM;
				//solver.vehicle.vehicleIsRunning = false;
			}
		}

		if (rpm > redline) {
			rpm = redline;
			return 0.0;
		}
		
		//System.out.println(clutch.getSlippage());

		double efficiency = solver.configuration.getDriveTrainEfficiency();
		//System.out.println(rpm);
		double torque = engineTemplate.getTorqueAtRPM(rpm);
		double drvT = VehiclePhysUtil.getDriveTorque(torque, gearRatio, finalDriveRatio, efficiency)
				* (solver.vehicle.throttle);

		
		//System.out.println("clutch.getSlippage());
		// Apply slipping, if it is decluted, no torque,
		// otherwise, partial torque or full torque.
		drvT *= clutch.getSlippage();
		
	
		
		if(t.inNeutral()) {
			
			drvT = 0;
		}
		
		if (clutch.getSlippage() != 1 && clutch.getSlippage() != 0) {
			drvT *= 10;
			//drvT *= Math.max(10*(1-clutch.getSlippage()), 1.0);
		}
			

		//System.out.println(drvT);
		
		return drvT;
	}

}
