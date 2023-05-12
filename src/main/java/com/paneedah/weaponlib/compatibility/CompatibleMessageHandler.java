package com.paneedah.weaponlib.compatibility;

import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@Deprecated
public interface CompatibleMessageHandler<Request extends net.minecraftforge.fml.common.network.simpleimpl.IMessage, Response extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> extends IMessageHandler<Request, Response> {
	
	@Override
	default Response onMessage(Request message, MessageContext messageContext) {
		return onCompatibleMessage(message, messageContext);
	}

	<T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(Request message, MessageContext messageContext);
}
