package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class OpenMissionGuiHandler implements CompatibleMessageHandler<OpenMissionGuiMessage, CompatibleMessage>  {

    @SuppressWarnings("unused")
    private ModContext modContext;

    public OpenMissionGuiHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(OpenMissionGuiMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide()) {
            compatibility.runInMainClientThread(() -> {
//                CompatiblePlayerEntityTrackerProvider.setTracker(compatibility.clientPlayer(), message.getTracker());
//                if(message.getStatusMessage() != null) {
//                    modContext.getStatusMessageCenter().addMessage(message.getStatusMessage(), 1000);
//                }
//                mc.displayGuiScreen(new MissionsMenuGui());

            });
        }
        return null;
    }
}
