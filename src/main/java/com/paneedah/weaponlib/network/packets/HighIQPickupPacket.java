package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.HighIQSpawnEgg;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.SecondaryEntityRegistry;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.network.advanced.SimplePacket;
import com.paneedah.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.weaponlib.network.advanced.data.PacketSerializer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

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

	
	
	public static class SimplePacketHandler implements CompatibleMessageHandler<HighIQPickupPacket, IMessage> {

		private ModContext context;

		public SimplePacketHandler() {
		}

		public SimplePacketHandler(ModContext context) {
			this.context = context;
		}
		
		@Override
		public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(HighIQPickupPacket message,
                                                                                                           MessageContext messageContext) {
			messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
				// Find the player we should send to
				EntityPlayerMP target = (EntityPlayerMP) messageContext.getServerHandler().player.getEntityWorld().getEntityByID(message.playerID.getValue());
				
				Entity e = target.world.getEntityByID(message.entityID.getValue());
				
				
		
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
