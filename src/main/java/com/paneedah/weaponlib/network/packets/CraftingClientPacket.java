package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.weaponlib.network.advanced.SimplePacket;
import com.paneedah.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.weaponlib.network.advanced.data.PacketSerializer;

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

	

	
	public static class SimplePacketHandler implements CompatibleMessageHandler<CraftingClientPacket, CompatibleMessage> {

		private ModContext context;
		
		public SimplePacketHandler(ModContext context) {
			this.context = context;
		}
		
		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(CraftingClientPacket compatibleMessage,
				CompatibleMessageContext ctx) {
			mc.addScheduledTask(() -> {
				
				int opcode = compatibleMessage.opcode.getValue();
				if(opcode == RECEIVE_HASH) {
					// Check if we already have a file with this hash on our system	
					boolean check = CraftingFileManager.getInstance().checkFileHashAndLoad(compatibleMessage.fileStream.getValue().toByteArray());
					if(!check) {
						// Tell the server that we need the file data.
						context.getChannel().getChannel().sendToServer(new CraftingServerPacket(mc.player.getEntityId()));
					}
				} else if(opcode == RECEIVE_FILESTREAM) {
					// We have gotten the file, save it to disk and load it.
					CraftingFileManager.getInstance().saveCacheAndLoad(compatibleMessage.fileStream.getValue());
				}
				
			});
			return null;
		}
		
	}
	

}
