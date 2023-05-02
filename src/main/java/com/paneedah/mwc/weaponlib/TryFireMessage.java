package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import io.netty.buffer.ByteBuf;

public class TryFireMessage implements CompatibleMessage {

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
