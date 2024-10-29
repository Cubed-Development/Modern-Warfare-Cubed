package com.paneedah.mwc.asm;

import zone.rong.mixinbooter.ILateMixinLoader;

import java.util.Collections;
import java.util.List;

public final class MWCLateMixinLoader implements ILateMixinLoader {

    @Override
    public List<String> getMixinConfigs() {
        return Collections.singletonList("mixin.mwc.techguns.json");
    }

    @Override
    public boolean shouldMixinConfigQueue(String mixinConfig) {
        // This is a switch as we may add more mod specific mixins in the future
        if (mixinConfig.equals("mixin.mwc.techguns.json")) {
            return isTechgunsInstalled();
        }
        return true;
    }

    private static boolean isTechgunsInstalled() {
        boolean isTechgunsInstalled = true;

        try {
            Class.forName("techguns.core.TechgunsCore");
        } catch (final ClassNotFoundException classNotFoundException) {
            isTechgunsInstalled = false;
        }

        return isTechgunsInstalled;
    }
}
