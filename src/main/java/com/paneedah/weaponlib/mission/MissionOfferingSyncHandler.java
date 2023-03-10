package com.paneedah.weaponlib.mission;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class MissionOfferingSyncHandler implements CompatibleMessageHandler<MissionOfferingSyncMessage, CompatibleMessage>  {

    private ModContext modContext;

    public MissionOfferingSyncHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(MissionOfferingSyncMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide()){
            compatibility.runInMainClientThread(() -> {
                modContext.getMissionManager().updateOfferings(message.getMissionOfferings());
            });
        }
        return null;
    }
}
