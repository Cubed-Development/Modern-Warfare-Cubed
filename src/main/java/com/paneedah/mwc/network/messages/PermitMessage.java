package com.paneedah.mwc.network.messages;

import com.paneedah.mwc.instancing.PlayerItemInstance;
import com.paneedah.mwc.network.TypeRegistry;
import com.paneedah.weaponlib.state.Permit;
import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.util.UUID;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public final class PermitMessage implements IMessage {

	private Permit<?> permit;
	private PlayerItemInstance<?> playerItemInstance;
	private UUID callbackUUID;

	@Override
	public void fromBytes(final ByteBuf byteBuf) {
		playerItemInstance = TypeRegistry.read(byteBuf);

		permit = TypeRegistry.read(byteBuf);

		callbackUUID = new UUID(byteBuf.readLong(), byteBuf.readLong());
	}

	@Override
	public void toBytes(final ByteBuf byteBuf) {
		TypeRegistry.write(byteBuf, playerItemInstance);

		TypeRegistry.write(byteBuf, permit);

		byteBuf.writeLong(callbackUUID.getMostSignificantBits());
		byteBuf.writeLong(callbackUUID.getLeastSignificantBits());
	}
}
