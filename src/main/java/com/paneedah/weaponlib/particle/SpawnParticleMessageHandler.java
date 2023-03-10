package com.paneedah.weaponlib.particle;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class SpawnParticleMessageHandler implements CompatibleMessageHandler<SpawnParticleMessage, CompatibleMessage>  {

    private static final String REGULAR_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png";
    
    private static final String YELLOW_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-yellow-smoke.png";
    
    private ModContext modContext;

    @SuppressWarnings("unused")
    private double yOffset = 1;

    public SpawnParticleMessageHandler(ModContext modContext) {
        this.modContext = modContext;
    }

    @Override
    public <T extends CompatibleMessage> T onCompatibleMessage(SpawnParticleMessage message, CompatibleMessageContext ctx) {
        if(!ctx.isServerSide()) {
            compatibility.runInMainClientThread(() -> {
                for (int i = 0; i < message.getCount(); ++i) {
                    switch(message.getParticleType()) {
                    case BLOOD:
                       compatibility.addBreakingParticle(modContext, message.getPosX(), message.getPosY(), message.getPosZ());
                        break;
                    case SMOKE_GRENADE_SMOKE:
                        modContext.getEffectManager().spawnExplosionSmoke(
                                message.getPosX(), message.getPosY(), message.getPosZ(),
                                message.getMotionX(), message.getMotionY(), message.getMotionZ(),
                                1.5f * compatibility.world(compatibility.clientPlayer()).rand.nextFloat(),
                                300, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, REGULAR_SMOKE_TEXTURE);
                        break;
                    case SMOKE_GRENADE_YELLOW_SMOKE:
                        modContext.getEffectManager().spawnExplosionSmoke(
                                message.getPosX(), message.getPosY(), message.getPosZ(),
                                message.getMotionX(), message.getMotionY(), message.getMotionZ(),
                                0.2f * compatibility.world(compatibility.clientPlayer()).rand.nextFloat(),
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
