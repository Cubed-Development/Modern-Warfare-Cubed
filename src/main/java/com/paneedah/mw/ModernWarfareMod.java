package com.paneedah.mw;

import com.paneedah.mw.creativetab.*;
import com.paneedah.mw.proxies.CommonProxy;
import com.paneedah.mw.utils.ModReference;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.command.BalancePackCommand;
import com.paneedah.weaponlib.command.CraftingFileCommand;
import com.paneedah.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.paneedah.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.ConfigurationManager;
import com.paneedah.weaponlib.crafting.CraftingFileManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

import javax.xml.transform.stream.StreamSource;
import java.io.File;

@Mod(modid = ModReference.id, version = ModernWarfareMod.VERSION, guiFactory = "com.paneedah.weaponlib.config.ConfigGUIFactory")
public class ModernWarfareMod {

	private static final String DEFAULT_CONFIG_RESOURCE = "/mw.cfg";
    private static final String MODERN_WARFARE_CONFIG_FILE_NAME = "ModernWarfare.cfg";
	public static final String VERSION = "@VERSION@";

    @SidedProxy(serverSide = "com.paneedah.weaponlib.CommonModContext", clientSide = "com.paneedah.weaponlib.ClientModContext")
    public static ModContext MOD_CONTEXT;

    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(ModReference.id);

    public static final CreativeTabs ArmorTab = new ArmorTab(CreativeTabs.getNextID(), "ArmorTab");
	public static final CreativeTabs AssaultRiflesTab = new AssaultRiflesTab(CreativeTabs.getNextID(), "AssaultRifles_tab");
	public static final CreativeTabs AmmoTab = new AmmoTab(CreativeTabs.getNextID(), "AmmoTab");
	public static final CreativeTabs AttachmentsTab = new AttachmentsTab(CreativeTabs.getNextID(), "AttachmentsTab");
	public static final CreativeTabs GrenadesTab = new GrenadesTab(CreativeTabs.getNextID(), "GrenadesTab");
	public static final CreativeTabs GadgetsTab = new GadgetsTab(CreativeTabs.getNextID(), "GadgetsTab");
	public static final CreativeTabs PropsTab = new PropsTab(CreativeTabs.getNextID(), "props_tab");
	public static final CreativeTabs BlocksTab = new BlocksTab(CreativeTabs.getNextID(), "BlocksTab");
	        
    @SidedProxy(serverSide = "com.paneedah.mw.proxies.CommonProxy", clientSide = "com.paneedah.mw.proxies.ClientProxy")
    public static CommonProxy proxy;

    private ConfigurationManager configurationManager;

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        initConfigurationManager(event);
        proxy.preInit(this, configurationManager, new CompatibleFmlPreInitializationEvent(event));
        initRecipies(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(this, configurationManager, new CompatibleFmlInitializationEvent(event));
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if (configurationManager != null)
            configurationManager.save();
        
        proxy.postInit(this, configurationManager, event);
    }
    
    @EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new BalancePackCommand());
        event.registerServerCommand(new CraftingFileCommand());
        BalancePackManager.loadDirectory();
        CraftingFileManager.getInstance().loadDirectory();
    }

    private void initConfigurationManager(FMLPreInitializationEvent event) {
        File parentDirectory = event.getSuggestedConfigurationFile().getParentFile();
	    File configFile = new File(MODERN_WARFARE_CONFIG_FILE_NAME);

	    if (parentDirectory != null)
	        configFile = new File(parentDirectory, MODERN_WARFARE_CONFIG_FILE_NAME);

		configurationManager = new ConfigurationManager.Builder()
		        .withUserConfiguration(configFile)
		        .withDefaultConfiguration(new StreamSource(getClass().getResourceAsStream(DEFAULT_CONFIG_RESOURCE)))
		        .build();
    }

    // ItemRecipes
    //@EventHandler
    public void initRecipies(FMLPreInitializationEvent event) {
        RecipeManager.init(MOD_CONTEXT);
    }
}
