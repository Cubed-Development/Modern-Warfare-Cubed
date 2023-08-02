package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class VehicleInteractPacket implements IMessage {

    private boolean right;
    private int vehicleID;
    private int playerID;

    @Override
    public void fromBytes(final ByteBuf byteBuf) {
        right = byteBuf.readBoolean();
        vehicleID = byteBuf.readInt();
        playerID = byteBuf.readInt();
    }

    @Override
    public void toBytes(final ByteBuf byteBuf) {
        byteBuf.writeBoolean(right);
        byteBuf.writeInt(vehicleID);
        byteBuf.writeInt(playerID);
    }
}
