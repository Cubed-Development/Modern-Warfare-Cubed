package com.paneedah.weaponlib;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class TryFireMessageHandler implements IMessageHandler<TryFireMessage, IMessage> {
	
	private WeaponFireAspect fireManager;

	public TryFireMessageHandler() {
	}

	TryFireMessageHandler(WeaponFireAspect fireManager) {
		this.fireManager = fireManager;
	}

	@Override
	public IMessage onMessage(TryFireMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			EntityPlayer player = messageContext.getServerHandler().player;
			ItemStack itemStack = player.getHeldItemMainhand();
			if(itemStack != null && itemStack.getItem() instanceof Weapon) {
				if(message.isOn()) {
					player.getServer().addScheduledTask(() -> fireManager.serverFire(player, itemStack, message.isBurst(), message.isAimed()));
				}
			}
		}
		
		return null;
	}

}
