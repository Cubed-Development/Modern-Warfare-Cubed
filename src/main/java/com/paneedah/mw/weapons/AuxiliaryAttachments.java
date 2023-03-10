package com.paneedah.mw.weapons;

import com.paneedah.mw.ModernWarfareMod;
import com.paneedah.mw.models.*;
import com.paneedah.mw.utils.ModReference;
import com.paneedah.weaponlib.AttachmentBuilder;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.config.ConfigurationManager;
import org.lwjgl.opengl.GL11;

public class AuxiliaryAttachments {

    public static ItemAttachment<Weapon> AR15Iron;
    public static ItemAttachment<Weapon> Extra;
    public static ItemAttachment<Weapon> AR15Action;
    public static ItemAttachment<Weapon> M4EjectorAction;
    public static ItemAttachment<Weapon> SIG556Action;
    public static ItemAttachment<Weapon> SIGMCXAction;
    public static ItemAttachment<Weapon> M110EjectorAction;
    public static ItemAttachment<Weapon> BeowulfAction;
    public static ItemAttachment<Weapon> S710TricunActionPully;
    public static ItemAttachment<Weapon> S710TricunActionEjector;
    public static ItemAttachment<Weapon> SA80Action;
    public static ItemAttachment<Weapon> P90Action;
    public static ItemAttachment<Weapon> M110Action;
    public static ItemAttachment<Weapon> M4Rail;
    public static ItemAttachment<Weapon> M4AsiimovRail;
    public static ItemAttachment<Weapon> RailAlt;
    public static ItemAttachment<Weapon> AACRail;
    public static ItemAttachment<Weapon> M110Rail;
    public static ItemAttachment<Weapon> MagnumRail;
    public static ItemAttachment<Weapon> M45A1slide;
    public static ItemAttachment<Weapon> M17_Slide;
    public static ItemAttachment<Weapon> Makarov_Slide;
    public static ItemAttachment<Weapon> P12_Slide;
    public static ItemAttachment<Weapon> P2022_Slide;
    public static ItemAttachment<Weapon> BrowningHiPowerSlide;
    public static ItemAttachment<Weapon> Albert01Rslide;
    public static ItemAttachment<Weapon> M40A6BoltAction;
    public static ItemAttachment<Weapon> M40A6BoltActionPrime;
    public static ItemAttachment<Weapon> AX50BoltAction1;
    public static ItemAttachment<Weapon> AX50BoltAction2;
    public static ItemAttachment<Weapon> SSG08BoltAction1;
    public static ItemAttachment<Weapon> SSG08BoltAction2;
    public static ItemAttachment<Weapon> HecateIIBoltAction1;
    public static ItemAttachment<Weapon> HecateIIBoltAction2;
    public static ItemAttachment<Weapon> Remington700BoltAction;
    public static ItemAttachment<Weapon> Remington700BoltActionMain;
    public static ItemAttachment<Weapon> M500A2pump;
    public static ItemAttachment<Weapon> KS23pump;
    public static ItemAttachment<Weapon> AKaction;
    public static ItemAttachment<Weapon> DragunovAction;
    public static ItemAttachment<Weapon> Malyukaction;
    public static ItemAttachment<Weapon> KBP9A91action;
    public static ItemAttachment<Weapon> AK15action;
    public static ItemAttachment<Weapon> FNFALActionLever;
    public static ItemAttachment<Weapon> FNFALAction;
    public static ItemAttachment<Weapon> FamasF1Action;
    public static ItemAttachment<Weapon> AK12action;
    public static ItemAttachment<Weapon> SV98BoltAction;
    public static ItemAttachment<Weapon> L96A1BoltAction;
    public static ItemAttachment<Weapon> InterventionBoltAction;
    public static ItemAttachment<Weapon> VSSVintorezAction;
    public static ItemAttachment<Weapon> AS50Action;
    public static ItemAttachment<Weapon> P10Slide;
    public static ItemAttachment<Weapon> AKpart;
    public static ItemAttachment<Weapon> AKMuzzle;
    public static ItemAttachment<Weapon> P10frontsight;
    public static ItemAttachment<Weapon> SpringfieldRearSight;
    public static ItemAttachment<Weapon> SpringfieldAction;
    public static ItemAttachment<Weapon> Kar98Kaction;;
    public static ItemAttachment<Weapon> MG42latch;
    public static ItemAttachment<Weapon> MG34latch;
    public static ItemAttachment<Weapon> MG42Belt;
    public static ItemAttachment<Weapon> MG42action;
    public static ItemAttachment<Weapon> M60Hatch;
    public static ItemAttachment<Weapon> M60Belt;
    public static ItemAttachment<Weapon> STG44action;
    public static ItemAttachment<Weapon> STG44actionCover;
    public static ItemAttachment<Weapon> G43GewehrAction;
    public static ItemAttachment<Weapon> Mk14EBRaction;
    public static ItemAttachment<Weapon> Mk14EBRsight;
//    public static ItemAttachment<Weapon> Glock18Cslide;
    public static ItemAttachment<Weapon> L131A1slide;
    public static ItemAttachment<Weapon> APSslide;
    public static ItemAttachment<Weapon> APShammer;
    public static ItemAttachment<Weapon> MP443hammer;
    public static ItemAttachment<Weapon> USP45hammer;
    public static ItemAttachment<Weapon> P226hammer;
    public static ItemAttachment<Weapon> M9A1hammer;
    public static ItemAttachment<Weapon> KragAction1;
    public static ItemAttachment<Weapon> KragAction2;
    public static ItemAttachment<Weapon> KragChamber;
    public static ItemAttachment<Weapon> M712action;
    public static ItemAttachment<Weapon> UziAction;
    public static ItemAttachment<Weapon> UziRelease;
    public static ItemAttachment<Weapon> UziIronSight;
    public static ItemAttachment<Weapon> L115Bolt1;
    public static ItemAttachment<Weapon> L115Bolt2;
    public static ItemAttachment<Weapon> DSR1BoltAction;
    public static ItemAttachment<Weapon> DSR1BoltActionMain;
    public static ItemAttachment<Weapon> L115Mag;
    public static ItemAttachment<Weapon> Saiga12action;
    public static ItemAttachment<Weapon> Saiga12sights;
    public static ItemAttachment<Weapon> ScarAction;
    public static ItemAttachment<Weapon> ScarHAction;
    public static ItemAttachment<Weapon> M82Action;
    public static ItemAttachment<Weapon> MP5boltaction;
    public static ItemAttachment<Weapon> UMP45action;
    public static ItemAttachment<Weapon> MP5action;
    public static ItemAttachment<Weapon> MP7action;
    public static ItemAttachment<Weapon> G3Bolt;
    public static ItemAttachment<Weapon> G3Action;
    public static ItemAttachment<Weapon> MP40action;
    public static ItemAttachment<Weapon> M1A1ThompsonAction;
    public static ItemAttachment<Weapon> M1A1Sight;
    public static ItemAttachment<Weapon> M1928ThompsonAction;
    public static ItemAttachment<Weapon> M1928Sight;
    public static ItemAttachment<Weapon> CSA16pump;
    public static ItemAttachment<Weapon> R870part;
    public static ItemAttachment<Weapon> KedrAction;
    public static ItemAttachment<Weapon> KedrStock;
    public static ItemAttachment<Weapon> MP7Grip;
    public static ItemAttachment<Weapon> VP70slide;
    public static ItemAttachment<Weapon> HESCSpump;
    public static ItemAttachment<Weapon> BrenAction;
    public static ItemAttachment<Weapon> MP43Edoublebarrel;
    public static ItemAttachment<Weapon> M1873action;
    public static ItemAttachment<Weapon> F2000Action;
    public static ItemAttachment<Weapon> G36CAction;
    public static ItemAttachment<Weapon> GLgrenade;
    public static ItemAttachment<Weapon> M79grenade;
    public static ItemAttachment<Weapon> GL06Cartridge;
    public static ItemAttachment<Weapon> M79Cartridge;
    public static ItemAttachment<Weapon> M32Cartridge;
    public static ItemAttachment<Weapon> SSG42Barrels;
    public static ItemAttachment<Weapon> HAR27Belt;
    public static ItemAttachment<Weapon> HAR27Action;
    public static ItemAttachment<Weapon> ACRAction;
    public static ItemAttachment<Weapon> ACRRails;
    public static ItemAttachment<Weapon> M1014Action;
    public static ItemAttachment<Weapon> ShotgunInsertion;
    public static ItemAttachment<Weapon> SupernovaPump;
    public static ItemAttachment<Weapon> PythonChamber;
    public static ItemAttachment<Weapon> RevolverSpeedLoader;
    public static ItemAttachment<Weapon> RevolverSpeedLoaderBullets;
    public static ItemAttachment<Weapon> MagnumChamber;
    public static ItemAttachment<Weapon> RhinoChamber;
    public static ItemAttachment<Weapon> TheDechardChamber;
//    public static ItemAttachment<Weapon> P226Slide;
    public static ItemAttachment<Weapon> M1897Pump;
    public static ItemAttachment<Weapon> Super90Pump;
    public static ItemAttachment<Weapon> M32Main1B;
    public static ItemAttachment<Weapon> M134Barrels;
    public static ItemAttachment<Weapon> M249Hatch;
    public static ItemAttachment<Weapon> M249Belt;
    public static ItemAttachment<Weapon> M249Action;
    public static ItemAttachment<Weapon> FatmanGrip;
    public static ItemAttachment<Weapon> FatmanRack;
    public static ItemAttachment<Weapon> BrowningAuto5Action;
    public static ItemAttachment<Weapon> M1GarandAction;
    public static ItemAttachment<Weapon> M1GarandMag;
    public static ItemAttachment<Weapon> G11Action;
    public static ItemAttachment<Weapon> AUGAction;
    public static ItemAttachment<Weapon> StonerHATCH;
    public static ItemAttachment<Weapon> StonerBELT;
    public static ItemAttachment<Weapon> JohnsonACTION;
    public static ItemAttachment<Weapon> NTW20Barrel;
    public static ItemAttachment<Weapon> NTW20Action;
    public static ItemAttachment<Weapon> JohnsonRifleACTION;
    public static ItemAttachment<Weapon> JohnsonRifleSight;
    public static ItemAttachment<Weapon> StripperClip;
    public static ItemAttachment<Weapon> StripperClipBullets;
    public static ItemAttachment<Weapon> HS12Barrels;
    public static ItemAttachment<Weapon> M1CarbineAction;
    public static ItemAttachment<Weapon> Origin12Action;
    public static ItemAttachment<Weapon> G95IronSights;
    public static ItemAttachment<Weapon> G95UprightIronSights;
    public static ItemAttachment<Weapon> Tokyo90IronSights;
    public static ItemAttachment<Weapon> M14DMRRail;
    public static ItemAttachment<Weapon> OSIPRAutoSpanker;
    public static ItemAttachment<Weapon> OSIPRCell1;
    public static ItemAttachment<Weapon> OSIPRCell2;
    public static ItemAttachment<Weapon> OSIPRCellClaws;
    public static ItemAttachment<Weapon> OSIPRCellFinger;
    public static ItemAttachment<Weapon> OSIPRHeatEscaper;
    public static ItemAttachment<Weapon> K2C1Action;
    public static ItemAttachment<Weapon> ScorpionAction;
    public static ItemAttachment<Weapon> APC9Action;
    public static ItemAttachment<Weapon> ARX160Action;
    public static ItemAttachment<Weapon> MAS21Slide;
    public static ItemAttachment<Weapon> MAS21Part;
    public static ItemAttachment<Weapon> MAS21Barrel;
    public static ItemAttachment<Weapon> PanelUpper;
    public static ItemAttachment<Weapon> PanelLower;
    public static ItemAttachment<Weapon> RegulatorUpper;
    public static ItemAttachment<Weapon> RegulatorLower;
    public static ItemAttachment<Weapon> RegulatorRotator;
    public static ItemAttachment<Weapon> RegulatorActionUpper;
    public static ItemAttachment<Weapon> RegulatorActionLower;
    public static ItemAttachment<Weapon> RegulatorAction;
    public static ItemAttachment<Weapon> CyclerFront;
    public static ItemAttachment<Weapon> CyclerBackLeft;
    public static ItemAttachment<Weapon> CyclerBackRight;
    public static ItemAttachment<Weapon> Cycler;
    public static ItemAttachment<Weapon> M4hands;
    
