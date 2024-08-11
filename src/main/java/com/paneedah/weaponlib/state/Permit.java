package com.paneedah.weaponlib.state;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.mwc.network.UniversalObject;
import io.netty.buffer.ByteBuf;

public class Permit<S extends ManagedState<S>> extends UniversalObject {

    static {
        TypeRegistry.getINSTANCE().register(Permit.class);
    }

    public enum Status {REQUESTED, GRANTED, DENIED, UNKNOWN}

    ;

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
    public void read(ByteBuf byteBuf) {
        super.read(byteBuf);
        timestamp = byteBuf.readLong();
        status = Status.values()[byteBuf.readInt()];
        state = TypeRegistry.getINSTANCE().fromBytes(byteBuf);
    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);
        byteBuf.writeLong(timestamp);
        byteBuf.writeInt(status.ordinal());
        TypeRegistry.getINSTANCE().toBytes(state, byteBuf);
    }

}
