package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.SpawnParticleMessage;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import io.redstudioragnarok.redcore.utils.NetworkUtil;
import io.redstudioragnarok.redcore.vectors.Vector3F;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@NoArgsConstructor
@AllArgsConstructor
public final class SpawnParticleMessageHandler implements IMessageHandler<SpawnParticleMessage, IMessage> {

    private static final String REGULAR_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png";
    private static final String YELLOW_SMOKE_TEXTURE = "weaponlib:/com/paneedah/weaponlib/resources/large-yellow-smoke.png";

    private static final Random RANDOM = new Random();

    private ModContext modContext;

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final SpawnParticleMessage spawnParticleMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final Vector3F position = spawnParticleMessage.getPosition();
            final Vector3F velocity = spawnParticleMessage.getVelocity();

            for (int i = 0; i < spawnParticleMessage.getCount(); ++i) {
                switch (spawnParticleMessage.getType()) {
                    case SMOKE_GRENADE_SMOKE:
                        modContext.getEffectManager().spawnExplosionSmoke(position.x, position.y, position.z, velocity.x, velocity.y, velocity.z, 4 * RANDOM.nextFloat(), 500, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, REGULAR_SMOKE_TEXTURE);
                        break;
                    case SMOKE_GRENADE_YELLOW_SMOKE:
                        modContext.getEffectManager().spawnExplosionSmoke(position.x, position.y, position.z, velocity.x, velocity.y, velocity.z, 0.3F * RANDOM.nextFloat(), 500, ExplosionSmokeFX.Behavior.SMOKE_GRENADE, YELLOW_SMOKE_TEXTURE);
                        break;
                }
            }
        });

        return null;
    }
}
