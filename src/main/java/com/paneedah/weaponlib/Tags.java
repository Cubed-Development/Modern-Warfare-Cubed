package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.UUID;

public final class Tags {

	private static final String AMMO_TAG = "Ammo";

	private static final String DEFAULT_TIMER_TAG = "DefaultTimer";

	private static final String INSTANCE_TAG = "Instance";
	
	private static final String ATTACHMENT_ID_TAG = "AtId";
	
	private static final String INSTANCE_UUID_TAG = "IUuid";

	public static int getAmmo(ItemStack itemStack) {
		if(itemStack == null || itemStack.getTagCompound() == null) return 0;
		return itemStack.getTagCompound().getInteger(AMMO_TAG);
	}

	public static void setAmmo(ItemStack itemStack, int ammo) {
		if(itemStack == null) return;
		if (itemStack.getTagCompound() == null)
			itemStack.setTagCompound(new NBTTagCompound());
		itemStack.getTagCompound().setInteger(AMMO_TAG, ammo);
	}

	public static int[] getAttachmentIds(ItemStack itemStack) {
        if(itemStack == null || itemStack.getTagCompound() == null) return new int[0];
        return itemStack.getTagCompound().getIntArray(ATTACHMENT_ID_TAG);
    }

	public static void setAttachmentIds(ItemStack itemStack, int[] attachmentIds) {
        if(itemStack == null) return;
		if (itemStack.getTagCompound() == null)
			itemStack.setTagCompound(new NBTTagCompound());
        itemStack.getTagCompound().setIntArray(ATTACHMENT_ID_TAG, attachmentIds);
    }

	public static long getDefaultTimer(ItemStack itemStack) {
		if(itemStack == null || itemStack.getTagCompound() == null) return 0;
		return itemStack.getTagCompound().getLong(DEFAULT_TIMER_TAG);
	}

	public static void setDefaultTimer(ItemStack itemStack, long ammo) {
		if(itemStack == null || itemStack.getTagCompound() == null) return;
		itemStack.getTagCompound().setLong(DEFAULT_TIMER_TAG, ammo);
	}

	public static PlayerItemInstance<?> getInstance(ItemStack itemStack) {
		if(itemStack == null || itemStack.getTagCompound() == null) return null;

		byte[] bytes = itemStack.getTagCompound().getByteArray(INSTANCE_TAG);
		if(bytes != null && bytes.length > 0) {
			return TypeRegistry.getInstance().fromBytes(Unpooled.wrappedBuffer(bytes));
		}
		return null;
	}

	public static <T extends PlayerItemInstance<?>> T getInstance(ItemStack itemStack, Class<T> targetClass) {
		if(itemStack == null || itemStack.getTagCompound() == null) return null;

		byte[] bytes = itemStack.getTagCompound().getByteArray(INSTANCE_TAG);
		if(bytes != null && bytes.length > 0) {
			try {
				return targetClass.cast(TypeRegistry.getInstance().fromBytes(Unpooled.wrappedBuffer(bytes)));
			} catch(RuntimeException e) {
				return null;
			}
		}
		return null;
	}

	public static void setInstance(ItemStack itemStack, PlayerItemInstance<?> instance) {
		if(itemStack == null)
			return;

		if (itemStack.getTagCompound() == null)
			itemStack.setTagCompound(new NBTTagCompound());

		ByteBuf buf = Unpooled.buffer();
		if(instance != null) {
			TypeRegistry.getInstance().toBytes(instance, buf);
			NBTTagCompound tagCompound = itemStack.getTagCompound();
            tagCompound.setByteArray(INSTANCE_TAG, buf.array());

			UUID uuid = instance.getUuid();

			tagCompound.setLong(INSTANCE_UUID_TAG + "Most", uuid.getMostSignificantBits());
			tagCompound.setLong(INSTANCE_UUID_TAG + "Least", uuid.getLeastSignificantBits());
		} else {
			NBTTagCompound tagCompound = itemStack.getTagCompound();
            tagCompound.removeTag(INSTANCE_TAG);
            tagCompound.removeTag(INSTANCE_UUID_TAG);
		}
	}
	
	public static UUID getInstanceUuid(ItemStack itemStack) {
	    if(itemStack == null) return null;
	    NBTTagCompound tagCompound = itemStack.getTagCompound();
	    if(tagCompound == null) return null;
	    UUID uuid = new UUID(tagCompound.getLong(INSTANCE_UUID_TAG + "Most"), tagCompound.getLong(INSTANCE_UUID_TAG + "Least"));
	    if(uuid.getMostSignificantBits() == 0L && uuid.getLeastSignificantBits() == 0L) {
	        return null;
	    }
	    return uuid;
	}
	
	public static void setInstanceUuid(ItemStack itemStack, UUID uuid) {
	    if(itemStack == null)
			return;

		if (itemStack.getTagCompound() == null)
			itemStack.setTagCompound(new NBTTagCompound());

        NBTTagCompound tagCompound = itemStack.getTagCompound();

		tagCompound.setLong(INSTANCE_UUID_TAG + "Most", uuid.getMostSignificantBits());
		tagCompound.setLong(INSTANCE_UUID_TAG + "Least", uuid.getLeastSignificantBits());
    }

	public static byte[] getInstanceBytes(ItemStack itemStack) {
		if(itemStack == null || itemStack.getTagCompound() == null) return null;
		return itemStack.getTagCompound().getByteArray(INSTANCE_TAG);
	}
}
