package com.paneedah.weaponlib;

import com.paneedah.weaponlib.network.TypeRegistry;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.UUID;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public final class Tags {

	private static final String AMMO_TAG = "Ammo";

	private static final String DEFAULT_TIMER_TAG = "DefaultTimer";

	private static final String INSTANCE_TAG = "Instance";
	
	private static final String ATTACHMENT_ID_TAG = "AtId";
	
	private static final String INSTANCE_UUID_TAG = "IUuid";

	static int getAmmo(ItemStack itemStack) {
		if(itemStack == null || compatibility.getTagCompound(itemStack) == null) return 0;
		return compatibility.getTagCompound(itemStack).getInteger(AMMO_TAG);
	}

	public static void setAmmo(ItemStack itemStack, int ammo) {
		if(itemStack == null) return;
		compatibility.ensureTagCompound(itemStack);
		compatibility.getTagCompound(itemStack).setInteger(AMMO_TAG, ammo);
	}
	
	static int[] getAttachmentIds(ItemStack itemStack) {
        if(itemStack == null || compatibility.getTagCompound(itemStack) == null) return new int[0];
        return compatibility.getTagCompound(itemStack).getIntArray(ATTACHMENT_ID_TAG);
    }

    static void setAttachmentIds(ItemStack itemStack, int[] attachmentIds) {
        if(itemStack == null) return;
        compatibility.ensureTagCompound(itemStack);
        compatibility.getTagCompound(itemStack).setIntArray(ATTACHMENT_ID_TAG, attachmentIds);
    }

	public static long getDefaultTimer(ItemStack itemStack) {
		if(itemStack == null || compatibility.getTagCompound(itemStack) == null) return 0;
		return compatibility.getTagCompound(itemStack).getLong(DEFAULT_TIMER_TAG);
	}

	static void setDefaultTimer(ItemStack itemStack, long ammo) {
		if(itemStack == null || compatibility.getTagCompound(itemStack) == null) return;
		compatibility.getTagCompound(itemStack).setLong(DEFAULT_TIMER_TAG, ammo);
	}

	public static PlayerItemInstance<?> getInstance(ItemStack itemStack) {
		if(itemStack == null || compatibility.getTagCompound(itemStack) == null) return null;

		byte[] bytes = compatibility.getTagCompound(itemStack).getByteArray(INSTANCE_TAG);
		if(bytes != null && bytes.length > 0) {
			return TypeRegistry.getInstance().fromBytes(Unpooled.wrappedBuffer(bytes));
		}
		return null;
	}

	public static <T extends PlayerItemInstance<?>> T getInstance(ItemStack itemStack, Class<T> targetClass) {
		if(itemStack == null || compatibility.getTagCompound(itemStack) == null) return null;

		byte[] bytes = compatibility.getTagCompound(itemStack).getByteArray(INSTANCE_TAG);
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
	
	
		
		if(itemStack == null) return;
		compatibility.ensureTagCompound(itemStack);
		ByteBuf buf = Unpooled.buffer();
		if(instance != null) {
			TypeRegistry.getInstance().toBytes(instance, buf);
			NBTTagCompound tagCompound = compatibility.getTagCompound(itemStack);
            tagCompound.setByteArray(INSTANCE_TAG, buf.array());
            compatibility.setUniqueId(tagCompound, INSTANCE_UUID_TAG, instance.getUuid());
		} else {
			NBTTagCompound tagCompound = compatibility.getTagCompound(itemStack);
            tagCompound.removeTag(INSTANCE_TAG);
            tagCompound.removeTag(INSTANCE_UUID_TAG);
		}
	}
	
	public static UUID getInstanceUuid(ItemStack itemStack) {
	    if(itemStack == null) return null;
	    NBTTagCompound tagCompound = compatibility.getTagCompound(itemStack);
	    if(tagCompound == null) return null;
	    UUID uuid = compatibility.getUniqueId(tagCompound, INSTANCE_UUID_TAG);
	    if(uuid.getMostSignificantBits() == 0L && uuid.getLeastSignificantBits() == 0L) {
	        return null;
	    }
	    return uuid;
	}
	
	public static void setInstanceUuid(ItemStack itemStack, UUID uuid) {
	
			
	    if(itemStack == null) return;
        compatibility.ensureTagCompound(itemStack);
        NBTTagCompound tagCompound = compatibility.getTagCompound(itemStack);
        compatibility.setUniqueId(tagCompound, INSTANCE_UUID_TAG, uuid);
    }

	public static byte[] getInstanceBytes(ItemStack itemStack) {
		if(itemStack == null || compatibility.getTagCompound(itemStack) == null) return null;
		return compatibility.getTagCompound(itemStack).getByteArray(INSTANCE_TAG);
	}
}
