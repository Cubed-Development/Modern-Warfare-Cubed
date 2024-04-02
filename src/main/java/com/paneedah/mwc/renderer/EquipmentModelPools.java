package com.paneedah.mwc.renderer;

import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

@SideOnly(Side.CLIENT)
public final class EquipmentModelPools {

    private static final HashMap<String, ModelBiped> modelPool = new HashMap<>(); // Pool for normal models, that shows when dropped etc...
    private static final HashMap<String, ModelBiped> equippedPool = new HashMap<>(); // Pool for equipped models, that shows on the entity
    private static final HashMap<String, ModelBiped> equippedArmorPool = new HashMap<>(); // Pool for equipped armor models, that shows on the entity

    public static ModelBiped get(final String name) {
        return get(name, modelPool);
    }

    public static ModelBiped getEquipped(final String name) {
        return get(name, equippedPool);
    }

    public static ModelBiped getEquippedArmor(final String name, final boolean slim) {
        return get(name + (slim ? "Slim" : ""), equippedArmorPool);
    }

    public static long getSize() {
        return getSize(modelPool);
    }

    public static long getEquippedSize() {
        return getSize(equippedPool);
    }

    public static long getEquippedArmorSize() {
        return getSize(equippedArmorPool);
    }

    private static ModelBiped get(final String name, final HashMap<String, ModelBiped> pool) {
        if (!pool.containsKey(name)) {
            try {
                pool.put(name, (ModelBiped) Class.forName(name).getDeclaredConstructor().newInstance());
            } catch (InstantiationException | IllegalAccessException | ClassNotFoundException | NoSuchMethodException | InvocationTargetException exception) {
                RED_LOG.printFramedError("Equipment Pool", "Failed to load equipment model: " + name, "Non critical exception, model will not be loaded", exception.getMessage());
            }
        }

        return pool.get(name);
    }

    private static long getSize(final HashMap<String, ModelBiped> pool) {
        return pool.size();
    }
}
