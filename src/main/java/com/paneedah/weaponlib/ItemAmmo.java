package com.paneedah.weaponlib;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class ItemAmmo extends Item {
	
	private List<Weapon> compatibleWeapons = new ArrayList<>();

	public void addCompatibleWeapon(Weapon weapon) {
		compatibleWeapons.add(weapon);
	}
	
	@Override
	public void addInformation(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Compatible guns:");
        compatibleWeapons.forEach((weapon) -> tooltip.add(weapon.getName()));
	}
}
