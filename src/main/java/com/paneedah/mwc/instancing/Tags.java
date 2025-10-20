package com.paneedah.mwc.instancing;

import com.paneedah.mwc.network.TypeRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    public static void printTags(final ItemStack itemStack) {
        final NBTTagCompound tagCompound = getTagCompound(itemStack);

        final List<String> tags = new ArrayList<>();

        for (final String key : tagCompound.getKeySet())
            tags.add(key + ":" + tagCompound.getTag(key));

        RED_LOGGER.framed("Tags (Size: " + tagCompound.getSize() + ") for item: " + itemStack, INFO, tags.toArray(new String[0]));
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
        }

        setTagCompound(itemStack, tagCompound);
    }

    // endregion
}
