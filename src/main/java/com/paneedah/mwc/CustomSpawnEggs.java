package com.paneedah.mwc;

import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.HighIQSpawnEgg;

public class CustomSpawnEggs {
	
	public static HighIQSpawnEgg TURRET_EGG;
	public static HighIQSpawnEgg TURRETUPGRADED_EGG;
	public static HighIQSpawnEgg TURRETSILENCED_EGG;
	
	public static void init(Object mod, CommonProxy proxy) {
		TURRET_EGG = new HighIQSpawnEgg.Builder()
				.withID(1)
				.withItemName("turret")
				.withEntitySpawnName("turret")
				.withBlockPredicate(b -> b.getRegistryName().toString().equals(ModReference.ID + ":turret_base"))
				.withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
				.build();
		
		TURRETUPGRADED_EGG = new HighIQSpawnEgg.Builder()
				.withID(2)
				.withItemName("turretupgraded")
				.withEntitySpawnName("turretupgraded")
				.withBlockPredicate(b -> b.getRegistryName().toString().equals(ModReference.ID + ":turret_base"))
				.withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
				.build();
		
		TURRETSILENCED_EGG = new HighIQSpawnEgg.Builder()
				.withID(3)
				.withItemName("turretsilenced")
				.withEntitySpawnName("turretsilenced")
				.withBlockPredicate(b -> b.getRegistryName().toString().equals(ModReference.ID + ":turret_base"))
				.withCreativeTab(MWC.ASSAULT_RIFLES_TAB)
				.build();
	}
}
