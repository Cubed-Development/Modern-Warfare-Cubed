package com.paneedah.mw.vehicle;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.models.ATV;
import com.paneedah.mw.models.ATVSteering;
import com.paneedah.mw.models.ATVWheel;
import com.paneedah.mw.models.SampleVehicleControlArm;
import com.paneedah.mw.vehicle.engines.PolarisATVEngine;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.*;
import com.paneedah.weaponlib.vehicle.jimphysics.Chassis;
import com.paneedah.weaponlib.vehicle.jimphysics.Dimensions;
import com.paneedah.weaponlib.vehicle.jimphysics.PhysicsConfiguration;
import com.paneedah.weaponlib.vehicle.jimphysics.TyreSize;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.WheelAxel;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.WheelSolver;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.opengl.GL11;

public class ATVFactory implements VehicleFactory {

	
	
	
    public void createVehicle(ModContext modContext) {
        
    	
        StatefulRenderer<VehicleRenderableState> renderer = null;
    	
    	if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
    		renderer = new VehicleRendererBuilder()
			
					.performShiftAnimation(false)
    				.shiftWithRight(false)
                    
                    .withPartTexturedModel(VehiclePart.MAIN, ATV::new, "atv")
                    .withPartTexturedModel(VehiclePart.STEERING_WHEEL, ATVSteering::new, "atv")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_WHEEL, ATVWheel::new, "atv")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_WHEEL, ATVWheel::new, "atv")
                    .withPartTexturedModel(VehiclePart.REAR_LEFT_WHEEL, ATVWheel::new, "atv")
                    .withPartTexturedModel(VehiclePart.REAR_RIGHT_WHEEL, ATVWheel::new, "atv")

                    // part positions
                    
                    .withPartPosition(VehiclePart.MAIN, c -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) c.getEntity();
                    	float forwardLean = (float) entityVehicle.forwardLean;
                    	float sideLean = (float) entityVehicle.sideLean;
                    	
                        Positioners.position(
                                -0.7f, (float) (-1.500000f-entityVehicle.rideOffset), -1.100000f,
                                0.0f, 0f, 0f,
                                0.000000f, 0.000000f, 0f,
                                1.20000f, 1.20000f, 1.20000f
                            );
                    })
                    
                    .withPartPosition(VehiclePart.WINDOWS, c -> {
                    	
                    })
                   
                    .withPartPosition(VehiclePart.STEERING_WHEEL, context -> {
                    	
                    	float steer = (float) -Math.toDegrees(context.getSymmetricProgress()) - 57;
                    	
                    	Positioners.position(
                    		    0.000000f, 0.000000f, 0.100000f,
                    		    0.000000f, -steer, 0.000000f,
                    		    -0.000000f, 0.000000f, 0.475000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.IDLE, context -> {
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.000000f, -0.575000f, 1.375000f);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(-80.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-20.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(0.500000f, -1.225000f, -0.225000f);
                    })
                    
//                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.SHIFTING, context -> {
//                		EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
//                		Transmission trans = entityVehicle.solver.transmission;
//                		GearShiftPattern pattern = entityVehicle.getSolver().getPhysConf().getShiftPattern();
//                		entityVehicle.smoothShift.updatePrev();
//                		entityVehicle.smoothShift.set(pattern.quickDoAnimation(trans).scale(0.3));
//                		Vec3d offset = entityVehicle.smoothShift.get();
//                    	float xO = (float) -offset.z*0.5f;
//                    	float zO = (float) -offset.x;
//                    	
//                        Positioners.position(
//                                -1.500000f+xO, -0.370000f, 2.380000f+zO,
//                                -50.000000f, 0.000000f, 0.000000f,
//                                0.000000f, 0.000000f, 0.000000f,
//                                1.000000f, 1.000000f, 1.000000f
//                            );
//                    }, 50)

                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.IDLE, context -> {
                    	
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.025000f, -0.475000f, 1.374999f);
                    })
                    
                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(-75.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.550000f, -1.174999f, -0.150000f);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_LEFT_CONTROL_ARM, context -> {
                    	
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress()) + 60;
                    	
                    	Positioners.position(
                    		    0.050000f, 0.000000f, 0.000000f,
                    		    0.000000f, steer, 0.000000f,
                    		    0.700000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    	
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_RIGHT_CONTROL_ARM, context -> {
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress()) + 60;
                    	
                    	Positioners.position(
                    		    0.050000f, 0.000000f, -0.125000f,
                    		    0.000000f, steer, 0.000000f,
                    		    -0.775000f, 0.000000f, 0.200000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    	
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_LEFT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	float vertical = (float) entityVehicle.getSolver().frontAxel.leftWheel.getRenderRideHeight();
                    	WheelSolver ws = entityVehicle.getSolver().frontAxel.leftWheel;
                    	
                    		    Positioners.position(
                    		    	    0.000000f, -0.020000f, 0.060000f,
                    		    	    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    	    0.000000f, 1.040000f, 0.000000f,
                    		    	    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_RIGHT_WHEEL, context -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().frontAxel.rightWheel;
                    	float vertical = (float) entityVehicle.getSolver().frontAxel.rightWheel.getRenderRideHeight();
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress());
                    	
                    	Positioners.position(
                    		    -1.424999f, -0.025000f, 0.200000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 1.035000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    	
                    })

                    .withPartPosition(VehiclePart.REAR_LEFT_WHEEL, context -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.leftWheel;
                    	float vertical = (float) entityVehicle.getSolver().rearAxel.leftWheel.getRenderRideHeight();
                    	
                    	Positioners.position(
                    		    0.025000f, -0.020000f, 1.960000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 1.030000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);

                    })
                    
                    .withPartPosition(VehiclePart.REAR_RIGHT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.rightWheel;
                    	float vertical = (float) ws.getRenderRideHeight();
                    	
                    	Positioners.position(
                    		    -1.400000f, -0.020000f, 1.950000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 1.030000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    
                    
                    
                    
                    .build(modContext, VehiclePart.MAIN);
            
    	}
    	// https://www.car.info/en-se/audi/a4/s4-6627162/specs
        new EntityVehicleConfiguration.Builder()

                .withName("atv_polaris_sportsman_850_2019")
                .withEntityIdSupplier(() -> 10205)

                .withPhysicsConfig(new PhysicsConfiguration(
                        /* WHEELBASE (m)*/ 1.2827,
                        /* FRONTAL AREA (m^2) */ 1.07,
                        /* DRAG COEFF. */ 0.1,
                        /* MASS (kg) */ 319,
                        /* COG HEIGHT */ 0.07,
                        /* DriveT EFF. */ 1.0,
                        /* Transmission */ PartInit.ATVTransmission,
                        /* Engine */ new PolarisATVEngine("ProStar 4-S DOHC Single Cylinder", "Polaris", 6015, 3754, 1031),
                        /* Real Dimensions (L*W*H)*/ new Dimensions(2.1082, 1.2192, 1.1938),
                        /* Dimensions */ new Vec3d(/*length*/ 2, /*width*/ 1.5, /*height*/ 1.5),
                        /* Chassis */ Chassis.SUV,
                        /* Shift pattern */ PartInit.STANDARD_SIX_SHIFT)

                        .buildStructure()

                        .withAxels(new WheelAxel(0.5, false)
                                        .withWheels(new WheelSolver(new TyreSize("235/40R18"), 75.0, false, 0.8)
                                                        .withRelativePosition(new Vec3d(-1.7, 0.0, 1.75)),
                                                new WheelSolver(new TyreSize("235/40R18"), 75.0, false, 0.8)
                                                        .withRelativePosition(new Vec3d(0.5, 0.0, 1.75))),

                                new WheelAxel(-0.5, true)
                                        .withWheels(new WheelSolver(new TyreSize("235/40R18"), 75.0, false, 0.8)
                                                        .withRelativePosition(new Vec3d(-1.7, 0.0, -1.75)),
                                                new WheelSolver(new TyreSize("235/40R18"), 75.0, false, 0.8)
                                                        .withRelativePosition(new Vec3d(0.5, 0.0, -1.75)))
                        )
                        .compileStructure()


                )

                .withBackfireSound("carbackfire1")
                .withGearshiftSound("gearshift4")
                .withEnterSound("vehicle-enter")
                .withExitSound("vehicle-exit")
                //              perform | righthand
                .withShiftSettings(false, false)
                .withRunSound("audi_s4_engine")
                .withIdleSound("audi_s4_rev")
                .withRevSounds("audi_s4_rev$")
                .withConstantRevSound("audi_s4_max_rev")
                .withOBBDimensions(1, 1, 1)
                .withSeat(new Vec3d(-0.5, 0.2, -0.3))
                .withRenderer(renderer)
                .build(ModernWarfareMod.MOD_CONTEXT);
    }

}
