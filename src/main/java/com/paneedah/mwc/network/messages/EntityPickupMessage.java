package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class EntityPickupMessage implements IMessage {

    private int playerID;
    private int entityID;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        playerID = byteBuf.readInt();
        entityID = byteBuf.readInt();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(playerID);
        byteBuf.writeInt(entityID);
    }
}
