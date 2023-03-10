package com.paneedah.mw.resources;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSteelPlate extends Item {

	public ItemSteelPlate() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SteelPlate");
		//setTextureName(ModReference.MWC_ID + ":" + "SteelPlate");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
