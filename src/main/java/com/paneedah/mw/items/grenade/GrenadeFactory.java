package com.paneedah.mw.items.grenade;

import com.paneedah.mw.proxies.CommonProxy;
import com.paneedah.weaponlib.grenade.ItemGrenade;

public interface GrenadeFactory {

	public ItemGrenade createGrenade(CommonProxy commonProxy);
}
