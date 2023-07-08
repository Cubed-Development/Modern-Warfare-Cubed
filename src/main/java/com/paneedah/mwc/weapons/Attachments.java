package com.paneedah.mwc.weapons;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

public class Attachments {

    public static ItemAttachment<Weapon> OKP7;
    public static ItemAttachment<Weapon> PSO1;
    public static ItemAttachment<Weapon> FMG9Sight;
    public static ItemAttachment<Weapon> Reflex;
    public static ItemAttachment<Weapon> BijiaReflex;
    public static ItemAttachment<Weapon> Holographic;
    public static ItemAttachment<Weapon> HolographicAlt;
    public static ItemAttachment<Weapon> EotechHybrid2;
    //public static ItemAttachment<Weapon> Vortex;
    public static ItemAttachment<Weapon> VortexRedux;
    public static ItemAttachment<Weapon> Kobra;
    public static ItemAttachment<Weapon> KobraGen3;
    public static ItemAttachment<Weapon> KobraMount;
    public static ItemAttachment<Weapon> MicroReflex;
    public static ItemAttachment<Weapon> ACOG;
    public static ItemAttachment<Weapon> Specter; 
    public static ItemAttachment<Weapon> HP;
    public static ItemAttachment<Weapon> LeupoldRailScope;
    public static ItemAttachment<Weapon> AX50Scope;
    public static ItemAttachment<Weapon> NightRaider;
    public static ItemAttachment<Weapon> M2A1sight;
    public static ItemAttachment<Weapon> F2000Scope;
    public static ItemAttachment<Weapon> Silencer556x45;
    public static ItemAttachment<Weapon> Silencer762x39;
    public static ItemAttachment<Weapon> Silencer556x39;
    public static ItemAttachment<Weapon> Silencer545x39;
    public static ItemAttachment<Weapon> Silencer50BMG;
    public static ItemAttachment<Weapon> SilencerPBS;
    public static ItemAttachment<Weapon> Silencer9mm;
    public static ItemAttachment<Weapon> SamuraiEdgeSuppressor;
    public static ItemAttachment<Weapon> Silencer762x54;
    public static ItemAttachment<Weapon> Silencer762x51;
    public static ItemAttachment<Weapon> Silencer45ACP;
    public static ItemAttachment<Weapon> SilencerEABH;
    public static ItemAttachment<Weapon> Silencer12Gauge;
    public static ItemAttachment<Weapon> Silencer65x39;
    public static ItemAttachment<Weapon> Silencer57x38;
    public static ItemAttachment<Weapon> Silencer300AACBlackout;
    public static ItemAttachment<Weapon> HoneyBadgerSilencer;
    public static ItemAttachment<Weapon> Silencer357;
    public static ItemAttachment<Weapon> SilencerMP7;
    public static ItemAttachment<Weapon> Silencer9x39mm;
    public static ItemAttachment<Weapon> SuppressorKBP9A91;
    public static ItemAttachment<Weapon> Laser;
    public static ItemAttachment<Weapon> Laser2;
    public static ItemAttachment<Weapon> SCCYCPX2Laser;
    public static ItemAttachment<Weapon> DanWessonLaser;
    public static ItemAttachment<Weapon> OSIPRLaser;
    public static ItemAttachment<Weapon> Grip2;
    public static ItemAttachment<Weapon> AngledGrip;
    public static ItemAttachment<Weapon> JunoGrip;
    public static ItemAttachment<Weapon> StubbyGrip;
    public static ItemAttachment<Weapon> VGrip;
    public static ItemAttachment<Weapon> Bipod;
    public static ItemAttachment<Weapon> AUGgrip;
    public static ItemAttachment<Weapon> USPMatchCompensator;
    public static ItemAttachment<Weapon> AKMIron;
    public static ItemAttachment<Weapon> MicroT1;
    public static ItemAttachment<Weapon> AimpointCompM2;
    public static ItemAttachment<Weapon> AimpointCompM5;
    public static ItemAttachment<Weapon> RMR; 
    public static ItemAttachment<Weapon> AK15ironsight;
    public static ItemAttachment<Weapon> AK12ironsight;
    public static ItemAttachment<Weapon> M202scope;
    public static ItemAttachment<Weapon> AUGscope;
    public static ItemAttachment<Weapon> M1928Grip;
    public static ItemAttachment<Weapon> M1A1Grip;
    public static ItemAttachment<Weapon> LeupoldScope;
    public static ItemAttachment<Weapon> TritiumRearSights;
    public static ItemAttachment<Weapon> MBUSRearSights;
    public static ItemAttachment<Weapon> HK416RearSights;
    public static ItemAttachment<Weapon> FNFALRearSights;
    public static ItemAttachment<Weapon> M16A1RearSights;
    public static ItemAttachment<Weapon> OSIPRMiniScope;
    public static ItemAttachment<Weapon> OSIPRSight;
    public static ItemAttachment<Weapon> K2C1RearSights;
    public static ItemAttachment<Weapon> ScorpionRearSight;
    public static ItemAttachment<Weapon> ScorpionFrontSight;
    public static ItemAttachment<Weapon> MP7IronSights;
    public static ItemAttachment<Weapon> MP7IronSightsStanding;
    
    //Weapon Parts
    public static ItemAttachment<Weapon> G11HandguardK1;
    public static ItemAttachment<Weapon> G11HandguardK2;
    
    public static ItemAttachment<Weapon> AK47DustCover;
    public static ItemAttachment<Weapon> AKMDustCover;
    public static ItemAttachment<Weapon> VeprDustCover;
    public static ItemAttachment<Weapon> AK101DustCover;
    public static ItemAttachment<Weapon> AK15DustCover;
    
    public static ItemAttachment<Weapon> DragunovDustCover;
    public static ItemAttachment<Weapon> Dragunov98DustCover;

    public static ItemAttachment<Weapon> AK12DustCover;
    public static ItemAttachment<Weapon> AK12BDustCover;
    
    public static ItemAttachment<Weapon> VSSVintorezDustCover;
    public static ItemAttachment<Weapon> VSSMDustCover;
    
    public static ItemAttachment<Weapon> FNFALDustCover;
    public static ItemAttachment<Weapon> FNFALGrip;
    public static ItemAttachment<Weapon> FNFALStock;
    public static ItemAttachment<Weapon> FNFALHandguard;
    public static ItemAttachment<Weapon> SA58DustCover;
    public static ItemAttachment<Weapon> FNFALPARAHandguard;
    
    public static ItemAttachment<Weapon> AK47HandleGuard;
    public static ItemAttachment<Weapon> AK101HandGuard;
    public static ItemAttachment<Weapon> AK74Handguard;
    public static ItemAttachment<Weapon> AKMagpulHandleGuard;
    public static ItemAttachment<Weapon> AKMagpulHandleGuardTan;
    public static ItemAttachment<Weapon> MLOKHandguard;
    public static ItemAttachment<Weapon> MLOKExtendedHandguard;
    public static ItemAttachment<Weapon> AK15HandleGuard;
    public static ItemAttachment<Weapon> AK12kalHandguard;
    public static ItemAttachment<Weapon> RPK16Handguard;
    public static ItemAttachment<Weapon> DragunovHandguard;
    public static ItemAttachment<Weapon> Dragunov98Handguard;
    
    public static ItemAttachment<Weapon> AK12Handguard;
    public static ItemAttachment<Weapon> AK12BHandguard;
    
    public static ItemAttachment<Weapon> KBP9A91Handguard;
    public static ItemAttachment<Weapon> KBP9A91CompactHandguard;
    public static ItemAttachment<Weapon> KBP9A91KulaTacHandguard;
    
    public static ItemAttachment<Weapon> VSSVintorezHandguard;
    public static ItemAttachment<Weapon> ASValHandguard;
    
    public static ItemAttachment<Weapon> VSSVintorezTriRailMount;
    
    // M4A1 (and M16)
    public static ItemAttachment<Weapon> M4HandGuard;
    public static ItemAttachment<Weapon> M4MagpulHandGuard;
    public static ItemAttachment<Weapon> M4MagpulHandGuardTan;
    public static ItemAttachment<Weapon> M4CarbineHandGuard;
    public static ItemAttachment<Weapon> LVOAVHandGuard;
    public static ItemAttachment<Weapon> AR15HandGuard;
    public static ItemAttachment<Weapon> Block2SOCOMHandguard;
    public static ItemAttachment<Weapon> Mk18HandGuard;
    public static ItemAttachment<Weapon> Mk18HandGuardBlack;
    public static ItemAttachment<Weapon> FSSTacLiteHandguard;
    
    // M16 (and M4A1)
    public static ItemAttachment<Weapon> M16HandGuard;
    public static ItemAttachment<Weapon> M16A4HandGuard;
    public static ItemAttachment<Weapon> M16A1Handguard;
    
    // HK416
    public static ItemAttachment<Weapon> M38HandGuard;
    public static ItemAttachment<Weapon> HK416HandGuardBlackAndTan;
    
    // other ARs
    
    public static ItemAttachment<Weapon> M110Handguard;
    public static ItemAttachment<Weapon> Z10Handguard;
    public static ItemAttachment<Weapon> AR10SuperSASSHandguard;
    public static ItemAttachment<Weapon> C8SFWHandguard;
    public static ItemAttachment<Weapon> HK417Handguard;
    public static ItemAttachment<Weapon> HK417HandguardTan;
    
    public static ItemAttachment<Weapon> SIG556Handguard;
    public static ItemAttachment<Weapon> SIG556HandguardRailed;
    public static ItemAttachment<Weapon> SIG556HandguardKA;
    public static ItemAttachment<Weapon> SIG556Grip;
    
    public static ItemAttachment<Weapon> S710Handguard;
    
    public static ItemAttachment<Weapon> SIGMCXHandguard;
    public static ItemAttachment<Weapon> SIGMCXHandguardShort;
    
    public static ItemAttachment<Weapon> MPXHandguard;
    public static ItemAttachment<Weapon> MPXHandguardRailed;
    public static ItemAttachment<Weapon> MPXHandguardExtended;
    
    public static ItemAttachment<Weapon> K2C1Handguard;
    
    public static ItemAttachment<Weapon> MP5NavyHandGuard;
    public static ItemAttachment<Weapon> MP5A5HandGuard;
    public static ItemAttachment<Weapon> MP5SDHandGuard;
    public static ItemAttachment<Weapon> MIMP5MHandGuard;
    public static ItemAttachment<Weapon> UTGTriRailHandGuard;
    public static ItemAttachment<Weapon> MP5BMHandguard;
    
    public static ItemAttachment<Weapon> ScorpionHandguardShort;
    public static ItemAttachment<Weapon> ScorpionHandguardLong;
    
    public static ItemAttachment<Weapon> ScarHandGuard;
    public static ItemAttachment<Weapon> ScarHHandGuard;
    public static ItemAttachment<Weapon> ScarMidWestIndustriesHandGuard;
    public static ItemAttachment<Weapon> ScarMLOKHandguard;
    public static ItemAttachment<Weapon> ScarLReceiver;
    
    public static ItemAttachment<Weapon> ACRHandGuard;
    public static ItemAttachment<Weapon> ACRHandGuardBlack;
    public static ItemAttachment<Weapon> ACRWEMSKHandGuardTan;
    public static ItemAttachment<Weapon> ACRPrecisionHandGuardTan;
    public static ItemAttachment<Weapon> ACRSBRHandGuardTan;
    public static ItemAttachment<Weapon> ACRPolymerHandGuardTan;
    public static ItemAttachment<Weapon> ACRSquareDropHandguardTan;
    
    public static ItemAttachment<Weapon> Type20Handguard;
    
    public static ItemAttachment<Weapon> HoneyBadgerHandguard;
    public static ItemAttachment<Weapon> HoneyBadgerMatrixArmsHandguard;
    
    public static ItemAttachment<Weapon> M60HandGuard;
    public static ItemAttachment<Weapon> M60E4HandGuard;
    
    public static ItemAttachment<Weapon> M249HandGuard;
    public static ItemAttachment<Weapon> M249UpperHandGuard;
    
    public static ItemAttachment<Weapon> Mk48HandGuard;
    public static ItemAttachment<Weapon> Mk48UpperHandGuard;
    
    public static ItemAttachment<Weapon> AUGA1handguard;
    public static ItemAttachment<Weapon> AUGA2handguard;
    public static ItemAttachment<Weapon> AUGA3handguard;
    public static ItemAttachment<Weapon> AUGA3extGuard;
    
    public static ItemAttachment<Weapon> StonerHANDGUARD;
    
    public static ItemAttachment<Weapon> AR57Handguard;
    
    public static ItemAttachment<Weapon> NTW20HandguardRAIL;
    
    public static ItemAttachment<Weapon> EF88Handguard;
    
    public static ItemAttachment<Weapon> AUGDefaultKit;
    public static ItemAttachment<Weapon> AUGParaConversion;
    
    public static ItemAttachment<Weapon> KrissVectorReceiver;
    public static ItemAttachment<Weapon> Vector556Handguard;
    
    public static ItemAttachment<Weapon> VectorMk1ModularHandguard;
    public static ItemAttachment<Weapon> VectorCarbineHandguard;
    
    public static ItemAttachment<Weapon> VectorTapedGrip;
    
    public static ItemAttachment<Weapon> Remington870Barrel;
    public static ItemAttachment<Weapon> Remington870SawedOffBarrel;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumBarrel;
    
    public static ItemAttachment<Weapon> M1CarbineHandguard;
    public static ItemAttachment<Weapon> M1CarbineVentilatedHandguard;
    public static ItemAttachment<Weapon> M1CarbineScoutHandguard;
    
    public static ItemAttachment<Weapon> G3A1Handguard;
    public static ItemAttachment<Weapon> G3HandguardRailed;
    
    public static ItemAttachment<Weapon> DSR1Handguard;
    public static ItemAttachment<Weapon> DSR1HandguardRailed;
    public static ItemAttachment<Weapon> DSR1Barrel;
    public static ItemAttachment<Weapon> DSR1BarrelLong;
    
    public static ItemAttachment<Weapon> Origin12Handguard;
    public static ItemAttachment<Weapon> HKS20Handguard;
    
    public static ItemAttachment<Weapon> Remington700Chassis;
    public static ItemAttachment<Weapon> Remington700APACChassis;
    public static ItemAttachment<Weapon> Remington700MDTXRSChassis;
    
