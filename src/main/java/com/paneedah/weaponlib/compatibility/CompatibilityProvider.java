package com.paneedah.weaponlib.compatibility;

@Deprecated
public final class CompatibilityProvider {

	@Deprecated
	public static Compatibility compatibility = initCompatibility();

	@Deprecated
	private static Compatibility initCompatibility() {
		try {
			return (Compatibility) Class.forName("Compatibility1_12_2").newInstance();
		} catch (Exception exception) {
			throw new IllegalStateException("How did you break the compatibility layer? Let's find out: " + exception.getMessage());
		}
	}
}
