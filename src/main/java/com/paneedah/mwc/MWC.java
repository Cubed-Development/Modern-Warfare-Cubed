package com.paneedah.mwc;

import com.paneedah.mwc.creativetab.*;
import com.paneedah.mwc.gui.HUD;
import com.paneedah.mwc.handlers.ClientEventHandler;
import com.paneedah.mwc.handlers.CommonEventHandler;
import com.paneedah.mwc.handlers.DebugHandler;
import com.paneedah.mwc.init.MWCRecipes;
import com.paneedah.mwc.network.handlers.*;
import com.paneedah.mwc.network.messages.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.weaponlib.CommonModContext;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.command.BalancePackCommand;
import com.paneedah.weaponlib.command.CraftingFileCommand;
import com.paneedah.weaponlib.command.DebugCommand;
import com.paneedah.weaponlib.config.BalancePackManager;
import io.redstudioragnarok.redcore.RedCore;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.FMLLaunchHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.NAME;
import static com.paneedah.mwc.ProjectConstants.VERSION;

//   /$$      /$$                 /$$                                     /$$      /$$                      /$$$$$$                                     /$$$$$$            /$$                       /$$
//  | $$$    /$$$                | $$                                    | $$  /$ | $$                     /$$__  $$                                   /$$__  $$          | $$                      | $$
//  | $$$$  /$$$$  /$$$$$$   /$$$$$$$  /$$$$$$   /$$$$$$  /$$$$$$$       | $$ /$$$| $$  /$$$$$$   /$$$$$$ | $$  \__//$$$$$$   /$$$$$$   /$$$$$$       | $$  \__/ /$$   /$$| $$$$$$$   /$$$$$$   /$$$$$$$
//  | $$ $$/$$ $$ /$$__  $$ /$$__  $$ /$$__  $$ /$$__  $$| $$__  $$      | $$/$$ $$ $$ |____  $$ /$$__  $$| $$$$   |____  $$ /$$__  $$ /$$__  $$      | $$      | $$  | $$| $$__  $$ /$$__  $$ /$$__  $$
//  | $$  $$$| $$| $$  \ $$| $$  | $$| $$$$$$$$| $$  \__/| $$  \ $$      | $$$$_  $$$$  /$$$$$$$| $$  \__/| $$_/    /$$$$$$$| $$  \__/| $$$$$$$$      | $$      | $$  | $$| $$  \ $$| $$$$$$$$| $$  | $$
//  | $$\  $ | $$| $$  | $$| $$  | $$| $$_____/| $$      | $$  | $$      | $$$/ \  $$$ /$$__  $$| $$      | $$     /$$__  $$| $$      | $$_____/      | $$    $$| $$  | $$| $$  | $$| $$_____/| $$  | $$
//  | $$ \/  | $$|  $$$$$$/|  $$$$$$$|  $$$$$$$| $$      | $$  | $$      | $$/   \  $$|  $$$$$$$| $$      | $$    |  $$$$$$$| $$      |  $$$$$$$      |  $$$$$$/|  $$$$$$/| $$$$$$$/|  $$$$$$$|  $$$$$$$
//  |__/     |__/ \______/  \_______/ \_______/|__/      |__/  |__/      |__/     \__/ \_______/|__/      |__/     \_______/|__/       \_______/       \______/  \______/ |_______/  \_______/ \_______/
@Mod(modid = ID, name = NAME, version = VERSION, dependencies = "required-after:mixinbooter@[9.4,);required-after:redcore@[0.6,)", guiFactory = "com.paneedah.weaponlib.config.ConfigGUIFactory", updateJSON = "https://forge.curseupdate.com/836353/mwc")
public final class MWC {

    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(ID);

