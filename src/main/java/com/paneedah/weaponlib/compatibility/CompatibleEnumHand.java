package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.EnumHand;

public enum CompatibleEnumHand {
    MAIN_HAND, OFF_HAND;
    
    public static CompatibleEnumHand valueOf(EnumHand side) {
        CompatibleEnumHand result = null;
        switch(side) {
        case MAIN_HAND: result = CompatibleEnumHand.MAIN_HAND; break;
        case OFF_HAND: result = CompatibleEnumHand.OFF_HAND; break;
        }
        return result;
    }
}
