package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.vehicle.engines.McLarenSennaEngine;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.*;
import com.paneedah.weaponlib.vehicle.jimphysics.Chassis;
import com.paneedah.weaponlib.vehicle.jimphysics.Dimensions;
import com.paneedah.weaponlib.vehicle.jimphysics.PhysicsConfiguration;
import com.paneedah.weaponlib.vehicle.jimphysics.TyreSize;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.WheelAxel;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.WheelSolver;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.aero.AeroWing;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;
import org.lwjgl.opengl.GL11;

public class McLarenSennaFactory implements VehicleFactory {

    public void createVehicle(ModContext modContext) {
        StatefulRenderer<VehicleRenderableState> renderer = null;
    	
    	if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
    		renderer = new VehicleRendererBuilder()
                    .performShiftAnimation(false)
                    .shiftWithRight(true)
                    .withPartTexturedModel(VehiclePart.MAIN, MclarenSenna::new, "mclarensenna")
                    .withPartTexturedModel(VehiclePart.WINDOWS, MclarenSennaWindows::new, "mclarensenna")
                    .withPartTexturedModel(VehiclePart.STEERING_WHEEL, MclarenSennaSteeringWheel::new, "mclarensenna")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                    .withPartTexturedModel(VehiclePart.FRONT_LEFT_WHEEL, MclarenSennaWheel::new, "mclarensenna")
                    .withPartTexturedModel(VehiclePart.FRONT_RIGHT_WHEEL, MclarenSennaWheel::new, "mclarensenna")
                    .withPartTexturedModel(VehiclePart.REAR_LEFT_WHEEL, MclarenSennaWheel::new, "mclarensenna")
                    .withPartTexturedModel(VehiclePart.REAR_RIGHT_WHEEL, MclarenSennaWheel::new, "mclarensenna")

                    // part positions
                    
                    .withPartPosition(VehiclePart.MAIN, c -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) c.getEntity();
                    	float forwardLean = (float) entityVehicle.forwardLean;
                    	float sideLean = (float) entityVehicle.sideLean;
                    	
                        Positioners.position(
                                1.0f, (float) (-1.500000f-entityVehicle.rideOffset), -2.700000f,
                                0.0f, 0.0f, -0.0f,
                                0.000000f, 0.000000f, 0.000000f,
                                1.000000f, 1.000000f, 1.000000f
                            );
                    })
                    
                    .withPartPosition(VehiclePart.WINDOWS, c -> {
                    })
                   
                    .withPartPosition(VehiclePart.STEERING_WHEEL, context -> {
                    	float steer = (float) -Math.toDegrees(context.getSymmetricProgress()) - 57;
                    	
                    	Positioners.position(
                    		    0.000000f, 0.000000f, 0.000000f,
                    		    0.000000f, 0.000000f, steer,
                    		    -1.200000f, 0.150000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.IDLE, context -> {
                    	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-1.200000f, -0.100000f, 2.300000f);
                    })

                    .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	GL11.glRotatef(-85.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-1.050000f, -1.975000f, 0.675000f);
                    })
                    
