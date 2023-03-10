package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.mission.MissionOffering;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class CompatibleMissionOfferingCapability implements ICapabilitySerializable<NBTBase> {

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(MissionOfferingContainer.class, new MissionOfferingContainerStorage(), 
                MissionContainerImpl.class);
    }

    public static interface MissionOfferingContainer {
        public Set<MissionOffering> getMissions();
        public void setMissions(Set<MissionOffering> missions);
    }
    
    public static class MissionContainerImpl implements MissionOfferingContainer {
        
        Set<MissionOffering> missions = new LinkedHashSet<>();

        @Override
        public Set<MissionOffering> getMissions() {
            return missions;
        }
        
        @Override
        public void setMissions(Set<MissionOffering> missions) {
            this.missions = new LinkedHashSet<>(missions); 
        }
    }
    
    public static class MissionOfferingContainerStorage implements IStorage<MissionOfferingContainer> {

        @Override
        public NBTBase writeNBT(Capability<MissionOfferingContainer> capability, MissionOfferingContainer instance, EnumFacing side) {
            NBTTagList tagList = new NBTTagList();
            for(MissionOffering mission: instance.getMissions()) {
                ByteBuf buf = Unpooled.buffer();
                TypeRegistry.getInstance().toBytes(mission, buf);
                tagList.appendTag(new NBTTagByteArray(buf.array()));
            }
            return tagList;
        }

        @Override
        public void readNBT(Capability<MissionOfferingContainer> capability, MissionOfferingContainer instance, EnumFacing side, NBTBase nbt) {
            NBTTagList tagList = (NBTTagList) nbt;
            for(int i = 0; i < tagList.tagCount(); i++) {
                NBTTagByteArray byteArray = (NBTTagByteArray) tagList.get(i);
                ByteBuf buf = Unpooled.wrappedBuffer(byteArray.getByteArray());
                MissionOffering mission = TypeRegistry.getInstance().fromBytes(buf);
                instance.getMissions().add(mission);
            }
        }
    }
    
    @CapabilityInject(MissionOfferingContainer.class)
    static Capability<MissionOfferingContainer> capabilityContainer = null;
    
    private MissionOfferingContainer instance = capabilityContainer.getDefaultInstance(); // doesn't this trigger null pointer exception if capability is not registered?

    public static Set<MissionOffering> getMissions(Entity entity) {
        if(entity == null) return null;
        MissionOfferingContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getMissions() : Collections.emptySet();
    }

    public static void updateMissionOffering(Entity entity, MissionOffering mission) {
        if(entity == null) return ;
        MissionOfferingContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.getMissions().add(mission);
        }
    }
    
    public static void updateMissionOfferings(Entity entity, Set<MissionOffering> missions) {
        if(entity == null) return ;
        MissionOfferingContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.setMissions(missions);
        }
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
