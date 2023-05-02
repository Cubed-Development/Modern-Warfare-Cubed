package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class TryFireMessageHandler implements CompatibleMessageHandler<TryFireMessage, CompatibleMessage> {
	
	private WeaponFireAspect fireManager;

	TryFireMessageHandler(WeaponFireAspect fireManager) {
		this.fireManager = fireManager;
	}

	@Override
	public <T extends CompatibleMessage> T onCompatibleMessage(TryFireMessage message, CompatibleMessageContext ctx) {
		if(ctx.isServerSide()) {
			EntityPlayer player = ctx.getPlayer();
			ItemStack itemStack = compatibility.getHeldItemMainHand(player);
			if(itemStack != null && itemStack.getItem() instanceof Weapon) {
				if(message.isOn()) {
					ctx.runInMainThread(() -> {
						fireManager.serverFire(player, itemStack, message.isBurst(), message.isAimed());
					});
				}
			}
		}
		
		return null;
	}

}
