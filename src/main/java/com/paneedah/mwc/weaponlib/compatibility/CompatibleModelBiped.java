package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.client.model.ModelBiped;

public class CompatibleModelBiped extends ModelBiped {
	
	protected ModelBiped delegate;
	
	protected CompatibleModelBiped(ModelBiped delegate) {
		this.delegate = delegate;
	}
}