//                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.SHIFTING, context -> {
//                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
//                		Transmission trans = entityVehicle.solver.transmission;
//                		GearShiftPattern pattern = entityVehicle.getSolver().getPhysConf().getShiftPattern();
//                		entityVehicle.smoothShift.updatePrev();
//                		entityVehicle.smoothShift.set(pattern.quickDoAnimation(trans).scale(0.3));
//                		Vec3d offset = entityVehicle.smoothShift.get();
//                    	float xO = (float) -offset.z*0.5f;
//                    	float zO = (float) -offset.x;
//                    	
//                        Positioners.position(
//                                -1.500000f, -0.370000f, 2.380000f,
//                                -50.000000f, 0.000000f, 0.000000f,
//                                0.000000f, 0.000000f, 0.000000f,
//                                1.000000f, 1.000000f, 1.000000f
//                            );
//                    }, 50)
                    
                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.IDLE, context -> {
                    	GL11.glRotatef(0.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(0.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-1.200000f, -0.100000f, 2.300000f);
                    })
                    
                    .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.DRIVING, context -> {
                    	GL11.glRotatef(-105.000000f, 1f, 0f, 0f);
                    	GL11.glRotatef(-30.000000f, 0f, 1f, 0f);
                    	GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                    	GL11.glTranslatef(-0.850000f, -2.250000f, 0.550000f);
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
                    		    0.000000f, -0.000000f, 0.000000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.825000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.FRONT_RIGHT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().frontAxel.rightWheel;
                    	float vertical = (float) entityVehicle.getSolver().frontAxel.rightWheel.getRenderRideHeight();
                    	float steer = (float) Math.toDegrees(context.getSymmetricProgress());
                    	
                    	Positioners.position(
                    		    -3.700000f, 0.000000f, 0.000000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0f, 0.000000f,
                    		    0.000000f, 0.800000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })

                    .withPartPosition(VehiclePart.REAR_LEFT_WHEEL, context -> {
                    	
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.leftWheel;
                    	float vertical = (float) entityVehicle.getSolver().rearAxel.leftWheel.getRenderRideHeight();
                    	
                    	Positioners.position(
                    		    -0.000000f, -0.100000f, 5.999999f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.800000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    })
                    
                    .withPartPosition(VehiclePart.REAR_RIGHT_WHEEL, context -> {
                    	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    	WheelSolver ws = entityVehicle.getSolver().rearAxel.rightWheel;
                    	float vertical = (float) ws.getRenderRideHeight();
                    	
                    	Positioners.position(
                    		    -3.680000f, -0.100000f, 6.000000f,
                    		    (float) ws.getInterpolatedWheelRotation(), 0.000000f, 0.000000f,
                    		    0.000000f, 0.810000f, 0.000000f,
                    		    1.000000f, 1.000000f, 1.000000f
                    		);
                    	
                    }).build(modContext, VehiclePart.MAIN);
    	}

        new EntityVehicleConfiguration.Builder()
                .withName("mclaren_senna")
                .withEntityIdSupplier(() -> 10203)
                .withPhysicsConfig(new PhysicsConfiguration(
                        /* WHEELBASE (m)*/ 2.67,
                        /* FRONT AREA (m^2) */ 2,
                        /* DRAG COEFF. */ 0.32,
                        /* MASS (kg) */ 1374,
                        /* COG HEIGHT */ 0.3,
                        /* DriveT EFF. */ 1.0,
                        /* Transmission */ PartInit.McLarenSennaTransmission,
                        /* Engine */ new McLarenSennaEngine("4.0L V8 Turbocharged", "McLaren", 10000, 8500, 1009),
                        /* Real Dimensions */ new Dimensions(4.740, 1.960, 1.230),
                        /* Dimensions */ new Vec3d(/*length*/ 6, /*width*/ 3, /*height*/ 2),
                        /* Chassis */ Chassis.SPORT,
                        /* Shift pattern */ PartInit.STANDARD_SIX_SHIFT)

                        .buildStructure()
                        .withAero(new AeroWing(3.0))
                        .withAxels(new WheelAxel(0.5, false)
                                        .withWheels(new WheelSolver(new TyreSize("245/35ZR19"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(-1.7, 0.0, 1.75)),
                                                new WheelSolver(new TyreSize("245/35ZR19"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(0.5, 0.0, 1.75))),

                                new WheelAxel(-0.5, true)
                                        .withWheels(new WheelSolver(new TyreSize("315/30ZR20"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(-1.7, 0.0, -1.75)),
                                                new WheelSolver(new TyreSize("315/30ZR20"), 75.0, false)
                                                        .withRelativePosition(new Vec3d(0.5, 0.0, -1.75)))

                        ).compileStructure()
                )
                .withBackfireSound("carbackfire1")
                .withGearshiftSound("gearshift4")
                .withEnterSound("vehicle-enter")
                .withExitSound("vehicle-exit")
                .withRunSound("mclaren_senna_engine")
                .withShiftSettings(false, true)
//                .withIdleSound("audi_s4_rev")
//                .withRevSounds("audi_s4_rev$")
//                .withConstantRevSound("audi_s4_max_rev")
                .withOBBDimensions(3.5, 2.5, 1.75)
                .withSeat(new Vec3d(-0.15, -0.4, 0.5))
                .withRenderer(renderer)
                .build(MWC.modContext);
    }

}
