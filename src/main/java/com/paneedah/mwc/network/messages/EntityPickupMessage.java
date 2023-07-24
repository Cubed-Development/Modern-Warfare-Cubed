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
		this.playerID = byteBuf.readInt();
        this.entityID = byteBuf.readInt();
	}

	@Override
	public void toBytes(final ByteBuf byteBuf) {
		byteBuf.writeInt(this.playerID);
        byteBuf.writeInt(this.entityID);
	}
}
