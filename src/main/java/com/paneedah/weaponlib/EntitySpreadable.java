package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.*;
import java.util.Map.Entry;

public class EntitySpreadable extends Entity implements Contextual, Spreadable {
    
    private static final String TAG_SPREAD_MAP = "spreadMap";
    
    private static final float DEFAULT_CONCENTRATION_SPREAD_FACTOR = 0.8f;
    private static final float DEFAULT_MIN_CONCENTRATION_THRESHOLD = 0.01f;
    private static final float DEFAULT_SPREAD_RATE = 0.5f; // 0.2 blocks per second, or one block in 4 seconds
    
//    private static final float DEFAULT_ENTITY_UPDATE_RATE = 2f; // 2 times per second

    private static final float DEFAULT_CONCENTRATION_DECAY_FACTOR = 0.99f; // 
    
    private Map<BlockPos, Float> spreadMap = new HashMap<>();
    private List<BlockPos> currentSpread;
    
    /*
     * For each entity a separate update timestamp is maintained;
     * this is required for timely entity updates in case if an entity decides to run through a spread zone
     */
    //private Map<UUID, Long> entityUpdateTimestamps = new HashMap<>();
    
    private float initialConcentration = 1f;
    
    private float concentrationSpreadUpFactor = DEFAULT_CONCENTRATION_SPREAD_FACTOR;
    private float concentrationSpreadDownFactor = DEFAULT_CONCENTRATION_SPREAD_FACTOR;
    private float concentrationSpreadSideFactor = DEFAULT_CONCENTRATION_SPREAD_FACTOR;
    private float minConcentrationThreshold = DEFAULT_MIN_CONCENTRATION_THRESHOLD;
    
    private AxisAlignedBB spreadBox;
    
    private float spreadRate = DEFAULT_SPREAD_RATE;
    
//    private float entityUpdateRate = DEFAULT_ENTITY_UPDATE_RATE;
    
    private long lastSpreadTimestamp;
    
    private float concentrationDecayAdjustment = 1.0f;
    
    private float concentrationDecayFactor = DEFAULT_CONCENTRATION_DECAY_FACTOR;
    
    @SuppressWarnings("unused")
    private ModContext modContext;
    
    public EntitySpreadable(World worldIn) {
        super(worldIn);
    }
    
