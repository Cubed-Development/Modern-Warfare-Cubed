package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.ModContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class OpenCustomInventoryGuiHandler implements IMessageHandler<OpenCustomPlayerInventoryGuiMessage, IMessage> {

    private ModContext modContext;

    public OpenCustomInventoryGuiHandler() {
    }

    public OpenCustomInventoryGuiHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public IMessage onMessage(OpenCustomPlayerInventoryGuiMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.SERVER) {
            EntityPlayer player = messageContext.getServerHandler().player;
            player.getServer().addScheduledTask(() -> player.openGui(modContext.getMod(), message.getGuiInventoryId(), player.world, (int)player.posX, (int)player.posY, (int)player.posZ));
        }

        return null;
    }
}
