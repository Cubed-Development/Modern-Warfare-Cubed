package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.RealisticSoundClientMessage;
import com.paneedah.mwc.network.messages.RealisticSoundMessage;
import com.paneedah.weaponlib.sound.RealisticSound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

import java.util.Objects;

import static com.paneedah.mwc.MWC.CHANNEL;

public class RealisticSoundHandler implements IMessageHandler<RealisticSoundMessage, IMessage> {

    @Override
    public IMessage onMessage(final RealisticSoundMessage message, final MessageContext ctx) {
        ctx.getServerHandler().player.getServerWorld().addScheduledTask(() -> {
            final EntityPlayer player = ctx.getServerHandler().player;
            final World world = player.getEntityWorld();
            for (EntityPlayer playerInWorld : world.playerEntities) {
                final double distance = Math.sqrt(message.getPos().distanceSq(playerInWorld.getPosition()));
                final RealisticSound sound = RealisticSound.createSound(message.getSilencer(), message.getSound(), message.getPos(), playerInWorld.getPosition());
                if (sound.getVolumeIn() > 0) {
                    if (playerInWorld instanceof EntityPlayerMP) {
                    EntityPlayerMP playerMP = (EntityPlayerMP) playerInWorld;
                    playerMP.getServerWorld().addScheduledTask(() -> {
                        CHANNEL.sendTo(new RealisticSoundClientMessage(sound.getSound(), message.getPos(), sound.getVolumeIn(), sound.getPitchIn(), distance), playerMP);
                    });
                    }
                }
            }
        });
        
        return null;
    }
}
