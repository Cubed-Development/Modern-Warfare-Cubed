package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class SpreadableExposureMessageHandler implements CompatibleMessageHandler<SpreadableExposureMessage, CompatibleMessage>  {
    
    @SuppressWarnings("unused")
    private ModContext modContext;

    public SpreadableExposureMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(SpreadableExposureMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide())
            return null;

        compatibility.runInMainClientThread(() -> {
            SpreadableExposure spreadableExposure = message.getSpreadableExposure();
            if(spreadableExposure != null) {
                SpreadableExposure currentExposure = CompatibleExposureCapability.getExposure(compatibility.clientPlayer(), SpreadableExposure.class);
                if(currentExposure != null) {
                    currentExposure.updateFrom(spreadableExposure);
                } else {
                    CompatibleExposureCapability.updateExposure(compatibility.clientPlayer(), spreadableExposure);
                }
            } else {
                CompatibleExposureCapability.removeExposure(compatibility.clientPlayer(), SpreadableExposure.class); // TODO: remove hardcoded class
            }
        });

        return null;
    }
}
