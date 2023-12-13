package com.paneedah.mwc.weapons;

import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.crafting.CraftingGroup;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import org.lwjgl.opengl.GL11;

// Todo: Who the actual fuck thought a fucking 15000 lines class for attachments was a good idea
//       Split this into different class's for categories (Scopes, Grips, Silencers etc...)
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
    public static ItemAttachment<Weapon> PMII525x56P4FLScope;
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
    public static ItemAttachment<Weapon> Grip2Tan;
    public static ItemAttachment<Weapon> AngledGrip;
    public static ItemAttachment<Weapon> AngledGripTan;
    public static ItemAttachment<Weapon> JunoGrip;
    public static ItemAttachment<Weapon> JunoGripTan;
    public static ItemAttachment<Weapon> StubbyGrip;
    public static ItemAttachment<Weapon> StubbyGripTan;
    public static ItemAttachment<Weapon> VGrip;
    public static ItemAttachment<Weapon> VGripTan;
    public static ItemAttachment<Weapon> Bipod;
    public static ItemAttachment<Weapon> AUGgrip;
    public static ItemAttachment<Weapon> PechenegBipod;
    public static ItemAttachment<Weapon> USPMatchCompensator;
    public static ItemAttachment<Weapon> AKMIron;
    public static ItemAttachment<Weapon> MicroT1;
    public static ItemAttachment<Weapon> AimpointCompM2;
    public static ItemAttachment<Weapon> AimpointCompM5;
    public static ItemAttachment<Weapon> RMR;
    public static ItemAttachment<Weapon> LeupoldDeltapointPro;
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
    public static ItemAttachment<Weapon> GeisseleURGIHandguard;
	
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
    public static ItemAttachment<Weapon> HardballerBody;
    public static ItemAttachment<Weapon> HardballerSlide;
    public static ItemAttachment<Weapon> M45A1CQBPBody;
    public static ItemAttachment<Weapon> M45A1CQBPSlide;
    public static ItemAttachment<Weapon> M9A1Slide;
    public static ItemAttachment<Weapon> M9A1Body;
    public static ItemAttachment<Weapon> SamuraiEdgeSlide;
    public static ItemAttachment<Weapon> SamuraiEdgeBody;
    public static ItemAttachment<Weapon> SamuraiEdgeMount;
    public static ItemAttachment<Weapon> DesertEagleBody;
    public static ItemAttachment<Weapon> DesertEagleSlide;
    public static ItemAttachment<Weapon> DesertEagleLongBody;
    public static ItemAttachment<Weapon> DesertEagleBodyGolden;
    public static ItemAttachment<Weapon> DesertEagleSlideGolden;
    public static ItemAttachment<Weapon> DesertEagleBodyBlack;
    public static ItemAttachment<Weapon> DesertEagleSlideBlack;
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
    public static ItemAttachment<Weapon> UziWoodStock;
    public static ItemAttachment<Weapon> UziFoldingStockOpened;
    public static ItemAttachment<Weapon> UziMLOKHandguard;
    public static ItemAttachment<Weapon> UziSightRail;
    public static ItemAttachment<Weapon> UziFoldingStockClosed;

    public static ItemAttachment<Weapon> InterventionStock;
    public static ItemAttachment<Weapon> InterventionFJXLUX7Stock;
    public static ItemAttachment<Weapon> InterventionKiloTaCStock;
    public static ItemAttachment<Weapon> InterventionHandguard;
    public static ItemAttachment<Weapon> InterventionQTDRifleHandguard;
    public static ItemAttachment<Weapon> InterventionRailSystemHandguard;
    public static ItemAttachment<Weapon> InterventionCarryHandle;
    public static ItemAttachment<Weapon> InterventionKeystoneHandle;

    public static ItemAttachment<Weapon> Saiga12Handguard;
    public static ItemAttachment<Weapon> Saiga12Stock;
    public static ItemAttachment<Weapon> Saiga12Grip;
	
    public static ItemAttachment<Weapon> G36CHandguard;
    public static ItemAttachment<Weapon> G36KHandguard;
    public static ItemAttachment<Weapon> G36CStock;
    public static ItemAttachment<Weapon> G36CMGStock;
    public static ItemAttachment<Weapon> G36KVStock;
    public static ItemAttachment<Weapon> PKMBarrel;
    public static ItemAttachment<Weapon> PechenegBarrel;
    public static ItemAttachment<Weapon> PKMGrip;
    public static ItemAttachment<Weapon> RK3PGrip;
    public static ItemAttachment<Weapon> PKMStock;
    public static ItemAttachment<Weapon> PT2Stock;
    public static ItemAttachment<Weapon> B51ScopeMountRail;
    public static ItemAttachment<Weapon> B50PKMHandguard;
    public static ItemAttachment<Weapon> B50PKPHandguard;

    public static void init() {
        G11HandguardK1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G11HandguardK1(), "g11.png")
                .withName("G11HandguardK1")
                .build();

        G11HandguardK2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G11HandguardK2(), "g11.png")
                .withName("G11HandguardK2")
                .build();


        FABDefenseMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new FABDefenseMount(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("FABDefenseMount")
                .build();

        MAS21Mount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new MAS21Mount(), "gun.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.62F, 1, 0.5F);
                    // GL11.glRotatef(30, 0, 1, 0);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withName("MAS21Mount")
                .build();

        P90Swordfish = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new P90Swordfish(), "p90.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail4(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("P90swordfish")
                .build();

        P90DefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new P90DefaultKit(), "p90.png")
                .withName("P90DefaultKit")
                .build();

        P90Terminator = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new P90Terminator(), "p90.png")
                .withName("P90Terminator")
                .build();

        ScarHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarLHandguard(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarHandGuard")
                .build();

        ScarHHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarHHandguard(), "scarh.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarHHandGuard")
                .build();

        ScarMidWestIndustriesHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarMidWestIndustriesHandguard(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("ScarMidWestIndustriesHandGuard")
                .build();

        ScarMLOKHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarMLOKHandguard(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarMLOKHandguard")
                .build();

        SIG556Handguard = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SIG556Handguard(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SIG556Handguard")
                .build();

        SIG556HandguardRailed = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SIG556HandguardRailed(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SIG556HandguardRailed")
                .build();

        SIG556HandguardKA = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SIG556HandguardKA(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SIG556HandguardKA")
                .build();

        SIG556Grip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SIG556Grip(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("SIG556Grip")
                .build();

        ScarLReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new ScarReceiver(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarLReceiver")
                .build();

        KrissVectorReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new KrissVectorReceiver(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KrissVectorReceiver")
                .build();

        Vector556Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new KrissVectorModified(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 5),
                        new CraftingEntry(Items.STRING, 4),
                        new CraftingEntry(Items.PAPER, 5))
                .withName("KrissVector556Handguard")
                .build();

        VectorMk1ModularHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KrissVectorMk1ModularGuard(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("VectorMk1ModularHandguard")
                .build();

        VectorCarbineHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KrissVectorCarbineGuard(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("VectorCarbineHandguard")
                .build();

        VectorTapedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new KrissVectorTapedGrip(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Items.STRING, 2),
                        new CraftingEntry(Items.PAPER, 3))
                .withName("VectorTapedGrip")
                .build();

        Origin12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Origin12Handguard(), "origin12.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Origin12Handguard")
                .build();

        HKS20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new HKS20Handguard(), "hks20.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withName("HKS20Handguard")
                .build();

        Remington700Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Remington700Chassis(), "remington700.png")
                .withName("Remington700Chassis")
                .build();

        Remington700APACChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Remington700ChassisAPAC(), "remington700.png")
                .withName("Remington700APACChassis")
                .build();

        Remington700MDTXRSChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Remington700ChassisMDTXRS(), "remington700.png")
                .withName("Remington700MDTXRSChassis")
                .build();

        SSG08Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new SSG08Chassis(), "SSG08_2.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("SSG08Chassis")
                .build();

        ARX160Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new ARX160(), "arx160.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 6),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("ARX160Chassis")
                .build();

        G2ContenderBarrelShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new G2ContenderBarrelShort(), "g2contender.png")
                .withOnWeaponModel(new AK47iron(), "gun.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withRenderablePart()
                .withName("G2ContenderBarrelShort")
                .build();

        G2ContenderBarrelLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new G2ContenderBarrelLong(), "g2contender.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AK47iron(), "gun.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withRenderablePart()
                .withName("G2ContenderBarrelLong")
                .build();

        G2ContenderGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new G2ContenderGrip(), "g2contender.png")
                .withRenderablePart()
                .withName("G2ContenderGrip")
                .build();

        G2ContenderStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new G2ContenderStock(), "g2contender.png")
                .withRenderablePart()
                .withName("G2ContenderStock")
                .build();

        Origin12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Origin12Grip(), "origin12.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Origin12Grip")
                .build();

        HKS20Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HKS20Grip(), "HKS20.png")
                .withName("HKS20Grip")
                .build();

        Origin12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Origin12Stock(), "origin12.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(Origin12Grip)
                .withName("Origin12Stock")
                .build();

        HKS20Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new HKS20Stock(), "HKS20.png")
                .withRequiredAttachments(HKS20Grip)
                .withName("HKS20Stock")
                .build();

        ACRHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRHandGuard(), "acr.png")
                .withOnWeaponModel(new AKRail(), "acrrail.png")
                .withOnWeaponModel(new AKRail2(), "acrrail.png")
                .withOnWeaponModel(new AKRail3(), "acrrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRHandGuard")
                .build();

        ACRHandGuardBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRHandGuard(), "acrblack.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("ACRHandGuardBlack")
                .build();

        ACRWEMSKHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRWEMSKHandguard(), "acr.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRWEMSKHandguardTan")
                .build();

        ACRPrecisionHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRPrecisionHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPrecisionHandGuardTan")
                .build();

        ACRSBRHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRSBRHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRSBRHandGuardTan")
                .build();

        ACRPolymerHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRPolymerHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPolymerHandguardTan")
                .build();

        ACRSquareDropHandguardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRSquareDropHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRSquareDropHandguardTan")
                .build();

        Type20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Type20Handguard(), "type20.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Type20Handguard")
                .build();

        HoneyBadgerHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AACHoneyBadgerHandguard(), "AACHoneyBadger.png")
                .withOnWeaponModel(new AKRail(), "aacrail_gray.png")
