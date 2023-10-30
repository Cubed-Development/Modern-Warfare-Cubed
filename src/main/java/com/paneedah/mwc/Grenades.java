package com.paneedah.mwc;

import com.paneedah.mwc.items.grenade.*;
import com.paneedah.mwc.models.weapons.Pin;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.AttachmentBuilder;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.grenade.ItemGrenade;

public class Grenades {

    public static ItemGrenade FuseGrenade;
    public static ItemGrenade ImpactGrenade;
    public static ItemGrenade SmokeGrenade;
    public static ItemGrenade GasGrenade;
    public static ItemGrenade FlashGrenade;
    
    public static ItemAttachment<ItemGrenade> GrenadeSafetyPin;


    public static void init(Object mod, CommonProxy commonProxy) {
        GrenadeSafetyPin = new AttachmentBuilder<ItemGrenade>().withCategory(AttachmentCategory.EXTRA).withModel(new Pin(), "gun.png").withName("GrenadeSafetyPin").withRenderablePart().build();

        FuseGrenade = new FuseGrenadeFactory().createGrenade(commonProxy);
        ImpactGrenade = new ImpactGrenadeFactory().createGrenade(commonProxy);
        SmokeGrenade = new SmokeGrenadeFactory().createGrenade(commonProxy);
        GasGrenade = new GasGrenadeFactory().createGrenade(commonProxy);
        FlashGrenade = new FlashGrenadeFactory().createGrenade(commonProxy);
    }
}
