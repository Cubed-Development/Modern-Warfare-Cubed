package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.weaponlib.SpreadableExposure;
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
        removed = spreadableExposure == null;
    }

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        removed = byteBuf.readBoolean();

        if (!removed) {
            spreadableExposure = TypeRegistry.getINSTANCE().fromBytes(byteBuf);
        }
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeBoolean(removed);

        if (!removed) {
            TypeRegistry.getINSTANCE().toBytes(spreadableExposure, byteBuf);
        }
    }
}
