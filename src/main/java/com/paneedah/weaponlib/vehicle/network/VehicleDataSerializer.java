package com.paneedah.weaponlib.vehicle.network;

import com.paneedah.weaponlib.vehicle.EntityVehicle;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializer;
import net.minecraft.util.math.Vec3d;

import java.io.IOException;

public class VehicleDataSerializer {

	public EntityVehicle vehicle;
	
	public Vec3d position;
	
	public double throttle;
	public double driftTuner;
	public boolean isBraking;
	public double forwardLean;
	public double sideLean;
	public double wheelRotationAngle;
	public double steerangle;
	
	public VehicleDataSerializer() {}
	
	public VehicleDataSerializer(EntityVehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void setData(Vec3d position, double throttle, double driftTuner, boolean isBraking,
				   double forwardLean, double sideLean, double wheelRotationAngle,
				   double steerangle) {
		
		//System.out.println("posting @ " + driftTuner);
		this.position = position;
		this.throttle = throttle;
		this.driftTuner = driftTuner;
		this.forwardLean = forwardLean;
		this.sideLean = sideLean;
		this.wheelRotationAngle = wheelRotationAngle;
		this.steerangle = steerangle;
	}
	
	public void updateVehicle(EntityVehicle v) {
		v.throttle = this.throttle;
		v.driftTuner = this.driftTuner;
		v.forwardLean = this.forwardLean;
		v.sideLean = this.sideLean;
		v.wheelRotationAngle = (float) this.wheelRotationAngle;
		v.steerangle = this.steerangle;
		v.posX = this.position.x;
		v.posY = this.position.y;
		v.posZ = this.position.z;

		/*
		System.out.println(this.position);
		Vec3d pAdj = this.position.subtract(v.getPositionVector());
		System.out.println("fuck " + pAdj);*/
		//v.move(MoverType.SELF, pAdj.x, pAdj.y, pAdj.z);
		
	}
	
	public static final DataSerializer<VehicleDataSerializer> SERIALIZER = new DataSerializer<VehicleDataSerializer>() {

		@Override
		public void write(PacketBuffer buf, VehicleDataSerializer value) {
			EntityVehicle v = value.vehicle;
			VehiclePhysicsSolver solver = v.solver;
			
			/*
			 * Le entity
			 */
			
			NetworkUtil.writeVec3d(buf, v.getPositionVector());
			//System.out.println(v.getPositionVector());
			buf.writeDouble(v.throttle);
			buf.writeDouble(v.driftTuner);
			buf.writeBoolean(v.isBraking);
			buf.writeDouble(v.forwardLean);
			buf.writeDouble(v.sideLean);
			buf.writeDouble(v.wheelRotationAngle);
			buf.writeDouble(v.steerangle);
			
			
			
			
			
		}

		@Override
		public VehicleDataSerializer read(PacketBuffer buf) throws IOException {

			VehicleDataSerializer ds = new VehicleDataSerializer();
			
			ds.position = NetworkUtil.readVec3d(buf);
			ds.throttle = buf.readDouble();
			ds.driftTuner = buf.readDouble();
			ds.isBraking = buf.readBoolean();
			ds.forwardLean = buf.readDouble();
			ds.sideLean = buf.readDouble();
			ds.wheelRotationAngle = buf.readDouble();
			ds.steerangle = buf.readDouble();
			
			return ds;
		}

		@Override
		public DataParameter<VehicleDataSerializer> createKey(int id) {
			return new DataParameter<VehicleDataSerializer>(id, this);
		}

		@Override
		public VehicleDataSerializer copyValue(VehicleDataSerializer value) {
			return value;
		}

	

		

	};
	
}