    public static ItemAttachment<Weapon> SSG08Chassis;
    
    public static ItemAttachment<Weapon> ARX160Chassis;
    
    public static ItemAttachment<Weapon> G2ContenderBarrelShort;
    public static ItemAttachment<Weapon> G2ContenderBarrelLong;
    public static ItemAttachment<Weapon> G2ContenderGrip;
    public static ItemAttachment<Weapon> G2ContenderStock;
    
    public static ItemAttachment<Weapon> HoneyBadgerStock;
    public static ItemAttachment<Weapon> HoneyBadgerStockBlack;
    
    public static ItemAttachment<Weapon> G3Stock;
    
    public static ItemAttachment<Weapon> MP7Stock;
    public static ItemAttachment<Weapon> MP7MilSpecStock;
    
    public static ItemAttachment<Weapon> AK47Stock;
    public static ItemAttachment<Weapon> RPKStock;
    public static ItemAttachment<Weapon> AK101Stock;
    public static ItemAttachment<Weapon> AK74Stock;
    public static ItemAttachment<Weapon> DragunovGripStock;
    public static ItemAttachment<Weapon> Dragunov98Stock;
    
    public static ItemAttachment<Weapon> AK12Stock;
    public static ItemAttachment<Weapon> AK12ZenitcoStock;
    
    public static ItemAttachment<Weapon> VSSVintorezStock;
    public static ItemAttachment<Weapon> ASValStock;
    public static ItemAttachment<Weapon> VSSVintorezMilspecStock;
    
    public static ItemAttachment<Weapon> CollapsableMOEStock;
    public static ItemAttachment<Weapon> CollapsableMOEStockGreen;
    public static ItemAttachment<Weapon> MagpulCTRStock;
    public static ItemAttachment<Weapon> MilSpecStock;
    
    public static ItemAttachment<Weapon> SIGMCXStock;
    
    public static ItemAttachment<Weapon> CZ805BrenStock;
    
    public static ItemAttachment<Weapon> C8Stock;
    
    public static ItemAttachment<Weapon> HeraArmsStock;
    public static ItemAttachment<Weapon> HK416Stock;
    public static ItemAttachment<Weapon> SOCOM_Stock;
    
    public static ItemAttachment<Weapon> M4AsiimovStock;
    
    public static ItemAttachment<Weapon> M16Stock;
    public static ItemAttachment<Weapon> MagpulCTRStockTan;
    public static ItemAttachment<Weapon> MilSpecStockTan;
    public static ItemAttachment<Weapon> HK416StockTan;
    public static ItemAttachment<Weapon> M110Stock;
    public static ItemAttachment<Weapon> PRSPrecisionStock;
    
    public static ItemAttachment<Weapon> MP5Stock;
    public static ItemAttachment<Weapon> MP5A3Stock;
    public static ItemAttachment<Weapon> MP5A4Stock;
    public static ItemAttachment<Weapon> MP5MilspecStock;
    
    public static ItemAttachment<Weapon> ScarStock;
    public static ItemAttachment<Weapon> ScarRetractableStock;
    public static ItemAttachment<Weapon> ScarAdapterStock;
    
    public static ItemAttachment<Weapon> ScarHStock;
    
    public static ItemAttachment<Weapon> ACRStock;
    public static ItemAttachment<Weapon> ACRStockBlack;
    public static ItemAttachment<Weapon> ACRPRSStockTan;
    public static ItemAttachment<Weapon> ACRFixedStockTan;
    public static ItemAttachment<Weapon> ACRLongRangeStock;
    public static ItemAttachment<Weapon> ACRPDWStock;
    
    public static ItemAttachment<Weapon> M1014Stock;
    public static ItemAttachment<Weapon> M1014Grip;
    public static ItemAttachment<Weapon> M4BenelliStock;
    
    public static ItemAttachment<Weapon> Spas12Stock;
    
    public static ItemAttachment<Weapon> M249Stock;
    public static ItemAttachment<Weapon> M249ParaStock;
    public static ItemAttachment<Weapon> M249MilspecStock;
    public static ItemAttachment<Weapon> M249HK416Stock;
    
    public static ItemAttachment<Weapon> VectorStock;
    public static ItemAttachment<Weapon> VectorStockAdapter;
    
    public static ItemAttachment<Weapon> UMP45Receiver;
    public static ItemAttachment<Weapon> UMP9Receiver;
    public static ItemAttachment<Weapon> UMP45Stock;
    
    public static ItemAttachment<Weapon> GlockStock;
    
    public static ItemAttachment<Weapon> VP70Stock;
    
    public static ItemAttachment<Weapon> KS23Stock;
    public static ItemAttachment<Weapon> KS23RaptorGrip;
    public static ItemAttachment<Weapon> KS23MStock;
    
    public static ItemAttachment<Weapon> KS23Barrel;
    public static ItemAttachment<Weapon> KS23ExtendedBarrel;
    
    public static ItemAttachment<Weapon> Remington870Stock;
    public static ItemAttachment<Weapon> Remington870SawedGrip;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumStock;
    public static ItemAttachment<Weapon> Remington870MilspecStock;
    public static ItemAttachment<Weapon> Remington870HK416Stock;
    
    public static ItemAttachment<Weapon> M1CarbineBody;
    public static ItemAttachment<Weapon> M1A1CarbineBody;
    
    public static ItemAttachment<Weapon> M14Body;
    public static ItemAttachment<Weapon> M14SOCOMChassis;
    public static ItemAttachment<Weapon> Mk14TanBody;
    public static ItemAttachment<Weapon> Mk14SnowBody;
    public static ItemAttachment<Weapon> Mk14BlackBody;
    public static ItemAttachment<Weapon> M14Cover;
    public static ItemAttachment<Weapon> M14TriRailCover;
    public static ItemAttachment<Weapon> M14Rail;
    
    public static ItemAttachment<Weapon> Origin12Stock;
    public static ItemAttachment<Weapon> HKS20Stock;
    
    public static ItemAttachment<Weapon> MAC10Stock;
    public static ItemAttachment<Weapon> MAC21Stock;
    
    public static ItemAttachment<Weapon> AK47Grip;
    public static ItemAttachment<Weapon> AK101Grip;
    public static ItemAttachment<Weapon> AKErgoGrip;
    public static ItemAttachment<Weapon> AKErgoGripGreen;
    public static ItemAttachment<Weapon> AKErgoGripTan;
    
    public static ItemAttachment<Weapon> M4Grip;
    public static ItemAttachment<Weapon> M4GripTan;
    public static ItemAttachment<Weapon> SOCOM_Grip;
    public static ItemAttachment<Weapon> M4GripGray;
    
    public static ItemAttachment<Weapon> HK416Grip;
    public static ItemAttachment<Weapon> HK416GripTan;
    
    public static ItemAttachment<Weapon> M110Grip;
    
    public static ItemAttachment<Weapon> S710TricunGrip;
    public static ItemAttachment<Weapon> HeraArmsGrip;
    public static ItemAttachment<Weapon> MP5HOGUEGrip;
    public static ItemAttachment<Weapon> GlockHOGUEGrip;
    public static ItemAttachment<Weapon> GlockHOGUEGripTan;
    public static ItemAttachment<Weapon> APSGrip;
    public static ItemAttachment<Weapon> APSStock;
    public static ItemAttachment<Weapon> Origin12Grip;
    public static ItemAttachment<Weapon> HKS20Grip;
    public static ItemAttachment<Weapon> K2C1Grip;
    public static ItemAttachment<Weapon> MAC10Grip;
    public static ItemAttachment<Weapon> AK12Grip;
    public static ItemAttachment<Weapon> AK12ErgoGrip;
    
    public static ItemAttachment<Weapon> M4Receiver;
    public static ItemAttachment<Weapon> VLTORReceiver;
    public static ItemAttachment<Weapon> AR57Receiver;
    public static ItemAttachment<Weapon> C8SFWReceiver;
    
    public static ItemAttachment<Weapon> HK416Receiver;
    
    public static ItemAttachment<Weapon> HK417Receiver;
    public static ItemAttachment<Weapon> HK417ReceiverTan;
    
    public static ItemAttachment<Weapon> M110Receiver;
    public static ItemAttachment<Weapon> Z10Receiver;
    
    public static ItemAttachment<Weapon> Beowulf50CalReceiver;
    
    public static ItemAttachment<Weapon> S710Receiver;
    
    public static ItemAttachment<Weapon> CZ805BrenReceiver;
    
    public static ItemAttachment<Weapon> MAC10Body;
    
    public static ItemAttachment<Weapon> HoneyBadgerReceiver;
    public static ItemAttachment<Weapon> HoneyBadgerReceiverBlack;
    public static ItemAttachment<Weapon> HoneyBadgerKnightsReceiver;
    public static ItemAttachment<Weapon> HoneyBadgerKnightsReceiverBlack;
    
    public static ItemAttachment<Weapon> OSIPRMount;
    
    public static ItemAttachment<Weapon> MIMP5TRRail;
    public static ItemAttachment<Weapon> MIMP5MRail;
    public static ItemAttachment<Weapon> ShotgunRail;
    public static ItemAttachment<Weapon> Kar98Krail;
    public static ItemAttachment<Weapon> M60Rail;
    public static ItemAttachment<Weapon> M16A1ScopeMount;
    public static ItemAttachment<Weapon> FamasF1ScopeMount;
    public static ItemAttachment<Weapon> M16A1PicatinnyRail;
    public static ItemAttachment<Weapon> FamasF1PicatinnyRail;
    public static ItemAttachment<Weapon> NGSWRRail;
    public static ItemAttachment<Weapon> RailRiser;
    public static ItemAttachment<Weapon> M1911Slide;
    public static ItemAttachment<Weapon> M1911Body;
    public static ItemAttachment<Weapon> M191144MagSlide;
    public static ItemAttachment<Weapon> M191144MagBody;
    public static ItemAttachment<Weapon> M9A1Slide;
    public static ItemAttachment<Weapon> M9A1Body;
    public static ItemAttachment<Weapon> SamuraiEdgeSlide;
    public static ItemAttachment<Weapon> SamuraiEdgeBody;
    public static ItemAttachment<Weapon> SamuraiEdgeMount;
    public static ItemAttachment<Weapon> DesertEagleBody;
    public static ItemAttachment<Weapon> DesertEagleSlide;
    public static ItemAttachment<Weapon> DesertEagleLongBody;
    public static ItemAttachment<Weapon> Glock19Body;
//    public static ItemAttachment<Weapon> Glock18CBody;
    public static ItemAttachment<Weapon> Glock19XBody;
    public static ItemAttachment<Weapon> Glock19RazorbackBody;
    public static ItemAttachment<Weapon> Glock19Slide;
    public static ItemAttachment<Weapon> Glock19XSlide;
    public static ItemAttachment<Weapon> Glock19RazorbackSlide;
    public static ItemAttachment<Weapon> Glock19RockSlideOlive;
    public static ItemAttachment<Weapon> Glock19GhostPrecisionSlide;
    public static ItemAttachment<Weapon> Glock18CSlide;
    public static ItemAttachment<Weapon> Glock18CCNCSlide;
    public static ItemAttachment<Weapon> P226Slide;
    public static ItemAttachment<Weapon> FiveSevenSlide;
    public static ItemAttachment<Weapon> MakarovBody;
    public static ItemAttachment<Weapon> MakarovPBBody;
    public static ItemAttachment<Weapon> MakarovSlide;
    public static ItemAttachment<Weapon> MakarovPBSlide;
    public static ItemAttachment<Weapon> MP443Slide;
    public static ItemAttachment<Weapon> SCCYCPX2Body;
    public static ItemAttachment<Weapon> SCCYCPX2BodyTan;
    public static ItemAttachment<Weapon> SCCYCPX2GripTape;
    public static ItemAttachment<Weapon> SCCYCPX2Slide;
    public static ItemAttachment<Weapon> SCCYCPX2BSlide;
    
    public static ItemAttachment<Weapon> P90Swordfish;
    public static ItemAttachment<Weapon> P90DefaultKit;
    public static ItemAttachment<Weapon> P90Terminator;
    
    public static ItemAttachment<Weapon> FABDefenseMount;
    public static ItemAttachment<Weapon> MAS21Mount;
    
    public static ItemAttachment<Weapon> M4FrontSight;
    public static ItemAttachment<Weapon> M38FrontSight;
    public static ItemAttachment<Weapon> HK416FrontSight;
    public static ItemAttachment<Weapon> MBUSFrontSight;
    public static ItemAttachment<Weapon> Kar98Ksight;
    public static ItemAttachment<Weapon> M32Barrel;
    public static ItemAttachment<Weapon> M60FrontSight;
//    public static ItemAttachment<Weapon> CTCBarrel;
    public static ItemAttachment<Weapon> RPKBarrel;
    public static ItemAttachment<Weapon> AKIron;
    public static ItemAttachment<Weapon> AK12Iron;
    public static ItemAttachment<Weapon> Remington870Pump;
    public static ItemAttachment<Weapon> Remington870PoliceMagnumPump;
    public static ItemAttachment<Weapon> Remington870MagpulPump;
    public static ItemAttachment<Weapon> Remington870FABDefensePump;
    
    public static ItemAttachment<Weapon> Placeholder;
    public static ItemAttachment<Weapon> FamasPlaceholder;
    public static ItemAttachment<Weapon> APC9Placeholder;
    public static ItemAttachment<Weapon> P90Placeholder;
    public static ItemAttachment<Weapon> PistolPlaceholder;
    public static ItemAttachment<Weapon> GripPlaceholder;
    public static ItemAttachment<Weapon> M40A6GripPlaceholder;
    public static ItemAttachment<Weapon> LaserPlaceholder;
    
    public static ItemAttachment<Weapon> MAC10Action;

