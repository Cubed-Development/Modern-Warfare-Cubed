package com.paneedah.weaponlib.network.packets;

import com.paneedah.weaponlib.HighIQSpawnEgg;
import com.paneedah.weaponlib.SecondaryEntityRegistry;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import com.paneedah.weaponlib.network.advanced.SimplePacket;
import com.paneedah.weaponlib.network.advanced.data.DataTypes;
import com.paneedah.weaponlib.network.advanced.data.PacketSerializer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
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

	
	
	public static class SimplePacketHandler implements IMessageHandler<HighIQPickupPacket, IMessage> {

		public SimplePacketHandler() {
		}
		
		@Override
		public IMessage onMessage(HighIQPickupPacket message, MessageContext messageContext) {
			messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
				// Find the player we should send to
				EntityPlayerMP target = (EntityPlayerMP) messageContext.getServerHandler().player.getEntityWorld().getEntityByID(message.playerID.getValue());
				Entity entity = target.world.getEntityByID(message.entityID.getValue());

				if(entity == null || !(entity instanceof EntityCustomMob))
					return;
				
				EntityCustomMob entityCustomMob = (EntityCustomMob) entity;
				HighIQSpawnEgg highIQSpawnEgg = (HighIQSpawnEgg) SecondaryEntityRegistry.pickupMap.get(entityCustomMob.getConfiguration().getPickupItemID());
				target.addItemStackToInventory(new ItemStack(highIQSpawnEgg));
				entity.setDead();
			});

			return null;
		}
		
	}
	

}
