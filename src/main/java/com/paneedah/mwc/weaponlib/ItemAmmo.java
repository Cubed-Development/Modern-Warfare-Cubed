package com.paneedah.mwc.weaponlib;

import com.paneedah.mwc.weaponlib.compatibility.CompatibleItem;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ItemAmmo extends CompatibleItem {
	
	private List<Weapon> compatibleWeapons = new ArrayList<>();

	public void addCompatibleWeapon(Weapon weapon) {
		compatibleWeapons.add(weapon);
	}
	
	@Override
	public void addInformation(ItemStack itemStack, List<String> info, boolean flag) {
	    info.add("Compatible guns:");
        compatibleWeapons.forEach((weapon) -> info.add(weapon.getName()));
	}
}
