package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ExposureMessageHandler implements CompatibleMessageHandler<ExposureMessage, IMessage>  {
    
    @SuppressWarnings("unused")
    private ModContext modContext;

    public ExposureMessageHandler() {
    }

    public ExposureMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(ExposureMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.CLIENT) {
            compatibility.runInMainClientThread(() -> {
                CompatibleExposureCapability.updateExposures(mc.player, message.getExposures());
            });
        }
        return null;
    }
}
