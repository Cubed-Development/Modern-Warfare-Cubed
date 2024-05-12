package com.paneedah.mwc.weapons;

import com.paneedah.mwc.MWC;
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

    public static ItemAttachment<Weapon> F2000Handguard;
    public static ItemAttachment<Weapon> F2000TRHandguard;
    public static ItemAttachment<Weapon> F2000Scope;
    public static ItemAttachment<Weapon> F2000RearSight;
    public static ItemAttachment<Weapon> F2000FrontSight;

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
    public static ItemAttachment<Weapon> M60MK43Handguard;

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
    public static ItemAttachment<Weapon> M60Mk43Rail;
    public static ItemAttachment<Weapon> M16A1ScopeMount;
    public static ItemAttachment<Weapon> FamasF1ScopeMount;
    public static ItemAttachment<Weapon> M16A1PicatinnyRail;
    public static ItemAttachment<Weapon> FamasF1PicatinnyRail;
    public static ItemAttachment<Weapon> NGSWRRail;
    public static ItemAttachment<Weapon> RailRiser;
    public static ItemAttachment<Weapon> M1911Slide;
    public static ItemAttachment<Weapon> M1911Body;
    public static ItemAttachment<Weapon> M45A1CQBPBody;
    public static ItemAttachment<Weapon> M45A1CQBPSlide;
    public static ItemAttachment<Weapon> M9A1Slide;
    public static ItemAttachment<Weapon> M9A1Body;
    public static ItemAttachment<Weapon> SamuraiEdgeSlide;
    public static ItemAttachment<Weapon> SamuraiEdgeBody;
    public static ItemAttachment<Weapon> SamuraiEdgeMount;
    public static ItemAttachment<Weapon> DesertEagleBody;
    public static ItemAttachment<Weapon> DesertEagleSlide;
    public static ItemAttachment<Weapon> DesertEagleBodyGolden;
    public static ItemAttachment<Weapon> DesertEagleSlideGolden;
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
	
    public static ItemAttachment<Weapon> DeltaTekMPIFlashhider;
    public static ItemAttachment<Weapon> AKSStock;
    public static ItemAttachment<Weapon> PP1901HandGuard;
    public static ItemAttachment<Weapon> PP1901HandGuardB10;
    public static ItemAttachment<Weapon> PP1901HandGuardMagpul;
    public static ItemAttachment<Weapon> PP1901Grip;
    public static ItemAttachment<Weapon> RK9Grip;
    public static ItemAttachment<Weapon> RailMountB22;

    public static void init() {
        G11HandguardK1 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G11HandguardK1(), "g11.png")
                .withName("G11HandguardK1")
                .build(MWC.modContext);

        G11HandguardK2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G11HandguardK2(), "g11.png")
                .withName("G11HandguardK2")
                .build(MWC.modContext);;


        FABDefenseMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new FABDefenseMount(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("FABDefenseMount")
                .build(MWC.modContext);;

        MAS21Mount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new MAS21Mount(), "gun.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.62F, 1, 0.5F);
                    // GL11.glRotatef(30, 0, 1, 0);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withName("MAS21Mount")
                .build(MWC.modContext);;

        P90Swordfish = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new P90Swordfish(), "p90.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail4(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("P90swordfish")
                .build(MWC.modContext);;

        P90DefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new P90DefaultKit(), "p90.png")
                .withName("P90DefaultKit")
                .build(MWC.modContext);;

        P90Terminator = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new P90Terminator(), "p90.png")
                .withName("P90Terminator")
                .build(MWC.modContext);;

        ScarHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarLHandguard(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarHandGuard")
                .build(MWC.modContext);;

        ScarHHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarHHandguard(), "scarh.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarHHandGuard")
                .build(MWC.modContext);;

        ScarMidWestIndustriesHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarMidWestIndustriesHandguard(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("ScarMidWestIndustriesHandGuard")
                .build(MWC.modContext);;

        ScarMLOKHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScarMLOKHandguard(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarMLOKHandguard")
                .build(MWC.modContext);;

        SIG556Handguard = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SIG556Handguard(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SIG556Handguard")
                .build(MWC.modContext);;

        SIG556HandguardRailed = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SIG556HandguardRailed(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SIG556HandguardRailed")
                .build(MWC.modContext);;

        SIG556HandguardKA = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SIG556HandguardKA(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SIG556HandguardKA")
                .build(MWC.modContext);;

        SIG556Grip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SIG556Grip(), "sig556.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("SIG556Grip")
                .build(MWC.modContext);;

        ScarLReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new ScarReceiver(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarLReceiver")
                .build(MWC.modContext);;

        KrissVectorReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new KrissVectorReceiver(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KrissVectorReceiver")
                .build(MWC.modContext);;

        Vector556Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new KrissVectorModified(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 5),
                        new CraftingEntry(Items.STRING, 4),
                        new CraftingEntry(Items.PAPER, 5))
                .withName("KrissVector556Handguard")
                .build(MWC.modContext);;

        VectorMk1ModularHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KrissVectorMk1ModularGuard(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("VectorMk1ModularHandguard")
                .build(MWC.modContext);;

        VectorCarbineHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KrissVectorCarbineGuard(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("VectorCarbineHandguard")
                .build(MWC.modContext);;

        VectorTapedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new KrissVectorTapedGrip(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Items.STRING, 2),
                        new CraftingEntry(Items.PAPER, 3))
                .withName("VectorTapedGrip")
                .build(MWC.modContext);;

        Origin12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Origin12Handguard(), "origin12.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Origin12Handguard")
                .build(MWC.modContext);;

        HKS20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new HKS20Handguard(), "hks20.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withName("HKS20Handguard")
                .build(MWC.modContext);;

        Remington700Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Remington700Chassis(), "remington700.png")
                .withName("Remington700Chassis")
                .build(MWC.modContext);;

        Remington700APACChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Remington700ChassisAPAC(), "remington700.png")
                .withName("Remington700APACChassis")
                .build(MWC.modContext);;

        Remington700MDTXRSChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Remington700ChassisMDTXRS(), "remington700.png")
                .withName("Remington700MDTXRSChassis")
                .build(MWC.modContext);;

        SSG08Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new SSG08Chassis(), "SSG08_2.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("SSG08Chassis")
                .build(MWC.modContext);;

        ARX160Chassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new ARX160(), "arx160.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 6),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("ARX160Chassis")
                .build(MWC.modContext);;

        G2ContenderBarrelShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new G2ContenderBarrelShort(), "g2contender.png")
                .withModel(new AK47iron(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withRenderablePart()
                .withName("G2ContenderBarrelShort")
                .build(MWC.modContext);;

        G2ContenderBarrelLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new G2ContenderBarrelLong(), "g2contender.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AK47iron(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withRenderablePart()
                .withName("G2ContenderBarrelLong")
                .build(MWC.modContext);;

        G2ContenderGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new G2ContenderGrip(), "g2contender.png")
                .withRenderablePart()
                .withName("G2ContenderGrip")
                .build(MWC.modContext);;

        G2ContenderStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new G2ContenderStock(), "g2contender.png")
                .withRenderablePart()
                .withName("G2ContenderStock")
                .build(MWC.modContext);;

        Origin12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Origin12Grip(), "origin12.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Origin12Grip")
                .build(MWC.modContext);;

        HKS20Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HKS20Grip(), "HKS20.png")
                .withName("HKS20Grip")
                .build(MWC.modContext);;

        Origin12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Origin12Stock(), "origin12.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(Origin12Grip)
                .withName("Origin12Stock")
                .build(MWC.modContext);;

        HKS20Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new HKS20Stock(), "HKS20.png")
                .withRequiredAttachments(HKS20Grip)
                .withName("HKS20Stock")
                .build(MWC.modContext);;

        ACRHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRHandGuard(), "acr.png")
                .withModel(new AKRail(), "acrrail.png")
                .withModel(new AKRail2(), "acrrail.png")
                .withModel(new AKRail3(), "acrrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRHandGuard")
                .build(MWC.modContext);;

        ACRHandGuardBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRHandGuard(), "acrblack.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("ACRHandGuardBlack")
                .build(MWC.modContext);;

        ACRWEMSKHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRWEMSKHandguard(), "acr.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRWEMSKHandguardTan")
                .build(MWC.modContext);;

        ACRPrecisionHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRPrecisionHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPrecisionHandGuardTan")
                .build(MWC.modContext);;

        ACRSBRHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRSBRHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRSBRHandGuardTan")
                .build(MWC.modContext);;

        ACRPolymerHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRPolymerHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPolymerHandguardTan")
                .build(MWC.modContext);;

        ACRSquareDropHandguardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ACRSquareDropHandguard(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRSquareDropHandguardTan")
                .build(MWC.modContext);;

        Type20Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Type20Handguard(), "type20.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Type20Handguard")
                .build(MWC.modContext);;

        HoneyBadgerHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AACHoneyBadgerHandguard(), "AACHoneyBadger.png")
                .withModel(new AKRail(), "aacrail_gray.png")
