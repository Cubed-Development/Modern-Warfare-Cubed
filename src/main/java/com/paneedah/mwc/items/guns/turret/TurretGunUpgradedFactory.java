package com.paneedah.mwc.items.guns.turret;

import com.paneedah.mwc.items.guns.GunFactory;
import com.paneedah.weaponlib.Weapon;
import net.minecraft.item.Item;

public class TurretGunUpgradedFactory implements GunFactory {


    public Item createGun() {
        return new Weapon.Builder()
                .withName("turret_gun_upgraded")
                .withFireRate(0.6F)
                .withReloadingTime(50)
                .withSpawnEntityDamage(30)
                .withSpawnEntityGravityVelocity(0.0118F)
                .withShootSound("turret_shoot")
                .build();
    }
}
