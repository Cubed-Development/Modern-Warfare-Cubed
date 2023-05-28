package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class SpreadableExposureMessageHandler implements IMessageHandler<SpreadableExposureMessage, IMessage> {

    public SpreadableExposureMessageHandler() {
    }

    @Override
    public IMessage onMessage(SpreadableExposureMessage message, MessageContext messageContext) {
        mc.addScheduledTask(() -> {
            SpreadableExposure spreadableExposure = message.getSpreadableExposure();
            if(spreadableExposure != null) {
                SpreadableExposure currentExposure = CompatibleExposureCapability.getExposure(mc.player, SpreadableExposure.class);
                if(currentExposure != null) {
                    currentExposure.updateFrom(spreadableExposure);
                } else {
                    CompatibleExposureCapability.updateExposure(mc.player, spreadableExposure);
                }
            } else {
                CompatibleExposureCapability.removeExposure(mc.player, SpreadableExposure.class); // TODO: remove hardcoded class
            }
        });

        return null;
    }
}
