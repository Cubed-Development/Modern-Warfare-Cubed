package com.paneedah.weaponlib.particle;

import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class SpawnParticleMessage implements IMessage {

    public enum ParticleType { BLOOD(false), SHELL(false), SMOKE_GRENADE_SMOKE(true), SMOKE_GRENADE_YELLOW_SMOKE(true);
        
        private boolean isSmokeParticle;
        private ParticleType(boolean isSmokeParticle) {
            this.isSmokeParticle = isSmokeParticle;
        }
    }

    private double posX;
    private double posY;
    private double posZ;
    private double motionX;
    private double motionY;
    private double motionZ;
    private int count;
    private ParticleType particleType;

    public SpawnParticleMessage() {}

    public SpawnParticleMessage(ParticleType particleType, int count, double posX, double posY, double posZ) {
        this.particleType = particleType;
        this.count = count;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
    }

    public SpawnParticleMessage(ParticleType particleType, int count, double posX, double posY, double posZ,
            double motionX, double motionY, double motionZ) {
        this.particleType = particleType;
        this.count = count;
        this.posX = posX;
        this.posY = posY;
        this.posZ = posZ;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
    }

    public void fromBytes(ByteBuf buf) {
        particleType = ParticleType.values()[buf.readInt()];
        count = buf.readInt();
        posX = buf.readDouble();
        posY = buf.readDouble();
        posZ = buf.readDouble();
        if(particleType.isSmokeParticle) {
            motionX = buf.readDouble();
            motionY = buf.readDouble();
            motionZ = buf.readDouble();
        }
    }

    public void toBytes(ByteBuf buf) {
        buf.writeInt(particleType.ordinal());
        buf.writeInt(count);
        buf.writeDouble(posX);
        buf.writeDouble(posY);
        buf.writeDouble(posZ);
        if(particleType.isSmokeParticle) {
            buf.writeDouble(motionX);
            buf.writeDouble(motionY);
            buf.writeDouble(motionZ);
        }
    }

    public ParticleType getParticleType() {
        return particleType;
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

    public int getCount() {
        return count;
    }

    public double getMotionX() {
        return motionX;
    }

    public double getMotionY() {
       return motionY;
    }

    public double getMotionZ() {
        return motionZ;
    }
}
