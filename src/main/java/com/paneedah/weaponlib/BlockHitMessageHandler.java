package com.paneedah.weaponlib;

import com.paneedah.mwc.MWC;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class BlockHitMessageHandler implements IMessageHandler<BlockHitMessage, IMessage> {

    public BlockHitMessageHandler() {
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(BlockHitMessage message, MessageContext messageContext) {
        mc.addScheduledTask(() -> {
            for (int i = 0; i < MWC.bulletHitParticleMult; i++) {
                mc.effectRenderer.addBlockHitEffects(message.getBlockPos(), message.getSideHit());
                mc.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, message.getPosX(), message.getPosY(), message.getPosZ(), 0, 0, 0);
            }
        });

        return null;
    }
}
