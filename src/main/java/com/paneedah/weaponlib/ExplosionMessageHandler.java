package com.paneedah.weaponlib;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ExplosionMessageHandler implements IMessageHandler<ExplosionMessage, IMessage> {

    private ModContext modContext;

    public ExplosionMessageHandler() {
    }

    public ExplosionMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(ExplosionMessage message, MessageContext messageContext) {
        EntityPlayer player = mc.player;
        mc.addScheduledTask(() -> {
            Explosion explosion = new Explosion(modContext,
                    player.world,
                    null,
                    message.getPosX(),
                    message.getPosY(),
                    message.getPosZ(),
                    message.getStrength(),
                    message.getAffectedBlockPositions(),
                    message.getExplosionParticleAgeCoefficient(),
                    message.getSmokeParticleAgeCoefficient(),
                    message.getExplosionParticleScaleCoefficient(),
                    message.getSmokeParticleScaleCoefficient(),
                    modContext.getRegisteredTexture(message.getExplosionParticleTextureId()),
                    modContext.getRegisteredTexture(message.getSmokeParticleTextureId()),
                    null);

            explosion.doExplosionB(true, message.isDestroyingBlocks());
            player.motionX += message.getMotionX();
            player.motionY += message.getMotionY();
            player.motionZ += message.getMotionZ();
        });

        return null;
    }

}
