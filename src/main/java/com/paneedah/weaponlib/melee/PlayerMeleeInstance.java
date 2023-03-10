package com.paneedah.weaponlib.melee;

import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.CompatibleAttachment;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.PlayerItemInstance;
import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;


public class PlayerMeleeInstance extends PlayerItemInstance<MeleeState> {

	private static final int SERIAL_VERSION = 7;

	static {
		TypeRegistry.getInstance().register(PlayerMeleeInstance.class);
	}

	private int ammo;
	private long lastFireTimestamp;
	private byte activeTextureIndex;

	private Deque<AsyncMeleeState> filteredStateQueue = new LinkedBlockingDeque<>();
	private int[] activeAttachmentIds = new int[0];
	private byte[] selectedAttachmentIndexes = new byte[0];

	public PlayerMeleeInstance() {
		super();
	}

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
	    AsyncMeleeState t;
		// Remove existing items from lower priorities from the top of the stack; stop when same or higher priority item is found
		while((t = filteredStateQueue.peekFirst()) != null) {
			if(t.getState().getPriority() < state.getPriority()) {
				filteredStateQueue.pollFirst();
			} else {
				break;
			}
		}

		long expirationTimeout = 500;

//		long expirationTimeout;
//
//		if(state == MeleeState.FIRING || state == MeleeState.RECOILED || state == MeleeState.PAUSED) {
//			if(isAutomaticModeEnabled() && !getWeapon().hasRecoilPositioning()) {
//				expirationTimeout = (long) (50f / getFireRate());
//			} else {
//				expirationTimeout = 500;
//			}
//			expirationTimeout = 500;
//		} else {
//			expirationTimeout = Integer.MAX_VALUE;
//		}
		filteredStateQueue.addFirst(new AsyncMeleeState(state, this.stateUpdateTimestamp, expirationTimeout));
	}

	@Override
	public boolean setState(MeleeState state) {
		boolean result = super.setState(state);
		addStateToHistory(state);
		return result;
	}

	public AsyncMeleeState nextHistoryState() {
	    AsyncMeleeState result = filteredStateQueue.pollLast();
        if(result == null) {
            result = new AsyncMeleeState(getState(), stateUpdateTimestamp);
        }
        return result;
	}

	public int getAmmo() {
		return ammo;
	}

	protected void setAmmo(int ammo) {
		if(ammo != this.ammo) {
			this.ammo = ammo;
			markDirty();
		}
	}

	@Override
	public void init(ByteBuf buf) {
		super.init(buf);
		activeAttachmentIds = initIntArray(buf);
		selectedAttachmentIndexes = initByteArray(buf);
		ammo = buf.readInt();
		activeTextureIndex = buf.readByte();
	}

	@Override
	public void serialize(ByteBuf buf) {
		super.serialize(buf);
		serializeIntArray(buf, activeAttachmentIds);
		serializeByteArray(buf, selectedAttachmentIndexes);
		buf.writeInt(ammo);
		buf.writeByte(activeTextureIndex);
	}

	private static void serializeIntArray(ByteBuf buf, int a[]) {
		buf.writeByte(a.length);
		for(int i = 0; i < a.length; i++) {
			buf.writeInt(a[i]);
		}
	}

	private static void serializeByteArray(ByteBuf buf, byte a[]) {
		buf.writeByte(a.length);
		for(int i = 0; i < a.length; i++) {
			buf.writeByte(a[i]);
		}
	}

	private static int[] initIntArray(ByteBuf buf) {
		int length = buf.readByte();
		int a[] = new int[length];
		for(int i = 0; i < length; i++) {
			a[i] = buf.readInt();
		}
		return a;
	}

	private static byte[] initByteArray(ByteBuf buf) {
		int length = buf.readByte();
		byte a[] = new byte[length];
		for(int i = 0; i < length; i++) {
			a[i] = buf.readByte();
		}
		return a;
	}

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
		return (ItemMelee)item;
	}



	public long getLastAttackTimestamp() {
		return lastFireTimestamp;
	}

	void setLastAttackTimestamp(long lastFireTimestamp) {
		this.lastFireTimestamp = lastFireTimestamp;
	}

	public int[] getActiveAttachmentIds() {
		if(activeAttachmentIds == null || activeAttachmentIds.length != AttachmentCategory.values.length) {
			activeAttachmentIds = new int[AttachmentCategory.values.length];
			for(CompatibleAttachment<ItemMelee> attachment: getWeapon().getCompatibleAttachments().values()) {
				if(attachment.isDefault()) {
					activeAttachmentIds[attachment.getAttachment().getCategory().ordinal()] = Item.getIdFromItem(attachment.getAttachment());
				}
			}
		}
		return activeAttachmentIds;
	}

	void setActiveAttachmentIds(int[] activeAttachmentIds) {
		if(!Arrays.equals(this.activeAttachmentIds, activeAttachmentIds)) {
			this.activeAttachmentIds = activeAttachmentIds;
			markDirty();
		}
	}

	public byte[] getSelectedAttachmentIds() {
		return selectedAttachmentIndexes;
	}

	void setSelectedAttachmentIndexes(byte[] selectedAttachmentIndexes) {
		if(!Arrays.equals(this.selectedAttachmentIndexes, selectedAttachmentIndexes)) {
			this.selectedAttachmentIndexes = selectedAttachmentIndexes;
			markDirty();
		}
	}

	@SuppressWarnings("unchecked")
	public ItemAttachment<ItemMelee> getAttachmentItemWithCategory(AttachmentCategory category) {
		if(activeAttachmentIds == null || activeAttachmentIds.length <= category.ordinal()) {
			return null;
		}
		Item scopeItem = Item.getItemById(activeAttachmentIds[category.ordinal()]);
		return (ItemAttachment<ItemMelee>) scopeItem;
	}

	public int getActiveTextureIndex() {
		return activeTextureIndex;
	}

	public void setActiveTextureIndex(int activeTextureIndex) {
		if(this.activeTextureIndex != activeTextureIndex) {
			if(activeTextureIndex > Byte.MAX_VALUE) {
				throw new IllegalArgumentException("activeTextureIndex must be less than " + Byte.MAX_VALUE);
			}
			this.activeTextureIndex = (byte)activeTextureIndex;
			markDirty();
		}

	}

	@Override
	public String toString() {
		return getWeapon().builder.name + "[" + getUuid() + "]";
	}

}
