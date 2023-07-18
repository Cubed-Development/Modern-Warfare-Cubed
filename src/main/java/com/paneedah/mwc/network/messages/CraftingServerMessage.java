package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CraftingServerMessage implements IMessage {

    private int playerId;

    public void fromBytes(ByteBuf byteBuf) {
        this.playerId = byteBuf.readInt();
    }

    public void toBytes(ByteBuf byteBuf) {
        byteBuf.writeInt(playerId);
    }
}
