package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

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
