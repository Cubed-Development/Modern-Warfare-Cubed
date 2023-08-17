package com.paneedah.mwc.rendering.renderer;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * "Quick & Dirty" particle renderer, means to be replaced with the Fancier Block Particles api.
 * <p>
 * Mainly created because having this is already heaps better than the VMW way of rendering particles.
 */
@SideOnly(Side.CLIENT)
public class ParticleRenderer {

    public static void renderParticle(final BufferBuilder buffer, final float x, final float y, final float z, final int skyLight, final int blockLight, final float u, final float v, float r, float g, float b, float a) {
        buffer.pos(x, y, z);
        buffer.tex(u, v);

        buffer.color(r, g, b, a);

        buffer.lightmap(skyLight, blockLight);

        buffer.endVertex();
    }
}
