package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.weaponlib.network.advanced.SimplePacket;
import com.paneedah.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.weaponlib.network.advanced.data.PacketSerializer;
import net.minecraft.entity.player.EntityPlayerMP;

public class CraftingServerPacket extends SimplePacket {
	
	

	
	public PacketSerializer<Integer> playerID = new PacketSerializer<>(DataTypes.INTEGER);
	
	public CraftingServerPacket() {
		super();
	}
	
	public CraftingServerPacket(int id) {
		super();
		playerID.setValue(id);
	}

	
	
	public static class SimplePacketHandler implements CompatibleMessageHandler<CraftingServerPacket, CompatibleMessage> {

		private ModContext context;
		
		public SimplePacketHandler(ModContext context) {
			this.context = context;
		}
		
		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(CraftingServerPacket compatibleMessage,
				CompatibleMessageContext ctx) {
			ctx.getPlayer().getServer().addScheduledTask(() -> {
				// Find the player we should send to
				EntityPlayerMP target = (EntityPlayerMP) ctx.getPlayer().getEntityWorld().getEntityByID(compatibleMessage.playerID.getValue());
				
				// If the player doesn't exist or the Crafting Manager hasn't loaded properly, cancel.
				if(target == null || CraftingFileManager.getInstance().getLoadingStatus() == -1) return;
				this.context.getChannel().getChannel().sendTo(new CraftingClientPacket(CraftingFileManager.getInstance().getCurrentFileBAOS(), false), target);
			});
			return null;
		}
		
	}
	

}
