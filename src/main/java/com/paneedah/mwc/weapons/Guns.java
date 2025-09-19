package com.paneedah.mwc.weapons;

import com.paneedah.mwc.items.guns.*;
import com.paneedah.mwc.items.guns.turret.TurretGunFactory;
import com.paneedah.mwc.items.guns.turret.TurretGunSilencedFactory;
import com.paneedah.mwc.items.guns.turret.TurretGunUpgradedFactory;
import com.paneedah.mwc.proxies.CommonProxy;
import net.minecraft.item.Item;

public class Guns {

    public static Item M249;
    public static Item M40A6;
    public static Item Beowulf50Cal;
    public static Item M110;
    public static Item AR10SuperSASS;
    public static Item ZbroyarZ10;
    public static Item M1014;
    public static Item Supernova;
    public static Item HK417;
    public static Item M38;
    public static Item M16A1;
    public static Item M16A4;
    public static Item M4A1;
    public static Item AR15;
    public static Item SIGMCX;
    public static Item NGSWR;
    public static Item P226;
    public static Item FiveSeven;
    public static Item M9A1;
    public static Item MAS21;

    public static Item turretgun;
    public static Item turretgunupgraded;
    public static Item turretgunsilenced;

    public static Item MP443;
    //public static Item AK12_kal;
    public static Item AK15;
    public static Item KBP9A91;
    public static Item Kedr;
    public static Item VSSVintorez;
    public static Item KS23;
    public static Item SV98;

    public static Item MP5A5;
    public static Item MP7;
    public static Item UMP45;
    public static Item MPX;
    public static Item P90;
    public static Item MAC10;
    public static Item ScorpionEVO3A1;
    public static Item APC9;
    public static Item S710Tricun;
    public static Item ScarL;
    public static Item ScarH;
    public static Item FamasF1;
    public static Item VP70;
    public static Item Glock19;
    public static Item SCCYCPX2;
    public static Item BrowningHiPower;
    public static Item M1911;
    public static Item Python;
    public static Item TaurusRagingHunter;
    public static Item ChiappaRhino;
    public static Item DesertEagle;
    public static Item MP40;
    public static Item M1A1Thompson;
    public static Item M1928Thompson;
    public static Item AK101;
    public static Item AK74;
    public static Item AK47;
    public static Item Malyuk;
    public static Item AK12;
    public static Item ACR;
    public static Item Type20;
    public static Item CZ805Bren;
    public static Item ARX160;
    public static Item F2000;
    public static Item G36C;
    public static Item AUG;
    public static Item K2C1;
    public static Item SIG556;
    public static Item G11;
    public static Item STG44;
    public static Item G3;
    public static Item M1873;
    public static Item MaresLeg;
    public static Item G2Contender;
    public static Item Remington870;
    public static Item BrowningAuto5;
    public static Item M1Carbine;
    public static Item M1Garand;
    public static Item G43Gewehr;
    public static Item Springfield;
    public static Item Kar98K;
    public static Item KragJorgensen;
    public static Item SVDDragunov;
    public static Item Glock18C;
    public static Item MakarovPM;
    public static Item APS;
    public static Item M712;
    public static Item Uzi;
    public static Item AACHoneyBadger;
    public static Item KrissVector;
    public static Item FMG9;
    public static Item Saiga12;
    public static Item Spas12;
    public static Item MP43E;
    public static Item HS12;
    public static Item Origin12;
    public static Item M1897;
    public static Item FNFAL;
    public static Item Mk14EBR;
    public static Item BrenMkII;
    public static Item M1941Johnson;
    public static Item M1941JohnsonRifle;
    public static Item DP28;
    public static Item MG34;
    public static Item MG42;
    public static Item M60E4;
    public static Item StonerA1;
    public static Item SSG08;
    public static Item DSR1;
    public static Item L96A1;
    public static Item M200Intervention;
    public static Item AS50;
    public static Item M82;
    //    public static Item NTW20;
    public static Item GL06;
    public static Item M79;
    public static Item M32MGL;
    public static Item RPG7;
    public static Item M202;
    public static Item M134;
//    public static Item NinthSin;


