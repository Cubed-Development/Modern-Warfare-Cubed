package com.paneedah.weaponlib.state;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.mwc.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;

@Getter
public class Permit<S extends ManagedState<S>> extends UniversalObject {

    static {
        TypeRegistry.getINSTANCE().register(Permit.class);
    }

    public enum Status {REQUESTED, GRANTED, DENIED, UNKNOWN}

    protected S state;
    @Setter
    protected Status status;
    protected long timestamp;

    public Permit() {
        status = Status.UNKNOWN;
    }

    public Permit(S state) {
        this.state = state;
        status = Status.REQUESTED;
        timestamp = System.currentTimeMillis();
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
