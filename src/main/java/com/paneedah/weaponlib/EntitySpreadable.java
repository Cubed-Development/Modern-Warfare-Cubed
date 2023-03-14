package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.paneedah.weaponlib.compatibility.CompatibleBlockPos;
import com.paneedah.weaponlib.compatibility.CompatibleBlockState;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.*;
import java.util.Map.Entry;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntitySpreadable extends Entity implements Contextual, Spreadable {
    
    private static final String TAG_SPREAD_MAP = "spreadMap";
    
    private static final float DEFAULT_CONCENTRATION_SPREAD_FACTOR = 0.8f;
    private static final float DEFAULT_MIN_CONCENTRATION_THRESHOLD = 0.01f;
    private static final float DEFAULT_SPREAD_RATE = 0.5f; // 0.2 blocks per second, or one block in 4 seconds
    
//    private static final float DEFAULT_ENTITY_UPDATE_RATE = 2f; // 2 times per secondw

    private static final float DEFAULT_CONCENTRATION_DECAY_FACTOR = 0.99f; // 
    
    private final Map<CompatibleBlockPos, Float> spreadMap = new HashMap<>();
    private List<CompatibleBlockPos> currentSpread;
    
    /*
     * For each entity a separate update timestamp is maintained;
     * this is required for timely entity updates in case if an entity decides to run through a spread zone
     */
    //private Map<UUID, Long> entityUpdateTimestamps = new HashMap<>();
    
    private final float initialConcentration = 1f;
    
    private float concentrationSpreadUpFactor = DEFAULT_CONCENTRATION_SPREAD_FACTOR;
    private float concentrationSpreadDownFactor = DEFAULT_CONCENTRATION_SPREAD_FACTOR;
    private float concentrationSpreadSideFactor = DEFAULT_CONCENTRATION_SPREAD_FACTOR;
    private float minConcentrationThreshold = DEFAULT_MIN_CONCENTRATION_THRESHOLD;
    
    private CompatibleAxisAlignedBB spreadBox;
    
    private float spreadRate = DEFAULT_SPREAD_RATE;
    
//    private float entityUpdateRate = DEFAULT_ENTITY_UPDATE_RATE;
    
    private long lastSpreadTimestamp;
    
    private float concentrationDecayAdjustment = 1.0f;
    
    private float concentrationDecayFactor = DEFAULT_CONCENTRATION_DECAY_FACTOR;

    public EntitySpreadable(World worldIn) {
        super(worldIn);
    }
    
    EntitySpreadable setConcentrationSpreadUpFactor(float concentrationSpreadUpFactor) {
        this.concentrationSpreadUpFactor = concentrationSpreadUpFactor;
        return this;
    }

    EntitySpreadable setConcentrationSpreadDownFactor(float concentrationSpreadDownFactor) {
        this.concentrationSpreadDownFactor = concentrationSpreadDownFactor;
        return this;
    }

    EntitySpreadable setConcentrationSpreadSideFactor(float concentrationSpreadSideFactor) {
        this.concentrationSpreadSideFactor = concentrationSpreadSideFactor;
        return this;
    }

    EntitySpreadable setMinConcentrationThreshold(float minConcentrationThreshold) {
        this.minConcentrationThreshold = minConcentrationThreshold;
        return this;
    }

    EntitySpreadable setSpreadRate(float spreadRate) {
        this.spreadRate = spreadRate;
        return this;
    }

    EntitySpreadable setConcentrationDecayFactor(float concentrationDecayFactor) {
        this.concentrationDecayFactor = concentrationDecayFactor;
        return this;
    }

    @Override
    protected void entityInit() {}

    private void initSpreadBox() {
        double spreadUpDistance = Math.log10(minConcentrationThreshold / initialConcentration) / Math.log10(concentrationSpreadUpFactor) + 1;
        double spreadDownDistance = Math.log10(minConcentrationThreshold / initialConcentration) / Math.log10(concentrationSpreadDownFactor) + 1;
        double spreadSideDistance = Math.log10(minConcentrationThreshold / initialConcentration) / Math.log10(concentrationSpreadSideFactor) + 1;
        spreadBox = new CompatibleAxisAlignedBB(posX - spreadSideDistance, posY - spreadDownDistance, posZ - spreadSideDistance, posX + spreadSideDistance, posY + spreadUpDistance, posZ + spreadSideDistance);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        byte[] bytes = compound.getByteArray(TAG_SPREAD_MAP);
        ByteBuf buf = Unpooled.wrappedBuffer(bytes);
        
        concentrationSpreadUpFactor = buf.readFloat();
        concentrationSpreadDownFactor = buf.readFloat();
        concentrationSpreadSideFactor = buf.readFloat();
        minConcentrationThreshold = buf.readFloat();
        spreadRate = buf.readFloat();
        lastSpreadTimestamp = buf.readLong();
        concentrationDecayAdjustment = buf.readFloat();
        concentrationDecayFactor = buf.readFloat();
        
        int spreadMapSize = buf.readInt();
        for(int i = 0; i < spreadMapSize; i++) {
            CompatibleBlockPos blockPos = new CompatibleBlockPos(buf.readInt(), buf.readInt(), buf.readInt());
            spreadMap.put(blockPos, buf.readFloat());
        }

        int currentSpreadSize = buf.readInt();
        
        if(currentSpread == null) {
            currentSpread = new ArrayList<>();
            initSpreadBox(); // spread box can be initialized only after spread factors are deserialized
            CompatibleBlockPos blockPos = new CompatibleBlockPos((int)posX, (int)posY, (int)posZ);
            spreadMap.put(blockPos, initialConcentration);
        }
        
        for(int i = 0; i < currentSpreadSize; i++) {
            CompatibleBlockPos blockPos = new CompatibleBlockPos(buf.readInt(), buf.readInt(), buf.readInt());
            currentSpread.add(blockPos);
        }
        
        initSpreadBox();
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {
        ByteBuf buf = Unpooled.buffer();
        
        buf.writeFloat(concentrationSpreadUpFactor);
        buf.writeFloat(concentrationSpreadDownFactor);
        buf.writeFloat(concentrationSpreadSideFactor);
        buf.writeFloat(minConcentrationThreshold);
        buf.writeFloat(spreadRate);
        buf.writeLong(lastSpreadTimestamp);
        buf.writeFloat(concentrationDecayAdjustment);
        buf.writeFloat(concentrationDecayFactor);
        
        buf.writeInt(spreadMap.size());
        for(Entry<CompatibleBlockPos, Float> e: spreadMap.entrySet()) {
            CompatibleBlockPos blockPos = e.getKey();
            buf.writeInt(blockPos.getBlockPosX());
            buf.writeInt(blockPos.getBlockPosY());
            buf.writeInt(blockPos.getBlockPosZ());
            buf.writeFloat(e.getValue());
        }
        
        if(currentSpread != null) {
            buf.writeInt(currentSpread.size());
            for(CompatibleBlockPos blockPos: currentSpread) {
                buf.writeInt(blockPos.getBlockPosX());
                buf.writeInt(blockPos.getBlockPosY());
                buf.writeInt(blockPos.getBlockPosZ());
            }

        } else {
            buf.writeInt(0);
        }
        
        compound.setByteArray(TAG_SPREAD_MAP, buf.array());
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();

        if (compatibility.world(this).isRemote)
            return;

        spread();
        updateNearbyEntities();
    }

    /*
     * Here entities are updated on every tick so that it's not possible to "run" through 
     * contaminated area without an impact
     */
    private void updateNearbyEntities() {
        if (spreadBox == null)
            return;
        
        List<Entity> entities = compatibility.getEntitiesWithinAABBExcludingEntity(compatibility.world(this), this, spreadBox);
        for (Entity entity: entities) {
            CompatibleBlockPos entityPos = new CompatibleBlockPos((int)entity.posX, (int)entity.posY, (int)entity.posZ);
            float adjustedConcentration = spreadMap.getOrDefault(entityPos, 0f) * concentrationDecayAdjustment;
            if(entity instanceof EntityLivingBase)
                onEntityExposure((EntityLivingBase) entity, adjustedConcentration);
        }
    }

    protected void onEntityExposure(EntityLivingBase entity, float concentration) {
        SpreadableExposure exposure = CompatibleExposureCapability.getExposure(entity, getExposureType());
        if(exposure == null) {
            exposure = createSpreadableExposure();
            CompatibleExposureCapability.updateExposure(entity, exposure);
        }
        
        exposure.apply(this, entity, concentration);
        //exposure.apply(this, -0.5f);
    }
    
    /*
     * Override this method in subclasses to support non-default exposures
     */
    protected Class<SpreadableExposure> getExposureType() {
        return SpreadableExposure.class;
    }
    
    /*
     * Override this method in subclasses to support non-default exposures
     */
    protected SpreadableExposure createSpreadableExposure() {
        return new SpreadableExposure(SpreadableExposure.DEFAULT_IMPACT_DELAY, compatibility.world(this).getTotalWorldTime());
    }

    private void spread() {
//        if(System.currentTimeMillis() - lastSpreadTimestamp <= 1000f / spreadRate) {
//            return;
//        }
        
        long currentWorldTime = compatibility.world(this).getTotalWorldTime();
        if(currentWorldTime - lastSpreadTimestamp <= 20f / spreadRate)
            return;
        
        lastSpreadTimestamp = currentWorldTime; //System.currentTimeMillis();
        
        if(currentSpread == null) {
            currentSpread = new ArrayList<>();
            initSpreadBox();
            CompatibleBlockPos blockPos = new CompatibleBlockPos((int)posX, (int)posY, (int)posZ);
            currentSpread.add(blockPos);
            spreadMap.put(blockPos, initialConcentration);
        }
        
        List<CompatibleBlockPos> newSpread = new ArrayList<>();
        for(CompatibleBlockPos blockPos: currentSpread) {
            float concentration = spreadMap.getOrDefault(blockPos, 0f);
            
            CompatibleBlockPos top = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY() + 1, blockPos.getBlockPosZ());
            if(updateSpreadAtPosition(top, concentration * concentrationSpreadUpFactor))
                newSpread.add(top);
            
            CompatibleBlockPos bottom = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY() - 1, blockPos.getBlockPosZ());
            if(updateSpreadAtPosition(bottom, concentration * concentrationSpreadDownFactor))
                newSpread.add(bottom);
                
            CompatibleBlockPos left = new CompatibleBlockPos(blockPos.getBlockPosX() - 1, blockPos.getBlockPosY(), blockPos.getBlockPosZ());
            if(updateSpreadAtPosition(left, concentration * concentrationSpreadSideFactor))
                newSpread.add(left);
            
            CompatibleBlockPos right = new CompatibleBlockPos(blockPos.getBlockPosX() + 1, blockPos.getBlockPosY(), blockPos.getBlockPosZ());
            if(updateSpreadAtPosition(right, concentration * concentrationSpreadSideFactor))
                newSpread.add(right);
            
            CompatibleBlockPos farther = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY(), blockPos.getBlockPosZ() + 1);
            if(updateSpreadAtPosition(farther, concentration * concentrationSpreadSideFactor))
                newSpread.add(farther);
            
            CompatibleBlockPos nearer = new CompatibleBlockPos(blockPos.getBlockPosX(), blockPos.getBlockPosY(), blockPos.getBlockPosZ() - 1);
            if(updateSpreadAtPosition(nearer, concentration * concentrationSpreadSideFactor))
                newSpread.add(nearer);
        }
        
        currentSpread = newSpread;
        
        concentrationDecayAdjustment *=  concentrationDecayFactor;
        if(currentSpread.isEmpty()) {
            spreadMap.entrySet().removeIf(e -> e.getValue() * concentrationDecayAdjustment < minConcentrationThreshold);
            if(spreadMap.isEmpty())
                setDead();
        }
    }

    private boolean updateSpreadAtPosition(CompatibleBlockPos blockPos, float concentration) {
        float adjustedConcentration = concentration * concentrationDecayAdjustment;
        if(adjustedConcentration < minConcentrationThreshold)
            return false;

        boolean result = false;
        CompatibleBlockState compatibleBlockState = compatibility.getBlockAtPosition(compatibility.world(this), blockPos);

        if (!compatibility.isAirBlock(compatibleBlockState))
            return result;

        Float currentConcentration = spreadMap.get(blockPos);
        if(currentConcentration == null || currentConcentration < concentration) {
            spreadMap.put(blockPos, concentration);
            result = true;
        }

        return result;
    }

    @Override
    public UUID getId() {
        return getUniqueID();
    }

    @Override
    public void setContext(ModContext modContext) {
    }
}
