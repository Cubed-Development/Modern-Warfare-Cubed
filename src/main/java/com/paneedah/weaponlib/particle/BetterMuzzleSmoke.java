package com.paneedah.weaponlib.particle;

import com.paneedah.mwc.renderer.ParticleRenderer;
import com.paneedah.weaponlib.particle.vehicle.TurbulentSmokeParticle;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.ProjectConstants.ID;

public class BetterMuzzleSmoke extends TurbulentSmokeParticle {

    public static final ResourceLocation SMOKE1 = new ResourceLocation(ID + ":textures/smokes/smokesheet.png");
    public static final ResourceLocation SMOKE2 = new ResourceLocation(ID + ":textures/smokes/smokes2.png");

    public int ran;

    public BetterMuzzleSmoke(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double p_i1221_8_, double p_i1221_10_, double p_i1221_12_, int indexY) {
        super(worldIn, xCoordIn, yCoordIn, zCoordIn, p_i1221_8_, p_i1221_10_, p_i1221_12_, indexY);

        particleMaxAge = (int) (6 + (4 * Math.random()));
        double sub = 5;
        motionX = (Math.random() - 0.5) / sub;
        motionY = (Math.random() - 0.5) / (sub * 3);
        motionZ = (Math.random() - 0.5) / sub;

        ran = (int) (2 * Math.random());
        particleScale = 2.5f;

        particleAngle = (float) (Math.random() * 2 * Math.PI);
        prevParticleAngle = particleAngle;

        motionX = 0;
        motionY = 0;
        motionZ = 0;
    }

    @Override
    public void renderParticle(BufferBuilder buffer, Entity entityIn, float partialTicks, float rotationX, float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        Random urandom = new Random(333);
        particleAlpha = 1.0f - ((particleAge / (float) particleMaxAge));
        //this.particleScale = (float) ((((this.particleAge/(float) this.particleMaxAge))/2.0)+2.0f);

        particleRed = particleGreen = particleBlue = urandom.nextFloat() * 0.5F + 0.4F;

        int brightness = getBrightnessForRender(partialTicks);
        int skyLight = brightness >> 16 & 65535;
        int blockLight = brightness & 65535;

        float scale = particleScale;
        float x = (float) (prevPosX + (posX - prevPosX) * (double) partialTicks - interpPosX);
        float y = (float) (prevPosY + (posY - prevPosY) * (double) partialTicks - interpPosY);
        float z = (float) (prevPosZ + (posZ - prevPosZ) * (double) partialTicks - interpPosZ);

        int index = MathHelper.clamp((int) (((particleAge + partialTicks) / (float) particleMaxAge) * 16), 0, 15);
        float size = 1 / 4F;
        float minX = (index % 4) * size;
        float minY = ((float) index / 4) * size;
        double u = 1 / 4.0;
        double v = 1 / 4.0;

        if (ran == 0) {
            MC.getTextureManager().bindTexture(SMOKE1);
        } else {
            MC.getTextureManager().bindTexture(SMOKE2);
        }
        //GlStateManager.enableBlend();

        MC.getTextureManager().bindTexture(new ResourceLocation(ID + ":textures/smokes/smoke4.png"));
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MIN_FILTER, GL11.GL_LINEAR);
        GL11.glTexParameteri(GL11.GL_TEXTURE_2D, GL11.GL_TEXTURE_MAG_FILTER, GL11.GL_LINEAR);

        Vec3d[] avec3d = new Vec3d[]{new Vec3d(-rotationX * scale - rotationXY * scale, -rotationZ * scale, -rotationYZ * scale - rotationXZ * scale), new Vec3d(-rotationX * scale + rotationXY * scale, rotationZ * scale, -rotationYZ * scale + rotationXZ * scale), new Vec3d(rotationX * scale + rotationXY * scale, rotationZ * scale, rotationYZ * scale + rotationXZ * scale), new Vec3d(rotationX * scale - rotationXY * scale, -rotationZ * scale, rotationYZ * scale - rotationXZ * scale)};

        if (particleAngle != 0.0F) {
            float f8 = particleAngle + (particleAngle - prevParticleAngle) * partialTicks;
            float f9 = MathHelper.cos(f8 * 0.5F);
            float f10 = MathHelper.sin(f8 * 0.5F) * (float) cameraViewDir.x;
            float f11 = MathHelper.sin(f8 * 0.5F) * (float) cameraViewDir.y;
            float f12 = MathHelper.sin(f8 * 0.5F) * (float) cameraViewDir.z;
            Vec3d vec3d = new Vec3d(f10, f11, f12);

            for (int n = 0; n < 4; ++n) {
                avec3d[n] = vec3d.scale(2.0D * avec3d[n].dotProduct(vec3d)).add(avec3d[n].scale((double) (f9 * f9) - vec3d.dotProduct(vec3d))).add(vec3d.crossProduct(avec3d[n]).scale(2.0F * f9));
            }
        }

        ParticleRenderer.renderParticle(buffer, (float) (x + avec3d[0].x), (float) (y + avec3d[0].y), (float) (z + avec3d[0].z), skyLight, blockLight, (float) (minX + u), (float) (minY + v), particleRed, particleGreen, particleBlue, particleAlpha);
        ParticleRenderer.renderParticle(buffer, (float) (x + avec3d[1].x), (float) (y + avec3d[1].y), (float) (z + avec3d[1].z), skyLight, blockLight, (float) (minX + u), minY, particleRed, particleGreen, particleBlue, particleAlpha);
        ParticleRenderer.renderParticle(buffer, (float) (x + avec3d[2].x), (float) (y + avec3d[2].y), (float) (z + avec3d[2].z), skyLight, blockLight, minX, minY, particleRed, particleGreen, particleBlue, particleAlpha);
        ParticleRenderer.renderParticle(buffer, (float) (x + avec3d[3].x), (float) (y + avec3d[3].y), (float) (z + avec3d[3].z), skyLight, blockLight, minX, (float) (minY + v), particleRed, particleGreen, particleBlue, particleAlpha);
    }

    @Override
    public void onUpdate() {
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;

        if (particleAge++ >= particleMaxAge) {
            setExpired();
        }

        particleTextureIndexX = particleAge * 7 / particleMaxAge;

        move(motionX, motionY, motionZ);

        motionX *= 0.9599999785423279D;
        motionY *= 0.9499999785423279D;
        motionZ *= 0.9599999785423279D;

        if (onGround) {
            setExpired();
            motionX *= 0.699999988079071D;
            motionZ *= 0.699999988079071D;
        }
    }
}
