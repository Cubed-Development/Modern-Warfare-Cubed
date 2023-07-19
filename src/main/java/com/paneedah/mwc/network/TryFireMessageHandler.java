package com.paneedah.mwc.network;

import com.paneedah.mwc.network.messages.TryFireMessage;
import com.paneedah.weaponlib.WeaponFireAspect;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@NoArgsConstructor
@AllArgsConstructor
public class TryFireMessageHandler implements IMessageHandler<TryFireMessage, IMessage> {
	
	private WeaponFireAspect fireManager;

	@Override
	public IMessage onMessage(TryFireMessage tryFireMessage, MessageContext messageContext) {
		fireManager.serverFire(messageContext.getServerHandler().player, tryFireMessage.isBurst(), tryFireMessage.isAimed());

		return tryFireMessage;
	}
}
