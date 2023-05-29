package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.weaponlib.network.advanced.SimplePacket;
import com.paneedah.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.weaponlib.network.advanced.data.PacketSerializer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.io.ByteArrayOutputStream;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class CraftingClientPacket extends SimplePacket {
	
	// Our "op-codes," which reduce the need for additional
	// packets and allow us to execute more functions from one.
	public static final int RECEIVE_HASH = 0;
	public static final int RECEIVE_FILESTREAM = 1;
	
	public PacketSerializer<Integer> opcode = new PacketSerializer<>(DataTypes.INTEGER);
	public PacketSerializer<ByteArrayOutputStream> fileStream = new PacketSerializer<>(DataTypes.BAOS);
	
	public CraftingClientPacket() {
		super();
	}
	
	public CraftingClientPacket(ByteArrayOutputStream baos, boolean sendingHash) {
		super();
		opcode.setValue(sendingHash ? RECEIVE_HASH : RECEIVE_FILESTREAM);
		fileStream.setValue(baos);
	}

	

	
	public static class SimplePacketHandler implements IMessageHandler<CraftingClientPacket, IMessage> {

		private ModContext context;

		public SimplePacketHandler() {
		}

		public SimplePacketHandler(ModContext context) {
			this.context = context;
		}
		
		@Override
		@SideOnly(Side.CLIENT)
		public IMessage onMessage(CraftingClientPacket message, MessageContext messageContext) {
			mc.addScheduledTask(() -> {
				int opcode = message.opcode.getValue();
				if(opcode == RECEIVE_HASH) {
					// Check if we already have a file with this hash on our system	
					boolean check = CraftingFileManager.getInstance().checkFileHashAndLoad(message.fileStream.getValue().toByteArray());
					if(!check) {
						// Tell the server that we need the file data.
						context.getChannel().sendToServer(new CraftingServerPacket(mc.player.getEntityId()));
					}
				} else if(opcode == RECEIVE_FILESTREAM) {
					// We have gotten the file, save it to disk and load it.
					CraftingFileManager.getInstance().saveCacheAndLoad(message.fileStream.getValue());
				}
				
			});
			return null;
		}
		
	}
	

}
