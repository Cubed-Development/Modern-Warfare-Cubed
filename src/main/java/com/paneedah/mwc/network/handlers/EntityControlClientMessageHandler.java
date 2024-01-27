package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.EntityControlClientMessage;
import com.paneedah.mwc.utils.PlayerUtil;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class EntityControlClientMessageHandler implements IMessageHandler<EntityControlClientMessage, IMessage> {

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final EntityControlClientMessage entityControlClientMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            CompatibleExtraEntityFlags.setFlags( entityControlClientMessage.getEntity(), entityControlClientMessage.getFlags(), entityControlClientMessage.getValues());
        });

        return null;
    }
}