    public static void init(Object mod) {
    	
    	G11HandguardK1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G11HandguardK1(), "g11.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G11HandguardK1) {
                        GL11.glTranslatef(-0.6F, -0.3F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G11HandguardK1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G11HandguardK1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G11HandguardK1").withTextureName("Dummy.png")
                .build(MWC.modContext);
    	
    	G11HandguardK2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G11HandguardK2(), "g11.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G11HandguardK2) {
                        GL11.glTranslatef(-0.6F, -0.3F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G11HandguardK2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G11HandguardK2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G11HandguardK2").withTextureName("Dummy.png")
                .build(MWC.modContext);

        
        FABDefenseMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FABDefenseMount(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FABDefenseMount) {
                        GL11.glTranslatef(-0.6F, -0.3F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FABDefenseMount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FABDefenseMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FABDefenseMount").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MAS21Mount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MAS21Mount(), "gun.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.62F, 1F, 0.5F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MAS21Mount) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.5F, 1.5F, 1.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAS21Mount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAS21Mount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MAS21Mount").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        P90Swordfish = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.P90Swordfish(), "p90.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail4(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.P90Swordfish) {
                        GL11.glTranslatef(-0.6F, 0.1F, -0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P90Swordfish) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P90Swordfish) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90swordfish").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        P90DefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.P90DefaultKit(), "p90.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.P90DefaultKit) {
                        GL11.glTranslatef(-0.6F, 0.5F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P90DefaultKit) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P90DefaultKit) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90DefaultKit").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        P90Terminator = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.P90Terminator(), "p90.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.P90Terminator) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P90Terminator) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P90Terminator) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90Terminator").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarLHandguard(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLHandguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarLHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarHHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarHHandguard(), "scarh.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHHandguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarHHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarHHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarMidWestIndustriesHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarMidWestIndustriesHandguard(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarMidWestIndustriesHandguard) {
                        GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarMidWestIndustriesHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarMidWestIndustriesHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarMidWestIndustriesHandGuard")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarMLOKHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarMLOKHandguard(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarMLOKHandguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarMLOKHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarMLOKHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarMLOKHandguard")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SIG556Handguard = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SIG556Handguard(), "sig556.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556Handguard) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SIG556Handguard")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SIG556HandguardRailed = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SIG556HandguardRailed(), "sig556.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556HandguardRailed) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556HandguardRailed) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556HandguardRailed) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SIG556HandguardRailed")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SIG556HandguardKA = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SIG556HandguardKA(), "sig556.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556HandguardKA) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556HandguardKA) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556HandguardKA) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SIG556HandguardKA")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SIG556Grip = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SIG556Grip(), "sig556.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556Grip) {
                    	 GL11.glTranslatef(-0.6F, 0.1F, -1.6F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIG556Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SIG556Grip")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarLReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarReceiver(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarReceiver) {
                        GL11.glTranslatef(-0.6F, -0F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarLReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KrissVectorReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KrissVectorReceiver(), "krissvector.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorReceiver) {
                        GL11.glTranslatef(-0.6F, -0.5F, -1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KrissVectorReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Vector556Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KrissVectorModified(), "krissvector.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 5),
                    	new CraftingEntry(Items.STRING, 4),
                    	new CraftingEntry(Items.PAPER, 5))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorModified) {
                        GL11.glTranslatef(-0.6F, -0.5F, -1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorModified) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorModified) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KrissVector556Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VectorMk1ModularHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KrissVectorMk1ModularGuard(), "krissvector.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorMk1ModularGuard) {
                        GL11.glTranslatef(-0.6F, -0.5F, -1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorMk1ModularGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorMk1ModularGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VectorMk1ModularHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VectorCarbineHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KrissVectorCarbineGuard(), "krissvector.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorCarbineGuard) {
                        GL11.glTranslatef(-0.6F, -0.5F, -1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorCarbineGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorCarbineGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VectorCarbineHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VectorTapedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KrissVectorTapedGrip(), "krissvector.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(Items.STRING, 2),
                    	new CraftingEntry(Items.PAPER, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorTapedGrip) {
                        GL11.glTranslatef(-0.6F, -0.5F, -1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorTapedGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorTapedGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VectorTapedGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Origin12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Origin12Handguard(), "origin12.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Handguard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Origin12Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HKS20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HKS20Handguard(), "hks20.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Handguard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HKS20Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington700Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington700Chassis(), "remington700.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700Chassis) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700Chassis) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700Chassis) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Remington700Chassis").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington700APACChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington700ChassisAPAC(), "remington700.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700ChassisAPAC) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700ChassisAPAC) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700ChassisAPAC) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Remington700APACChassis").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington700MDTXRSChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington700ChassisMDTXRS(), "remington700.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700ChassisMDTXRS) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700ChassisMDTXRS) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington700ChassisMDTXRS) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Remington700MDTXRSChassis").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SSG08Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SSG08Chassis(), "SSG08_2.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SSG08Chassis) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.43F, 0.43F, 0.43f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SSG08Chassis) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SSG08Chassis) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SSG08Chassis").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ARX160Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ARX160(), "arx160.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 6),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ARX160) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.43F, 0.43F, 0.43f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARX160) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARX160) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ARX160Chassis").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        G2ContenderBarrelShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G2ContenderBarrelShort(), "g2contender.png")
                .withModel(new AK47iron(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withRenderablePart()
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderBarrelShort) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.43F, 0.43F, 0.43f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderBarrelShort) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderBarrelShort) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G2ContenderBarrelShort").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        G2ContenderBarrelLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G2ContenderBarrelLong(), "g2contender.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new AK47iron(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withRenderablePart()
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderBarrelLong) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.43F, 0.43F, 0.43f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderBarrelLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderBarrelLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G2ContenderBarrelLong").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        G2ContenderGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G2ContenderGrip(), "g2contender.png")
                .withRenderablePart()
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderGrip) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.43F, 0.43F, 0.43f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G2ContenderGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        G2ContenderStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G2ContenderStock(), "g2contender.png")
                .withRenderablePart()
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.43F, 0.43F, 0.43f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G2ContenderStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G2ContenderStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Origin12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Origin12Grip(), "origin12.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Grip) {
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Origin12Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HKS20Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HKS20Grip(), "HKS20.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Grip) {
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HKS20Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Origin12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Origin12Stock(), "origin12.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(Origin12Grip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Stock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Origin12Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Origin12Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HKS20Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HKS20Stock(), "HKS20.png")
                .withRequiredAttachments(HKS20Grip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKS20Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HKS20Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRHandGuard(), "acr.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "acrrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "acrrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "acrrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRHandGuardBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRHandGuard(), "acrblack.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRHandGuardBlack").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ACRWEMSKHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRWEMSKHandguard(), "acr.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRWEMSKHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRWEMSKHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRWEMSKHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRWEMSKHandguardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ACRPrecisionHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRPrecisionHandguard(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPrecisionHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPrecisionHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPrecisionHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRPrecisionHandGuardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRSBRHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRSBRHandguard(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRSBRHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRSBRHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRSBRHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRSBRHandGuardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ACRPolymerHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRPolymerHandguard(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPolymerHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPolymerHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPolymerHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRPolymerHandguardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ACRSquareDropHandguardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRSquareDropHandguard(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRSquareDropHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRSquareDropHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRSquareDropHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRSquareDropHandguardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Type20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Type20Handguard(), "type20.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Type20Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Type20Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AACHoneyBadgerHandguard(), "AACHoneyBadger.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "aacrail_gray.png")
