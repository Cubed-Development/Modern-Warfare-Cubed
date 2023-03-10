package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.mission.Mission;
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

public class CompatibleMissionCapability implements ICapabilitySerializable<NBTBase> {

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(MissionContainer.class, new MissionContainerStorage(), 
                MissionContainerImpl.class);
    }

    public static interface MissionContainer {
        public Set<Mission> getMissions();
        public void setMissions(Set<Mission> missions);
    }
    
    public static class MissionContainerImpl implements MissionContainer {
        
        Set<Mission> missions = new LinkedHashSet<>();

        @Override
        public Set<Mission> getMissions() {
            return missions;
        }
        
        @Override
        public void setMissions(Set<Mission> missions) {
            this.missions = new LinkedHashSet<>(missions); 
        }
    }
    
    public static class MissionContainerStorage implements IStorage<MissionContainer> {

        @Override
        public NBTBase writeNBT(Capability<MissionContainer> capability, MissionContainer instance, EnumFacing side) {
            NBTTagList tagList = new NBTTagList();
            for(Mission mission: instance.getMissions()) {
                ByteBuf buf = Unpooled.buffer();
                TypeRegistry.getInstance().toBytes(mission, buf);
                tagList.appendTag(new NBTTagByteArray(buf.array()));
            }
            return tagList;
        }

        @Override
        public void readNBT(Capability<MissionContainer> capability, MissionContainer instance, EnumFacing side, NBTBase nbt) {
            NBTTagList tagList = (NBTTagList) nbt;
            for(int i = 0; i < tagList.tagCount(); i++) {
                NBTTagByteArray byteArray = (NBTTagByteArray) tagList.get(i);
                ByteBuf buf = Unpooled.wrappedBuffer(byteArray.getByteArray());
                Mission mission = TypeRegistry.getInstance().fromBytes(buf);
                instance.getMissions().add(mission);
            }
        }
    }
    
    @CapabilityInject(MissionContainer.class)
    static Capability<MissionContainer> capabilityContainer = null;
    
    private MissionContainer instance = capabilityContainer.getDefaultInstance(); // doesn't this trigger null pointer exception if capability is not registered?

    public static Set<Mission> getMissions(Entity entity) {
        if(entity == null) return null;
        MissionContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getMissions() : Collections.emptySet();
    }

    public static void removeMission(Entity entity, Mission mission) {
        if(entity == null) return;
        MissionContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.getMissions().remove(mission);
        }
    }
    
    public static void updateMission(Entity entity, Mission mission) {
        if(entity == null) return ;
        MissionContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.getMissions().add(mission);
        }
    }
    
    public static void updateMissions(Entity entity, Set<Mission> missions) {
        if(entity == null) return ;
        MissionContainer container = entity.getCapability(capabilityContainer, null);
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
