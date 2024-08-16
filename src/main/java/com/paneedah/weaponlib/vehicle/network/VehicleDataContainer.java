package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.util.math.Vec3d;

public class VehicleDataContainer {

    public int entityID;

    public EntityVehicle vehicle;

    public float rotationRoll;
    public float rotationPitch;
    public float rotationYaw;


    public Vec3d position;

    public double throttle;
    public double driftTuner;
    public boolean isBraking;
    public double forwardLean;
    public double sideLean;
    public double wheelRotationAngle;
    public double steerangle;


    // solver
    public double synthAccelFor;
    public Vec3d velocity;

    public VehicleDataContainer() {}

    public VehicleDataContainer(EntityVehicle vehicle) {
        this.vehicle = vehicle;
        setData(vehicle);
    }

    public void setData(EntityVehicle v) {
        this.vehicle = v;
        setData(v.getEntityId(), v.getPositionVector(), v.throttle, v.driftTuner, v.isBraking, v.forwardLean, v.sideLean, v.wheelRotationAngle, v.steerangle,
                v.rotationRoll, v.rotationPitch, v.rotationYaw, v.getSolver().synthAccelFor, v.getSolver().velocity);
    }


    public void setData(int entityID, Vec3d position, double throttle, double driftTuner, boolean isBraking,
                        double forwardLean, double sideLean, double wheelRotationAngle,
                        double steerangle, float roll, float pitch, float yaw, double synthAccelFor, Vec3d velocity) {


        //System.out.println("posting @ " + driftTuner);
        this.entityID = entityID;
        this.position = position;
        this.throttle = throttle;
        this.driftTuner = driftTuner;
        this.forwardLean = forwardLean;
        this.sideLean = sideLean;
        this.wheelRotationAngle = wheelRotationAngle;
        this.steerangle = steerangle;

        this.rotationRoll = roll;
        this.rotationPitch = pitch;
        this.rotationYaw = yaw;

        this.synthAccelFor = synthAccelFor;
        this.velocity = velocity;
    }

    public void updateVehicle(EntityVehicle v) {

        v.throttle = this.throttle;
        v.driftTuner = this.driftTuner;
        v.forwardLean = this.forwardLean;
        v.sideLean = this.sideLean;
        v.wheelRotationAngle = (float) this.wheelRotationAngle;
        v.steerangle = this.steerangle;


        v.prevPosX = v.posX;
        v.prevPosY = v.posY;
        v.prevPosZ = v.posZ;


        v.setPosition(this.position.x, this.position.y, this.position.z);
        //v.posX = this.position.x;
        //v.posY = this.position.y;
        //v.posZ = this.position.z;

        v.prevRotationRoll = v.rotationRoll;
        v.prevRotationPitch = v.rotationPitch;
        v.prevRotationYaw = v.rotationYaw;

        v.rotationRoll = this.rotationRoll;
        v.rotationPitch = this.rotationPitch;
        v.rotationYaw = this.rotationYaw;


        //
        v.getSolver().synthAccelFor = this.synthAccelFor;
        v.getSolver().velocity = this.velocity;


    }


    public void write(ByteBuf buf, VehicleDataContainer value) {
        //System.out.println(value.vehicle);
        EntityVehicle v = value.vehicle;
        VehiclePhysicsSolver solver = v.getSolver();

        if (v == null) {
            System.out.println("Vehicle is null!");
            buf.writeInt(-1);
            return;
        }


        /*
         * Le entity
         */


        buf.writeInt(1);

        new Vector3D(v.getPositionVector()).write(buf);
        new Vector3D(this.velocity).write(buf);

        //System.out.println(v.getPositionVector());
        buf.writeDouble(v.throttle);
        buf.writeDouble(v.driftTuner);
        buf.writeBoolean(v.isBraking);
        buf.writeDouble(v.forwardLean);
        buf.writeDouble(v.sideLean);
        buf.writeDouble(v.wheelRotationAngle);
        buf.writeDouble(v.steerangle);

        buf.writeFloat(v.rotationRoll);
        buf.writeFloat(v.rotationPitch);
        buf.writeFloat(v.rotationYaw);

        buf.writeDouble(this.synthAccelFor);

        buf.writeInt(v.getEntityId());


    }


    public static VehicleDataContainer read(ByteBuf buf) {

        VehicleDataContainer ds = new VehicleDataContainer();

        int stat = buf.readInt();
        if (stat == -1) {
            //System.out.println("cut short!!");
            return ds;
        }

        Vector3D vector = new Vector3D();
        vector.read(buf);
        ds.position = vector.toVec3d();
        vector.read(buf);
        ds.velocity = vector.toVec3d();


        ds.throttle = buf.readDouble();
        ds.driftTuner = buf.readDouble();
        ds.isBraking = buf.readBoolean();
        ds.forwardLean = buf.readDouble();
        ds.sideLean = buf.readDouble();
        ds.wheelRotationAngle = buf.readDouble();
        ds.steerangle = buf.readDouble();

        ds.rotationRoll = buf.readFloat();
        ds.rotationPitch = buf.readFloat();
        ds.rotationYaw = buf.readFloat();

        ds.synthAccelFor = buf.readDouble();

        ds.entityID = buf.readInt();

        return ds;
    }


}
