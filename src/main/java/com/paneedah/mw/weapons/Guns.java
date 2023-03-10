package com.paneedah.mw.weapons;

import com.paneedah.mw.items.guns.*;
import com.paneedah.mw.proxies.CommonProxy;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.configold.ConfigurationManager;
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
    public static Item SW500Magnum;
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
    public static Item SA80;
    
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
    
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event, CommonProxy proxy) {
     // Try not to change the order of the guns to ensure stable recipes

        M249 = new M249Factory().createGun(proxy);
        M40A6 = new M40A6Factory().createGun(proxy);
        Beowulf50Cal = new Beowulf50CalFactory().createGun(proxy);
        M110 = new M110Factory().createGun(proxy);
        AR10SuperSASS = new AR10SuperSASSFactory().createGun(proxy);
        ZbroyarZ10 = new ZbroyarZ10Factory().createGun(proxy);
        M1014 = new M1014Factory().createGun(proxy);
        Supernova = new SupernovaFactory().createGun(proxy);
        HK417 = new HK417Factory().createGun(proxy);
        M38 = new M38Factory().createGun(proxy);
        M16A1 = new M16A1Factory().createGun(proxy);
        M16A4 = new M16A4Factory().createGun(proxy);
        M4A1 = new M4A1Factory().createGun(proxy);
        AR15 = new AR15Factory().createGun(proxy);
        SIGMCX = new SIGMCXFactory().createGun(proxy);
        NGSWR = new NGSWRFactory().createGun(proxy);
        P226 = new P226Factory().createGun(proxy);
        FiveSeven = new FiveSevenFactory().createGun(proxy);
        M9A1 = new M9A1Factory().createGun(proxy);
        MAS21 = new MAS21Factory().createGun(proxy);
        
        turretgun = new turretgunFactory().createGun(proxy);
        turretgunupgraded = new turretgunupgradedFactory().createGun(proxy);
        turretgunsilenced = new turretgunsilencedFactory().createGun(proxy);
        
        MP443 = new MP443Factory().createGun(proxy);
        AK12 = new AK12_kalFactory().createGun(proxy);
        AK15 = new AK15Factory().createGun(proxy);
        KBP9A91 = new KBP9A91Factory().createGun(proxy);
        Kedr = new KedrFactory().createGun(proxy);
        VSSVintorez = new VSSVintorezFactory().createGun(proxy);
        SVDDragunov = new SVDDragunovFactory().createGun(proxy);
        KS23 = new KS23Factory().createGun(proxy);
        SV98 = new SV98Factory().createGun(proxy);
        
        MP5A5 = new MP5A5Factory().createGun(proxy);
        MP7 = new MP7Factory().createGun(proxy);
        UMP45 = new UMP45Factory().createGun(proxy);
        MPX = new MPXFactory().createGun(proxy);
        P90 = new P90Factory().createGun(proxy);
        MAC10 = new MAC10Factory().createGun(proxy);
        ScorpionEVO3A1 = new ScorpionEVO3A1Factory().createGun(proxy);
        APC9 = new APC9Factory().createGun(proxy);
        S710Tricun = new S710TricunFactory().createGun(proxy);
        
        ScarL = new ScarLFactory().createGun(proxy);
        ScarH = new ScarHFactory().createGun(proxy);
        
        M17 = new M17Factory().createGun(proxy);

        HK_P12 = new HK_P12Factory().createGun(proxy);
        
        SA80 = new SA80Factory().createGun(proxy);
        
        Remington700 = new Remington700Factory().createGun(proxy);
        
        VP70 = new VP70Factory().createGun(proxy);
        Glock19 = new Glock19Factory().createGun(proxy);
        SCCYCPX2 = new SCCYCPX2Factory().createGun(proxy);
        BrowningHiPower = new BrowningHiPowerFactory().createGun(proxy);
        M1911 = new M1911Factory().createGun(proxy);
        Python = new PythonFactory().createGun(proxy);
        TaurusRagingHunter = new TaurusRagingHunterFactory().createGun(proxy);
        ChiappaRhino = new ChiappaRhinoFactory().createGun(proxy);
        SW500Magnum = new SW500MagnumFactory().createGun(proxy);
        DesertEagle = new DesertEagleFactory().createGun(proxy);
        MP40 = new MP40Factory().createGun(proxy);
        M1928Thompson = new M1928ThompsonFactory().createGun(proxy);
        KrissVector = new KrissVectorFactory().createGun(proxy);
        FMG9 = new FMG9Factory().createGun(proxy);
        AK101 = new AK101Factory().createGun(proxy);
        AK74 = new AK74Factory().createGun(proxy);
        AK47 = new AK47Factory().createGun(proxy);
        Malyuk = new MalyukFactory().createGun(proxy);
        AK12 = new AK12Factory().createGun(proxy);
        ACR = new ACRFactory().createGun(proxy);
        Type20 = new Type20Factory().createGun(proxy);
        CZ805Bren = new CZ805BrenFactory().createGun(proxy);
        ARX160 = new ARX160Factory().createGun(proxy);
        F2000 = new F2000Factory().createGun(proxy);
        G36C = new G36CFactory().createGun(proxy);
        AUG = new AUGFactory().createGun(proxy);
        FamasF1 = new FamasF1Factory().createGun(proxy);
        K2C1 = new K2C1Factory().createGun(proxy);
        SIG556 = new SIG556Factory().createGun(proxy);
        G11 = new G11Factory().createGun(proxy);
        STG44 = new STG44Factory().createGun(proxy);
        M1873 = new M1873Factory().createGun(proxy);
        MaresLeg = new MaresLegFactory().createGun(proxy);
        G2Contender = new G2ContenderFactory().createGun(proxy);
        
        Remington870 = new Remington870Factory().createGun(proxy);
        BrowningAuto5 = new BrowningAuto5Factory().createGun(proxy);
        M1Carbine = new M1CarbineFactory().createGun(proxy);
        M1Garand = new M1GarandFactory().createGun(proxy);
        G43Gewehr = new G43GewehrFactory().createGun(proxy);
        Springfield = new SpringfieldFactory().createGun(proxy);
        Kar98K = new Kar98KFactory().createGun(proxy);
        KragJorgensen = new KragJorgensenFactory().createGun(proxy);
        Glock18C = new Glock18CFactory().createGun(proxy);
        MakarovPM = new MakarovPMFactory().createGun(proxy);
        APS = new APSFactory().createGun(proxy);
        M712 = new M712Factory().createGun(proxy);
        Uzi = new UziFactory().createGun(proxy);
        AACHoneyBadger = new AACHoneyBadgerFactory().createGun(proxy);
        Saiga12 = new Saiga12Factory().createGun(proxy);
        Spas12 = new Spas12Factory().createGun(proxy);
        MP43E = new MP43EFactory().createGun(proxy);
        HS12 = new HS12Factory().createGun(proxy);
        Origin12 = new Origin12Factory().createGun(proxy);
        M1897 = new M1897Factory().createGun(proxy);
        FNFAL = new FNFALFactory().createGun(proxy);
        Mk14EBR = new Mk14EBRFactory().createGun(proxy);
        G3 = new G3Factory().createGun(proxy);
        BrenMkII = new BrenMkIIFactory().createGun(proxy);
        M1941Johnson = new M1941JohnsonFactory().createGun(proxy);
        M1941JohnsonRifle = new M1941JohnsonRifleFactory().createGun(proxy);
        DP28 = new DP28Factory().createGun(proxy);
        MG34 = new MG34Factory().createGun(proxy);
        MG42 = new MG42Factory().createGun(proxy);
        M60E4 = new M60E4Factory().createGun(proxy);
        StonerA1 = new StonerA1Factory().createGun(proxy);
        SSG08 = new SSG08Factory().createGun(proxy);
        DSR1 = new DSR1Factory().createGun(proxy);
        L96A1 = new L96A1Factory().createGun(proxy);
        M200Intervention = new M200InterventionFactory().createGun(proxy);
        AS50 = new AS50Factory().createGun(proxy);
        M82 = new M82Factory().createGun(proxy);
//        NTW20 = new NTW20Factory().createGun(proxy);
        GL06 = new GL06Factory().createGun(proxy);
        M79 = new M79Factory().createGun(proxy);
        M32MGL = new M32MGLFactory().createGun(proxy);
        RPG7 = new RPG7Factory().createGun(proxy);
        M202 = new M202Factory().createGun(proxy);
        M134 = new M134Factory().createGun(proxy);
//        NinthSin = new NinthSinFactory().createGun(proxy);
        
        Chainsaw = new ChainsawFactory().createGun(proxy);
       
    }
}
