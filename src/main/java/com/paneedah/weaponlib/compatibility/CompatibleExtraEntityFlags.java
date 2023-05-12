package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.ModContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

@Deprecated
public class CompatibleExtraEntityFlags implements ICapabilitySerializable<NBTBase> {
    
    public static int PRONING = 0x01;
    public static int FLIP = 0x80000000;

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(ExtraEntityFlagsContainer.class, new ExtraEntityFlagsContainerStorage(), 
                ExtraEntityFlagsContainerImpl.class);
    }

    public static interface ExtraEntityFlagsContainer {
        public int getFlags();
        public void setFlags(int flags);
    }
    
    public static class ExtraEntityFlagsContainerImpl implements ExtraEntityFlagsContainer {
        
        int flags;

        @Override
        public int getFlags() {
            return flags;
        }
        
        @Override
        public void setFlags(int flags) {
            this.flags = flags;
        }
    }
    
    public static class ExtraEntityFlagsContainerStorage implements IStorage<ExtraEntityFlagsContainer> {

        @Override
        public NBTBase writeNBT(Capability<ExtraEntityFlagsContainer> capability, ExtraEntityFlagsContainer instance, EnumFacing side) {
            return new NBTTagInt(instance.getFlags());
        }

        @Override
        public void readNBT(Capability<ExtraEntityFlagsContainer> capability, ExtraEntityFlagsContainer instance, EnumFacing side, NBTBase nbt) {
            instance.setFlags(((NBTTagInt) nbt).getInt());
        }
    }
    
    @CapabilityInject(ExtraEntityFlagsContainer.class)
    static Capability<ExtraEntityFlagsContainer> capabilityContainer = null;
    
    private ExtraEntityFlagsContainer instance = capabilityContainer.getDefaultInstance(); // doesn't this trigger null pointer exception if capability is not registered?

    public static int getFlags(Entity entity) {
        if(entity == null) return 0;
        ExtraEntityFlagsContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getFlags() : 0;
    }
    
    public static void removeFlags(Entity entity) {
        if(entity == null) return;
        ExtraEntityFlagsContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.setFlags(0);
        }
    }
    
    public static void setFlag(Entity entity, int flag, boolean on) {
        if(entity == null) return ;
        ExtraEntityFlagsContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            int flags = container.getFlags();
            if(on) {
                container.setFlags(flags | flag);
            } else {
                container.setFlags(flags & ~flag);
            }
        }
    }
    
    public static void setFlags(Entity entity, int flagsToSet, int values) {
        if(entity == null) return ;
        ExtraEntityFlagsContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            if((flagsToSet & FLIP) != 0) {
                flagsToSet &= ~FLIP;
                values = ~(container.getFlags() & flagsToSet);
            }
            container.setFlags((container.getFlags() & ~flagsToSet) | (flagsToSet & values));
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

    public static boolean isProning(EntityPlayer player) {
        return (CompatibleExtraEntityFlags.getFlags(player) & CompatibleExtraEntityFlags.PRONING) != 0;
    }
}