    //Magazines
    public static ItemAttachment<Weapon> P10Mag;
    public static ItemAttachment<Weapon> M41AMag;
    public static ItemAttachment<Weapon> M56Mag;
    public static ItemAttachment<Weapon> HAR27Mag;
    
    //Projectiles
    public static ItemAttachment<Weapon> ShotgunShell;
    public static ItemAttachment<Weapon> ShotgunShellDouble;
    public static ItemAttachment<Weapon> Shotgun4Gauge;
    public static ItemAttachment<Weapon> Bullet;
    public static ItemAttachment<Weapon> BulletSmall;
    public static ItemAttachment<Weapon> LaserProjectile;
    public static ItemAttachment<Weapon> RPG7rocket;
    public static ItemAttachment<Weapon> M202rockets;
    
    public static ItemAttachment<Weapon> Chain;
    public static ItemAttachment<Weapon> ChainA;
    public static ItemAttachment<Weapon> ChainB;
    
    public static void init(Object mod, ConfigurationManager configurationManager, CompatibleFmlPreInitializationEvent event) {
        
    	
    	PanelUpper = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinPanelUpper(), "ninthsin.png")
                .withName("PanelUpper")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	PanelLower = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinPanelLower(), "ninthsin.png")
                .withName("PanelLower")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	RegulatorUpper = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinRegulatorUpper(), "ninthsin.png")
                .withName("RegulatorUpper")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	RegulatorLower = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinRegulatorLower(), "ninthsin.png")
                .withName("RegulatorLower")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	RegulatorRotator = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA5)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinRegulatorRotator(), "ninthsin.png")
                .withName("RegulatorRotator")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	RegulatorActionUpper = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinRegulatorActionUpper(), "ninthsin.png")
                .withName("RegulatorActionUpper")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	RegulatorActionLower = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinRegulatorActionLower(), "ninthsin.png")
                .withName("RegulatorActionLower")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	RegulatorAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA8)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinRegulatorAction(), "ninthsin.png")
                .withName("RegulatorAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	CyclerFront = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA9)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinCycleFront(), "ninthsin.png")
                .withName("CyclerFront")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	CyclerBackLeft = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA10)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinCycleBackLeft(), "ninthsin.png")
                .withName("CyclerBackLeft")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	CyclerBackRight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA11)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinCycleBackRight(), "ninthsin.png")
                .withName("CyclerBackRight")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
    	
    	Cycler = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA12)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NinthSinCycle(), "ninthsin.png")
                .withName("Cycler")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ChainB = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.ChainsawChainB(), "chainsaw.png")
                .withName("ChainB")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ChainA = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.ChainsawChainA(), "chainsaw.png")
                .withName("ChainA")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Chain = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.ChainsawChain(), "chainsaw.png")
                .withName("Chain")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        G95IronSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.G95_frontsights(), "gun.png")
                .withModel(new com.paneedah.mw.models.G95_rearsights(), "gun.png")
                .withName("G95IronSights")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        G95UprightIronSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.G95_upright_frontsights(), "gun.png")
                .withModel(new com.paneedah.mw.models.G95_upright_rearsights(), "gun.png")
                .withName("G95UprightIronSights")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Origin12Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Origin12Action(), "origin12.png")
                .withName("Origin12Action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P90Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.P90Action(), "p90.png")
                .withName("P90Action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1CarbineAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1CarbineAction(), "gun.png")
                .withName("M1CarbineAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        G11Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withRotationPoint(0.1452000024497508, -0.805199984866377, 1.229600028479095)
                .withModel(new com.paneedah.mw.models.G11Action(), "gun.png")
                .withName("G11Action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AUGAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.AUGaction(), "gun.png")
                .withName("AUGAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MAS21Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MAS21Slide(), "MAS21.png")
                .withModel(new com.paneedah.mw.models.P226rearsight(), "p226rearsight.png")
                .withModel(new com.paneedah.mw.models.P226frontsight(), "p226frontsight.png")
                .withName("MAS21Slide")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MAS21Barrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MAS21Barrel(), "MAS21.png")
                .withName("MAS21Barrel")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MAS21Part = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MAS21Part(), "MAS21.png")
                .withName("MAS21Part")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M32Main1B = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M32Main1B(), "gun.png")
                .withModel(new com.paneedah.mw.models.Suppressor(), "gun.png")
                .withName("M32Main1B")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M134Barrels = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M134Barrels(), "gun.png")
                .withName("M134Barrels")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BrowningAuto5Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.BrowningAuto5Action(), "gun.png").withName("BrowningAuto5Action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1GarandAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1GarandAction(), "gun.png").withName("M1GarandAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1GarandMag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1GarandMag1(), "M1GarandMag.png")
                .withModel(new com.paneedah.mw.models.M1GarandMag2(), "M1GarandMag.png")
                .withName("M1GarandMag")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M1897Pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1897Pump(), "m1897.png").withName("M1897pump")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Super90Pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Super90Pump(), "gun.png").withName("Super90Pump")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
