package com.paneedah.weaponlib.particle.vehicle;

import net.minecraft.client.particle.ParticleFootStep;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.ProjectConstants.ID;

public class TireTracks extends ParticleFootStep {

    private static final ResourceLocation NORMAL_TRACK = new ResourceLocation(ID + ":textures/particle/tiretracknormal.png");
    public int footstepAge;
    public int footstepMaxAge;
    public TextureManager currentFootStepsIn;
    public double angle;

    public TireTracks(TextureManager currentFootStepsIn, World worldIn, double xCoordIn, double yCoordIn,
                      double zCoordIn, double angle) {
        super(currentFootStepsIn, worldIn, xCoordIn, yCoordIn, zCoordIn);
        footstepMaxAge = 100000000;
        particleMaxAge = 100000000;
        this.currentFootStepsIn = currentFootStepsIn;
        this.angle = angle;
        // TODO Auto-generated constructor stub
    }


    @Override
    public void renderParticle(BufferBuilder buffer, Entity vehicle, float partialTicks, float rotationX,
                               float rotationZ, float rotationYZ, float rotationXY, float rotationXZ) {
        float f = ((float) footstepAge + partialTicks) / (float) footstepMaxAge;
        f = f * f;
        float f1 = 2.0F - f * 2.0F;

        if (f1 > 1.0F) {
            f1 = 1.0F;
        }

        f1 = f1 * 0.4F;


        GlStateManager.disableLighting();
        GL11.glPushMatrix();
        float a = 0.325f;


        GL11.glTranslated((posX - interpPosX), (posY - interpPosY), (posZ - interpPosZ));
        GL11.glRotated(angle, 0.0f, 1.0f, 0.0f);
        float f2 = 0.125F;


        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;

        float f6 = world.getLightBrightness(new BlockPos(posX, posY, posZ));
        currentFootStepsIn.bindTexture(NORMAL_TRACK);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        buffer.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
        buffer.pos(f3 - a, f4, f5 + a).tex(0.0D, 1.0D).color(f6, f6, f6, f1).endVertex();
        buffer.pos(f3 + a, f4, f5 + a).tex(1.0D, 1.0D).color(f6, f6, f6, f1).endVertex();
        buffer.pos(f3 + a, f4, f5 - a).tex(1.0D, 0.0D).color(f6, f6, f6, f1).endVertex();
        buffer.pos(f3 - a, f4, f5 - a).tex(0.0D, 0.0D).color(f6, f6, f6, f1).endVertex();
        Tessellator.getInstance().draw();
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GL11.glPopMatrix();
    }

    @Override
    public void onUpdate() {
        // TODO Auto-generated method stub
        super.onUpdate();
    }

}
