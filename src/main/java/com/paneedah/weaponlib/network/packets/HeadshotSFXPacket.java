package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.UniversalSoundLookup;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class HeadshotSFXPacket implements IMessage {

	public HeadshotSFXPacket() {
	}

	public void fromBytes(ByteBuf buf) {
	}

	public void toBytes(ByteBuf buf) {
	}

	public static class GunFXPacketHandler implements IMessageHandler<HeadshotSFXPacket, IMessage> {

		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(HeadshotSFXPacket message, MessageContext messageContext) {
			mc.addScheduledTask(() -> mc.player.playSound(UniversalSoundLookup.lookupSound("headshotsfx"), 10, 1));

			return null;
		}
	}
}
