package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagByteArray;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;

import java.util.function.Function;

public class CompatiblePlayerEntityTrackerProvider implements ICapabilitySerializable<NBTBase> {

    public static void register(ModContext modContext) {
        CapabilityManager.INSTANCE.register(PlayerEntityTrackerContainer.class, new PlayerEntityTrackerStorage(),
                PlayerEntityTrackerContainerImpl.class);
    }

    public interface PlayerEntityTrackerContainer {

        byte[] toByteArray();

        void setInitializer(Function<World, LivingEntityTracker> initializer);

        void setBytes(byte[] bytes);

        LivingEntityTracker getTracker(World world);
    }

    public static class PlayerEntityTrackerContainerImpl implements PlayerEntityTrackerContainer {

        private Function<World, LivingEntityTracker> initializer; // = w -> new LivingEntityTracker(w);
        private LivingEntityTracker resolved;
        private byte[] bytes = new byte[0];

        @Override
        public byte[] toByteArray() {
            return resolved == null ? bytes : resolved.toByteArray();
        }

        @Override
        public void setBytes(byte[] bytes) {
            this.bytes = bytes;
        }

        @Override
        public void setInitializer(Function<World, LivingEntityTracker> initializer) {
            this.initializer = initializer;
            this.resolved = null;
        }

        @Override
        public LivingEntityTracker getTracker(World world) {
            if (resolved == null) {
                resolved = initializer != null ? initializer.apply(world) : new LivingEntityTracker(() -> world);
            }
            return resolved;
        }

    }

    public static class PlayerEntityTrackerStorage implements IStorage<PlayerEntityTrackerContainer> {

        @Override
        public NBTBase writeNBT(Capability<PlayerEntityTrackerContainer> capability,
                                PlayerEntityTrackerContainer instance, EnumFacing side) {
            return new NBTTagByteArray(instance.toByteArray());
        }

        @Override
        public void readNBT(Capability<PlayerEntityTrackerContainer> capability, PlayerEntityTrackerContainer instance,
                            EnumFacing side, NBTBase nbt) {
            NBTTagByteArray content = (NBTTagByteArray) nbt;
            byte[] bytes = content.getByteArray();
            if (bytes != null) {
                instance.setBytes(bytes);
                instance.setInitializer(w -> LivingEntityTracker.fromByteArray(bytes, () -> w));
            }
        }
    }

    @CapabilityInject(PlayerEntityTrackerContainer.class)
    static Capability<PlayerEntityTrackerContainer> playerEntityTrackerContainer = null;

    private final PlayerEntityTrackerContainer instance = playerEntityTrackerContainer.getDefaultInstance(); // doesn't this trigger null pointer exception if capability is not registered?


    public static LivingEntityTracker getTracker(EntityLivingBase player) {
        if (player == null) {
            return null;
        }
        PlayerEntityTrackerContainer container = player.getCapability(playerEntityTrackerContainer, null);
        LivingEntityTracker result;
        if (container != null) {
            result = container.getTracker(player.world);
        } else {
            result = null;
        }
        return result;
    }


    public static void setTracker(EntityLivingBase player, LivingEntityTracker tracker) {
        PlayerEntityTrackerContainer container = player.getCapability(playerEntityTrackerContainer, null);
        if (container != null) {
            container.setInitializer(w -> tracker);
        }
    }

    @Override
    public final boolean hasCapability(Capability<?> capability, EnumFacing facing) {
        return capability == playerEntityTrackerContainer; //hasCapability(new CompatibleCapability<>(capability), CompatibleEnumFacing.valueOf(facing));
    }

    @Override
    public <T> T getCapability(Capability<T> capability, EnumFacing facing) {
        return capability == playerEntityTrackerContainer ? playerEntityTrackerContainer.cast(instance) : null;
    }

    @Override
    public NBTBase serializeNBT() {
        return playerEntityTrackerContainer.getStorage().writeNBT(playerEntityTrackerContainer, instance, null);
    }

    @Override
    public void deserializeNBT(NBTBase nbt) {
        playerEntityTrackerContainer.getStorage().readNBT(playerEntityTrackerContainer, instance, null, nbt);
    }

}
