package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;

public class turretgunFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("turretgun")
                .withFireRate(0.6f)
                .withRecoil(6f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.NONE)
                .hasFlashPedals()
                .withMaxShots(1, Integer.MAX_VALUE)
                .withShootSound("turret_shoot")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("scar_reload")
                .withUnloadSound("scar_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(40)
                .withTextureNames("scarl")
                .withRenderer(new WeaponRenderer.Builder().build())
                // turret 's damage
                .withSpawnEntityDamage(10f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}