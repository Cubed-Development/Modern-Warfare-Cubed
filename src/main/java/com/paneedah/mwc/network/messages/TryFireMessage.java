package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class TryFireMessage implements IMessage {

    private boolean isBurst;
    private boolean isAimed;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        isBurst = byteBuf.readBoolean();
        isAimed = byteBuf.readBoolean();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeBoolean(isBurst);
        byteBuf.writeBoolean(isAimed);
    }
}
