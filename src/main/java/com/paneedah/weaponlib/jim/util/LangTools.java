package com.paneedah.weaponlib.jim.util;

import net.minecraft.client.resources.I18n;

public class LangTools {

    public static String formatName(String unlocName) {
        return I18n.format(unlocName + ".name");
    }
}
