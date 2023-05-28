package com.paneedah.weaponlib.grenade;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class GrenadeMessageHandler implements IMessageHandler<GrenadeMessage, IMessage> {

	private GrenadeAttackAspect attackAspect;

	public GrenadeMessageHandler() {
	}

	public GrenadeMessageHandler(GrenadeAttackAspect attackAspect) {
		this.attackAspect = attackAspect;
	}

	@Override
	public IMessage onMessage(GrenadeMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			EntityPlayer player = messageContext.getServerHandler().player;
			ItemStack itemStack = player.getHeldItemMainhand();
			if(itemStack != null && itemStack.getItem() instanceof ItemGrenade) {
				messageContext.getServerHandler().player.getServer().addScheduledTask(() -> {
			        message.getInstance().setPlayer(player);
                    attackAspect.serverThrowGrenade(player, message.getInstance(), message.getActivationTimestamp());
                });
			}
		}

		return null;
	}

}