//                .withOnWeaponModel(new AKRail2(), "acrrail.png")
//                .withOnWeaponModel(new AKRail3(), "acrrail.png")
                .withName("HoneyBadgerHandguard")
                .build();

        HoneyBadgerMatrixArmsHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withOnWeaponModel(new AACMatrixArmsHandguard(), "aacMatrixArmsHandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withName("HoneyBadgerMatrixArmsHandguard")
                .build();

        M60HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M60HandGuard(), "m60.png")
                .withName("M60HandGuard")
                .build();

        M60E4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M60E4Guard(), "m60.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withName("M60E4Guard")
                .build();

        M249HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M249HandGuard(), "m249.png")
                .withName("M249HandGuard")
                .build();

        Mk48HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Mk48HandGuard(), "m249.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("Mk48HandGuard")
                .build();

        M249UpperHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M249UpperHandGuard(), "m249.png")
                .withName("M249UpperHandGuard")
                .build();

        Mk48UpperHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Mk48UpperHandGuard(), "m249.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withName("Mk48UpperHandGuard")
                .build();

        StonerHANDGUARD = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new StonerHANDGUARD(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withName("StonerHANDGUARD")
                .build();

        AUGA1handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AUGHandguard(), "aug.png")
                .withName("AUGA1")
                .build();

        AUGA2handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AUGScopeRail(), "aug.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("AUGA2handguard")
                .build();

        AUGA3handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AUGA3M1(), "aug.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("AUGA3handguard")
                .build();

        EF88Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AUGEF88(), "aug.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("EF88Handguard")
                .build();

        AUGDefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AUG9mmConversionkit(), "aug.png")
                .withName("AUGDefaultKit")
                .build();

        AUGParaConversion = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AUG9mmConversionkit(), "aug.png")
                .withName("AUGParaConversion")
                .build();

        AUGA3extGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AUGA3M1_Ext(), "aug.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail4(), "akrail.png")
                .withRequiredAttachments(AUGA3handguard)
                .withName("AUGA3extGuard")
                .build();

        M1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M1CarbineBody(), "m1carbine.png")
                .withName("M1CarbineBody")
                .build();

        M1A1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M1A1CarbineStock(), "m1carbine.png")
                .withName("M1A1CarbineBody")
                .build();

        M1CarbineHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M1CarbineHandguard(), "m1carbine.png")
                .withName("M1CarbineHandguard")
                .build();

        M1CarbineVentilatedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M1CarbineVentilatedHandguard(), "gun.png")
                .withName("M1CarbineVentilatedHandguard")
                .build();

        M1CarbineScoutHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M1ScoutCarbineHandguard(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("M1ScoutCarbineHandguard")
                .build();

        G3A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G3A1Handguard(), "g3.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G3A1Handguard")
                .build();

        G3HandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G3HandguardRailed(), "g3.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("G3HandguardRailed")
                .build();

        DSR1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new DSR1Handguard(), "dsr1.png")
                .withName("DSR1Handguard")
                .build();

        DSR1HandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new DSR1HandguardRailed(), "dsr1.png")
                .withName("DSR1HandguardRailed")
                .build();

        DSR1Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new DSR1Barrel(), "dsr1.png")
                .withName("DSR1Barrel")
                .build();

        DSR1BarrelLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new DSR1BarrelLong(), "dsr1.png")
                .withName("DSR1BarrelLong")
                .build();

        M14Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M14Body(), "m14dmr.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("M14Body")
                .build();

        M14SOCOMChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M14DMRSocomChassis(), "m14dmr.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("M14DMRSocomChassis")
                .build();

        Mk14TanBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Mk14Body(), "mk14ebrtan.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Mk14TanBody")
                .build();

        Mk14SnowBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Mk14Body(), "mk14ebrsnow.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Mk14SnowBody")
                .build();

        Mk14BlackBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Mk14Body(), "mk14ebr.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Mk14BlackBody")
                .build();

        M14Cover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M14Cover(), "m14dmr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(M14Body, M14SOCOMChassis)
                .withName("M14Cover")
                .build();

        M14TriRailCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M14TriRailCover(), "m14dmr.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(M14Body, M14SOCOMChassis)
                .withName("M14TriRailCover")
                .build();

        M14Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRequiredAttachments(M14Body, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, M14SOCOMChassis)
                .withModel(new M14DMRRail(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("M14Rail")
                .build();

        ScarStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarStock(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarStock")
                .build();

        ScarRetractableStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarShortStock(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarRetractableStock")
                .build();

        // Todo: This one is sus it was actually using the dam thing
        ScarAdapterStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarAdapterStock(), "scarl.png")
                .withOnWeaponModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("ScarAdapterStock")
                .build();

        ScarHStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarStock(), "scar_stock_h.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarHStock")
                .build();

        VectorStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KrissVectorStock(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("VectorStock")
                .build();

        VectorStockAdapter = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KrissVectorStockAdapter(), "krissvector.png")
                .withOnWeaponModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("VectorStockAdapter")
                .build();

        UMP45Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new UMP45Receiver(), "ump45.png")
                .withName("UMP45Receiver")
                .build();

        UMP9Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new UMP45Receiver(), "ump45.png")
                .withName("UMP9Receiver")
                .build();

        UMP45Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UMP45Stock(), "ump45.png")
                .withName("UMP45Stock")
                .build();

        MAC10Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MAC10Stock(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("MAC10Stock")
                .build();

        MAC21Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Mac10stockwithrail(), "Mac10stockwithrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MAC21Stock")
                .build();

        ACRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRStock")
                .build();

        ACRStockBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRStock(), "acrblack.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRStockBlack")
                .build();

        ACRFixedStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRFixedStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRFixedStockTan")
                .build();

        ACRPRSStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRPRSStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPRSStockTan")
                .build();

        ACRLongRangeStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRLongRangeStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("ACRLongRangeStock")
                .build();

        ACRPDWStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRPDWStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPDWStock")
                .build();

        M1014Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M1014stock(), "m1014.png")
                .withName("M1014Stock")
                .build();

        M1014Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M1014grip(), "m1014.png")
                .withName("M1014Grip")
                .build();

        M4BenelliStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M4BenelliStock(), "supernova.png")
                .withName("M4BenelliStock")
                .build();

        Spas12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Spas12Stock(), "gun.png")
                .withName("Spas12Stock")
                .build();

        M249Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249Stock(), "m249.png")
                .withName("M249Stock")
                .build();

        M249ParaStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249ParaStock(), "m249.png")
                .withName("M249ParaStock")
                .build();

        // Todo: This one is sus it was actually using the dam thing
        M249MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249StockAdapter(), "m249.png")
                .withOnWeaponModel(new MilSpecStock(), "MilSpecStock.png")
                .withName("M249MilspecStock")
                .build();

        // Todo: This one is sus it was actually using the dam thing
        M249HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249StockAdapter(), "m249.png")
                .withOnWeaponModel(new HK416Stock(), "HK416Stock.png")
                .withName("M249Hk416Stock")
                .build();

        UTGTriRailHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new UTGTriRailHandGuard(), "mp5.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("UTGTriRailHandGuard")
                .build();

        MP5BMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5BMHandGuard(), "mp5.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP5BMHandGuard")
                .build();

        MIMP5MHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MIMP5MHandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MIMP5MHandGuard")
                .build();

        ScorpionHandguardShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScorpionEVO3A1HandguardShort(), "ScorpionEVO3A1.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail4(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("ScorpionEVO3A1HandguardShort")
                .build();

        ScorpionHandguardLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScorpionEVO3A1HandguardLong(), "ScorpionEVO3A1.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScorpionEVO3A1HandguardLong")
                .build();

        MIMP5TRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new MIMP5TRRail(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("MIMP5TRRail")
                .build();

        MIMP5MRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new MIMP5MRail(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("MIMP5MRail")
                .build();

        ShotgunRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new SupernovaRail(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("ShotgunRail")
                .build();

        Kar98Krail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new Kar98Krail(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("Kar98Krail")
                .build();

        M60Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new AKRail(), "akrail.png")
                .withName("M60Rail")
                .build();

        M16A1ScopeMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new M16A1ScopeMount(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("M16A1ScopeMount")
                .build();

        FamasF1ScopeMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new FamasF1ScopeRail(), "famasf1.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("FamasF1ScopeMount")
                .build();

        M16A1PicatinnyRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withRenderablePart()
                .withModel(new M16A1PicatinnyRail(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("M16A1PicatinnyRail")
                .build();

        FamasF1PicatinnyRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withRenderablePart()
                .withModel(new FamasF1GripRail(), "famasf1.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("FamasF1PicatinnyRail")
                .build();

        NGSWRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withRenderablePart()
                .withModel(new NGSWRRails(), "ngswr.png")
                .withName("NGSWRRail")
                .build();

        RailRiser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new KrissVectorRailRiser(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("RailRiser")
                .build();

       M1911Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M1911Slide(), "m1911.png")
                .withOnWeaponModel(new M1911FrontSight(), "gun")
                .withOnWeaponModel(new makarovrearsight(), "gun")
                .withName("M1911Slide")
                .withRenderablePart()
                .build();

        M1911Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M1911(), "m1911.png")
                .withName("M1911Body")
                .withRenderablePart()
                .build();

        HardballerBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M1911HardBaller(), "m1911.png")
                .withName("HardballerBody")
                .withRenderablePart()
                .build();

        HardballerSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M1911HardBallerSlide(), "m1911.png")
                .withOnWeaponModel(new HardballerIron(), "gun")
                .withName("HardballerSlide")
                .withRenderablePart()
                .build();

        M45A1CQBPBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M45A1(), "m1911.png")
                .withName("M45A1CQBPBody")
                .withRenderablePart()
                .build();

        M45A1CQBPSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M45A1Slide(), "m1911.png")
                .withOnWeaponModel(new m45a1Iron(), "gun")
                .withName("M45A1CQBPSlide")
                .withRenderablePart()
                .build();

        M9A1Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M9slide(), "m9a1.png")
                .withOnWeaponModel(new M9A1frontsight(), "M9A1frontsight")
                .withOnWeaponModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M9A1Slide")
                .withRenderablePart()
                .build();

        M9A1Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M9(), "m9a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M9A1Body")
                .withRenderablePart()
                .build();

        SamuraiEdgeSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new SamuraiEdgeSlide(), "samuraiedge.png")
                .withOnWeaponModel(new M9A1frontsight(), "M9A1frontsight")
                .withOnWeaponModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SamuraiEdgeSlide")
                .withRenderablePart()
                .build();

        SamuraiEdgeBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SamuraiEdge(), "samuraiedge.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("SamuraiEdgeBody")
                .withRenderablePart()
                .build();

        SamuraiEdgeMount = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withRequiredAttachments(SamuraiEdgeBody)
                .withModel(new SamuraiEdgeMount(), "samuraiedge.png")
                .withName("SamuraiEdgeMount")
                .withRenderablePart()
                .build();

        DesertEagleSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new DesertEagleSlide(), "deagle.png")
                .withName("DesertEagleSlide")
                .withRenderablePart()
                .build();

        DesertEagleBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new DesertEagle(), "deagle.png")
                .withName("DesertEagleBody")
                .withRenderablePart()
                .build();

        DesertEagleLongBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new DesertEagleLong(), "Deagle.png")
                .withName("DesertEagleLongBody")
                .withRenderablePart()
                .build();

        DesertEagleBodyGolden = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new DesertEagle(), "deaglegolden.png")
                .withName("DesertEagleBodyGolden")
                .withRenderablePart()
                .build();

        DesertEagleSlideGolden = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new DesertEagleSlide(), "deaglegolden.png")
                .withName("DesertEagleSlideGolden")
                .withRenderablePart()
                .build();

        DesertEagleBodyBlack = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new DesertEagle(), "deagleblack.png")
                .withName("DesertEagleBodyBlack")
                .withRenderablePart()
                .build();

        DesertEagleSlideBlack = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new DesertEagleSlide(), "deagleblack.png")
                .withName("DesertEagleSlideBlack")
                .withRenderablePart()
                .build();

        Glock19Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Glock19(), "glock19.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Glock19Body")
                .withRenderablePart()
                .build();

        // Todo: Why commented out?
