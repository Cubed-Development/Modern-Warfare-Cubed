package com.paneedah.mwc.weapons;

import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.weaponlib.ItemMagazine;
import com.paneedah.weaponlib.crafting.CraftingComplexity;

public class Magazines {

    public static ItemMagazine AUG9mmMag;
    public static ItemMagazine S710TricunMag;
    public static ItemMagazine M4A1Mag;
    public static ItemMagazine NGSWRMag;
    public static ItemMagazine FamasF1Mag;
    public static ItemMagazine BeowulfMag;
    public static ItemMagazine M4AsiimovMag;
    public static ItemMagazine M38Mag;
    public static ItemMagazine SOCOM_Mag;
    public static ItemMagazine HK417Mag;
    public static ItemMagazine C8Mag;
    public static ItemMagazine Stanag50;
    public static ItemMagazine Stanag60;
    public static ItemMagazine Stanag100;
    public static ItemMagazine AK101Mag;
    public static ItemMagazine AK74Mag;
    public static ItemMagazine AK74Mag60;
    public static ItemMagazine AK60Mag;
    public static ItemMagazine AK15Mag;
    public static ItemMagazine AK12Mag;
    public static ItemMagazine AK12Mag545x39;
    public static ItemMagazine AK75Mag545x39;
    public static ItemMagazine AK47PMAGTan;
    public static ItemMagazine AK47Mag;
    public static ItemMagazine DragunovMag;
    public static ItemMagazine AK50Mag;
    public static ItemMagazine AK75Mag;
    public static ItemMagazine AK100Mag;
    public static ItemMagazine M9A1Mag;
    public static ItemMagazine FiveSevenMag;
    public static ItemMagazine SamuraiEdgeMag;
    public static ItemMagazine SCCYCPX2Mag;
    public static ItemMagazine SCCYCPX2MagExt;
    public static ItemMagazine M9Mag30;
    public static ItemMagazine M9DrumMag;
    public static ItemMagazine MP443Mag;
    public static ItemMagazine M1911Mag;
    public static ItemMagazine M1911Mag15;
    public static ItemMagazine M17Mag;
    public static ItemMagazine MakarovMag;
    public static ItemMagazine USP45Mag;
    public static ItemMagazine P2022Mag;
    public static ItemMagazine HiPowerMag;
    public static ItemMagazine APSMag;
    public static ItemMagazine AS50Mag;
    public static ItemMagazine M82Mag;
    public static ItemMagazine NTW20Mag;
    public static ItemMagazine FrommerStopMag;
    public static ItemMagazine G36CMag;
    public static ItemMagazine GlockMag13;
    public static ItemMagazine Glock18CMag;
    public static ItemMagazine GlockMag50;
    public static ItemMagazine L131A1Mag;
    public static ItemMagazine KBP9A91Mag;
    public static ItemMagazine KedrMag;
    public static ItemMagazine L96A1Mag;
    public static ItemMagazine DSR1Mag;
    public static ItemMagazine DSR1MagExt;
	public static ItemMagazine InterventionMag;
	public static ItemMagazine InterventionMagExtend;
    public static ItemMagazine M110Mag;
    public static ItemMagazine Z10Mag;
    public static ItemMagazine M1928Mag;
    public static ItemMagazine M1A1Mag;
    public static ItemMagazine M40A6Mag;
    public static ItemMagazine AX50Mag;
    public static ItemMagazine R700Mag;
    public static ItemMagazine R700Mag10rnd;
    public static ItemMagazine SSG08Mag;
    public static ItemMagazine HecateIIMag;
    public static ItemMagazine M712Mag;
    public static ItemMagazine DP28Mag;
    public static ItemMagazine MG42Mag;
    public static ItemMagazine M1CarbineMag;
    public static ItemMagazine FNFALMag;
    public static ItemMagazine G3Mag;
    public static ItemMagazine Mk14EBRMag;
    public static ItemMagazine M14Drum50;
    public static ItemMagazine MP40Mag;
    public static ItemMagazine MP5A5Mag;
    public static ItemMagazine HK50Drum;
    public static ItemMagazine MP7Mag;
    public static ItemMagazine MP7Mag20;
    public static ItemMagazine UMP45Mag;
    public static ItemMagazine UMP9Mag;
    public static ItemMagazine MPXMag;
    public static ItemMagazine APC9Mag;
    public static ItemMagazine ScorpionMag;
    public static ItemMagazine P90Mag;
    public static ItemMagazine MAC10Mag;
    public static ItemMagazine P90TerminatorMag;
    public static ItemMagazine G11Mag;
    public static ItemMagazine SaigaMag;
	public static ItemMagazine SaigaMagExtended;
    public static ItemMagazine Origin12Mag;
    public static ItemMagazine Origin12DrumMag;
    public static ItemMagazine ScarHMag;
    public static ItemMagazine Scar40Mag;
    public static ItemMagazine Scar60Mag;
    public static ItemMagazine VSSVintorezMag;
    public static ItemMagazine ASValMag;
    public static ItemMagazine STG44Mag;
    public static ItemMagazine G43GewehrMag;
    public static ItemMagazine BrenMag;
    public static ItemMagazine JohnsonMAG;
    public static ItemMagazine SV98Mag;
    public static ItemMagazine UziMag;
    public static ItemMagazine UziMag45;
    public static ItemMagazine UziDrumMag;
    public static ItemMagazine VP70Mag;
    public static ItemMagazine HoneyBadgerMag;
    public static ItemMagazine VectorMag;
    public static ItemMagazine VectorDrumMag;
    public static ItemMagazine DesertEagleMag;
    public static ItemMagazine M60Mag;
    public static ItemMagazine M249Mag;
    public static ItemMagazine PKMMag;
    public static ItemMagazine StonerMag;
    public static ItemMagazine M134Mag;
    public static ItemMagazine FuelCell;
    public static ItemMagazine NinthSinMag;

