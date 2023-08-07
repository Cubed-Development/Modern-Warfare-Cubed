package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.SpreadableExposureMessage;
import com.paneedah.weaponlib.SpreadableExposure;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class SpreadableExposureMessageHandler implements IMessageHandler<SpreadableExposureMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final SpreadableExposureMessage spreadableExposureMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final SpreadableExposure spreadableExposure = spreadableExposureMessage.getSpreadableExposure();

            if (spreadableExposure != null) {
                final SpreadableExposure currentExposure = CompatibleExposureCapability.getExposure(MC.player, SpreadableExposure.class);

                if (currentExposure != null)
                    currentExposure.updateFrom(spreadableExposure);
                else
                    CompatibleExposureCapability.updateExposure(MC.player, spreadableExposure);
            } else
                CompatibleExposureCapability.removeExposure(MC.player, SpreadableExposure.class); // Todo: remove hardcoded class
        });

        return null;
    }
}
