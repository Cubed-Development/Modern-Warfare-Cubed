package com.paneedah.weaponlib.state;

import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.network.UniversalObject;
import io.netty.buffer.ByteBuf;

public class Permit<S extends ManagedState<S>> extends UniversalObject {
	
	static {
		TypeRegistry.getInstance().register(Permit.class);
	}
	
	public enum Status { REQUESTED, GRANTED, DENIED, UNKNOWN };
	
	protected S state;
	protected Status status;
	protected long timestamp;
	
	public Permit() {
		this.status = Status.UNKNOWN;
	}
	
	public Permit(S state) {
		this.state = state;
		this.status = Status.REQUESTED;
		this.timestamp = System.currentTimeMillis();
	}

	public S getState() {
		return state;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public void init(ByteBuf buf) {
		super.init(buf);
		timestamp = buf.readLong();
		status = Status.values()[buf.readInt()];
		state = TypeRegistry.getInstance().fromBytes(buf);
	}
	
	@Override
	public void serialize(ByteBuf buf) {
		super.serialize(buf);
		buf.writeLong(timestamp);
		buf.writeInt(status.ordinal());
		TypeRegistry.getInstance().toBytes(state, buf);
	}
	
}