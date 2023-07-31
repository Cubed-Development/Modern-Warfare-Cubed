package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.EntityControlClientMessage;
import com.paneedah.mwc.utils.PlayerUtil;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class EntityControlClientMessageHandler implements IMessageHandler<EntityControlClientMessage, IMessage> {

    @Override
    public IMessage onMessage(final EntityControlClientMessage entityControlClientMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = MC.player;
            final Entity targetEntity = entityControlClientMessage.getEntity(player.world);

            CompatibleExtraEntityFlags.setFlags(targetEntity, entityControlClientMessage.getFlags(), entityControlClientMessage.getValues());

            final int updatedFlags = CompatibleExtraEntityFlags.getFlags(player);

            if ((updatedFlags & CompatibleExtraEntityFlags.PRONING) != 0)
                PlayerUtil.setSize(player, 0.6F);
            else
                PlayerUtil.setSize(player, 1.8F);
        });

        return null;
    }
}
