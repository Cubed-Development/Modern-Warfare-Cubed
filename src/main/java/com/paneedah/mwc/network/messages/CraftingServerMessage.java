package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class CraftingServerMessage implements IMessage {

    private int playerId;

    public void fromBytes(final ByteBuf byteBuf) {
        this.playerId = byteBuf.readInt();
    }

    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeInt(playerId);
    }
}
