package com.paneedah.weaponlib;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

import java.util.ArrayList;
import java.util.List;

public class ExplosionMessage implements IMessage {

    private double posX;
    private double posY;
    private double posZ;
    private float strength;
    private List<BlockPos> affectedBlockPositions;
    private float motionX;
    private float motionY;
    private float motionZ;
    private boolean isDestroyingBlocks;
    private float explosionParticleAgeCoefficient;
    private float smokeParticleAgeCoefficient;
    private float explosionParticleScaleCoefficient;
    private float smokeParticleScaleCoefficient;
    private int explosionParticleTextureId;
    private int smokeParticleTextureId;

    public ExplosionMessage() {
    }

    public ExplosionMessage(double xIn, double yIn, double zIn, float strengthIn, boolean isDestroyingBlocks, List<BlockPos> affectedBlockPositionsIn, Vector3D motion, float explosionParticleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, int explosionParticleTextureId, int smokeParticleTextureId) {
        this.posX = xIn;
        this.posY = yIn;
        this.posZ = zIn;
        this.strength = strengthIn;
        this.isDestroyingBlocks = isDestroyingBlocks;
        this.affectedBlockPositions = Lists.newArrayList(affectedBlockPositionsIn);
        this.explosionParticleAgeCoefficient = explosionParticleAgeCoefficient;
        this.smokeParticleAgeCoefficient = smokeParticleAgeCoefficient;
        this.explosionParticleScaleCoefficient = explosionParticleScaleCoefficient;
        this.smokeParticleScaleCoefficient = smokeParticleScaleCoefficient;
        this.explosionParticleTextureId = explosionParticleTextureId;
        this.smokeParticleTextureId = smokeParticleTextureId;

        if (motion != null) {
            this.motionX = (float) motion.x;
            this.motionY = (float) motion.y;
            this.motionZ = (float) motion.z;
        }
    }

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public double getPosZ() {
        return posZ;
    }

    public float getMotionX() {
        return motionX;
    }

    public float getMotionY() {
        return motionY;
    }

    public float getMotionZ() {
        return motionZ;
    }

    public float getStrength() {
        return strength;
    }
    
    public boolean isDestroyingBlocks() {
        return isDestroyingBlocks;
    }

    public List<BlockPos> getAffectedBlockPositions() {
        return affectedBlockPositions;
    }
    
    public float getExplosionParticleAgeCoefficient() {
        return explosionParticleAgeCoefficient;
    }
    
    public float getSmokeParticleAgeCoefficient() {
        return smokeParticleAgeCoefficient;
    }

    public float getExplosionParticleScaleCoefficient() {
        return explosionParticleScaleCoefficient;
    }
    
    public float getSmokeParticleScaleCoefficient() {
        return smokeParticleScaleCoefficient;
    }
    
    public int getExplosionParticleTextureId() {
        return explosionParticleTextureId;
    }
    
    public int getSmokeParticleTextureId() {
        return smokeParticleTextureId;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.posX = (double) buf.readFloat();
        this.posY = (double) buf.readFloat();
        this.posZ = (double) buf.readFloat();
        this.strength = buf.readFloat();
        this.explosionParticleAgeCoefficient = buf.readFloat();
        this.smokeParticleAgeCoefficient = buf.readFloat();
        this.explosionParticleScaleCoefficient = buf.readFloat();
        this.smokeParticleScaleCoefficient = buf.readFloat();
        this.explosionParticleTextureId = buf.readInt();
        this.smokeParticleTextureId = buf.readInt();
        this.isDestroyingBlocks = buf.readBoolean(); 
        int i = buf.readInt();
        this.affectedBlockPositions = new ArrayList<>(i);
        int j = (int) this.posX;
        int k = (int) this.posY;
        int l = (int) this.posZ;

        for (int i1 = 0; i1 < i; ++i1) {
            int j1 = buf.readByte() + j;
            int k1 = buf.readByte() + k;
            int l1 = buf.readByte() + l;
            this.affectedBlockPositions.add(new BlockPos(j1, k1, l1));
        }

        this.motionX = buf.readFloat();
        this.motionY = buf.readFloat();
        this.motionZ = buf.readFloat();
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeFloat((float) this.posX);
        buf.writeFloat((float) this.posY);
        buf.writeFloat((float) this.posZ);
        buf.writeFloat(this.strength);
        buf.writeFloat(this.explosionParticleAgeCoefficient);
        buf.writeFloat(this.smokeParticleAgeCoefficient);
        buf.writeFloat(this.explosionParticleScaleCoefficient);
        buf.writeFloat(this.smokeParticleScaleCoefficient);
        buf.writeInt(this.explosionParticleTextureId);
        buf.writeInt(this.smokeParticleTextureId);
        buf.writeBoolean(this.isDestroyingBlocks);
        buf.writeInt(this.affectedBlockPositions.size());
        int i = (int) this.posX;
        int j = (int) this.posY;
        int k = (int) this.posZ;

        for (BlockPos blockpos : this.affectedBlockPositions) {
            int l = blockpos.getX() - i;
            int i1 = blockpos.getY() - j;
            int j1 = blockpos.getZ() - k;
            buf.writeByte(l);
            buf.writeByte(i1);
            buf.writeByte(j1);
        }

        buf.writeFloat(this.motionX);
        buf.writeFloat(this.motionY);
        buf.writeFloat(this.motionZ);
    }
}
