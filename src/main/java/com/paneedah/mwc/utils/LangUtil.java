package com.paneedah.mwc.utils;

import net.minecraft.client.resources.I18n;

import static com.paneedah.mwc.ProjectConstants.ID;

public final class LangUtil {

    /**
     * Formats the given key by appending it to the ID with an underscore.
     *
     * @param key The key to be formatted
     *
     * @return The formatted key
     */
    public static String format(String key) {
        return (ID + "_" + key);
    }

    /**
     * Formats the given unlocName by adding ".name" then translating it
     *
     * @param unlocName The key to be formatted
     *
     * @return The formatted (translated) key
     */
    public static String formatTranslationKey(String unlocName) {
        return I18n.format(unlocName + ".name");
    }
}
