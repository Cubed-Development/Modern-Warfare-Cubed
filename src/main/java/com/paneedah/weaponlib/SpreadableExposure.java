package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.*;
import java.util.function.Function;

public class SpreadableExposure extends UniversalObject implements Exposure {
    
    public interface Listener {
        void onUpdate(SpreadableExposure exposure);
    }
    
    private static final float MIN_EFFECTIVE_TOTAL_DOSE = 0.01f;

    public enum BlackoutPhase {NONE, ENTER, DARK, EXIT};
    
    public class Blackout {
        
        private long duration = 2000;
        private long enterDuration = 1000;
        private long exitDuration = 500;
        private long startTime;
        private long minIntervalBetweenBlackouts = 10000;
        private Random random = new Random();
        
        public float getProgress() {
            return MiscUtils.clamp((float)(System.currentTimeMillis() - startTime) / duration, 0f, 1f);
        }
        
        public float getEnterProgress() {
            return MiscUtils.clamp((float)(System.currentTimeMillis() - startTime) / enterDuration, 0f, 1f);
        }
        
        public float getExitProgress() {
            return MiscUtils.clamp((float)(System.currentTimeMillis() - (startTime + duration - exitDuration)) / exitDuration, 0f, 1f);
        }
        
        public BlackoutPhase getPhase() {
            long currentTime = System.currentTimeMillis();
            BlackoutPhase phase = BlackoutPhase.NONE;
            if(currentTime >= startTime && currentTime < startTime + enterDuration) {
                phase = BlackoutPhase.ENTER;
            } else if(currentTime >= startTime + enterDuration && currentTime < startTime + duration - exitDuration) {
                phase = BlackoutPhase.DARK;
            } else if(currentTime >= startTime + duration - exitDuration && currentTime < startTime + duration) {
                phase = BlackoutPhase.EXIT;
            }
            return phase;
        }
        
        public void update() {
            if(getPhase() != BlackoutPhase.NONE) {
                return;
            }
            if(totalDose > 0.7f && random.nextFloat() < totalDose * totalDose
                    && startTime + duration + minIntervalBetweenBlackouts < System.currentTimeMillis()) {
                startTime = System.currentTimeMillis();
                exitDuration = 300;
                duration = enterDuration + exitDuration + 500 + (long)(random.nextFloat() * totalDose * 2000L);
            }
        }
    }

    public static final int DEFAULT_IMPACT_DELAY = 5000;
    private static final float DEFAULT_DECAY_FACTOR = 0.999f;

    private long firstExposureTimestamp;
    private float totalDose;
    private float lastDose;
    private Map<UUID, Float> cycleDoseMap = new HashMap<>();
    private long firstExposureImpactDelay = DEFAULT_IMPACT_DELAY;
    
    private float decayFactor = DEFAULT_DECAY_FACTOR;
    
    private long startCycleTimestamp;
    private long lastSyncTimestamp;
    private long lastApplyTimestamp;
    private float entityImpactRate = 0.5f;
    private long cycleLengthMillis = 10; //500;
    private int tickCount;
    private Function<Float, Float> absorbFunction = dose -> dose * Math.min(0.2f, 0.2f / totalDose);
    
    private Blackout blackout = new Blackout();
    
    private Collection<Listener> listeners = new LinkedHashSet<>();
    
    private float colorImpairmentR = 1.2f;
    private float colorImpairmentG = 1.0f;
    private float colorImpairmentB = 0.8f;
    
    public SpreadableExposure() {
        this(DEFAULT_IMPACT_DELAY, 0L);
    }
    
    public SpreadableExposure(long firstExposureImpactDelay, long firstExposureTimestamp) {
        this.firstExposureImpactDelay = firstExposureImpactDelay;
        this.firstExposureTimestamp = firstExposureTimestamp;
    }
    
    public SpreadableExposure withColorImpairment(float r, float g, float b) {
        this.colorImpairmentR = r;
        this.colorImpairmentG = g;
        this.colorImpairmentB = b;
        return this;
    }
    
    public long getFirstExposureTimestamp() {
        return firstExposureTimestamp;
    }
    
    public float getTotalDose() {
        return totalDose;
    }
    
    public float getLastDose() {
        return lastDose;
    }
    