    public void setContext(ModContext modContext) {
        this.modContext = modContext;
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
    protected void entityInit() {
    }

    private void initSpreadBox() {
        double spreadUpDistance = Math.log10(minConcentrationThreshold / initialConcentration) / Math.log10(concentrationSpreadUpFactor) + 1;
        double spreadDownDistance = Math.log10(minConcentrationThreshold / initialConcentration) / Math.log10(concentrationSpreadDownFactor) + 1;
        double spreadSideDistance = Math.log10(minConcentrationThreshold / initialConcentration) / Math.log10(concentrationSpreadSideFactor) + 1;
        spreadBox = new AxisAlignedBB(posX - spreadSideDistance, posY - spreadDownDistance, posZ - spreadSideDistance, posX + spreadSideDistance, posY + spreadUpDistance, posZ + spreadSideDistance);
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
            BlockPos blockPos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
            spreadMap.put(blockPos, buf.readFloat());
        }
        int currentSpreadSize = buf.readInt();
        
        if(currentSpread == null) {
            currentSpread = new ArrayList<>();
            initSpreadBox(); // spread box can be initialized only after spread factors are deserialized
            BlockPos blockPos = new BlockPos((int)posX, (int)posY, (int)posZ);
            spreadMap.put(blockPos, initialConcentration);
        }
        
        for(int i = 0; i < currentSpreadSize; i++) {
            BlockPos blockPos = new BlockPos(buf.readInt(), buf.readInt(), buf.readInt());
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
        for(Entry<BlockPos, Float> e: spreadMap.entrySet()) {
            BlockPos blockPos = e.getKey();
            buf.writeInt(blockPos.getX());
            buf.writeInt(blockPos.getY());
            buf.writeInt(blockPos.getZ());
            buf.writeFloat(e.getValue());
        }
        
        if(currentSpread != null) {
            buf.writeInt(currentSpread.size());
            for(BlockPos blockPos: currentSpread) {
                buf.writeInt(blockPos.getX());
                buf.writeInt(blockPos.getY());
                buf.writeInt(blockPos.getZ());
            }
        } else {
            buf.writeInt(0);
        }
        
        compound.setByteArray(TAG_SPREAD_MAP, buf.array());
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if(!world.isRemote) {
            //setDead();
            spread();
            updateNearbyEntities();
        }
    }

    /*
     * Here entities are updated on every tick so that it's not possible to "run" through 
     * contaminated area without an impact
     */
    private void updateNearbyEntities() {
        if(spreadBox == null)
            return;
        
        List<Entity> entities = world.getEntitiesWithinAABBExcludingEntity(this, spreadBox);
        for(Entity entity: entities) {
            BlockPos entityPos = new BlockPos((int)entity.posX, (int)entity.posY, (int)entity.posZ);
            float adjustedConcentration = spreadMap.getOrDefault(entityPos, 0f) * concentrationDecayAdjustment;
            if(entity instanceof EntityLivingBase) {
                onEntityExposure((EntityLivingBase) entity, adjustedConcentration);
            }
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
        return new SpreadableExposure(SpreadableExposure.DEFAULT_IMPACT_DELAY, world.getTotalWorldTime());
    }

    private void spread() {
        
//        if(System.currentTimeMillis() - lastSpreadTimestamp <= 1000f / spreadRate) {
//            return;
//        }
        
        long currentWorldTime = world.getTotalWorldTime();
        if(currentWorldTime - lastSpreadTimestamp <= 20f / spreadRate) {
            return;
        }
        
        lastSpreadTimestamp = currentWorldTime; //System.currentTimeMillis();
        
        if(currentSpread == null) {
            currentSpread = new ArrayList<>();
            initSpreadBox();
            BlockPos blockPos = new BlockPos((int)posX, (int)posY, (int)posZ);
            currentSpread.add(blockPos);
            spreadMap.put(blockPos, initialConcentration);
        }
        
        List<BlockPos> newSpread = new ArrayList<>();
        for(BlockPos blockPos: currentSpread) {

            float concentration = spreadMap.getOrDefault(blockPos, 0f);

            BlockPos top = new BlockPos(blockPos.getX(), blockPos.getY() + 1, blockPos.getZ());
            if(updateSpreadAtPosition(top, concentration * concentrationSpreadUpFactor)) {
                newSpread.add(top);
            }

            BlockPos bottom = new BlockPos(blockPos.getX(), blockPos.getY() - 1, blockPos.getZ());
            if(updateSpreadAtPosition(bottom, concentration * concentrationSpreadDownFactor)) {
                newSpread.add(bottom);
            }

            BlockPos left = new BlockPos(blockPos.getX() - 1, blockPos.getY(), blockPos.getZ());
            if(updateSpreadAtPosition(left, concentration * concentrationSpreadSideFactor)) {
                newSpread.add(left);
            }

            BlockPos right = new BlockPos(blockPos.getX() + 1, blockPos.getY(), blockPos.getZ());
            if(updateSpreadAtPosition(right, concentration * concentrationSpreadSideFactor)) {
                newSpread.add(right);
            }

            BlockPos farther = new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() + 1);
            if(updateSpreadAtPosition(farther, concentration * concentrationSpreadSideFactor)) {
                newSpread.add(farther);
            }

            BlockPos nearer = new BlockPos(blockPos.getX(), blockPos.getY(), blockPos.getZ() - 1);
            if(updateSpreadAtPosition(nearer, concentration * concentrationSpreadSideFactor)) {
                newSpread.add(nearer);
            }
        }
        
        currentSpread = newSpread;
        
        concentrationDecayAdjustment *=  concentrationDecayFactor;
        if(currentSpread.isEmpty()) {
            for(Iterator<Entry<BlockPos, Float>> it = spreadMap.entrySet().iterator(); it.hasNext();) {
                Entry<BlockPos, Float> e = it.next();
                if(e.getValue() * concentrationDecayAdjustment < minConcentrationThreshold) {
                    it.remove();
                }
            }
            if(spreadMap.isEmpty()) {
                setDead();
            }
        }
    }

    private boolean updateSpreadAtPosition(BlockPos blockPos, float concentration) {
        float adjustedConcentration = concentration * concentrationDecayAdjustment;
        if(adjustedConcentration < minConcentrationThreshold) {
            return false;
        }
        boolean result = false;
        IBlockState iBlockState = world.getBlockState(blockPos);
        if (iBlockState.getBlock() == Blocks.AIR) {
            Float currentConcentration = spreadMap.get(blockPos);
            if(currentConcentration == null || currentConcentration < concentration) {
                spreadMap.put(blockPos, concentration);
                result = true;
            }
        }
        return result;
    }

    @Override
    public UUID getId() {
        return getUniqueID();
    }
    
}
