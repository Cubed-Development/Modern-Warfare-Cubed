package com.paneedah.weaponlib.melee;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class TryAttackMessageHandler implements IMessageHandler<TryAttackMessage, IMessage> {
	
	private MeleeAttackAspect attackAspect;

	public TryAttackMessageHandler() {
	}

	public TryAttackMessageHandler(MeleeAttackAspect attackAspect) {
		this.attackAspect = attackAspect;
	}

	@Override
	public IMessage onMessage(TryAttackMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			EntityPlayer player = messageContext.getServerHandler().player;
			ItemStack itemStack = player.getHeldItemMainhand();
			if(itemStack != null && itemStack.getItem() instanceof ItemMelee) {
				messageContext.getServerHandler().player.getServer().addScheduledTask(() -> attackAspect.serverAttack(player, message.getInstance(), message.getEntity(player.world), message.isHeavyAttack()));
			}
		}
		
		return null;
	}

}
