package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ClientEventHandler;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class GunFXPacket implements IMessage {

	public int entID;

	public GunFXPacket() {}
	
	public GunFXPacket(int entityID) {
		this.entID = entityID;
	}

	public void fromBytes(ByteBuf buf) {
		this.entID = buf.readInt();
	}

	public void toBytes(ByteBuf buf) {
		buf.writeInt(this.entID);
	}

	public static class GunFXPacketHandler implements IMessageHandler<GunFXPacket, IMessage> {

		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(GunFXPacket message, MessageContext messageContext) {
			mc.addScheduledTask(() -> {
				if(mc.player.getEntityId() == message.entID)
				   return;

			   ClientEventHandler.uploadFlash(message.entID);
			});

			return null;
		}
	}
}
