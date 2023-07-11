package com.paneedah.mwc;

import com.paneedah.mwc.creativetab.*;
import com.paneedah.mwc.handlers.ClientEventHandler;
import com.paneedah.mwc.init.MWCRecipes;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.utils.OptiNotFine;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.command.BalancePackCommand;
import com.paneedah.weaponlib.command.CraftingFileCommand;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import com.paneedah.mwc.renderer.EquipmentRenderer;
import net.minecraft.client.Minecraft;
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
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.utils.ModReference.ID;
import static com.paneedah.mwc.utils.ModReference.NAME;
import static com.paneedah.mwc.utils.ModReference.VERSION;

//   /$$      /$$                 /$$                                     /$$      /$$                      /$$$$$$                                     /$$$$$$            /$$                       /$$
//  | $$$    /$$$                | $$                                    | $$  /$ | $$                     /$$__  $$                                   /$$__  $$          | $$                      | $$
//  | $$$$  /$$$$  /$$$$$$   /$$$$$$$  /$$$$$$   /$$$$$$  /$$$$$$$       | $$ /$$$| $$  /$$$$$$   /$$$$$$ | $$  \__//$$$$$$   /$$$$$$   /$$$$$$       | $$  \__/ /$$   /$$| $$$$$$$   /$$$$$$   /$$$$$$$
//  | $$ $$/$$ $$ /$$__  $$ /$$__  $$ /$$__  $$ /$$__  $$| $$__  $$      | $$/$$ $$ $$ |____  $$ /$$__  $$| $$$$   |____  $$ /$$__  $$ /$$__  $$      | $$      | $$  | $$| $$__  $$ /$$__  $$ /$$__  $$
//  | $$  $$$| $$| $$  \ $$| $$  | $$| $$$$$$$$| $$  \__/| $$  \ $$      | $$$$_  $$$$  /$$$$$$$| $$  \__/| $$_/    /$$$$$$$| $$  \__/| $$$$$$$$      | $$      | $$  | $$| $$  \ $$| $$$$$$$$| $$  | $$
//  | $$\  $ | $$| $$  | $$| $$  | $$| $$_____/| $$      | $$  | $$      | $$$/ \  $$$ /$$__  $$| $$      | $$     /$$__  $$| $$      | $$_____/      | $$    $$| $$  | $$| $$  | $$| $$_____/| $$  | $$
//  | $$ \/  | $$|  $$$$$$/|  $$$$$$$|  $$$$$$$| $$      | $$  | $$      | $$/   \  $$|  $$$$$$$| $$      | $$    |  $$$$$$$| $$      |  $$$$$$$      |  $$$$$$/|  $$$$$$/| $$$$$$$/|  $$$$$$$|  $$$$$$$
//  |__/     |__/ \______/  \_______/ \_______/|__/      |__/  |__/      |__/     \__/ \_______/|__/      |__/     \_______/|__/       \_______/       \______/  \______/ |_______/  \_______/ \_______/
@Mod(modid = ID, name = NAME, version = VERSION, dependencies = "required-after:redcore@[0.2,);", guiFactory = "com.paneedah.weaponlib.config.ConfigGUIFactory", updateJSON = "https://raw.githubusercontent.com/Cubed-Development/Modern-Warfare-Cubed/master/update.json")
public final class MWC {

    /**
     * Static final reference to the Minecraft Client instance.
     */
    @SideOnly(Side.CLIENT)
    public static final Minecraft MC = Minecraft.getMinecraft();

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
        if (preInitializationEvent.getSide() == Side.CLIENT)
            MinecraftForge.EVENT_BUS.register(ClientEventHandler.class);

        commonProxy.preInit(this);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent initializationEvent) {
        if (initializationEvent.getSide() == Side.CLIENT) {
            MC.getRenderManager().getSkinMap().forEach((model, playerRenderer) -> playerRenderer.addLayer(new EquipmentRenderer(playerRenderer)));

            if (OptiNotFine.isOptiFineInstalled())
                MinecraftForge.EVENT_BUS.register(OptiNotFine.class);
        }

        MWCRecipes.register();
        commonProxy.init(this);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInitializationEvent) {
        commonProxy.postInit(this, postInitializationEvent);
    }

    @Mod.EventHandler
    public void serverStarting(FMLServerStartingEvent serverStartingEvent) {
        serverStartingEvent.registerServerCommand(new BalancePackCommand());
        serverStartingEvent.registerServerCommand(new CraftingFileCommand());
        BalancePackManager.loadDirectory();
        CraftingFileManager.getInstance().loadDirectory();
    }
}
