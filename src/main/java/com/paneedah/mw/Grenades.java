package com.paneedah.mw;

import com.paneedah.mw.items.grenade.*;
import com.paneedah.mw.proxies.CommonProxy;
import com.paneedah.mw.utils.ModReference;
import com.paneedah.weaponlib.AttachmentBuilder;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.configold.ConfigurationManager;
import com.paneedah.weaponlib.grenade.ItemGrenade;

public class Grenades {

    public static ItemGrenade FuseGrenade;
    public static ItemGrenade ImpactGrenade;
    public static ItemGrenade SmokeGrenade;
    public static ItemGrenade GasGrenade;
    public static ItemGrenade FlashGrenade;
    
    public static ItemAttachment<ItemGrenade> GrenadeSafetyPin;


    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CommonProxy commonProxy) {
        GrenadeSafetyPin = new AttachmentBuilder<ItemGrenade>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mw.models.Pin(), "gun.png").withName("GrenadeSafetyPin")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        FuseGrenade = new FuseGrenadeFactory().createGrenade(commonProxy);
        ImpactGrenade = new ImpactGrenadeFactory().createGrenade(commonProxy);
        SmokeGrenade = new SmokeGrenadeFactory().createGrenade(commonProxy);
        GasGrenade = new GasGrenadeFactory().createGrenade(commonProxy);
        FlashGrenade = new FlashGrenadeFactory().createGrenade(commonProxy);
    }
}
