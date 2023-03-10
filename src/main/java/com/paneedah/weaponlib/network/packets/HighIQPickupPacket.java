package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.HighIQSpawnEgg;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.SecondaryEntityRegistry;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.network.advanced.SimplePacket;
import com.paneedah.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.weaponlib.network.advanced.data.PacketSerializer;
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
