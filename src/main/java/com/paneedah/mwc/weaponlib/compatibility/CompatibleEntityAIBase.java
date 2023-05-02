package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.ai.EntityAIBase;

public abstract class CompatibleEntityAIBase extends EntityAIBase {

    @Override
    public boolean shouldContinueExecuting() {
        return super.shouldContinueExecuting();
    }

}
