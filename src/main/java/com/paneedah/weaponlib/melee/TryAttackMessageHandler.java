package com.paneedah.weaponlib.melee;

import com.paneedah.weaponlib.compatibility.IMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class TryAttackMessageHandler implements CompatibleMessageHandler<TryAttackMessage, IMessage> {
	
	private MeleeAttackAspect attackAspect;

	public TryAttackMessageHandler(MeleeAttackAspect attackAspect) {
		this.attackAspect = attackAspect;
	}

	@Override
	public <T extends IMessage> T onCompatibleMessage(TryAttackMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			EntityPlayer player = messageContext.getServerHandler().player;
			ItemStack itemStack = compatibility.getHeldItemMainHand(player);
			if(itemStack != null && itemStack.getItem() instanceof ItemMelee) {
			    compatibility.runInMainClientThread(() -> {
                    attackAspect.serverAttack(player, message.getInstance(), 
                            message.getEntity(compatibility.world(player)), message.isHeavyAttack());
                });
			}
		}
		
		return null;
	}

}
