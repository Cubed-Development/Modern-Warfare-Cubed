package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.CraftingClientMessage;
import com.paneedah.mwc.network.messages.CraftingServerMessage;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.network.handlers.CraftingClientMessageHandler.RECEIVE_FILESTREAM;

@NoArgsConstructor
public final class CraftingServerMessageHandler implements IMessageHandler<CraftingServerMessage, IMessage> {

    @Override
    public IMessage onMessage(final CraftingServerMessage craftingServerMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayerMP target = (EntityPlayerMP) messageContext.getServerHandler().player.getEntityWorld().getEntityByID(craftingServerMessage.getPlayerId());

            // If the player doesn't exist or the Crafting Manager hasn't loaded properly, cancel.
            if (target == null || CraftingFileManager.getInstance().getLoadingStatus() == -1)
                return;

            CHANNEL.sendTo(new CraftingClientMessage(RECEIVE_FILESTREAM, CraftingFileManager.getInstance().getCurrentFileBAOS()), target);
        });

        return null;
    }
}
