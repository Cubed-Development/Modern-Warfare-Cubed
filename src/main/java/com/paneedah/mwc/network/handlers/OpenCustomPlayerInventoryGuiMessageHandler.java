package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.OpenCustomPlayerInventoryGuiMessage;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@NoArgsConstructor
@AllArgsConstructor
public final class OpenCustomPlayerInventoryGuiMessageHandler implements IMessageHandler<OpenCustomPlayerInventoryGuiMessage, IMessage> {

    private Object mod;

    @Override
    public IMessage onMessage(OpenCustomPlayerInventoryGuiMessage openCustomPlayerInventoryGuiMessage, MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final EntityPlayer player = messageContext.getServerHandler().player;

            player.openGui(mod, openCustomPlayerInventoryGuiMessage.getGuiInventoryId(), player.world, (int) player.posX, (int) player.posY, (int) player.posZ);
        });

        return null;
    }
}
