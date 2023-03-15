package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.world.World;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class MWCParticleManager extends ParticleManager {

    private static MWCParticleManager mwcParticleManager = new MWCParticleManager(mc.player.world, mc.getTextureManager());

    public MWCParticleManager(World worldIn, TextureManager rendererIn) {
        super(worldIn, rendererIn);
    }

    public static MWCParticleManager getParticleManager() {
        return mwcParticleManager;
    }
}
