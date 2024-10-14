package com.paneedah.weaponlib;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.paneedah.weaponlib.state.ManagedState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

public final class PlayerItemInstanceRegistry {

    private final Map<UUID, Map<Integer, PlayerItemInstance<?>>> registry = new HashMap<>();

    private final Cache<ItemStack, Optional<PlayerItemInstance<?>>> itemStackInstanceCache = CacheBuilder
            .newBuilder()
            .weakKeys()
            .maximumSize(512)
            .build();

    private final SyncManager<?> syncManager;

    public PlayerItemInstanceRegistry(final SyncManager<?> syncManager) {
        this.syncManager = syncManager;
    }

    /**
     * Returns instance of the target class, or null if there is no instance or instance class does not match.
     */
    public <T extends PlayerItemInstance<S>, S extends ManagedState<S>> T getMainHandItemInstance(final EntityPlayer player, final Class<T> targetClass) {
        final PlayerItemInstance<?> instance = getMainHandItemInstance(player);

        return targetClass.isInstance(instance) ? targetClass.cast(instance) : null;
    }

    public PlayerItemInstance<?> getMainHandItemInstance(final EntityPlayer player) {
        if (player == null)
            return null;

        return getItemInstance(player, player.inventory.currentItem);
    }

    public PlayerItemInstance<?> getItemInstance(final EntityPlayer player, final int slot) { // ! TODO: This needs urgent care, causes problems - Luna Lage (Desoroxxx)
        final Map<Integer, PlayerItemInstance<?>> slotInstances = registry.computeIfAbsent(player.getPersistentID(), uuid -> new HashMap<>());
        PlayerItemInstance<?> result = slotInstances.get(slot);

//        log.debug("Slot {} contains {}", slot, result);

        final ItemStack itemStack = player.inventory.getStackInSlot(slot);

        if (result == null)
            return createItemInstance(player, slotInstances, slot);

        if (!itemStackMatchesInstance(itemStack, result)) {
            syncManager.unwatch(result);

            result = createItemInstance(player, slotInstances, slot);
        }

        if (result != null) {
            if (result.getItemInventoryIndex() != slot) {
                LOGGER.warn("Invalid instance slot id, correcting...");
                result.setItemInventoryIndex(slot);
            }

            if (result.getPlayer() != player) {
                LOGGER.warn("Invalid player " + result.getPlayer() + " associated with instance in slot, changing to {}", player);
                result.setPlayer(player);
            }
        }

        return result;
    }

    private PlayerItemInstance<?> createItemInstance(final EntityPlayer player, final Map<Integer, PlayerItemInstance<?>> slotInstances, final int slot) {
        final ItemStack itemStack = player.inventory.getStackInSlot(slot);
        PlayerItemInstance<?> result = null;

        if (itemStack.getItem() instanceof PlayerItemInstanceFactory) {
            LOGGER.debug("Deserializing instance for slot {} from stack {}", slot, itemStack);
            result = Tags.getInstance(itemStack);
            LOGGER.debug("Deserialized instance {} for slot {} from stack {}", result, slot, itemStack);

            if (result == null) {
                LOGGER.debug("Creating instance for slot {} from stack {}", slot, itemStack);
                result = ((PlayerItemInstanceFactory<?, ?>) itemStack.getItem()).createItemInstance(player, itemStack, slot);
                result.markClean();
            }

            result.setItemInventoryIndex(slot);
            result.setPlayer(player);
        }

        if (result != null) {
            if (result.shouldHaveInstanceTags())
                Tags.setInstanceUuid(itemStack, result.getUuid());

            slotInstances.put(slot, result);
            syncManager.watch(result);

            if (result.getUpdateId() == 0) // Sync to server if newly created
                result.markDirty();
        }

        return result;
    }

