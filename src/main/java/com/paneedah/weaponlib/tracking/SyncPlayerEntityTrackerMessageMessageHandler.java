package com.paneedah.weaponlib.tracking;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class SyncPlayerEntityTrackerMessageMessageHandler implements CompatibleMessageHandler<SyncPlayerEntityTrackerMessage, IMessage> {

    private ModContext modContext;

	public SyncPlayerEntityTrackerMessageMessageHandler() {
	}

	public SyncPlayerEntityTrackerMessageMessageHandler(ModContext modContex) {
        this.modContext = modContex;
    }

    @Override
	public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(SyncPlayerEntityTrackerMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.CLIENT) {
		    compatibility.runInMainClientThread(() -> {
		        CompatiblePlayerEntityTrackerProvider.setTracker(compatibility.clientPlayer(), message.getTracker());
		        if(message.getStatusMessage() != null) {
		            modContext.getStatusMessageCenter().addMessage(message.getStatusMessage(), 1000);
		        }

		    });
		}
		return null;
	}

}
