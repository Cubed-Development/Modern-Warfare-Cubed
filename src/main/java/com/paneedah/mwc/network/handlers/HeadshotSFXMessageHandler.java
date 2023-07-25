package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.HeadshotSFXMessage;
import com.paneedah.weaponlib.UniversalSoundLookup;
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
        MC.player.playSound(UniversalSoundLookup.lookupSound("headshotsfx"), 10, 1);

        return null;
    }
}
