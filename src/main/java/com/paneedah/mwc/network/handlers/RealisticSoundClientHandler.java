package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.RealisticSoundClientMessage;
import com.paneedah.weaponlib.sound.ClientSoundPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class RealisticSoundClientHandler implements IMessageHandler<RealisticSoundClientMessage, IMessage> {

    @Override
    public IMessage onMessage(final RealisticSoundClientMessage message, final MessageContext ctx) {
        Minecraft.getMinecraft().addScheduledTask(() -> {
            Minecraft minecraft = Minecraft.getMinecraft();
            if (minecraft.world != null) {
                ClientSoundPlayer csp = new ClientSoundPlayer();
                csp.PlaySoundClient(message.getDistance(), message.getSound(), SoundCategory.PLAYERS, message.getVolume(), message.getPitch(), (float)message.getPos().getX(), (float)message.getPos().getY(), (float)message.getPos().getZ());
            }
        });
        
        return null;
    }
}
