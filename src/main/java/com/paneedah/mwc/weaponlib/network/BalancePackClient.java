package com.paneedah.mwc.weaponlib.network;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.mwc.weaponlib.config.BalancePackManager;
import com.paneedah.mwc.weaponlib.config.BalancePackManager.BalancePack;
import io.netty.buffer.ByteBuf;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class BalancePackClient implements CompatibleMessage {

	BalancePack pack;
	String test;

	public BalancePackClient() {}
	
	public BalancePackClient(BalancePack pack) {
		this.pack = pack;
	}
	

	public void fromBytes(ByteBuf buf) {
	
		if(!buf.readBoolean()) return;
		
		int length = buf.readInt();
		
		byte[] bytes = new byte[length];
		for(int i = 0; i < bytes.length; ++i) {
			bytes[i] = buf.readByte();
		}
		String decompressed = CompressionUtil.decompressString(bytes);
		JsonObject obj = new GsonBuilder().create().fromJson(decompressed, JsonObject.class);
		this.pack = BalancePack.fromJSONObject(obj);

	
	}
	
	

	public void toBytes(ByteBuf buf) {
		if(pack == null) {
			buf.writeBoolean(false);
			return;
		}
		buf.writeBoolean(true);
		byte[] bytes = CompressionUtil.compressString(this.pack.toJSONObject().toString());
		buf.writeInt(bytes.length);
		buf.writeBytes(bytes);
	}

	public static class BalancePacketHandler implements CompatibleMessageHandler<BalancePackClient, CompatibleMessage> {
		
		

		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(BalancePackClient m, CompatibleMessageContext ctx) {
			 if(!ctx.isServerSide()) {
		            compatibility.runInMainClientThread(() -> {
					
		            	BalancePackManager.setCurrentBalancePack(m.pack);
		            	
					
				});
			}
			
			return null;
		}

	}

	
}