    /**
     * Maps the item stack to an item instance using the internal cache.
     * <p>
     * This method should be used when rendering only.
     */
    @SideOnly(CLIENT)
    public PlayerItemInstance<?> getCachedItemInstance(final EntityLivingBase entityLiving, final ItemStack itemStack) { // ! TODO: This method is suspiscious as fuck - Luna Lage (Desoroxxx)
        Optional<PlayerItemInstance<?>> result = Optional.empty();

        try {
            result = itemStackInstanceCache.get(itemStack, () -> {
                LOGGER.debug("ItemStack {} not found in cache, initializing...", itemStack);

                PlayerItemInstance<?> instance = null;

                if (MC.player != null && MC.player == entityLiving) { // For current player, the latest instance is available locally
                    for (int slot = 0; slot < ((EntityPlayer) entityLiving).inventory.getSizeInventory(); slot++) {
                        if (((EntityPlayer) entityLiving).inventory.getStackInSlot(slot) == itemStack) {
                            instance = getItemInstance((EntityPlayer) entityLiving, slot);
                            LOGGER.debug("Resolved item stack instance {} in slot {}", instance, slot);
                            break;
                        }
                    }
                }

                if (instance == null || instance.getItem() != itemStack.getItem()) {
                    LOGGER.debug("Deserializing instance from stack {}", itemStack);
                    instance = Tags.getInstance(itemStack);
                    LOGGER.debug("Deserialized instance {} from stack {}", instance, itemStack);

                    if (itemStack.getItem() instanceof PlayerItemInstanceFactory) {
                        LOGGER.debug("Creating temporary item stack instance {}", instance);
                        instance = ((PlayerItemInstanceFactory<?, ?>) itemStack.getItem()).createItemInstance(entityLiving, itemStack, -1);
                        instance.setPlayer(entityLiving);
                    }
                }

                return Optional.ofNullable(instance);
            });
        } catch (UncheckedExecutionException | ExecutionException exception) {
            LOGGER.error("Failed to initialize cache instance from {}", itemStack, exception);
        }

        return result.orElse(null);
    }

    public <S extends ManagedState<S>, T extends PlayerItemInstance<S>> boolean update(final S newManagedState, final T extendedStateToMerge) {
        final Map<Integer, PlayerItemInstance<?>> slotInstances = registry.get(extendedStateToMerge.getPlayer().getUniqueID());

        if (slotInstances == null)
            return false;

        final T currentState = (T) slotInstances.get(extendedStateToMerge.getItemInventoryIndex());

        if (currentState == null || Item.getIdFromItem(currentState.getItem()) != Item.getIdFromItem(extendedStateToMerge.getItem()) /*|| !isSameUpdateId(currentState, extendedStateToMerge)*/)
            return false;

        // If input.managedState has a transactional component, set current.managedState = input.managedState only, do not update the entire state

        extendedStateToMerge.setState(newManagedState); // Why do we set it here?
        if (newManagedState.commitPhase() != null) {
            currentState.prepareTransaction(extendedStateToMerge);
        } else {
//            slotInstances.put(extendedStateToMerge.getItemInventoryIndex(), extendedStateToMerge);
            currentState.updateWith(extendedStateToMerge, true);
        }

        return true;
    }

    public void update(final EntityPlayer player) {
        if (player == null)
            return;

        final Map<Integer, PlayerItemInstance<?>> slotInstances = registry.get(player.getPersistentID());

        if (slotInstances == null)
            return;

        for (final Iterator<Entry<Integer, PlayerItemInstance<?>>> iterator = slotInstances.entrySet().iterator(); iterator.hasNext(); ) {
            final Entry<Integer, PlayerItemInstance<?>> entry = iterator.next();
            final ItemStack slotStack = player.inventory.getStackInSlot(entry.getKey());

//            log.debug("Slot {} contains item {} stack {}", e.getKey(), e.getValue(), System.identityHashCode(slotStack));

            if (itemStackMatchesInstance(slotStack, entry.getValue()))
                continue;

            LOGGER.debug("Removing {} in slot {} from the item instance registry", entry.getValue(), entry.getKey());
            syncManager.unwatch(entry.getValue());
            iterator.remove();
        }
    }

    private boolean itemStackMatchesInstance(final ItemStack itemStack, final PlayerItemInstance<?> instance) {
        return itemStack.getItem() == instance.getItem() && instance.getUuid().equals(Tags.getInstanceUuid(itemStack));
    }
}
