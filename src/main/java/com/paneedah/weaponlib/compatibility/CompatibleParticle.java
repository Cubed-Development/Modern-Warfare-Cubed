package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.ModContext;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleBreaking;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public abstract class CompatibleParticle extends Particle {


    public static class CompatibleParticleBreaking extends ParticleBreaking {

        public static final String TEXTURE_BLOOD_PARTICLES = "particle/blood";

        protected CompatibleParticleBreaking(ModContext modContext, World worldIn, double posXIn, double posYIn, double posZIn) {
            super(worldIn, posXIn, posYIn, posZIn, Items.SNOWBALL);
            TextureAtlasSprite sprite = mc.getTextureMapBlocks().getAtlasSprite(
                    modContext.getNamedResource(TEXTURE_BLOOD_PARTICLES).toString());
            setParticleTexture(sprite);  // initialise the icon to our custom texture
        }
    }

    public static CompatibleParticleBreaking createParticleBreaking(ModContext modContext, World worldIn, double posXIn, double posYIn, double posZIn) {
        return new CompatibleParticleBreaking(modContext, worldIn, posXIn, posYIn, posZIn);
    }

	public CompatibleParticle(World par1World, double positionX, double positionY, double positionZ,
			double motionX, double motionY, double motionZ)
	{
		super(par1World, positionX, positionY, positionZ, motionX, motionY, motionZ);
	}

	protected boolean isCollided() {
		return this.isExpired;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void renderParticle(BufferBuilder worldRendererIn, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
		renderParticle(Tessellator.getInstance(), partialTicks, rotationX, rotationZ, rotationYZ, rotationXY, rotationXZ);
	}

	public abstract void renderParticle(Tessellator tessellator, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ);
}
