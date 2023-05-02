package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;

public class SpreadableExposureMessage implements CompatibleMessage {
    
    private SpreadableExposure spreadableExposure;
    private boolean removed;

    public SpreadableExposureMessage() {}

    public SpreadableExposureMessage(SpreadableExposure spreadableExposure) {
        this.spreadableExposure = spreadableExposure;
        this.removed = spreadableExposure == null;
    }

    public void fromBytes(ByteBuf buf) {
        removed = buf.readBoolean();
        if(!removed) {
            spreadableExposure = TypeRegistry.getInstance().fromBytes(buf);
        }
    }

    public void toBytes(ByteBuf buf) {
        buf.writeBoolean(removed);
        if(!removed) {
            TypeRegistry.getInstance().toBytes(spreadableExposure, buf);
        }
    }

    public SpreadableExposure getSpreadableExposure() {
        return spreadableExposure;
    }
}
