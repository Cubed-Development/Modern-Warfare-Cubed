package com.paneedah.mwc.vehicle;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.ATV;
import com.paneedah.mwc.models.SampleVehicleControlArm;
import com.paneedah.mwc.models.SampleVehicleSteeringWheel;
import com.paneedah.mwc.models.Wheel;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.*;

public class SampleVehicleFactory implements VehicleFactory {

    public void createVehicle(ModContext modContext) {

        StatefulRenderer<VehicleRenderableState> renderer = new VehicleRendererBuilder()

                .withPartTexturedModel(VehiclePart.MAIN, ATV::new, "atv")
                .withPartTexturedModel(VehiclePart.STEERING_WHEEL, SampleVehicleSteeringWheel::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_LEFT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_RIGHT_CONTROL_ARM, SampleVehicleControlArm::new, "sample-vehicle")
                .withPartTexturedModel(VehiclePart.FRONT_LEFT_WHEEL, Wheel::new, "wheel")
                .withPartTexturedModel(VehiclePart.FRONT_RIGHT_WHEEL, Wheel::new, "wheel")
                .withPartTexturedModel(VehiclePart.REAR_LEFT_WHEEL, Wheel::new, "wheel")
                .withPartTexturedModel(VehiclePart.REAR_RIGHT_WHEEL, Wheel::new, "wheel")

                // part positions

                .withPartPosition(VehiclePart.MAIN, c -> {
//                    GL11.glTranslatef(0.000000f, -1.449999f, 0f);
                    Positioners.position(
                            0.000000f, -1.500000f, -1.600000f,
                            0.000000f, 0.000000f, 0.000000f,
                            0.000000f, 0.000000f, 0.000000f,
                            1.200000f, 1.200000f, 1.200000f
                    );
                })

                .withPartPosition(VehiclePart.STEERING_WHEEL, context -> {
                    Positioners.position(
                            0.000000f, -0.150000f, 0.725000f,
                            0.000000f, context.getSymmetricProgress() * 90f, 0.000000f,
                            0.000000f, 0.000000f, 0.000000f,
                            1.000000f, 1.000000f, 1.000000f
                    );
                })

                .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.IDLE, context -> {
                    Positioners.position(
                            0.1f, -0.85f, 2f,
                            0f, 0f, 0f,
                            0.3f, 0.75f, -0.05f,
                            1f, 1f, 1f);
                })

                .withPartPosition(VehiclePart.LEFT_HAND, VehicleRenderableState.DRIVING, context -> {
                    Positioners.position(
                            0.1f, -0.85f, 0.2f,
                            -90f, -100f * context.getSymmetricProgress(), 0f,
                            0.3f, 0.75f, -0.05f,
                            1f, 1f, 1f);
                })

                .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.IDLE, context -> {
                    Positioners.position(
                            -0.200000f, -0.250000f, 1.249999f,
                            0.000000f, 0.000000f, 0.000000f,
                            0.000000f, 0.000000f, 0.000000f,
                            1.000000f, 1.000000f, 1.000000f);
                })
                .withPartPosition(VehiclePart.RIGHT_HAND, VehicleRenderableState.DRIVING, context -> {
                    Positioners.position(
                            -0.1f, -0.860000f, 0.100000f,
                            -90.000000f, -100f * context.getSymmetricProgress(), 0f,
                            -0.350000f, 0.785000f, -0.000000f,
                            1.000000f, 1.000000f, 1.000000f
                    );
                })

                .withPartPosition(VehiclePart.FRONT_LEFT_CONTROL_ARM, context -> {
                    Positioners.position(
                            0.050000f, -0.060000f, -0.1500000f,
                            0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
                            0.800000f, 0.000000f, 0.400000f,
                            1.000000f, 1.000000f, 1.000000f
                    );
                })

                .withPartPosition(VehiclePart.FRONT_RIGHT_CONTROL_ARM, context -> {
                    Positioners.position(
                            -1.600001f, -0.000000f, 2.749997f,
                            0.000000f, context.getSymmetricProgress() * 80f - 180f, 0.000000f,
                            0.840000f, -0.600000f, -2.430000f,
                            1.000000f, 1.000000f, 1.000000f
                    );

                })

                .withPartPosition(VehiclePart.FRONT_LEFT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            0.975000f, 0.095001f, 0.350003f,
                            entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            0.000000f, 0.990000f, 0.030000f,
                            1.000000f, 1.000000f, 1.000000f
                    );
                })

                .withPartPosition(VehiclePart.FRONT_RIGHT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            0.970000f, 0.089997f, -2.500000f,
                            entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            -0.100000f, 0.965000f, 0.025000f,
                            1.000000f, 1.000000f, 1.000000f
                    );

                })

                .withPartPosition(VehiclePart.REAR_LEFT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            0.875000f, 0.095001f, 2.550003f,
                            -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            -0.100000f, 0.965000f, 0.025000f,
                            1.000000f, 1.000000f, 1.000000f
                    );
                })

                .withPartPosition(VehiclePart.REAR_RIGHT_WHEEL, context -> {
                    EntityVehicle entityVehicle = (EntityVehicle) context.getEntity();
                    Positioners.position(
                            -0.730000f, 0.089997f, 2.570000f,
                            -entityVehicle.getWheelRotationAngle(), 0.000000f, 0.000000f,
                            -0.100000f, 0.965000f, 0.025000f,
                            1.000000f, 1.000000f, 1.000000f
                    );
                })

                .build(modContext, VehiclePart.MAIN);

        new EntityVehicleConfiguration.Builder()
                .withName("vehicle")
                .withEntityIdSupplier(() -> Integer.valueOf(10201))
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
