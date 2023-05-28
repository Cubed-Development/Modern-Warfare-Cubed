package com.paneedah.weaponlib.tracking;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class SyncPlayerEntityTrackerMessageMessageHandler implements IMessageHandler<SyncPlayerEntityTrackerMessage, IMessage> {

    private ModContext modContext;

	public SyncPlayerEntityTrackerMessageMessageHandler() {
	}

	public SyncPlayerEntityTrackerMessageMessageHandler(ModContext modContex) {
        this.modContext = modContex;
    }

    @Override
	@SideOnly(Side.CLIENT)
	public IMessage onMessage(SyncPlayerEntityTrackerMessage message, MessageContext messageContext) {
		mc.addScheduledTask(() -> {
			CompatiblePlayerEntityTrackerProvider.setTracker(mc.player, message.getTracker());
			if(message.getStatusMessage() != null)
				modContext.getStatusMessageCenter().addMessage(message.getStatusMessage(), 1000);
		});

		return null;
	}

}
