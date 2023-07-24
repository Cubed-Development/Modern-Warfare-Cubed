package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.ExplosionMessage;
import com.paneedah.weaponlib.Explosion;
import com.paneedah.weaponlib.ModContext;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@NoArgsConstructor
@AllArgsConstructor
public final class ExplosionMessageHandler implements IMessageHandler<ExplosionMessage, IMessage> {

    private ModContext modContext;

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final ExplosionMessage explosionMessage, final MessageContext messageContext) {
        final EntityPlayer player = MC.player;
        final Vector3D position = explosionMessage.getPosition();
        final Vector3D motion = explosionMessage.getVelocity();

        final Explosion explosion = new Explosion(modContext,
                player.world,
                null,
                position.x,
                position.y,
                position.z,
                explosionMessage.getStrength(),
                explosionMessage.getAffectedBlockPositions(),
                explosionMessage.getExplosionParticleAgeCoefficient(),
                explosionMessage.getSmokeParticleAgeCoefficient(),
                explosionMessage.getExplosionParticleScaleCoefficient(),
                explosionMessage.getSmokeParticleScaleCoefficient(),
                modContext.getRegisteredTexture(explosionMessage.getExplosionParticleTextureId()),
                modContext.getRegisteredTexture(explosionMessage.getSmokeParticleTextureId()),
                null);

        explosion.doExplosionB(true, explosionMessage.isDestroyBlocks());

        player.motionX += motion.x;
        player.motionY += motion.y;
        player.motionZ += motion.z;

        return null;
    }
}
