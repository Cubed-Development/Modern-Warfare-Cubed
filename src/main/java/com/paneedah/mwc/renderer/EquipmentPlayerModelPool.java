package com.paneedah.mwc.renderer;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

/**
 * Singleton class for managing and pooling player equipment models.
 * <p>
 * This class ensures that only one instance of each model is created lazily and kept in memory, improving performance.
 *
 * @author Desoroxxx
 * @since 0.1
 */
@SideOnly(Side.CLIENT)
public final class EquipmentPlayerModelPool {

    /**
     * A static pool of all loaded models. This uses the model's class name as the key.
     */
    private static final HashMap<String, ModelBiped> pool = new HashMap<>();

    /**
     * Fetches a model from the pool.
     * <p>
     * If the model is not already loaded, it attempts to load it and store it in the pool.
     *
     * @param name The fully qualified class name of the model to fetch.
     * @return The requested model, or null if the model could not be loaded.
     */
    public static ModelBiped get(String name) {
        if (!pool.containsKey(name)) {
            try {
                pool.put(name, (ModelBiped) Class.forName(name).getDeclaredConstructor().newInstance());
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException exception) {
                RED_LOG.printFramedError("Equipment Pool", "Failed to load equipment model: " + name, "Non critical exception, model will not be loaded", exception.getMessage());
            }
        }

        return pool.get(name);
    }
}
