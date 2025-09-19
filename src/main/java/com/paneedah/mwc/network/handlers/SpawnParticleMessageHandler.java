package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.network.messages.SpawnParticleMessage;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import dev.redstudio.redcore.math.vectors.Vector3D;
import dev.redstudio.redcore.math.vectors.Vector3F;
import dev.redstudio.redcore.utils.NetworkUtil;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@NoArgsConstructor
public final class SpawnParticleMessageHandler implements IMessageHandler<SpawnParticleMessage, IMessage> {

    private static final String REGULAR_SMOKE_TEXTURE = "mwc:textures/smokes/large-smoke.png";
    private static final String YELLOW_SMOKE_TEXTURE = "mwc:textures/smokes/large-yellow-smoke.png";

    private static final Random RANDOM = new Random();

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final SpawnParticleMessage spawnParticleMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final Vector3D position = spawnParticleMessage.getPosition();
            final Vector3F velocity = spawnParticleMessage.getVelocity();

            for (int i = 0; i < spawnParticleMessage.getCount(); ++i) {
                switch (spawnParticleMessage.getType()) {
                    case SMOKE_GRENADE_SMOKE:
                        MWC.modContext.getEffectManager().spawnExplosionSmoke(position.x, position.y, position.z, velocity.x, velocity.y, velocity.z, 4 * RANDOM.nextFloat(), 500, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, REGULAR_SMOKE_TEXTURE);
                        break;
                    case SMOKE_GRENADE_YELLOW_SMOKE:
                        MWC.modContext.getEffectManager().spawnExplosionSmoke(position.x, position.y, position.z, velocity.x, velocity.y, velocity.z, 0.3F * RANDOM.nextFloat(), 500, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, YELLOW_SMOKE_TEXTURE);
                        break;
                }
            }
        });

        return null;
    }
}
