package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.WeaponSpawnEntity;
import net.minecraft.util.DamageSource;

public class ServerInterceptors {
    private static final float KNOCKBACK_STRENGTH = 0.051f;
    
    public static float getKnockback(DamageSource source) {
        float strength = 0.4f;
        if (source instanceof WeaponSpawnEntity.ProjectileDamageSource) {
            strength = KNOCKBACK_STRENGTH;
        }
        return strength;
    }

    public static double getKnockback(float strength) {
        return strength == KNOCKBACK_STRENGTH ? 1.0D : 2.0D;
    }
}