    public void addListener(Listener listener) {
        listeners.add(listener);
    }
    
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }
    
    /*
     * Spreadable can be applied to an entity only once per cycle
     */
    public void apply(Spreadable spreadable, Entity entity, float dose) {
        Float currentSourceDose = cycleDoseMap.get(spreadable.getId());
        if(currentSourceDose != null)
            return;

        //Proceed with updates only if the source was not applied in the current cycle
        cycleDoseMap.put(spreadable.getId(), dose);
        lastDose = 0f;
        cycleDoseMap.forEach((k, v) -> lastDose += v);

        Function<Float, Float> absorbFunction = null;
        if (entity instanceof EntityLivingBase) {
            ItemStack helmet = ((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.HEAD);;
            if (helmet != null && helmet.getItem() instanceof ExposureProtection)
                absorbFunction = ((ExposureProtection)helmet.getItem()).getAbsorbFunction(spreadable);
        }

        if(absorbFunction == null)
            absorbFunction = this.absorbFunction;

        Float absorbedDose = absorbFunction.apply(dose);
        this.totalDose += absorbedDose;
    }
    
    public void setLastSyncTimestamp(long lastSyncTimestamp) {
        this.lastSyncTimestamp = lastSyncTimestamp;
    }
    
    public long getLastSyncTimestamp() {
        return lastSyncTimestamp;
    }
    
    public void updateFrom(Exposure otherExposure) {
        if(!(otherExposure instanceof SpreadableExposure))
            return;

        SpreadableExposure other = (SpreadableExposure)otherExposure;
        this.firstExposureImpactDelay = other.firstExposureImpactDelay;
        this.firstExposureTimestamp = other.firstExposureTimestamp;
        this.totalDose = other.totalDose;
        this.lastDose = other.lastDose;
        this.colorImpairmentR = other.colorImpairmentR;
        this.colorImpairmentG = other.colorImpairmentG;
        this.colorImpairmentB = other.colorImpairmentB;
    }

    @Override
    public void init(ByteBuf buf) {
        super.init(buf);
        firstExposureImpactDelay = buf.readLong();
        firstExposureTimestamp = buf.readLong();
        totalDose = buf.readFloat();
        lastDose = buf.readFloat();
        colorImpairmentR = buf.readFloat();
        colorImpairmentG = buf.readFloat();
        colorImpairmentB = buf.readFloat();
    }
    
    @Override
    public void serialize(ByteBuf buf) {
        super.serialize(buf);
        buf.writeLong(firstExposureImpactDelay);
        buf.writeLong(firstExposureTimestamp);
        buf.writeFloat(totalDose);
        buf.writeFloat(lastDose);
        buf.writeFloat(colorImpairmentR);
        buf.writeFloat(colorImpairmentG);
        buf.writeFloat(colorImpairmentB);
    }

    public void update(Entity entity) {
        
//        if(entity instanceof EntityPlayer) {
//            System.out.println("Total dose for entity " + entity + ": " + totalDose);
//        }
        
//        if(System.currentTimeMillis() - startCycleTimestamp > cycleLengthMillis) {
//            startCycleTimestamp = System.currentTimeMillis();
//            cycleDoseMap.clear();
//        }
        
        long worldTime = entity.world.getTotalWorldTime();

        if(firstExposureTimestamp > worldTime)
            firstExposureTimestamp = worldTime;

        if(firstExposureImpactDelay >= 1000)
            firstExposureImpactDelay = 20;

        if(worldTime - startCycleTimestamp > cycleLengthMillis) {
            startCycleTimestamp = entity.world.getTotalWorldTime();
            cycleDoseMap.clear();
        }
        
//        boolean result = true;

        if (firstExposureTimestamp > 0) {
            if (firstExposureTimestamp + firstExposureImpactDelay < worldTime && entity instanceof EntityLivingBase) {
                EntityLivingBase entityLiving = (EntityLivingBase)entity;
                applyToEntity(entityLiving);
            }
            
            totalDose *= decayFactor;

            //System.out.println("Total dose: " + totalDose);
            //if(totalDose < 0.01f) {
            //    result = false;
            //}
        }
    }
    
    public void applyToEntity(EntityLivingBase entityLiving) {
        
        long worldTime = entityLiving.world.getTotalWorldTime();
        
        if(totalDose > MIN_EFFECTIVE_TOTAL_DOSE && worldTime - lastApplyTimestamp >= /*TODO: convert to world time? */20f / entityImpactRate) { 
            // TODO: configure min total dose, possibly per entity?
            //TODO: is it possible to control health per entity type?
            boolean isCreative = false;
            if(entityLiving instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) entityLiving;
                isCreative= player.capabilities.isCreativeMode;
            }

            if(!isCreative) {
                if(entityLiving instanceof EntityPlayer) {
                    entityLiving.setHealth(entityLiving.getHealth() - totalDose);
                    return;
                }

                entityLiving.attackEntityFrom(new DamageSource("thrown"), totalDose);
            }
            
            lastApplyTimestamp = worldTime;
        }
    }

    /**
    public void nextCycle() {
        startCycleTimestamp = System.currentTimeMillis();
        cycleDoseMap.clear();
    }
     */
    
    public void incrementTickCount() {
        tickCount++;
    }
    
    public int getTickCount() {
        return tickCount;
    }
    
    public Blackout getBlackout() {
        return blackout;
    }

    public boolean isEffective(World world) {
        return getLastDose() > 0f || getTotalDose() > MIN_EFFECTIVE_TOTAL_DOSE;
    }
    
    public float getColorImpairmentR() {
        return colorImpairmentR;
    }
    
    public float getColorImpairmentG() {
        return colorImpairmentG;
    }
    
    public float getColorImpairmentB() {
        return colorImpairmentB;
    }
}
