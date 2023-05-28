package com.paneedah.weaponlib.network;

import com.paneedah.weaponlib.state.Permit;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class PermitMessage implements IMessage {

	private Permit<?> permit;
	private Object context;
	
	public PermitMessage() {}
	
	public PermitMessage(Permit<?> permit, Object context) {
		this.permit = permit;
		this.context = context;
	}

	public Permit<?> getPermit() {
		return permit;
	}

	public Object getContext() {
		return context;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		TypeRegistry typeRegistry = TypeRegistry.getInstance();
		context = typeRegistry.fromBytes(buf);
		permit = typeRegistry.fromBytes(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		TypeRegistry typeRegistry = TypeRegistry.getInstance();
		typeRegistry.toBytes((UniversallySerializable)context, buf);
		typeRegistry.toBytes(permit, buf);
	}

}
