package com.paneedah.mwc.items.melee;

import com.paneedah.mwc.proxies.CommonProxy;
import net.minecraft.item.Item;

public interface MeleeFactory {

    public Item createMelee(CommonProxy commonProxy);
}
