package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.network.messages.OpenCustomPlayerInventoryGuiMessage;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@NoArgsConstructor
public final class OpenCustomPlayerInventoryGuiMessageHandler implements IMessageHandler<OpenCustomPlayerInventoryGuiMessage, IMessage> {

    @Override
    public IMessage onMessage(OpenCustomPlayerInventoryGuiMessage openCustomPlayerInventoryGuiMessage, MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = messageContext.getServerHandler().player;

            player.openGui(MWC.instance, openCustomPlayerInventoryGuiMessage.getGuiInventoryId(), player.world, (int) player.posX, (int) player.posY, (int) player.posZ);
        });

        return null;
    }
}
