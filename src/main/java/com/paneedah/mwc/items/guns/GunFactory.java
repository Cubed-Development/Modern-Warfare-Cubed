package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.proxies.CommonProxy;
import net.minecraft.item.Item;

public interface GunFactory {
	
	public Item createGun(CommonProxy commonProxy);
}
