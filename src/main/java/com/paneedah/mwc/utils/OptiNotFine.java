package com.paneedah.mwc.utils;

import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.lang.reflect.Field;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.RED_LOG;

/**
 * This class provides methods to communicate with OptiNotFine (Can you see that I hate OptiFine?)
 *
 * @author Desoroxxx
 */
@SideOnly(Side.CLIENT)
public class OptiNotFine {

    private static boolean isOptiFineInstalled = true;

    private static int quarterTickCount;

    private static Class installerClass = null;

    private static Field shaderPackLoadedField = null;
    private static Field fastRenderField = null;

    /**
     * Checks if OptiFine is installed.
     *
     * @return True if OptiFine is installed, false otherwise.
     */
    public static boolean isOptiFineInstalled() {
        if (!isOptiFineInstalled)
            return false;

        try {
            if (installerClass == null)
                installerClass = Class.forName("optifine.Installer");

            return true;
        } catch (ClassNotFoundException ignored) {
            isOptiFineInstalled = false;
        }

        return false;
    }

    /**
     * Checks if OptiFine shaders are enabled.
     *
     * @return True if shaders are enabled, false otherwise.
     */
    public static boolean shadersEnabled() {
        if (!isOptiFineInstalled())
            return false;

        try {
            if (shaderPackLoadedField == null)
                shaderPackLoadedField = Class.forName("net.optifine.shaders.Shaders").getDeclaredField("shaderPackLoaded");

            return (boolean) shaderPackLoadedField.get(null);
        } catch (IllegalAccessException | ClassNotFoundException | NoSuchFieldException exception) {
            RED_LOG.printFramedError("OptiNotFine", "Could not get OptiFine shaders status.", "If shaders are enabled things might break", exception.getMessage());
            return false;
        }
    }

    /**
     * Disable OptiFine fast renderer.
     */
    private static void disableFastRender() {
        try {
            if (fastRenderField == null)
                fastRenderField = Class.forName("net.minecraft.client.settings.GameSettings").getDeclaredField("ofFastRender");

            fastRenderField.set(mc.gameSettings, false);
        } catch (IllegalAccessException | ClassNotFoundException | NoSuchFieldException exception) {
            RED_LOG.printFramedError("OptiNotFine", "Could not disable OptiFine fast renderer", "Things will break", exception.getMessage());
        }
    }

    @SubscribeEvent
    public static void onClientTickEvent(TickEvent.ClientTickEvent clientTickEvent) {
        if (clientTickEvent.phase == TickEvent.Phase.START) {
            quarterTickCount++;
            if (quarterTickCount == 5) {
                disableFastRender();
                quarterTickCount = 0;
            }
        }
    }
}
