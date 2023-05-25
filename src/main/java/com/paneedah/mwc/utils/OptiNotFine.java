package com.paneedah.mwc.utils;

import java.lang.reflect.Field;

/**
 * This class provides methods to communicate with OptiNotFine (Can you see that I hate Optifine?)
 *
 * @author Desoroxxx
 */
public class OptiNotFine {

    /**
     * Checks if shaders are enabled in OptiNotFine.
     * <p>
     * The method attempts to load the "Shaders" class from the OptiFine package, and access the "shaderPackLoaded" field.
     * If the class is not found, it indicates that OptiFine is not installed, hence it returns false.
     * In case of successful class and field loading, the value of the "shaderPackLoaded" field is returned which should represent whether shaders are currently enabled.
     *
     * @return True if the shaders are enabled, false if they are disabled or if OptiNotFine is not installed.
     */
    public static boolean shadersEnabled() {
        try {
            Class<?> shadersClass = Class.forName("net.optifine.shaders.Shaders");
            Field shaderPackLoadedField = shadersClass.getDeclaredField("shaderPackLoaded");
            shaderPackLoadedField.setAccessible(true);

            return (boolean) shaderPackLoadedField.get(null);
        } catch (ClassNotFoundException ignored) {
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            // Todo: When I finished the log Utils for Fancier Block Particles I should replace the stacktrace below with a better log error. (Desoroxxx on the 2023-05-26)
            exception.printStackTrace();
        }

        return false;
    }
}