//                .withModel(new com.paneedah.mwc.models.AKRail2(), "acrrail.png")
//                .withModel(new com.paneedah.mwc.models.AKRail3(), "acrrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerMatrixArmsHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AACMatrixArmsHandguard(), "aacMatrixArmsHandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACMatrixArmsHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACMatrixArmsHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACMatrixArmsHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerMatrixArmsHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M60HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M60HandGuard(), "m60.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M60HandGuard) {
                        GL11.glTranslatef(-0.6F, -1.6F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M60HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M60HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M60E4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M60E4Guard(), "m60.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M60E4Guard) {
                        GL11.glTranslatef(-0.6F, -1.3F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M60E4Guard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M60E4Guard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60E4Guard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M249HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M249HandGuard(), "m249.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M249HandGuard) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Mk48HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mk48HandGuard(), "m249.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk48HandGuard) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk48HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk48HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk48HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M249UpperHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M249UpperHandGuard(), "m249.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M249UpperHandGuard) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249UpperHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249UpperHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249UpperHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Mk48UpperHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mk48UpperHandGuard(), "m249.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk48UpperHandGuard) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk48UpperHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk48UpperHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk48UpperHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        StonerHANDGUARD = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.StonerHANDGUARD(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.StonerHANDGUARD) {
                        GL11.glTranslatef(-0.6F, -0.4F, 1.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StonerHANDGUARD) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StonerHANDGUARD) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("StonerHANDGUARD").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGA1handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AUGA1(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA1) {
                        GL11.glTranslatef(-0.6F, 0.6F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA1").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGA2handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AUGA2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA2) {
                        GL11.glTranslatef(-0.6F, 0.6F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA2handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGA3handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AUGA3M1(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA3M1) {
                        GL11.glTranslatef(-0.6F, 0.6F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA3M1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA3M1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA3handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        EF88Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.EF88(), "aug.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.EF88) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EF88) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EF88) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("EF88Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGDefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AUG9mmCONVERSIONkit(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGDefaultKit").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGParaConversion = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AUG9mmCONVERSIONkit(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUG9mmCONVERSIONkit) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGParaConversion").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGA3extGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AUGA3M1_Ext(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail4(), "akrail.png")
                .withRequiredAttachments(AUGA3handguard)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA3M1_Ext) {
                        GL11.glTranslatef(-0.6F, 0.4F, -1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA3M1_Ext) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGA3M1_Ext) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGA3extGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1CarbineBody(), "m1carbine.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineBody) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1CarbineBody").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1A1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1A1CarbineStock(), "m1carbine.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1CarbineStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1CarbineStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1CarbineStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1A1CarbineBody").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1CarbineHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1CarbineHandguard(), "m1carbine.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1CarbineHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1CarbineVentilatedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1CarbineVentilatedHandguard(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineVentilatedHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineVentilatedHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1CarbineVentilatedHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1CarbineVentilatedHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1CarbineScoutHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1ScoutCarbineHandguard(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1ScoutCarbineHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1ScoutCarbineHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1ScoutCarbineHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1ScoutCarbineHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        G3A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G3A1Handguard(), "g3.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G3A1Handguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G3A1Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G3A1Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G3A1Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        G3HandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G3HandguardRailed(), "g3.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G3HandguardRailed) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G3HandguardRailed) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G3HandguardRailed) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G3HandguardRailed").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DSR1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DSR1Handguard(), "dsr1.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1Handguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DSR1Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DSR1HandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DSR1HandguardRailed(), "dsr1.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1HandguardRailed) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1HandguardRailed) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1HandguardRailed) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DSR1HandguardRailed").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DSR1Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DSR1Barrel(), "dsr1.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1Barrel) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1Barrel) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1Barrel) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DSR1Barrel").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DSR1BarrelLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DSR1BarrelLong(), "dsr1.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1BarrelLong) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1BarrelLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DSR1BarrelLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DSR1BarrelLong").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M14Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M14Body(), "m14dmr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withModel(new FALIron(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Body) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M14Body").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M14SOCOMChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M14DMRSocomChassis(), "m14dmr.png")
                .withModel(new FALIron(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M14DMRSocomChassis) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14DMRSocomChassis) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14DMRSocomChassis) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M14DMRSocomChassis").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Mk14TanBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mk14Body(), "mk14ebrtan.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk14TanBody").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Mk14SnowBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mk14Body(), "mk14ebrsnow.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk14SnowBody").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Mk14BlackBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mk14Body(), "mk14ebr.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(-0.6F, -0.2F, -0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.5F, 0.5F, 0.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk14Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk14BlackBody").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M14Cover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M14Cover(), "m14dmr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(M14Body, M14SOCOMChassis)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Cover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Cover) {
                        GL11.glTranslatef(1.5F, -0.2F, 3F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14Cover) {
                        GL11.glTranslatef(-1.5F, -2F, 1.5F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M14Cover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M14TriRailCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M14TriRailCover(), "m14dmr.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(M14Body, M14SOCOMChassis)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M14TriRailCover) {
                    	 GL11.glTranslatef(-0.6F, 0.4F, -2.3F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14TriRailCover) {
                    	GL11.glTranslatef(1.5F, -0.2F, 3F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14TriRailCover) {
                    	GL11.glTranslatef(-1.5F, -2F, 1.5F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M14TriRailCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M14Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRequiredAttachments(M14Body, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, M14SOCOMChassis)
                .withModel(new com.paneedah.mwc.models.M14DMRRail(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M14DMRRail) {
                        GL11.glTranslatef(-0.6F, -1F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.5F, 1.5F, 1.5f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14DMRRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M14DMRRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M14Rail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarStock(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarRetractableStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarShortStock(), "scarl.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarShortStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarShortStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarShortStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarRetractableStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarAdapterStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarAdapterStock(), "scarl.png")
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarAdapterStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                    	 GL11.glScalef(0.8f, 0.8f, 0.8f);
                         GL11.glTranslatef(-0F, 0.6F, 0.4F);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarAdapterStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarAdapterStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarAdapterStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScarHStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScarStock(), "scar_stock_h.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScarStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScarHStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VectorStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KrissVectorStock(), "krissvector.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorStock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VectorStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VectorStockAdapter = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KrissVectorStockAdapter(), "krissvector.png")
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorStockAdapter) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorStockAdapter) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorStockAdapter) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VectorStockAdapter").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        UMP45Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.UMP45Receiver(), "ump45.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Receiver) {
                        GL11.glTranslatef(-0.6F, 0.0F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UMP45Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        UMP9Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.UMP45Receiver(), "ump45.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Receiver) {
                        GL11.glTranslatef(-0.6F, 0.0F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UMP9Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        UMP45Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.UMP45Stock(), "ump45.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Stock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UMP45Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UMP45Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MAC10Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MAC10Stock(), "mac10.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Stock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MAC10Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MAC21Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mac10stockwithrail(), "Mac10stockwithrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mac10stockwithrail) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mac10stockwithrail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mac10stockwithrail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MAC21Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRStock(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRStockBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRStock(), "acrblack.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRStockBlack").withTextureName("Dummy.png")
                .build(MWC.modContext);

        ACRFixedStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRFixedStock(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRFixedStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRFixedStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRFixedStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRFixedStockTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRPRSStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRPRSStock(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPRSStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPRSStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPRSStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRPRSStockTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRLongRangeStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRLongRangeStock(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRLongRangeStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRLongRangeStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRLongRangeStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRLongRangeStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACRPDWStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACRPDWStock(), "acr.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPDWStock) {
                        GL11.glTranslatef(-0.6F, 0.3F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPDWStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACRPDWStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ACRPDWStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1014Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1014stock(), "m1014.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1014stock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1014stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1014stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1014Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1014Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1014grip(), "m1014.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1014grip) {
                        GL11.glTranslatef(-0.6F, -0.5F, 2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1014grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1014grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1014Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4BenelliStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4BenelliStock(), "supernova.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4BenelliStock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4BenelliStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4BenelliStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4BenelliStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Spas12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Spas12Stock(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Spas12Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Spas12Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Spas12Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Spas12Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M249Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M249Stock(), "m249.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M249Stock) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M249ParaStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M249ParaStock(), "m249.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M249ParaStock) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249ParaStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249ParaStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249ParaStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M249MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M249StockAdapter(), "m249.png")
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStock.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M249StockAdapter) {
                    	 GL11.glTranslatef(-0.6F, -0.7F, 5.5F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                    	 GL11.glScalef(0.8f, 0.8f, 0.8f);
                         GL11.glTranslatef(-0F, 0.6F, 0.4F);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249StockAdapter) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249StockAdapter) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249MilspecStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M249HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M249StockAdapter(), "m249.png")
                .withModel(new com.paneedah.mwc.models.HK416Stock(), "HK416Stock.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M249StockAdapter) {
                        GL11.glTranslatef(-0.6F, -0.7F, 5.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0.8f, 0.8f, 0.8f);
                        GL11.glTranslatef(-0F, 0.6F, 0.4F);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249StockAdapter) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M249StockAdapter) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M249Hk416Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        UTGTriRailHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.UTGTriRailHandGuard(), "mp5.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.UTGTriRailHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UTGTriRailHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.UTGTriRailHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("UTGTriRailHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5BMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5BMHandGuard(), "mp5.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5BMHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5BMHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5BMHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5BMHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MIMP5MHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MIMP5MHandGuard(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5MHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5MHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5MHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MIMP5MHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScorpionHandguardShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScorpionEVO3A1HandguardShort(), "ScorpionEVO3A1.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail4(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionEVO3A1HandguardShort) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionEVO3A1HandguardShort) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionEVO3A1HandguardShort) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScorpionEVO3A1HandguardShort").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScorpionHandguardLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScorpionEVO3A1HandguardLong(), "ScorpionEVO3A1.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionEVO3A1HandguardLong) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionEVO3A1HandguardLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionEVO3A1HandguardLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScorpionEVO3A1HandguardLong").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MIMP5TRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MIMP5TRRail(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5TRRail) {
                        GL11.glTranslatef(-0.6F, 0.7F, -0.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5TRRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5TRRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MIMP5TRRail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MIMP5MRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MIMP5MRail(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5MRail) {
                        GL11.glTranslatef(-0.6F, 1.2F, -0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.4F, 1.4F, 1.4f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5MRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MIMP5MRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MIMP5MRail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ShotgunRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SupernovaRail(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SupernovaRail) {
                        GL11.glTranslatef(-0.6F, 0F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SupernovaRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SupernovaRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ShotgunRail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Kar98Krail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Kar98Krail(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Kar98Krail) {
                        GL11.glTranslatef(-0.6F, 1.3F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kar98Krail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kar98Krail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Kar98Krail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M60Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glTranslatef(-0.6F, -0.7F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60Rail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M16A1ScopeMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.M16A1ScopeMount(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1ScopeMount) {
                        GL11.glTranslatef(-0.6F, 3F, -1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(2F, 2F, 2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1ScopeMount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1ScopeMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16A1ScopeMount").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FamasF1ScopeMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.FamasF1ScopeRail(), "famasf1.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FamasF1ScopeRail) {
                        GL11.glTranslatef(-0.6F, 1.3F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FamasF1ScopeRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FamasF1ScopeRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FamasF1ScopeMount").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M16A1PicatinnyRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.M16A1PicatinnyRail(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1PicatinnyRail) {
                        GL11.glTranslatef(-0.6F, 1.3F, -5.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1PicatinnyRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1PicatinnyRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16A1PicatinnyRail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FamasF1PicatinnyRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.FamasF1GripRail(), "famasf1.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FamasF1GripRail) {
                        GL11.glTranslatef(-0.6F, 0.4F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FamasF1GripRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FamasF1GripRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FamasF1PicatinnyRail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        NGSWRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.NGSWRRails(), "ngswr.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.NGSWRRails) {
                        GL11.glTranslatef(-0.6F, 0.4F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NGSWRRails) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NGSWRRails) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("NGSWRRail").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        RailRiser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.KrissVectorRailRiser(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorRailRiser) {
                        GL11.glTranslatef(-0.6F, 0.3F, -0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorRailRiser) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KrissVectorRailRiser) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RailRiser").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1911Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1911Slide(), "m1911.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "gun")
                .withModel(new com.paneedah.mwc.models.makarovrearsight(), "gun")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1911Slide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1911Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1911Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1911Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1911Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M1911Body(), "m1911.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M1911Body) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1911Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1911Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M1911Body")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M191144MagSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M191144MagSlide(), "M191144MagSlide.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "gun")
                .withModel(new com.paneedah.mwc.models.makarovrearsight(), "gun")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M191144MagSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M191144MagSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M191144MagSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M191144MagSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M191144MagBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M191144MagBody(), "M191144Mag.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M191144MagBody) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M191144MagBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M191144MagBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M191144MagBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M9A1Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M9slide(), "m9a1.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.paneedah.mwc.models.M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M9slide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M9slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M9slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M9A1Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M9A1Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M9(), "m9a1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M9) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M9) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M9) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M9A1Body")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SamuraiEdgeSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SamuraiEdgeSlide(), "samuraiedge.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.paneedah.mwc.models.M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SamuraiEdgeSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SamuraiEdgeBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SamuraiEdge(), "samuraiedge.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdge) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdge) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdge) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SamuraiEdgeBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SamuraiEdgeMount = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRequiredAttachments(SamuraiEdgeBody)
                .withModel(new com.paneedah.mwc.models.SamuraiEdgeMount(), "samuraiedge.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeMount) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeMount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SamuraiEdgeMount")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DesertEagleSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new com.paneedah.mwc.models.DesertEagleSlide(), "deagle.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagleSlide) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagleSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagleSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DesertEagleSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DesertEagleBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DesertEagle(), "deagle.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagle) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagle) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagle) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DesertEagleBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DesertEagleLongBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DesertEagleLong(), "Deagle.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagleLong) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagleLong) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DesertEagleLong) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DesertEagleLongBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock19Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock19(), "glock19.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19Body")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
//        Glock18CBody = new AttachmentBuilder<Weapon>()
//                .withCategory(AttachmentCategory.BACKGRIP)
//                .withCreativeTab(MWC.AttachmentsTab)
//                .withModel(new com.paneedah.mwc.models.Glock19(), "glock18c.png")
//                .withInventoryModelPositioning((model, s) -> {
//                    if (model instanceof com.paneedah.mwc.models.Glock19) {
//                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
//                        GL11.glRotatef(10F, 1f, 0f, 0f);
//                        GL11.glRotatef(-190F, 0f, 1f, 0f);
//                        GL11.glRotatef(0F, 0f, 0f, 1f);
//                        GL11.glScaled(0.9F, 0.9F, 0.9f);
//                    } else {
//                        GL11.glScalef(0f, 0f, 0f);
//                    }
//                }).withFirstPersonModelPositioning((model, itemStack) -> {
//                    if (model instanceof com.paneedah.mwc.models.Glock19) {
//                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
//                        GL11.glRotatef(30F, 0f, 1f, 0f);
//                        GL11.glScaled(0.7F, 0.7F, 0.7F);
//                    } else {
//                        GL11.glScaled(0F, 0F, 0F);
//                    }
//
//                }).withThirdPersonModelPositioning((model, itemStack) -> {
//                    if (model instanceof com.paneedah.mwc.models.Glock19) {
//                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
//                        GL11.glRotatef(-50F, 0f, 1f, 0f);
//                        GL11.glRotatef(80F, 1f, 0f, 0f);
//                        GL11.glScaled(0.5F, 0.5F, 0.5F);
//                    } else {
//                        GL11.glScaled(0F, 0F, 0F);
//                    }
//                })
//                .withName("Glock18CBody")
//                .withRenderablePart().withTextureName("Dummy.png")
//                .build(MWC.MOD_CONTEXT);
        
        Glock19XBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock19XBody(), "glock19.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19XBody) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19XBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19XBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19XBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock19RazorbackBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.GlockRazorback(), "glock19.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockRazorback) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockRazorback) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockRazorback) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GlockRazorbackBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock19Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock19Slide(), "glock19.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mwc.models.GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock18CSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock18Cslide(), "glock18c.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mwc.models.GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18Cslide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18Cslide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18Cslide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock18CSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock18CCNCSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock18CCNCslide(), "glock18c.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mwc.models.GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18CCNCslide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18CCNCslide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18CCNCslide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock18CCNCslide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock19XSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock19XSlide(), "glock19.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mwc.models.GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19XSlide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19XSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19XSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19XSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock19RazorbackSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.GlockRazorbackSlide(), "glock19.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mwc.models.GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockRazorbackSlide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockRazorbackSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockRazorbackSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GlockRazorbackSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock19RockSlideOlive = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock19Rockslide(), "glock19.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mwc.models.GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Rockslide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Rockslide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19Rockslide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19RockslideOlive")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Glock19GhostPrecisionSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Glock19GhostPrecisionSlide(), "glock19.png")
                .withModel(new com.paneedah.mwc.models.M1911frontsight(), "m1911frontsight")
                .withModel(new com.paneedah.mwc.models.GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19GhostPrecisionSlide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19GhostPrecisionSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock19GhostPrecisionSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Glock19GhostPrecisionSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SCCYCPX2Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SCCYCPX2(), "sccycpx2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCCYCPX2Body")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SCCYCPX2BodyTan = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SCCYCPX2BodyTan(), "sccycpx2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2BodyTan) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2BodyTan) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2BodyTan) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCCYCPX2BodyTan")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SCCYCPX2GripTape = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SCCYCPX2GripTape(), "sccycpx2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(Items.STRING, 4), 
                    	new CraftingEntry(Items.PAPER, 5))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2GripTape) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2GripTape) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2GripTape) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCCYCPX2GripTape")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SCCYCPX2Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SCCYCPX2Slide(), "sccycpx2.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.paneedah.mwc.models.M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Slide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCCYCPX2Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SCCYCPX2BSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SCCYCPX2BSlide(), "sccycpx2.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "M9A1frontsight")
                .withModel(new com.paneedah.mwc.models.M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2BSlide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2BSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2BSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SCCYCPX2BSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        P226Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.P226Slide(), "P226.png")
                .withModel(new com.paneedah.mwc.models.P226rearsight(), "p226rearsight.png")
                .withModel(new com.paneedah.mwc.models.P226frontsight(), "p226frontsight.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.P226Slide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P226Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P226Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P226Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FiveSevenSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FiveSevenSlide(), "fiveseven.png")
                .withModel(new com.paneedah.mwc.models.P226rearsight(), "p226rearsight.png")
                .withModel(new com.paneedah.mwc.models.P226frontsight(), "p226frontsight.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.P226Slide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P226Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.P226Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FiveSevenSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MakarovBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MakarovPM(), "makarovpm.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPM) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MakarovSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MakarovPMSlide(), "gun.png")
                .withModel(new com.paneedah.mwc.models.makarovrearsight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.makarovfrontsight(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPMSlide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPMSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPMSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovPMSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MakarovPBSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MakarovPBSSlide(), "gun.png")
                .withModel(new com.paneedah.mwc.models.makarovrearsight(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSlide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSlide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSlide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovPBSlide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP443Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP443Slide(), "mp443.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP443Slide) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP443Slide) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP443Slide) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP443Slide")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MakarovPBBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withRequiredAttachments(Attachments.MakarovPBSlide)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MakarovPBBody(), "makarovpm.png")
                .withModel(new com.paneedah.mwc.models.makarovfrontsight(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBBody) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MakarovPBBody")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MAC10Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MAC10Body(), "mac10.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Body) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Body) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Body) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MAC10Body").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MAC10Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MAC10Action(), "mac10.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withRequiredAttachments(MAC10Body)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Action) {
                        GL11.glTranslatef(-0.6F, 0.2F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Action) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Action) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MAC10Action")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5NavyHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5NavyHandGuard(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5NavyHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5NavyHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5NavyHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5NavyHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5A5HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5A5HandGuard(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A5HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A5HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A5HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5A5HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5SDHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5SDHandGuard(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5SDHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5SDHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5SDHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5SDHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5HOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5HOGUEGrip(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5HOGUEGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5HOGUEGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5HOGUEGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5HOGUEGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        GlockHOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.GlockHogueGrip(), "gun2.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockHogueGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GlockHogueGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        GlockHOGUEGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.GlockHogueGrip(), "tan.png")
