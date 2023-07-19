package com.paneedah.mwc.network.messages;

import io.netty.buffer.ByteBuf;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TryFireMessage implements IMessage {

	private boolean isBurst;
	private boolean isAimed;

	public void fromBytes(ByteBuf byteBuf) {
		this.isBurst = byteBuf.readBoolean();
		this.isAimed = byteBuf.readBoolean();
	}

	public void toBytes(ByteBuf byteBuf) {
		byteBuf.writeBoolean(isBurst);
		byteBuf.writeBoolean(isAimed);
	}
}
