package com.paneedah.weaponlib.particle;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class SpawnParticleMessageHandler implements CompatibleMessageHandler<SpawnParticleMessage, IMessage>  {

    private static final String REGULAR_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png";
    
    private static final String YELLOW_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-yellow-smoke.png";
    
    private ModContext modContext;

    @SuppressWarnings("unused")
    private double yOffset = 1;

    public SpawnParticleMessageHandler() {
    }

    public SpawnParticleMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(SpawnParticleMessage message, MessageContext messageContext) {
        if(messageContext.side == Side.CLIENT) {
            mc.addScheduledTask(() -> {
                for (int i = 0; i < message.getCount(); ++i) {
                    switch(message.getParticleType()) {
                    case BLOOD:
                        ParticleBlood particle = new ParticleBlood(mc.player.world, message.getPosX(), message.getPosY() + 1, message.getPosZ());
                        mc.effectRenderer.addEffect(particle);
                        break;
                    case SMOKE_GRENADE_SMOKE:
                        modContext.getEffectManager().spawnExplosionSmoke(
                                message.getPosX(), message.getPosY(), message.getPosZ(),
                                message.getMotionX(), message.getMotionY(), message.getMotionZ(),
                                1.5f * mc.player.world.rand.nextFloat(),
                                300, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, REGULAR_SMOKE_TEXTURE);
                        break;
                    case SMOKE_GRENADE_YELLOW_SMOKE:
                        modContext.getEffectManager().spawnExplosionSmoke(
                                message.getPosX(), message.getPosY(), message.getPosZ(),
                                message.getMotionX(), message.getMotionY(), message.getMotionZ(),
                                0.2f * mc.player.world.rand.nextFloat(),
                                300, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, YELLOW_SMOKE_TEXTURE);
                        break;
                    default:
                        break;
                    }
                }
            });
        }
        return null;
    }
}
