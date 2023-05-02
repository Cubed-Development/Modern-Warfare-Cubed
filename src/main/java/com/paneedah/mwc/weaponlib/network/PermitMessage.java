package com.paneedah.mwc.weaponlib.network;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.state.Permit;
import io.netty.buffer.ByteBuf;

public class PermitMessage implements CompatibleMessage {

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
