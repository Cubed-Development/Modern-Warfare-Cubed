package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.particle.ParticleManager;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class CompatibleParticleManager {
   
    private ParticleManager effectRenderer;

    public CompatibleParticleManager(WorldClient world) {
        this.effectRenderer = new ParticleManager(world, mc.getTextureManager());
    }
    
    public CompatibleParticleManager(ParticleManager effectRenderer) {
        this.effectRenderer = effectRenderer;
    }

    public ParticleManager getParticleManager() {
        return effectRenderer;
    }

}
