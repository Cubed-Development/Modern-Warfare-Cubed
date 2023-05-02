package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.util.EnumBlockRenderType;

public enum CompatibleBlockRenderType {

    INVISIBLE(EnumBlockRenderType.INVISIBLE),
    LIQUID(EnumBlockRenderType.LIQUID),
    ENTITYBLOCK_ANIMATED(EnumBlockRenderType.ENTITYBLOCK_ANIMATED),
    MODEL(EnumBlockRenderType.MODEL);
    
    private EnumBlockRenderType renderType;

    private CompatibleBlockRenderType(EnumBlockRenderType renderType) {
        this.renderType = renderType;
    }
    
    EnumBlockRenderType getRenderType() {
        return renderType;
    }
}
