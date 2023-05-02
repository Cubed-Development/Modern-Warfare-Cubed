package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ExposureMessageHandler implements CompatibleMessageHandler<ExposureMessage, CompatibleMessage>  {
    
    @SuppressWarnings("unused")
    private ModContext modContext;

    public ExposureMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(ExposureMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide()) {
            compatibility.runInMainClientThread(() -> {
                CompatibleExposureCapability.updateExposures(compatibility.clientPlayer(), message.getExposures());
            });
        }
        return null;
    }
}
