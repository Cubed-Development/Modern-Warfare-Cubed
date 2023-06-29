package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.vehicle.engines.AE86TruenoEngine;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.*;
import com.paneedah.weaponlib.vehicle.jimphysics.*;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.WheelAxel;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.WheelSolver;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.opengl.GL11;

public class AE86TruenoFactory implements VehicleFactory {

	
	
	
    public void createVehicle(ModContext modContext) {
        
    	
        StatefulRenderer<VehicleRenderableState> renderer = null;
    	
    	if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
    		renderer = new VehicleRendererBuilder()
			
					.performShiftAnimation(true)
    				.shiftWithRight(true)
                    
                    .withPartTexturedModel(VehiclePart.MAIN, AE86Trueno::new, "ae86trueno")
                    .withPartTexturedModel(VehiclePart.WINDOWS, AE86TruenoWindows::new, "ae86trueno")
                    .withPartTexturedModel(VehiclePart.STEERING_WHEEL, AE86TruenoSteeringWheel::new, "ae86trueno")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_WHEEL, AE86TruenoWheel::new, "ae86trueno")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_WHEEL, AE86TruenoWheel::new, "ae86trueno")
                    .withPartTexturedModel(VehiclePart.REAR_LEFT_WHEEL, AE86TruenoWheel::new, "ae86trueno")
                    .withPartTexturedModel(VehiclePart.REAR_RIGHT_WHEEL, AE86TruenoWheel::new, "ae86trueno")

                    // part positions
                    
                    .withPartPosition(VehiclePart.MAIN, c -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) c.getEntity();
                    	float forwardLean = (float) entityVehicle.forwardLean;
                    	float sideLean = (float) entityVehicle.sideLean;
                    	
                        Positioners.position(
                                1.0f, (float) (-1.500000f-entityVehicle.rideOffset), -2.700000f,
                                0.0f, 0f, 0.0f,
                                0.000000f, 0.000000f, 0.000000f,
                                0.950000f, 0.950000f, 0.950000f
                            );
                    })
                    
                    .withPartPosition(VehiclePart.WINDOWS, c -> {
                    	
                    })
                   
                    .withPartPosition(VehiclePart.STEERING_WHEEL, context -> {
                    	
                    	float steer = (float) -Math.toDegrees(context.getSymmetricProgress()) - 57;
//                    	Positioners.position(
//                    		    0.000000f, 0.000000f, 0.000000f,
//                    		    0.000000f, 0f, steer,
//                    		    -1.025000f, -0.325000f, 0.000000f,
//                    		    1.000000f, 1.000000f, 1.000000f
//                    		);
                    	
                    	Positioners.position(
                    		    0.000000f, 0.000000f, -0.100000f,
                    		    0.000000f, 0.000000f, steer,
                    		    -2.525000f, -0.125001f, 7.549999f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.IDLE, context -> {
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-2.450000f, -0.525000f, 2.874999f);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-80.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(20.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.400000f, -2.620000f, 2.280000f);
                    })
                    
                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.SHIFTING, context -> {
                		EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                		Transmission trans = entityVehicle.solver.transmission;
                		GearShiftPattern pattern = entityVehicle.getSolver().getPhysConf().getShiftPattern();
                		entityVehicle.smoothShift.updatePrev();
                		entityVehicle.smoothShift.set(pattern.quickDoAnimation(trans).scale(0.3));
                		Vec3d offset = entityVehicle.smoothShift.get();
                    	float xO = (float) -offset.z*0.5f;
                    	float zO = (float) -offset.x;
                    	
                        Positioners.position(
                                -1.500000f+xO, -0.370000f, 2.380000f+zO,
                                -50.000000f, 0.000000f, 0.000000f,
                                0.000000f, 0.000000f, 0.000000f,
                                1.000000f, 1.000000f, 1.000000f
                            );
                    }, 50)

                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.IDLE, context -> {
                    	
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-2.600000f, -0.500000f, 2.824999f);
                    })
                    
                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                    	GL11.glRotatef(-90.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(75.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.200000f, -2.750000f, -2.949999f);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_LEFT_CONTROL_ARM, context -> {
                    	
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress()) + 60;
                    	
                    	Positioners.position(
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    0.000000f, steer, 0.000000f,
                    		    -0.05000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_RIGHT_CONTROL_ARM, context -> {
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress()) + 60;
                    	
                    	Positioners.position(
                    		    0.050000f, 0.000000f, 0.000000f,
                    		    0.000000f, steer, 0.000000f,
                    		    -3.850000f, 0.000000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_LEFT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	float vertical = (float) entityVehicle.getSolver().frontAxel.leftWheel.getRenderRideHeight();
                    	WheelSolver ws = entityVehicle.getSolver().frontAxel.leftWheel;
                    	
                    	Positioners.position(
                    		    0.000000f, /*vertical*/ 0.0f, 0.000000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.750000f, -0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_RIGHT_WHEEL, context -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().frontAxel.rightWheel;
                    	float vertical = (float) entityVehicle.getSolver().frontAxel.rightWheel.getRenderRideHeight();
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress());
                    	
//                    	Positioners.position(
//                    		    -3.899998f, /*vertical*/0.0f, 0.000000f,
//                    		    (float) ws.getInterpolatedWheelRotation(), 0f, 0.000000f,
//                    		    -0.650000f, 0.750000f, 0.010000f,
//                    		    1.000000f, 1.000000f, 1.000000f
//                    		);
                    	
                    	Positioners.position(
                    		    -3.575001f, 0.000000f, 0.025000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0f, 0.000000f,
                    		    0.000000f, 0.800000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.REAR_LEFT_WHEEL, context -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.leftWheel;
                    	float vertical = (float) entityVehicle.getSolver().rearAxel.leftWheel.getRenderRideHeight();
                    	
//                    	Positioners.position(
//                    		    0.000000f, /*vertical*/0.0f, 5.724997f,
//                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
//                    		    0.000000f, 0.740000f, 0.000000f,
//                    		    1.000000f, 1.000000f, 1.000000f
//                    		);
                    	
                    	Positioners.position(
                    		    0.000000f, 0.000000f, 5.349998f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.800000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);

                    })
                    
                    .withPartPosition(VehiclePart.REAR_RIGHT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.rightWheel;
                    	float vertical = (float) ws.getRenderRideHeight();
                    	
//                    	Positioners.position(
//                    		    -3.799999f, /*vertical*/0.0f, 5.720000f,
//                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
//                    		    0.000000f, 0.749999f, 0.000000f,
//                    		    1.000000f, 1.000000f, 1.000000f
//                    		);
                    	
                    	Positioners.position(
                    		    -3.599999f, 0.000000f, 5.325000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.800000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    
                    
                    
                    
                    .build(modContext, VehiclePart.MAIN);
            
    	}
    	// https://www.car.info/en-se/audi/a4/s4-6627162/specs
        new EntityVehicleConfiguration.Builder()

                .withName("ae86trueno")
                .withEntityIdSupplier(() -> 10204)

                .withPhysicsConfig(new PhysicsConfiguration(
                        /* WHEELBASE (m)*/ 2.4003,
                        /* FRONT AREA (m^2) */ 1.8,
                        /* DRAG COEFF. */ 0.34,
                        /* MASS (kg) */ 995,
                        /* COG HEIGHT */ 0.2,
                        /* DriveT EFF. */ 1.0,
                        /* Transmission */ PartInit.AE86TruenoTransmission,
                        /* Engine */ new AE86TruenoEngine("1.6L 4A-C I4 SOHC", "Toyota", 7095, 5301, 1001),
                        /* Real Dimensions (L*W*H)*/ new Dimensions(4.180, 1.626, 1.336),
                        /* Dimensions */ new Vec3d(/*length*/ 6, /*width*/ 3, /*height*/ 2),
                        /* Chassis */ Chassis.COUPE,
                        /* Shift pattern */ PartInit.STANDARD_SIX_SHIFT)

                        .buildStructure()

                        .withAxels(new WheelAxel(0.5, false)
                                        .withWheels(new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(-1.7, 0.0, 1.75)),
                                                new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(0.5, 0.0, 1.75))),


                                new WheelAxel(-0.5, true)
                                        .withWheels(new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(-1.7, 0.0, -1.75)),
                                                new WheelSolver(new TyreSize("235/40R18"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(0.5, 0.0, -1.75)))
                        )
                        .compileStructure()


                )

                .withBackfireSound("carbackfire1")
                .withGearshiftSound("gearshift4")
                .withEnterSound("vehicle-enter")
                .withExitSound("vehicle-exit")
                .withShiftSettings(true, true)
                .withRunSound("audi_s4_engine")
                .withIdleSound("audi_s4_rev")
                .withRevSounds("audi_s4_rev$")
                .withConstantRevSound("audi_s4_max_rev")
                .withOBBDimensions(3.3, 2.5, 1.75)
                .withSeat(new Vec3d(-0.89, -0.2, 0.0))
                .withRenderer(renderer)
                .build(MWC.modContext);
    }

}
