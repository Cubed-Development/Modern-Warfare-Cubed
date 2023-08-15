package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.HeadshotSFXMessage;
import com.paneedah.weaponlib.UniversalSoundLookup;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class HeadshotSFXMessageHandler implements IMessageHandler<HeadshotSFXMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final HeadshotSFXMessage headshotSFXMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> MC.player.playSound(UniversalSoundLookup.lookupSound("bolt_slap"), 20, 1.2f));

        return null;
    }
}