package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.MuzzleFlashMessage;
import com.paneedah.weaponlib.ClientEventHandler;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class MuzzleFlashMessageHandler implements IMessageHandler<MuzzleFlashMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final MuzzleFlashMessage muzzleFlashMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            if (MC.player.getEntityId() == muzzleFlashMessage.getEntityID()) {
                return;
            }

            ClientEventHandler.uploadFlash(muzzleFlashMessage.getEntityID());
        });

        return null;
    }
}
