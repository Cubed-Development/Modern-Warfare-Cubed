package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ClientEventHandler;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class GunFXPacket implements net.minecraftforge.fml.common.network.simpleimpl.IMessage {

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

	public static class GunFXPacketHandler implements CompatibleMessageHandler<GunFXPacket, IMessage> {
		
		

		@Override
		public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(GunFXPacket message, MessageContext messageContext) {
			 if(messageContext.side == Side.CLIENT) {
		            compatibility.runInMainClientThread(() -> {
					
		            	
		            if(mc.player.getEntityId() == message.entID) {
		            	return;
		            }
					ClientEventHandler.uploadFlash(message.entID);
					
				});
			}
			
			return null;
		}

	}

	
}
