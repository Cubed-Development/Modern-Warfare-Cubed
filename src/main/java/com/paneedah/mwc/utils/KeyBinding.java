package com.paneedah.mwc.utils;

import com.mojang.blaze3d.platform.InputConstants;
import com.paneedah.mwc.ModernWarfareCubed;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public final class KeyBinding {

    public static final String KEY_CATEGORY_OPTIONS = "key.category." + ModernWarfareCubed.MOD_ID + ".config";
    public static final String KEY_OPEN_CONFIG = "key." + ModernWarfareCubed.MOD_ID + ".openconfig";
    public static final String KEY_CLOSE_CONFIG = "key." + ModernWarfareCubed.MOD_ID + ".closeconfig";

    public static final KeyMapping OPEN_CONFIG_KEY = new KeyMapping(KEY_OPEN_CONFIG, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_O, KEY_CATEGORY_OPTIONS);
    public static final KeyMapping CLOSE_CONFIG_KEY = new KeyMapping(KEY_CLOSE_CONFIG, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_ESCAPE, KEY_CATEGORY_OPTIONS);

}
