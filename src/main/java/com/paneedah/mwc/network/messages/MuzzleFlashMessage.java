package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class MuzzleFlashMessage implements IMessage {

    private int entityID;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        entityID = byteBuf.readInt();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(entityID);
    }
}
