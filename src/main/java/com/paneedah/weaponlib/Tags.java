package com.paneedah.weaponlib;

import com.paneedah.mwc.instancing.PlayerItemInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.lang.reflect.InvocationTargetException;
import java.util.UUID;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

public final class Tags {

    private static final String AMMO_TAG = "Ammo";

    private static final String DEFAULT_TIMER_TAG = "DefaultTimer";

    private static final String INSTANCE_CLASS_TAG = "InstanceName";

    private static final String ATTACHMENT_ID_TAG = "AtId";

    private static final String INSTANCE_UUID_TAG = "IUuid";

    public static int getAmmo(final ItemStack itemStack) {
        if (itemStack.getTagCompound() == null)
            return 0;

        return itemStack.getTagCompound().getInteger(AMMO_TAG);
    }

    public static void setAmmo(final ItemStack itemStack, int ammo) {
        if (itemStack.getTagCompound() == null)
            itemStack.setTagCompound(new NBTTagCompound());

        itemStack.getTagCompound().setInteger(AMMO_TAG, ammo);
    }

    public static int[] getAttachmentIds(final ItemStack itemStack) {
        if (itemStack.getTagCompound() == null)
            return new int[0];

        return itemStack.getTagCompound().getIntArray(ATTACHMENT_ID_TAG);
    }

    public static void setAttachmentIds(final ItemStack itemStack, int[] attachmentIds) {
        if (itemStack.getTagCompound() == null)
            itemStack.setTagCompound(new NBTTagCompound());

        itemStack.getTagCompound().setIntArray(ATTACHMENT_ID_TAG, attachmentIds);
    }

    public static long getDefaultTimer(final ItemStack itemStack) {
        if (itemStack.getTagCompound() == null)
            return 0;

        return itemStack.getTagCompound().getLong(DEFAULT_TIMER_TAG);
    }

    public static void setDefaultTimer(final ItemStack itemStack, long ammo) {
        if (itemStack.getTagCompound() == null)
            return;

        itemStack.getTagCompound().setLong(DEFAULT_TIMER_TAG, ammo);
    }

    public static PlayerItemInstance<?> getInstance(final ItemStack itemStack) {
        if (itemStack.getTagCompound() == null)
            return null;

        final NBTTagCompound tagCompound = itemStack.getTagCompound();

        try {
            final Class<?> targetClass = Class.forName(tagCompound.getString(INSTANCE_CLASS_TAG));

            return getInstance(itemStack, (Class<PlayerItemInstance<?>>) targetClass);
        } catch (ClassNotFoundException exception) {
            LOGGER.error("Failed to create instance of {}", tagCompound.getString(INSTANCE_CLASS_TAG), exception);
            return null;
        }
    }

    public static <T extends PlayerItemInstance<?>> T getInstance(final ItemStack itemStack, final Class<T> targetClass) {
        if (itemStack.getTagCompound() == null)
            return null;

        final NBTTagCompound tagCompound = itemStack.getTagCompound();

        try {
            final T instance = targetClass.getDeclaredConstructor().newInstance();

            instance.getTags(tagCompound);

            return instance;
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException exception) {
            LOGGER.error("Failed to create instance of {}", tagCompound.getString(INSTANCE_CLASS_TAG), exception);
            return null;
        }
    }

    public static void setInstance(final ItemStack itemStack, final PlayerItemInstance<?> instance) {
        if (itemStack.getTagCompound() == null)
            itemStack.setTagCompound(new NBTTagCompound());

        final NBTTagCompound tagCompound = itemStack.getTagCompound();

        if (instance != null) {
            tagCompound.setString(INSTANCE_CLASS_TAG, instance.getClass().getName());

            instance.setTags(tagCompound);

            final UUID uuid = instance.getUuid();

            tagCompound.setLong(INSTANCE_UUID_TAG + "Most", uuid.getMostSignificantBits());
            tagCompound.setLong(INSTANCE_UUID_TAG + "Least", uuid.getLeastSignificantBits());
        } else {
            tagCompound.removeTag(INSTANCE_UUID_TAG);
        }
    }

    public static UUID getInstanceUuid(final ItemStack itemStack) {
        final NBTTagCompound tagCompound = itemStack.getTagCompound();
        if (tagCompound == null) {
            return null;
        }
        UUID uuid = new UUID(tagCompound.getLong(INSTANCE_UUID_TAG + "Most"), tagCompound.getLong(INSTANCE_UUID_TAG + "Least"));
        if (uuid.getMostSignificantBits() == 0L && uuid.getLeastSignificantBits() == 0L) {
            return null;
        }
        return uuid;
    }

    public static void setInstanceUuid(final ItemStack itemStack, final UUID uuid) {
        if (itemStack.getTagCompound() == null)
            itemStack.setTagCompound(new NBTTagCompound());

        final NBTTagCompound tagCompound = itemStack.getTagCompound();

        tagCompound.setLong(INSTANCE_UUID_TAG + "Most", uuid.getMostSignificantBits());
        tagCompound.setLong(INSTANCE_UUID_TAG + "Least", uuid.getLeastSignificantBits());
    }
}