//                .withModel(new AKRail2(), "acrrail.png")
//                .withModel(new AKRail3(), "acrrail.png")
                .withName("HoneyBadgerHandguard")
                .build(MWC.modContext);;

        HoneyBadgerMatrixArmsHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AACMatrixArmsHandguard(), "aacMatrixArmsHandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withName("HoneyBadgerMatrixArmsHandguard")
                .build(MWC.modContext);;

        M60HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M60Handguard(), "m60.png")
                .withName("M60HandGuard")
                .build(MWC.modContext);;

        M60MK43Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M60MK43Handguard(), "m60.png")
                .withName("M60MK43Handguard")
                .build(MWC.modContext);;

        M249HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M249HandGuard(), "m249.png")
                .withName("M249HandGuard")
                .build(MWC.modContext);;

        Mk48HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Mk48HandGuard(), "m249.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("Mk48HandGuard")
                .build(MWC.modContext);;

        M249UpperHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M249UpperHandGuard(), "m249.png")
                .withName("M249UpperHandGuard")
                .build(MWC.modContext);;

        Mk48UpperHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Mk48UpperHandGuard(), "m249.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withName("Mk48UpperHandGuard")
                .build(MWC.modContext);;

        StonerHANDGUARD = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new StonerHANDGUARD(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withName("StonerHANDGUARD")
                .build(MWC.modContext);;

        AUGA1handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AUGHandguard(), "aug.png")
                .withName("AUGA1")
                .build(MWC.modContext);;

        AUGA2handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AUGScopeRail(), "aug.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("AUGA2handguard")
                .build(MWC.modContext);;

        AUGA3handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AUGA3M1(), "aug.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("AUGA3handguard")
                .build(MWC.modContext);;

        EF88Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AUGEF88(), "aug.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("EF88Handguard")
                .build(MWC.modContext);;

        AUGDefaultKit = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AUG9mmConversionkit(), "aug.png")
                .withName("AUGDefaultKit")
                .build(MWC.modContext);;

        AUGParaConversion = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AUG9mmConversionkit(), "aug.png")
                .withName("AUGParaConversion")
                .build(MWC.modContext);;

        AUGA3extGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AUGA3M1_Ext(), "aug.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail4(), "akrail.png")
                .withRequiredAttachments(AUGA3handguard)
                .withName("AUGA3extGuard")
                .build(MWC.modContext);;

        M1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M1CarbineBody(), "m1carbine.png")
                .withName("M1CarbineBody")
                .build(MWC.modContext);;

        M1A1CarbineBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M1A1CarbineStock(), "m1carbine.png")
                .withName("M1A1CarbineBody")
                .build(MWC.modContext);;

        M1CarbineHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M1CarbineHandguard(), "m1carbine.png")
                .withName("M1CarbineHandguard")
                .build(MWC.modContext);;

        M1CarbineVentilatedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M1CarbineVentilatedHandguard(), "gun.png")
                .withName("M1CarbineVentilatedHandguard")
                .build(MWC.modContext);;

        M1CarbineScoutHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M1ScoutCarbineHandguard(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("M1ScoutCarbineHandguard")
                .build(MWC.modContext);;

        G3A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G3A1Handguard(), "g3.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G3A1Handguard")
                .build(MWC.modContext);;

        G3HandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G3HandguardRailed(), "g3.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("G3HandguardRailed")
                .build(MWC.modContext);;

        DSR1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new DSR1Handguard(), "dsr1.png")
                .withName("DSR1Handguard")
                .build(MWC.modContext);;

        DSR1HandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new DSR1HandguardRailed(), "dsr1.png")
                .withName("DSR1HandguardRailed")
                .build(MWC.modContext);;

        DSR1Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new DSR1Barrel(), "dsr1.png")
                .withName("DSR1Barrel")
                .build(MWC.modContext);;

        DSR1BarrelLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new DSR1BarrelLong(), "dsr1.png")
                .withName("DSR1BarrelLong")
                .build(MWC.modContext);;

        M14Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M14Body(), "m14dmr.png")
                .withModel(new FALIron(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("M14Body")
                .build(MWC.modContext);;

        M14SOCOMChassis = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M14DMRSocomChassis(), "m14dmr.png")
                .withModel(new FALIron(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("M14DMRSocomChassis")
                .build(MWC.modContext);;

        Mk14TanBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Mk14Body(), "mk14ebrtan.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Mk14TanBody")
                .build(MWC.modContext);;

        Mk14SnowBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Mk14Body(), "mk14ebrsnow.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Mk14SnowBody")
                .build(MWC.modContext);;

        Mk14BlackBody = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Mk14Body(), "mk14ebr.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Mk14BlackBody")
                .build(MWC.modContext);;

        M14Cover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M14Cover(), "m14dmr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(M14Body, M14SOCOMChassis)
                .withName("M14Cover")
                .build(MWC.modContext);;

        M14TriRailCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M14TriRailCover(), "m14dmr.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(M14Body, M14SOCOMChassis)
                .withName("M14TriRailCover")
                .build(MWC.modContext);;

        M14Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRequiredAttachments(M14Body, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, M14SOCOMChassis)
                .withModel(new M14DMRRail(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("M14Rail")
                .build(MWC.modContext);;

        ScarStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarStock(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarStock")
                .build(MWC.modContext);;

        ScarRetractableStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarShortStock(), "scarl.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarRetractableStock")
                .build(MWC.modContext);;

        // Todo: This one is sus it was actually using the dam thing
        ScarAdapterStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarAdapterStock(), "scarl.png")
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("ScarAdapterStock")
                .build(MWC.modContext);;

        ScarHStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ScarStock(), "scar_stock_h.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScarHStock")
                .build(MWC.modContext);;

        VectorStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KrissVectorStock(), "krissvector.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("VectorStock")
                .build(MWC.modContext);;

        VectorStockAdapter = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KrissVectorStockAdapter(), "krissvector.png")
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("VectorStockAdapter")
                .build(MWC.modContext);;

        UMP45Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new UMP45Receiver(), "ump45.png")
                .withName("UMP45Receiver")
                .build(MWC.modContext);;

        UMP9Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new UMP45Receiver(), "ump45.png")
                .withName("UMP9Receiver")
                .build(MWC.modContext);;

        UMP45Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UMP45Stock(), "ump45.png")
                .withName("UMP45Stock")
                .build(MWC.modContext);;

        MAC10Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MAC10Stock(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("MAC10Stock")
                .build(MWC.modContext);;

        MAC21Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Mac10stockwithrail(), "Mac10stockwithrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MAC21Stock")
                .build(MWC.modContext);;

        ACRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRStock")
                .build(MWC.modContext);;

        ACRStockBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRStock(), "acrblack.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRStockBlack")
                .build(MWC.modContext);;

        ACRFixedStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRFixedStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRFixedStockTan")
                .build(MWC.modContext);;

        ACRPRSStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRPRSStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPRSStockTan")
                .build(MWC.modContext);;

        ACRLongRangeStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRLongRangeStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("ACRLongRangeStock")
                .build(MWC.modContext);;

        ACRPDWStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ACRPDWStock(), "acr.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ACRPDWStock")
                .build(MWC.modContext);;

        M1014Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M1014stock(), "m1014.png")
                .withName("M1014Stock")
                .build(MWC.modContext);;

        M1014Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M1014grip(), "m1014.png")
                .withName("M1014Grip")
                .build(MWC.modContext);;

        M4BenelliStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M4BenelliStock(), "supernova.png")
                .withName("M4BenelliStock")
                .build(MWC.modContext);;

        Spas12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Spas12Stock(), "gun.png")
                .withName("Spas12Stock")
                .build(MWC.modContext);;

        M249Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249Stock(), "m249.png")
                .withName("M249Stock")
                .build(MWC.modContext);;

        M249ParaStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249ParaStock(), "m249.png")
                .withName("M249ParaStock")
                .build(MWC.modContext);;

        // Todo: This one is sus it was actually using the dam thing
        M249MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249StockAdapter(), "m249.png")
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withName("M249MilspecStock")
                .build(MWC.modContext);;

        // Todo: This one is sus it was actually using the dam thing
        M249HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M249StockAdapter(), "m249.png")
                .withModel(new HK416Stock(), "HK416Stock.png")
                .withName("M249Hk416Stock")
                .build(MWC.modContext);;

        UTGTriRailHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new UTGTriRailHandGuard(), "mp5.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("UTGTriRailHandGuard")
                .build(MWC.modContext);;

        MP5BMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5BMHandGuard(), "mp5.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP5BMHandGuard")
                .build(MWC.modContext);;

        MIMP5MHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MIMP5MHandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MIMP5MHandGuard")
                .build(MWC.modContext);;

        ScorpionHandguardShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScorpionEVO3A1HandguardShort(), "ScorpionEVO3A1.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail4(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("ScorpionEVO3A1HandguardShort")
                .build(MWC.modContext);;

        ScorpionHandguardLong = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ScorpionEVO3A1HandguardLong(), "ScorpionEVO3A1.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ScorpionEVO3A1HandguardLong")
                .build(MWC.modContext);;

        MIMP5TRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new MIMP5TRRail(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("MIMP5TRRail")
                .build(MWC.modContext);;

        MIMP5MRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new MIMP5MRail(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("MIMP5MRail")
                .build(MWC.modContext);;

        ShotgunRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new SupernovaRail(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("ShotgunRail")
                .build(MWC.modContext);;

        Kar98Krail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new Kar98Krail(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("Kar98Krail")
                .build(MWC.modContext);;

        M60Mk43Rail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new M60Mk43Rail(), "gun.png")
                .withName("M60Mk43Rail")
                .build(MWC.modContext);;

        M16A1ScopeMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new M16A1ScopeMount(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("M16A1ScopeMount")
                .build(MWC.modContext);;

        FamasF1ScopeMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new FamasF1ScopeRail(), "famasf1.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("FamasF1ScopeMount")
                .build(MWC.modContext);;

        M16A1PicatinnyRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withRenderablePart()
                .withModel(new M16A1PicatinnyRail(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("M16A1PicatinnyRail")
                .build(MWC.modContext);;

        FamasF1PicatinnyRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withRenderablePart()
                .withModel(new FamasF1GripRail(), "famasf1.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("FamasF1PicatinnyRail")
                .build(MWC.modContext);;

        NGSWRRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withRenderablePart()
                .withModel(new NGSWRRails(), "ngswr.png")
                .withName("NGSWRRail")
                .build(MWC.modContext);;

        RailRiser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new KrissVectorRailRiser(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("RailRiser")
                .build(MWC.modContext);;

        UziSightRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new UziSightRail(), "uzi.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("UziSightRail")
                .build(MWC.modContext);;

       M1911Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M1911Slide(), "m1911.png")
                .withModel(new M1911FrontSight(), "gun")
                .withModel(new makarovrearsight(), "gun")
                .withName("M1911Slide")
                .withRenderablePart()
                .build(MWC.modContext);;

        M1911Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M1911(), "m1911.png")
                .withName("M1911Body")
                .withRenderablePart()
                .build(MWC.modContext);;

        M45A1CQBPBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M45A1(), "m45.png")
                .withName("M45A1CQBPBody")
                .withRenderablePart()
                .build(MWC.modContext);;

        M45A1CQBPSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M45A1Slide(), "m45.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new M1911rearsight(), "m1911rearsight")
                .withName("M45A1CQBPSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        M9A1Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M9slide(), "m9a1.png")
                .withModel(new M9A1frontsight(), "M9A1frontsight")
                .withModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M9A1Slide")
                .withRenderablePart()
                .build(MWC.modContext);;

        M9A1Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M9(), "m9a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M9A1Body")
                .withRenderablePart()
                .build(MWC.modContext);;

        SamuraiEdgeSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new SamuraiEdgeSlide(), "samuraiedge.png")
                .withModel(new M9A1frontsight(), "M9A1frontsight")
                .withModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SamuraiEdgeSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        SamuraiEdgeBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SamuraiEdge(), "samuraiedge.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("SamuraiEdgeBody")
                .withRenderablePart()
                .build(MWC.modContext);;

        SamuraiEdgeMount = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withRequiredAttachments(SamuraiEdgeBody)
                .withModel(new SamuraiEdgeMount(), "samuraiedge.png")
                .withName("SamuraiEdgeMount")
                .withRenderablePart()
                .build(MWC.modContext);;

        DesertEagleSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new DesertEagleSlide(), "deagle.png")
                .withName("DesertEagleSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        DesertEagleBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new DesertEagle(), "deagle.png")
                .withName("DesertEagleBody")
                .withRenderablePart()
                .build(MWC.modContext);;

        DesertEagleBodyGolden = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new DesertEagle(), "deaglegolden.png")
                .withName("DesertEagleBodyGolden")
                .withRenderablePart()
                .build(MWC.modContext);;

        DesertEagleSlideGolden = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new DesertEagleSlide(), "deaglegolden.png")
                .withName("DesertEagleSlideGolden")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock19Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Glock19(), "glock19.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Glock19Body")
                .withRenderablePart()
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

        Glock19RazorbackBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new GlockRazorback(), "glock19.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("GlockRazorbackBody")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock19Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19Slide(), "glock19.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19Slide")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock18CSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock18Cslide(), "glock18c.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock18CSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock18CCNCSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock18CCNCslide(), "glock18c.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock18CCNCslide")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock19XSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19XSlide(), "glock19.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19XSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock19RazorbackSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new GlockRazorbackSlide(), "glock19.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("GlockRazorbackSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock19RockSlideOlive = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19Rockslide(), "glock19.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19RockslideOlive")
                .withRenderablePart()
                .build(MWC.modContext);;

        Glock19GhostPrecisionSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Glock19GhostPrecisionSlide(), "glock19.png")
                .withModel(new M1911FrontSight(), "m1911frontsight")
                .withModel(new GlockRearSight(), "glockrearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("Glock19GhostPrecisionSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        SCCYCPX2Body = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SCCYCPX2(), "sccycpx2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SCCYCPX2Body")
                .withRenderablePart()
                .build(MWC.modContext);;

        SCCYCPX2BodyTan = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new SCCYCPX2BodyTan(), "sccycpx2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SCCYCPX2BodyTan")
                .withRenderablePart()
                .build(MWC.modContext);;

        SCCYCPX2GripTape = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new SCCYCPX2GripTape(), "sccycpx2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(Items.STRING, 4),
                        new CraftingEntry(Items.PAPER, 5))
                .withName("SCCYCPX2GripTape")
                .withRenderablePart()
                .build(MWC.modContext);;

        SCCYCPX2Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new SCCYCPX2Slide(), "sccycpx2.png")
                .withModel(new M9A1frontsight(), "M9A1frontsight")
                .withModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("SCCYCPX2Slide")
                .withRenderablePart()
                .build(MWC.modContext);;

        SCCYCPX2BSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new SCCYCPX2BSlide(), "sccycpx2.png")
                .withModel(new M9A1frontsight(), "M9A1frontsight")
                .withModel(new M9A1rearsight(), "M9A1rearsight")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("SCCYCPX2BSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        P226Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new P226Slide(), "P226.png")
                .withModel(new P226rearsight(), "p226rearsight.png")
                .withModel(new P226frontsight(), "p226frontsight.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("P226Slide")
                .withRenderablePart()
                .build(MWC.modContext);;

        FiveSevenSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new FiveSevenSlide(), "fiveseven.png")
                .withModel(new P226rearsight(), "p226rearsight.png")
                .withModel(new P226frontsight(), "p226frontsight.png")
                .withName("FiveSevenSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        MakarovBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new MakarovPM(), "makarovpm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MakarovBody")
                .withRenderablePart()
                .build(MWC.modContext);;

        MakarovSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MakarovPMSlide(), "makarovpm.png")
                .withModel(new makarovrearsight(), "makarovpm.png")
                .withModel(new makarovfrontsight(), "makarovpm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("MakarovPMSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        MakarovPBSlide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MakarovPBSSlide(), "makarovpm.png")
                .withModel(new makarovrearsight(), "makarovpm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MakarovPBSlide")
                .withRenderablePart()
                .build(MWC.modContext);;

        MP443Slide = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MP443Slide(), "mp443.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("MP443Slide")
                .withRenderablePart()
                .build(MWC.modContext);;

        MakarovPBBody = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withRequiredAttachments(Attachments.MakarovPBSlide)
                .withModel(new MakarovPBBody(), "makarovpm.png")
                .withModel(new makarovfrontsight(), "makarovpm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MakarovPBBody")
                .withRenderablePart()
                .build(MWC.modContext);;

        MAC10Body = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new MAC10Body(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MAC10Body")
                .build(MWC.modContext);;

        MAC10Action = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new MAC10Action(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withRequiredAttachments(MAC10Body)
                .withName("MAC10Action")
                .withRenderablePart()
                .build(MWC.modContext);;

        MP5NavyHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5NavyHandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5NavyHandGuard")
                .build(MWC.modContext);;

        MP5A5HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5A5HandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5A5HandGuard")
                .build(MWC.modContext);;

        MP5SDHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MP5SDHandGuard(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP5SDHandGuard")
                .build(MWC.modContext);;

        MP5HOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new MP5HOGUEGrip(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5HOGUEGrip")
                .build(MWC.modContext);;

        GlockHOGUEGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new GlockHogueGrip(), "gun2.png")
                .withName("GlockHogueGrip")
                .build(MWC.modContext);;

        // Todo: Why is the recipe commented out
        GlockHOGUEGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new GlockHogueGrip(), "tan.png")
//                .withModernRecipe(
//                    	CraftingGroup.ATTACHMENT_MODIFICATION,
//                    	new CraftingEntry(MwItems.gunmetalIngot, 3))
                .withName("GlockHogueGripTan")
                .build(MWC.modContext);;

        APSGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new APSgrip(), "aps.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(Blocks.PLANKS, 1))
                .withName("APSGrip")
                .build(MWC.modContext);;

        APSStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new APSstock(), "aps.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(Blocks.PLANKS, 1))
                .withName("APSStock")
                .build(MWC.modContext);;

        MAC10Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new MAC10Grip(), "mac10.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MAC10Grip")
                .build(MWC.modContext);;

        MP5Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5Stock(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5Stock")
                .build(MWC.modContext);;

        MP5A3Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5A3RetractableStock(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5A3Stock")
                .build(MWC.modContext);;

        MP5A4Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5A4Stock(), "mp5.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MP5A4Stock")
                .build(MWC.modContext);;
        // Todo: This one is sus it was actually using the dam thing
        MP5MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new MP5StockAdapter(), "mp5.png")
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP5StockAdapter")
                .build(MWC.modContext);;

        LVOAVHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new LVOAVHandGuard(), "lvoavhandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("LVOAVHandGuard")
                .build(MWC.modContext);;

        AR15HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AR15FN15Handguard(), "ar15.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AR15FN15Handguard")
                .build(MWC.modContext);;

        M38HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M38HandGuard(), "hk416.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M38HandGuard")
                .build(MWC.modContext);;

        HK416HandGuardBlackAndTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M38HandGuard(), "hk416.png")
                .withModel(new AKRail(), "akrailblackandtan.png")
                .withModel(new AKRail2(), "akrailblackandtan.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("HK416HandGuardBlackAndTan")
                .build(MWC.modContext);;

        HK417Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new HK417Handguard(), "HK417.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withName("HK417Handguard")
                .build(MWC.modContext);;

        HK417HandguardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new HK417Handguard(), "HK417tan.png")
                .withModel(new AKRail(), "guntandarkrail.png")
                .withModel(new AKRail2(), "guntandarkrail.png")
                .withModel(new AKRail3(), "guntandarkrail.png")
                .withModel(new AKRail5(), "guntandarkrail.png")
                .withName("HK417HandguardTan")
                .build(MWC.modContext);;

        Mk18HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Mk18HandGuard(), "mk18handguard.png")
                .withModel(new AKRail(), "mk18rail.png")
                .withModel(new AKRail2(), "mk18rail.png")
                .withModel(new AKRail3(), "mk18rail.png")
                .withModel(new AKRail5(), "mk18rail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("Mk18HandGuard")
                .build(MWC.modContext);;

        Mk18HandGuardBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Mk18HandGuard(), "mk18handguardblack.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("Mk18HandGuardBlack")
                .build(MWC.modContext);;

        Block2SOCOMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Block2SOCOMHandguard(), "block2socomhandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Block2SOCOMHandguard")
                .build(MWC.modContext);;

        FSSTacLiteHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new FSSTacLiteHandguard(), "FSSTacLiteHandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("FSSTacLiteHandguard")
                .build(MWC.modContext);;

        M4MagpulHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4MagpulHandGuard(), "m4magpulhandleguard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4MagpulHandGuard")
                .build(MWC.modContext);;

        M4MagpulHandGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4MagpulHandGuard(), "m4magpulhandleguardtan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4MagpulHandGuardTan")
                .build(MWC.modContext);;

        M4Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "m4a1.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4Receiver")
                .build(MWC.modContext);;

        HK416Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new HK416Receiver(), "HK416Receiver.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HK416Receiver")
                .build(MWC.modContext);;

        C8SFWReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "C8SFW_gun.png")
                .withModel(new AKRail(), "C8SFW_gun.png")
                .withName("C8SFWReceiver")
                .build(MWC.modContext);;

        VLTORReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new VLTORReceiver(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("VLTORReceiver")
                .build(MWC.modContext);;

        AR57Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AR57Receiver(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("AR57Receiver")
                .build(MWC.modContext);;

        HK417Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new HK417Receiver(), "HK417.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("HK417Receiver")
                .build(MWC.modContext);;

        HK417ReceiverTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new HK417Receiver(), "HK417tan.png")
                .withModel(new AKRail(), "guntanrail.png")
                .withName("HK417ReceiverTan")
                .build(MWC.modContext);;

        M110Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M110Receiver(), "M110.png")
                .withModel(new AKRail(), "akrailm110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M110Receiver")
                .build(MWC.modContext);;

        Z10Receiver = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Z10Receiver")
                .build(MWC.modContext);;

        Beowulf50CalReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Beowulf50CalReceiver(), "beowulf50cal.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Beowulf50CalReceiver")
                .build(MWC.modContext);;

        S710Receiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new S710Tricun10mmReceiver(), "s710tricun.png")
                .withName("S710Receiver")
                .build(MWC.modContext);;

        CZ805BrenReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new CZ805BrenReceiver(), "CZ805Bren.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CZ805BrenReceiver")
                .build(MWC.modContext);;

        HoneyBadgerReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACHoneyBadgerReceiver(), "AACHoneyBadger.png")
                .withModel(new AKRail(), "aacrail_main.png")
                .withName("HoneyBadgerReceiver")
                .build(MWC.modContext);;

        HoneyBadgerReceiverBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACHoneyBadgerReceiver(), "AACHoneyBadgerBlack.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("HoneyBadgerReceiverBlack")
                .build(MWC.modContext);;

        HoneyBadgerKnightsReceiver = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiver.png")
                .withModel(new AKRail(), "aacrail_knights.png")
                .withName("HoneyBadgerKnightsReceiver")
                .build(MWC.modContext);;

        HoneyBadgerKnightsReceiverBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new AACKnightsArmamentReceiver(), "AACKnightsArmamentReceiverblack.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("HoneyBadgerKnightsReceiverBlack")
                .build(MWC.modContext);;

        Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new M4Receiver(), "gun.png")
                .withName("Placeholder")
                .build(MWC.modContext);;

        FamasPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4Receiver(), "gun.png")
                .withName("FamasPlaceholder")
                .build(MWC.modContext);;

        APC9Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "gun.png")
                .withName("APC9Placeholder")
                .build(MWC.modContext);;

        P90Placeholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M4Receiver(), "gun.png")
                .withName("P90Placeholder")
                .build(MWC.modContext);;

        PistolPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4Receiver(), "gun.png")
                .withName("PistolPlaceholder")
                .build(MWC.modContext);;

        GripPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M4Receiver(), "gun.png")
                .withName("GripPlaceholder")
                .build(MWC.modContext);;

        M40A6GripPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4Receiver(), "gun.png")
                .withName("M40A6GripPlaceholder")
                .build(MWC.modContext);;

        LaserPlaceholder = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new M4Receiver(), "gun.png")
                .withName("LaserPlaceholder")
                .build(MWC.modContext);;

        M4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4HandGuard(), "m4a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4HandGuard")
                .build(MWC.modContext);;

        AR57Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AR57Handguard(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withRequiredAttachments(AR57Receiver)
                .withName("AR57Handguard")
                .build(MWC.modContext);;

        NTW20HandguardRAIL = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new NTW20Guard(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("NTW20Guard")
                .build(MWC.modContext);;

        M16HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M16HandGuard(), "m16a4.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M16HandGuard")
                .build(MWC.modContext);;

        M16A1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M16A1Handguard(), "m16a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M16A1Handguard")
                .build(MWC.modContext);;

        M4CarbineHandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M4CarbineHandGuard(), "m4carbinehandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M4CarbineHandGuard")
                .build(MWC.modContext);;

        M16A4HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M16A4Handguard(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M16A4HandGuard")
                .build(MWC.modContext);;

        M110Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new M110Handguard(), "M110.png")
                .withModel(new AKRail(), "akrailm110.png")
                .withModel(new AKRail2(), "akrailm110.png")
                .withModel(new AKRail3(), "akrailm110.png")
                .withModel(new AKRail5(), "akrailm110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("M110Handguard")
                .build(MWC.modContext);;

        Z10Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Z10Handguard(), "z10.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("Z10Handguard")
                .build(MWC.modContext);;

        AR10SuperSASSHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AR10SuperSASSHandguard(), "gun.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModel(new AKRail5(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AR10SuperSASSHandguard")
                .build(MWC.modContext);;

        S710Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new S710TricunHandguard(), "s710tricun.png")
                .withName("S710Handguard")
                .build(MWC.modContext);;
        SIGMCXHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new SIGMCXHandguard(), "sigmcx.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SIGMCXHandguard")
                .build(MWC.modContext);;

        SIGMCXHandguardShort = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new SIGMCXHandguardShort(), "sigmcx.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModel(new AKRail3(), "akrail.png")
                .withName("SIGMCXHandguardShort")
                .build(MWC.modContext);;

        MPXHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MPXHandguard(), "mpx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MPXHandguard")
                .build(MWC.modContext);;

        MPXHandguardExtended = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MPXHandguardExtended(), "mpx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MPXHandguardExtended")
                .build(MWC.modContext);;

        MPXHandguardRailed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MPXHandguardRailed(), "mpx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("MPXHandguardRailed")
                .build(MWC.modContext);;

        K2C1Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new K2C1Handguard(), "k2c1.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("K2C1Handguard")
                .build(MWC.modContext);;

        HeraArmsGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HeraArmsGrip(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HeraArmsGrip")
                .build(MWC.modContext);;

        M4Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4Grip(), "m4a1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4Grip")
                .build(MWC.modContext);;

        M4GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4GripTan(), "m4griptan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4GripTan")
                .build(MWC.modContext);;

        SOCOM_Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withModel(new M4Grip(), "socom_grip.png")
                .withName("SOCOM_Grip")
                .build(MWC.modContext);;

        M4GripGray = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M4Grip(), "gun2.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M4GripGray")
                .build(MWC.modContext);;

        HK416Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HKgrip(), "hkgrip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HK416Grip")
                .build(MWC.modContext);;

        HK416GripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new HKgrip(), "hkgriptan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("HK416GripTan")
                .build(MWC.modContext);;

        M110Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new M110Grip(), "M110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("M110Grip")
                .build(MWC.modContext);;

        S710TricunGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new S710TricunGrip(), "S710Tricun.png")
                .withName("S710TricunGrip")
                .build(MWC.modContext);;

        K2C1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new K2C1Grip(), "k2c1.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("K2C1Grip")
                .build(MWC.modContext);;

        AK47Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKGrip(), "ak47.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(Blocks.PLANKS, 1))
                .withName("AK47Grip")
                .build(MWC.modContext);;

        AK101Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AK101Grip(), "AK101Grip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AK101Grip")
                .build(MWC.modContext);;

        AKErgoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKErgoGrip(), "akergogrip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AKErgoGrip")
                .build(MWC.modContext);;

        AKErgoGripGreen = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKErgoGrip(), "ak12grip.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AKErgoGripGreen")
                .build(MWC.modContext);;

        AKErgoGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AKErgoGrip(), "akergogriptan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AKErgoGripTan")
                .build(MWC.modContext);;

        AK12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AK12Grip(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AK12Grip")
                .build(MWC.modContext);;

        AK12ErgoGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new AK12ErgoGrip(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("AK12ErgoGrip")
                .build(MWC.modContext);;

        HoneyBadgerStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new AACHoneyBadgerStock(), "AACHoneyBadger.png")
                .withName("HoneyBadgerStock")
                .build(MWC.modContext);;

        HoneyBadgerStockBlack = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new AACHoneyBadgerStock(), "AACHoneyBadgerblack.png")
                .withName("HoneyBadgerStockBlack")
                .build(MWC.modContext);;

        G3Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new G3Stock(), "g3.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("G3Stock")
                .build(MWC.modContext);;

        MP7Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MP7Stock(), "mp7.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP7Stock")
                .build(MWC.modContext);;

        // Todo: This one is sus it was actually using the dam thing
        MP7MilSpecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MP7MilSpecStock(), "mp7.png")
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("MP7MilSpecStock")
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

        RPKStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new RPKstock(), "rpkstock.png")
                .withName("RPKstock")
                .build(MWC.modContext);;

        AK101Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK101Stock(), "ak101stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK101Stock")
                .build(MWC.modContext);;

        AK74Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK74Stock(), "AK74Stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK74Stock")
                .build(MWC.modContext);;

        AK12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK12Stock(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK12Stock")
                .build(MWC.modContext);;

        AK12ZenitcoStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AK12ZenitcoStock(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("AK12ZenitcoStock")
                .build(MWC.modContext);;

        VSSVintorezStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new VSSVintorezStock(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Blocks.PLANKS, 2))
                .withName("VSSVintorezStock")
                .build(MWC.modContext);;

        ASValStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ASValStock(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("ASValStock")
                .build(MWC.modContext);;

        // Todo: This one is sus it was actually using the dam thing
        VSSVintorezMilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new VSSVintorezKulaTacStock(), "vssvintorez.png")
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("VSSVintorezMilspecStock")
                .build(MWC.modContext);;

        CollapsableMOEStock = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withModel(new CollapsableMOEStock(), "CollapsableMOEStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CollapsableMOEStock")
                .build(MWC.modContext);;

        CollapsableMOEStockGreen = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.STOCK)
                .withModel(new CollapsableMOEStock(), "ak12stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CollapsableMOEStockGreen")
                .build(MWC.modContext);;

        MagpulCTRStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MagpulCTRStock(), "MagpulCTRStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MagpulCTRStock")
                .build(MWC.modContext);;

        MagpulCTRStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MagpulCTRStock(), "MagpulCTRStocktan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MagpulCTRStockTan")
                .build(MWC.modContext);;

        MilSpecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MilSpecStock(), "MilSpecStock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MilSpecStock")
                .build(MWC.modContext);;

        CZ805BrenStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new CZ805BrenStock(), "CZ805Bren.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("CZ805BrenStock")
                .build(MWC.modContext);;

        SIGMCXStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new SIGMCXStock(), "sigMCx.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("SIGMCXStock")
                .build(MWC.modContext);;

        C8Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new MilSpecStock(), "C8Stock.png")
                .withName("C8Stock")
                .build(MWC.modContext);;

        MilSpecStockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new MilSpecStock(), "MilSpecStocktan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MilSpecStockTan")
                .build(MWC.modContext);;

        HeraArmsStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new HeraArmsStock(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withRequiredAttachments(HeraArmsGrip)
                .withName("HeraArmsStock")
                .build(MWC.modContext);;

        HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new HK416Stock(), "HK416Stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("HK416Stock")
                .build(MWC.modContext);;

        SOCOM_Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
//                .withCreativeTab(MWC.AttachmentsTab)
                .withRenderablePart()
                .withModel(new SOCOM_Stock(), "Socom_stock.png")
                .withName("SOCOM_Stock")
                .build(MWC.modContext);;

        M16Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M16Stock(), "m16stock.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("M16Stock")
                .build(MWC.modContext);;

        HK416StockTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withRenderablePart()
                .withModel(new HK416Stock(), "HK416Stocktan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("HK416StockTan")
                .build(MWC.modContext);;

        M110Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new M110Stock(), "m110.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("M110Stock")
                .build(MWC.modContext);;

        PRSPrecisionStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new ARPRSPrecisionStock(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("ARPRSPrecisionStock")
                .build(MWC.modContext);;

        AK47HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK47HandleGuard(), "ak47.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Blocks.PLANKS, 2))
                .withName("AK47HandleGuard")
                .build(MWC.modContext);;

        DragunovHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new DragunovHandguard(), "dragunov.png")
                .withModel(new AKMiron2(), "gun.png")
                .withModel(new AK47iron(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5),
                        new CraftingEntry(Blocks.PLANKS, 4))
                .withName("DragunovHandguard")
                .build(MWC.modContext);;

        Dragunov98Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Dragunov98Handguard(), "dragunov98.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 6),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Dragunov98Handguard")
                .build(MWC.modContext);;

        AK101HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK101HandGuard(), "ak101handguard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK101HandGuard")
                .build(MWC.modContext);;

        AK74Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK74Handguard(), "AK74Handguard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK74Handguard")
                .build(MWC.modContext);;

        AKMagpulHandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MagpulHandleGuard(), "MagpulHandleGuard.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AKMagpulHandleGuard")
                .build(MWC.modContext);;

        AKMagpulHandleGuardTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MagpulHandleGuard(), "MagpulHandleGuardTan.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AKMagpulHandleGuardTan")
                .build(MWC.modContext);;

        MLOKHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MLOKHandguard(), "mlokhandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("MLOKHandguard")
                .build(MWC.modContext);;

        MLOKExtendedHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new MLOKExtendedHandguard(), "MLOKExtendedHandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withModel(new AKRail2(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withName("MLOKExtendedHandguard")
                .build(MWC.modContext);;

        AK15HandleGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK15HandleGuard(), "AK15HandleGuard.png")
                .withModel(new AKRail(), "AKRailgrey.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK15HandleGuard")
                .build(MWC.modContext);;

        AK12kalHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK15HandleGuard(), "ak12handguard.png")
                .withModel(new AKRail(), "AKRailgrey.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12kalHandguard")
                .build(MWC.modContext);;

        RPK16Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new RPK16handguard(), "rpk16handguard.png")
                .withModel(new AKRail(), "akrailgrey.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("RPK16handguard")
                .build(MWC.modContext);;

        AK12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK12Handguard(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12Handguard")
                .build(MWC.modContext);;

        AK12BHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new AK12BHandguard(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12BHandguard")
                .build(MWC.modContext);;

        KBP9A91Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KBP9A91Handguard(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KBP9A91Handguard")
                .build(MWC.modContext);;

        KBP9A91CompactHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KBP9A91CompactHandguard(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KBP9A91CompactHandguard")
                .build(MWC.modContext);;

        KBP9A91KulaTacHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new KBP9A91KulaTacHandguard(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("KBP9A91KulaTacHandguard")
                .build(MWC.modContext);;

        VSSVintorezHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new VSSVintorezHandguard(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(Blocks.PLANKS, 3))
                .withName("VSSVintorezHandguard")
                .build(MWC.modContext);;

        ASValHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new ASValHandguard(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("ASValHandguard")
                .build(MWC.modContext);;

        PP1901HandGuardMagpul = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new PP1901HandguardMagpul(), "pp1901.png")
                .withName("PP1901HandGuardMagpul")
                .build(MWC.modContext);;

        PP1901HandGuardB10 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new PP1901HandguardB10(), "pp1901.png")
                .withName("PP1901HandGuardB10")
                .build(MWC.modContext);;

        PP1901HandGuard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new PP1901Handguard(), "pp1901.png")
                .withName("PP1901HandGuard")
                .build(MWC.modContext);;

        VSSVintorezTriRailMount = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new VSSVintorezTriRailMount(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4))
                .withName("VSSVintorezTriRailMount")
                .build(MWC.modContext);;

        AK47DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK47DustCover(), "ak47.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK47Dustcover")
                .build(MWC.modContext);;

        DragunovDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new DragunovDustCover(), "dragunov.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withName("DragunovDustCover")
                .build(MWC.modContext);;

        Dragunov98DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new Dragunov98(), "dragunov98.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 5))
                .withName("Dragunov98DustCover")
                .build(MWC.modContext);;

        AKMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AKMDustCover(), "AKMDustCover.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AKMDustcover")
                .build(MWC.modContext);;

        AK101DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK101DustCover(), "ak101dustcover.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK101DustCover")
                .build(MWC.modContext);;

        VeprDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new VeprDustCover(), "veprdustcover.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("VeprDustCover")
                .build(MWC.modContext);;

        AK15DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK15DustCover(), "ak15dustcover.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK15DustCover")
                .build(MWC.modContext);;

        AK12DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK12DustCover(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12DustCover")
                .build(MWC.modContext);;

        AK12BDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK12BDustCover(), "ak12kal.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("AK12BDustCover")
                .build(MWC.modContext);;

        VSSVintorezDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new VSSVintorezDustCover(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("VSSVintorezDustCover")
                .build(MWC.modContext);;

        VSSMDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new VSSVintorezVSSMDustCover(), "vssvintorez.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withName("VSSMDustCover")
                .build(MWC.modContext);;

        FNFALDustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new FNFALDustCover(), "fnfal.png")
                .withName("FNFALDustCover")
                .build(MWC.modContext);;

        SA58DustCover = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new SA58DustCover(), "SA58DustCover.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("SA58DustCover")
                .build(MWC.modContext);;

        RailMountB22 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new RailMountB22(), "pp1901.png")
                .withName("RailMountB22")
                .build(MWC.modContext);;

        FNFALGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new FNFALGrip(), "fnfal.png")
                .withName("FNFALGrip")
                .build(MWC.modContext);;

        FNFALStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new FNFALStock(), "fnfal.png")
                .withName("FNFALStock")
                .build(MWC.modContext);;

        FNFALHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new FNFALHandguard(), "fnfal.png")
                .withName("FNFALHandguard")
                .build(MWC.modContext);;

        FNFALPARAHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new FNFALPARAHandguard(), "fnfalparahandguard.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("FNFALPARAHandguard")
                .build(MWC.modContext);;

        B51ScopeMountRail = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withRenderablePart()
                .withModel(new B51ScopeMountRail(), "pkm.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1))
                .withName("B51ScopeMountRail")
                .build(MWC.modContext);;

        PKMBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new PKMBarrel(), "pkm.png")
                .withModel(new PKMfrontsight(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("PKMBarrel")
                .build(MWC.modContext);;

        PechenegBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new PechenegBarrel(), "pkm.png")
                .withModel(new PKMfrontsight(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("PechenegBarrel")
                .build(MWC.modContext);;

        B50PKPHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new B50PKPHandguard(), "gun.png")
                .withRequiredAttachments(PechenegBarrel)
                .withName("B50PKPHandguard")
                .build(MWC.modContext);;

        B50PKMHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new B50PKMHandguard(), "gun.png")
                .withRequiredAttachments(PKMBarrel)
                .withName("B50PKMHandguard")
                .build(MWC.modContext);;

        M4FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M4Iron2(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withRequiredAttachments(M4HandGuard, M4CarbineHandGuard, M4MagpulHandGuard,
                        M4MagpulHandGuardTan, M16HandGuard, Mk18HandGuard, M16A4HandGuard, Block2SOCOMHandguard,
                        Mk18HandGuardBlack)
                .withName("M4FrontSight")
                .build(MWC.modContext);;

        M60FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new M60FrontSight(), "gun.png")
                .withName("M60FrontSight")
                .build(MWC.modContext);;

        M38FrontSight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AK47iron(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withModel(new AKMiron2(), "gun.png")
                .withRequiredAttachments(M38HandGuard, LVOAVHandGuard, Mk18HandGuard,
                        StonerHANDGUARD, AR57Handguard, HK417Handguard, HK417HandguardTan,
                        HK416HandGuardBlackAndTan)
                .withName("M38FrontSight")
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

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
                        Origin12Handguard)
                .withName("MBUSFrontSight")
                .build(MWC.modContext);;

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
                        M60Mk43Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip, G2ContenderBarrelLong,
                        HK417Receiver, HK417ReceiverTan, B51ScopeMountRail)
                .withCrosshair("LP")
                .withModel(new Leupold(), "leupold.png")
                .withModel(new JPUreticle(), "black.png")
                .withName("Leupold")
                .build(MWC.modContext);;

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
                .withModel(new PSO12(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 5))
                .withName("PSO1")
                .build(MWC.modContext);;

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
//                .withModel(new OKP7reticle(), "green.png")
                .withName("okp7")
                .build(MWC.modContext);;

        FMG9Sight = new ItemScope.Builder()
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new FMG9Carryhandle(), "fmg9.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("fmg9carryhandle")
                .build(MWC.modContext);;

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
//                .withModel(new Reflex2(), "Reflex2.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail,
                        M60Mk43Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL, Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack, M14TriRailCover,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount, B51ScopeMountRail,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver,
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("Reflex")
                .build(MWC.modContext);;

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
                        Placeholder, Kar98Krail, M60Mk43Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        M4Receiver, VLTORReceiver, Attachments.EF88Handguard, KrissVectorReceiver,
                        Vector556Handguard, DesertEagleSlide, DesertEagleSlideGolden, M1CarbineScoutHandguard,
			Origin12Grip, HKS20Grip, HoneyBadgerKnightsReceiver, HoneyBadgerKnightsReceiverBlack,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount, B51ScopeMountRail,
                        HK417Receiver, HK417ReceiverTan, AK12DustCover, AK12BDustCover, CZ805BrenReceiver, HK416Receiver,
                        M110Receiver, ScarLReceiver, Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("BijiaReflex")
                .build(MWC.modContext);;

        MicroReflex = new ItemScope.Builder()
                .withHolographicReticles(Reticles.MICRO_REFLEX)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.13F, -1.62F, -0.1F);
                    GlStateManager.scale(1.6F, 1.6F, 1.6F);
                })
                .withCategory(AttachmentCategory.SCOPE)
                .withRenderablePart()
                .withModel(new MicroReflexSight(), "gun.png")
                .withModel(new SightMount(), "gun.png")
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
                        M60Mk43Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("MicroReflex")
                .build(MWC.modContext);;

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
//                .withModel(new AcogScope2(), "gun.png")
//                .withModel(new AcogReticle(), "acogreticle.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail, P90Placeholder,
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
                        HKS20Grip, FABDefenseMount, MAC21Stock, VSSMDustCover, Dragunov98DustCover, UziSightRail,
                        RailMountB22)
                .withName("Acog")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build(MWC.modContext);;

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
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail, P90Placeholder,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("Specter")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build(MWC.modContext);;

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
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("Holographic2")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build(MWC.modContext);;

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
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail, P90Placeholder,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("HolographicAlt")
                .build(MWC.modContext);;

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
                .withModel(new EotechScopeRing(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("EotechHybrid2")
                .build(MWC.modContext);;

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
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("VortexSight")
                .build(MWC.modContext);;

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
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("MicroT1")
                .build(MWC.modContext);;

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
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, RailMountB22)
                .withName("AimpointCompM2")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build(MWC.modContext);;

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
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("AimpointCompM5")
                .build(MWC.modContext);;

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
                        Vector556Handguard, DesertEagleSlide, DesertEagleSlideGolden, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, MAS21Mount, APC9Placeholder,
                        MAC21Stock, VSSMDustCover, Dragunov98DustCover)
                .withName("RMRsight")
                .build(MWC.modContext);;

        LeupoldDeltapointPro = new ItemScope.Builder()
                .withHolographicReticles(Reticles.REFLEX)
                .withReticlePositioning(() -> {
                    GlStateManager.translate(0.22F, -3.45F, -0.53F);
                    GlStateManager.scale(2.9F, 2.0F, 1.7F);
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
                        Vector556Handguard, DesertEagleSlide, DesertEagleSlideGolden, M1CarbineScoutHandguard, Origin12Grip, HKS20Grip,
                        M14TriRailCover, Mk14TanBody, Mk14SnowBody, Mk14BlackBody, MAS21Mount, APC9Placeholder,
                        MAC21Stock, VSSMDustCover, Dragunov98DustCover)
                .withName("LeupoldDeltapointPro")
                .build(MWC.modContext);;

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
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withRenderablePart()
                .withName("Kobra")
                .build(MWC.modContext);;

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
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withRenderablePart()
                .withName("KobraGen3")
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

        HP = new ItemScope.Builder()
//                .withNightVision()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.02F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.65F, 1.65F, 1.65F);
                    GL11.glTranslatef(0.0285F, 0.492F, 0.7F);
                }).withCrosshair("HP")
                .withModel(new HP(), "gun.png")
                .withModel(new JPUreticle(), "black.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, Kar98Krail,
                        M4Receiver, VLTORReceiver, AR57Receiver, NTW20HandguardRAIL)
                .withName("HPScope")
                .build(MWC.modContext);;

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
//                .withModel(new JPUreticle(), "black.png")
                .withName("LeupoldRailScope")
                .withRotationPoint(-0.12079999459981924F, -1.4240000168085098F, -2.392400065904859F)
                .build(MWC.modContext);;
				
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
                .build(MWC.modContext);;

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
                        MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail, P90Placeholder, AUGA2handguard, AUGA3handguard,
                        Attachments.EF88Handguard, KrissVectorReceiver, B51ScopeMountRail,
                        Vector556Handguard, M1CarbineScoutHandguard, M14Rail, SSG08Chassis, SA58DustCover,
                        M16A1ScopeMount, UMP45Receiver, UMP9Receiver, G2ContenderBarrelLong, S710Receiver,
                        Beowulf50CalReceiver, FamasF1ScopeMount,
                        HK417Receiver, HK417ReceiverTan, CZ805BrenReceiver, HK416Receiver, M110Receiver, ScarLReceiver,
                        Remington700Chassis, Remington700APACChassis,
                        Remington700MDTXRSChassis, DSR1Handguard, DSR1HandguardRailed, Z10Receiver, MAC21Stock,
                        VSSMDustCover, Dragunov98DustCover, UziSightRail, RailMountB22)
                .withName("NightRaiderScope")
                .build(MWC.modContext);;

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
                .withModel(new M2A1reticle(), "red.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder, MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail)
                .withName("m2a1_sight")
                .build(MWC.modContext);;

        F2000Handguard = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new com.paneedah.mwc.models.weapons.F2000Handguard(), "f2000.png")
                .withName("F2000Handguard")
                .withRenderablePart()
                .build(MWC.modContext);;

        F2000TRHandguard = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GUARD)
                .withModel(new com.paneedah.mwc.models.weapons.F2000TRHandguard(), "f2000.png")
                .withName("F2000TRHandguard")
                .withRenderablePart()
                .build(MWC.modContext);;

        F2000Scope = new ItemScope.Builder()
                .withSniperReticle(Reticles.RETICLE_F2000)
                .withOpticalZoom()
                .withZoomRange(0.22f, 0.0125f)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.25f, 1.25f, 1.25f);
                    GL11.glTranslatef(-0.118f, -0.485f, 0.202f);
                    GL11.glRotatef(0F, 0F, 0F, 0F);
                })
                .withRenderablePart()
                .withModel(new F2000Scope(), "f2000.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("F2000Scope")
                .build(MWC.modContext);;

        F2000FrontSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new F2000FrontSight(), "gun.png")
                .withName("F2000FrontSight")
                .withRenderablePart()
                .build(MWC.modContext);;

        F2000RearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new F2000RearSight(), "gun.png")
                .withName("F2000RearSight")
                .withRenderablePart()
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

        AUGscope = new ItemScope.Builder()
                .withOpticalZoom()
                .withZoomRange(0.22F, 0.02F)
                .withViewfinderPositioning(() -> {
                    GL11.glScalef(1.05F, 1.05F, 1.05F);
                    GL11.glTranslatef(-0.23F, -0.77F, 0.65F);
                })
                .withCrosshair("HP")
                .withModel(new AUGScope_scope(), "gun.png")
                .withModel(new JPUreticle(), "black.png")
                .withModel(new AUGScope(), "gun.png")
                .withRequiredAttachments(AUGA1handguard)
                .withName("AUGscope")
                .build(MWC.modContext);;

        Silencer556x45 = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x45(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer556x45")
                .build(MWC.modContext);;

        Silencer545x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer545x39")
                .build(MWC.modContext);;

        Silencer762x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor762x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer762x39")
                .build(MWC.modContext);;

        M32Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new Suppressor(), "gun.png")
                .withName("M32Barrel")
                .build(MWC.modContext);;

        Remington870Pump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870Pump(), "remington870.png")
                .withName("Remington870Pump")
                .build(MWC.modContext);;

        Remington870MagpulPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870MagpulPump(), "remington870.png")
                .withName("Remington870MagpulPump")
                .build(MWC.modContext);;

        Remington870PoliceMagnumPump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870PoliceMagnumPump(), "remington870.png")
                .withName("Remington870PoliceMagnumPump")
                .build(MWC.modContext);;

        Remington870FABDefensePump = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withRenderablePart()
                .withModel(new Remington870FABDefensePump(), "remington870.png")
                .withModel(new AKRail(), "akrail.png")
                .withName("Remington870FABDefensePump")
                .build(MWC.modContext);;

        Remington870Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870Stock(), "remington870.png")
                .withName("Remington870Stock")
                .build(MWC.modContext);;

        Remington870PoliceMagnumStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870PoliceMagnumStock(), "remington870.png")
                .withName("Remington870PoliceMagnumStock")
                .build(MWC.modContext);;

        // Todo: This one is sus it was actually using the dam thing
        Remington870MilspecStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870PoliceMagnumStock(), "remington870.png")
                .withModel(new MilSpecStock(), "gun.png")
                .withName("Remington870MilSpecStock")
                .build(MWC.modContext);;

        Remington870HK416Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870PoliceMagnumStock(), "remington870.png")
                .withModel(new HK416Stock(), "gun.png")
                .withName("Remington870HK416StockStock")
                .build(MWC.modContext);;

        Remington870SawedGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Remington870SawedGrip(), "remington870.png")
                .withName("Remington870SawedGrip")
                .build(MWC.modContext);;

        Remington870Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Remington870Barrel(), "remington870.png")
                .withModel(new R870part(), "gun.png")
                .withName("Remington870Barrel")
                .build(MWC.modContext);;

        Remington870PoliceMagnumBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Remington870PoliceMagnumBarrel(), "remington870.png")
                .withModel(new M9A1frontsight(), "gun.png")
                .withName("Remington870PoliceMagnumBarrel")
                .build(MWC.modContext);;

        Remington870SawedOffBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new Remington870SawedBarrel(), "remington870.png")
                .withModel(new M9A1frontsight(), "gun.png")
                .withName("Remington870SawedBarrel")
                .build(MWC.modContext);;

        KS23Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KS23Stock(), "ks23.png")
                .withName("KS23Stock")
                .build(MWC.modContext);;

        KS23RaptorGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KS23RaptorGrip(), "ks23.png")
                .withName("KS23RaptorGrip")
                .build(MWC.modContext);;

        KS23MStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new KS23Mstock(), "ks23.png")
                .withName("KS23MStock")
                .build(MWC.modContext);;

        KS23Barrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new KS23Barrel(), "ks23.png")
                .withModel(new FALIron(), "gun.png")
                .withName("KS23Barrel")
                .build(MWC.modContext);;

        KS23ExtendedBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new KS23ExtendedBarrel(), "ks23.png")
                .withModel(new FALIron(), "gun.png")
                .withName("KS23ExtendedBarrel")
                .build(MWC.modContext);;

        RPKBarrel = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new RPKbarrel(), "gun.png")
                .withModel(new AKiron3(), "gun")
                .withModel(new AKMiron2(), "gun")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("RPKbarrel")
                .build(MWC.modContext);;

        AKIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AKiron3(), "gun")
                .withModel(new AKMiron2(), "gun")
                .withName("AKIron")
                .build(MWC.modContext);;

        AK12Iron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.EXTRA2)
                .withModel(new AKiron3(), "gun")
                .withModel(new AKMiron2(), "gun")
                .withName("AK12Iron")
                .build(MWC.modContext);;

        SilencerPBS = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withRequiredAttachments(MakarovPBBody)
                .withModel(new MakarovPBSSilencer(), "makarovpm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SilencerPBS")
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

        SamuraiEdgeSuppressor = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withRequiredAttachments(SamuraiEdgeMount)
                .withModel(new SamuraiEdgeSuppressor(), "samuraiedge.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SamuraiEdgeSuppressor")
                .build(MWC.modContext);;

        Silencer9x39mm = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer9x39mm")
                .build(MWC.modContext);;

        SuppressorKBP9A91 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new KBP9A91Suppressor(), "kbp9a91.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("KBP9A91Suppressor")
                .build(MWC.modContext);;

        Silencer45ACP = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withRequiredAttachments(KrissVectorReceiver, M1911Slide, M45A1CQBPSlide)
                .withModel(new Suppressor45ACP(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer45ACP")
                .build(MWC.modContext);;

        SilencerEABH = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor45ACP(), "gun.png")
                .withName("silencer_eabh")
                .build(MWC.modContext);;

        Silencer762x54 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Silencer762x54")
                .build(MWC.modContext);;

        Silencer762x51 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor762x51(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Silencer762x51")
                .build(MWC.modContext);;

        Silencer50BMG = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new QDLSuppressor(), "GunmetalTexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("Silencer50BMG")
                .build(MWC.modContext);;


        Silencer556x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer556x39")
                .build(MWC.modContext);;


        AKMIron = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SCOPE)
                .withModel(new M27rearsight(), "gun.png")
                .withModel(new AKMiron1(), "gun.png")
                .withModel(new AKMiron2(), "gun.png")
                .withModel(new AK47iron(), "gun.png")
                .withModel(new M4Iron1(), "gun.png")
                .withModel(new M4Iron2(), "gun.png")
                .withModel(new P90iron(), "gun.png")
                .withModel(new G36CIron1(), "gun.png")
                .withModel(new G36CIron2(), "gun.png")
                .withModel(new ScarIron1(), "gun.png")
                .withModel(new ScarIron2(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withModel(new M14Iron(), "gun.png")
                .withModel(new MP5Iron(), "gun.png")
                .withModel(new MP5Iron(), "gun.png")
                .withModel(new MBUSiron(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
                        P90Placeholder, AUGA2handguard, AUGA3handguard, M4Receiver,
                        VLTORReceiver, AR57Receiver, Attachments.EF88Handguard,
                        KrissVectorReceiver, Vector556Handguard, Origin12Grip, HKS20Grip,
                        ScarLReceiver)
                .withName("AKMIron")
                .build(MWC.modContext);;

        TritiumRearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new TritiumRearSights(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                .build(MWC.modContext);;

        MBUSRearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new MBUSRearSight(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                .build(MWC.modContext);;

        HK416RearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new G95_upright_rearsights(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder,
                        MIMP5TRRail, MIMP5MRail, ShotgunRail, Kar98Krail, M60Mk43Rail,
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
                .build(MWC.modContext);;

        FNFALRearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new FNFALRearSight(), "gun.png")
                .withName("FNFALRearSights")
                .build(MWC.modContext);;

        M16A1RearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.EXTRA)
                .withModel(new M16A1RearSight(), "gun.png")
                .withName("M16A1RearSight")
                .build(MWC.modContext);;

        K2C1RearSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new K2C1RearSight(), "gun.png")
                .withModel(new ScarIron2(), "gun.png")
                .withModel(new FALIron(), "gun.png")
                .withName("K2C1RearSight")
                .build(MWC.modContext);;

        ScorpionRearSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new ScorpionRearSight(), "gun.png")
                .withName("ScorpionRearSight")
                .build(MWC.modContext);;

        ScorpionFrontSight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new ScorpionFrontSight(), "gun.png")
                .withName("ScorpionFrontSight")
                .build(MWC.modContext);;

        MP7IronSights = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new MP7RearSights(), "MP7IronSights.png")
                .withModel(new MP7FrontSights(), "MP7IronSights.png")


                .withName("MP7IronSights")
                .withRenderablePart()
                .build(MWC.modContext);;

        MP7IronSightsStanding = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new MP7RearSightFlipped(), "MP7IronSights.png")
                .withModel(new MP7FrontSightFlipped(), "MP7IronSights.png")


                .withName("MP7IronSightsStanding")
                .withRenderablePart()
                .build(MWC.modContext);;

        Kar98Ksight = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RAILING)
                .withModel(new AK47iron(), "gun.png")
                .withName("Kar98Ksight")
                .build(MWC.modContext);;

        AK15ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.SCOPE)
                .withModel(new KA_AK12_Ironsight(), "gun.png")
                .withModel(new AKMiron2(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder)
                .withName("AK15ironsight")
                .withRenderablePart()
                .build(MWC.modContext);;

        AK12ironsight = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.FRONTSIGHT)
                .withModel(new AK15ironsight(), "gun.png")
                .withModel(new AKMiron2(), "gun.png")
                .withRequiredAttachments(VeprDustCover, AK15DustCover, Placeholder)
                .withName("AK12ironsight")
                .withRenderablePart()
                .build(MWC.modContext);;

        SilencerMP7 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("SilencerMP7")
                .build(MWC.modContext);;

        Silencer357 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "GunmetalTexture.png")
                .withName("Silencer357")
                .build(MWC.modContext);;

        Silencer57x38 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer57x38")
                .build(MWC.modContext);;


        Silencer12Gauge = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor45ACP(), "GunmetalTexture.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("Silencer12Gauge")
                .build(MWC.modContext);;


        Silencer300AACBlackout = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor300AACBlackout(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer300AACBlackout")
                .build(MWC.modContext);;

        HoneyBadgerSilencer = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new AACHoneyBadgerSilencer(), "gun.png")
                .withName("HoneyBadgerSilencer")
                .build(MWC.modContext);;

        Silencer65x39 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new Suppressor556x39(), "gun.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("Silencer65x39")
                .build(MWC.modContext);;

        Laser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder,
                        FABDefenseMount, LaserPlaceholder, Mk18HandGuard, M60MK43Handguard,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, M45A1CQBPBody, PP1901HandGuardB10,
                        F2000TRHandguard)
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
                .build(MWC.modContext);;

        Laser2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withModel(new Laser3(), "laser2.png")
                .withRequiredAttachments(M4CarbineHandGuard, M38HandGuard, UTGTriRailHandGuard, PistolPlaceholder,
                        LaserPlaceholder, Mk18HandGuard, M60MK43Handguard, P90Swordfish,
                        AUGA3extGuard, StonerHANDGUARD, AR57Handguard, M16A4HandGuard, ACRHandGuard, ACRHandGuardBlack,
                        HoneyBadgerMatrixArmsHandguard, AR10SuperSASSHandguard,
                        UMP45Receiver, UMP9Receiver, ScorpionHandguardShort, APC9Placeholder, ARX160Chassis, FamasF1PicatinnyRail,
                        HK417Handguard, HK417HandguardTan, AK12BHandguard, CZ805BrenReceiver, Block2SOCOMHandguard,
                        LVOAVHandGuard, FSSTacLiteHandguard, Mk18HandGuardBlack, M110Handguard, Mk48UpperHandGuard,
                        KBP9A91KulaTacHandguard, VSSVintorezTriRailMount, M14TriRailCover, MP5BMHandguard,
                        HK416HandGuardBlackAndTan, ScarHandGuard, ScarMidWestIndustriesHandGuard,
                        Z10Handguard, SIGMCXHandguard, SIGMCXHandguardShort, NGSWRRail, K2C1Handguard, G3HandguardRailed,
                        ScarHHandGuard, MPXHandguardRailed, MPXHandguardExtended,
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, B50PKMHandguard, B50PKPHandguard, PP1901HandGuardB10,
                        F2000TRHandguard)
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
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

        DanWessonLaser = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.LASER)
                .withModel(new DanWessonLaser(), "DanWessonLaser.png")
                .withPostRender(new LaserBeamRenderer((p, s) -> {
                    GL11.glTranslatef(-0.2F, 1.4F, 1.8F);
                    // GL11.glRotatef(30, 0, 1, 0);
                    // GL11.glScaled(0.6F, 0.6F, 0.6F);
                }))
                .withRenderablePart()
                .withName("DanWessonLaser")
                .build(MWC.modContext);;

        M1928Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new M1928Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("M1928Grip")
                .build(MWC.modContext);;

        M1A1Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new M1A1Grip(), "m1a1thompson.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 1);
                })
                .withName("M1A1Grip")
                .build(MWC.modContext);;

        Grip2 = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new Grip2(), "grip2.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard,
                        AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard,
                        M38HandGuard, UTGTriRailHandGuard, GripPlaceholder,
                        Mk18HandGuard, M60MK43Handguard, P90Swordfish, AUGA3extGuard,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard, S710Handguard, B50PKMHandguard,
                        B50PKPHandguard, PP1901HandGuardB10, F2000TRHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("Grip2")
                .build(MWC.modContext);;
				

        Grip2Tan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new Grip2(), "grip2tan.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard,
                        AK15HandleGuard, M4CarbineHandGuard, LVOAVHandGuard,
                        M38HandGuard, UTGTriRailHandGuard, GripPlaceholder,
                        Mk18HandGuard, M60MK43Handguard, P90Swordfish, AUGA3extGuard,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard, PP1901HandGuardB10, F2000TRHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("Grip2Tan")
                .build(MWC.modContext);;

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
                        SIG556HandguardKA, SIG556HandguardRailed, S710Handguard, PP1901HandGuardB10)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("JunoGrip")
                .build(MWC.modContext);;

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
                        SIG556HandguardKA, SIG556HandguardRailed, PP1901HandGuardB10)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("JunoGripTan")
                .build(MWC.modContext);;
				
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
                .build(MWC.modContext);;

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
                .build(MWC.modContext);;

        AngledGrip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new AngledGrip(), "angledgrip.png")
                .withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard,
                        LVOAVHandGuard, M38HandGuard, GripPlaceholder, UTGTriRailHandGuard, Mk18HandGuard,
                        M60MK43Handguard, AUGA3extGuard, AR57Handguard, RPK16Handguard,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, S710Handguard, PP1901HandGuardB10)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("AngledGrip")
                .build(MWC.modContext);;

        AngledGripTan = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new AngledGrip(), "angledgriptan.png")
                .withRequiredAttachments(MLOKExtendedHandguard, M4CarbineHandGuard,
                        LVOAVHandGuard, M38HandGuard, GripPlaceholder, UTGTriRailHandGuard, Mk18HandGuard,
                        M60MK43Handguard, AUGA3extGuard, AR57Handguard, RPK16Handguard,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, S710Handguard, PP1901HandGuardB10)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("AngledGripTan")
                .build(MWC.modContext);;


        StubbyGrip = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.GRIP)
                .withModel(new StubbyGrip(), "stubbygrip.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard, M60MK43Handguard, P90Swordfish, AUGA3extGuard,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard, S710Handguard, PP1901HandGuardB10,
                        F2000TRHandguard)
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
                .build(MWC.modContext);;
				
        StubbyGripTan = new AttachmentBuilder<Weapon>()
                .withRenderablePart()
                .withCategory(AttachmentCategory.GRIP)
                .withModel(new StubbyGrip(), "stubbygriptan.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard, M60MK43Handguard, P90Swordfish, AUGA3extGuard,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard, S710Handguard, PP1901HandGuardB10,
                        F2000TRHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("StubbyGripTan")
                .build(MWC.modContext);;

        VGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new VGrip(), "vgrip.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard,
                        M60MK43Handguard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard, S710Handguard, PP1901HandGuardB10,
                        F2000TRHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("VGrip")
                .build(MWC.modContext);;

        VGripTan = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new VGrip(), "vgriptan.png")
                .withRequiredAttachments(MLOKExtendedHandguard, MLOKHandguard, AK15HandleGuard,
                        M4CarbineHandGuard, LVOAVHandGuard, M38HandGuard, UTGTriRailHandGuard,
                        GripPlaceholder, Mk18HandGuard,
                        M60MK43Handguard, P90Swordfish, AUGA3extGuard, AR57Handguard, RPK16Handguard, StonerHANDGUARD,
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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard, S710Handguard, PP1901HandGuardB10,
                        F2000TRHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withRenderablePart()
                .withName("VGripTan")
                .build(MWC.modContext);;

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
                        SIG556HandguardKA, SIG556HandguardRailed, Type20Handguard, AK12kalHandguard, S710Handguard, M60MK43Handguard,
                        PP1901HandGuardB10)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_NORMAL,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                })
                .withName("Bipod")
                .build(MWC.modContext);;

        AUGgrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new AUGGrip(), "aug.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("AUGgrip")
                .build(MWC.modContext);;

        PechenegBipod = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new PechenegBipod(), "pkm.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.6F);
                })
                .withName("PechenegBipod")
                .build(MWC.modContext);;

        USPMatchCompensator = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.GRIP)
                .withRenderablePart()
                .withModel(new USPMatchCompensator(), "gun.png")
                .withApply((a, i) -> {
                    i.setRecoil(i.getWeapon().getRecoil() * 0.4f);
                })
                .withName("USPMatchCompensator")
                .build(MWC.modContext);;

       UziWoodStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UziWoodStock(), "uzi.png")
                .withModernRecipe(
                       CraftingGroup.ATTACHMENT_MODIFICATION,
                       new CraftingEntry(MWCItems.gunmetalIngot, 1),
                       new CraftingEntry(Blocks.PLANKS, 4))
                .withName("UziWoodStock")
                .build(MWC.modContext);;

        UziFoldingStockOpened = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UziFoldingStockOpened(), "uzi.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("UziFoldingStockOpened")
                .build(MWC.modContext);;

        UziFoldingStockClosed = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new UziFoldingStockClosed(), "uzi.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("UziFoldingStockClosed")
                .build(MWC.modContext);;

        UziMLOKHandguard =  new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new UziMLOKHandguard(), "uzi.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 4),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("UziMLOKHandguard")
                .build(MWC.modContext);;
		
        InterventionCarryHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new InterventionCarryHandle(), "intervention.png")
				.withRequiredAttachments(InterventionQTDRifleHandguard, InterventionHandguard)
                .withName("InterventionCarryHandle")
                .build(MWC.modContext);;

        InterventionKeystoneHandle = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.RECEIVER)
                .withModel(new InterventionKeystoneHandle(), "intervention.png")
				.withRequiredAttachments(InterventionRailSystemHandguard)
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("InterventionKeystoneHandle")
                .build(MWC.modContext);;

        InterventionHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new InterventionHandguard(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("InterventionHandguard")
                .build(MWC.modContext);;

        InterventionQTDRifleHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new InterventionQTDRifleHandguard(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("InterventionQTDRifleHandguard")
                .build(MWC.modContext);;

        InterventionRailSystemHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new InterventionRailSystemHandguard(), "intervention.png")
                .withModel(new AKRail(), "akrail.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 4))
                .withName("InterventionRailSystemHandguard")
                .build(MWC.modContext);;

        InterventionStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new InterventionStock(), "intervention.png")
                .withName("InterventionStock")
                .build(MWC.modContext);;

        InterventionFJXLUX7Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new InterventionFJXLUX7Stock(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 3))
                .withName("InterventionFJXLUX7Stock")
                .build(MWC.modContext);;

        InterventionKiloTaCStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new InterventionKiloTaCStock(), "intervention.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 1),
                        new CraftingEntry(MWCItems.steelIngot, 2))
                .withName("InterventionKiloTaCStock")
                .build(MWC.modContext);;
		
        Saiga12Handguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new Saiga12Handguard(), "gunmetaltexture.png")
                .withName("Saiga12Handguard")
                .build(MWC.modContext);;
				
        Saiga12Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new Saiga12Stock(), "gunmetaltexture.png")
                .withName("Saiga12Stock")
                .build(MWC.modContext);;
				
        Saiga12Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new Saiga12Grip(), "gunmetaltexture.png")
                .withName("Saiga12Grip")
                .withRenderablePart()
                .build(MWC.modContext);;
				
        G36CHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G36CHandguard(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36CHandguard")
                .build(MWC.modContext);;
				
        G36KHandguard = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.GUARD)
                .withModel(new G36KHandguard(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36KHandguard")
                .build(MWC.modContext);;
				
        G36CStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new G36CStock(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36CStock")
                .build(MWC.modContext);;
				
        G36KVStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new G36KVStock(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36KVStock")
                .build(MWC.modContext);;
				
        G36CMGStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new G36CMGStock(), "g36c.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 3),
                        new CraftingEntry(MWCItems.steelIngot, 1))
                .withName("G36CMGStock")
                .build(MWC.modContext);;

        PKMGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new PKMGrip(), "pkm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("PKMGrip")
                .build(MWC.modContext);;

        RK3PGrip = new AttachmentBuilder<Weapon>()
                .withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new RK3PGrip(), "pkm.png")
                .withModernRecipe(
                        CraftingGroup.ATTACHMENT_MODIFICATION,
                        new CraftingEntry(MWCItems.gunmetalIngot, 2))
                .withName("RK3PGrip")
                .build(MWC.modContext);;

        PKMStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new PKMStock(), "pkm.png")
                .withRenderablePart()
                .withName("PKMStock")
                .build(MWC.modContext);;

        PT2Stock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new PT2Stock(), "pkm.png")
                .withRenderablePart()
                .withName("PT2Stock")
                .build(MWC.modContext);;
				
        DeltaTekMPIFlashhider = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.SILENCER)
                .withModel(new DeltaTekMPIFlashHider(), "pp1901.png")
                .withName("Delta_Tek_MPI_flashhider")
                .build(MWC.modContext);;
	
        AKSStock = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.STOCK)
                .withModel(new AKSStock(), "pp1901.png")
                .withName("AKSStock")
                .build(MWC.modContext);;
	
        PP1901Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new PP1901Grip(), "pp1901.png")
                .withName("PP1901Grip")
                .build(MWC.modContext);;
				
        RK9Grip = new AttachmentBuilder<Weapon>().withCategory(AttachmentCategory.BACKGRIP)
                .withModel(new RK9Grip(), "pp1901.png")
                .withName("RK9Grip")
                .build(MWC.modContext);;
    }
}