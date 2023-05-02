package com.paneedah.mwc.weaponlib.grenade;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class GrenadeMessageHandler implements CompatibleMessageHandler<GrenadeMessage, CompatibleMessage> {

	private GrenadeAttackAspect attackAspect;

	public GrenadeMessageHandler(GrenadeAttackAspect attackAspect) {
		this.attackAspect = attackAspect;
	}

	@Override
	public <T extends CompatibleMessage> T onCompatibleMessage(GrenadeMessage message, CompatibleMessageContext ctx) {
		if(ctx.isServerSide()) {
			EntityPlayer player = ctx.getPlayer();
			ItemStack itemStack = compatibility.getHeldItemMainHand(player);
			if(itemStack != null && itemStack.getItem() instanceof ItemGrenade) {
			    ctx.runInMainThread(() -> {
			        message.getInstance().setPlayer(player);
                    attackAspect.serverThrowGrenade(player, message.getInstance(), message.getActivationTimestamp());
                });
			}
		}

		return null;
	}

}
