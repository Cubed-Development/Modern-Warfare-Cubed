package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttribute;

public class CompatibleSharedMonsterAttributes {

    public static final CompatibleSharedMonsterAttributes FOLLOW_RANGE = new CompatibleSharedMonsterAttributes(
            SharedMonsterAttributes.FOLLOW_RANGE);
    
    public static final CompatibleSharedMonsterAttributes MOVEMENT_SPEED = new CompatibleSharedMonsterAttributes(
            SharedMonsterAttributes.MOVEMENT_SPEED);
    
    public static final CompatibleSharedMonsterAttributes MAX_HEALTH = new CompatibleSharedMonsterAttributes(
            SharedMonsterAttributes.MAX_HEALTH);
    
    public static final CompatibleSharedMonsterAttributes ATTACK_DAMAGE = new CompatibleSharedMonsterAttributes(
            SharedMonsterAttributes.ATTACK_DAMAGE);
    
    private IAttribute attributes;

    public CompatibleSharedMonsterAttributes(IAttribute attributes) {
        this.attributes = attributes;
    }
    
    public IAttribute getAttributes() {
        return attributes;
    }
}
