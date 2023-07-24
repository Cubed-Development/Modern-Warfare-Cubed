package com.paneedah.mwc.network.messages;

import com.paneedah.weaponlib.SpreadableExposure;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
public final class SpreadableExposureMessage implements IMessage {
    
    private SpreadableExposure spreadableExposure;
    private boolean removed;

    public SpreadableExposureMessage(final SpreadableExposure spreadableExposure) {
        this.spreadableExposure = spreadableExposure;
        this.removed = spreadableExposure == null;
    }

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        removed = byteBuf.readBoolean();

        if(!removed)
            spreadableExposure = TypeRegistry.getInstance().fromBytes(byteBuf);
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeBoolean(removed);

        if(!removed)
            TypeRegistry.getInstance().toBytes(spreadableExposure, byteBuf);
    }
}
