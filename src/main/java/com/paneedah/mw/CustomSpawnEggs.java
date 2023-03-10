package com.paneedah.mw;

import com.paneedah.mw.proxies.CommonProxy;
import com.paneedah.weaponlib.HighIQSpawnEgg;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.configold.ConfigurationManager;

public class CustomSpawnEggs {
	
	public static HighIQSpawnEgg TURRET_EGG;
	public static HighIQSpawnEgg TURRETUPGRADED_EGG;
	public static HighIQSpawnEgg TURRETSILENCED_EGG;
	
	public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CommonProxy proxy) {
		TURRET_EGG = new HighIQSpawnEgg.Builder()
				.withID(1)
				.withItemName("turret")
				.withEntitySpawnName("turret")
				.withBlockPredicate(b -> b.getRegistryName().toString().equals("mw:turret_base"))
				.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
				.build();
		
		TURRETUPGRADED_EGG = new HighIQSpawnEgg.Builder()
				.withID(2)
				.withItemName("turretupgraded")
				.withEntitySpawnName("turretupgraded")
				.withBlockPredicate(b -> b.getRegistryName().toString().equals("mw:turret_base"))
				.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
				.build();
		
		TURRETSILENCED_EGG = new HighIQSpawnEgg.Builder()
				.withID(3)
				.withItemName("turretsilenced")
				.withEntitySpawnName("turretsilenced")
				.withBlockPredicate(b -> b.getRegistryName().toString().equals("mw:turret_base"))
				.withCreativeTab(ModernWarfareMod.AssaultRiflesTab)
				.build();
	}
}
