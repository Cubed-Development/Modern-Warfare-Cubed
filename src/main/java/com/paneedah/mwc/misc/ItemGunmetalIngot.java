package com.paneedah.mwc.misc;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemGunmetalIngot extends Item {

	public ItemGunmetalIngot() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "GunmetalIngot");
//		setTextureName(ModReference.id + ":" + "gunmetalingot");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
