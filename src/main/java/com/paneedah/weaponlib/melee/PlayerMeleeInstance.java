package com.paneedah.weaponlib.melee;

import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.CompatibleAttachment;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.PlayerItemInstance;
import io.netty.buffer.ByteBuf;
import lombok.NoArgsConstructor;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

@NoArgsConstructor
public class PlayerMeleeInstance extends PlayerItemInstance<MeleeState> {

    private static final int SERIAL_VERSION = 7;
    private final Deque<AsyncMeleeState> filteredStateQueue = new ArrayDeque<>();
    private int ammo;
    private long lastFireTimestamp;
    private byte activeTextureIndex;
    private int[] activeAttachmentIds = new int[0];
    private byte[] selectedAttachmentIndexes = new byte[0];

    public PlayerMeleeInstance(int itemInventoryIndex, EntityLivingBase player, ItemStack itemStack) {
        super(itemInventoryIndex, player, itemStack);
    }

    public PlayerMeleeInstance(int itemInventoryIndex, EntityLivingBase player) {
        super(itemInventoryIndex, player);
    }

    @Override
    protected int getSerialVersion() {
        return SERIAL_VERSION;
    }

    private void addStateToHistory(MeleeState state) {
        // Remove existing items from lower priorities from the top of the stack; stop when same or higher priority item is found
        AsyncMeleeState asyncMeleeState;
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

    @Override
    public boolean setState(MeleeState state) {
        boolean result = super.setState(state);
        addStateToHistory(state);
        return result;
    }

    public int getAmmo() {
        return ammo;
    }

    protected void setAmmo(int ammo) {
        if (ammo != this.ammo) {
            this.ammo = ammo;
            markDirty();
        }
    }

    /**
     * Commits pending state
     */
    @Override
    protected void updateWith(PlayerItemInstance<MeleeState> otherItemInstance, boolean updateManagedState) {
        super.updateWith(otherItemInstance, updateManagedState);
        PlayerMeleeInstance otherWeaponInstance = (PlayerMeleeInstance) otherItemInstance;

        setAmmo(otherWeaponInstance.ammo);
        setSelectedAttachmentIndexes(otherWeaponInstance.selectedAttachmentIndexes);
        setActiveAttachmentIds(otherWeaponInstance.activeAttachmentIds);
        setActiveTextureIndex(otherWeaponInstance.activeTextureIndex);
    }

    public ItemMelee getWeapon() {
        return (ItemMelee) item;
    }


    public long getLastAttackTimestamp() {
        return lastFireTimestamp;
    }

    void setLastAttackTimestamp(long lastFireTimestamp) {
        this.lastFireTimestamp = lastFireTimestamp;
    }

    public int[] getActiveAttachmentIds() {
        if (activeAttachmentIds == null || activeAttachmentIds.length != AttachmentCategory.values.length) {
            activeAttachmentIds = new int[AttachmentCategory.values.length];
            for (CompatibleAttachment<ItemMelee> attachment : getWeapon().getCompatibleAttachments().values()) {
                if (attachment.isDefault()) {
                    activeAttachmentIds[attachment.getAttachment().getCategory().ordinal()] = Item.getIdFromItem(attachment.getAttachment());
                }
            }
        }
        return activeAttachmentIds;
    }

    void setActiveAttachmentIds(int[] activeAttachmentIds) {
        if (!Arrays.equals(this.activeAttachmentIds, activeAttachmentIds)) {
            this.activeAttachmentIds = activeAttachmentIds;
            markDirty();
        }
    }

    public byte[] getSelectedAttachmentIds() {
        return selectedAttachmentIndexes;
    }

    void setSelectedAttachmentIndexes(byte[] selectedAttachmentIndexes) {
        if (!Arrays.equals(this.selectedAttachmentIndexes, selectedAttachmentIndexes)) {
            this.selectedAttachmentIndexes = selectedAttachmentIndexes;
            markDirty();
        }
    }


    public ItemAttachment<ItemMelee> getAttachmentItemWithCategory(AttachmentCategory category) {
        if (activeAttachmentIds == null || activeAttachmentIds.length <= category.ordinal()) {
            return null;
        }
        Item scopeItem = Item.getItemById(activeAttachmentIds[category.ordinal()]);
        return (ItemAttachment<ItemMelee>) scopeItem;
    }

    public int getActiveTextureIndex() {
        return activeTextureIndex;
    }

    public void setActiveTextureIndex(int activeTextureIndex) {
        if (this.activeTextureIndex != activeTextureIndex) {
            if (activeTextureIndex > Byte.MAX_VALUE) {
                throw new IllegalArgumentException("activeTextureIndex must be less than " + Byte.MAX_VALUE);
            }
            this.activeTextureIndex = (byte) activeTextureIndex;
            markDirty();
        }

    }

    // ! INSTANCE_TAG TODO: Once NBT does not use serialized data, improve serialization
    // region Serialization & Deserialization

    @Override
    public void read(ByteBuf byteBuf) {
        super.read(byteBuf);

        activeAttachmentIds = readIntArray(byteBuf);
        selectedAttachmentIndexes = readByteArray(byteBuf);
        ammo = byteBuf.readInt();
        activeTextureIndex = byteBuf.readByte();
    }

    @Override
    public void write(ByteBuf byteBuf) {
        super.write(byteBuf);

        writeIntArray(byteBuf, activeAttachmentIds);
        writeByteArray(byteBuf, selectedAttachmentIndexes);
        byteBuf.writeInt(ammo);
        byteBuf.writeByte(activeTextureIndex);
    }

    // endregion
}
