package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ExposureMessageHandler implements IMessageHandler<ExposureMessage, IMessage> {

    public ExposureMessageHandler() {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(ExposureMessage message, MessageContext messageContext) {
        mc.addScheduledTask(() -> {
            CompatibleExposureCapability.updateExposures(mc.player, message.getExposures());
        });

        return null;
    }
}