    public static void init(Object mod) {
        Magazines.FuelCell = new ItemMagazine.Builder().withCapacity(1000)
                .withName("FuelCell")
                .withModel(new ChainsawFuel(), "ChainsawFuel.png")
                .withMaxStackSize(6)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          MwItems.steelIngot,
//                          MwItems.gunmetalIngot)
                .build(ItemMagazine.class);
/*
        Magazines.NinthSinMag = new ItemMagazine.Builder()
        		.withCapacity(100)
                .withName("NinthSinMag")

                .withCreativeTab(MWC.AmmoTab)
                .withModel(new com.paneedah.mwc.models.weapons.NinthSinMagazine(), "ninthsin.png")
                .withMaxStackSize(6)
//                .withCrafting(CraftingComplexity.MEDIUM,
//                          MwItems.steelIngot,
//                          MwItems.gunmetalIngot)
                .build(MWC.modContext, ItemMagazine.class);
*/
        Magazines.BrenMag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("BrenMag")
                .withModel(new BrenMkIIMag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.JohnsonMAG = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet3006Springfield)
                .withName("JohnsonMAG")
                .withModel(new JohnsonLMGMAG(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.VectorMag = new ItemMagazine.Builder()
                .withCapacity(25)
                .withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("VectorMag")
                .withRotationPoint(-0.12000000357627871F, 1.0400000309944155F, -2.0400000607967383F)
                .withModel(new KrissVectorMagazine(), "krissvector.png")
                .withRequiredAttachments(Attachments.KrissVectorReceiver)
                .withMaxStackSize(5)
                .build(ItemMagazine.class);

        Magazines.VectorDrumMag = new ItemMagazine.Builder()
                .withCapacity(50)
                .withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("VectorDrumMag")
                .withRotationPoint(-0.12000000357627871F, 1.0400000309944155F, -2.0400000607967383F)
                .withModel(new KrissVectorMagazineDrum(), "krissvector.png")
                .withRequiredAttachments(Attachments.KrissVectorReceiver)
                .withMaxStackSize(5)
                .build(ItemMagazine.class);

        Magazines.M4A1Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("M4A1Mag_2")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new M4A1Mag(), "M4A1Magazine.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.NGSWRMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet277)
                .withName("NGSWR_Mag")
                .withRotationPoint(-0.16000000476837162F, -0.44000001311302195F, -1.4800000441074375F)
                .withModel(new NGSWRMag(), "ngswr.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.FamasF1Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("FamasF1Mag")
                .withRotationPoint(-0.12000000357627871F, 1.0400000309944155F, -2.0400000607967383F)
                .withRequiredAttachments(Attachments.FamasPlaceholder, Attachments.Vector556Handguard)
                .withModel(new FamasF1Mag(), "famasf1.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.BeowulfMag = new ItemMagazine.Builder()
                .withCapacity(13)
                .withCompatibleBullet(Bullets.Bullet50Beowulf)
                .withName("BeowulfMag")
                .withModel(new Beowulf50CalMagazine(), "Beowulf50CalMagazine.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.Beowulf50CalReceiver)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AUG9mmMag = new ItemMagazine.Builder().withCapacity(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("AUG9mmMag")
                .withModel(new AUG9mmMag(), "aug.png")
                .withRequiredAttachments(Attachments.AUGParaConversion)
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.S710TricunMag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet10mm)
                .withName("S710TricunMag")
                .withModel(new S710TricunMag(), "S710Tricun.png")
                .withRequiredAttachments(Attachments.S710Receiver)
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M134Mag = new ItemMagazine.Builder().withCapacity(1000).withCompatibleBullet(Bullets.Bullet762x51).withName("M134Mag")
                .withModel(new M134Mag(), "m134.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M60Mag = new ItemMagazine.Builder().withCapacity(100).withCompatibleBullet(Bullets.Bullet762x51).withName("M60Mag")
                .withModel(new M60Mag(), "m60.png")
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M249Mag = new ItemMagazine.Builder()
                .withCapacity(100)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("M249Mag")
                .withRotationPoint(0.8812000082910061F, 0.8648000418066975F, -1.40640004143715F)
                .withModel(new M249Mag(), "m249.png")
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.PKMMag = new ItemMagazine.Builder()
                .withCapacity(120)
                .withCompatibleBullet(Bullets.Bullet762x54)
                .withName("PKMMag")
                .withRotationPoint(0.8812000082910061F, 0.8648000418066975F, -1.40640004143715F)
                .withModel(new PKMMag(), "pkm.png")
                .withMaxStackSize(2)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.StonerMag = new ItemMagazine.Builder().withCapacity(100).withCompatibleBullet(Bullets.Bullet556x45).withName("StonerMag")
                .withModel(new StonerA1MAG(), "m249.png")
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.HoneyBadgerMag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet762x35)
                .withName("HoneyBadgerMag_2")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new M4A1Mag(), "M4A1Mag.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.M38Mag = new ItemMagazine.Builder()

                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("M38Mag_2")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new M38Mag(), "M38Mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver,
                        Attachments.HK416Receiver, Attachments.ScarLReceiver,
                        Attachments.SIGMCXHandguardShort, Attachments.SIG556Grip)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.SOCOM_Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("socom_mag")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new SOCOM_Mag(), "socom_mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.C8SFWReceiver,
                        Attachments.HK416Receiver, Attachments.ScarLReceiver,
                        Attachments.SIGMCXHandguardShort, Attachments.SIG556Grip)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.HK417Mag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("hk417_mag")
                .withModel(new HK417Mag(), "HK417mag.png")
                .withRequiredAttachments(Attachments.HK417Receiver, Attachments.HK417ReceiverTan)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.C8Mag = new ItemMagazine.Builder().withCapacity(30).withCompatibleBullet(Bullets.Bullet556x45).withName("C8Mag")
                .withModel(new C8Mag(), "c8mag.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard, Attachments.C8SFWReceiver)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Stanag50 = new ItemMagazine.Builder()
                .withCapacity(50)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("Stanag50")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new Stanag50(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder,
                        Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Stanag60 = new ItemMagazine.Builder()
                .withCapacity(60)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("Stanag60")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new Stanag60(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Stanag100 = new ItemMagazine.Builder()
                .withCapacity(100)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("Stanag100")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new NATODrum100(), "gun.png")
                .withRequiredAttachments(Attachments.Placeholder, Attachments.M4Receiver, Attachments.VLTORReceiver,
                        Attachments.AUGDefaultKit, Attachments.Vector556Handguard,
                        Attachments.M16A1RearSights, Attachments.CZ805BrenReceiver, Attachments.HK416Receiver,
                        Attachments.ScarLReceiver, Attachments.SIG556Grip)
                .withMaxStackSize(3)
                .build(ItemMagazine.class);

        Magazines.G36CMag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("G36CMag_2")
                .withRotationPoint(-0.040000001192092904F, -0.28000000834465033F, -1.4400000429153446F)
                .withModel(new G36CMag(), "g36c.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK101Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("AK101Mag_2")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AK101Mag(), "ak101mag.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK74Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet545x39)
                .withName("AK74Mag")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AK74Mag(), "ak74mag.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK74Mag60 = new ItemMagazine.Builder()
                .withCapacity(60)
                .withCompatibleBullet(Bullets.Bullet545x39)
                .withName("AK74Mag60")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AK60Mag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK60Mag = new ItemMagazine.Builder()
                .withCapacity(60)
                .withCompatibleBullet(Bullets.Bullet556x45)
                .withName("AK60Mag")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AK60Mag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK15Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet762x39)
                .withName("AK15Mag_2")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AK15Mag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK12Mag545x39 = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet545x39)
                .withName("AK12Mag_2")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AK15Mag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK75Mag545x39 = new ItemMagazine.Builder()
                .withCapacity(75)
                .withCompatibleBullet(Bullets.Bullet545x39)
                .withName("AK75Mag545x39")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new Mag75rnd(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK12Mag = new ItemMagazine.Builder()
                .withCapacity(31)
                .withCompatibleBullet(Bullets.Bullet545x39)
                .withName("AK12Mag")
                .withRotationPoint(-0.12000000357627871F, 0.36000001072883614F, -1.9200000572204599F)
                .withModel(new AK12Magazine(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK47PMAGTan = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet762x39)
                .withName("AK47PMAGTan")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AK15Mag(), "tan.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK47Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet762x39)
                .withName("AK47Mag")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.880000056028367F)
                .withModel(new Magazine762x39(), "ak47mag.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK50Mag = new ItemMagazine.Builder()
                .withCapacity(50)
                .withCompatibleBullet(Bullets.Bullet762x39)
                .withName("AK50Mag")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new Drum50AK(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK75Mag = new ItemMagazine.Builder()
                .withCapacity(75)
                .withCompatibleBullet(Bullets.Bullet762x39)
                .withName("AK75Mag")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new Mag75rnd(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AK100Mag = new ItemMagazine.Builder()
                .withCapacity(100)
                .withCompatibleBullet(Bullets.Bullet762x39)
                .withName("AK100Mag")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.8800000560283665F)
                .withModel(new AKDrum100(), "gun.png")
                .withMaxStackSize(3)
                .build(ItemMagazine.class);

        Magazines.DragunovMag = new ItemMagazine.Builder()
                .withCapacity(10)
                .withCompatibleBullet(Bullets.Bullet762x54)
                .withName("DragunovMag")
                .withRotationPoint(-0.12000000357627871F, 0.28000000834465033F, -1.880000056028367F)
                .withModel(new DragunovMag(), "dragunov.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.SaigaMag = new ItemMagazine.Builder()
		        .withCapacity(5).withCompatibleBullet(Bullets.Shotgun12Guage)
				.withName("SaigaMag_2")
                .withModel(new Saiga12Mag(), "gun.png")
                .withMaxStackSize(4)
                .build(ItemMagazine.class);
				
        Magazines.SaigaMagExtended = new ItemMagazine.Builder()
		        .withCapacity(12).withCompatibleBullet(Bullets.Shotgun12Guage)
		        .withName("SaigaMag_3")
                .withModel(new Saiga12ExtenMag(), "gun.png")
                .withMaxStackSize(2)
                .build(ItemMagazine.class);

        Magazines.Origin12Mag = new ItemMagazine.Builder()
                .withCapacity(5)
                .withCompatibleBullet(Bullets.Shotgun12Guage)
                .withName("Origin12Mag")
                .withRotationPoint(-0.12000000357627871F, 1.0000000298023226F, -1.9200000572204607F)
                .withModel(new Origin12Mag(), "Origin12.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Origin12DrumMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Shotgun12Guage)
                .withName("Origin12DrumMag")
                .withRotationPoint(-0.12000000357627871F, 1.0000000298023226F, -1.9200000572204607F)
                .withModel(new Origin12DrumMag(), "Origin12DrumMag.png")
                .withMaxStackSize(3)
                .build(ItemMagazine.class);

        Magazines.M9A1Mag = new ItemMagazine.Builder()
                .withCapacity(15)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("M9Mag_2")
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .withModel(new M9A1mag(), "m9a1.png")
                .withRequiredAttachments(Attachments.M9A1Body, Attachments.P226Slide)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.FiveSevenMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet57x28mm)
                .withName("FiveSevenMag")
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .withModel(new FiveSevenMagazine(), "fiveseven.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.SamuraiEdgeMag = new ItemMagazine.Builder().withCapacity(15).withCompatibleBullet(Bullets.Bullet40SW)
                .withName("SamuraiEdgeMag")
                .withModel(new M9A1mag(), "m9a1.png")
                .withRequiredAttachments(Attachments.SamuraiEdgeBody)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.SCCYCPX2Mag = new ItemMagazine.Builder()
                .withCapacity(10)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("sccycpx2mag")
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .withModel(new SCCYCPX2Mag(), "sccycpx2.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.SCCYCPX2MagExt = new ItemMagazine.Builder()
                .withCapacity(15)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("sccycpx2magext")
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .withModel(new SCCYCPX2MagExt(), "sccycpx2.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.DesertEagleMag = new ItemMagazine.Builder()
                .withCapacity(7)
                .withCompatibleBullet(Bullets.Bullet50AE)
                .withName("DesertEagleMag")
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .withModel(new DesertEagleMag(), "deagle.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M9Mag30 = new ItemMagazine.Builder().withCapacity(30).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9Mag30")
                .withModel(new M9Mag30(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.M9DrumMag = new ItemMagazine.Builder().withCapacity(65).withCompatibleBullet(Bullets.Bullet9x19mm).withName("M9DrumMag")
                .withModel(new M9DrumMag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.MP443Mag = new ItemMagazine.Builder()
                .withCapacity(18)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("MP443Mag_2")
                .withRotationPoint(-0.20000000596046452F, 0.48000001430511485F, 0.040000001192092904F)
                .withModel(new MP443Magazine(), "MP443.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.M1911Mag = new ItemMagazine.Builder().withCapacity(7).withCompatibleBullet(Bullets.Bullet45ACP).withName("M1911Mag")
                .withModel(new M1911Mag(), "m1911mag.png")
                .withMaxStackSize(6)
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .build(ItemMagazine.class);

        Magazines.M1911Mag15 = new ItemMagazine.Builder().withCapacity(15).withCompatibleBullet(Bullets.Bullet45ACP).withName("M1911Mag_2")
                .withModel(new M1911Mag15(), "m1911mag.png")
                .withMaxStackSize(6)
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .build(ItemMagazine.class);

        Magazines.M17Mag = new ItemMagazine.Builder()
                .withCapacity(17)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("M17Mag")
                .withRotationPoint(-0.16000000476837162F, 0.5600000166893007F, 0.040000001192092904F)
                .withModel(new M17Mag(), "m17.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.MakarovMag = new ItemMagazine.Builder().withCapacity(8)
                .withCompatibleBullet(Bullets.Bullet9x18mm)
                .withName("MakarovMag")
                .withRequiredAttachments(Attachments.MakarovSlide, Attachments.MakarovPBBody)
                .withModel(new MakarovMag(), "makarovpm.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.USP45Mag = new ItemMagazine.Builder().withCapacity(8).withCompatibleBullet(Bullets.Bullet45ACP).withName("USP45Mag")
                .withModel(new USP45Mag(), "USP45.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.HiPowerMag = new ItemMagazine.Builder().withCapacity(13).withCompatibleBullet(Bullets.Bullet9x19mm).withName("HiPowerMag")
                .withModel(new GlockMagazine(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.FrommerStopMag = new ItemMagazine.Builder().withCapacity(8).withCompatibleBullet(Bullets.Bullet380ACP).withName("FrommerStopMag")
                .withModel(new M9A1mag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.APSMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("APSMag_2")
                .withRotationPoint(-0.12000000357627871F, 0.48000001430511485F, 0)
                .withModel(new APSmag(), "aps.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.GlockMag13 = new ItemMagazine.Builder().withCapacity(13).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag13")
                .withModel(new Glock13rndMagazine(), "glock18c.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Glock18CMag = new ItemMagazine.Builder().withCapacity(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("Glock18Cmag_2")
                .withModel(new Glock18Cmag(), "glock18c.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.GlockMag50 = new ItemMagazine.Builder().withCapacity(50).withCompatibleBullet(Bullets.Bullet9x19mm).withName("GlockMag50")
                .withModel(new M9DrumMag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.AS50Mag = new ItemMagazine.Builder().withCapacity(10).withCompatibleBullet(Bullets.Bullet50BMG).withName("AS50Mag_2")
                .withModel(new AS50mag(), "as50.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M82Mag = new ItemMagazine.Builder()
                .withCapacity(10)
                .withCompatibleBullet(Bullets.Bullet50BMG)
                .withName("M82Mag_2")
                .withRotationPoint(-0.12000000357627871F, 0.40000001192092904F, -2.4800000739097605F)
                .withModel(new M82Mag(), "m82.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.NTW20Mag = new ItemMagazine.Builder().withCapacity(3).withCompatibleBullet(Bullets.Bullet20x82mm).withName("NTW20Mag")
                .withModel(new NTW20MAG(), "gun.png")


                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.KBP9A91Mag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet9x39mm)
                .withName("KBP9A91Mag_2")
                .withRotationPoint(-0.12000000357627871F, 0.36000001072883614F, -1.9600000584125523F)
                .withModel(new KBP9A91Mag(), "kbp9a91.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.KedrMag = new ItemMagazine.Builder().withCapacity(20).withCompatibleBullet(Bullets.Bullet9x19mm).withName("KedrMag_2")
                .withModel(new KedrMag(), "kedr.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.L96A1Mag = new ItemMagazine.Builder().withCapacity(10).withCompatibleBullet(Bullets.Bullet762x54).withName("L96A1Mag_2")
                .withModel(new L115Mag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.DSR1Mag = new ItemMagazine.Builder()
                .withCapacity(5)
                .withCompatibleBullet(Bullets.Bullet762x54)
                .withName("DSR1Mag")
                .withModel(new DSR1Mag(), "dsr1.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.DSR1MagExt = new ItemMagazine.Builder()
                .withCapacity(10)
                .withCompatibleBullet(Bullets.Bullet762x54)
                .withName("DSR1MagExt")
                .withModel(new DSR1MagExt(), "dsr1.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.InterventionMag = new ItemMagazine.Builder()
                .withCapacity(7)
                .withCompatibleBullet(Bullets.Bullet408CT)
                .withName("InterventionMag")
                .withModel(new InterventionMag(), "intervention.png")
                .withMaxStackSize(4)
                .build(ItemMagazine.class);

		Magazines.InterventionMagExtend = new ItemMagazine.Builder()
               .withCapacity(10)
               .withCompatibleBullet(Bullets.Bullet408CT)
               .withName("InterventionMagExtend")
               .withModel(new InterventionMagExtend(), "intervention.png")
               .withMaxStackSize(2)
               .build(ItemMagazine.class);


        Magazines.M40A6Mag = new ItemMagazine.Builder()
                .withCapacity(7)
                .withCompatibleBullet(Bullets.Bullet308Winchester)
                .withName("M40A6Mag_2")
                .withModel(new M40A6Mag(), "gunwerkshamr.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.AX50Mag = new ItemMagazine.Builder()
                .withCapacity(5)
                .withCompatibleBullet(Bullets.Bullet50BMG)
                .withName("AX50Mag")
                .withRotationPoint(-0.12000000357627871F, 0.40000001192092904F, -2.4800000739097605F)
                .withModel(new AX50Mag(), "ax50.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.R700Mag = new ItemMagazine.Builder().withCapacity(5).withCompatibleBullet(Bullets.Bullet762x54).withName("R700Mag")
                .withModel(new Remington700Mag(), "remington700.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.R700Mag10rnd = new ItemMagazine.Builder().withCapacity(10).withCompatibleBullet(Bullets.Bullet762x54).withName("R700Mag10rnd")
                .withModel(new Remington700Mag10rnd(), "remington700.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.SSG08Mag = new ItemMagazine.Builder()
                .withCapacity(8)
                .withCompatibleBullet(Bullets.Bullet308Winchester)
                .withName("SSG08Mag")
                .withModel(new SSG08Magazine(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

		 Magazines.HecateIIMag = new ItemMagazine.Builder()
                .withCapacity(7)
                .withCompatibleBullet(Bullets.Bullet50BMG)
                .withName("HecateIIMag")
                .withModel(new PGMHecateIIMag(), "pgmhecateii.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M110Mag = new ItemMagazine.Builder()
                .withCapacity(10)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("M110Mag_2")
                .withModel(new M110Mag(), "m110.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Z10Mag = new ItemMagazine.Builder()
                .withCapacity(10)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("Z10Mag")
                .withRotationPoint(-0.1F, 0, -1.4000000000000001F)
                .withModel(new Z10Mag(), "z10.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.M1928Mag = new ItemMagazine.Builder().withCapacity(50).withCompatibleBullet(Bullets.Bullet45ACP).withName("M1928Mag")
                .withModel(new M1928ThompsonMag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M1A1Mag = new ItemMagazine.Builder().withCapacity(30).withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("M1A1Mag")
                .withModel(new M1A1mag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M712Mag = new ItemMagazine.Builder().withCapacity(20).withCompatibleBullet(Bullets.Bullet763x25).withName("M712mag_2")
                .withModel(new M712mag(), "m712.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.MG42Mag = new ItemMagazine.Builder().withCapacity(50).withCompatibleBullet(Bullets.Bullet792x57).withName("MG42Mag_2")
                .withModel(new MG42mag(), "mg42mag.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.DP28Mag = new ItemMagazine.Builder().withCapacity(47).withCompatibleBullet(Bullets.Bullet762x54).withName("DP28Mag")
                .withModel(new DP28Mag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.M1CarbineMag = new ItemMagazine.Builder()
                .withCapacity(15)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("M1CarbineMag")
                .withModel(new Mk14EBRmag(), "m14dmr.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.FNFALMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("FNFALMag")
                .withRotationPoint(-0.12000000357627871F, -0.6800000202655794F, -2.36000007033348F)
                .withModel(new FNFALMag(), "fnfal.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.G3Mag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("G3Mag")
                .withRotationPoint(0, -0.6400000190734865F, -1.4000000417232517F)
                .withModel(new G3Mag(), "G3.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Mk14EBRMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("Mk14EBRmag_2")
                .withRotationPoint(-0.12000000357627871F, 0.5600000166893007F, -3.000000089406967F)
                .withModel(new Mk14EBRmag(), "m14dmr.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.M14Drum50 = new ItemMagazine.Builder()
                .withCapacity(50)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("M14Drum50")
                .withRotationPoint(-0.12000000357627871F, 0.5600000166893007F, -3.000000089406967F)
                .withModel(new M14Drum50(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.MP40Mag = new ItemMagazine.Builder().withCapacity(32).withCompatibleBullet(Bullets.Bullet9x19mm).withName("MP40Mag_2")
                .withModel(new MP40MagACTUAL(), "mp40.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.MP5A5Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("MP5A5Mag")
                .withRotationPoint(0, 0.20000000596046452F, -1.5600000464916233F)
                .withModel(new HKMP5Mag(), "mp5.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.HK50Drum = new ItemMagazine.Builder()
                .withCapacity(50)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("HK50Drum")
                .withRotationPoint(0, 0.20000000596046452F, -1.5600000464916233F)
                .withModel(new HK50Drum(), "mp5.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.MP7Mag = new ItemMagazine.Builder()
                .withCapacity(40)
                .withCompatibleBullet(Bullets.Bullet46x30mm)
                .withName("MP7Mag")
                .withRotationPoint(-0.12000000357627871F, 0.6400000190734865F, -0.08000000238418581F)
                .withModel(new MP7Mag(), "mp7.png")
//                .withRequiredAttachments(Attachments.VeprDustCover)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.MP7Mag20 = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet46x30mm)
                .withName("MP7Mag20")
                .withRotationPoint(-0.12000000357627871F, 0.6400000190734865F, -0.08000000238418581F)
                .withModel(new MP7Mag20(), "mp7.png")
//                .withRequiredAttachments(Attachments.VeprDustCover)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.UMP45Mag = new ItemMagazine.Builder()
                .withCapacity(25)
                .withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("UMP45Mag")
                .withRotationPoint(-0.12000000357627871F, 0.32000000953674324F, -1.280000038146973F)
                .withRequiredAttachments(Attachments.UMP45Receiver)
                .withModel(new UMP45mag(), "ump45.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.UMP9Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("UMP9Mag")
                .withRotationPoint(-0.12000000357627871F, 0.32000000953674324F, -1.280000038146973F)
                .withRequiredAttachments(Attachments.UMP9Receiver)
                .withModel(new UMP9Mag(), "ump45.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.MPXMag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("MPXMag")
                .withRotationPoint(-0.040000001192092904F, 0.44000001311302195F, -1.24000003695488F)
                .withModel(new MPXMag(), "mpx.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.APC9Mag = new ItemMagazine.Builder().withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("APC9Mag")
                .withModel(new APC9Mag(), "apc9.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.ScorpionMag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("ScorpionMag")
                .withRotationPoint(-0.12000000357627871F, 1.0000000298023226F, -1.680000050067902F)
                .withModel(new ScorpionEVO3A1Magazine(), "scorpionevo3a1.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.P90Mag = new ItemMagazine.Builder()
                .withCapacity(50)
                .withCompatibleBullet(Bullets.Bullet57x28mm)
                .withName("P90Mag")
                .withRotationPoint(-0.12000000357627871F, -1.1200000333786013F, 1.8400000548362736F)
                .withModel(new P90Mag(), "p90.png")
                .withRequiredAttachments(Attachments.P90DefaultKit, Attachments.AR57Receiver)
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.P90TerminatorMag = new ItemMagazine.Builder().withCapacity(65).withCompatibleBullet(Bullets.Bullet46x30mm)
                .withName("P90TerminatorMag")
                .withModel(new M4A1Mag(), "M4A1Mag.png")
                .withRequiredAttachments(Attachments.P90Terminator)
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.MAC10Mag = new ItemMagazine.Builder()
                .withCapacity(30)
                .withCompatibleBullet(Bullets.Bullet45ACP)
                .withName("MAC10Mag")
                .withRotationPoint(0.08000000238418581F, 0.5200000154972078F, -0.5600000166893007F)
                .withModel(new MAC10Mag(), "mac10.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.G11Mag = new ItemMagazine.Builder().withCapacity(50)
                .withCompatibleBullet(Bullets.Bullet473x33mm)
                .withName("G11Mag")
                .withRotationPoint(-0.12000000357627871F, -1.5200000452995304F, -3.8800001156330115F)
                .withModel(new G11Mag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.ScarHMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("ScarHMag_2")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new ScarHMag(), "scarh.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Scar40Mag = new ItemMagazine.Builder()
                .withCapacity(40)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("Scar40Mag")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new Scar40Mag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.Scar60Mag = new ItemMagazine.Builder()
                .withCapacity(60)
                .withCompatibleBullet(Bullets.Bullet762x51)
                .withName("Scar60Mag")
                .withRotationPoint(-0.16000000476837162F, -0.16000000476837162F, -1.5200000452995304F)
                .withModel(new Stanag50(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.VSSVintorezMag = new ItemMagazine.Builder()
                .withCapacity(10)
                .withCompatibleBullet(Bullets.Bullet9x39mm)
                .withName("VSSVintorezMag_2")
                .withRotationPoint(-0.040000001192092904F, -0.28000000834465033F, -1.3600000405311587F)
                .withModel(new VSSVintorezMag(), "vssvintorez.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.ASValMag = new ItemMagazine.Builder()
                .withCapacity(20)
                .withCompatibleBullet(Bullets.Bullet9x39mm)
                .withName("ASValMag")
                .withRotationPoint(-0.040000001192092904F, -0.28000000834465033F, -1.3600000405311587F)
                .withModel(new ASValMag(), "vssvintorez.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);

        Magazines.STG44Mag = new ItemMagazine.Builder().withCapacity(30).withCompatibleBullet(Bullets.Bullet792x33Kurz).withName("STG44Mag_2")
                .withModel(new STG44Mag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.G43GewehrMag = new ItemMagazine.Builder().withCapacity(10).withCompatibleBullet(Bullets.Bullet792x57).withName("g43_gewehr_mag")
                .withModel(new G43GewehrMag(), "gun.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.SV98Mag = new ItemMagazine.Builder().withCapacity(10).withCompatibleBullet(Bullets.Bullet762x54).withName("SV98Mag_2")
                .withModel(new SV98Mag(), "sv98.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.UziMag = new ItemMagazine.Builder()
                .withCapacity(32)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("UziMag_2")
                .withRotationPoint(-0.040000001192092904F, 0.7200000214576723F, -0.40000001192092904F)
                .withModel(new UziMag(), "uzi.png")
                .withMaxStackSize(6)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.UziMag45 = new ItemMagazine.Builder()
                .withCapacity(45)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("UziMag_3")
                .withRotationPoint(-0.040000001192092904F, 0.7200000214576723F, -0.40000001192092904F)
                .withModel(new UziMag45(), "uzi.png")
                .withMaxStackSize(4)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);

        Magazines.UziDrumMag = new ItemMagazine.Builder()
                .withCapacity(60)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("UziMag_4")
                .withRotationPoint(-0.040000001192092904F, 0.7200000214576723F, -0.40000001192092904F)
                .withModel(new UziDrumMag(), "uzi.png")
                .withMaxStackSize(3)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.steelIngot,
                        MWCItems.gunmetalIngot)
                .build(ItemMagazine.class);


        Magazines.VP70Mag = new ItemMagazine.Builder()
                .withCapacity(18)
                .withCompatibleBullet(Bullets.Bullet9x19mm)
                .withName("VP70mag_2")
                .withRotationPoint(-0.12000000357627871F, 0.24000000715255743F, 0.08000000238418581F)
                .withModel(new VP70mag(), "gun.png")
                .withMaxStackSize(6)
                .build(ItemMagazine.class);
    }
}
