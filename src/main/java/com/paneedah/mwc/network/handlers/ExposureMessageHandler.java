package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.ExposureMessage;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class ExposureMessageHandler implements IMessageHandler<ExposureMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final ExposureMessage exposureMessage, final MessageContext messageContext) {
        CompatibleExposureCapability.updateExposures(MC.player, exposureMessage.getExposures());

        return null;
    }
}
