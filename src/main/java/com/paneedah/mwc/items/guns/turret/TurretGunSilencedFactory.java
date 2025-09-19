package com.paneedah.mwc.items.guns.turret;

import com.paneedah.mwc.items.guns.GunFactory;
import com.paneedah.weaponlib.Weapon;
import net.minecraft.item.Item;

public class TurretGunSilencedFactory implements GunFactory {

    public Item createGun() {
        return new Weapon.Builder()
                .withName("turret_gun_silenced")
                .withFireRate(0.6F)
                .withReloadingTime(50)
                .withSpawnEntityDamage(20)
                .withSpawnEntityGravityVelocity(0.0118F)
                .withShootSound("m4a1_silenced")
                .withShootSoundVolume(0.2F)
                .build();
    }
}