//                .withModernRecipe(
//                    	CraftingGroup.ATTACHMENT_MODIFICATION,
//                    	new CraftingEntry(MwItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockHogueGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.GlockHogueGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GlockHogueGripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        APSGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.APSgrip(), "aps.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.APSgrip) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APSgrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APSgrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("APSGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        APSStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.APSstock(), "aps.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.APSstock) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APSstock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.APSstock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("APSStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MAC10Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MAC10Grip(), "mac10.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Grip) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MAC10Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MAC10Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5Stock(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5Stock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5A3Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5A3RetractableStock(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A3RetractableStock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A3RetractableStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A3RetractableStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5A3Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5A4Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5A4Stock(), "mp5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A4Stock) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A4Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5A4Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5A4Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP5MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP5StockAdapter(), "mp5.png")
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5StockAdapter) {
                        GL11.glTranslatef(-0.6F, 0.2F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                    	 GL11.glTranslatef(-0.6F, 0.2F, 1.2F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(0.9F, 0.9F, 0.9f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5StockAdapter) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP5StockAdapter) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP5StockAdapter").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        LVOAVHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.LVOAVHandGuard(), "lvoavhandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.LVOAVHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LVOAVHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LVOAVHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LVOAVHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AR15HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AR15FN15Handguard(), "ar15.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AR15FN15Handguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR15FN15Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR15FN15Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AR15FN15Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M38HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M38HandGuard(), "hk416.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M38HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M38HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M38HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M38HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416HandGuardBlackAndTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M38HandGuard(), "hk416.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrailblackandtan.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrailblackandtan.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M38HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M38HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M38HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416HandGuardBlackAndTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK417Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HK417Handguard(), "HK417.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK417Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK417HandguardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HK417Handguard(), "HK417tan.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "guntandark.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "guntandark.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "guntandark.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "guntandark.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK417HandguardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Mk18HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mk18HandGuard(), "mk18handguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "mk18rail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "mk18rail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "mk18rail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "mk18rail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk18HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk18HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk18HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk18HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Mk18HandGuardBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Mk18HandGuard(), "mk18handguardblack.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk18HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk18HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Mk18HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Mk18HandGuardBlack").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Block2SOCOMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Block2SOCOMHandguard(), "block2socomhandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Block2SOCOMHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Block2SOCOMHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Block2SOCOMHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Block2SOCOMHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FSSTacLiteHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FSSTacLiteHandguard(), "FSSTacLiteHandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FSSTacLiteHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FSSTacLiteHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FSSTacLiteHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FSSTacLiteHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4MagpulHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4MagpulHandGuard(), "m4magpulhandleguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4MagpulHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4MagpulHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4MagpulHandGuard(), "m4magpulhandleguardtan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4MagpulHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4MagpulHandGuardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "m4a1.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HK416Receiver(), "HK416Receiver.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        C8SFWReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "C8SFW_gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "C8SFW_gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("C8SFWReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VLTORReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VLTORReceiver(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VLTORReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VLTORReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VLTORReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VLTORReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AR57Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AR57Receiver(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AR57Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR57Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR57Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AR57Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK417Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HK417Receiver(), "HK417.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK417Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK417ReceiverTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HK417Receiver(), "HK417tan.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "guntan.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK417Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK417ReceiverTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M110Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M110Receiver(), "M110.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrailm110.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Receiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Receiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Receiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M110Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Z10Receiver = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.RECEIVER)
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Z10Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Beowulf50CalReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Beowulf50CalReceiver(), "beowulf50cal.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Beowulf50CalReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Beowulf50CalReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Beowulf50CalReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Beowulf50CalReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        S710Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.S710Tricun10mmReceiver(), "s710tricun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.S710Tricun10mmReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.S710Tricun10mmReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.S710Tricun10mmReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("S710Receiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        CZ805BrenReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.CZ805BrenReceiver(), "CZ805Bren.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.CZ805BrenReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CZ805BrenReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CZ805BrenReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("CZ805BrenReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AACHoneyBadgerReceiver(), "AACHoneyBadger.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "aacrail_main.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerReceiverBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AACHoneyBadgerReceiver(), "AACHoneyBadgerBlack.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerReceiverBlack").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerKnightsReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiver.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "aacrail_knights.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACKnightsArmamentReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACKnightsArmamentReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACKnightsArmamentReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerKnightsReceiver").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerKnightsReceiverBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiverblack.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACKnightsArmamentReceiver) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACKnightsArmamentReceiver) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACKnightsArmamentReceiver) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerKnightsReceiverBlack").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Placeholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FamasPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FamasPlaceholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        APC9Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("APC9Placeholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        P90Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("P90Placeholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        PistolPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("PistolPlaceholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        GripPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("GripPlaceholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M40A6GripPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M40A6GripPlaceholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        LaserPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new com.paneedah.mwc.models.M4Receiver(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Receiver) {
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LaserPlaceholder").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4HandGuard(), "m4a1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AR57Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AR57Handguard(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withRequiredAttachments(AR57Receiver)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AR57Handguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR57Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR57Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AR57Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        NTW20HandguardRAIL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.NTW20Guard(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.NTW20Guard) {
                        GL11.glTranslatef(-0.6F, -0.4F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NTW20Guard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NTW20Guard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("NTW20Guard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M16HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M16HandGuard(), "m16a4.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M16A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M16A1Handguard(), "m16a1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Handguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16A1Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4CarbineHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4CarbineHandGuard(), "m4carbinehandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4CarbineHandGuard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4CarbineHandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4CarbineHandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4CarbineHandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M16A4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M16A4Handguard(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A4Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A4Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A4Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16A4HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M110Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M110Handguard(), "M110.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrailm110.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrailm110.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrailm110.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrailm110.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M110Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Z10Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Z10Handguard(), "z10.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Z10Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Z10Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Z10Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Z10Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AR10SuperSASSHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AR10SuperSASSHandguard(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail5(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AR10SuperSASSHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR10SuperSASSHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AR10SuperSASSHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AR10SuperSASSHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        S710Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.S710TricunHandguard(), "s710tricun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.S710TricunHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.S710TricunHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.S710TricunHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("S710Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        SIGMCXHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SIGMCXHandguard(), "sigmcx.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SIGMCXHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SIGMCXHandguardShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SIGMCXHandguardShort(), "sigmcx.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail3(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXHandguardShort) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXHandguardShort) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXHandguardShort) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SIGMCXHandguardShort").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MPXHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MPXHandguard(), "mpx.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MPXHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MPXHandguardExtended = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MPXHandguardExtended(), "mpx.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguardExtended) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguardExtended) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguardExtended) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MPXHandguardExtended").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MPXHandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MPXHandguardRailed(), "mpx.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguardRailed) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguardRailed) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MPXHandguardRailed) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MPXHandguardRailed").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        K2C1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.K2C1Handguard(), "k2c1.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1Handguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -1.8F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("K2C1Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HeraArmsGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HeraArmsGrip(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HeraArmsGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HeraArmsGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HeraArmsGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HeraArmsGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4Grip(), "m4a1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4GripTan(), "m4griptan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4GripTan) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4GripTan) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4GripTan) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4GripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SOCOM_Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new com.paneedah.mwc.models.M4Grip(), "socom_grip.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SOCOM_Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4GripGray = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4Grip(), "gun2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4GripGray").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HKgrip(), "hkgrip.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HKgrip(), "hkgriptan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HKgrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416GripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M110Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M110Grip(), "M110.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M110Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        S710TricunGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.S710TricunGrip(), "S710Tricun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.S710TricunGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.S710TricunGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.S710TricunGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("S710TricunGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        K2C1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.K2C1Grip(), "k2c1.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1Grip) {
                        GL11.glTranslatef(-0.6F, -0F, 0F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("K2C1Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK47Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AKGrip(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(Blocks.PLANKS, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK101Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK101Grip(), "AK101Grip.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AKErgoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AKErgoGrip(), "akergogrip.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKErgoGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AKErgoGripGreen = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AKErgoGrip(), "ak12grip.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKErgoGripGreen").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AKErgoGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AKErgoGrip(), "akergogriptan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKErgoGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKErgoGripTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12Grip(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Grip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Grip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Grip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12ErgoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12ErgoGrip(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12ErgoGrip) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12ErgoGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12ErgoGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12ErgoGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.AACHoneyBadgerStock(), "AACHoneyBadger.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HoneyBadgerStockBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.AACHoneyBadgerStock(), "AACHoneyBadgerblack.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HoneyBadgerStockBlack").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        G3Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.G3Stock(), "g3.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G3Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G3Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G3Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("G3Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP7Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MP7Stock(), "mp7.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7Stock) {
                        GL11.glTranslatef(-0.6F, -0.0F, 1.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP7Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP7MilSpecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MP7MilSpecStock(), "mp7.png")
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7MilSpecStock) {
                    	GL11.glTranslatef(-0.5F, 0.0F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                    	GL11.glTranslatef(-0.6F, 0.1F, 1.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7MilSpecStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7MilSpecStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP7MilSpecStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK47Stock = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK47stock(), "ak47.png")
                .withModernRecipe(
                	CraftingGroup.ATTACHMENT_MODIFICATION,
                	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                	new CraftingEntry(Blocks.PLANKS, 2))
//                .withModernRecipe(new ItemStack(MwItems.steelIngot, 8), new
//                		ItemStack(MwItems.carbonComposite, 8), new
//                		ItemStack(MwItems.gunmetalPlate, 12), new
//                		ItemStack(Blocks.PLANKS, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DragunovGripStock = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DragunovStock(), "dragunov.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5),
                    	new CraftingEntry(Blocks.PLANKS, 4))
//                .withModernRecipe(new ItemStack(MwItems.steelIngot, 8), new
//                		ItemStack(MwItems.carbonComposite, 8), new
//                		ItemStack(MwItems.gunmetalPlate, 12), new
//                		ItemStack(Blocks.PLANKS, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DragunovGripStock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Dragunov98Stock = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Dragunov98Stock(), "dragunov98.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 6))
//                .withModernRecipe(new ItemStack(MwItems.steelIngot, 8), new
//                		ItemStack(MwItems.carbonComposite, 8), new
//                		ItemStack(MwItems.gunmetalPlate, 12), new
//                		ItemStack(Blocks.PLANKS, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Dragunov98Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        RPKStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.RPKstock(), "rpkstock.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPKstock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPKstock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPKstock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPKstock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK101Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK101Stock(), "ak101stock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK74Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK74Stock(), "AK74Stock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK74Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK74Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK74Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK74Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12Stock(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12ZenitcoStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12ZenitcoStock(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12ZenitcoStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12ZenitcoStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12ZenitcoStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12ZenitcoStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VSSVintorezStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VSSVintorezStock(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezStock) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSVintorezStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ASValStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ASValStock(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASValStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VSSVintorezMilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VSSVintorezKulaTacStock(), "vssvintorez.png")
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezKulaTacStock) {
                    	GL11.glTranslatef(-0.6F, -0.6F, 1.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                    	GL11.glTranslatef(-0.6F, -0.5F, 1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezKulaTacStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezKulaTacStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSVintorezMilspecStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        CollapsableMOEStock = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.CollapsableMOEStock(), "CollapsableMOEStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.CollapsableMOEStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CollapsableMOEStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CollapsableMOEStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("CollapsableMOEStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        CollapsableMOEStockGreen = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.CollapsableMOEStock(), "ak12stock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.CollapsableMOEStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CollapsableMOEStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CollapsableMOEStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("CollapsableMOEStockGreen").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MagpulCTRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MagpulCTRStock(), "MagpulCTRStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulCTRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MagpulCTRStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MagpulCTRStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MagpulCTRStock(), "MagpulCTRStocktan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulCTRStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulCTRStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MagpulCTRStockTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MilSpecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MilSpecStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        CZ805BrenStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.CZ805BrenStock(), "CZ805Bren.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.CZ805BrenStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CZ805BrenStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.CZ805BrenStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("CZ805BrenStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SIGMCXStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.SIGMCXStock(), "sigmcx.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SIGMCXStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SIGMCXStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        C8Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "C8Stock.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("C8Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MilSpecStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "MilSpecStocktan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MilSpecStockTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HeraArmsStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.HeraArmsStock(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withRequiredAttachments(HeraArmsGrip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HeraArmsStock) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HeraArmsStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HeraArmsStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HeraArmsStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.HK416Stock(), "HK416Stock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SOCOM_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.SOCOM_Stock(), "Socom_stock.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SOCOM_Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SOCOM_Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SOCOM_Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SOCOM_Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M16Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M16Stock(), "m16stock.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Stock) {
                        GL11.glTranslatef(-0.6F, -0.2F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416StockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.HK416Stock(), "HK416Stocktan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glTranslatef(-0.6F, 0F, 1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416StockTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M110Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M110Stock(), "m110.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Stock) {
                        GL11.glTranslatef(-0.6F, -0.2F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Stock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M110Stock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M110Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        PRSPrecisionStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ARPRSPrecisionStock(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ARPRSPrecisionStock) {
                        GL11.glTranslatef(-0.6F, -0.2F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARPRSPrecisionStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ARPRSPrecisionStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ARPRSPrecisionStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK47HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK47HandleGuard(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(Blocks.PLANKS, 2))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47HandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47HandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47HandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47HandleGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DragunovHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DragunovHandguard(), "dragunov.png")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AK47iron(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5),
                    	new CraftingEntry(Blocks.PLANKS, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DragunovHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Dragunov98Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Dragunov98Handguard(), "dragunov98.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 6),
                    	new CraftingEntry(MWCItems.steelIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Dragunov98Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK101HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK101HandGuard(), "ak101handguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101HandGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101HandGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101HandGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101HandGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK74Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK74Handguard(), "AK74Handguard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK74Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK74Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK74Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK74Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AKMagpulHandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MagpulHandleGuard(), "MagpulHandleGuard.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulHandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMagpulHandleGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AKMagpulHandleGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MagpulHandleGuard(), "MagpulHandleGuardTan.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulHandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MagpulHandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMagpulHandleGuardTan").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MLOKHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MLOKHandguard(), "mlokhandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MLOKHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MLOKHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MLOKHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MLOKHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MLOKExtendedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MLOKExtendedHandguard(), "MLOKExtendedHandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModel(new com.paneedah.mwc.models.AKRail2(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MLOKExtendedHandguard) {
                        GL11.glTranslatef(-0.6F, 0.2F, -2.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MLOKExtendedHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MLOKExtendedHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MLOKExtendedHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK15HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK15HandleGuard(), "AK15HandleGuard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "AKRailgrey.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15HandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15HandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15HandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK15HandleGuard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12kalHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK15HandleGuard(), "ak12handguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "AKRailgrey.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15HandleGuard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15HandleGuard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15HandleGuard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12kalHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        RPK16Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.RPK16handguard(), "rpk16handguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrailgrey.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK16handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK16handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPK16handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RPK16handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12Handguard(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12BHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12BHandguard(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12BHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12BHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12BHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12BHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KBP9A91Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KBP9A91Handguard(), "kbp9a91.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Handguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Handguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Handguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KBP9A91Handguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KBP9A91CompactHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KBP9A91CompactHandguard(), "kbp9a91.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91CompactHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91CompactHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91CompactHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KBP9A91CompactHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KBP9A91KulaTacHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KBP9A91KulaTacHandguard(), "kbp9a91.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91KulaTacHandguard) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91KulaTacHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91KulaTacHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KBP9A91KulaTacHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VSSVintorezHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VSSVintorezHandguard(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(Blocks.PLANKS, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezHandguard) {
                        GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSVintorezHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ASValHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ASValHandguard(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValHandguard) {
                    	GL11.glTranslatef(-0.6F, 0.3F, -1.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ASValHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ASValHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VSSVintorezTriRailMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VSSVintorezTriRailMount(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezTriRailMount) {
                        GL11.glTranslatef(-0.6F, 0.4F, -2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezTriRailMount) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezTriRailMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSVintorezTriRailMount").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK47DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK47DustCover(), "ak47.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK47Dustcover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DragunovDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DragunovDustCover(), "dragunov.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DragunovDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("DragunovDustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Dragunov98DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Dragunov98(), "dragunov98.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Dragunov98) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Dragunov98DustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AKMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AKMDustCover(), "AKMDustCover.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AKMDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKMDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKMDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMDustcover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK101DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK101DustCover(), "ak101dustcover.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK101DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK101DustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VeprDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VeprDustCover(), "veprdustcover.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VeprDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VeprDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VeprDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VeprDustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK15DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK15DustCover(), "ak15dustcover.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK15DustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12DustCover(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12DustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12BDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK12BDustCover(), "ak12kal.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12BDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12BDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK12BDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12BDustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VSSVintorezDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VSSVintorezDustCover(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSVintorezDustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VSSMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VSSVintorezVSSMDustCover(), "vssvintorez.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezVSSMDustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezVSSMDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VSSVintorezVSSMDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VSSMDustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FNFALDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FNFALDustCover(), "fnfal.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALDustCover) {
                        GL11.glTranslatef(-0.6F, 0.6F, -0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALDustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALDustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALDustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SA58DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SA58DustCover(), "SA58DustCover.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.SA58DustCover) {
                        GL11.glTranslatef(-0.6F, 0.4F, -0.2F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SA58DustCover) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SA58DustCover) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("SA58DustCover").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FNFALGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FNFALGrip(), "fnfal.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALGrip) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALGrip) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALGrip) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FNFALStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FNFALStock(), "fnfal.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALStock) {
                        GL11.glTranslatef(-0.6F, 0.1F, 1.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALStock) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALStock) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALStock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FNFALHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FNFALHandguard(), "fnfal.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALHandguard) {
                        GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("FNFALHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FNFALPARAHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FNFALPARAHandguard(), "fnfalparahandguard.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALPARAHandguard) {
                    	GL11.glTranslatef(-0.6F, 0.5F, -2.4F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALPARAHandguard) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALPARAHandguard) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })	
                .withName("FNFALPARAHandguard").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M4FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M4Iron2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.FALIron(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(M4HandGuard, M4CarbineHandGuard, M4MagpulHandGuard, 
                        M4MagpulHandGuardTan, M16HandGuard, Mk18HandGuard, M16A4HandGuard, Block2SOCOMHandguard, 
                        Mk18HandGuardBlack)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Iron2) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.6F, 1.6F, 1.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Iron2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M4Iron2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M4FrontSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M60FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.M60FrontSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M60FrontSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M60FrontSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M60FrontSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M60FrontSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M38FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FALIron(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AK47iron(), "gun.png")
                .withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard, 
                        StonerHANDGUARD, AR57Handguard, HK417Handguard, HK417HandguardTan, 
                        HK416HandGuardBlackAndTan)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47iron) {
                        GL11.glTranslatef(-0.6F, -1.5F, 1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.4F, 1.4F, 1.4f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47iron) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47iron) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M38FrontSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G95_upright_frontsights(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard, 
                        StonerHANDGUARD, AR57Handguard, M16A4HandGuard, M4CarbineHandGuard, 
                        ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuardTan,
                         ACRPrecisionHandGuardTan,
                        ACRSBRHandGuardTan, ACRPolymerHandGuardTan,
                         ACRSquareDropHandguardTan, HoneyBadgerHandguard,
                        HoneyBadgerMatrixArmsHandguard, Placeholder, HK417Handguard, HK417HandguardTan, 
                        Block2SOCOMHandguard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, 
                        HK416HandGuardBlackAndTan, SIGMCXHandguard, SIGMCXHandguardShort, AR15HandGuard, 
                        DSR1Handguard, DSR1HandguardRailed, Z10Handguard)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_frontsights) {
                        GL11.glTranslatef(-0.6F, -1.2F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_frontsights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_frontsights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416FrontSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MBUSFrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MBUSFrontSight(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard, 
                        StonerHANDGUARD, AR57Handguard, M16A4HandGuard, M4CarbineHandGuard, 
                        ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuardTan,
                         ACRPrecisionHandGuardTan,
                        ACRSBRHandGuardTan, ACRPolymerHandGuardTan,
                        ACRSquareDropHandguardTan, HoneyBadgerHandguard,
                        HoneyBadgerMatrixArmsHandguard, KrissVectorReceiver, Vector556Handguard, APC9Placeholder,
                        ARX160Chassis, HK417Handguard, HK417HandguardTan, 
                        Block2SOCOMHandguard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Placeholder, 
                        HK416HandGuardBlackAndTan, SIGMCXHandguard, SIGMCXHandguardShort, AR15HandGuard, Z10Handguard,
                        Origin12Grip, HKS20Grip)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSFrontSight) {
                    	 GL11.glTranslatef(-0.6F, -0.9F, 0.5F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSFrontSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSFrontSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MBUSFrontSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        LeupoldScope = new ItemScope.Builder()
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.06f)
        		.withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(2.3f, 2.3f, 2.3f);
                    GL11.glTranslatef(-0.085f, 0.33f, 1.75f);
                })
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(MWC.ATTACHMENTS_TAB)
        		.withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, G2ContenderBarrelLong,
                        HK417Receiver, HK417ReceiverTan)
        		.withCrosshair("LP")
                .withModel(new com.paneedah.mwc.models.Leupold(), "leupold.png")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                    	GL11.glTranslatef(-0.6F, -0.3F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.45F, 0.45F, 0.45f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Leupold) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Leupold")
                .withTextureName("Dummy.png").build(MWC.modContext);
        
        PSO1 = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_PSO1)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.06f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.15f, 1.15f, 1.1f);
                    GL11.glTranslatef(-0.299f, 0.215f, 1.15f);
                }).withCategory(AttachmentCategory.SCOPE).withCreativeTab(MWC.ATTACHMENTS_TAB).withCrosshair("LP")
                .withModel(new com.paneedah.mwc.models.PSO1(), "pso1.png")
                .withModel(new com.paneedah.mwc.models.PSO12(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 5))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.PSO1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.PSO12) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("PSO1")
                .withTextureName("Dummy.png").build(MWC.modContext);
        
        OKP7 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.OKP)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.23, -4.4, -0.2);
        			GlStateManager.scale(2.05, 2.05, 2.05);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.OKP7(), "okp7.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
//                .withModel(new com.paneedah.mwc.models.OKP7reticle(), "green.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.OKP7) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.OKP7reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("okp7").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FMG9Sight = new ItemScope.Builder()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.FMG9Carryhandle(), "fmg9.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(-0.6F, 1.1F, -0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FMG9Carryhandle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("fmg9carryhandle").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Reflex = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.08, -3, 0);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Reflex(), "Reflex.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
//                .withModel(new com.paneedah.mwc.models.Reflex2(), "Reflex2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver, 
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1.15F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Reflex) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Reflex").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        BijiaReflex = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.BIJIA)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.08, -2.95, 0.1);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.BijiaReflex(), "bijiareflex.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, FABDefenseMount, 
                        Placeholder, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, DesertEagleSlide, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver,
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.BijiaReflex) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("BijiaReflex").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MicroReflex = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.MICROREFLEX)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.13, -1.62, -0.1);
        			GlStateManager.scale(1.6, 1.6, 1.6);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MicroReflexSight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.SightMount(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0F, 2.3F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, FABDefenseMount, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        MAS21Mount, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver,
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(-0.6F, -1.9F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroReflexSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MicroReflex").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ACOG = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_ACOG)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.52f, 1.52f, 1.52f);
                    GL11.glTranslatef(0.038f, 0.485f, 0.37f);
                })
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ACOG(), "Acog.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
//                .withModel(new com.paneedah.mwc.models.AcogScope2(), "gun.png")
//                .withModel(new com.paneedah.mwc.models.AcogReticle(), "acogreticle.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, 
                        AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong,
                        S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, Origin12Grip, 
                        HKS20Grip, FABDefenseMount, MAC21Stock, VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(0.1F, -0.8F, 1.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);

                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0.55F, 0.55F, 0.55F);
                        GL11.glTranslatef(1F, 0F, -1F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ACOG) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogReticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AcogScope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Acog")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Specter = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_SPECTRE)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(3.7f, 3.7f, 3.7f);
                    GL11.glTranslatef(-0.075f, 0.38f, 0.42f);
                })
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SpecterSight(), "SpecterSight.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
//                .withModel(new com.paneedah.mwc.models.Acog2(), "Acog2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, 
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, 
                        AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, 
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.25F, 0.25F, 0.25F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SpecterSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Acog2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Specter").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(MWC.modContext);

        Holographic = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.HOLO_ONE)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.1, -2.7, 0.3);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Holographic2(), "Holographic2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
//                .withModel(new com.paneedah.mwc.models.Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, 
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Holographic2").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(MWC.modContext);
        
        HolographicAlt = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.HOLO_ONE)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.1, -2.7, 0.3);
        			GlStateManager.scale(1.4, 1.4, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Holographic(), "holographic.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
//                .withModel(new com.paneedah.mwc.models.Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail,
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, 
                        AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, 
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.4F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Holographic) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HolographicAlt").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        EotechHybrid2 = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_HOLO)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.1f)
                .withViewfinderPositioning((p, s) -> {
                	GL11.glScalef(1.41f, 1.41f, 1.35f);
                    GL11.glTranslatef(-0.204f, 0.28f, 1.35f);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.EotechHybrid2(), "eotechhybrid.png")
                .withModel(new com.paneedah.mwc.models.EotechScopeRing(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail,
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, 
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.EotechHybrid2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.EotechScopeRing) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("EotechHybrid2").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VortexRedux = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.VORTEX)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.45, -3.15, 0.5);
        			GlStateManager.scale(1.73, 1.73, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.VortexSight(), "vortexsight.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody,
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, 
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(-0.6F, -0.8F, 1.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VortexSight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Holo2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("VortexSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MicroT1 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.3, -6, -0.2);
        			GlStateManager.scale(3.5, 3.5, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.MicroT1(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, 
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, 
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MicroT1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MicroT1").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AimpointCompM2 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.06, -3.8, -0.4);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.AimpointCompM2(), "AimpointCompM2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(-0.6F, 0.3F, 0F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.95F, 0.95F, 0.95f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AimpointCompM2").withTextureName("Dummy.png")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .build(MWC.modContext);
        
        AimpointCompM5 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.REFLEX)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.3, -6, -0.2);
        			GlStateManager.scale(3.5, 3.5, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.AimpointCompM5(), "aimpointcompm5.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(-0.6F, -0.5F, 0.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AimpointCompM5) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AimpointCompM5").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        RMR = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.RMR)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(0.22, -2.75, -0.53);
        			GlStateManager.scale(1.7, 1.6, 1.6);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.RMRsight(), "rmrsight.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
//                .withModel(new com.paneedah.mwc.models.Reflex2(), "Reflex2.png")
                .withRequiredAttachments(FABDefenseMount, VeprDustCover, AK15DustCover,
                        Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, DesertEagleSlide, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, MAS21Mount, APC9Placeholder, 
                        MAC21Stock, VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(-0.6F, -0.9F, 0.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RMRsight) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("RMRsight").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Kobra = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.KOBRA)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.05, -3.35, -0.8);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Kobra(), "gunmetaltexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL
                        , Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, 
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withRenderablePart()
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(-0.6F, -0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Kobra) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Kobra").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KobraGen3 = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.KOBRA)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.05, -3.35, -0.9);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KobraGen3(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, 
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, 
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody,
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, 
                        UMP9Receiver, G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, 
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withRenderablePart()
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraGen3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KobraGen3").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KobraMount = new ItemScope.Builder()
        		.withHolographicReticles(Reticles.KOBRA)
        		.withRadialCut(0.1f)
        		.withReticlePositioning((model, itemStack) -> {
        			GlStateManager.translate(-0.05, -3.35, -0.8);
        			GlStateManager.scale(1.8, 1.8, 1.4);
        		})
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KobraMount(), "kobramount.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withRenderablePart()
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(0.4F, -0.8F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(-0.6F, -0.1F, -0.1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KobraMount) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.Reflex2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("KobraMount").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HP = new ItemScope.Builder()
//                .withNightVision()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.65f, 1.65f, 1.65f);
                    GL11.glTranslatef(0.0285f, 0.492f, 0.7f);
                })
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.HP(), "gun.png")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.HP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HPScope").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        LeupoldRailScope = new ItemScope.Builder()
        		.withSniperReticle(Reticles.RETICLE_1)
        		.withOpticalZoom()
        		.withZoomRange(0.22f, 0.06f)
        		.withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(2.9f, 2.9f, 2.9f);
                    GL11.glTranslatef(-0.09f, 0.405f, 1.43f);
                })
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(MWC.ATTACHMENTS_TAB)
        		.withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail, 
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, 
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, MIMP5TRRail, MIMP5MRail,
                        CZ805BrenReceiver, HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, 
                        VSSMDustCover, Dragunov98DustCover)
        		.withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 5),
                    	new CraftingEntry(MWCItems.steelIngot, 5))
        		.withCrosshair("LP")
        		.withRenderablePart()
                .withModel(new com.paneedah.mwc.models.LeupoldRail(), "leupold.png")
