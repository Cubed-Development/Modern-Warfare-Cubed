package com.paneedah.mwc.network.handlers;

import com.paneedah.mwc.network.messages.BloodClientMessage;
import com.paneedah.weaponlib.jim.util.RandomUtil;
import com.paneedah.weaponlib.particle.ParticleBlood;
import dev.redstudio.redcore.utils.NetworkUtil;
import dev.redstudio.redcore.vectors.Vector3F;
import net.jafama.FastMath;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public final class BloodClientMessageHandler implements IMessageHandler<BloodClientMessage, IMessage> {

    private static final float SCALE = 0.2F;
    private static final float SPREAD = 0.05F;

    @Override
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(final BloodClientMessage bloodClientMessage, final MessageContext messageContext) {
        NetworkUtil.processMessage(messageContext, () -> {
            final Vector3F position = bloodClientMessage.getPosition();
            final Vector3F velocity = bloodClientMessage.getVelocity();

            final float length = (float) FastMath.sqrtQuick(velocity.x * velocity.x + velocity.y * velocity.y + velocity.z * velocity.z);
            velocity.x /= -length;
            velocity.y /= -length;
            velocity.z /= -length;

            for (int i = 0; i < 15; ++i)
                MC.effectRenderer.addEffect(new ParticleBlood(MC.world, position.x, position.y, position.z, velocity.x * SCALE + RandomUtil.getRandomWithNegatives(SPREAD), velocity.y * SCALE + RandomUtil.getRandomWithNegatives(SPREAD), velocity.z * SCALE + RandomUtil.getRandomWithNegatives(SPREAD)));
        });

        return null;
    }
}
