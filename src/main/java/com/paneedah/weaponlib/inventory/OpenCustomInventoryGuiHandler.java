package com.paneedah.weaponlib.inventory;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class OpenCustomInventoryGuiHandler implements CompatibleMessageHandler<OpenCustomPlayerInventoryGuiMessage, IMessage>  {

    private ModContext modContext;

    public OpenCustomInventoryGuiHandler() {
    }

    public OpenCustomInventoryGuiHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(OpenCustomPlayerInventoryGuiMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.SERVER) {
            mc.addScheduledTask(() -> {
                EntityPlayer player = messageContext.getServerHandler().player;
                player.openGui(modContext.getMod(), message.getGuiInventoryId(), 
                        player.world, (int)player.posX, (int)player.posY, (int)player.posZ);
            });
        }
        return null;
    }
}
