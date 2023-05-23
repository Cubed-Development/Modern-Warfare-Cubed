package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ExplosionMessageHandler implements CompatibleMessageHandler<ExplosionMessage, IMessage> {

    private ModContext modContext;

	public ExplosionMessageHandler() {
	}

	public ExplosionMessageHandler(ModContext modContext) {
	    this.modContext = modContext;
	}

	@Override
	public <T extends net.minecraftforge.fml.common.network.simpleimpl.IMessage> T onCompatibleMessage(ExplosionMessage message, MessageContext messageContext) {
		if(messageContext.side == Side.CLIENT) {
			EntityPlayer player = mc.player;
			compatibility.runInMainClientThread(() -> {
                Explosion explosion = new Explosion(modContext,
						player.world,
                        (Entity)null,
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

		}

		return null;
	}

}
