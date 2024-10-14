package com.paneedah.weaponlib.vehicle.jimphysics;

import com.paneedah.weaponlib.vehicle.GearShiftPattern;
import com.paneedah.weaponlib.vehicle.collisions.VehicleInertiaBuilder;
import com.paneedah.weaponlib.vehicle.collisions.VehicleMassObject;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;
import lombok.Getter;
import net.minecraft.util.math.Vec3d;

public class PhysicsConfiguration {

    public double wheelBase;
    public double frontSurfaceArea;
    @Getter
    public double dragCoefficient;


    public double finalDriveRatio;
    public double vehicleMass;

    @Getter
    public double driveTrainEfficiency;

    /**
     * The height the center of gravity is off the ground
     */
    public double COGHeight;

    @Getter
    public Dimensions realDimensions;


    public Transmission trans;

    @Getter
    public GearShiftPattern shiftPattern;

    public VehicleMassObject vmo;
    @Getter
    public Engine engine;

    public Vec3d dimensions;

    public VehiclePhysicsSolver solver;


    public PhysicsConfiguration(double wheelBase, double frontArea, double dragC,
                                double mass, double COGHeight, double driveTrainEfficiency, Transmission trans,
                                Engine eng, Dimensions realDim, Vec3d dimensions, Chassis chassis,
                                GearShiftPattern pat) {
        this.wheelBase = wheelBase;
        frontSurfaceArea = frontArea;
        dragCoefficient = dragC;
        vehicleMass = mass;
        this.COGHeight = COGHeight;
        this.trans = trans;
        realDimensions = realDim;
        this.dimensions = dimensions;
        engine = eng;
        this.driveTrainEfficiency = driveTrainEfficiency;
        shiftPattern = pat;

        vmo = (new VehicleInertiaBuilder(mass)).basicConstructor(chassis, realDim).build();


        //this.vmo = (new VehicleInertiaBuilder(mass)).basicConstructor(chassis, this.dimensions, (float) this.COGHeight, (float) this.wheelBase, 0.33f, 0.33f).build();

    }


    public VehiclePhysicsSolver getPhysicsSolver() {
        return solver;
    }

    public VehiclePhysicsSolver buildStructure() {
        solver = new VehiclePhysicsSolver(this);
        return getPhysicsSolver();

    }

    public double getFrontArea() {
        return frontSurfaceArea;
    }

    public VehicleMassObject getVehicleMassObject() {
        return vmo;
    }


}
