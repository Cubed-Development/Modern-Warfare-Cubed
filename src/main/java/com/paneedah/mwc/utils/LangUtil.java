package com.paneedah.mwc.utils;

import static com.paneedah.mwc.utils.ModReference.ID;

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
}