    // TDM

    // Marine Assault
    public static Item M17;

    public static Item AsiimovM4A1;

    // German Assault
    public static Item HK_P12;

    // UK Light Support

    // French Light

    // Canada Heavy CQB

    // Russian Assault
    public static Item Kalashnikov_AK12;

    // UK Heavy Long Range

    // and an L131A1

    // Soviet Assault

    // Remington-700
    public static Item Remington700;

    public static Item Chainsaw;

    public static void init(CommonProxy proxy) {
        // Try not to change the order of the guns to ensure stable recipes
        //AR2
        M4A1 = new M4A1Factory().createGun();
        AR15 = new AR15Factory().createGun();
        M16A1 = new M16A1Factory().createGun();
        M16A4 = new M16A4Factory().createGun();
        M38 = new M38Factory().createGun();
        ACR = new ACRFactory().createGun();
        NGSWR = new NGSWRFactory().createGun();
        SIGMCX = new SIGMCXFactory().createGun();
        AACHoneyBadger = new AACHoneyBadgerFactory().createGun();

        AK47 = new AK47Factory().createGun();
        AK15 = new AK15Factory().createGun();
        Malyuk = new MalyukFactory().createGun();
        AK12 = new AK12_kalFactory().createGun();
        AK12 = new AK12Factory().createGun();
        AK101 = new AK101Factory().createGun();
        AK74 = new AK74Factory().createGun();
        KBP9A91 = new KBP9A91Factory().createGun();
        K2C1 = new K2C1Factory().createGun();

        ScarH = new ScarHFactory().createGun();
        ScarL = new ScarLFactory().createGun();
        SIG556 = new SIG556Factory().createGun();
        CZ805Bren = new CZ805BrenFactory().createGun();
        ARX160 = new ARX160Factory().createGun();
        Type20 = new Type20Factory().createGun();
        FamasF1 = new FamasF1Factory().createGun();
        G36C = new G36CFactory().createGun();
        G11 = new G11Factory().createGun();

        F2000 = new F2000Factory().createGun();

        //AR1 & R
        AUG = new AUGFactory().createGun();
        STG44 = new STG44Factory().createGun();
        M1Garand = new M1GarandFactory().createGun();
        M1941JohnsonRifle = new M1941JohnsonRifleFactory().createGun();
        G43Gewehr = new G43GewehrFactory().createGun();
        M1Carbine = new M1CarbineFactory().createGun();
        M1873 = new M1873Factory().createGun();
        MaresLeg = new MaresLegFactory().createGun();


        //DMR2
        AR10SuperSASS = new AR10SuperSASSFactory().createGun();
        Beowulf50Cal = new Beowulf50CalFactory().createGun();
        M110 = new M110Factory().createGun();
        ZbroyarZ10 = new ZbroyarZ10Factory().createGun();
        HK417 = new HK417Factory().createGun();
        Mk14EBR = new Mk14EBRFactory().createGun();
        FNFAL = new FNFALFactory().createGun();
        G3 = new G3Factory().createGun();

        //DMR1
        Springfield = new SpringfieldFactory().createGun();

        //SR2
        M82 = new M82Factory().createGun();
        M40A6 = new M40A6Factory().createGun();
        SVDDragunov = new SVDDragunovFactory().createGun();
        VSSVintorez = new VSSVintorezFactory().createGun();

        //SR1
        AS50 = new AS50Factory().createGun();
        SSG08 = new SSG08Factory().createGun();
        M200Intervention = new M200InterventionFactory().createGun();
        DSR1 = new DSR1Factory().createGun();
        L96A1 = new L96A1Factory().createGun();

        Remington700 = new Remington700Factory().createGun();
        SV98 = new SV98Factory().createGun();
        KragJorgensen = new KragJorgensenFactory().createGun();
        Kar98K = new Kar98KFactory().createGun();

        //SMG2
        MP7 = new MP7Factory().createGun();
        MP5A5 = new MP5A5Factory().createGun();
        P90 = new P90Factory().createGun();
        MAC10 = new MAC10Factory().createGun();
        KrissVector = new KrissVectorFactory().createGun();

        UMP45 = new UMP45Factory().createGun();
        ScorpionEVO3A1 = new ScorpionEVO3A1Factory().createGun();
        MPX = new MPXFactory().createGun();
        FMG9 = new FMG9Factory().createGun();
        Uzi = new UziFactory().createGun();

        //SMG1
        S710Tricun = new S710TricunFactory().createGun();
        APC9 = new APC9Factory().createGun();
        Kedr = new KedrFactory().createGun();
        MP40 = new MP40Factory().createGun();

        M1928Thompson = new M1928ThompsonFactory().createGun();

        //ShotGun1
        Origin12 = new Origin12Factory().createGun();
        Saiga12 = new Saiga12Factory().createGun();
        Spas12 = new Spas12Factory().createGun();
        M1014 = new M1014Factory().createGun();
        Supernova = new SupernovaFactory().createGun();
        Remington870 = new Remington870Factory().createGun();
        KS23 = new KS23Factory().createGun();
        M1897 = new M1897Factory().createGun();

        HS12 = new HS12Factory().createGun();
        MP43E = new MP43EFactory().createGun();
        BrowningAuto5 = new BrowningAuto5Factory().createGun();

        //LMG
        M60E4 = new M60E4Factory().createGun();
        MG42 = new MG42Factory().createGun();
        MG34 = new MG34Factory().createGun();
        DP28 = new DP28Factory().createGun();
        BrenMkII = new BrenMkIIFactory().createGun();
        M1941Johnson = new M1941JohnsonFactory().createGun();

        M249 = new M249Factory().createGun();
        StonerA1 = new StonerA1Factory().createGun();
        M134 = new M134Factory().createGun();

        //REVOLVER
        Python = new PythonFactory().createGun();
        TaurusRagingHunter = new TaurusRagingHunterFactory().createGun();
        ChiappaRhino = new ChiappaRhinoFactory().createGun();

        //SIDEARM2
        APS = new APSFactory().createGun();
        MakarovPM = new MakarovPMFactory().createGun();

        DesertEagle = new DesertEagleFactory().createGun();
        Glock18C = new Glock18CFactory().createGun();
        Glock19 = new Glock19Factory().createGun();
        FiveSeven = new FiveSevenFactory().createGun();
        M9A1 = new M9A1Factory().createGun();
        P226 = new P226Factory().createGun();
        MP443 = new MP443Factory().createGun();
        VP70 = new VP70Factory().createGun();
        M17 = new M17Factory().createGun();

        SCCYCPX2 = new SCCYCPX2Factory().createGun();
        HK_P12 = new HK_P12Factory().createGun();

        //SIDEARM1
        MAS21 = new MAS21Factory().createGun();
        G2Contender = new G2ContenderFactory().createGun();
        M712 = new M712Factory().createGun();
        M1911 = new M1911Factory().createGun();
        BrowningHiPower = new BrowningHiPowerFactory().createGun();

        //LAUNCHER
        M202 = new M202Factory().createGun();
        RPG7 = new RPG7Factory().createGun();

        M32MGL = new M32MGLFactory().createGun();
        GL06 = new GL06Factory().createGun();
        M79 = new M79Factory().createGun();

        // wtf?
        Chainsaw = new ChainsawFactory().createGun();

        // Turrets
        turretgun = new TurretGunFactory().createGun();
        turretgunupgraded = new TurretGunUpgradedFactory().createGun();
        turretgunsilenced = new TurretGunSilencedFactory().createGun();
    }
}
