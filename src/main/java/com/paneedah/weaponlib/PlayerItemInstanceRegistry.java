package com.paneedah.weaponlib;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.paneedah.weaponlib.state.ManagedState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class PlayerItemInstanceRegistry {

    private static final int CACHE_EXPIRATION_TIMEOUT_SECONDS = 5;

    private final Map<UUID, Map<Integer, PlayerItemInstance<?>>> registry = new HashMap<>();

    private final SyncManager<?> syncManager;

    private final Cache<ItemStack, Optional<PlayerItemInstance<?>>> itemStackInstanceCache;

    public PlayerItemInstanceRegistry(SyncManager<?> syncManager) {
        this.syncManager = syncManager;
        itemStackInstanceCache = CacheBuilder
                .newBuilder()
                .weakKeys()
                .maximumSize(1000)
                .expireAfterAccess(CACHE_EXPIRATION_TIMEOUT_SECONDS, TimeUnit.SECONDS)
                .build();
    }

    /**
     * Returns instance of the target class, or null if there is no instance or instance class does not match.
     *
     */
    public <T extends PlayerItemInstance<S>, S extends ManagedState<S>> T getMainHandItemInstance(EntityLivingBase player, Class<T> targetClass) {
        return null;
    }

    public PlayerItemInstance<?> getMainHandItemInstance(EntityLivingBase player) {
        return null;
    }

    public PlayerItemInstance<?> getItemInstance(EntityPlayer player, int slot) { // ! TODO: This needs urgent care, causes problems - Luna Lage (Desoroxxx)
        Map<Integer, PlayerItemInstance<?>> slotInstances = registry.computeIfAbsent(player.getPersistentID(), p -> new HashMap<>());
        PlayerItemInstance<?> result = slotInstances.get(Integer.valueOf(slot));
        //log.debug("Slot {} contains {}", slot, result);
        if (result == null) {
            result = createItemInstance(player, slot);
            if (result != null) {
                ItemStack slotItemStack = player.inventory.getStackInSlot(slot);
                if (result.shouldHaveInstanceTags()) {
                    Tags.setInstanceUuid(slotItemStack, result.getUuid());
                }
                slotInstances.put(Integer.valueOf(slot), result);
                syncManager.watch(result);
                if (result.getUpdateId() == 0) { // sync to server if newly created
                    result.markDirty();
                }
            }
        } else {
            ItemStack slotItemStack = player.inventory.getStackInSlot(slot);
            if (
                    slotItemStack.getItem() != result.getItem()
                            || !result.getUuid().equals(Tags.getInstanceUuid(slotItemStack))
            ) {
                syncManager.unwatch(result);
                result = createItemInstance(player, slot);
                if (result != null) {
                    if (result.shouldHaveInstanceTags()) {
                        Tags.setInstanceUuid(slotItemStack, result.getUuid());
                    }
                    slotInstances.put(Integer.valueOf(slot), result);
                    syncManager.watch(result);
                    if (result.getUpdateId() == 0) { // sync to server if newly created
                        result.markDirty();
                    }
                }
            }
            if (result != null && result.getItemInventoryIndex() != slot) {
                LOGGER.warn("Invalid instance slot id, correcting...");
                result.setItemInventoryIndex(slot);
            }
            if (result != null && result.getPlayer() != player) {
                LOGGER.warn("Invalid player " + result.getPlayer()
                        + " associated with instance in slot, changing to {}", player);
                result.setPlayer(player);
            }

        }
        return result;
    }

    private boolean isSameItem(PlayerItemInstance<?> instance1, PlayerItemInstance<?> instance2) {
        return Item.getIdFromItem(instance1.getItem()) == Item.getIdFromItem(instance2.getItem());
    }


    public <S extends ManagedState<S>, T extends PlayerItemInstance<S>> boolean update(S newManagedState, T extendedStateToMerge) {

        Map<Integer, PlayerItemInstance<?>> slotContexts = registry.get(extendedStateToMerge.getPlayer().getUniqueID());

        boolean result = false;

        if (slotContexts != null) {
            T currentState = (T) slotContexts.get(Integer.valueOf(extendedStateToMerge.getItemInventoryIndex()));
            if (currentState != null && isSameItem(currentState, extendedStateToMerge)
                /*&& isSameUpdateId(currentState, extendedStateToMerge)*/) {
                /*
                 * If input.managedState has a transactional component, set current.managedState = input.managedState only,
                 * do not update the entire state
                 */

                extendedStateToMerge.setState(newManagedState); // why do we set it here?
                if (newManagedState.commitPhase() != null) {
                    currentState.prepareTransaction(extendedStateToMerge);
                } else {
                    //slotContexts.put(extendedStateToMerge.getItemInventoryIndex(), extendedStateToMerge);
                    currentState.updateWith(extendedStateToMerge, true);
                }
                result = true;
            }
        }

        return result;
    }

    private PlayerItemInstance<?> createItemInstance(EntityLivingBase entityLivingBase, int slot) {
        if (!(entityLivingBase instanceof EntityPlayer)) {
            return null;
        }

        EntityPlayer player = (EntityPlayer) entityLivingBase;
        ItemStack itemStack = player.inventory.getStackInSlot(slot);

        PlayerItemInstance<?> result = null;
        if (itemStack.getItem() instanceof PlayerItemInstanceFactory) {
            try {
                LOGGER.debug("Deserializing instance for slot {} from stack {}", slot, itemStack);
                result = Tags.getInstance(itemStack);
                LOGGER.debug("Deserialized instance {} for slot {} from stack {}", result, slot, itemStack);
            } catch (RuntimeException e) {
                LOGGER.debug("Failed to deserialize instance from {}", itemStack);
            }
            if (result == null) {
                LOGGER.debug("Creating instance for slot {} from stack {}", slot, itemStack);
                result = ((PlayerItemInstanceFactory<?, ?>) itemStack.getItem()).createItemInstance(player, itemStack, slot);
                result.markClean();
            }
            result.setItemInventoryIndex(slot);
            result.setPlayer(player);
        }

        return result;
    }

    /**
     * Maps the item stack to an item instance using the internal cache.
     * This method should be used when rendering only.
     *
     */
    public PlayerItemInstance<?> getItemInstance(EntityLivingBase player, ItemStack itemStack) { // ! TODO: This method is suspiscious as fuck - Luna Lage (Desoroxxx)
        Optional<PlayerItemInstance<?>> result = Optional.empty();
        try {
            result = itemStackInstanceCache.get(itemStack, () -> {
                LOGGER.debug("ItemStack {} not found in cache, initializing...", itemStack);
                PlayerItemInstance<?> instance = null;
                int slot = -1;
                if (MC.player == player) {
                    // For current player, the latest instance is available locally
                    for (slot = 0; slot < ((EntityPlayer) player).inventory.getSizeInventory(); slot++) {
                        if (((EntityPlayer) player).inventory.getStackInSlot(slot) == itemStack) {
                            break;
                        }
                    }
                }

                if (slot >= 0) {
                    instance = getItemInstance((EntityPlayer) player, slot);
                    LOGGER.debug("Resolved item stack instance {} in slot {}", instance, slot);
                }

                if (instance == null || instance.getItem() != itemStack.getItem()) {
                    try {
                        instance = Tags.getInstance(itemStack);
                    } catch (RuntimeException e) {
                        LOGGER.error("Failed to deserialize instance from stack {}: {}", itemStack, e.toString());
                    }
                }

                if ((instance == null || instance.getItem() != itemStack.getItem())
                        && itemStack.getItem() instanceof PlayerItemInstanceFactory) {
                    LOGGER.debug("Creating temporary item stack instance {}", instance);
                    instance = ((PlayerItemInstanceFactory<?, ?>) itemStack.getItem()).createItemInstance(player, itemStack, -1);
                    instance.setPlayer(player);
                }

                return Optional.ofNullable(instance);
            });
        } catch (UncheckedExecutionException | ExecutionException e) {
            LOGGER.error("Failed to initialize cache instance from {}", itemStack, e.getCause());
        }
        return result.orElse(null);
    }

    public void update(EntityPlayer player) {
        if (player == null) {
            return;
        }

        Map<Integer, PlayerItemInstance<?>> slotContexts = registry.get(player.getPersistentID());
        if (slotContexts != null) {
            for (Iterator<Entry<Integer, PlayerItemInstance<?>>> it = slotContexts.entrySet().iterator(); it.hasNext(); ) {
                Entry<Integer, PlayerItemInstance<?>> e = it.next();
                ItemStack slotStack = player.inventory.getStackInSlot(e.getKey());
                //log.debug("Slot {} contains item {} stack {}", e.getKey(), e.getValue(), System.identityHashCode(slotStack));
                if (slotStack == null || slotStack.getItem() != e.getValue().getItem()
                        || !e.getValue().getUuid().equals(Tags.getInstanceUuid(slotStack))) {
                    LOGGER.debug("Removing {} from slot {}", e.getValue(), e.getKey());
                    syncManager.unwatch(e.getValue());
                    it.remove();
                }
            }
        }
    }
}
