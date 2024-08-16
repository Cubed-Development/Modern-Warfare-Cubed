package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import net.minecraft.entity.MoverType;
import net.minecraft.util.math.Vec3d;

import java.util.concurrent.ConcurrentLinkedQueue;

public class VehicleSmoothShell {

    // VEHICLE
    public EntityVehicle vehicle;

    // CURRENT STATE
    public VehicleDataContainer cs;
    public boolean inTransition = false;
    public long finishTime = 0L;

    public long lastTransition = -1L;

    // CONCURRENT STATES
    public ConcurrentLinkedQueue<VehicleDataContainer> states = new ConcurrentLinkedQueue<>();


    public VehicleSmoothShell(EntityVehicle v) {
        this.vehicle = v;
    }

    public void upload(VehicleDataContainer state) {
        //System.out.println("States: " + states.);
        //System.out.println("uploaded a new state");

        if (states.size() > 5) {
            //System.out.println("clearing");
            states.clear();
        }

        states.add(state);
    }

    public void update() {
        double currentTime = System.currentTimeMillis();

        if (inTransition) {
            if (currentTime > finishTime) {
                this.inTransition = false;
                states.element().updateVehicle(this.vehicle);
                states.remove();
            }
        }

        if (!inTransition && !states.isEmpty()) {

            this.lastTransition = System.currentTimeMillis();
            this.cs = new VehicleDataContainer(this.vehicle);
            inTransition = true;

            this.finishTime = System.currentTimeMillis() + (VehiclePacketLatencyTracker.getLastDelta(vehicle));
        }

        if (!inTransition) {
            return;
        }

        // (current-initial)/(final-initial)
        double mu = (currentTime - lastTransition) / (finishTime - lastTransition);
        //System.out.println(mu);
        VehicleDataContainer next = states.element();

        vehicle.throttle = q(cs.throttle, next.throttle, mu);
        vehicle.driftTuner = q(cs.driftTuner, next.driftTuner, mu);
        vehicle.forwardLean = q(cs.forwardLean, next.forwardLean, mu);
        vehicle.sideLean = q(cs.sideLean, next.sideLean, mu);
        vehicle.wheelRotationAngle = (float) q(cs.wheelRotationAngle, next.wheelRotationAngle, mu);
        vehicle.steerangle = q(cs.steerangle, next.steerangle, mu);


        vehicle.prevPosX = vehicle.posX;
        vehicle.prevPosY = vehicle.posY;
        vehicle.prevPosZ = vehicle.posZ;


        Vec3d iP = qv(cs.position, next.position, mu);

        Vec3d pD = iP.subtract(vehicle.getPositionVector());
        vehicle.move(MoverType.SELF, pD.x, pD.y, pD.z);

        //vehicle.setPosition(iP.x, iP.y, iP.z);

        vehicle.prevRotationRoll = vehicle.rotationRoll;
        vehicle.prevRotationPitch = vehicle.rotationPitch;
        vehicle.prevRotationYaw = vehicle.rotationYaw;

        vehicle.rotationRoll = (float) q(cs.rotationRoll, next.rotationRoll, mu);
        vehicle.rotationPitch = (float) q(cs.rotationPitch, next.rotationPitch, mu);
        vehicle.rotationYaw = (float) q(cs.rotationYaw, next.rotationYaw, mu);


        vehicle.getSolver().synthAccelFor = q(cs.synthAccelFor, next.synthAccelFor, mu);
        vehicle.getSolver().velocity = qv(cs.velocity, next.velocity, mu);


    }

    public double q(double a, double b, double mu) {
        return InterpolationKit.interpolateValue(a, b, mu);
    }

    public Vec3d qv(Vec3d a, Vec3d b, double mu) {
        return InterpolationKit.interpolateVector(a, b, mu);
    }


}
