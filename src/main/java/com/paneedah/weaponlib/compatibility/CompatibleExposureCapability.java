package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.Exposure;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

@Deprecated
public class CompatibleExposureCapability implements ICapabilitySerializable<NBTBase> {

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(ExposureContainer.class, new ExposureContainerStorage(), 
                ExposureContainerImpl.class);
    }

    public static interface ExposureContainer {
        
        public Map<Class<?>, Exposure> getExposures();
        
        public long getLastSyncTimestmap();
        
        public void setLastSyncTimestamp(long lastSyncTimestamp);
        
        public long getLastUpdateTimestamp();
        
        public void setLastUpdateTimestamp(long lastUpdateTimestamp);
    }
    
    public static class ExposureContainerImpl implements ExposureContainer {
        
        Map<Class<?>, Exposure> exposures = new HashMap<>();
        long lastSyncTimestamp;
        long lastUpdateTimestamp;

        @Override
        public Map<Class<?>, Exposure> getExposures() {
            return exposures;
        }

        @Override
        public long getLastSyncTimestmap() {
            return lastSyncTimestamp;
        }
        
        @Override
        public void setLastSyncTimestamp(long lastSyncTimestamp) {
            this.lastSyncTimestamp = lastSyncTimestamp;
        }

        public long getLastUpdateTimestamp() {
            return lastUpdateTimestamp;
        }

        public void setLastUpdateTimestamp(long lastUpdateTimestamp) {
            this.lastUpdateTimestamp = lastUpdateTimestamp;
        }
    }
    
    public static class ExposureContainerStorage implements IStorage<ExposureContainer> {

        private static final String TAG_EXPOSURES = "exposures";
        private static final String TAG_LAST_UPDATE = "lastUpdate";
        private static final String TAG_LAST_SYNC = "lastSync";

        @Override
        public NBTBase writeNBT(Capability<ExposureContainer> capability, ExposureContainer instance, EnumFacing side) {
            NBTTagCompound tagCompound = new NBTTagCompound();
            NBTTagList exposureTags = new NBTTagList();
            for(Exposure exposure: instance.getExposures().values()) {
                ByteBuf buf = Unpooled.buffer();
                TypeRegistry.getInstance().toBytes(exposure, buf);
                exposureTags.appendTag(new NBTTagByteArray(buf.array()));
            }
            tagCompound.setTag(TAG_EXPOSURES, exposureTags);
            tagCompound.setLong(TAG_LAST_SYNC, instance.getLastSyncTimestmap());
            tagCompound.setLong(TAG_LAST_UPDATE, instance.getLastUpdateTimestamp());
            return tagCompound;
        }

        @Override
        public void readNBT(Capability<ExposureContainer> capability, ExposureContainer instance, EnumFacing side, NBTBase nbt) {
            if(nbt instanceof NBTTagCompound) {
                NBTTagCompound tagCompound = (NBTTagCompound) nbt;
                NBTTagList exposureTags = (NBTTagList) tagCompound.getTag(TAG_EXPOSURES);
                for(int i = 0; i < exposureTags.tagCount(); i++) {
                    NBTTagByteArray byteArray = (NBTTagByteArray) exposureTags.get(i);
                    ByteBuf buf = Unpooled.wrappedBuffer(byteArray.getByteArray());
                    Exposure exposure = TypeRegistry.getInstance().fromBytes(buf);
                    instance.getExposures().put(exposure.getClass(), exposure);
                }
                instance.setLastSyncTimestamp(tagCompound.getLong(TAG_LAST_SYNC));
                instance.setLastUpdateTimestamp(tagCompound.getLong(TAG_LAST_UPDATE));
            }
        }
    }
    
    @CapabilityInject(ExposureContainer.class)
    static Capability<ExposureContainer> capabilityContainer = null;
    
    private ExposureContainer instance = capabilityContainer.getDefaultInstance(); // doesn't this trigger null pointer exception if capability is not registered?

    public static <T extends Exposure> T getExposure(Entity entity, Class<T> targetClass) {
        if(entity == null) return null;
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? targetClass.cast(container.getExposures().get(targetClass)) : null;
    }
    
    public static Collection<? extends Exposure> getExposures(Entity entity) {
        if(entity == null) return null;
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getExposures().values() : null;
    }

    public static <T extends Exposure> T removeExposure(Entity entity, Class<T> targetClass) {
        if(entity == null) return null;
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.setLastUpdateTimestamp(entity.world.getTotalWorldTime());
            return targetClass.cast(container.getExposures().remove(targetClass));
        }
        return null;
    }
    
    public static void updateExposure(Entity entity, Exposure exposure) {
        if(entity == null) return ;
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.getExposures().put(exposure.getClass(), exposure);
            container.setLastUpdateTimestamp(entity.world.getTotalWorldTime());
        }
    }
    
    public static void updateExposures(Entity entity, Collection<? extends Exposure> updatedExposures) {
        if(updatedExposures == null) {
            return;
        }
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            Map<Class<?>, Exposure> currentExposures = container.getExposures();
            
            // Remove current entries that not in updatedExposure list
            Set<?> updatedClasses = updatedExposures.stream().map(e -> e.getClass()).collect(Collectors.toSet());
            for(Iterator<Entry<Class<?>, Exposure>> it = currentExposures.entrySet().iterator(); it.hasNext();) {
                Entry<Class<?>, Exposure> currentEntry = it.next();
                if(!updatedClasses.contains(currentEntry.getKey())) {
                    it.remove();
                }
            }
            
            // Update existing or add new exposures
            for(Exposure updatedExposure: updatedExposures) {
                Exposure currentExposure = currentExposures.get(updatedExposure.getClass());
                if(currentExposure != null) {
                    currentExposure.updateFrom(updatedExposure);
                } else {
                    currentExposures.put(updatedExposure.getClass(), updatedExposure);
                }
            }
            container.setLastUpdateTimestamp(entity.world.getTotalWorldTime());
        }
    }
    
    public static long getLastSyncTimestamp(Entity entity) {
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getLastSyncTimestmap() : 0;
    }
    
    public static void setLastSyncTimestamp(Entity entity, long lastSyncTimestamp) {
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.setLastSyncTimestamp(lastSyncTimestamp);
        }
    }
    
    public static long getLastUpdateTimestamp(Entity entity) {
        ExposureContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getLastUpdateTimestamp() : 0;
    }
    
    @Override
    public final boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == capabilityContainer; //hasCapability(new CompatibleCapability<>(capability), CompatibleEnumFacing.valueOf(facing));
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return capability == capabilityContainer ? capabilityContainer.cast(instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return capabilityContainer.getStorage().writeNBT(capabilityContainer, instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        capabilityContainer.getStorage().readNBT(capabilityContainer, instance, null, nbt);
    }
}
