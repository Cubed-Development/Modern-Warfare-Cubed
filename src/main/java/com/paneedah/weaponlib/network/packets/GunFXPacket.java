package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ClientEventHandler;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import io.netty.buffer.ByteBuf;

import static com.paneedah.mw.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class GunFXPacket implements CompatibleMessage {

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

	public static class GunFXPacketHandler implements CompatibleMessageHandler<GunFXPacket, CompatibleMessage> {
		
		

		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(GunFXPacket m, CompatibleMessageContext ctx) {
			 if(!ctx.isServerSide()) {
		            compatibility.runInMainClientThread(() -> {
					
		            	
		            if(mc.player.getEntityId() == m.entID) {
		            	return;
		            }
					ClientEventHandler.uploadFlash(m.entID);
					
				});
			}
			
			return null;
		}

	}

	
}
