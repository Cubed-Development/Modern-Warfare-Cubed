package com.paneedah.mw.items.melee;

import com.paneedah.mw.proxies.CommonProxy;
import net.minecraft.item.Item;

public interface MeleeFactory {
	
	public Item createMelee(CommonProxy commonProxy);
}