    public static final CreativeTabs EQUIPMENT_TAB = new ArmorTab(CreativeTabs.getNextID(), "equipment");
    public static final CreativeTabs WEAPONS_TAB = new AssaultRiflesTab(CreativeTabs.getNextID(), "weapons");
    public static final CreativeTabs AMMUNITION_AND_MAGAZINES_TAB = new AmmoTab(CreativeTabs.getNextID(), "ammunitionAndMagazines");
    public static final CreativeTabs ATTACHMENTS_TAB = new AttachmentsTab(CreativeTabs.getNextID(), "attachments");
    public static final CreativeTabs THROWABLES_TAB = new GrenadesTab(CreativeTabs.getNextID(), "throwables");
    public static final CreativeTabs PROPS_TAB = new PropsTab(CreativeTabs.getNextID(), "props");
    public static final CreativeTabs BLOCKS_AND_INGOTS_TAB = new BlocksTab(CreativeTabs.getNextID(), "blocksAndIngots");

    // Todo: Make this configurable via the future YAML config system from FBP, or Valkyrie integration, the later would be best.
    public static int bulletHitParticleMult = 6;

    @SidedProxy(serverSide = "com.paneedah.weaponlib.CommonModContext", clientSide = "com.paneedah.weaponlib.ClientModContext")
    public static ModContext modContext;

