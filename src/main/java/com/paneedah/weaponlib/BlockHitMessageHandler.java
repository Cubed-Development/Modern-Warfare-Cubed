package com.paneedah.weaponlib;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class BlockHitMessageHandler implements CompatibleMessageHandler<BlockHitMessage, IMessage>  {
    
    @SuppressWarnings("unused")
    private ModContext modContext;
    
    //private double yOffset = 1;

    public BlockHitMessageHandler() {
    }

    public BlockHitMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(BlockHitMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.CLIENT) {
            mc.addScheduledTask(() -> {
                for (int i = 0; i < ModernWarfareMod.bulletHitParticleMult; i++) {
                    mc.effectRenderer.addBlockHitEffects(message.getBlockPos(), message.getSideHit());
                    mc.world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, message.getPosX(), message.getPosY(), message.getPosZ(), 0, 0, 0);
                }
            });
        }
        return null;
    }
}