//                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(-0.6F, -0.3F, 0.9F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.45F, 0.45F, 0.45f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.LeupoldRail) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("LeupoldRailScope")
                .withRotationPoint(-0.12079999459981924, -1.4240000168085098, -2.392400065904859)
                .withTextureName("Dummy.png").build(MWC.modContext);
        
        NightRaider = new ItemScope.Builder()
                .withNightVision()
                .withOpticalZoom()
                .withSniperReticle(Reticles.RETICLE_NIGHTRAIDER)
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.6f, 1.6f, 1.6f);
                    GL11.glTranslatef(-0.045f, 0.495f, 1.551f);
                })
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.NightRaiderScope(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 6),
                    	new CraftingEntry(MWCItems.steelIngot, 5))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail,
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard, 
                        Attachments.EF88Handguard, KrissVectorReceiver, 
                        Vector556Handguard, M1CarbineScoutHandguard, M14Rail, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, CZ805BrenReceiver, HK416Receiver, M110Receiver, ScarLReceiver,
                        Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock, 
                        VSSMDustCover, Dragunov98DustCover)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.NightRaiderScope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("NightRaiderScope")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M2A1sight = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.2f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.54f, 1.54f, 1.54f);
                    GL11.glTranslatef(-0.09f, -0.265f, -0.7f);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.M2A1(), "gun.png")
                .withModel(new com.paneedah.mwc.models.M2A1reticle(), "red.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.2F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(-0.6F, -0.6F, 1.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M2A1) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.M2A1reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("m2a1_sight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        F2000Scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(0.54f, 0.56f, 0.55f);
                    GL11.glTranslatef(-0.125f, -0.923f, 1.621f);
//                    GL11.glRotatef(30F, 1f, 0f, 0f);
                })
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.F2000Scope(), "gun.png")
                .withModel(new com.paneedah.mwc.models.F2000Scope2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.F2000Reticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(-0.6F, -0F, 0.45F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.85F, 0.85F, 0.85f);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.F2000Scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Reticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.F2000Scope2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("F2000Scope")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M202scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.7f, 1.7f, 1.7f);
                    GL11.glTranslatef(0.375f, 0.185f, 0.34f);
