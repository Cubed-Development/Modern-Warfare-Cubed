package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.compatibility.IMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class GrenadeMessageHandler implements CompatibleMessageHandler<GrenadeMessage, IMessage> {

	private GrenadeAttackAspect attackAspect;

	public GrenadeMessageHandler(GrenadeAttackAspect attackAspect) {
		this.attackAspect = attackAspect;
	}

	@Override
	public <T extends IMessage> T onCompatibleMessage(GrenadeMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.SERVER) {
			EntityPlayer player = messageContext.getServerHandler().player;
			ItemStack itemStack = compatibility.getHeldItemMainHand(player);
			if(itemStack != null && itemStack.getItem() instanceof ItemGrenade) {
			    compatibility.runInMainClientThread(() -> {
			        message.getInstance().setPlayer(player);
                    attackAspect.serverThrowGrenade(player, message.getInstance(), message.getActivationTimestamp());
                });
			}
		}

		return null;
	}

}
