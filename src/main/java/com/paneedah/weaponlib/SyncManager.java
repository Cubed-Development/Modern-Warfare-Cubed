package com.paneedah.weaponlib;

import com.paneedah.weaponlib.state.ManagedState;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.PermitManager;
import net.minecraft.item.ItemStack;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.paneedah.mw.utils.ModReference.log;

public class SyncManager<S extends ManagedState<S>> {

	private PermitManager permitManager;
	
	private Map<PlayerItemInstance<?>, Long> watchables = new LinkedHashMap<>();
	
	private long syncTimeout = 10000;
	
	@SuppressWarnings("unchecked")
	public SyncManager(PermitManager permitManager) {
		this.permitManager = permitManager;
		this.permitManager.registerEvaluator(Permit.class, PlayerItemInstance.class, this::syncOnServer);
	}
	
	private void syncOnServer(Permit<S> permit, PlayerItemInstance<S> instance) {
	    log.debug("Syncing {} in state {} on server", instance, instance.getState());
        ItemStack itemStack = instance.getItemStack();
        if(itemStack != null) {
            if(instance.getItem() == itemStack.getItem()) {
                log.debug("Stored instance {} of {} in stack {}", instance, instance.getItem(), itemStack);
                instance.reconcile();
                if(instance.shouldHaveInstanceTags()) Tags.setInstance(itemStack, instance);
            } else {
                log.debug("Item mismatch, expected: {}, actual: {}", instance.getItem().getTranslationKey(), 
                        itemStack.getItem().getTranslationKey());
            }
        }
	}

	public void watch(PlayerItemInstance<?> watchableInstance) {
		watchables.put(watchableInstance, watchableInstance.getUpdateId());
	}
	
	public void unwatch(PlayerItemInstance<?> watchableInstance) {
		watchables.remove(watchableInstance);
	}
	
	public void run() {
		List<PlayerItemInstance<?>> instancesToUpdate = watchables.entrySet().stream()
				.filter(e -> e.getKey().getUpdateId() != e.getValue() 
							//&& !e.getKey().getState().isTransient()
							&& e.getKey().getSyncStartTimestamp() + syncTimeout < System.currentTimeMillis())
				.map(e -> e.getKey())
				.collect(Collectors.toList());
		instancesToUpdate.forEach(this::sync);
	}
	
	@SuppressWarnings("unchecked")
	private void sync(PlayerItemInstance<?> watchable) {
		log.debug("Syncing {} in state {} with update id {} to server", watchable, watchable.getState(), watchable.getUpdateId());
		long updateId = watchable.getUpdateId(); // capturing update id
		watchable.setSyncStartTimestamp(System.currentTimeMillis());
		permitManager.request(new Permit<S>((S) watchable.getState()), (PlayerItemInstance<S>)watchable, (p, e) -> {
			// During sync, the watchable.getUpdateId() can change, so using the original update id
			watchables.put(watchable, updateId); 
			watchable.setSyncStartTimestamp(0);
			log.debug("Completed syncing {} with update id {}", watchable, updateId);
		});
	}
}
