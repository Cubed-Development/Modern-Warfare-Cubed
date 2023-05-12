package com.paneedah.weaponlib.compatibility;

import net.minecraftforge.fml.common.network.NetworkRegistry;
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

    public <Request extends IMessage, Response extends IMessage> void registerMessage(CompatibleMessageHandler<? super Request, ? extends Response> messageHandler, Class<Request> requestMessageType, int discriminator, Side side) {
    	channel.registerMessage(messageHandler, requestMessageType, discriminator, side);
    }

    public void sendToAllAround(IMessage spawnParticleMessage, NetworkRegistry.TargetPoint point) {
        channel.sendToAllAround(spawnParticleMessage, point);
    }
}
