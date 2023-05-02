package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class LightExposure extends UniversalObject implements Exposure {
    
    private long lastExposureTimestamp;
    private long maxDuration;
    private float totalDose = 1f;
    private float decayFactor = 0.995f;
    
    public LightExposure() {}
    
    
    public LightExposure(long lastExposureTimestamp, long maxDuration, float dose, float decayFactor) {
        this.lastExposureTimestamp = lastExposureTimestamp;
        this.maxDuration = maxDuration;
        this.totalDose = dose;
        this.decayFactor = decayFactor;
    }

    public float getTotalDose() {
        return totalDose;
    }
    
    public void setTotalDose(float totalDose) {
        this.totalDose = totalDose;
    }

    @Override
    public boolean isEffective(World world) {
//        System.out.println("Total dose: " + totalDose);
        return totalDose > 0.0003f && world.getTotalWorldTime() - lastExposureTimestamp <= maxDuration;
    }


    @Override
    public void update(Entity entity) {
        totalDose *= decayFactor;
    }
    
    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeLong(lastExposureTimestamp);
        buf.writeFloat(totalDose);
    }
    
    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        lastExposureTimestamp = buf.readLong();
        totalDose = buf.readFloat();
    }


    @Override
    public void updateFrom(Exposure otherExposure) {
        if(otherExposure instanceof LightExposure) {
            LightExposure other = (LightExposure)otherExposure;
            this.lastExposureTimestamp = other.lastExposureTimestamp;
            this.totalDose = other.totalDose;
        }
    }

    @Override
    public long getLastSyncTimestamp() {
        return 0;
    }


}
