package com.paneedah.mwc.utils;

import net.minecraftforge.fml.client.FMLClientHandler;

import java.lang.reflect.Field;

import static com.paneedah.mwc.utils.ModReference.RED_LOG;

/**
 * This class provides methods to communicate with OptiNotFine (Can you see that I hate OptiFine?)
 * <p>
 * Todo: Use {@link FMLClientHandler#hasOptifine}
 * Todo: Strip from the server
 * Todo: Force Fast Render off
 *
 * @author Desoroxxx
 */
public class OptiNotFine {

    private static boolean isOptiFineInstalled = true;

    private static Field shaderPackLoadedField = null;

    /**
     * Checks if the shaders are enabled in the OptiNotFine.
     * <p>
     * This method works by attempting to load the "Shaders" class from the OptiFine package, and then attempting to access the "shaderPackLoaded" field.
     * <p>
     * If the method is unable to find the "Shaders" class, this indicates that OptiFine is not installed, and the method will return false.
     * <p>
     * However, if the method is able to successfully load the class and the field, the method will return the value of the "shaderPackLoaded" field, which should indicate whether or not the shaders are currently enabled.
     *
     *
     * @return True if the shaders are enabled, false if they are disabled or if OptiNotFine is not installed.
     */
    public static boolean shadersEnabled() {
        if (!isOptiFineInstalled)
            return false;

        try {
            if (shaderPackLoadedField == null) {
                shaderPackLoadedField = Class.forName("net.optifine.shaders.Shaders").getDeclaredField("shaderPackLoaded");
                shaderPackLoadedField.setAccessible(true);
            }

            return (boolean) shaderPackLoadedField.get(null);
        } catch (ClassNotFoundException ignored) {
            isOptiFineInstalled = false;
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            RED_LOG.printFramedError("OptiNotFine", "Could not get OptiFine shaders status.", "If shaders are enabled things might break", exception.getMessage());
        }

        return false;
    }
}
