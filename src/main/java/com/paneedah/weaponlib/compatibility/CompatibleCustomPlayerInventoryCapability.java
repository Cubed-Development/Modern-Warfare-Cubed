package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.CommonModContext;
import com.paneedah.weaponlib.inventory.CustomPlayerInventory;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

@Deprecated
public class CompatibleCustomPlayerInventoryCapability implements ICapabilitySerializable<NBTBase> {
    
    public static interface InventoryContainer {
        public void setInventory(CustomPlayerInventory inventory);
        public CustomPlayerInventory getInventory();
    }
    
    public static class InventoryContainerImpl implements InventoryContainer {
        private CustomPlayerInventory inventory = new CustomPlayerInventory();

        @Override
        public void setInventory(CustomPlayerInventory inventory) {
            this.inventory = inventory;
        }

        @Override
        public CustomPlayerInventory getInventory() {
            return inventory;
        }
    }
    
    public static class InventoryStorage implements IStorage<InventoryContainer> {

        @Override
        public NBTBase writeNBT(Capability<InventoryContainer> capability, InventoryContainer instance,
                EnumFacing side) {
            NBTTagCompound compound = new NBTTagCompound();
            instance.getInventory().writeToNBT(compound);
            return compound;
        }

        @Override
        public void readNBT(Capability<InventoryContainer> capability, InventoryContainer instance, EnumFacing side,
                NBTBase nbt) {
            CustomPlayerInventory inventory = new CustomPlayerInventory();
            inventory.readFromNBT((NBTTagCompound)nbt);
            instance.setInventory(inventory);
            
        }
    }
    
    @CapabilityInject(InventoryContainer.class)
    static Capability<InventoryContainer> capabilityContainer = null;
    private InventoryContainer instance = capabilityContainer.getDefaultInstance(); // doesn't this trigger null pointer exception if capability is not registered?


    public static void setInventory(EntityLivingBase entity, CustomPlayerInventory inventory) {
        if(entity == null) return ;
        InventoryContainer container = entity.getCapability(capabilityContainer, null);
        if(container != null) {
            container.setInventory(inventory);
        }
    }

    public static void register(CommonModContext commonModContext) {
        CapabilityManager.INSTANCE.register(InventoryContainer.class, new InventoryStorage(), 
                InventoryContainerImpl.class);
    }

    public static CustomPlayerInventory getInventory(EntityLivingBase entity) {
        if(entity == null) return null;
        InventoryContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getInventory() : null;
    }

    @Override
    public boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == capabilityContainer;
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