//        Glock18CBody = new AttachmentBuilder<Weapon>()
//                .withCategory(AttachmentCategory.BACKGRIP)
//                .withCreativeTab(MWC.AttachmentsTab)
//                .withModel(new Glock19(), "glock18c.png")
//                
//                .withName("Glock18CBody")
//                .withRenderablePart()
//                .build(MWC.modContext);

        Glock19XBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Glock19XBody(), "glock19.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Glock19XBody")
                .withRenderablePart()
                .build();

        Glock19RazorbackBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new GlockRazorback(), "glock19.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("GlockRazorbackBody")
                .withRenderablePart()
                .build();

        Glock19Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19Slide(), "glock19.png")
                .withOnWeaponModel(new M1911FrontSight(), "m1911frontsight")
                .withOnWeaponModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19Slide")
                .withRenderablePart()
                .build();

        Glock18CSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock18Cslide(), "glock18c.png")
                .withOnWeaponModel(new M1911FrontSight(), "m1911frontsight")
                .withOnWeaponModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock18CSlide")
                .withRenderablePart()
                .build();

        Glock18CCNCSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock18CCNCslide(), "glock18c.png")
                .withOnWeaponModel(new M1911FrontSight(), "m1911frontsight")
                .withOnWeaponModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock18CCNCslide")
                .withRenderablePart()
                .build();

        Glock19XSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19XSlide(), "glock19.png")
                .withOnWeaponModel(new M1911FrontSight(), "m1911frontsight")
                .withOnWeaponModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19XSlide")
                .withRenderablePart()
                .build();

        Glock19RazorbackSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new GlockRazorbackSlide(), "glock19.png")
                .withOnWeaponModel(new M1911FrontSight(), "m1911frontsight")
                .withOnWeaponModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("GlockRazorbackSlide")
                .withRenderablePart()
                .build();

        Glock19RockSlideOlive = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19Rockslide(), "glock19.png")
                .withOnWeaponModel(new M1911FrontSight(), "m1911frontsight")
                .withOnWeaponModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19RockslideOlive")
                .withRenderablePart()
                .build();

        Glock19GhostPrecisionSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19GhostPrecisionSlide(), "glock19.png")
                .withOnWeaponModel(new M1911FrontSight(), "m1911frontsight")
                .withOnWeaponModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19GhostPrecisionSlide")
                .withRenderablePart()
                .build();

        SCCYCPX2Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SCCYCPX2(), "sccycpx2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SCCYCPX2Body")
                .withRenderablePart()
                .build();

        SCCYCPX2BodyTan = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SCCYCPX2BodyTan(), "sccycpx2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SCCYCPX2BodyTan")
                .withRenderablePart()
                .build();

        SCCYCPX2GripTape = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SCCYCPX2GripTape(), "sccycpx2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(Items.STRING, 4),
                        new CraftingEntry(Items.PAPER, 5))
                .withName("SCCYCPX2GripTape")
                .withRenderablePart()
                .build();

        SCCYCPX2Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new SCCYCPX2Slide(), "sccycpx2.png")
                .withOnWeaponModel(new M9A1frontsight(), "M9A1frontsight")
                .withOnWeaponModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("SCCYCPX2Slide")
                .withRenderablePart()
                .build();

        SCCYCPX2BSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new SCCYCPX2BSlide(), "sccycpx2.png")
                .withOnWeaponModel(new M9A1frontsight(), "M9A1frontsight")
                .withOnWeaponModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("SCCYCPX2BSlide")
                .withRenderablePart()
                .build();

        P226Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new P226Slide(), "P226.png")
                .withOnWeaponModel(new P226rearsight(), "p226rearsight.png")
                .withOnWeaponModel(new P226frontsight(), "p226frontsight.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("P226Slide")
                .withRenderablePart()
                .build();

        FiveSevenSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new FiveSevenSlide(), "fiveseven.png")
                .withOnWeaponModel(new P226rearsight(), "p226rearsight.png")
                .withOnWeaponModel(new P226frontsight(), "p226frontsight.png")
                .withName("FiveSevenSlide")
                .withRenderablePart()
                .build();

        MakarovBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new MakarovPM(), "makarovpm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MakarovBody")
                .withRenderablePart()
                .build();

        MakarovSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MakarovPMSlide(), "gun.png")
                .withOnWeaponModel(new makarovrearsight(), "gun.png")
                .withOnWeaponModel(new makarovfrontsight(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("MakarovPMSlide")
                .withRenderablePart()
                .build();

        MakarovPBSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MakarovPBSSlide(), "gun.png")
                .withOnWeaponModel(new makarovrearsight(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MakarovPBSlide")
                .withRenderablePart()
                .build();

        MP443Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MP443Slide(), "mp443.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("MP443Slide")
                .withRenderablePart()
                .build();

        MakarovPBBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withRequiredAttachments(Attachments.MakarovPBSlide)
                .withModel(new MakarovPBBody(), "makarovpm.png")
                .withOnWeaponModel(new makarovfrontsight(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MakarovPBBody")
                .withRenderablePart()
                .build();

        MAC10Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new MAC10Body(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MAC10Body")
                .build();

        MAC10Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MAC10Action(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withRequiredAttachments(MAC10Body)
                .withName("MAC10Action")
                .withRenderablePart()
                .build();

        MP5NavyHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5NavyHandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5NavyHandGuard")
                .build();

        MP5A5HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5A5HandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5A5HandGuard")
                .build();

        MP5SDHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5SDHandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP5SDHandGuard")
                .build();

        MP5HOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new MP5HOGUEGrip(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5HOGUEGrip")
                .build();

        GlockHOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new GlockHogueGrip(), "gun2.png")
                .withName("GlockHogueGrip")
                .build();

        // Todo: Why is the recipe commented out
        GlockHOGUEGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new GlockHogueGrip(), "tan.png")
//                .withModernRecipe(
//                    	CraftingGroup.ATTACHMENT_MODIFICATION,
//                    	new CraftingEntry(MwItems.gunmetalIngot, 3))
                .withName("GlockHogueGripTan")
                .build();

        APSGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new APSgrip(), "aps.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(Blocks.PLANKS, 1))
                .withName("APSGrip")
                .build();

        APSStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new APSstock(), "aps.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(Blocks.PLANKS, 1))
                .withName("APSStock")
                .build();

        MAC10Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new MAC10Grip(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MAC10Grip")
                .build();

        MP5Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5Stock(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5Stock")
                .build();

        MP5A3Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5A3RetractableStock(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5A3Stock")
                .build();

        MP5A4Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5A4Stock(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5A4Stock")
                .build();
        // Todo: This one is sus it was actually using the dam thing
        MP5MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5StockAdapter(), "mp5.png")
                .withOnWeaponModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP5StockAdapter")
                .build();

        LVOAVHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new LVOAVHandGuard(), "lvoavhandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("LVOAVHandGuard")
                .build();

        AR15HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AR15FN15Handguard(), "ar15.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AR15FN15Handguard")
                .build();

        M38HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M38HandGuard(), "hk416.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M38HandGuard")
                .build();

        HK416HandGuardBlackAndTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M38HandGuard(), "hk416.png")
                .withOnWeaponModel(new AKRail(), "akrailblackandtan.png")
                .withOnWeaponModel(new AKRail2(), "akrailblackandtan.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("HK416HandGuardBlackAndTan")
                .build();

        HK417Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new HK417Handguard(), "HK417.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withName("HK417Handguard")
                .build();

        HK417HandguardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new HK417Handguard(), "HK417tan.png")
                .withOnWeaponModel(new AKRail(), "guntandarkrail.png")
                .withOnWeaponModel(new AKRail2(), "guntandarkrail.png")
                .withOnWeaponModel(new AKRail3(), "guntandarkrail.png")
                .withOnWeaponModel(new AKRail5(), "guntandarkrail.png")
                .withName("HK417HandguardTan")
                .build();

        Mk18HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Mk18HandGuard(), "mk18handguard.png")
                .withOnWeaponModel(new AKRail(), "mk18rail.png")
                .withOnWeaponModel(new AKRail2(), "mk18rail.png")
                .withOnWeaponModel(new AKRail3(), "mk18rail.png")
                .withOnWeaponModel(new AKRail5(), "mk18rail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("Mk18HandGuard")
                .build();

        Mk18HandGuardBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Mk18HandGuard(), "mk18handguardblack.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("Mk18HandGuardBlack")
                .build();

        Block2SOCOMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Block2SOCOMHandguard(), "block2socomhandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Block2SOCOMHandguard")
                .build();

        FSSTacLiteHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new FSSTacLiteHandguard(), "FSSTacLiteHandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("FSSTacLiteHandguard")
                .build();

        M4MagpulHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4MagpulHandGuard(), "m4magpulhandleguard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4MagpulHandGuard")
                .build();

        M4MagpulHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4MagpulHandGuard(), "m4magpulhandleguardtan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4MagpulHandGuardTan")
                .build();

        M4Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "m4a1.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4Receiver")
                .build();

        HK416Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new HK416Receiver(), "HK416Receiver.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HK416Receiver")
                .build();

        C8SFWReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "C8SFW_gun.png")
                .withOnWeaponModel(new AKRail(), "C8SFW_gun.png")
                .withName("C8SFWReceiver")
                .build();

        VLTORReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new VLTORReceiver(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("VLTORReceiver")
                .build();

        AR57Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AR57Receiver(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("AR57Receiver")
                .build();

        HK417Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new HK417Receiver(), "HK417.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("HK417Receiver")
                .build();

        HK417ReceiverTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new HK417Receiver(), "HK417tan.png")
                .withOnWeaponModel(new AKRail(), "guntanrail.png")
                .withName("HK417ReceiverTan")
                .build();

        M110Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M110Receiver(), "M110.png")
                .withOnWeaponModel(new AKRail(), "akrailm110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M110Receiver")
                .build();

        Z10Receiver = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Z10Receiver")
                .build();

        Beowulf50CalReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Beowulf50CalReceiver(), "beowulf50cal.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Beowulf50CalReceiver")
                .build();

        S710Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new S710Tricun10mmReceiver(), "s710tricun.png")
                .withName("S710Receiver")
                .build();

        CZ805BrenReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new CZ805BrenReceiver(), "CZ805Bren.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CZ805BrenReceiver")
                .build();

        HoneyBadgerReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACHoneyBadgerReceiver(), "AACHoneyBadger.png")
                .withOnWeaponModel(new AKRail(), "aacrail_main.png")
                .withName("HoneyBadgerReceiver")
                .build();

        HoneyBadgerReceiverBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACHoneyBadgerReceiver(), "AACHoneyBadgerBlack.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("HoneyBadgerReceiverBlack")
                .build();

        HoneyBadgerKnightsReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiver.png")
                .withOnWeaponModel(new AKRail(), "aacrail_knights.png")
                .withName("HoneyBadgerKnightsReceiver")
                .build();

        HoneyBadgerKnightsReceiverBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiverblack.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("HoneyBadgerKnightsReceiverBlack")
                .build();

        Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M4Receiver(), "gun.png")
                .withName("Placeholder")
                .build();

        FamasPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4Receiver(), "gun.png")
                .withName("FamasPlaceholder")
                .build();

        APC9Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "gun.png")
                .withName("APC9Placeholder")
                .build();

        P90Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M4Receiver(), "gun.png")
                .withName("P90Placeholder")
                .build();

        PistolPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4Receiver(), "gun.png")
                .withName("PistolPlaceholder")
                .build();

        GripPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M4Receiver(), "gun.png")
                .withName("GripPlaceholder")
                .build();

        M40A6GripPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4Receiver(), "gun.png")
                .withName("M40A6GripPlaceholder")
                .build();

        LaserPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "gun.png")
                .withName("LaserPlaceholder")
                .build();

        M4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4HandGuard(), "m4a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4HandGuard")
                .build();

        AR57Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AR57Handguard(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withRequiredAttachments(AR57Receiver)
                .withName("AR57Handguard")
                .build();

        NTW20HandguardRAIL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new NTW20Guard(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("NTW20Guard")
                .build();

        M16HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M16HandGuard(), "m16a4.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M16HandGuard")
                .build();

        M16A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M16A1Handguard(), "m16a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M16A1Handguard")
                .build();
				
        GeisseleURGIHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new GeisseleURGIHandguard(), "geisseleurgihandguard.png")
                .withOnWeaponModel(new AKRail(), "akrailm110.png")
                .withOnWeaponModel(new AKRail2(), "akrailm110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("GeisseleURGIHandguard")
                .build();

        M4CarbineHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4CarbineHandGuard(), "m4carbinehandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4CarbineHandGuard")
                .build();

        M16A4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M16A4Handguard(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M16A4HandGuard")
                .build();

        M110Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M110Handguard(), "M110.png")
                .withOnWeaponModel(new AKRail(), "akrailm110.png")
                .withOnWeaponModel(new AKRail2(), "akrailm110.png")
                .withOnWeaponModel(new AKRail3(), "akrailm110.png")
                .withOnWeaponModel(new AKRail5(), "akrailm110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M110Handguard")
                .build();

        Z10Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Z10Handguard(), "z10.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Z10Handguard")
                .build();

        AR10SuperSASSHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AR10SuperSASSHandguard(), "gun.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withOnWeaponModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AR10SuperSASSHandguard")
                .build();

        S710Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new S710TricunHandguard(), "s710tricun.png")
                .withName("S710Handguard")
                .build();
        SIGMCXHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new SIGMCXHandguard(), "sigmcx.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SIGMCXHandguard")
                .build();

        SIGMCXHandguardShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new SIGMCXHandguardShort(), "sigmcx.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withOnWeaponModel(new AKRail3(), "akrail.png")
                .withName("SIGMCXHandguardShort")
                .build();

        MPXHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MPXHandguard(), "mpx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MPXHandguard")
                .build();

        MPXHandguardExtended = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MPXHandguardExtended(), "mpx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MPXHandguardExtended")
                .build();

        MPXHandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MPXHandguardRailed(), "mpx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("MPXHandguardRailed")
                .build();

        K2C1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new K2C1Handguard(), "k2c1.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("K2C1Handguard")
                .build();

        HeraArmsGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HeraArmsGrip(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HeraArmsGrip")
                .build();

        M4Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4Grip(), "m4a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4Grip")
                .build();

        M4GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4GripTan(), "m4griptan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4GripTan")
                .build();

        SOCOM_Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new M4Grip(), "socom_grip.png")
                .withName("SOCOM_Grip")
                .build();

        M4GripGray = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4Grip(), "gun2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4GripGray")
                .build();

        HK416Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HKgrip(), "hkgrip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HK416Grip")
                .build();

        HK416GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HKgrip(), "hkgriptan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HK416GripTan")
                .build();

        M110Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M110Grip(), "M110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M110Grip")
                .build();

        S710TricunGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new S710TricunGrip(), "S710Tricun.png")
                .withName("S710TricunGrip")
                .build();

        K2C1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new K2C1Grip(), "k2c1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("K2C1Grip")
                .build();

        AK47Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKGrip(), "ak47.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(Blocks.PLANKS, 1))
                .withName("AK47Grip")
                .build();

        AK101Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AK101Grip(), "AK101Grip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AK101Grip")
                .build();

        AKErgoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKErgoGrip(), "akergogrip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AKErgoGrip")
                .build();

        AKErgoGripGreen = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKErgoGrip(), "ak12grip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AKErgoGripGreen")
                .build();

        AKErgoGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKErgoGrip(), "akergogriptan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AKErgoGripTan")
                .build();

        AK12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AK12Grip(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AK12Grip")
                .build();

        AK12ErgoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AK12ErgoGrip(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AK12ErgoGrip")
                .build();

        HoneyBadgerStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new AACHoneyBadgerStock(), "AACHoneyBadger.png")
                .withName("HoneyBadgerStock")
                .build();

        HoneyBadgerStockBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new AACHoneyBadgerStock(), "AACHoneyBadgerblack.png")
                .withName("HoneyBadgerStockBlack")
                .build();

        G3Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new G3Stock(), "g3.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("G3Stock")
                .build();

        MP7Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MP7Stock(), "mp7.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP7Stock")
                .build();

        // Todo: This one is sus it was actually using the dam thing
        MP7MilSpecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MP7MilSpecStock(), "mp7.png")
                .withOnWeaponModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP7MilSpecStock")
                .build();

        AK47Stock = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.STOCK)
                .withModel(new AK47stock(), "ak47.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Blocks.PLANKS, 2))
//                .withModernRecipe(new ItemStack(MwItems.steelIngot, 8), new
//                		ItemStack(MwItems.carbonComposite, 8), new
//                		ItemStack(MwItems.gunmetalPlate, 12), new
//                		ItemStack(Blocks.PLANKS, 4))
                .withName("AK47stock")
                .build();

        DragunovGripStock = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.STOCK)
                .withModel(new DragunovStock(), "dragunov.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(Blocks.PLANKS, 4))
//                .withModernRecipe(new ItemStack(MwItems.steelIngot, 8), new
//                		ItemStack(MwItems.carbonComposite, 8), new
//                		ItemStack(MwItems.gunmetalPlate, 12), new
//                		ItemStack(Blocks.PLANKS, 4))
                .withName("DragunovGripStock")
                .build();

        Dragunov98Stock = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.STOCK)
                .withModel(new Dragunov98Stock(), "dragunov98.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 6))
//                .withModernRecipe(new ItemStack(MwItems.steelIngot, 8), new
//                		ItemStack(MwItems.carbonComposite, 8), new
//                		ItemStack(MwItems.gunmetalPlate, 12), new
//                		ItemStack(Blocks.PLANKS, 4))
                .withName("Dragunov98Stock")
                .build();

        RPKStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new RPKstock(), "rpkstock.png")
                .withName("RPKstock")
                .build();

        AK101Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK101Stock(), "ak101stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK101Stock")
                .build();

        AK74Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK74Stock(), "AK74Stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK74Stock")
                .build();

        AK12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK12Stock(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK12Stock")
                .build();

        AK12ZenitcoStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK12ZenitcoStock(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK12ZenitcoStock")
                .build();

        VSSVintorezStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new VSSVintorezStock(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Blocks.PLANKS, 2))
                .withName("VSSVintorezStock")
                .build();

        ASValStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ASValStock(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("ASValStock")
                .build();

        // Todo: This one is sus it was actually using the dam thing
        VSSVintorezMilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new VSSVintorezKulaTacStock(), "vssvintorez.png")
                .withOnWeaponModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("VSSVintorezMilspecStock")
                .build();

        CollapsableMOEStock = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withModel(new CollapsableMOEStock(), "CollapsableMOEStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CollapsableMOEStock")
                .build();

        CollapsableMOEStockGreen = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withModel(new CollapsableMOEStock(), "ak12stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CollapsableMOEStockGreen")
                .build();

        MagpulCTRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MagpulCTRStock(), "MagpulCTRStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MagpulCTRStock")
                .build();

        MagpulCTRStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MagpulCTRStock(), "MagpulCTRStocktan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MagpulCTRStockTan")
                .build();

        MilSpecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MilSpecStock")
                .build();

        CZ805BrenStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new CZ805BrenStock(), "CZ805Bren.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CZ805BrenStock")
                .build();

        SIGMCXStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new SIGMCXStock(), "sigMCx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SIGMCXStock")
                .build();

        C8Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new MilSpecStock(), "C8Stock.png")
                .withName("C8Stock")
                .build();

        MilSpecStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MilSpecStock(), "MilSpecStocktan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MilSpecStockTan")
                .build();

        HeraArmsStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new HeraArmsStock(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withRequiredAttachments(HeraArmsGrip)
                .withName("HeraArmsStock")
                .build();

        HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new HK416Stock(), "HK416Stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("HK416Stock")
                .build();

        SOCOM_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new SOCOM_Stock(), "Socom_stock.png")
                .withName("SOCOM_Stock")
                .build();

        M16Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M16Stock(), "m16stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M16Stock")
                .build();

        HK416StockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new HK416Stock(), "HK416Stocktan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("HK416StockTan")
                .build();

        M110Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M110Stock(), "m110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("M110Stock")
                .build();

        PRSPrecisionStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ARPRSPrecisionStock(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("ARPRSPrecisionStock")
                .build();

        AK47HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK47HandleGuard(), "ak47.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Blocks.PLANKS, 2))
                .withName("AK47HandleGuard")
                .build();

        DragunovHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new DragunovHandguard(), "dragunov.png")
                .withOnWeaponModel(new AKMiron2(), "gun.png")
                .withOnWeaponModel(new AK47iron(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(Blocks.PLANKS, 4))
                .withName("DragunovHandguard")
                .build();

        Dragunov98Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Dragunov98Handguard(), "dragunov98.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 6),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Dragunov98Handguard")
                .build();

        AK101HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK101HandGuard(), "ak101handguard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK101HandGuard")
                .build();

        AK74Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK74Handguard(), "AK74Handguard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK74Handguard")
                .build();

        AKMagpulHandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MagpulHandleGuard(), "MagpulHandleGuard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AKMagpulHandleGuard")
                .build();

        AKMagpulHandleGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MagpulHandleGuard(), "MagpulHandleGuardTan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AKMagpulHandleGuardTan")
                .build();

        MLOKHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MLOKHandguard(), "mlokhandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MLOKHandguard")
                .build();

        MLOKExtendedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MLOKExtendedHandguard(), "MLOKExtendedHandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withOnWeaponModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withName("MLOKExtendedHandguard")
                .build();

        AK15HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK15HandleGuard(), "AK15HandleGuard.png")
                .withOnWeaponModel(new AKRail(), "AKRailgrey.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK15HandleGuard")
                .build();

        AK12kalHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK15HandleGuard(), "ak12handguard.png")
                .withOnWeaponModel(new AKRail(), "AKRailgrey.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12kalHandguard")
                .build();

        RPK16Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new RPK16handguard(), "rpk16handguard.png")
                .withOnWeaponModel(new AKRail(), "akrailgrey.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("RPK16handguard")
                .build();

        AK12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK12Handguard(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12Handguard")
                .build();

        AK12BHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK12BHandguard(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12BHandguard")
                .build();

        KBP9A91Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KBP9A91Handguard(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KBP9A91Handguard")
                .build();

        KBP9A91CompactHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KBP9A91CompactHandguard(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KBP9A91CompactHandguard")
                .build();

        KBP9A91KulaTacHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KBP9A91KulaTacHandguard(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KBP9A91KulaTacHandguard")
                .build();

        VSSVintorezHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new VSSVintorezHandguard(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Blocks.PLANKS, 3))
                .withName("VSSVintorezHandguard")
                .build();

        ASValHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ASValHandguard(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ASValHandguard")
                .build();

        VSSVintorezTriRailMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new VSSVintorezTriRailMount(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("VSSVintorezTriRailMount")
                .build();

        AK47DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK47DustCover(), "ak47.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK47Dustcover")
                .build();

        DragunovDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new DragunovDustCover(), "dragunov.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withName("DragunovDustCover")
                .build();

        Dragunov98DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new Dragunov98(), "dragunov98.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withName("Dragunov98DustCover")
                .build();

        AKMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AKMDustCover(), "AKMDustCover.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AKMDustcover")
                .build();

        AK101DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK101DustCover(), "ak101dustcover.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK101DustCover")
                .build();

        VeprDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new VeprDustCover(), "veprdustcover.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("VeprDustCover")
                .build();

        AK15DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK15DustCover(), "ak15dustcover.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK15DustCover")
                .build();

        AK12DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK12DustCover(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12DustCover")
                .build();

        AK12BDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK12BDustCover(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12BDustCover")
                .build();

        VSSVintorezDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new VSSVintorezDustCover(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("VSSVintorezDustCover")
                .build();

        VSSMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new VSSVintorezVSSMDustCover(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("VSSMDustCover")
                .build();

        FNFALDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new FNFALDustCover(), "fnfal.png")
                .withName("FNFALDustCover")
                .build();

        SA58DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new SA58DustCover(), "SA58DustCover.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("SA58DustCover")
                .build();

        FNFALGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new FNFALGrip(), "fnfal.png")
                .withName("FNFALGrip")
                .build();

        FNFALStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new FNFALStock(), "fnfal.png")
                .withName("FNFALStock")
                .build();

        FNFALHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new FNFALHandguard(), "fnfal.png")
                .withName("FNFALHandguard")
                .build();

        FNFALPARAHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new FNFALPARAHandguard(), "fnfalparahandguard.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("FNFALPARAHandguard")
                .build();

        M4FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M4Iron2(), "gun.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(M4HandGuard, M4CarbineHandGuard, M4MagpulHandGuard,
                        M4MagpulHandGuardTan, M16HandGuard, Mk18HandGuard, M16A4HandGuard, Block2SOCOMHandguard,
                        Mk18HandGuardBlack)
                .withName("M4FrontSight")
                .build();

        M60FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M60FrontSight(), "gun.png")
                .withName("M60FrontSight")
                .build();

        M38FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AK47iron(), "gun.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withOnWeaponModel(new AKMiron2(), "gun.png")
                .withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard,
                        StonerHANDGUARD, AR57Handguard, HK417Handguard, HK417HandguardTan,
                        HK416HandGuardBlackAndTan)
                .withName("M38FrontSight")
                .build();

        HK416FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new G95_upright_frontsights(), "gun.png")
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
                .withName("HK416FrontSight")
                .build();

        MBUSFrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MBUSFrontSight(), "gun.png")
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
                .withName("MBUSFrontSight")
                .build();

        LeupoldScope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.06F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(2.3F, 2.3F, 2.3F);
                    GL11.glTranslatef(-0.085F, 0.33F, 1.75F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, G2ContenderBarrelLong,
                        HK417Receiver, HK417ReceiverTan, B51ScopeMountRail)
                .withCrosshair("LP")
                .withModel(new Leupold(), "leupold.png")
                .withOnWeaponModel(new JPUreticle(), "black.png")
                .withName("Leupold")
                .build();

        PSO1 = new ItemScope.Builder()
                .withSniperReticle(Reticles.RETICLE_PSO1)
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.06F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.15F, 1.15F, 1.1F);
                    GL11.glTranslatef(-0.299F, 0.215F, 1.15F);
                }).withCategory(AttachmentCategory.SCOPE)
                .withCrosshair("LP")
                .withModel(new PSO1(), "pso1.png")
                .withOnWeaponModel(new PSO12(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 5))
                .withName("PSO1")
                .build();

        OKP7 = new ItemScope.Builder()
                .withHolographicReticles(Reticles.OKP)
                .withRadialCut(0.1F)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.23F, -4.4F, -0.2F);
                    GlStateManager.scale(2.05F, 2.05F, 2.05F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new OKP7(), "okp7.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 3))
//                .withOnWeaponModel(new OKP7reticle(), "green.png")
                .withName("okp7")
                .build();

        FMG9Sight = new ItemScope.Builder()
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new FMG9Carryhandle(), "fmg9.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("fmg9carryhandle")
                .build();

        Reflex = new ItemScope.Builder()
                .withHolographicReticles(Reticles.REFLEX)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(-0.08F, -3, 0);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new Reflex(), "Reflex.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
//                .withOnWeaponModel(new Reflex2(), "Reflex2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount,B51ScopeMountRail,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver,
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withName("Reflex")
                .build();

        BijiaReflex = new ItemScope.Builder()
                .withHolographicReticles(Reticles.BIJIA)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(-0.08, -2.95, 0.1F);
                    GlStateManager.scale(1.4, 1.4, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new BijiaReflex(), "bijiareflex.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, FABDefenseMount,
                        Placeholder, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, DesertEagleSlide, DesertEagleSlideBlack, DesertEagleSlideGolden, M1CarbineScoutHandguard,
			Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount, B51ScopeMountRail,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver,
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withName("BijiaReflex")
                .build();

        MicroReflex = new ItemScope.Builder()
                .withHolographicReticles(Reticles.MICRO_REFLEX)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.13F, -1.62F, -0.1F);
                    GlStateManager.scale(1.6F, 1.6F, 1.6F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new MicroReflexSight(), "gun.png")
                .withOnWeaponModel(new SightMount(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0, 2.3F, 1.8F);
                    // GL11.glRotatef(30, 0, 1, 0);
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
                        MAS21Mount, Beowulf50CalReceiver, FamasF1ScopeMount, B51ScopeMountRail,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver,
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withName("MicroReflex")
                .build();

        // Todo: This one is sus it was actually using the dam thing but the thing it was using it for was commented out :shrug:
        ACOG = new ItemScope.Builder()
                .withSniperReticle(Reticles.RETICLE_ACOG)
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.1F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.52F, 1.52F, 1.52F);
                    GL11.glTranslatef(0.038F, 0.485F, 0.37F);
                })
                .withRenderablePart()
                .withModel(new ACOG(), "Acog.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
//                .withOnWeaponModel(new AcogScope2(), "gun.png")
//                .withOnWeaponModel(new AcogReticle(), "acogreticle.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder,
                        AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong,
                        S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount, B51ScopeMountRail,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, Origin12Grip,
                        HKS20Grip, FABDefenseMount, MAC21Stock, VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withName("Acog")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build();

        Specter = new ItemScope.Builder()
                .withSniperReticle(Reticles.RETICLE_SPECTRE)
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.1F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(3.7F, 3.7F, 3.7F);
                    GL11.glTranslatef(-0.075f, 0.38f, 0.42f);
                })
                .withRenderablePart()
                .withModel(new SpecterSight(), "SpecterSight.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
//                .withModel(new Acog2(), "Acog2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail,
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder,
                        AUGA2handguard, AUGA3handguard, B51ScopeMountRail,
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
                .withName("Specter")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build();

        Holographic = new ItemScope.Builder()
                .withHolographicReticles(Reticles.HOLO_ONE)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(-0.1F, -2.7F, 0.3F);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new Holographic2(), "Holographic2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
//                .withModel(new Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver,
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withName("Holographic2")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build();

        HolographicAlt = new ItemScope.Builder()
                .withHolographicReticles(Reticles.HOLO_ONE)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(-0.1F, -2.7F, 0.3F);
                    GlStateManager.scale(1.4F, 1.4F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new Holographic(), "holographic.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
//                .withModel(new Holo2(), "Holo3.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail,
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder,
                        AUGA2handguard, AUGA3handguard, B51ScopeMountRail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withName("HolographicAlt")
                .build();

        EotechHybrid2 = new ItemScope.Builder()
                .withSniperReticle(Reticles.HOLO_HYBRID)
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.1F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.41F, 1.41F, 1.35F);
                    GL11.glTranslatef(-0.204F, 0.28F, 1.35F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new EotechHybrid2(), "eotechhybrid.png")
                .withOnWeaponModel(new EotechScopeRing(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail,
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver,
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withName("EotechHybrid2")
                .build();

        VortexRedux = new ItemScope.Builder()
                .withHolographicReticles(Reticles.VORTEX)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.45F, -3.15F, 0.5F);
                    GlStateManager.scale(1.73F, 1.73F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new VortexSight(), "vortexsight.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody,
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver,
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover)
                .withName("VortexSight")
                .build();

        MicroT1 = new ItemScope.Builder()
                .withHolographicReticles(Reticles.REFLEX)
                .withRadialCut(0.1F)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.3F, -6, -0.2F);
                    GlStateManager.scale(3.5F, 3.5F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new MicroT1(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver,
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover)
                .withName("MicroT1")
                .build();

        AimpointCompM2 = new ItemScope.Builder()
                .withHolographicReticles(Reticles.REFLEX)
                .withRadialCut(0.1F)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.06F, -3.8F, -0.4F);
                    GlStateManager.scale(1.8F, 1.8F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new AimpointCompM2(), "AimpointCompM2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver,
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover)
                .withName("AimpointCompM2")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build();

        AimpointCompM5 = new ItemScope.Builder()
                .withHolographicReticles(Reticles.REFLEX)
                .withRadialCut(0.1F)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.3F, -6, -0.2F);
                    GlStateManager.scale(3.5F, 3.5F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new AimpointCompM5(), "aimpointcompm5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver,
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover)
                .withName("AimpointCompM5")
                .build();

        RMR = new ItemScope.Builder()
                .withHolographicReticles(Reticles.RMR)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.22F, -2.75F, -0.53F);
                    GlStateManager.scale(1.7F, 1.6F, 1.6F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new RMRsight(), "rmrsight.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 2))
//                .withModel(new Reflex2(), "Reflex2.png")
                .withRequiredAttachments(FABDefenseMount, VeprDustCover, AK15DustCover,
                        Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, DesertEagleSlide, DesertEagleSlideBlack, DesertEagleSlideGolden, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, MAS21Mount, APC9Placeholder,
                        MAC21Stock, VSSMDustCover, Dragunov98DustCover)
                .withName("RMRsight")
                .build();

        LeupoldDeltapointPro = new ItemScope.Builder()
                .withHolographicReticles(Reticles.REFLEX)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.22F, -2.75F, -0.53F);
                    GlStateManager.scale(3.0F, 2.6F, 1.6F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new DeltapointPro(), "leulpolddeltapointpro.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(FABDefenseMount, VeprDustCover, AK15DustCover,
                        Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, DesertEagleSlide, DesertEagleSlideBlack, DesertEagleSlideGolden, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, MAS21Mount, APC9Placeholder,
                        MAC21Stock, VSSMDustCover, Dragunov98DustCover)
                .withName("LeupoldDeltapointPro")
                .build();

        Kobra = new ItemScope.Builder()
                .withHolographicReticles(Reticles.KOBRA)
                .withRadialCut(0.1F)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(-0.05F, -3.35F, -0.8F);
                    GlStateManager.scale(1.8F, 1.8F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new Kobra(), "gunmetaltexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL
                        , Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis,
                        SA58DustCover, M16A1ScopeMount, UMP45Receiver, UMP9Receiver,
                        G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withRenderablePart()
                .withName("Kobra")
                .build();

        KobraGen3 = new ItemScope.Builder()
                .withHolographicReticles(Reticles.KOBRA)
                .withRadialCut(0.1F)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(-0.05F, -3.35F, -0.9F);
                    GlStateManager.scale(1.8F, 1.8F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new KobraGen3(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody,
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, UMP45Receiver,
                        UMP9Receiver, G2ContenderBarrelLong, S710Receiver, Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail)
                .withRenderablePart()
                .withName("KobraGen3")
                .build();

        KobraMount = new ItemScope.Builder()
                .withHolographicReticles(Reticles.KOBRA)
                .withRadialCut(0.1F)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(-0.05F, -3.35F, -0.8);
                    GlStateManager.scale(1.8F, 1.8F, 1.4F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new KobraMount(), "kobramount.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRenderablePart()
                .withName("KobraMount")
                .build();

        HP = new ItemScope.Builder()
//                .withNightVision()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.02F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.65F, 1.65F, 1.65F);
                    GL11.glTranslatef(0.0285F, 0.492F, 0.7F);
                }).withCrosshair("HP")
                .withModel(new HP(), "gun.png")
                .withOnWeaponModel(new JPUreticle(), "black.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL)
                .withName("HPScope")
                .build();

        LeupoldRailScope = new ItemScope.Builder()
                .withSniperReticle(Reticles.RETICLE)
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.06F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(2.9F, 2.9F, 2.9F);
                    GL11.glTranslatef(-0.09F, 0.405F, 1.43F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14Rail,
                        SSG08Chassis, SA58DustCover, M16A1ScopeMount, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount, B51ScopeMountRail,
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
                .withModel(new LeupoldRail(), "leupold.png")
//                .withOnWeaponModel(new JPUreticle(), "black.png")
                .withName("LeupoldRailScope")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build();
				
        PMII525x56P4FLScope = new ItemScope.Builder()
                .withSniperReticle(Reticles.RETICLE)
                .withOpticalZoom()
                .withZoomRange(0.23F, 0.07F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(2.7F, 2.7F, 2.7F);
                    GL11.glTranslatef(-0.09F, 0.6F, 0.50F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRequiredAttachments(Placeholder, Kar98Krail,
                        M4Receiver, VLTORReceiver, NTW20HandguardRAIL,
                        M14Rail,
                        SSG08Chassis, G2ContenderBarrelLong,
                        Beowulf50CalReceiver,
                        HK417Receiver, HK417ReceiverTan, B51ScopeMountRail,
                        HK416Receiver, M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver,
                        VSSMDustCover, Dragunov98DustCover)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 7),
                        new CraftingEntry(MWCItems.steelIngot, 6))
                .withCrosshair("LP")
                .withRenderablePart()
                .withModel(new PMII525x56P4FLScope(), "s&bpmii525x56.png")
                .withName("S&BPMII5-25x56P4FLScope")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build();

        NightRaider = new ItemScope.Builder()
                .withNightVision()
                .withOpticalZoom()
                .withSniperReticle(Reticles.RETICLE_NIGHT_RAIDER)
                .withZoomRange(0.22F, 0.02F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.6F, 1.6F, 1.6F);
                    GL11.glTranslatef(-0.045F, 0.495F, 1.551F);
                })
                .withRenderablePart().withCrosshair("HP")
                .withModel(new NightRaiderScope(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 6),
                        new CraftingEntry(MWCItems.steelIngot, 5))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail,
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, M14Rail, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, CZ805BrenReceiver, HK416Receiver, M110Receiver, ScarLReceiver,
                        Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover)
                .withName("NightRaiderScope")
                .build();

        M2A1sight = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.2F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.54F, 1.54F, 1.54F);
                    GL11.glTranslatef(-0.09F, -0.265F, -0.7F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new M2A1(), "gun.png")
                .withOnWeaponModel(new M2A1reticle(), "red.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail)
                .withName("m2a1_sight")
                .build();

        F2000Scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.02F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(0.54F, 0.56F, 0.55F);
                    GL11.glTranslatef(-0.125F, -0.923F, 1.621F);
//                    GL11.glRotatef(30, 1, 0, 0);
                }).withCrosshair("HP")
                .withModel(new F2000Scope(), "f2000.png")
                .withOnWeaponModel(new F2000Scope2(), "gun.png")
                .withOnWeaponModel(new F2000Reticle(), "black.png")
                .withName("F2000Scope")
                .build();

        M202scope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.02F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.7F, 1.7F, 1.7F);
                    GL11.glTranslatef(0.375F, 0.185F, 0.34F);
