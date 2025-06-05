package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.mwc.utils.VectorUtil;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;
import dev.redstudio.redcore.math.vectors.Vector3D;
import lombok.Setter;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.util.math.Vec3d;

import java.io.IOException;

public class VehiclePhysSerializer {
    @Setter public VehiclePhysicsSolver solver;

    public double synthAccelFor;
    public double synthAccelSide;
    public Vec3d velocity;


    public VehiclePhysSerializer() {}

    public VehiclePhysSerializer(VehiclePhysicsSolver solver) {
        this.solver = solver;
    }

    public void setData(double synthAccelFor, double synthAccelSide, Vec3d velocity) {
        this.synthAccelFor = synthAccelFor;
        this.synthAccelSide = synthAccelSide;
        this.velocity = velocity;
    }

    public void updateSolver(VehiclePhysicsSolver solver) {
        solver.synthAccelFor = this.synthAccelFor;
        solver.synthAccelSide = this.synthAccelSide;
        solver.velocity = this.velocity;
    }

    public static final DataSerializer<VehiclePhysSerializer> SERIALIZER = new DataSerializer<VehiclePhysSerializer>() {

        @Override
        public void write(PacketBuffer buf, VehiclePhysSerializer value) {

            VehiclePhysicsSolver s = value.solver;
            buf.writeDouble(s.synthAccelFor);
            buf.writeDouble(s.synthAccelSide);
            VectorUtil.Networking.write(buf, s.getVelocityVector());
        }

        @Override
        public VehiclePhysSerializer read(PacketBuffer buf) throws IOException {

            VehiclePhysSerializer vps = new VehiclePhysSerializer();


            double synthAccelFor = buf.readDouble();
            double synthAccelSide = buf.readDouble();
            Vec3d velocity = VectorUtil.Networking.read(buf);

            vps.setData(synthAccelFor, synthAccelSide, velocity);


            return vps;
        }

        @Override
        public DataParameter<VehiclePhysSerializer> createKey(int id) {
            return new DataParameter<VehiclePhysSerializer>(id, this);
        }

        @Override
        public VehiclePhysSerializer copyValue(VehiclePhysSerializer value) {
            return value;
        }


    };
}
