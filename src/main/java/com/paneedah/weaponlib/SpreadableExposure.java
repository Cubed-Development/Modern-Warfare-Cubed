package com.paneedah.weaponlib;

import com.paneedah.mwc.network.UniversalObject;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.Setter;
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

    public enum BlackoutPhase {NONE, ENTER, DARK, EXIT}

    public class Blackout {

        private long duration = 2000;
        private final long enterDuration = 1000;
        private long exitDuration = 500;
        private long startTime;
        private final Random random = new Random();

        public float getProgress() {
            return MiscUtils.clamp((float) (System.currentTimeMillis() - startTime) / duration, 0f, 1f);
        }

        public float getEnterProgress() {
            return MiscUtils.clamp((float) (System.currentTimeMillis() - startTime) / enterDuration, 0f, 1f);
        }

        public float getExitProgress() {
            return MiscUtils.clamp((float) (System.currentTimeMillis() - (startTime + duration - exitDuration)) / exitDuration, 0f, 1f);
        }

        public BlackoutPhase getPhase() {
            long currentTime = System.currentTimeMillis();
            BlackoutPhase phase = BlackoutPhase.NONE;
            if (currentTime >= startTime && currentTime < startTime + enterDuration) {
                phase = BlackoutPhase.ENTER;
            } else if (currentTime >= startTime + enterDuration && currentTime < startTime + duration - exitDuration) {
                phase = BlackoutPhase.DARK;
            } else if (currentTime >= startTime + duration - exitDuration && currentTime < startTime + duration) {
                phase = BlackoutPhase.EXIT;
            }
            return phase;
        }

        public void update() {
            if (getPhase() != BlackoutPhase.NONE) {
                return;
            }
            long minIntervalBetweenBlackouts = 10000;
            if (totalDose > 0.7f && random.nextFloat() < totalDose * totalDose
                    && startTime + duration + minIntervalBetweenBlackouts < System.currentTimeMillis()) {
                startTime = System.currentTimeMillis();
                exitDuration = 300;
                duration = enterDuration + exitDuration + 500 + (long) (random.nextFloat() * totalDose * 2000L);
            }
        }
    }

    public static final int DEFAULT_IMPACT_DELAY = 5000;
    private static final float DEFAULT_DECAY_FACTOR = 0.999f;

    @Getter
    private long firstExposureTimestamp;
    @Getter
    private float totalDose;
    @Getter
    private float lastDose;
    private final Map<UUID, Float> cycleDoseMap = new HashMap<>();
    private long firstExposureImpactDelay;

    private long startCycleTimestamp;
    @Getter
    @Setter
    private long lastSyncTimestamp;
    private long lastApplyTimestamp;
    @Getter
    private int tickCount;
    private final Function<Float, Float> absorbFunction = dose -> Float.valueOf(dose.floatValue() * Math.min(0.2f, 0.2f / totalDose));

    @Getter
    private final Blackout blackout = new Blackout();

    private final Collection<Listener> listeners = new LinkedHashSet<>();

    @Getter
    private float colorImpairmentR = 1.2f;
    @Getter
    private float colorImpairmentG = 1.0f;
    @Getter
    private float colorImpairmentB = 0.8f;

    public SpreadableExposure() {
        this(DEFAULT_IMPACT_DELAY, 0L);
    }

    public SpreadableExposure(long firstExposureImpactDelay, long firstExposureTimestamp) {
        this.firstExposureImpactDelay = firstExposureImpactDelay;
        this.firstExposureTimestamp = firstExposureTimestamp;
    }

    public SpreadableExposure withColorImpairment(float r, float g, float b) {
        colorImpairmentR = r;
        colorImpairmentG = g;
        colorImpairmentB = b;
        return this;
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
        if (currentSourceDose != null) {
            return;
        }

        //Proceed with updates only if the source was not applied in the current cycle
        cycleDoseMap.put(spreadable.getId(), Float.valueOf(dose));
        lastDose = 0f;
        cycleDoseMap.forEach((k, v) -> lastDose += v.floatValue());

        Function<Float, Float> absorbFunction = null;
        if (entity instanceof EntityLivingBase) {
            ItemStack helmet = ((EntityLivingBase) entity).getItemStackFromSlot(EntityEquipmentSlot.HEAD);
            if (helmet != null && helmet.getItem() instanceof ExposureProtection) {
                absorbFunction = ((ExposureProtection) helmet.getItem()).getAbsorbFunction(spreadable);
            }
        }

        if (absorbFunction == null) {
            absorbFunction = this.absorbFunction;
        }

        Float absorbedDose = absorbFunction.apply(Float.valueOf(dose));
        totalDose += absorbedDose.floatValue();
    }

    public void updateFrom(Exposure otherExposure) {
        if (!(otherExposure instanceof SpreadableExposure)) {
            return;
        }

        SpreadableExposure other = (SpreadableExposure) otherExposure;
        firstExposureImpactDelay = other.firstExposureImpactDelay;
        firstExposureTimestamp = other.firstExposureTimestamp;
        totalDose = other.totalDose;
        lastDose = other.lastDose;
        colorImpairmentR = other.colorImpairmentR;
        colorImpairmentG = other.colorImpairmentG;
        colorImpairmentB = other.colorImpairmentB;
    }

    @Override
    public void read(ByteBuf byteBuf) {
        super.read(byteBuf);
        firstExposureImpactDelay = byteBuf.readLong();
        firstExposureTimestamp = byteBuf.readLong();
        totalDose = byteBuf.readFloat();
        lastDose = byteBuf.readFloat();
        colorImpairmentR = byteBuf.readFloat();
        colorImpairmentG = byteBuf.readFloat();
        colorImpairmentB = byteBuf.readFloat();
    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);
        byteBuf.writeLong(firstExposureImpactDelay);
        byteBuf.writeLong(firstExposureTimestamp);
        byteBuf.writeFloat(totalDose);
        byteBuf.writeFloat(lastDose);
        byteBuf.writeFloat(colorImpairmentR);
        byteBuf.writeFloat(colorImpairmentG);
        byteBuf.writeFloat(colorImpairmentB);
    }

    public void update(Entity entity) {

        long worldTime = entity.world.getTotalWorldTime();

        if (firstExposureTimestamp > worldTime) {
            firstExposureTimestamp = worldTime;
        }

        if (firstExposureImpactDelay >= 1000) {
            firstExposureImpactDelay = 20;
        }

        //500;
        long cycleLengthMillis = 10;
        if (worldTime - startCycleTimestamp > cycleLengthMillis) {
            startCycleTimestamp = entity.world.getTotalWorldTime();
            cycleDoseMap.clear();
        }

//        boolean result = true;

        if (firstExposureTimestamp > 0) {
            if (firstExposureTimestamp + firstExposureImpactDelay < worldTime && entity instanceof EntityLivingBase) {
                EntityLivingBase entityLiving = (EntityLivingBase) entity;
                applyToEntity(entityLiving);
            }

            totalDose *= DEFAULT_DECAY_FACTOR;

        }
    }

    public void applyToEntity(EntityLivingBase entityLiving) {

        long worldTime = entityLiving.world.getTotalWorldTime();

        float entityImpactRate = 0.5f;
        if (totalDose > MIN_EFFECTIVE_TOTAL_DOSE && worldTime - lastApplyTimestamp >= /*TODO: convert to world time? */20f / entityImpactRate) {
            // TODO: configure min total dose, possibly per entity?
            //TODO: is it possible to control health per entity type?
            boolean isCreative = false;
            if (entityLiving instanceof EntityPlayer) {
                EntityPlayer player = (EntityPlayer) entityLiving;
                isCreative = player.capabilities.isCreativeMode;
            }

            if (!isCreative) {
                if (entityLiving instanceof EntityPlayer) {
                    entityLiving.setHealth(entityLiving.getHealth() - totalDose);
                    return;
                }

                entityLiving.attackEntityFrom(new DamageSource("thrown"), totalDose);
            }

            lastApplyTimestamp = worldTime;
        }
    }

    /**
     * public void nextCycle() {
     * startCycleTimestamp = System.currentTimeMillis();
     * cycleDoseMap.clear();
     * }
     */

    public void incrementTickCount() {
        tickCount++;
    }

    public boolean isEffective(World world) {
        return getLastDose() > 0f || getTotalDose() > MIN_EFFECTIVE_TOTAL_DOSE;
    }

}