//        P226Slide = new AttachmentBuilder<Weapon>()
//                .withCategory(AttachmentCategory.EXTRA)
//                // .withCreativeTab(ModernWarfareMod.gunsTab)
//                .withModel(new com.paneedah.mw.models.P226Slide(), "P226.png")
//                .withModel(new com.paneedah.mw.models.P226rearsight(), "p226rearsight.png")
//                .withModel(new com.paneedah.mw.models.P226frontsight(), "p226frontsight.png")
//                .withName("P226Slide")
//                .withRenderablePart().withModId(ModReference.MWC_ID).withTextureName("Dummy.png")
//                .build(ModernWarfareMod.MOD_CONTEXT);
        
        PythonChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.PythonChamber(), "Python.png")
                .withName("PythonChamber")
                .withRotationPoint(-0.11759999474287039, -0.9064000131249434, -0.8943999600172051)
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RevolverSpeedLoader = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.TaurusLoader(), "taurusraginghunter.png")
                .withName("RevolverSpeedloader")
                .withRotationPoint(-0.11759999474287039, 0.07280001164674715, 0.8548000601351243)
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RevolverSpeedLoaderBullets = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.TaurusBullets(), "taurusraginghunter.png")
                .withName("RevolverSpeedloaderBullets")
                .withRotationPoint(-0.11759999474287039, -0.9064000131249434, -0.8943999600172051)
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MagnumChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.TaurusRagingHunterChamber(), "taurusraginghunter.png")
                .withName("MagnumChamber")
                .withRotationPoint(-0.11759999474287039, -0.9064000131249434, -0.8943999600172051)
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        RhinoChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new ChiappoRhinoChamber(), "chiapparhino.png").withName("RhinoChamber")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ACRAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.ACRAction(), "ACR.png")
                .withModel(new com.paneedah.mw.models.ACRAction2(), "gun.png")
                .withName("ACRAction").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1014Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.M1014action(), "m1014.png")
                .withName("M1014Action").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ShotgunInsertion = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.ShotgunInsertion(), "ShotgunInsertion.png")
                .withName("ShotgunInsertion").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SupernovaPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.SupernovaPump(), "supernova.png")
                .withName("SupernovaPump").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ACRRails = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.paneedah.mw.models.AKRail(), "acrsbrhandguardtan.png")
                .withModel(new com.paneedah.mw.models.AKRail2(), "acrsbrhandguardtan.png")
                .withModel(new com.paneedah.mw.models.AKRail3(), "acrsbrhandguardtan.png")
                .withModel(new com.paneedah.mw.models.AKRail4(), "acrsbrhandguardtan.png")
                .withModel(new com.paneedah.mw.models.AKRail5(), "acrsbrhandguardtan.png")
                .withName("ACRRails").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        RPG7rocket = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.RPG7rocket(), "rpg7.png")
                .withRenderablePart()
                .withName("RPG7rocket").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M202rockets = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.M202Rockets(), "gun.png")
                .withRenderablePart()
                .withName("m202rockets").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        GLgrenade = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                .withModel(new GL06Grenade(), "GL06.png")
                .withRenderablePart()
                .withName("GLgrenade").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);

        M79grenade = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                .withModel(new com.paneedah.mw.models.M79grenade(), "gun.png")
                .withRenderablePart()
                .withName("M79grenade").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        GL06Cartridge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.GL06Cartridge(), "GL06.png")
                .withRenderablePart()
                .withName("GL06Cartridge").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M79Cartridge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.M79Cartridge(), "m79.png")
                .withRenderablePart()
                .withName("M79Cartridge").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M32Cartridge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.M32Cartridge(), "gun.png")
                .withRenderablePart()
                .withName("M32Cartridge").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M41AMag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M41AMag(), "M41AMag.png")
                .withName("M41AMag")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP43Edoublebarrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MP43Edoublebarrel(), "MP43Edoublebarrel.png")
                .withName("MP43Edoublebarrel")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        HS12Barrels = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.HS12Barrels(), "gun.png")
                .withModel(new com.paneedah.mw.models.AKRail(), "gun.png")
                .withModel(new com.paneedah.mw.models.AKRail2(), "gun.png")
                .withModel(new com.paneedah.mw.models.M1911frontsight(), "gun")
                .withName("HS12Barrels")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1873action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1873action(), "M1873.png")
                .withName("M1873action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        F2000Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.F2000Action(), "gun.png")
                .withName("F2000Action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G36CAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.G36CAction(), "g36c.png")
                .withName("G36CAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ARX160Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.ARX160Action(), "gun.png")
                .withName("ARX160Action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1ThompsonAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1A1action(), "M1A1Thompson.png")
                .withName("M1A1ThompsonAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        KedrAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.KedrAction(), "kedr.png")
                .withName("KedrAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        KedrStock = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.KedrStock(), "kedr.png")
                .withName("KedrStock")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP7Grip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MP7Grip(), "mp7.png")
                .withName("MP7Grip")
                .withRotationPoint(-0.12000000357627871, -0.20000000596046452, -1.6000000476837126)
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1928ThompsonAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1928ThompsonAction(), "M1A1Thompson.png")
                .withName("M1928ThompsonAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1A1Sight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1A1rearsight(), "gun.png")
                .withName("M1A1ThompsonSight")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M1928Sight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M1928rearsight(), "gun.png")
                .withName("M1928Sight")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        R870part = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.R870part(), "gun.png")
                .withName("R870part")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M82Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M82Action(), "m82.png")
                .withName("m82action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP40action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MP40Action(), "MP40.png")
                .withName("MP40action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5boltaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MP5boltaction(), "MP5.png")
                .withName("MP5boltaction")
                .withRotationPoint(-0.12000000357627871, -1.1200000333786013, -2.320000069141389)
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        UMP45action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.UMP45Action(), "ump45.png")
                .withName("UMP45action")
                .withRotationPoint(-0.12000000357627871, -1.1200000333786013, -2.320000069141389)
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP5action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MP5action(), "MP5.png")
                .withName("MP5action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MP7action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MP7Action(), "MP7.png")
                .withName("MP7action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G3Bolt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.G3ChargingHandle(), "G3.png")
                .withName("G3Bolt")
                .withRotationPoint(0.0, -1.0800000321865084, -4.120000122785571)
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G3Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.G3Action(), "G3.png")
                .withName("G3Action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG42Belt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MG42belt(), "mg42.png")
                .withName("mg42belt")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG42latch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MG42latch(), "mg42.png")
                .withName("mg42latch")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG34latch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MG34Latch(), "mg42.png")
                .withName("mg34latch")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M60Belt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M60Belt(), "m60.png")
                .withName("M60Belt")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        StonerHATCH = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.StonerA1HATCH(), "gun.png")
                .withModel(new M27rearsight(), "gun.png")
                .withName("StonerHATCH")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        StonerBELT = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.StonerA1BELT(), "gun.png")
                .withName("StonerBELT")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        JohnsonACTION = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.JohnsonLMGACTION(), "gun.png")
                .withName("JohnsonLMGACTION")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        JohnsonRifleACTION = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.JohnsonRifleAction(), "gun.png")
                .withName("JohnsonRifleAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        JohnsonRifleSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.JohnsonRifleSight(), "gun.png")
                .withName("JohnsonRifleSight")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        StripperClip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.LeeEnfieldClip(), "stripperclip.png")
                .withName("StripperClip")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        StripperClipBullets = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.LeeEnfieldClipBullets(), "stripperclip.png")
                .withName("StripperClipBullets")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        NTW20Barrel = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NTW20Barrel(), "gun.png")
                .withName("NTW20Barrel")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        NTW20Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.NTW20ACTION(), "gun.png")
                .withName("NTW20Action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M60Hatch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M60Hatch(), "m60.png")
                .withName("M60Hatch")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Belt = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M249Belt(), "m249.png")
                .withName("M249Belt")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Hatch = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M249Hatch(), "m249.png")
                .withModel(new com.paneedah.mw.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mw.models.M249RearSight(), "gun.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .withName("M249Hatch")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M249Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M249Action(), "m249.png")
                .withName("M249Action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MG42action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MG42action(), "mg42.png")
                .withName("mg42action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ScarAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.ScarAction(), "gun.png")
                .withName("ScarAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ScarHAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.ScarHAction(), "scarh.png")
                .withName("ScarHAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Mk14EBRaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Mk14EBRaction(), "m14dmr.png")
                .withName("Mk14EBRaction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Mk14EBRsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.m1garandrearsight(), "gun.png")
                .withName("Mk14EBRsight")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M14DMRRail = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M14DMRRail(), "gun.png")
                .withName("M14DMRRail")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        STG44action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.STG44Action(), "STG44.png")
                .withName("STG44action")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        STG44actionCover = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.STG44actioncover(), "gun.png")
                .withName("STG44actioncover")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        G43GewehrAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.G43GewehrAction(), "gun.png")
                .withName("G43GewehrAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SpringfieldRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.SpringfieldRearSight(), "gun.png")
                .withName("SpringfieldRearSight")
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SpringfieldAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.SpringfieldAction(), "m1903a3.png")
                .withName("SpringfieldAction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        Kar98Kaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA7)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Kar98Kboltaction(), "gun.png")
                .withName("Kar98Kaction")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        VP70slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.VP70slide(), "vp70.png")
                .withModel(new com.paneedah.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mw.models.GlockRearSight(), "glockrearsight")
                .withName("VP70slide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        APSslide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.APSslide(), "APS.png")
                .withModel(new com.paneedah.mw.models.makarovfrontsight(), "gun")
                .withModel(new com.paneedah.mw.models.APSrearsight(), "gun")
                .withName("APSslide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        APShammer = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.APShammer(), "APS.png")
                .withName("APShammer")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        USP45hammer = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.USP45Hammer(), "usp45.png")
                .withName("USP45hammer")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P226hammer = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.P226Hammer(), "p226.png")
                .withName("P226hammer")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M9A1hammer = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M9hammer(), "m9a1.png")
                .withName("M9A1hammer")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        MP443hammer = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MP443Hammer(), "mp443.png")
                .withName("MP443hammer")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M712action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M712action(), "m712.png")
                .withName("M712action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M45A1slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Emp1911Slide(), "Emp1911.png")
                .withModel(new com.paneedah.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mw.models.M1911rearsight(), "m1911rearsight")
                .withName("M45A1slide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M17_Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M17Slide(), "m17.png")
                .withModel(new com.paneedah.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("m17_slide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Makarov_Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MakarovSlide(), "gun.png")
                .withModel(new com.paneedah.mw.models.makarovrearsight(), "gun.png")
                .withModel(new com.paneedah.mw.models.makarovfrontsight(), "gun.png")
                .withName("Makarov_Slide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P12_Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.USP45Slide(), "usp45.png")
                .withModel(new com.paneedah.mw.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mw.models.P2000rearsight(), "m1911frontsight.png")
                .withName("P12_Slide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BrowningHiPowerSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.BrowningHiPowerSlide(), "BrowningHiPower.png")
                .withModel(new com.paneedah.mw.models.M1911frontsight(), "gun")
                .withModel(new com.paneedah.mw.models.makarovrearsight(), "gun")
                .withName("BrowningHiPowerSlide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        VSSVintorezAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.VSSVintorezAction(), "vssvintorez.png")
                .withName("VSSVintorezAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AKaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.AK47Action(), "ak47.png")
                .withName("AKaction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DragunovAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.DragunovAction(), "dragunov.png")
                .withName("DragunovAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Malyukaction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.MalyukAction(), "malyuk.png")
                .withName("Malyukaction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK15action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.AK15Action(), "ak15.png")
                .withName("AK15action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KBP9A91action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.KBP9A91Action(), "KBP9A91.png")
                .withName("KBP9A91action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FNFALActionLever = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.FNFALActionLever(), "FNFAL.png")
                .withName("FNFALActionLever")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FNFALAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.FNFALAction(), "FNFAL.png")
                .withName("FNFALAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        FamasF1Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.FamasF1Action(), "famasf1.png")
                .withName("FamasF1Action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AK12action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.AK12action(), "ak12kal.png")
                .withName("AK12action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Saiga12action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Saiga12action(), "gun.png").withName("Saiga12action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Saiga12sights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.makarovrearsight(), "gun.png")
                .withModel(new com.paneedah.mw.models.makarovfrontsight(), "gun.png")
                .withName("Saiga12sights")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AS50Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new AS50action(), "as50.png")
                .withName("AS50Action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Albert01Rslide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Albert01RSlide(), "Albert01R.png")
                .withModel(new com.paneedah.mw.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.paneedah.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("albert01R_slide")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        UziAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.UziAction(), "gun.png")
                .withName("UziAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        UziRelease = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.UziRelease(), "gun.png")
                .withName("UziRelease")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        UziIronSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.UziFrontSight(), "gun.png")
                .withModel(new com.paneedah.mw.models.UziRearSight(), "gun.png")
                .withName("UziIronSight")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        P10frontsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.makarovfrontsight(), "gun.png")
//                .withModel(new com.paneedah.mw.models.M9A1frontsight(), "M9A1frontsight")
//                .withModel(new com.paneedah.mw.models.M9A1rearsight(), "M9A1rearsight")
                .withName("P10frontsight")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M40A6BoltAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                .withRotationPoint(0.2791999875187876, -1.7068000399291512, 0.3259999854266646)
                .withModel(new com.paneedah.mw.models.GunwerksHAMRboltaction(), "gunwerkshamr")
                .withName("M40A6BoltAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M40A6BoltActionPrime = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                .withRotationPoint(0.12159999456405646, -1.5596000435292718, 0.8224000258207329)
                .withModel(new com.paneedah.mw.models.GunwerksHAMRboltactionPrime(), "gunwerkshamr")
                .withName("M40A6BoltActionPrime")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SSG08BoltAction1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.SSG08BoltAction1(), "SSG08_2")
                .withName("SSG08BoltAction1")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SSG08BoltAction2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.SSG08BoltAction2(), "SSG08")
                .withName("SSG08")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington700BoltAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.R700action(), "remington700")
                .withName("Remington700BoltAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Remington700BoltActionMain = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.R700actionMain(), "remington700")
                .withName("Remington700BoltActionMain")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        SV98BoltAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.SV98Action(), "sv98")
                .withName("SV98BoltAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        L115Bolt1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.L96Action(), "L96Action.png").withName("L96Action")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        L115Bolt2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.L115Bolt2(), "gun.png").withName("LP115Bolt2")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DSR1BoltAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.DSR1BoltAction(), "dsr1.png")
                .withName("DSR1BoltAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        DSR1BoltActionMain = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.DSR1BoltActionMain(), "dsr1.png")
                .withName("DSR1BoltActionMain")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        InterventionBoltAction = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.InterventionBoltAction(), "intervention.png")
                .withName("InterventionBoltAction")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        L115Mag = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.L115Mag(), "gun.png").withName("L115Mag")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        M500A2pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.M500A2pump(), "gun")
                .withName("M500A2pump")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        HESCSpump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.HEShotgunPump(), "spas12")
                .withName("HESCSpump")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KS23pump = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.KS23pump(), "ks23")
                .withName("KS23pump")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KragAction1 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.KragJorgensenAction1(), "KragJorgensen")
                .withName("KragAction1")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KragAction2 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA3)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.KragJorgensenAction2(), "KragJorgensen")
                .withName("KragAction2")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        KragChamber = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.KragJorgensenChamber(), "KragJorgensen")
                .withName("KragChamber")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ShotgunShell = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Shotgun12Gauge(), "shotgun12gauge")
                .withName("ShotgunShell")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        ShotgunShellDouble = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA2)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Shotgun12Gauge(), "shotgun12gauge")
                .withModel(new com.paneedah.mw.models.Shotgun12Gauge2(), "shotgun12gauge")
                .withName("ShotgunShellDouble")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Shotgun4Gauge = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Shotgun12Gauge(), "Shotgun4Gauge")
                .withName("Shotgun4Gauge")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        Bullet = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.BulletBig(), "Bullet")
                .withName("Bullet")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        BulletSmall = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.Bullet44(), "Bullet")
                .withName("BulletSmall")
                .withRenderablePart()
                .withModId(ModReference.id)
                .withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        LaserProjectile = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA4)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new com.paneedah.mw.models.LaserProjectile(), "Laser")
                .withName("LaserProjectile")
                .withRenderablePart().withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);
        
        AR15Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.AR15Action(), "ar15action.png")
                .withName("AR15Action").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M4EjectorAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mw.models.M4A1Action(), "m4a1.png")
                .withName("M4EjectorAction").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SIG556Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mw.models.SIG556Action(), "sig556.png")
                .withName("SIG556Action").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SIGMCXAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mw.models.SIGMCXAction(), "sigmcx.png")
                .withName("SIGMCXAction").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M110EjectorAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mw.models.M110Action(), "m110.png")
                .withName("M110EjectorAction").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        BeowulfAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mw.models.Beowulf50CalAction(), "beowulf50cal.png")
                .withName("BeowulfAction").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        S710TricunActionPully = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.S710TricunActionPully(), "s710tricun.png")
                .withName("S710TricunActionPully").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        S710TricunActionEjector = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.S710TricunActionEjector(), "s710tricun.png")
                .withName("S710TricunActionEjector").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        K2C1Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.K2C1Action(), "k2c1.png")
                .withName("K2C1Action").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        ScorpionAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.ScorpionEVO3A1Action(), "ScorpionEVO3A1.png")
                .withName("ScorpionAction").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        APC9Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.APC9Action(), "gun.png")
                .withName("APC9Action").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        SA80Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.SA80Action(), "sa80.png")
                .withName("SA80Action").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        BrenAction = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.CZ805BrenAction(), "cz805bren.png")
                .withName("BrenAction").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M110Action = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new com.paneedah.mw.models.AR15Action(), "M110action.png")
                .withName("M110Action").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AR15Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(ModernWarfareMod.AttachmentsTab)
                .withModel(new M4Iron1(), "gun.png")
                .withModel(new M4Iron2(), "AK12.png")
                .withModel(new FALIron(), "gun.png")
                .withModel(new ARCarryHandle(), "arcarryhandle.png")
                .withRequiredAttachments(Attachments.M4Receiver, Attachments.VLTORReceiver, Attachments.HoneyBadgerReceiver,
                		Attachments.HoneyBadgerReceiverBlack)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mw.models.ARCarryHandle) {
                        GL11.glTranslatef(-0.6F, -0.7F, -0.25F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.45F, 0.45F, 0.45f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mw.models.ARCarryHandle) {
                        GL11.glTranslatef(0.1F, 0F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mw.models.ARCarryHandle) {
                        GL11.glTranslatef(-1.6F, -0.5F, 1.2F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AR15Iron").withModId(ModReference.id).withTextureName("Dummy.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Extra = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA6)
                // .withCreativeTab(ModernWarfareMod.gunsTab)
                .withModel(new AKMiron1(), "gun.png").withModel(new AKMiron2(), "gun.png")
                .withModel(new AK47iron(), "gun.png").withModel(new M4Iron1(), "gun.png")
                .withModel(new M4Iron2(), "gun.png").withModel(new P90iron(), "gun.png")
                .withModel(new G36CIron1(), "gun.png").withModel(new G36CIron2(), "gun.png")
                .withModel(new ScarIron1(), "gun.png").withModel(new ScarIron2(), "gun.png")
                .withModel(new FALIron(), "gun.png").withModel(new M14Iron(), "gun.png")
                .withModel(new MP5Iron(), "gun.png")
                .withName("Extra").withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M4Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.paneedah.mw.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mw.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mw.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mw.models.AKRail4(), "akrail.png")
                .withModel(new com.paneedah.mw.models.AKRail5(), "akrail.png")
                .withName("M4Rail").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M4AsiimovRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.paneedah.mw.models.AKRail(), "m4asiimovrail.png")
                .withName("M4AsiimovRail").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        MagnumRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.paneedah.mw.models.AKRail(), "magnumrail.png")
                .withName("MagnumRail").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        RailAlt = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.RailAlt(), "gun.png")
                .withName("RailAlt").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AACRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.paneedah.mw.models.AKRail(), "aacrail_main.png")
                .withName("AACRail").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        M110Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.paneedah.mw.models.AKRail(), "M110.png")
                .withModel(new com.paneedah.mw.models.AKRail2(), "M110.png")
                .withModel(new com.paneedah.mw.models.AKRail3(), "M110.png")
                .withModel(new com.paneedah.mw.models.AKRail4(), "M110.png")
                .withModel(new com.paneedah.mw.models.AKRail5(), "M110.png")
                .withName("M110Rail").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AKpart = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA5)
                .withModel(new com.paneedah.mw.models.AKpart(), "gun")
                .withName("AKpart").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
        
        AKMuzzle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA3)
                .withModel(new com.paneedah.mw.models.Suppressor(), "gun")
                .withName("AKmuzzle").withRenderablePart().withModId(ModReference.id)
                .withTextureName("Dummy.png").build(ModernWarfareMod.MOD_CONTEXT);
    }
    
}