//                    GL11.glRotatef(30, 1, 0, 0);
                })
                .withCrosshair("HP")
                .withModel(new JPUreticle(), "black.png")
                .withName("M202scope")
                .build();

        AUGscope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.02F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.05F, 1.05F, 1.05F);
                    GL11.glTranslatef(-0.23F, -0.77F, 0.65F);
                })
                .withCrosshair("HP")
                .withModel(new AUGScope_scope(), "gun.png")
                .withOnWeaponModel(new JPUreticle(), "black.png")
                .withOnWeaponModel(new AUGScope(), "gun.png")
                .withRequiredAttachments(AUGA1handguard)
                .withName("AUGscope")
                .build();

        Silencer556x45 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x45(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer556x45")
                .build();

        Silencer545x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer545x39")
                .build();

        Silencer762x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor762x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer762x39")
                .build();

        M32Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Suppressor(), "gun.png")
                .withName("M32Barrel")
                .build();

        Remington870Pump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870Pump(), "remington870.png")
                .withName("Remington870Pump")
                .build();

        Remington870MagpulPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870MagpulPump(), "remington870.png")
                .withName("Remington870MagpulPump")
                .build();

        Remington870PoliceMagnumPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870PoliceMagnumPump(), "remington870.png")
                .withName("Remington870PoliceMagnumPump")
                .build();

        Remington870FABDefensePump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870FABDefensePump(), "remington870.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withName("Remington870FABDefensePump")
                .build();

        Remington870Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870Stock(), "remington870.png")
                .withName("Remington870Stock")
                .build();

        Remington870PoliceMagnumStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870PoliceMagnumStock(), "remington870.png")
                .withName("Remington870PoliceMagnumStock")
                .build();

        // Todo: This one is sus it was actually using the dam thing
        Remington870MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870PoliceMagnumStock(), "remington870.png")
                .withOnWeaponModel(new MilSpecStock(), "gun.png")
                .withName("Remington870MilSpecStock")
                .build();

        Remington870HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870PoliceMagnumStock(), "remington870.png")
                .withOnWeaponModel(new HK416Stock(), "gun.png")
                .withName("Remington870HK416StockStock")
                .build();

        Remington870SawedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870SawedGrip(), "remington870.png")
                .withName("Remington870SawedGrip")
                .build();

        Remington870Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Remington870Barrel(), "remington870.png")
                .withOnWeaponModel(new R870part(), "gun.png")
                .withName("Remington870Barrel")
                .build();

        Remington870PoliceMagnumBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Remington870PoliceMagnumBarrel(), "remington870.png")
                .withOnWeaponModel(new M9A1frontsight(), "gun.png")
                .withName("Remington870PoliceMagnumBarrel")
                .build();

        Remington870SawedOffBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Remington870SawedBarrel(), "remington870.png")
                .withOnWeaponModel(new M9A1frontsight(), "gun.png")
                .withName("Remington870SawedBarrel")
                .build();

        KS23Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KS23Stock(), "ks23.png")
                .withName("KS23Stock")
                .build();

        KS23RaptorGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KS23RaptorGrip(), "ks23.png")
                .withName("KS23RaptorGrip")
                .build();

        KS23MStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KS23Mstock(), "ks23.png")
                .withName("KS23MStock")
                .build();

        KS23Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new KS23Barrel(), "ks23.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withName("KS23Barrel")
                .build();

        KS23ExtendedBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new KS23ExtendedBarrel(), "ks23.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withName("KS23ExtendedBarrel")
                .build();

        RPKBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new RPKbarrel(), "gun.png")
                .withOnWeaponModel(new AKiron3(), "gun")
                .withOnWeaponModel(new AKMiron2(), "gun")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("RPKbarrel")
                .build();

        AKIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AKiron3(), "gun")
                .withOnWeaponModel(new AKMiron2(), "gun")
                .withName("AKIron")
                .build();

        AK12Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new AKiron3(), "gun")
                .withOnWeaponModel(new AKMiron2(), "gun")
                .withName("AK12Iron")
                .build();

        SilencerPBS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withRequiredAttachments(MakarovPBBody)
                .withModel(new MakarovPBSSilencer(), "MakarovPBSSilencer.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SilencerPBS")
                .build();

        Silencer9mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withRequiredAttachments(M9A1Body, ScorpionHandguardShort, ScorpionHandguardLong, Glock19Body, Glock19XBody,
                        Glock19RazorbackBody, P226Slide, APC9Placeholder, MP443Slide, MP5NavyHandGuard,
                        MP5A5HandGuard, MP5SDHandGuard, MIMP5MHandGuard, UTGTriRailHandGuard, MP5BMHandguard, SCCYCPX2Body, SCCYCPX2BodyTan)
                .withModel(new Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer9mm")
                .build();

        SamuraiEdgeSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withRequiredAttachments(SamuraiEdgeMount)
                .withModel(new SamuraiEdgeSuppressor(), "samuraiedge.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SamuraiEdgeSuppressor")
                .build();

        Silencer9x39mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer9x39mm")
                .build();

        SuppressorKBP9A91 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new KBP9A91Suppressor(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("KBP9A91Suppressor")
                .build();

        Silencer45ACP = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withRequiredAttachments(KrissVectorReceiver, M1911Slide, M45A1CQBPSlide)
                .withModel(new Suppressor45ACP(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer45ACP")
                .build();

        SilencerEABH = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor45ACP(), "gun.png")
                .withName("silencer_eabh")
                .build();

        Silencer762x54 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Silencer762x54")
                .build();

        Silencer762x51 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor762x51(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Silencer762x51")
                .build();

        Silencer50BMG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new QDLSuppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Silencer50BMG")
                .build();


        Silencer556x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer556x39")
                .build();


        AKMIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withModel(new M27rearsight(), "gun.png")
                .withOnWeaponModel(new AKMiron1(), "gun.png")
                .withOnWeaponModel(new AKMiron2(), "gun.png")
                .withOnWeaponModel(new AK47iron(), "gun.png")
                .withOnWeaponModel(new M4Iron1(), "gun.png")
                .withOnWeaponModel(new M4Iron2(), "gun.png")
                .withOnWeaponModel(new P90iron(), "gun.png")
                .withOnWeaponModel(new G36CIron1(), "gun.png")
                .withOnWeaponModel(new G36CIron2(), "gun.png")
                .withOnWeaponModel(new ScarIron1(), "gun.png")
                .withOnWeaponModel(new ScarIron2(), "gun.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withOnWeaponModel(new M14Iron(), "gun.png")
                .withOnWeaponModel(new MP5Iron(), "gun.png")
                .withOnWeaponModel(new MP5Iron(), "gun.png")
                .withOnWeaponModel(new MBUSiron(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver,
                        VLTORReceiver, AR57Receiver, Attachments.EF88Handguard,
                        KrissVectorReceiver, Vector556Handguard, Origin12Grip, HKS20Grip,
                        ScarLReceiver)
                .withName("AKMIron")
                .build();

        TritiumRearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new TritiumRearSights(), "gun.png")
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
                .withName("TritiumRearSights")
                .build();

        MBUSRearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
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
                .withName("MBUSRearSights")
                .build();

        HK416RearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new G95_upright_rearsights(), "gun.png")
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
                .withName("HK416RearSights")
                .build();

        FNFALRearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new FNFALRearSight(), "gun.png")
                .withName("FNFALRearSights")
                .build();

        M16A1RearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                .withModel(new M16A1RearSight(), "gun.png")
                .withName("M16A1RearSight")
                .build();

        K2C1RearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new K2C1RearSight(), "gun.png")
                .withOnWeaponModel(new ScarIron2(), "gun.png")
                .withOnWeaponModel(new FALIron(), "gun.png")
                .withName("K2C1RearSight")
                .build();

        ScorpionRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new ScorpionRearSight(), "gun.png")
                .withName("ScorpionRearSight")
                .build();

        ScorpionFrontSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new ScorpionFrontSight(), "gun.png")
                .withName("ScorpionFrontSight")
                .build();

        MP7IronSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new MP7RearSights(), "MP7IronSights.png")
                .withOnWeaponModel(new MP7FrontSights(), "MP7IronSights.png")


                .withName("MP7IronSights")
                .withRenderablePart()
                .build();

        MP7IronSightsStanding = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new MP7RearSightFlipped(), "MP7IronSights.png")
                .withOnWeaponModel(new MP7FrontSightFlipped(), "MP7IronSights.png")


                .withName("MP7IronSightsStanding")
                .withRenderablePart()
                .build();

        Kar98Ksight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK47iron(), "gun.png")
                .withName("Kar98Ksight")
                .build();

        AK15ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new KA_AK12_Ironsight(), "gun.png")
                .withOnWeaponModel(new AKMiron2(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder)
                .withName("AK15ironsight")
                .withRenderablePart()
                .build();

        AK12ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AK15ironsight(), "gun.png")
                .withOnWeaponModel(new AKMiron2(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder)
                .withName("AK12ironsight")
                .withRenderablePart()
                .build();

        SilencerMP7 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SilencerMP7")
                .build();

        Silencer357 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "GunmetalTexture.png")
                .withName("Silencer357")
                .build();

        Silencer57x38 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer57x38")
                .build();


        Silencer12Gauge = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor45ACP(), "GunmetalTexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Silencer12Gauge")
                .build();


        Silencer300AACBlackout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor300AACBlackout(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer300AACBlackout")
                .build();

        HoneyBadgerSilencer = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new AACHoneyBadgerSilencer(), "gun.png")
                .withName("HoneyBadgerSilencer")
                .build();

        Silencer65x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer65x39")
                .build();

        Laser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
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
                .withModel(new Laser(), "gun.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30, 0, 1, 0);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withRenderablePart()
                .withName("Laser")
                .build();

        Laser2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withModel(new Laser3(), "laser2.png")
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
                    // GL11.glRotatef(30, 0, 1, 0);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withRenderablePart()
                .withName("Laser2")
                .build();

        SCCYCPX2Laser = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.LASER)
                .withModel(new SCCYCPX2Laser(), "sccycpx2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.62F, 0.82F, 0.5F);
                    // GL11.glRotatef(30, 0, 1, 0);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withRenderablePart()
                .withName("SCCYCPX2Laser")
                .build();

        DanWessonLaser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withModel(new DanWessonLaser(), "DanWessonLaser.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30, 0, 1, 0);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withRenderablePart()
                .withName("DanWessonLaser")
                .build();

        M1928Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new M1928Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("M1928Grip")
                .build();

        M1A1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new M1A1Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 1);
                })
                .withName("M1A1Grip")
                .build();

        Grip2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new Grip2(), "grip2.png")
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
                        FamasF1PicatinnyRail, UziMLOKHandguard,
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("Grip2")
                .build();
				

        Grip2Tan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new Grip2(), "grip2tan.png")
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
                        FamasF1PicatinnyRail, UziMLOKHandguard,
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("Grip2Tan")
                .build();

        JunoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new JunoGrip(), "junogrip.png")
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("JunoGrip")
                .build();

        JunoGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new JunoGrip(), "junogriptan.png")
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("JunoGripTan")
                .build();
				
        GlockStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new Glock18Cstock(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                })
                .withName("Glock18Cstock")
                .build();

        VP70Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new VP70stock(), "vp70.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("VP70Stock")
                .build();

        AngledGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new AngledGrip(), "angledgrip.png")
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("AngledGrip")
                .build();

        AngledGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new AngledGrip(), "angledgriptan.png")
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("AngledGripTan")
                .build();


        StubbyGrip = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.GRIP)
                .withModel(new StubbyGrip(), "stubbygrip.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard,
                        AR57Handguard, RPK16Handguard, StonerHANDGUARD, KrissVectorReceiver,
                        Vector556Handguard, Remington870FABDefensePump,
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuardTan,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody,
                        FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                        FamasF1PicatinnyRail, UziMLOKHandguard, B50PKMHandguard, B50PKPHandguard,
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                // .withApply((a, weapons, player) ->
                // weapons.changeRecoil(player, 1.3F);
                // })
                // .withRemove((attachment, weapons, player) -> {
                // weapons.changeRecoil(player, 1);
                // })
                .withName("StubbyGrip")
                .build();
				
        StubbyGripTan = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.GRIP)
                .withModel(new StubbyGrip(), "stubbygriptan.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard, M60E4HandGuard, P90Swordfish, AUGA3extGuard,
                        AR57Handguard, RPK16Handguard, StonerHANDGUARD, KrissVectorReceiver,
                        Vector556Handguard, Remington870FABDefensePump,
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack, ACRWEMSKHandGuardTan,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody, Mk14BlackBody,
                        FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                        FamasF1PicatinnyRail, UziMLOKHandguard, B50PKMHandguard, B50PKPHandguard,
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("StubbyGripTan")
                .build();

        VGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new VGrip(), "vgrip.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard,
                        M60E4HandGuard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD,
                        KrissVectorReceiver, Vector556Handguard, Remington870FABDefensePump,
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack,
                        ACRWEMSKHandGuardTan, B50PKMHandguard, B50PKPHandguard,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody,
                        Mk14BlackBody, FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                        FamasF1PicatinnyRail, UziMLOKHandguard,
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("VGrip")
                .build();

        VGripTan = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new VGrip(), "vgriptan.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard,
                        M60E4HandGuard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD,
                        KrissVectorReceiver, Vector556Handguard, Remington870FABDefensePump,
                        Origin12Handguard, HKS20Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack,
                        ACRWEMSKHandGuardTan, B50PKMHandguard, B50PKPHandguard,
                        HoneyBadgerMatrixArmsHandguard, Mk14TanBody, Mk14SnowBody,
                        Mk14BlackBody, FNFALPARAHandguard, M16A1PicatinnyRail, K2C1Handguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis,
                        FamasF1PicatinnyRail, UziMLOKHandguard,
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
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("VGripTan")
                .build();

        Bipod = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP).withModel(new Bipod(), "bipod.png")
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
                        MPXHandguardRailed, MPXHandguardExtended, B50PKMHandguard, B50PKPHandguard,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                })
                .withName("Bipod")
                .build();

        AUGgrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new AUGGrip(), "aug.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("AUGgrip")
                .build();

        PechenegBipod = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new PechenegBipod(), "pkm.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("PechenegBipod")
                .build();

        USPMatchCompensator = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new USPMatchCompensator(), "gun.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                })
                .withRenderablePart()
                .withName("USPMatchCompensator")
                .build();

       UziWoodStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UziWoodStock(), "uzi.png")
                .withModernRecipe(
                       CraftingGroup.ATTACHMENT_MODIFICATION,
                       new CraftingEntry(MWCItems.gunmetalIngot, 1),
                       new CraftingEntry(Blocks.PLANKS, 4))
                .withName("UziWoodStock")
                .build();

        UziFoldingStockOpened = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UziFoldingStockOpened(), "uzi.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("UziFoldingStockOpened")
                .build();

        UziFoldingStockClosed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UziFoldingStockClosed(), "uzi.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("UziFoldingStockClosed")
                .build();

        UziMLOKHandguard =  new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new UziMLOKHandguard(), "uzi.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("UziMLOKHandguard")
                .build();

        UziSightRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new UziSightRail(), "uzi.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("UziSightRail")
                .build();
		
        InterventionCarryHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new InterventionCarryHandle(), "intervention.png")
				.withRequiredAttachments(InterventionQTDRifleHandguard, InterventionHandguard)
                .withName("InterventionCarryHandle")
                .build();

        InterventionKeystoneHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new InterventionKeystoneHandle(), "intervention.png")
				.withRequiredAttachments(InterventionRailSystemHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("InterventionKeystoneHandle")
                .build();

        InterventionHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new InterventionHandguard(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("InterventionHandguard")
                .build();

        InterventionQTDRifleHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new InterventionQTDRifleHandguard(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("InterventionQTDRifleHandguard")
                .build();

        InterventionRailSystemHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new InterventionRailSystemHandguard(), "intervention.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("InterventionRailSystemHandguard")
                .build();

        InterventionStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new InterventionStock(), "intervention.png")
                .withName("InterventionStock")
                .build();

        InterventionFJXLUX7Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new InterventionFJXLUX7Stock(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("InterventionFJXLUX7Stock")
                .build();

        InterventionKiloTaCStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new InterventionKiloTaCStock(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("InterventionKiloTaCStock")
                .build();
		
        Saiga12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Saiga12Handguard(), "gunmetaltexture.png")
                .withName("Saiga12Handguard")
                .build();
				
        Saiga12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Saiga12Stock(), "gunmetaltexture.png")
                .withName("Saiga12Stock")
                .build();
				
        Saiga12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Saiga12Grip(), "gunmetaltexture.png")
                .withName("Saiga12Grip")
                .withRenderablePart()
                .build();
				
        G36CHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G36CHandguard(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36CHandguard")
                .build();
				
        G36KHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G36KHandguard(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36KHandguard")
                .build();
				
        G36CStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new G36CStock(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36CStock")
                .build();
				
        G36KVStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new G36KVStock(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36KVStock")
                .build();
				
        G36CMGStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new G36CMGStock(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36CMGStock")
                .build();

        PKMBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new PKMBarrel(), "pkm.png")
                .withOnWeaponModel(new PKMfrontsight(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("PKMBarrel")
                .build();

        PechenegBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new PechenegBarrel(), "pkm.png")
                .withOnWeaponModel(new PKMfrontsight(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("PechenegBarrel")
                .build();

        PKMGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new PKMGrip(), "pkm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("PKMGrip")
                .build();

        RK3PGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new RK3PGrip(), "pkm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("RK3PGrip")
                .build();

        PKMStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new PKMStock(), "pkm.png")
                .withRenderablePart()
                .withName("PKMStock")
                .build();

        PT2Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new PT2Stock(), "pkm.png")
                .withRenderablePart()
                .withName("PT2Stock")
                .build();

        B51ScopeMountRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new B51ScopeMountRail(), "pkm.png")
                .withOnWeaponModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("B51ScopeMountRail")
                .build();

        B50PKPHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new B50PKPHandguard(), "gun.png")
                .withRequiredAttachments(PechenegBarrel)
                .withName("B50PKMHandguard")
                .build();

        B50PKMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new B50PKMHandguard(), "gun.png")
                .withRequiredAttachments(PKMBarrel)
                .withName("B50PKPHandguard")
                .build();
    }
}