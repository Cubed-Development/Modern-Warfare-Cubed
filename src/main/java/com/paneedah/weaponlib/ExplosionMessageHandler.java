package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleMessageContext;
import com.paneedah.weaponlib.compatibility.CompatibleMessageHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class ExplosionMessageHandler implements CompatibleMessageHandler<ExplosionMessage, CompatibleMessage> {

    private ModContext modContext;

	public ExplosionMessageHandler(ModContext modContext) {
	    this.modContext = modContext;
	}

	@Override
	public <T extends CompatibleMessage> T onCompatibleMessage(ExplosionMessage message, CompatibleMessageContext ctx) {
		if(!ctx.isServerSide()) {
			EntityPlayer player = compatibility.clientPlayer();
			compatibility.runInMainClientThread(() -> {
                Explosion explosion = new Explosion(modContext,
                        compatibility.world(player),
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
