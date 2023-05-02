package com.paneedah.mwc.weaponlib.network.packets;

import com.paneedah.mwc.weaponlib.HighIQSpawnEgg;
import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.SecondaryEntityRegistry;
import com.paneedah.mwc.weaponlib.ai.EntityCustomMob;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.mwc.weaponlib.network.advanced.SimplePacket;
import com.paneedah.mwc.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.mwc.weaponlib.network.advanced.data.PacketSerializer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;

public class HighIQPickupPacket extends SimplePacket {
	
	

	
	public PacketSerializer<Integer> playerID = new PacketSerializer<>(DataTypes.INTEGER);
	public PacketSerializer<Integer> entityID = new PacketSerializer<>(DataTypes.INTEGER);
	
	public HighIQPickupPacket() {
		super();
	}
	
	public HighIQPickupPacket(int playerID, int entityID) {
		super();
		
		this.playerID.setValue(playerID);
		this.entityID.setValue(entityID);
	}

	
	
	public static class SimplePacketHandler implements CompatibleMessageHandler<HighIQPickupPacket, CompatibleMessage> {

		private ModContext context;
		
		public SimplePacketHandler(ModContext context) {
			this.context = context;
		}
		
		@Override
		public <T extends CompatibleMessage> T onCompatibleMessage(HighIQPickupPacket compatibleMessage,
				CompatibleMessageContext ctx) {
			ctx.getPlayer().getServer().addScheduledTask(() -> {
				// Find the player we should send to
				EntityPlayerMP target = (EntityPlayerMP) ctx.getPlayer().getEntityWorld().getEntityByID(compatibleMessage.playerID.getValue());
				
				Entity e = target.world.getEntityByID(compatibleMessage.entityID.getValue());
				
				
		
				if(e == null || !(e instanceof EntityCustomMob)) return;
				
				
				EntityCustomMob ecm = (EntityCustomMob) e;
				HighIQSpawnEgg egg = (HighIQSpawnEgg) SecondaryEntityRegistry.pickupMap.get(ecm.getConfiguration().getPickupItemID());
				
				
				//System.out.println(((HighIQSpawnEgg) ((EntityCustomMob) e).getConfiguration().getPickupItem()).getEntitySpawnName());
			
			
				target.addItemStackToInventory(new ItemStack(egg));
				e.setDead();
				
			});
			return null;
		}
		
	}
	

}
