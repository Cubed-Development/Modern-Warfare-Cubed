package com.paneedah.mwc.capabilities;

import com.paneedah.mwc.equipment.inventory.EquipmentInventory;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import javax.annotation.Nonnull;

public class EquipmentCapability implements ICapabilitySerializable<NBTBase> {

    public interface InventoryContainer {
        void setInventory(EquipmentInventory inventory);

        EquipmentInventory getInventory();
    }

    public static class InventoryContainerImpl implements InventoryContainer {
        private EquipmentInventory inventory = new EquipmentInventory();

        @Override
        public void setInventory(EquipmentInventory inventory) {
            this.inventory = inventory;
        }

        @Override
        public EquipmentInventory getInventory() {
            return inventory;
        }
    }

    public static class InventoryStorage implements IStorage<InventoryContainer> {

        @Override
        public NBTBase writeNBT(Capability<InventoryContainer> capability, InventoryContainer instance, EnumFacing side) {
            NBTTagCompound compound = new NBTTagCompound();
            instance.getInventory().writeToNBT(compound);
            return compound;
        }

        @Override
        public void readNBT(Capability<InventoryContainer> capability, InventoryContainer instance, EnumFacing side, NBTBase nbt) {
            EquipmentInventory inventory = new EquipmentInventory();
            inventory.readFromNBT((NBTTagCompound) nbt);
            instance.setInventory(inventory);

        }
    }

    @CapabilityInject(InventoryContainer.class)
    static Capability<InventoryContainer> capabilityContainer = null;
    private final InventoryContainer instance = capabilityContainer.getDefaultInstance(); // Doesn't this trigger null pointer exception if capability is not registered?


    public static void setInventory(EntityLivingBase entity, EquipmentInventory inventory) {
        if (entity == null) {
            return;
        }

        InventoryContainer container = entity.getCapability(capabilityContainer, null);

        if (container != null) {
            container.setInventory(inventory);
        }
    }

    public static void register() {
        CapabilityManager.INSTANCE.register(InventoryContainer.class, new InventoryStorage(), InventoryContainerImpl::new);
    }

    public static EquipmentInventory getInventory(EntityLivingBase entity) {
        if (entity == null) {
            return null;
        }

        InventoryContainer container = entity.getCapability(capabilityContainer, null);
        return container != null ? container.getInventory() : null;
    }

    @Override
    public boolean hasCapability(@Nonnull Capability<?> capability, EnumFacing facing) {
        return capability == capabilityContainer;
    }

    @Override
    public <T> T getCapability(@Nonnull Capability<T> capability, EnumFacing facing) {
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
