package com.paneedah.weaponlib.compatibility;

import net.minecraftforge.common.ForgeVersion;

public final class CompatibilityProvider {
	
	public static Compatibility compatibility = initCompatibility();

	private static Compatibility initCompatibility() {
		String compatibilityClassName = Compatibility.class.getName() + ForgeVersion.mcVersion.replace('.', '_');
		
		try {
			return (Compatibility) Class.forName(compatibilityClassName).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			throw new IllegalStateException("Cannot find compatible implementation class " + compatibilityClassName);
		}
	}
}
