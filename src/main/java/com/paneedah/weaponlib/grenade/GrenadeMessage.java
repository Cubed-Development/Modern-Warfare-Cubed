package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class GrenadeMessage implements IMessage {

	private PlayerGrenadeInstance instance;
	private long activationTimestamp;

	public GrenadeMessage() {}

	public GrenadeMessage(PlayerGrenadeInstance instance, long activationTimestamp) {
	    this.instance = instance;
	    this.activationTimestamp = activationTimestamp;
	}

	public void fromBytes(ByteBuf buf) {
	    this.instance = TypeRegistry.getInstance().fromBytes(buf);
		this.activationTimestamp = buf.readLong();
	}

	public void toBytes(ByteBuf buf) {
	    TypeRegistry.getInstance().toBytes(instance, buf);
		buf.writeLong(activationTimestamp);
	}

    public PlayerGrenadeInstance getInstance() {
        return instance;
    }

    public long getActivationTimestamp() {
        return activationTimestamp;
    }
}