    @SidedProxy(serverSide = "com.paneedah.mwc.proxies.CommonProxy", clientSide = "com.paneedah.mwc.proxies.ClientProxy")
    public static CommonProxy commonProxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent) {
        if (preInitializationEvent.getSide().isClient()) {
            MinecraftForge.EVENT_BUS.register(ClientEventHandler.class);
        }

        commonProxy.preInit(this);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent initializationEvent) {
        MinecraftForge.EVENT_BUS.register(CommonEventHandler.class);

        MWCRecipes.register();
        commonProxy.init(this);

        if (initializationEvent.getSide().isClient()) {
            Runtime.getRuntime().addShutdownHook(new Thread(ClientTickerController::stop));

            updateDebugHandler();

            MinecraftForge.EVENT_BUS.register(new HUD());
        }

        // Set the sounds
        modContext.setChangeZoomSound("OpticZoom");
        modContext.setNightVisionOnSound("nightvision_on");
        modContext.setNightVisionOffSound("nightvision_off");
        modContext.setChangeFireModeSound("firerate_toggle");
        modContext.setNoAmmoSound("dry_fire");
        modContext.setExplosionSound("grenadeexplosion");
        modContext.setFlashExplosionSound("flashbang");

        modContext.setMaterialImpactSounds(Material.ROCK, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone");
        modContext.setMaterialImpactSounds(Material.WOOD, 1.5f, "bullet_3_rock", "bullet_2_rock", "bullet_4_rock", "bullet_12_stone", "bullet_10_snap");
        modContext.setMaterialImpactSounds(Material.GRASS, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        modContext.setMaterialImpactSounds(Material.GROUND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        modContext.setMaterialImpactSounds(Material.SAND, 1.5f, "bullet_5_grass", "bullet_9_grass", "bullet_11_grass", "bullet_10_snap", "bullet_13_snap");
        modContext.setMaterialImpactSounds(Material.IRON, 1.5f, "bullet_6_iron", "bullet_7_iron", "bullet_8_iron");
        modContext.setMaterialImpactSounds(Material.SNOW, 1.5f, "bullet_14_snow");
        modContext.setMaterialImpactSounds(Material.CRAFTED_SNOW, 1.5f, "bullet_14_snow");

        // Register channels for networking
        CHANNEL.registerMessage(new PermitMessageClientHandler((CommonModContext) modContext), PermitMessage.class, -1, Side.CLIENT);
        CHANNEL.registerMessage(new LivingEntityTrackerMessageMessageHandler(), LivingEntityTrackerMessage.class, -2, Side.CLIENT);
        CHANNEL.registerMessage(new SpawnParticleMessageHandler(modContext), SpawnParticleMessage.class, -3, Side.CLIENT);
        CHANNEL.registerMessage(new BlockHitMessageHandler(), BlockHitMessage.class, -4, Side.CLIENT);
        CHANNEL.registerMessage(new ExplosionMessageHandler(), ExplosionMessage.class, -5, Side.CLIENT);
        CHANNEL.registerMessage(new SpreadableExposureMessageHandler(), SpreadableExposureMessage.class, -6, Side.CLIENT);
        CHANNEL.registerMessage(new WorkbenchClientMessageHandler(), WorkbenchClientMessage.class, -7, Side.CLIENT);
        CHANNEL.registerMessage(new CraftingClientMessageHandler(), CraftingClientMessage.class, -8, Side.CLIENT);
        CHANNEL.registerMessage(new MuzzleFlashMessageHandler(), MuzzleFlashMessage.class, -9, Side.CLIENT);
        CHANNEL.registerMessage(new ShellMessageHandler(), ShellMessageClient.class, -10, Side.CLIENT);
        CHANNEL.registerMessage(new BalancePackClientMessageHandler(), BalancePackClientMessage.class, -11, Side.CLIENT);
        CHANNEL.registerMessage(new BloodClientMessageHandler(), BloodClientMessage.class, -12, Side.CLIENT);
        CHANNEL.registerMessage(new VehicleClientMessageHandler(), VehicleClientMessage.class, -13, Side.CLIENT);
        CHANNEL.registerMessage(new EntityInventorySyncMessageClientHandler(modContext), EntityInventorySyncMessage.class, -14, Side.CLIENT);
        CHANNEL.registerMessage(new ExposureMessageHandler(), ExposureMessage.class, -15, Side.CLIENT);
        CHANNEL.registerMessage(new RealisticSoundClientHandler(), RealisticSoundClientMessage.class, -16, Side.CLIENT);

        CHANNEL.registerMessage(new TryFireMessageHandler(modContext.getWeaponFireAspect()), TryFireMessage.class, 1, Side.SERVER);
        CHANNEL.registerMessage(new PermitMessageServerHandler((CommonModContext) modContext), PermitMessage.class, 2, Side.SERVER);
        CHANNEL.registerMessage(new MeleeAttackMessageHandler(modContext.getMeleeAttackAspect()), MeleeAttackMessage.class, 3, Side.SERVER);
        CHANNEL.registerMessage(new GrenadeMessageHandler(modContext.getGrenadeAttackAspect()), GrenadeMessage.class, 4, Side.SERVER);
        CHANNEL.registerMessage(new NightVisionToggleMessageHandler(), NightVisionToggleMessage.class, 5, Side.SERVER);
        CHANNEL.registerMessage(new EntityInventorySyncMessageServerHandler(modContext), EntityInventorySyncMessage.class, 6, Side.SERVER);
        CHANNEL.registerMessage(new OpenCustomPlayerInventoryGuiMessageHandler(this), OpenCustomPlayerInventoryGuiMessage.class, 7, Side.SERVER);
        CHANNEL.registerMessage(new VehicleControlMessageHandler(), VehicleControlMessage.class, 8, Side.SERVER);
        CHANNEL.registerMessage(new VehicleInteractMessageHandler(), VehicleInteractMessage.class, 9, Side.SERVER);
        CHANNEL.registerMessage(new OpenDoorMessageHandler(), OpenDoorMessage.class, 10, Side.SERVER);
        CHANNEL.registerMessage(new WorkbenchServerMessageHandler(), WorkbenchServerMessage.class, 11, Side.SERVER);
        CHANNEL.registerMessage(new CraftingServerMessageHandler(), CraftingServerMessage.class, 12, Side.SERVER);
        CHANNEL.registerMessage(new EntityPickupMessageHandler(), EntityPickupMessage.class, 13, Side.SERVER);
        CHANNEL.registerMessage(new RealisticSoundHandler(), RealisticSoundMessage.class, 14, Side.SERVER);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInitializationEvent) {
        commonProxy.postInit(this, postInitializationEvent);
    }

    @Mod.EventHandler
    @SideOnly(Side.CLIENT)
    public void postInitClient(FMLPostInitializationEvent postInitializationEvent) {
        RedCore.forceOptiFineFastRenderOff();
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent serverStartingEvent) {
        serverStartingEvent.registerServerCommand(new BalancePackCommand());
        serverStartingEvent.registerServerCommand(new CraftingFileCommand());
        BalancePackManager.loadDirectory();
    }

    public static void updateDebugHandler() {
        if (DebugCommand.debugF3 || FMLLaunchHandler.isDeobfuscatedEnvironment()) {
            MinecraftForge.EVENT_BUS.register(DebugHandler.class);
        } else {
            MinecraftForge.EVENT_BUS.unregister(DebugHandler.class);
        }
    }
}
