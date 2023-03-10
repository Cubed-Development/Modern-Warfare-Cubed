package com.paneedah.mwc.resources;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.item.Item;

public class ItemSteelPlate extends Item {

	public ItemSteelPlate() {
		setMaxStackSize(64);
		setTranslationKey(ModReference.id + "_" + "SteelPlate");
		//setTextureName(ModReference.MWC_ID + ":" + "SteelPlate");
		setCreativeTab(ModernWarfareMod.BlocksTab);
	}
}
