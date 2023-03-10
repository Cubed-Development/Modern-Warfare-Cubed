package com.paneedah.weaponlib;

import com.google.common.collect.Lists;
import com.paneedah.weaponlib.compatibility.CompatibleBlockPos;
import com.paneedah.weaponlib.compatibility.CompatibleMessage;
import com.paneedah.weaponlib.compatibility.CompatibleVec3;
import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.List;

public class ExplosionMessage implements CompatibleMessage {

    private double posX;
    private double posY;
    private double posZ;
    private float strength;
    private List<CompatibleBlockPos> affectedBlockPositions;
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

    public ExplosionMessage(double xIn, double yIn, double zIn, float strengthIn, boolean isDestroyingBlocks,
            List<CompatibleBlockPos> affectedBlockPositionsIn, CompatibleVec3 motion, float explosionParticleAgeCoefficient,
            float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient,
            int explosionParticleTextureId, int smokeParticleTextureId) {
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
            this.motionX = (float) motion.getXCoord();
            this.motionY = (float) motion.getYCoord();
            this.motionZ = (float) motion.getZCoord();
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

    public List<CompatibleBlockPos> getAffectedBlockPositions() {
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
            this.affectedBlockPositions.add(new CompatibleBlockPos(j1, k1, l1));
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

        for (CompatibleBlockPos blockpos : this.affectedBlockPositions) {
            int l = blockpos.getBlockPosX() - i;
            int i1 = blockpos.getBlockPosY() - j;
            int j1 = blockpos.getBlockPosZ() - k;
            buf.writeByte(l);
            buf.writeByte(i1);
            buf.writeByte(j1);
        }

        buf.writeFloat(this.motionX);
        buf.writeFloat(this.motionY);
        buf.writeFloat(this.motionZ);
    }
}
