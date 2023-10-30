package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.particle.ParticleManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.world.World;

public class MWCParticleManager extends ParticleManager {

    public MWCParticleManager(World worldIn, TextureManager rendererIn) {
        super(worldIn, rendererIn);
    }
}
