package com.paneedah.weaponlib.network.packets;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.BalancePackManager.BalancePack;
import com.paneedah.weaponlib.network.CompressionUtil;
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class BalancePackClient implements IMessage {

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

	public static class BalancePacketHandler implements IMessageHandler<BalancePackClient, IMessage> {

		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(BalancePackClient message, MessageContext messageContext) {
			mc.addScheduledTask(() -> BalancePackManager.setCurrentBalancePack(message.pack));

			return null;
		}
	}
}
