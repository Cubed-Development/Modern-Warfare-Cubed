package com.paneedah.weaponlib.compatibility;

import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class CompatibleChannel {
	private SimpleNetworkWrapper channel;

	public CompatibleChannel(SimpleNetworkWrapper channel) {
		this.channel = channel;
	}

	public SimpleNetworkWrapper getChannel() {
		//System.out.println("Getting");
		return channel;
	}

    public <Request extends CompatibleMessage, Response extends CompatibleMessage> void registerMessage(CompatibleMessageHandler<? super Request, ? extends Response> messageHandler, Class<Request> requestMessageType, int discriminator, Side side) {
    	channel.registerMessage(messageHandler, requestMessageType, discriminator, side);
    }

    public void sendToAllAround(CompatibleMessage spawnParticleMessage, CompatibleTargetPoint point) {
        channel.sendToAllAround(spawnParticleMessage, point.getTargetPoint());
    }
}
