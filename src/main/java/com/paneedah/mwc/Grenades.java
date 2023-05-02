package com.paneedah.mwc;

import com.paneedah.mwc.items.grenade.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weaponlib.AttachmentBuilder;
import com.paneedah.mwc.weaponlib.AttachmentCategory;
import com.paneedah.mwc.weaponlib.ItemAttachment;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.mwc.weaponlib.grenade.ItemGrenade;

public class Grenades {

    public static ItemGrenade FuseGrenade;
    public static ItemGrenade ImpactGrenade;
    public static ItemGrenade SmokeGrenade;
    public static ItemGrenade GasGrenade;
    public static ItemGrenade FlashGrenade;
    
    public static ItemAttachment<ItemGrenade> GrenadeSafetyPin;


    public static void init(Object mod, CompatibleFmlPreInitializationEvent event, CommonProxy commonProxy) {
        GrenadeSafetyPin = new AttachmentBuilder<ItemGrenade>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mwc.models.Pin(), "gun.png").withName("GrenadeSafetyPin")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FuseGrenade = new FuseGrenadeFactory().createGrenade(commonProxy);
        ImpactGrenade = new ImpactGrenadeFactory().createGrenade(commonProxy);
        SmokeGrenade = new SmokeGrenadeFactory().createGrenade(commonProxy);
        GasGrenade = new GasGrenadeFactory().createGrenade(commonProxy);
        FlashGrenade = new FlashGrenadeFactory().createGrenade(commonProxy);
    }
}
