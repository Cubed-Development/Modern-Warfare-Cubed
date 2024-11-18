package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.PlayerItemInstance;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import java.util.ArrayDeque;
import java.util.Deque;

@NoArgsConstructor
public class PlayerGrenadeInstance extends PlayerItemInstance<GrenadeState> {

    @Getter @Setter private boolean throwingFar;

    /*
     * Upon adding an element to the head of the queue, all existing elements with lower priority are removed from the queue.
     * Elements with the same priority are not removed.
     * This ensures the queue is always sorted by priority, lowest (head) to highest (tail).
     */
    private final Deque<AsyncGrenadeState> filteredStateQueue = new ArrayDeque<>();

    public PlayerGrenadeInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    @Override
    protected int getSerialVersion() {
        return 11;
    }

    public ItemGrenade getGrenade() {
        return (ItemGrenade) item;
    }

    @Override
    public boolean setState(final GrenadeState state) {
        final boolean result = super.setState(state);

        addStateToHistory(state);

        return result;
    }

    private void addStateToHistory(final GrenadeState state) {
        // Remove existing items from lower priorities from the top of the stack; stop when same or higher priority item is found
        AsyncGrenadeState asyncGrenadeState;
        while ((asyncGrenadeState = filteredStateQueue.peekFirst()) != null) {
            if (asyncGrenadeState.getState().getPriority() >= state.getPriority())
                break;

            filteredStateQueue.pollFirst();
        }

        final long expirationTimeout = 500;

        filteredStateQueue.addFirst(new AsyncGrenadeState(state, stateUpdateTimestamp, expirationTimeout));
    }

    public AsyncGrenadeState nextNonExpiredHistoryState() {
        final long currentTime = System.currentTimeMillis();
        AsyncGrenadeState result;

        while ((result = filteredStateQueue.pollLast()) != null)
            if (result.getTimestamp() + result.getDuration() >= currentTime)
                break;

        if (result == null)
            result = new AsyncGrenadeState(getState(), stateUpdateTimestamp);

        return result;
    }

    // region Serialization & Deserialization

    @Override
    public void read(final ByteBuf byteBuf) {
        super.read(byteBuf);

        throwingFar = byteBuf.readBoolean();
    }

    @Override
    public void write(final ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeBoolean(throwingFar);
    }

    // endregion
}
