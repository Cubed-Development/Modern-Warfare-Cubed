package com.paneedah.weaponlib.melee;

import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class TryAttackMessageHandler implements CompatibleMessageHandler<TryAttackMessage, IMessage> {
	
	private MeleeAttackAspect attackAspect;

	public TryAttackMessageHandler() {
	}

	public TryAttackMessageHandler(MeleeAttackAspect attackAspect) {
		this.attackAspect = attackAspect;
	}

	@Override
	public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(TryAttackMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			EntityPlayer player = messageContext.getServerHandler().player;
			ItemStack itemStack = player.getHeldItemMainhand();
			if(itemStack != null && itemStack.getItem() instanceof ItemMelee) {
				mc.addScheduledTask(() -> {
                    attackAspect.serverAttack(player, message.getInstance(), 
                            message.getEntity(player.world), message.isHeavyAttack());
                });
			}
		}
		
		return null;
	}

}
