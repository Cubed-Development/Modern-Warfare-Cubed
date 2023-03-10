package com.paneedah.weaponlib.tracking;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class SyncPlayerEntityTrackerMessageMessageHandler implements CompatibleMessageHandler<SyncPlayerEntityTrackerMessage, CompatibleMessage> {

    private ModContext modContext;

	public SyncPlayerEntityTrackerMessageMessageHandler(ModContext modContex) {
        this.modContext = modContex;
    }

    @Override
	public <T extends CompatibleMessage> T onCompatibleMessage(SyncPlayerEntityTrackerMessage message, CompatibleMessageContext ctx) {
		if(!ctx.isServerSide()) {
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
