package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.JLTVM1280;
import com.paneedah.mwc.models.JLTVM1280wheel;
import com.paneedah.mwc.models.SampleVehicleControlArm;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.*;

public class JLTVM1280Factory implements VehicleFactory {

    public void createVehicle(ModContext modContext) {
        StatefulRenderer<VehicleRenderableState> renderer = new VehicleRendererBuilder()
                
                .withPartTexturedModel(VehiclePart.MAIN, JLTVM1280::new, "jltvm1280")
//                .withPartTexturedModel(VehiclePart.STEERING_WHEEL, AudiS4SteeringWheel::new, "audis4")
                .withPartTexturedModel(VehiclePart.FRONT_LEFT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_RIGHT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_LEFT_WHEEL, JLTVM1280wheel::new, "jltvm1280")
                .withPartTexturedModel(VehiclePart.FRONT_RIGHT_WHEEL, JLTVM1280wheel::new, "jltvm1280")
                .withPartTexturedModel(VehiclePart.REAR_LEFT_WHEEL, JLTVM1280wheel::new, "jltvm1280")
                .withPartTexturedModel(VehiclePart.REAR_RIGHT_WHEEL, JLTVM1280wheel::new, "jltvm1280")

                // part positions
                
                .withPartPosition(VehiclePart.MAIN, c -> {
//                    GL11.glTranslatef(0.000000f, -1.449999f, 0f);
                    Positioners.position(
                            1.0000f, -1.250000f, -2.700000f,
                            0.000000f, 0.000000f, 0.000000f,
                            0.000000f, 0.000000f, 0.000000f,
                            1.000000f, 1.000000f, 1.000000f
                        );
                })

                .withPartPosition(VehiclePart.STEERING_WHEEL, context -> {
                	
                	Positioners.position(
                		    0.000000f, 0.000000f, 0.000000f,
                		    0.000000f, 0f, -context.getSymmetricProgress() * 90f,
                		    -1.025000f, -0.325000f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
//                    Positioners.position(
//                            0.000000f, -0.150000f, 0.725000f,
//                            0.000000f, context.getSymmetricProgress() * 90f, 0.000000f,
//                            0.000000f, 0.000000f, 0.000000f,
//                            1.000000f, 1.000000f, 1.000000f
//                        );
                })

                .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.IDLE, context -> {
                	Positioners.position(
                		    -0.945000f, -0.575000f, 2.730000f,
                		    0.000000f, 0.000000f, 0.000000f,
                		    0.000000f, 0.000000f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
                	
//                    Positioners.position(
//                            0.1f, -0.85f, 2f,
//                            0f, 0f, 0f, 
//                            0.3f, 0.75f, -0.05f, 
//                            1f, 1f, 1f);
                })

                .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.DRIVING, context -> {
                	Positioners.position(
                		    -0.920000f, -0.240000f, 2.809999f,
                		    -90.000000f, 5.000000f, 10.000000f,
                		    0.000000f, 0.000000f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
//                    Positioners.position(
//                            0.1f, -0.85f, 0.2f,
//                            -90f, -100f * context.getSymmetricProgress(), 0f,
//                            0.3f, 0.75f, -0.05f, 
//                            1f, 1f, 1f);
                })

                .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.IDLE, context -> {
                	Positioners.position(
                		    -1.000000f, -0.670000f, 2.780000f,
                		    0.000000f, 0.000000f, 0.000000f,
                		    0.000000f, 0.000000f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
                	
                })
                .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.DRIVING, context -> {
                	Positioners.position(
                		    -1.050000f, -0.380001f, 2.760000f,
                		    -95.000000f, 0.000000f, -5.000000f,
                		    0.000000f, 0.000000f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
//                    Positioners.position(
//                            -0.1f, -0.860000f, 0.100000f,
//                            -90.000000f, -100f * context.getSymmetricProgress(), 0f,
//                            -0.350000f, 0.785000f, -0.000000f,
//                            1.000000f, 1.000000f, 1.000000f
//                            );
                })
                
                .withPartPosition(VehiclePart.FRONT_LEFT_CONTROL_ARM, context -> {
                	Positioners.position(
                		    3.250000f, 0.000000f, -0.050000f,
                		    0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
                		    -1.650000f, -1.050001f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);

                })
                
                .withPartPosition(VehiclePart.FRONT_RIGHT_CONTROL_ARM, context -> {
//                    Positioners.position(
//                            -1.600001f, -0.000000f, 2.749997f,
//                            0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
//                            0.840000f, -0.600000f, -2.430000f,
//                            1.000000f, 1.000000f, 1.000000f
//                        );
//                    
                })
                
                .withPartPosition(VehiclePart.FRONT_LEFT_WHEEL, context -> {
                	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                	Positioners.position(
                		    -3.774999f, 0.000000f, 0.000000f,
                		    entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                		    0.000000f, 0.500000f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
                
//                	Positioners.position(
//                		    -3.774999f, 0.000000f, 0.000000f,
//                		    -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
//                		    0.000000f, 0.500000f, 0.000000f,
//                		    1.000000f, 1.000000f, 1.000000f
//                		);
                })
                
                .withPartPosition(VehiclePart.FRONT_RIGHT_WHEEL, context -> {
                	
                	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                	Positioners.position(
                		    -3.899998f, 0.000000f, 0.000000f,
                		    -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                		    -0.650000f, 0.750000f, 0.010000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
                })

                .withPartPosition(VehiclePart.REAR_LEFT_WHEEL, context -> {
                	
                	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                	Positioners.position(
                		    0.000000f, 0.000000f, 6.474998f,
                		    -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                		    0.000000f, 0.540000f, 0.010000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
                	
//                	Positioners.position(
//                		    0.000000f, 0.000000f, 5.724997f,
//                		    -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
//                		    0.000000f, 0.740000f, 0.000000f,
//                		    1.000000f, 1.000000f, 1.000000f
//                		);

                })
                
                .withPartPosition(VehiclePart.REAR_RIGHT_WHEEL, context -> {
                	EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                	
                	Positioners.position(
                		    -3.799999f, 0.000000f, 5.720000f,
                		    -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                		    0.000000f, 0.749999f, 0.000000f,
                		    1.000000f, 1.000000f, 1.000000f
                		);
                	
//                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
//                    Positioners.position(
//                            -0.730000f, 0.089997f, 2.570000f,
//                            -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
//                            -0.100000f, 0.965000f, 0.025000f,
//                            1.000000f, 1.000000f, 1.000000f
//                        );

                })

                .build(modContext, VehiclePart.MAIN);

        new EntityVehicleConfiguration.Builder()
                .withName("jltv_m1280")
                .withEntityIdSupplier(() -> 10203)
                .withEnterSound("vehicle-enter")
                .withExitSound("vehicle-exit")
                .withRunSound("vehicle-driving")
                .withIdleSound("vehicle-idle")
//                .withSeat()
//                .withSeat()
//                .withHandlingFactor(10)
//                .withAccelerationIncrement(0.015)
//                .withForwardDeccelerationFactor(0.97)
                .withRenderer(renderer)
                .build(MWC.modContext);
    }

}
