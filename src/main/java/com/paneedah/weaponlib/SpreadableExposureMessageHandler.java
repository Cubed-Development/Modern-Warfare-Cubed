package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.paneedah.mwc.MWC.MC;

public class SpreadableExposureMessageHandler implements IMessageHandler<SpreadableExposureMessage, IMessage> {

    public SpreadableExposureMessageHandler() {
    }

    @Override
    public IMessage onMessage(SpreadableExposureMessage message, MessageContext messageContext) {
        MC.addScheduledTask(() -> {
            SpreadableExposure spreadableExposure = message.getSpreadableExposure();
            if(spreadableExposure != null) {
                SpreadableExposure currentExposure = CompatibleExposureCapability.getExposure(MC.player, SpreadableExposure.class);
                if(currentExposure != null) {
                    currentExposure.updateFrom(spreadableExposure);
                } else {
                    CompatibleExposureCapability.updateExposure(MC.player, spreadableExposure);
                }
            } else {
                CompatibleExposureCapability.removeExposure(MC.player, SpreadableExposure.class); // TODO: remove hardcoded class
            }
        });

        return null;
    }
}
