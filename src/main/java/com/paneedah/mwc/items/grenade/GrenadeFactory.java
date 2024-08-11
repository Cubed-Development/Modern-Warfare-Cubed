package com.paneedah.mwc.items.grenade;

import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.grenade.ItemGrenade;

public interface GrenadeFactory {

    public ItemGrenade createGrenade(CommonProxy commonProxy);
}
