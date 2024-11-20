package com.paneedah.mwc.instancing;

import com.paneedah.mwc.network.TypeRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;
import static com.paneedah.mwc.ProjectConstants.RED_LOGGER;
import static org.apache.logging.log4j.Level.INFO;

/**
 * @author Luna Mira Lage (Desoroxxx)
 * @since 0.2
 */
public final class Tags {

    private static final HashMap<String, Class<?>> TYPE_REGISTRY_COPY = TypeRegistry.getTypeRegistryCopy();

    private static final String INSTANCE_CLASS_TAG = "InstanceClass";
    private static final String DEFAULT_TIMER_TAG = "DefaultTimer";
    private static final String INSTANCE_UUID_TAG = "IUuid";
    private static final String ATTACHMENT_ID_TAG = "AtId";
    private static final String AMMO_TAG = "Ammo";

    public static void printTags(final ItemStack itemStack) {
        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        final List<String> tags = new ArrayList<>();

        for (final String key : tagCompound.getKeySet())
            tags.add(key + ":" + tagCompound.getTag(key));

        RED_LOGGER.logFramed("Tags (Size: " + tagCompound.getSize() + ") for item: " + itemStack, INFO, tags.toArray(new String[0]));
    }

    // region Getters

    public static NBTTagCompound getTagCompound(final ItemStack itemStack) {
        if (itemStack.getTagCompound() == null)
            itemStack.setTagCompound(new NBTTagCompound());

        return itemStack.getTagCompound().getCompoundTag(ID);
    }

    public static PlayerItemInstance<?> getInstance(final ItemStack itemStack) {
        if (itemStack.getTagCompound() == null || !itemStack.getTagCompound().hasKey(ID))
            return null;

        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        final String className = tagCompound.getString(INSTANCE_CLASS_TAG);

        try {
            final Class<?> targetClass = TYPE_REGISTRY_COPY.get(className);

            if (targetClass == null)
                throw new ClassNotFoundException("Class not found: " + className);

            return getInstance(itemStack, (Class<PlayerItemInstance<?>>) targetClass);
        } catch (ClassNotFoundException exception) {
            LOGGER.error("Failed to create instance of \"{}\"", className, exception);
            return null;
        }
    }

    public static <T extends PlayerItemInstance<?>> T getInstance(final ItemStack itemStack, final Class<T> targetClass) {
        if (itemStack.getTagCompound() == null || !itemStack.getTagCompound().hasKey(ID))
            return null;

        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        try {
            final T instance = targetClass.getDeclaredConstructor().newInstance();

            instance.readInstanceFromNBT(tagCompound);

            return instance;
        } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException exception) {
            LOGGER.error("Failed to create instance of {}", tagCompound.getString(INSTANCE_CLASS_TAG), exception);
            return null;
        }
    }

    public static UUID getInstanceUuid(final ItemStack itemStack) {
        if (itemStack.getTagCompound() == null || !itemStack.getTagCompound().hasKey(ID))
            return null;

        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        final UUID uuid = new UUID(tagCompound.getLong(INSTANCE_UUID_TAG + "Most"), tagCompound.getLong(INSTANCE_UUID_TAG + "Least"));

        if (uuid.getMostSignificantBits() == 0 && uuid.getLeastSignificantBits() == 0)
            return null;

        return uuid;
    }

    public static int getAmmo(final ItemStack itemStack) {
        return getTagCompound(itemStack).getInteger(AMMO_TAG);
    }

    public static int[] getAttachmentIds(final ItemStack itemStack) {
        return getTagCompound(itemStack).getIntArray(ATTACHMENT_ID_TAG);
    }

    public static long getDefaultTimer(final ItemStack itemStack) {
        return getTagCompound(itemStack).getLong(DEFAULT_TIMER_TAG);
    }

    // endregion

    // region Setters

    public static void setTagCompound(final ItemStack itemStack, final NBTTagCompound tagCompound) {
        if (itemStack.getTagCompound() == null)
            itemStack.setTagCompound(new NBTTagCompound());


        itemStack.getTagCompound().setTag(ID, tagCompound);
    }

    public static void setInstance(final ItemStack itemStack, final PlayerItemInstance<?> instance) {
        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        if (instance != null) {
            tagCompound.setString(INSTANCE_CLASS_TAG, instance.getClass().getName());

            instance.writeInstanceToNBT(tagCompound);

            final UUID uuid = instance.getUuid();

            tagCompound.setLong(INSTANCE_UUID_TAG + "Most", uuid.getMostSignificantBits());
            tagCompound.setLong(INSTANCE_UUID_TAG + "Least", uuid.getLeastSignificantBits());
        } else {
            tagCompound.removeTag(INSTANCE_UUID_TAG);
        }

        setTagCompound(itemStack, tagCompound);
    }

    public static void setInstanceUuid(final ItemStack itemStack, final UUID uuid) {
        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        tagCompound.setLong(INSTANCE_UUID_TAG + "Most", uuid.getMostSignificantBits());
        tagCompound.setLong(INSTANCE_UUID_TAG + "Least", uuid.getLeastSignificantBits());

        setTagCompound(itemStack, tagCompound);
    }

    public static void setAmmo(final ItemStack itemStack, int ammo) {
        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        tagCompound.setInteger(AMMO_TAG, ammo);

        setTagCompound(itemStack, tagCompound);
    }

    public static void setAttachmentIds(final ItemStack itemStack, int[] attachmentIds) {
        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        tagCompound.setIntArray(ATTACHMENT_ID_TAG, attachmentIds);

        setTagCompound(itemStack, tagCompound);
    }

    public static void setDefaultTimer(final ItemStack itemStack, long ammo) {
        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        tagCompound.setLong(DEFAULT_TIMER_TAG, ammo);

        setTagCompound(itemStack, tagCompound);
    }

    // endregion
}
