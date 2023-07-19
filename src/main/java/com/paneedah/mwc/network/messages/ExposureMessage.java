package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.Exposure;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.util.Collection;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ExposureMessage implements IMessage {
    
    private Collection<? extends Exposure> exposures;

    public void fromBytes(ByteBuf byteBuf) {
        final int size = byteBuf.readInt();

        for(int i = 0; i < size; i++)
            exposures.add(TypeRegistry.getInstance().fromBytes(byteBuf));
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(exposures.size());

        for(Exposure exposure: exposures)
            TypeRegistry.getInstance().toBytes(exposure, byteBuf);
    }
}
