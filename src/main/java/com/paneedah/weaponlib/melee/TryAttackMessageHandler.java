package com.paneedah.weaponlib.melee;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class TryAttackMessageHandler implements CompatibleMessageHandler<TryAttackMessage, CompatibleMessage> {
	
	private MeleeAttackAspect attackAspect;

	public TryAttackMessageHandler(MeleeAttackAspect attackAspect) {
		this.attackAspect = attackAspect;
	}

	@Override
	public <T extends CompatibleMessage> T onCompatibleMessage(TryAttackMessage message, CompatibleMessageContext ctx) {
		if(ctx.isServerSide()) {
			EntityPlayer player = ctx.getPlayer();
			ItemStack itemStack = compatibility.getHeldItemMainHand(player);
			if(itemStack != null && itemStack.getItem() instanceof ItemMelee) {
			    ctx.runInMainThread(() -> {
                    attackAspect.serverAttack(player, message.getInstance(), 
                            message.getEntity(compatibility.world(player)), message.isHeavyAttack());
                });
			}
		}
		
		return null;
	}

}
