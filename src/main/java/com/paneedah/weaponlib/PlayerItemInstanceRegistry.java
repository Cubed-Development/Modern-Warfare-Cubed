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

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class PlayerItemInstanceRegistry {
	
	private static final int CACHE_EXPIRATION_TIMEOUT_SECONDS = 5;

	private Map<UUID, Map<Integer, PlayerItemInstance<?>>> registry = new HashMap<>();
	
	private SyncManager<?> syncManager;
	
	private Cache<ItemStack, Optional<PlayerItemInstance<?>>> itemStackInstanceCache;
	
	public PlayerItemInstanceRegistry(SyncManager<?> syncManager) {
		this.syncManager = syncManager;
		this.itemStackInstanceCache = CacheBuilder
				.newBuilder()
				.weakKeys()
				.maximumSize(1000)
				.expireAfterAccess(CACHE_EXPIRATION_TIMEOUT_SECONDS, TimeUnit.SECONDS)
				.build();
	}

	/**
	 * Returns instance of the target class, or null if there is no instance or instance class does not match.
	 * 
	 * @param player
	 * @param targetClass
	 * @return
	 */
	public <T extends PlayerItemInstance<S>, S extends ManagedState<S>> T getMainHandItemInstance(EntityLivingBase player, Class<T> targetClass) {
		if(player == null && !(player instanceof EntityPlayer))
			return null;

		PlayerItemInstance<?> instance = getItemInstance((EntityPlayer) player, compatibility.getCurrentInventoryItemIndex((EntityPlayer) player));
		return targetClass.isInstance(instance) ? targetClass.cast(instance) : null;
	}
	
	public PlayerItemInstance<?> getMainHandItemInstance(EntityLivingBase player) {
	    if(player == null && !(player instanceof EntityPlayer))
            return null;

	    return getItemInstance((EntityPlayer) player, compatibility.getCurrentInventoryItemIndex((EntityPlayer) player));
	}
	
	public PlayerItemInstance<?> getItemInstance(EntityPlayer player, int slot) {
		Map<Integer, PlayerItemInstance<?>> slotInstances = registry.computeIfAbsent(player.getPersistentID(), p -> new HashMap<>());
		PlayerItemInstance<?> result = slotInstances.get(slot);

		if (result == null) {
			result = createItemInstance(player, slot);

			if (result == null)
				return null;

			ItemStack slotItemStack = compatibility.getInventoryItemStack(player, slot);
			if(slotItemStack != null && result.shouldHaveInstanceTags())
				Tags.setInstanceUuid(slotItemStack, result.getUuid());

			slotInstances.put(slot, result);
			syncManager.watch(result);

			if(result.getUpdateId() == 0) // sync to server if newly created
				result.markDirty();

			return result;
		}

		ItemStack slotItemStack = compatibility.getInventoryItemStack(player, slot);
		if (slotItemStack != null && (slotItemStack.getItem() != result.getItem() || !result.getUuid().equals(Tags.getInstanceUuid(slotItemStack)))) {
			syncManager.unwatch(result);
			result = createItemInstance(player, slot);

			if (result == null)
				return null;

			if(result.shouldHaveInstanceTags())
				Tags.setInstanceUuid(slotItemStack, result.getUuid());

			slotInstances.put(slot, result);
			syncManager.watch(result);

			if(result.getUpdateId() == 0) // sync to server if newly created
				result.markDirty();
		}

		if (result.getItemInventoryIndex() != slot) {
			log.warn("Invalid instance slot id, correcting...");
			result.setItemInventoryIndex(slot);
		}

		if (result.getPlayer() != player) {
			log.warn("Invalid player " + result.getPlayer() + " associated with instance in slot, changing to {}", player);
			result.setPlayer(player);
		}

		return result;
	}

	private boolean isSameItem(PlayerItemInstance<?> instance1, PlayerItemInstance<?> instance2) {
		return Item.getIdFromItem(instance1.getItem()) == Item.getIdFromItem(instance2.getItem());
	}
	
	@SuppressWarnings("unchecked")
	public <S extends ManagedState<S>, T extends PlayerItemInstance<S>> boolean update(S newManagedState, T extendedStateToMerge) {
		Map<Integer, PlayerItemInstance<?>> slotContexts = registry.get(extendedStateToMerge.getPlayer().getUniqueID());
		if (slotContexts == null)
			return false;

		T currentState = (T) slotContexts.get(extendedStateToMerge.getItemInventoryIndex());
		if(currentState == null || !isSameItem(currentState, extendedStateToMerge))
			return false;

		extendedStateToMerge.setState(newManagedState); // why do we set it here?
		if(newManagedState.commitPhase() != null) currentState.prepareTransaction(extendedStateToMerge);
		else currentState.updateWith(extendedStateToMerge, true);
		//slotContexts.put(extendedStateToMerge.getItemInventoryIndex(), extendedStateToMerge);
		
		return true;
	}

	private PlayerItemInstance<?> createItemInstance(EntityLivingBase entityLivingBase, int slot) {
	    if(!(entityLivingBase instanceof EntityPlayer))
	        return null;
	    
	    EntityPlayer player = (EntityPlayer) entityLivingBase;
		ItemStack itemStack = compatibility.getInventoryItemStack(player, slot);
		PlayerItemInstance<?> result = null;

		if(itemStack != null && itemStack.getItem() instanceof PlayerItemInstanceFactory) {
			try {
			    log.debug("Deserializing instance for slot {} from stack {}", slot, itemStack);
				result = Tags.getInstance(itemStack);
				log.debug("Deserialized instance {} for slot {} from stack {}", result, slot, itemStack);
			}

			catch(RuntimeException e) { log.debug("Failed to deserialize instance from {}", itemStack); }

			if(result == null) {
			    log.debug("Creating instance for slot {} from stack {}", slot, itemStack);
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
	 * @param player
	 * @param itemStack
	 * @return
	 */
	public PlayerItemInstance<?> getItemInstance(EntityLivingBase player, ItemStack itemStack) {
		Optional<PlayerItemInstance<?>> result = Optional.empty();
		try {
			result = itemStackInstanceCache.get(itemStack, () -> {
				log.debug("ItemStack {} not found in cache, initializing...", itemStack);

				PlayerItemInstance<?> instance = null;
				int slot = -1;

				if(compatibility.clientPlayer() == player)
				    // For current player, the latest instance is available locally
				    slot = compatibility.getInventorySlot((EntityPlayer)player, itemStack);
				
				if(slot >= 0) {
					instance = getItemInstance((EntityPlayer) player, slot);
					log.debug("Resolved item stack instance {} in slot {}", instance, slot);
				}
				
				if(instance == null || instance.getItem() != itemStack.getItem()) {
					try { instance = Tags.getInstance(itemStack); }
					catch(RuntimeException e) { log.error("Failed to deserialize instance from stack {}: {}", itemStack, e.toString()); }
				}
				
				if((instance == null || instance.getItem() != itemStack.getItem()) && itemStack.getItem() instanceof PlayerItemInstanceFactory) {
				    log.debug("Creating temporary item stack instance {}", instance);
                    instance = ((PlayerItemInstanceFactory<?, ?>) itemStack.getItem()).createItemInstance(player, itemStack, -1);
		            instance.setPlayer(player);
		        }
				
				return Optional.ofNullable(instance);
			});

		} catch (Exception e) { log.error("Failed to initialize cache instance from {}", itemStack, e.getCause()); }

		return result.orElse(null);
	}

	@SuppressWarnings({ "rawtypes" })
	public void update(EntityPlayer player) {
		if(player == null)
			return;
		
		Map<Integer, PlayerItemInstance<?>> slotContexts = registry.get(player.getPersistentID());
		if (slotContexts == null)
			return;

		for(Iterator<Entry<Integer, PlayerItemInstance<?>>> it = slotContexts.entrySet().iterator(); it.hasNext();) {
			Entry<Integer, PlayerItemInstance<?>> e = it.next();
			ItemStack slotStack = compatibility.getInventoryItemStack(player, e.getKey());

			if(slotStack == null || slotStack.getItem() != e.getValue().getItem() || !e.getValue().getUuid().equals(Tags.getInstanceUuid(slotStack))) {
				log.debug("Removing {} from slot {}", e.getValue(), e.getKey());
				syncManager.unwatch((PlayerItemInstance) e.getValue());
				it.remove();
			}
		}
	}
}
