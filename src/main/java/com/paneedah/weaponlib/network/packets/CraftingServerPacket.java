package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.weaponlib.network.advanced.SimplePacket;
import com.paneedah.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.weaponlib.network.advanced.data.PacketSerializer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class CraftingServerPacket extends SimplePacket {
	
	

	
	public PacketSerializer<Integer> playerID = new PacketSerializer<>(DataTypes.INTEGER);
	
	public CraftingServerPacket() {
		super();
	}
	
	public CraftingServerPacket(int id) {
		super();
		playerID.setValue(id);
	}

	
	
	public static class SimplePacketHandler implements IMessageHandler<CraftingServerPacket, IMessage> {

		private ModContext context;

		public SimplePacketHandler() {}

		public SimplePacketHandler(ModContext context) {
			this.context = context;
		}
		
		@Override
		public IMessage onMessage(CraftingServerPacket message, MessageContext messageContext) {
			messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
				EntityPlayerMP target = (EntityPlayerMP) messageContext.getServerHandler().player.getEntityWorld().getEntityByID(message.playerID.getValue());
				
				// If the player doesn't exist or the Crafting Manager hasn't loaded properly, cancel.
				if(target == null || CraftingFileManager.getInstance().getLoadingStatus() == -1)
					return;

				this.context.getChannel().sendTo(new CraftingClientPacket(CraftingFileManager.getInstance().getCurrentFileBAOS(), false), target);
			});

			return null;
		}
		
	}
	

}
