package com.paneedah.weaponlib.compatibility;

import net.minecraft.util.EnumFacing;

public enum CompatibleEnumFacing {
    
    DOWN(EnumFacing.DOWN),
    UP(EnumFacing.UP), 
    NORTH(EnumFacing.NORTH),
    SOUTH(EnumFacing.SOUTH),
    WEST(EnumFacing.WEST),
    EAST(EnumFacing.EAST);
    
    private EnumFacing enumFacing;
    
    private CompatibleEnumFacing(EnumFacing enumFacing) {
        this.enumFacing = enumFacing;
    }
    
    public EnumFacing getEnumFacing() {
        return enumFacing;
    }
    
    public static CompatibleEnumFacing valueOf(EnumFacing enumFacing) {
        CompatibleEnumFacing result = null;
        switch(enumFacing) {
        case UP:
            result = CompatibleEnumFacing.UP;
            break;
        case DOWN:
            result = CompatibleEnumFacing.DOWN;
            break;
        case EAST:
            result = CompatibleEnumFacing.EAST;
            break;
        case WEST:
            result = CompatibleEnumFacing.WEST;
            break;
        case NORTH:
            result = CompatibleEnumFacing.NORTH;
            break;
        case SOUTH:
            result = CompatibleEnumFacing.SOUTH;
            break;
        }
        return result;
    }
}
