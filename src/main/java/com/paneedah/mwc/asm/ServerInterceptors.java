package com.paneedah.mwc.asm;

import com.paneedah.weaponlib.WeaponSpawnEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;

public class ServerInterceptors {

    public static float getKnockback(DamageSource source) {
        float strength = 0.4f;
        if (source instanceof EntityDamageSourceIndirect) {
            EntityDamageSourceIndirect indirectSource = (EntityDamageSourceIndirect) source;
            if (indirectSource.getImmediateSource() instanceof WeaponSpawnEntity) {
                strength = 0.05f;
            }
        }
        return strength;
    }
}