//                    GL11.glRotatef(30F, 1f, 0f, 0f);
                })
                .withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glTranslatef(-0.6F, -0.6F, 0.6F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } 
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } 
                })
                .withName("M202scope")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGscope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.02f)
                .withViewfinderPositioning((p, s) -> {
                    GL11.glScalef(1.05f, 1.05f, 1.05f);
                    GL11.glTranslatef(-0.23f, -0.77f, 0.65f);
                })
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withCrosshair("HP")
                .withModel(new com.paneedah.mwc.models.AUGScope_scope(), "gun.png")
                .withModel(new com.paneedah.mwc.models.JPUreticle(), "black.png")
                .withModel(new com.paneedah.mwc.models.AUGScope(), "gun.png")
                .withRequiredAttachments(AUGA1handguard)
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(-0.6F, -0.5F, 1.3F);
                    GL11.glRotatef(10F, 1f, 0f, 0f);
                    GL11.glRotatef(-190F, 0f, 1f, 0f);
                    GL11.glRotatef(0F, 0f, 0f, 1f);
                    GL11.glScaled(0.65F, 0.65F, 0.65f);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGScope_scope) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.JPUreticle) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AUGScope) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AUGscope")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Silencer556x45 = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor556x45(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x45) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer556x45").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer545x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor556x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer545x39").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer762x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor762x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x39").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M32Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("M32Barrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870Pump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Remington870Pump(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Pump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Pump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Pump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Pump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870Pump")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870MagpulPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Remington870MagpulPump(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870MagpulPump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870MagpulPump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870MagpulPump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870MagpulPump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870MagpulPump")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870PoliceMagnumPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Remington870PoliceMagnumPump(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumPump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870PoliceMagnumPump")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870FABDefensePump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRenderablePart()
                .withModel(new com.paneedah.mwc.models.Remington870FABDefensePump(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKRail(), "akrail.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(0.6F, 0.6F, -2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.75F, 0.75F, 0.75f);
                    } else if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870FABDefensePump) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.AKRail) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870FABDefensePump")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870Stock(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, 1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870Stock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870PoliceMagnumStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870PoliceMagnumStock(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.6F, 0.2F, 0.2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870PoliceMagnumStock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870PoliceMagnumStock(), "gun.png")
                .withModel(new com.paneedah.mwc.models.MilSpecStock(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1F);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.MilSpecStock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870MilSpecStock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870PoliceMagnumStock(), "gun.png")
                .withModel(new com.paneedah.mwc.models.HK416Stock(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    } else if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glTranslatef(-0.6F, -0.1F, 1F);
                        GL11.glRotatef(20F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.9F, 0.9F, 0.9f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumStock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.HK416Stock) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870HK416StockStock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870SawedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870SawedGrip(), "remington870.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Remington870SawedGrip")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870Barrel(), "gun.png")
                .withModel(new com.paneedah.mwc.models.R870part(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Barrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.8F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else if (model instanceof com.paneedah.mwc.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.R870part) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870Barrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870PoliceMagnumBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870PoliceMagnumBarrel(), "gun.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.8F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.55F, 0.55F, 0.55f);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870PoliceMagnumBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870PoliceMagnumBarrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Remington870SawedOffBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Remington870SawedBarrel(), "gun.png")
                .withModel(new com.paneedah.mwc.models.M9A1frontsight(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.66F, 0.66F, 0.66f);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Remington870SawedBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    } else if (model instanceof com.paneedah.mwc.models.M9A1frontsight) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withName("Remington870SawedBarrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KS23Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KS23Stock(), "ks23.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Stock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Stock) {
                        GL11.glTranslatef(0.6F, 0.5F, 1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("KS23Stock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KS23RaptorGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KS23RaptorGrip(), "ks23.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23RaptorGrip) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23RaptorGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23RaptorGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, 1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23RaptorGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("KS23RaptorGrip")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KS23MStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KS23Mstock(), "ks23.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Mstock) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Mstock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Mstock) {
                        GL11.glTranslatef(0.6F, 0.5F, 1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Mstock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("KS23MStock")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KS23Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KS23Barrel(), "ks23.png")
                .withModel(new com.paneedah.mwc.models.FALIron(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Barrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Barrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Barrel) {
                        GL11.glTranslatef(0.6F, 0.8F, -2.8F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23Barrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("KS23Barrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        KS23ExtendedBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KS23ExtendedBarrel(), "ks23.png")
                .withModel(new com.paneedah.mwc.models.FALIron(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23ExtendedBarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23ExtendedBarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23ExtendedBarrel) {
                    	GL11.glTranslatef(0.6F, 0.8F, -3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KS23ExtendedBarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("KS23ExtendedBarrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        RPKBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.RPKbarrel(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKiron3(), "gun")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_MODIFICATION,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1),
                    	new CraftingEntry(MWCItems.steelIngot, 3))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPKbarrel) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPKbarrel) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPKbarrel) {
                        GL11.glTranslatef(0.6F, 1F, -4.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof com.paneedah.mwc.models.AKMiron2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.RPKbarrel) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("RPKbarrel")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AKIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AKiron3(), "gun")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.paneedah.mwc.models.AKMiron2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("AKIron")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AKiron3(), "gun")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else if (model instanceof com.paneedah.mwc.models.AKMiron2) {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AKiron3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("AK12Iron")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SilencerPBS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRequiredAttachments(MakarovPBBody)
                .withModel(new com.paneedah.mwc.models.MakarovPBSSilencer(), "MakarovPBSSilencer.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(0.6F, 1.4F, -3.8F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MakarovPBSSilencer) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerPBS")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer9mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRequiredAttachments(M9A1Body, ScorpionHandguardShort, ScorpionHandguardLong, Glock19Body, Glock19XBody,
                		Glock19RazorbackBody, P226Slide, APC9Placeholder, MP443Slide, MP5NavyHandGuard, 
                		MP5A5HandGuard, MP5SDHandGuard, MIMP5MHandGuard, UTGTriRailHandGuard, MP5BMHandguard, SCCYCPX2Body, SCCYCPX2BodyTan)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer9mm")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SamuraiEdgeSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRequiredAttachments(SamuraiEdgeMount)
                .withModel(new com.paneedah.mwc.models.SamuraiEdgeSuppressor(), "samuraiedge.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(0.6F, 1.2F, -4F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SamuraiEdgeSuppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SamuraiEdgeSuppressor")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Silencer9x39mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer9x39mm")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SuppressorKBP9A91 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KBP9A91Suppressor(), "kbp9a91.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(0.6F, 1.3F, -5.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KBP9A91Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("KBP9A91Suppressor")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Silencer45ACP = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRequiredAttachments(KrissVectorReceiver, M1911Body)
                .withModel(new com.paneedah.mwc.models.Suppressor45ACP(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer45ACP").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SilencerEABH = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor45ACP(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("silencer_eabh").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer762x54 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x54").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer762x51 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor762x51(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor762x51) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer762x51").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer50BMG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 4),
                    	new CraftingEntry(MWCItems.steelIngot, 4))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer50BMG").withTextureName("Dummy.png")
                .build(MWC.modContext);


        Silencer556x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor556x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer556x39").withTextureName("Dummy.png")
                .build(MWC.modContext);


        AKMIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new AKMiron1(), "gun.png")
                .withModel(new AKMiron2(), "gun.png").withModel(new AK47iron(), "gun.png")
                .withModel(new M4Iron1(), "gun.png").withModel(new M4Iron2(), "gun.png")
                .withModel(new P90iron(), "gun.png").withModel(new G36CIron1(), "gun.png")
                .withModel(new G36CIron2(), "gun.png").withModel(new ScarIron1(), "gun.png")
                .withModel(new ScarIron2(), "gun.png").withModel(new FALIron(), "gun.png")
                .withModel(new M14Iron(), "gun.png").withModel(new MP5Iron(), "gun.png")
                .withModel(new MP5Iron(), "gun.png")
                .withModel(new M27rearsight(), "gun.png")
                .withModel(new MBUSiron(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, 
                        VLTORReceiver, AR57Receiver, Attachments.EF88Handguard, 
                        KrissVectorReceiver, Vector556Handguard, Origin12Grip, HKS20Grip,
                        ScarLReceiver)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M27rearsight) {
                        GL11.glTranslatef(-0.6F, -1F, 0.5F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M27rearsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M27rearsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AKMIron").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        TritiumRearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.TritiumRearSights(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, 
                        VLTORReceiver, AR57Receiver, Attachments.EF88Handguard, 
                        KrissVectorReceiver, Vector556Handguard, Origin12Grip, HKS20Grip,
                        Beowulf50CalReceiver, HK417Receiver, HK417ReceiverTan, HK416Receiver, 
                        M110Receiver, Z10Receiver)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.TritiumRearSights) {
                        GL11.glTranslatef(-0.6F, -0.9F, 0.45F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.TritiumRearSights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.TritiumRearSights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("TritiumRearSights").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MBUSRearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new MBUSRearSight(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, 
                        VLTORReceiver, AR57Receiver, Attachments.EF88Handguard, 
                        KrissVectorReceiver, Vector556Handguard, Origin12Grip, HKS20Grip,
                        ARX160Chassis,
                        Beowulf50CalReceiver, HK417Receiver, HK417ReceiverTan, HK416Receiver,
                        M110Receiver, Z10Receiver)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSRearSight) {
                    	 GL11.glTranslatef(-0.6F, -0.9F, 0.45F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(1.1F, 1.1F, 1.1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSRearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MBUSRearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MBUSRearSights").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        HK416RearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.G95_upright_rearsights(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, 
                        P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver, 
                        VLTORReceiver, AR57Receiver, Attachments.EF88Handguard, 
                        KrissVectorReceiver, Vector556Handguard, Origin12Grip, HKS20Grip,
                        Beowulf50CalReceiver, HK417Receiver, HK417ReceiverTan, CZ805BrenReceiver, 
                        HK416Receiver, M110Receiver, DSR1Handguard, DSR1HandguardRailed, Z10Receiver)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_rearsights) {
                    	 GL11.glTranslatef(-0.6F, -0.9F, 0.45F);
                         GL11.glRotatef(10F, 1f, 0f, 0f);
                         GL11.glRotatef(-190F, 0f, 1f, 0f);
                         GL11.glRotatef(0F, 0f, 0f, 1f);
                         GL11.glScaled(1F, 1F, 1f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_rearsights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.G95_upright_rearsights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("HK416RearSights").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        FNFALRearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.FNFALRearSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALRearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALRearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.FNFALRearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("FNFALRearSights").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M16A1RearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.EXTRA)
                .withModel(new com.paneedah.mwc.models.M16A1RearSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1RearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1RearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M16A1RearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("M16A1RearSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        K2C1RearSights = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.K2C1RearSight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.ScarIron2(), "gun.png")
                .withModel(new com.paneedah.mwc.models.FALIron(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1RearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.3F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1RearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.K2C1RearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("K2C1RearSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScorpionRearSight = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.SCOPE)
        		.withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScorpionRearSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionRearSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionRearSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionRearSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScorpionRearSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        ScorpionFrontSight = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.FRONTSIGHT)
        		.withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.ScorpionFrontSight(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionFrontSight) {
                        GL11.glTranslatef(-0.6F, -0.7F, 0.65F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionFrontSight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.ScorpionFrontSight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("ScorpionFrontSight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP7IronSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP7RearSights(), "MP7IronSights.png")
                .withModel(new com.paneedah.mwc.models.MP7FrontSights(), "MP7IronSights.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSights) {
                        GL11.glTranslatef(-0.6F, -0F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSights) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSights) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP7IronSights")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        MP7IronSightsStanding = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.MP7RearSightFlipped(), "MP7IronSights.png")
                .withModel(new com.paneedah.mwc.models.MP7FrontSightFlipped(), "MP7IronSights.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSightFlipped) {
                    	GL11.glTranslatef(-0.6F, 0.4F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSightFlipped) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.MP7RearSightFlipped) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0F, 0F, 0F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("MP7IronSightsStanding")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Kar98Ksight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new AK47iron(), "gun.png")
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47iron) {
                        GL11.glTranslatef(-0.6F, -1.6F, 0.95F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47iron) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK47iron) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("Kar98Ksight").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK15ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.KA_AK12_Ironsight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.KA_AK12_Ironsight) {
                        GL11.glTranslatef(-0.6F, -1F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KA_AK12_Ironsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.KA_AK12_Ironsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK15ironsight")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AK12ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AK15ironsight(), "gun.png")
                .withModel(new com.paneedah.mwc.models.AKMiron2(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder)
                .withInventoryModelPositioning((model, s) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15ironsight) {
                        GL11.glTranslatef(-0.6F, -1F, 0.7F);
                        GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-190F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);
                    } else {
                        GL11.glScalef(0f, 0f, 0f);
                    }
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15ironsight) {
                        GL11.glTranslatef(0.1F, -0.8F, 0.4F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.7F, 0.7F, 0.7F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AK15ironsight) {
                        GL11.glTranslatef(-0.8F, -0.5F, 0.8F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withName("AK12ironsight")
                .withRenderablePart().withTextureName("Dummy.png")
                .build(MWC.modContext);

        SilencerMP7 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("SilencerMP7").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer357 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "GunmetalTexture.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer357").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Silencer57x38 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer57x38").withTextureName("Dummy.png")
                .build(MWC.modContext);


        Silencer12Gauge = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor45ACP(), "GunmetalTexture.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3),
                    	new CraftingEntry(MWCItems.steelIngot, 2))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor45ACP) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                }).withName("Silencer12Gauge").withTextureName("Dummy.png")
                .build(MWC.modContext);


        Silencer300AACBlackout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor300AACBlackout(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer300AACBlackout").withTextureName("Dummy.png")
                .build(MWC.modContext);

        HoneyBadgerSilencer = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new com.paneedah.mwc.models.AACHoneyBadgerSilencer(), "gun.png")
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerSilencer) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerSilencer) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AACHoneyBadgerSilencer) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor300AACBlackout) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("HoneyBadgerSilencer").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        Silencer65x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Suppressor556x39(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 1),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.6F, 0.1F, 0.3F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1F, 1F, 1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Suppressor556x39) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withName("Silencer65x39").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Laser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder,
                        FABDefenseMount, LaserPlaceholder, Mk18HandGuard, M60E4HandGuard, 
                        P90Swordfish, AUGA3extGuard, StonerHANDGUARD, M9A1Body, SamuraiEdgeBody, 
                        M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack,
                        HoneyBadgerMatrixArmsHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                         FamasF1PicatinnyRail, 
                        HK417Handguard, HK417HandguardTan, AK12Handguard, AK12BHandguard, CZ805BrenReceiver, Block2SOCOMHandguard,
                        FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Mk48UpperHandGuard,
                        M9A1Body, SamuraiEdgeMount, KBP9A91KulaTacHandguard, VSSVintorezTriRailMount, M14TriRailCover, 
                        MP5BMHandguard, HK416HandGuardBlackAndTan, 
                        ScarHandGuard, ScarMidWestIndustriesHandGuard, NGSWRRail, K2C1Handguard, G3HandguardRailed,
                        ScarHHandGuard, MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withModel(new com.paneedah.mwc.models.Laser(), "gun.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {

                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("Laser").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Laser2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.Laser3(), "laser2.png")
                .withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder,
                        LaserPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, 
                        AUGA3extGuard, StonerHANDGUARD, AR57Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack,
                        HoneyBadgerMatrixArmsHandguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis, FamasF1PicatinnyRail, 
                        HK417Handguard, HK417HandguardTan, AK12BHandguard, CZ805BrenReceiver, Block2SOCOMHandguard,
                        LVOAVHandGuard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Mk48UpperHandGuard,
                        KBP9A91KulaTacHandguard, VSSVintorezTriRailMount, M14TriRailCover, MP5BMHandguard, 
                        HK416HandGuardBlackAndTan, ScarHandGuard, ScarMidWestIndustriesHandGuard, 
                        Z10Handguard, SIGMCXHandguard, SIGMCXHandguardShort, NGSWRRail, K2C1Handguard, G3HandguardRailed,
                        ScarHHandGuard, MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.3F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(0.6F, -0.3F, 0.4F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Laser3) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("Laser2").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        SCCYCPX2Laser = new AttachmentBuilder<Weapon>()
        		.withCategory(AttachmentCategory.LASER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.SCCYCPX2Laser(), "sccycpx2.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2),
                    	new CraftingEntry(MWCItems.steelIngot, 1))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.62F, 0.82F, 0.5F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                })
                .withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                })
                .withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(0.6F, 1.4F, -3.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.8F, 1.8F, 1.8f);

                    }
                })
                .withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.SCCYCPX2Laser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("SCCYCPX2Laser")
                
                .withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        DanWessonLaser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.DanWessonLaser(), "DanWessonLaser.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30F, 0f, 1f, 0f);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                })).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(0.5F, -1.3F, -0.1F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {

                    } else {
                        GL11.glScaled(0F, 0F, 0F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(0.6F, -0F, 0.2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.DanWessonLaser) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4F);
                    }
                })
                .withRenderablePart()
                .withName("DanWessonLaser").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1928Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withModel(new com.paneedah.mwc.models.M1928Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(0.6F, 0.5F, -3.2F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1928Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M1928Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        M1A1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withModel(new com.paneedah.mwc.models.M1A1Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 1.0f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(0.6F, 1.1F, -3.6F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.1F, 1.1F, 1.1f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.M1A1Grip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("M1A1Grip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Grip2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withModel(new com.paneedah.mwc.models.Grip2(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard,
                        AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard, 
                        M38HandGuard, UTGTriRailHandGuard, GripPlaceholder,
                        Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard,
                        AR57Handguard, RPK16Handguard, StonerHANDGUARD, KrissVectorReceiver, 
                        Vector556Handguard, Remington870FABDefensePump, 
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard,
                        ACRHandGuardBlack, ACRWEMSKHandGuardTan,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, 
                        FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                         FamasF1PicatinnyRail, 
                        HK417Handguard, HK417HandguardTan, AK12Handguard, AK12BHandguard, CZ805BrenReceiver, M14SOCOMChassis, 
                        Block2SOCOMHandguard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Mk48HandGuard,
                        KBP9A91KulaTacHandguard, VSSVintorezTriRailMount, MP5BMHandguard, HK416HandGuardBlackAndTan, 
                        ScarHandGuard, ScarMidWestIndustriesHandGuard, SIGMCXHandguard, SIGMCXHandguardShort, Z10Handguard,
                        NGSWRRail, G3HandguardRailed, ScarHHandGuard, MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Grip2) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Grip2").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        JunoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withModel(new com.paneedah.mwc.models.JunoGrip(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard, LVOAVHandGuard,
                        M38HandGuard, Mk18HandGuard, AR57Handguard, RPK16Handguard, M16A4HandGuard,
                        HoneyBadgerMatrixArmsHandguard, AR10SuperSASSHandguard, 
                        HK417Handguard, HK417HandguardTan, Block2SOCOMHandguard, FSSTacLiteHandguard, 
                        Mk18HandGuardBlack, M110Handguard, HK416HandGuardBlackAndTan, 
                        ScarHandGuard, ScarMidWestIndustriesHandGuard, SIGMCXHandguard, SIGMCXHandguardShort, Z10Handguard,
                        NGSWRRail, G3HandguardRailed, ScarHHandGuard,
                        SIG556HandguardKA, SIG556HandguardRailed)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(0.6F, 0F, -0.1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.8F, 0.8F, 0.8f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.JunoGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("JunoGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        GlockStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withModel(new com.paneedah.mwc.models.Glock18Cstock(), "gun.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18Cstock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18Cstock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18Cstock) {
                        GL11.glTranslatef(0.6F, 0.3F, 0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Glock18Cstock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Glock18Cstock").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        VP70Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VP70stock(), "vp70.png")
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VP70stock) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VP70stock) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VP70stock) {
                        GL11.glTranslatef(0.6F, 0.6F, 0.1F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.4F, 0.4F, 0.4f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VP70stock) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("VP70Stock").withTextureName("Dummy.png")
                .build(MWC.modContext);

        AngledGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AngledGrip(), "angledgrip.png")
                .withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard, 
                        LVOAVHandGuard, M38HandGuard, GripPlaceholder, UTGTriRailHandGuard, Mk18HandGuard, 
                        M60E4HandGuard, AUGA3extGuard, AR57Handguard, RPK16Handguard, 
                        StonerHANDGUARD, KrissVectorReceiver, Vector556Handguard, 
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack,
                        ACRWEMSKHandGuardTan,
                        HoneyBadgerMatrixArmsHandguard, FNFALPARAHandguard, M16A1PicatinnyRail, 
                        AR10SuperSASSHandguard, ARX160Chassis, FamasF1PicatinnyRail, 
                        HK417Handguard, HK417HandguardTan, AK12Handguard, AK12BHandguard, CZ805BrenReceiver, M14SOCOMChassis, 
                        Block2SOCOMHandguard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Mk48HandGuard,
                        KBP9A91KulaTacHandguard, VSSVintorezTriRailMount, MP5BMHandguard, HK416HandGuardBlackAndTan, 
                        ScarHandGuard, ScarMidWestIndustriesHandGuard, SIGMCXHandguard, SIGMCXHandguardShort, Z10Handguard,
                        NGSWRRail, G3HandguardRailed, ScarHHandGuard, MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(0.6F, 0.8F, -0.45F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.2F, 1.2F, 1.2f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AngledGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("AngledGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        StubbyGrip = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.StubbyGrip(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, 
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard,
                        AR57Handguard, RPK16Handguard, StonerHANDGUARD, KrissVectorReceiver, 
                        Vector556Handguard, Remington870FABDefensePump, 
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuardTan,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, 
                        FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                         FamasF1PicatinnyRail, 
                        HK417Handguard, HK417HandguardTan, AK12Handguard, AK12BHandguard, CZ805BrenReceiver, M14SOCOMChassis,
                        Block2SOCOMHandguard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Mk48HandGuard,
                        KBP9A91KulaTacHandguard, VSSVintorezTriRailMount, MP5BMHandguard, HK416HandGuardBlackAndTan, 
                        ScarHandGuard, ScarMidWestIndustriesHandGuard, SIGMCXHandguard, SIGMCXHandguardShort, Z10Handguard,
                        NGSWRRail, G3HandguardRailed, ScarHHandGuard, MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                // .withApply((a, weapon, player) ->
                // weapon.changeRecoil(player, 1.3F);
                // })
                // .withRemove((attachment, weapon, player) -> {
                // weapon.changeRecoil(player, 1);
                // })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(0.7F, -1.2F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(0.6F, 0.5F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.6F, 1.6F, 1.6f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.StubbyGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("StubbyGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        VGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.VGrip(), "gun.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, 
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, 
                        GripPlaceholder, Mk18HandGuard,
                        M60E4HandGuard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD,
                        KrissVectorReceiver, Vector556Handguard, Remington870FABDefensePump,
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack,
                         ACRWEMSKHandGuardTan,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, 
                        Mk14BlackBody, FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                         FamasF1PicatinnyRail, 
                        HK417Handguard, HK417HandguardTan, AK12Handguard, AK12BHandguard, CZ805BrenReceiver, M14SOCOMChassis, 
                        Block2SOCOMHandguard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Mk48HandGuard,
                        KBP9A91KulaTacHandguard, VSSVintorezTriRailMount, MP5BMHandguard, HK416HandGuardBlackAndTan, 
                        ScarHandGuard, ScarMidWestIndustriesHandGuard, SIGMCXHandguard, SIGMCXHandguardShort, Z10Handguard,
                        NGSWRRail, G3HandguardRailed, ScarHHandGuard, MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                })
                .withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(0.6F, 0.3F, -0.5F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.VGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("VGrip").withTextureName("Dummy.png")
                .build(MWC.modContext);

        Bipod = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withCreativeTab(MWC.ATTACHMENTS_TAB).withModel(new com.paneedah.mwc.models.Bipod(), "bipod.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard, 
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard, GripPlaceholder, 
                        Mk18HandGuard, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD, 
                        StonerHANDGUARD, KrissVectorReceiver, Vector556Handguard, M16A4HandGuard, ACRHandGuard,
                        ACRPrecisionHandGuardTan, ACRHandGuardBlack, ACRWEMSKHandGuardTan,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard, ARX160Chassis,
                        HK417Handguard, HK417HandguardTan, AK12Handguard, AK12BHandguard, CZ805BrenReceiver, M14SOCOMChassis, 
                        Block2SOCOMHandguard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, M249HandGuard, Mk48HandGuard,
                        M40A6GripPlaceholder, VSSVintorezTriRailMount, MP5BMHandguard, HK416HandGuardBlackAndTan, 
                        ScarHandGuard, ScarMidWestIndustriesHandGuard, SIGMCXHandguard, SIGMCXHandguardShort,
                        DSR1HandguardRailed, Z10Handguard, NGSWRRail, G3HandguardRailed, ScarHHandGuard, 
                        MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard)
                .withModernRecipe(
                    	CraftingGroup.ATTACHMENT_NORMAL,
                    	new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(0.6F, 0.05F, -0.85F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(0.7F, 0.7F, 0.7f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.Bipod) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withName("Bipod").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        AUGgrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.AUGGrip(), "gun.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(0.6F, 0.6F, -3.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.AUGGrip) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("AUGgrip").withTextureName("Dummy.png")
                .build(MWC.modContext);
        
        USPMatchCompensator = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withCreativeTab(MWC.ATTACHMENTS_TAB)
                .withModel(new com.paneedah.mwc.models.USPMatchCompensator(), "gun.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                }).withFirstPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(0.7F, -1.1F, 0.5F);
                        GL11.glRotatef(30F, 0f, 1f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }

                }).withThirdPersonModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(-0.7F, -0.5F, 0.6F);
                        GL11.glRotatef(-50F, 0f, 1f, 0f);
                        GL11.glRotatef(80F, 1f, 0f, 0f);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                }).withInventoryModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(0.6F, 0.6F, -3.7F);
                        // GL11.glRotatef(10F, 1f, 0f, 0f);
                        GL11.glRotatef(-180F, 0f, 1f, 0f);
                        GL11.glRotatef(0F, 0f, 0f, 1f);
                        GL11.glScaled(1.3F, 1.3F, 1.3f);

                    }
                }).withEntityModelPositioning((model, itemStack) -> {
                    if (model instanceof com.paneedah.mwc.models.USPMatchCompensator) {
                        GL11.glTranslatef(0.1F, 0.2F, 0.4F);
                        GL11.glRotatef(90F, 0f, 0f, 1f);
                        GL11.glScaled(0.6F, 0.6F, 0.6F);
                    }
                })
                .withRenderablePart()
                .withName("USPMatchCompensator").withTextureName("Dummy.png")
                .build(MWC.modContext);

    }
}
