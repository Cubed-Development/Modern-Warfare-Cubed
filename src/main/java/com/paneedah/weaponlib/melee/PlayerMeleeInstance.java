package com.paneedah.weaponlib.melee;

import com.paneedah.mwc.instancing.PlayerItemInstance;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.CompatibleAttachment;
import com.paneedah.weaponlib.ItemAttachment;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

@NoArgsConstructor
public class PlayerMeleeInstance extends PlayerItemInstance<MeleeState> {

    private static final String SELECTED_ATTACHMENT_INDEXES_TAG = "SELECTED_ATTACHMENT_INDEXES";
    private static final String ACTIVE_ATTACHMENT_IDS_TAG = "ACTIVE_ATTACHMENT_IDS";
    private static final String ACTIVE_TEXTURE_INDEX_TAG = "ACTIVE_TEXTURE_INDEX";

    @Getter private byte activeTextureIndex;

    @Getter @Setter private long lastAttackTimestamp;

    @Getter private byte[] selectedAttachmentIndexes = new byte[0];

    private int[] activeAttachmentIds = new int[0];

    /*
     * Upon adding an element to the head of the queue, all existing elements with lower priority are removed from the queue.
     * Elements with the same priority are not removed.
     * This ensures the queue is always sorted by priority, lowest (head) to highest (tail).
     */
    private final Deque<AsyncMeleeState> filteredStateQueue = new ArrayDeque<>();

    public PlayerMeleeInstance(final int itemInventoryIndex, final EntityLivingBase player, final ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    /**
     * Commits pending state
     */
    @Override
    protected void updateWith(final PlayerItemInstance<MeleeState> otherItemInstance, final boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);

        final PlayerMeleeInstance otherInstance = (PlayerMeleeInstance) otherItemInstance;

        setSelectedAttachmentIndexes(otherInstance.selectedAttachmentIndexes);
        setActiveAttachmentIds(otherInstance.activeAttachmentIds);
        setActiveTextureIndex(otherInstance.activeTextureIndex);
    }

    private void addStateToHistory(final MeleeState state) {
        AsyncMeleeState asyncMeleeState;
        // Remove existing items from lower priorities from the top of the stack; stop when same or higher priority item is found
        while ((asyncMeleeState = filteredStateQueue.peekFirst()) != null) {
            if (asyncMeleeState.getState().getPriority() >= state.getPriority())
                break;

            filteredStateQueue.pollFirst();
        }

        final long expirationTimeout = 500;

        filteredStateQueue.addFirst(new AsyncMeleeState(state, stateUpdateTimestamp, expirationTimeout));
    }

    public AsyncMeleeState nextNonExpiredHistoryState() {
        final long currentTime = System.currentTimeMillis();
        AsyncMeleeState result;

        while ((result = filteredStateQueue.pollLast()) != null)
            if (result.getTimestamp() + result.getDuration() >= currentTime)
                break;

        if (result == null)
            result = new AsyncMeleeState(getState(), stateUpdateTimestamp);

        return result;
    }

    // region Getters

    @Override
    protected int getSerialVersion() {
        return 7;
    }

    public ItemMelee getMelee() {
        return (ItemMelee) item;
    }

    public int[] getActiveAttachmentIds() {
        if (activeAttachmentIds == null || activeAttachmentIds.length != AttachmentCategory.values.length) {
            activeAttachmentIds = new int[AttachmentCategory.values.length];

            for (final CompatibleAttachment<ItemMelee> attachment : getMelee().getCompatibleAttachments().values())
                if (attachment.isDefault())
                    activeAttachmentIds[attachment.getAttachment().getCategory().ordinal()] = Item.getIdFromItem(attachment.getAttachment());
        }

        return activeAttachmentIds;
    }

    void setActiveAttachmentIds(final int[] activeAttachmentIds) {
        if (Arrays.equals(this.activeAttachmentIds, activeAttachmentIds))
            return;

        this.activeAttachmentIds = activeAttachmentIds;

        markDirty();
    }

    // endregion

    // region Setters

    public ItemAttachment<ItemMelee> getAttachmentItemByCategory(AttachmentCategory category) {
        if (activeAttachmentIds == null || activeAttachmentIds.length <= category.ordinal())
            return null;

        final Item activeAttachment = Item.getItemById(activeAttachmentIds[category.ordinal()]);

        if (activeAttachment instanceof ItemAttachment)
            return (ItemAttachment<ItemMelee>) activeAttachment;

        return null;
    }

    @Override
    public boolean setState(final MeleeState state) {
        final boolean result = super.setState(state);

        addStateToHistory(state);

        return result;
    }

    void setSelectedAttachmentIndexes(final byte[] selectedAttachmentIndexes) {
        if (Arrays.equals(this.selectedAttachmentIndexes, selectedAttachmentIndexes))
            return;

        this.selectedAttachmentIndexes = selectedAttachmentIndexes;

        markDirty();
    }

    public void setActiveTextureIndex(final byte activeTextureIndex) {
        if (this.activeTextureIndex == activeTextureIndex)
            return;

        this.activeTextureIndex = activeTextureIndex;

        markDirty();
    }

    // endregion

    // region NBT

    @Override
    public void readInstanceFromNBT(final NBTTagCompound tagCompound) {
        super.readInstanceFromNBT(tagCompound);

        tagCompound.setByteArray(SELECTED_ATTACHMENT_INDEXES_TAG, selectedAttachmentIndexes);
        tagCompound.setIntArray(ACTIVE_ATTACHMENT_IDS_TAG, activeAttachmentIds);
        tagCompound.setByte(ACTIVE_TEXTURE_INDEX_TAG, activeTextureIndex);
    }

    @Override
    public void writeInstanceToNBT(final NBTTagCompound tagCompound) {
        super.writeInstanceToNBT(tagCompound);

        selectedAttachmentIndexes = tagCompound.getByteArray(SELECTED_ATTACHMENT_INDEXES_TAG);
        activeAttachmentIds = tagCompound.getIntArray(ACTIVE_ATTACHMENT_IDS_TAG);
        activeTextureIndex = tagCompound.getByte(ACTIVE_TEXTURE_INDEX_TAG);
    }

    // endregion

    // region Serialization & Deserialization

    @Override
    public void read(ByteBuf byteBuf) {
        super.read(byteBuf);

        activeTextureIndex = byteBuf.readByte();

        selectedAttachmentIndexes = readByteArray(byteBuf);

        activeAttachmentIds = readIntArray(byteBuf);
    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);

        byteBuf.writeByte(activeTextureIndex);

        writeByteArray(byteBuf, selectedAttachmentIndexes);

        writeIntArray(byteBuf, activeAttachmentIds);
    }

    // endregion
}
