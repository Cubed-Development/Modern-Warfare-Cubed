package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.EnumHandSide;

public enum CompatibleEnumHandSide {
    LEFT, RIGHT;
    
    public static CompatibleEnumHandSide fromEnumHandSide(EnumHandSide side) {
        CompatibleEnumHandSide result = null;
        switch(side) {
        case LEFT: result = CompatibleEnumHandSide.LEFT; break;
        case RIGHT: result = CompatibleEnumHandSide.RIGHT; break;
        }
        return result;
    }
}
