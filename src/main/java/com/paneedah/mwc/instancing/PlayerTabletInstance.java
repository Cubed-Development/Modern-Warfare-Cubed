package com.paneedah.mwc.instancing;

import com.paneedah.weaponlib.electronics.TabletState;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.perspective.WirelessCameraPerspective;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
@NoArgsConstructor
public class PlayerTabletInstance extends PlayerItemInstance<TabletState> {

    private static final String ACTIVE_WATCH_INDEX_TAG = "ACTIVE_WATCH_INDEX";

    @Getter private int activeWatchIndex;

    public PlayerTabletInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    @Override
    protected int getSerialVersion() {
        return 1;
    }

    @Override
    public Class<? extends Perspective<?>> getRequiredPerspectiveType() {
        return WirelessCameraPerspective.class;
    }

    public void previousActiveWatchIndex() {
        final LivingEntityTracker tracker = LivingEntityTracker.getTracker(player);
        if (tracker == null)
            return;

        setActiveWatchIndex((activeWatchIndex == 0 ? tracker.getTrackableEntitites().size() : activeWatchIndex) - 1);
    }

    public void nextActiveWatchIndex() {
        final LivingEntityTracker tracker = LivingEntityTracker.getTracker(player);
        if (tracker == null)
            return;

        if (activeWatchIndex >= tracker.getTrackableEntitites().size() - 1) {
            setActiveWatchIndex(0);
        } else {
            setActiveWatchIndex(activeWatchIndex + 1);
        }
    }

    // region Setters

    public void setActiveWatchIndex(final int activeWatchIndex) {
        if (this.activeWatchIndex == activeWatchIndex)
            return;

        LOGGER.debug("Changing {} active watch index to {}", toString(), activeWatchIndex);

        this.activeWatchIndex = activeWatchIndex;

        markDirty();
    }

    // endregion

    // region NBT

    @Override
    public void readInstanceFromNBT(final NBTTagCompound tagCompound) {
        super.readInstanceFromNBT(tagCompound);

        activeWatchIndex = tagCompound.getInteger(ACTIVE_WATCH_INDEX_TAG);
    }

    @Override
    public void writeInstanceToNBT(final NBTTagCompound tagCompound) {
        super.writeInstanceToNBT(tagCompound);

        tagCompound.setInteger(ACTIVE_WATCH_INDEX_TAG, activeWatchIndex);
    }

    // endregion

    // region Serialization & Deserialization

    @Override
    public void write(final ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeInt(activeWatchIndex);
    }

    @Override
    public void read(final ByteBuf byteBuf) {
        super.read(byteBuf);

        activeWatchIndex = byteBuf.readInt();
    }

    // endregion
}
