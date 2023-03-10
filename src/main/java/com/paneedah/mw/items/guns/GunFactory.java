package com.paneedah.mw.items.guns;

import com.paneedah.mw.proxies.CommonProxy;
import net.minecraft.item.Item;

public interface GunFactory {
	
	public Item createGun(CommonProxy commonProxy);
}
