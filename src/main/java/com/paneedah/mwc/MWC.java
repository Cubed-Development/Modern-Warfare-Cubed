package com.paneedah.mwc;

import com.paneedah.mwc.creativetab.*;
import com.paneedah.mwc.init.MWCRecipes;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.utils.OptiNotFine;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.command.BalancePackCommand;
import com.paneedah.weaponlib.command.CraftingFileCommand;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

//   /$$      /$$                 /$$                                     /$$      /$$                      /$$$$$$                                     /$$$$$$            /$$                       /$$
//  | $$$    /$$$                | $$                                    | $$  /$ | $$                     /$$__  $$                                   /$$__  $$          | $$                      | $$
//  | $$$$  /$$$$  /$$$$$$   /$$$$$$$  /$$$$$$   /$$$$$$  /$$$$$$$       | $$ /$$$| $$  /$$$$$$   /$$$$$$ | $$  \__//$$$$$$   /$$$$$$   /$$$$$$       | $$  \__/ /$$   /$$| $$$$$$$   /$$$$$$   /$$$$$$$
//  | $$ $$/$$ $$ /$$__  $$ /$$__  $$ /$$__  $$ /$$__  $$| $$__  $$      | $$/$$ $$ $$ |____  $$ /$$__  $$| $$$$   |____  $$ /$$__  $$ /$$__  $$      | $$      | $$  | $$| $$__  $$ /$$__  $$ /$$__  $$
//  | $$  $$$| $$| $$  \ $$| $$  | $$| $$$$$$$$| $$  \__/| $$  \ $$      | $$$$_  $$$$  /$$$$$$$| $$  \__/| $$_/    /$$$$$$$| $$  \__/| $$$$$$$$      | $$      | $$  | $$| $$  \ $$| $$$$$$$$| $$  | $$
//  | $$\  $ | $$| $$  | $$| $$  | $$| $$_____/| $$      | $$  | $$      | $$$/ \  $$$ /$$__  $$| $$      | $$     /$$__  $$| $$      | $$_____/      | $$    $$| $$  | $$| $$  | $$| $$_____/| $$  | $$
//  | $$ \/  | $$|  $$$$$$/|  $$$$$$$|  $$$$$$$| $$      | $$  | $$      | $$/   \  $$|  $$$$$$$| $$      | $$    |  $$$$$$$| $$      |  $$$$$$$      |  $$$$$$/|  $$$$$$/| $$$$$$$/|  $$$$$$$|  $$$$$$$
//  |__/     |__/ \______/  \_______/ \_______/|__/      |__/  |__/      |__/     \__/ \_______/|__/      |__/     \_______/|__/       \_______/       \______/  \______/ |_______/  \_______/ \_______/
@Mod(modid = ModReference.ID, name = ModReference.NAME, version = ModReference.VERSION, dependencies = "required-after:redcore@[0.2,);", guiFactory = "com.paneedah.weaponlib.config.ConfigGUIFactory", updateJSON = "https://raw.githubusercontent.com/Cubed-Development/Modern-Warfare-Cubed/master/update.json")
public final class MWC {

    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(ModReference.ID);

    public static final CreativeTabs ARMOR_TAB = new ArmorTab(CreativeTabs.getNextID(), "ArmorTab");
	public static final CreativeTabs ASSAULT_RIFLES_TAB = new AssaultRiflesTab(CreativeTabs.getNextID(), "AssaultRifles_tab");
	public static final CreativeTabs AMMO_TAB = new AmmoTab(CreativeTabs.getNextID(), "AmmoTab");
	public static final CreativeTabs ATTACHMENTS_TAB = new AttachmentsTab(CreativeTabs.getNextID(), "AttachmentsTab");
	public static final CreativeTabs GRENADES_TAB = new GrenadesTab(CreativeTabs.getNextID(), "GrenadesTab");
	public static final CreativeTabs GADGETS_TAB = new GadgetsTab(CreativeTabs.getNextID(), "GadgetsTab");
	public static final CreativeTabs PROPS_TAB = new PropsTab(CreativeTabs.getNextID(), "props_tab");
	public static final CreativeTabs BLOCKS_TAB = new BlocksTab(CreativeTabs.getNextID(), "BlocksTab");

    // Todo: Make this configurable via the future YAML config system from FBP, or Valkyrie integration, the later would be best.
    public static int bulletHitParticleMult = 6;

    @SidedProxy(serverSide = "com.paneedah.weaponlib.CommonModContext", clientSide = "com.paneedah.weaponlib.ClientModContext")
    public static ModContext modContext;

    @SidedProxy(serverSide = "com.paneedah.mwc.proxies.CommonProxy", clientSide = "com.paneedah.mwc.proxies.ClientProxy")
    public static CommonProxy commonProxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent) {
        commonProxy.preInit(this);
    }

    @EventHandler
    public void init(FMLInitializationEvent initializationEvent) {
        MWCRecipes.register();
        commonProxy.init(this);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent postInitializationEvent) {
        commonProxy.postInit(this, postInitializationEvent);
    }
    
    @EventHandler
    public void serverStarting(FMLServerStartingEvent serverStartingEvent) {
        serverStartingEvent.registerServerCommand(new BalancePackCommand());
        serverStartingEvent.registerServerCommand(new CraftingFileCommand());
        BalancePackManager.loadDirectory();
        CraftingFileManager.getInstance().loadDirectory();
    }
}
