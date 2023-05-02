package com.paneedah.mwc.weaponlib.tracking;

import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;
import com.paneedah.mwc.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

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
