package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class SpreadableExposureMessageHandler implements CompatibleMessageHandler<SpreadableExposureMessage, IMessage>  {
    
    @SuppressWarnings("unused")
    private ModContext modContext;

    public SpreadableExposureMessageHandler() {
    }

    public SpreadableExposureMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(SpreadableExposureMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.CLIENT)
            return null;

        compatibility.runInMainClientThread(() -> {
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
