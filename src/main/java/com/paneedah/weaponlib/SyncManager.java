package com.paneedah.weaponlib;

import com.paneedah.mwc.network.NetworkPermitManager;
import com.paneedah.weaponlib.state.ManagedState;
import com.paneedah.weaponlib.state.Permit;
import net.minecraft.item.ItemStack;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class SyncManager<S extends ManagedState<S>> {

    private final NetworkPermitManager permitManager;

    private final Map<PlayerItemInstance<?>, Long> watchables = new LinkedHashMap<>();

    private final long syncTimeout = 10000;


    public SyncManager(NetworkPermitManager permitManager) {
        this.permitManager = permitManager;
        this.permitManager.registerEvaluator(Permit.class, PlayerItemInstance.class, this::syncOnServer);
    }

    private void syncOnServer(Permit<S> permit, PlayerItemInstance<S> instance) {
        LOGGER.debug("Syncing {} in state {} on server", instance, instance.getState());
        ItemStack itemStack = instance.getItemStack();
        if (instance.getItem() == itemStack.getItem()) {
            LOGGER.debug("Stored instance {} of {} in stack {}", instance, instance.getItem(), itemStack);
            instance.reconcile();
            if (instance.shouldHaveInstanceTags()) {
                Tags.setInstance(itemStack, instance);
            }
        } else {
            LOGGER.debug("Item mismatch, expected: {}, actual: {}", instance.getItem().getTranslationKey(),
                    itemStack.getItem().getTranslationKey());
        }
    }

    public void watch(PlayerItemInstance<?> watchableInstance) {
        watchables.put(watchableInstance, Long.valueOf(watchableInstance.getUpdateId()));
    }

    public void unwatch(PlayerItemInstance<?> watchableInstance) {
        watchables.remove(watchableInstance);
    }

    public void run() {
        List<PlayerItemInstance<?>> instancesToUpdate = watchables.entrySet().stream().filter(e -> e.getKey().getUpdateId() != e.getValue().longValue() /*&& !e.getKey().getState().isTransient()*/ && e.getKey().getSyncStartTimestamp() + syncTimeout < System.currentTimeMillis()).map(Map.Entry::getKey).collect(Collectors.toList());
        instancesToUpdate.forEach(this::sync);
    }


    private void sync(PlayerItemInstance<?> watchable) {
        LOGGER.debug("Syncing {} in state {} with update id {} to server", watchable, watchable.getState(), watchable.getUpdateId());
        long updateId = watchable.getUpdateId(); // capturing update id
        watchable.setSyncStartTimestamp(System.currentTimeMillis());
        permitManager.request(new Permit<>((S) watchable.getState()), (PlayerItemInstance<S>) watchable, (p, e) -> {
            // During sync, the watchable.getUpdateId() can change, so using the original update id
            watchables.put(watchable, Long.valueOf(updateId));
            watchable.setSyncStartTimestamp(0);
            LOGGER.debug("Completed syncing {} with update id {}", watchable, updateId);
        });
    }
}
