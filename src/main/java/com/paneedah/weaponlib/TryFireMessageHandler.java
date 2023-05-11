package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.IMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class TryFireMessageHandler implements CompatibleMessageHandler<TryFireMessage, IMessage> {
	
	private WeaponFireAspect fireManager;

	TryFireMessageHandler(WeaponFireAspect fireManager) {
		this.fireManager = fireManager;
	}

	@Override
	public <T extends IMessage> T onCompatibleMessage(TryFireMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			EntityPlayer player = messageContext.getServerHandler().player;
			ItemStack itemStack = compatibility.getHeldItemMainHand(player);
			if(itemStack != null && itemStack.getItem() instanceof Weapon) {
				if(message.isOn()) {
					compatibility.runInMainClientThread(() -> {
						fireManager.serverFire(player, itemStack, message.isBurst(), message.isAimed());
					});
				}
			}
		}
		
		return null;
	}

}
