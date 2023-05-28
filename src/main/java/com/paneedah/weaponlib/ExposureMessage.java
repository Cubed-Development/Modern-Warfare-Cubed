package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.util.ArrayList;
import java.util.Collection;

public class ExposureMessage implements IMessage {
    
    private Collection<? extends Exposure> exposures;

    public ExposureMessage() {
        this.exposures = new ArrayList<>();
    }

    public ExposureMessage(Collection<? extends Exposure> exposures) {
        this.exposures = exposures;
    }

    public void fromBytes(ByteBuf buf) {
        int count = buf.readInt();
        for(int i = 0; i < count; i++) {
            exposures.add(TypeRegistry.getInstance().fromBytes(buf));
        }
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(exposures.size());
        for(Exposure exposure: exposures) {
            TypeRegistry.getInstance().toBytes(exposure, buf);
        }
    }

    public Collection<? extends Exposure> getExposures() {
        return exposures;
    }
}
