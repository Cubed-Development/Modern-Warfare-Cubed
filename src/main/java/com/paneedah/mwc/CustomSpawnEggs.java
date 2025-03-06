package com.paneedah.mwc;

import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.HighIQSpawnEgg;

import static com.paneedah.mwc.ProjectConstants.ID;

public class CustomSpawnEggs {

    public static HighIQSpawnEgg turretEgg;
    public static HighIQSpawnEgg turretEggUpgraded;
    public static HighIQSpawnEgg turretEggSilenced;

    public static void init(CommonProxy proxy) {
        turretEgg = new HighIQSpawnEgg.Builder()
                .withID(1)
                .withItemName("turret")
                .withEntitySpawnName("turret")
                .withBlockPredicate(b -> b.getRegistryName().toString().equals(ID + ":turret_base"))
                .withCreativeTab(MWC.WEAPONS_TAB)
                .build();

        turretEggUpgraded = new HighIQSpawnEgg.Builder()
                .withID(2)
                .withItemName("turretupgraded")
                .withEntitySpawnName("turretupgraded")
                .withBlockPredicate(b -> b.getRegistryName().toString().equals(ID + ":turret_base"))
                .withCreativeTab(MWC.WEAPONS_TAB)
                .build();

        turretEggSilenced = new HighIQSpawnEgg.Builder()
                .withID(3)
                .withItemName("turretsilenced")
                .withEntitySpawnName("turretsilenced")
                .withBlockPredicate(b -> b.getRegistryName().toString().equals(ID + ":turret_base"))
                .withCreativeTab(MWC.WEAPONS_TAB)
                .build();
    }
}
