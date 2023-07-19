package com.paneedah.mwc.network;

import com.paneedah.mwc.network.messages.CraftingClientMessage;
import com.paneedah.mwc.network.messages.CraftingServerMessage;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

@NoArgsConstructor
@AllArgsConstructor
public final class CraftingServerMessageHandler implements IMessageHandler<CraftingServerMessage, IMessage> {

    private ModContext modContext;

    @Override
    public IMessage onMessage(final CraftingServerMessage craftingServerMessage, final MessageContext messageContext) {
        final EntityPlayerMP target = (EntityPlayerMP) messageContext.getServerHandler().player.getEntityWorld().getEntityByID(craftingServerMessage.getPlayerId());

        // If the player doesn't exist or the Crafting Manager hasn't loaded properly, cancel.
        if (target == null || CraftingFileManager.getInstance().getLoadingStatus() == -1)
            return craftingServerMessage;

        this.modContext.getChannel().sendTo(new CraftingClientMessage(1, CraftingFileManager.getInstance().getCurrentFileBAOS()), target);

        return craftingServerMessage;
    }
}
