package com.paneedah.weaponlib;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class TryFireMessage implements IMessage {

	private boolean on;
	private boolean isBurst;
	private boolean isAimed;

	public TryFireMessage() {}
	
	public TryFireMessage(boolean on, boolean isBurst, boolean isAimed) {
		this.on = on;
		this.isBurst = isBurst;
		this.isAimed = isAimed;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public boolean isBurst() {
        return isBurst;
    }
	
	public boolean isAimed() {
		return isAimed;
	}

	public void fromBytes(ByteBuf buf) {
		this.on = buf.readBoolean();
		this.isBurst = buf.readBoolean();
		this.isAimed = buf.readBoolean();
	}

	public void toBytes(ByteBuf buf) {
		buf.writeBoolean(on);
		buf.writeBoolean(isBurst);
		buf.writeBoolean(isAimed);
	}

	
}
