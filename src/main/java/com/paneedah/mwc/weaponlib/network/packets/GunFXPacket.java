package com.paneedah.mwc.weaponlib.network.packets;

import com.paneedah.mwc.weaponlib.ClientEventHandler;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import io.netty.buffer.ByteBuf;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

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
