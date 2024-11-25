package com.paneedah.mwc.instancing;

import com.paneedah.weaponlib.grenade.AsyncGrenadeState;
import com.paneedah.weaponlib.grenade.GrenadeState;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@NoArgsConstructor
public class PlayerGrenadeInstance extends PlayerItemInstance<GrenadeState> {

    private static final String THROWING_FAR_TAG = "THROWING_FAR";

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

    // region NBT

    @Override
    public void readInstanceFromNBT(final NBTTagCompound tagCompound) {
        super.readInstanceFromNBT(tagCompound);

        throwingFar = tagCompound.getBoolean(THROWING_FAR_TAG);
    }

    @Override
    public void writeInstanceToNBT(final NBTTagCompound tagCompound) {
        super.writeInstanceToNBT(tagCompound);

        tagCompound.setBoolean(THROWING_FAR_TAG, throwingFar);
    }

    // endregion

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
