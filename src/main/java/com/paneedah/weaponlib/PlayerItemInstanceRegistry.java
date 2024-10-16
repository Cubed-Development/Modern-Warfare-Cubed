package com.paneedah.weaponlib;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.paneedah.weaponlib.state.ManagedState;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

/**
 * A registry that manages {@link PlayerItemInstance} objects associated with players.
 * <p>
 * Provides methods to retrieve, create, and update item instances for players based on their inventory slots.
 *
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.1
 */
public final class PlayerItemInstanceRegistry {

    /**
     * A registry mapping player UUIDs to their inventory slot item instances.
     */
    private final Map<UUID, Int2ObjectMap<PlayerItemInstance<?>>> registry = new HashMap<>();

    /**
     * A cache mapping {@link ItemStack}s to their corresponding {@link PlayerItemInstance}s for rendering purposes.
     */
    private final Cache<ItemStack, Optional<PlayerItemInstance<?>>> itemStackInstanceCache = CacheBuilder
            .newBuilder()
            .weakKeys()
            .maximumSize(1024)
            .build();

    /**
     * The synchronization manager used to watch and unwatch item instances for state synchronization.
     */
    private final SyncManager<?> syncManager;

    public PlayerItemInstanceRegistry(final SyncManager<?> syncManager) {
        this.syncManager = syncManager;
    }

    /**
     * Retrieves the {@link PlayerItemInstance} held in the player's main hand if it is of the specified target class.
     *
     * @param player The player whose main hand item instance is to be retrieved
     * @param targetClass The class of the item instance to retrieve
     * @param <T> The type of the item instance
     * @param <S> The type of the managed state associated with the item instance
     *
     * @return The item instance of the specified type in the player's main hand, or {@code null} if not found
     */
    public <T extends PlayerItemInstance<S>, S extends ManagedState<S>> T getMainHandItemInstance(final EntityPlayer player, final Class<T> targetClass) {
        final PlayerItemInstance<?> instance = getMainHandItemInstance(player);

        return targetClass.isInstance(instance) ? targetClass.cast(instance) : null;
    }

    /**
     * Retrieves the {@link PlayerItemInstance} held in the player's main hand
     *
     * @param player The player whose main hand item instance is to be retrieved
     *
     * @return The item instance in the player's main hand, or {@code null} if not found
     */
    public PlayerItemInstance<?> getMainHandItemInstance(final EntityPlayer player) {
        if (player == null)
            return null;

        return getItemInstance(player, player.inventory.currentItem);
    }

    /**
     * Retrieves the {@link PlayerItemInstance} for a specific inventory slot of the player.
     *
     * @param player The player whose item instance is to be retrieved
     * @param slot The inventory slot index
     *
     * @return The item instance in the specified slot, or {@code null} if not found
     */
    public PlayerItemInstance<?> getItemInstance(final EntityPlayer player, final int slot) {
        final Int2ObjectMap<PlayerItemInstance<?>> slotInstances = registry.computeIfAbsent(player.getPersistentID(), uuid -> new Int2ObjectOpenHashMap<>());
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

    /**
     * Creates a new {@link PlayerItemInstance} for the specified player and slot.
     *
     * @param player The player for whom the item instance is to be created
     * @param slotInstances The map of slot indices to item instances for the player
     * @param slot The inventory slot index
     *
     * @return The newly created item instance, or {@code null} if creation failed
     */
    private PlayerItemInstance<?> createItemInstance(final EntityPlayer player, final Int2ObjectMap<PlayerItemInstance<?>> slotInstances, final int slot) {
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
     * Retrieves a cached {@link PlayerItemInstance} associated with the given {@link ItemStack} for rendering purposes.
     * <p>
     * This method should be used only on the client side during rendering.
     *
     * @param entityLiving The entity holding the item stack
     * @param itemStack The item stack whose associated item instance is to be retrieved
     *
     * @return The cached item instance, or {@code null} if not found
     */
    @SideOnly(CLIENT)
    public PlayerItemInstance<?> getCachedItemInstance(final EntityLivingBase entityLiving, final ItemStack itemStack) {
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

    /**
     * Updates an existing {@link PlayerItemInstance} with a new managed state.
     *
     * @param newManagedState The new managed state to apply
     * @param extendedStateToMerge The item instance containing the extended state to merge
     * @param <S> The type of the managed state
     * @param <T> The type of the item instance
     *
     * @return {@code true} if the update was successful, {@code false} otherwise
     */
    public <S extends ManagedState<S>, T extends PlayerItemInstance<S>> boolean update(final S newManagedState, final T extendedStateToMerge) {
        final Int2ObjectMap<PlayerItemInstance<?>> slotInstances = registry.get(extendedStateToMerge.getPlayer().getUniqueID());

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

    /**
     * Updates the item instances for the specified player, removing any instances that no longer match the items in the player's inventory.
     *
     * @param player The player whose item instances are to be updated
     */
    public void update(final EntityPlayer player) {
        if (player == null)
            return;

        final Int2ObjectMap<PlayerItemInstance<?>> slotInstances = registry.get(player.getPersistentID());

        if (slotInstances == null)
            return;

        for (final ObjectIterator<Int2ObjectMap.Entry<PlayerItemInstance<?>>> iterator = slotInstances.int2ObjectEntrySet().iterator(); iterator.hasNext(); ) {
            final Int2ObjectMap.Entry<PlayerItemInstance<?>> entry = iterator.next();
            final ItemStack slotStack = player.inventory.getStackInSlot(entry.getIntKey());

//            log.debug("Slot {} contains item {} stack {}", e.getKey(), e.getValue(), System.identityHashCode(slotStack));

            if (itemStackMatchesInstance(slotStack, entry.getValue()))
                continue;

            LOGGER.debug("Removing {} in slot {} from the item instance registry", entry.getValue(), entry.getIntKey());
            syncManager.unwatch(entry.getValue());
            iterator.remove();
        }
    }

    /**
     * Checks whether the given {@link ItemStack} matches the specified {@link PlayerItemInstance}.
     *
     * @param itemStack The item stack to check
     * @param instance The item instance to compare against
     *
     * @return {@code true} if the item stack matches the item instance, {@code false} otherwise
     */
    private boolean itemStackMatchesInstance(final ItemStack itemStack, final PlayerItemInstance<?> instance) {
        return itemStack.getItem() == instance.getItem() && instance.getUuid().equals(Tags.getInstanceUuid(itemStack));
    }

    // region Debug

    /**
     * Retrieves the current size of the item stack instance cache.
     *
     * @return The number of entries in the cache.
     */
    public long getCacheSize() {
        return itemStackInstanceCache.size();
    }

    /**
     * Invalidates the cache, forcing all cached instances to be re-created next time they are accessed.
     */
    public void invalidateCache() {
        itemStackInstanceCache.invalidateAll();
    }

    /**
     * Clears the item instance registry, removing all registered instances, they will be re-created next time they are accessed.
     */
    public void clearRegistry() {
        registry.clear();
    }

    // endregion
}
