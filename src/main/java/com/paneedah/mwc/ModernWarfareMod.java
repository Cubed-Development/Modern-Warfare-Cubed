package com.paneedah.mwc;

import com.paneedah.mwc.creativetab.*;
import com.paneedah.mwc.handlers.ClientEventHandler;
import com.paneedah.mwc.init.MWCRecipes;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.utils.ModReference;
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

@Mod(modid = ModReference.id, name = ModReference.name, version = ModReference.version, guiFactory = "com.paneedah.weaponlib.config.ConfigGUIFactory")
public class ModernWarfareMod {

    private static final String DEFAULT_CONFIG_RESOURCE = "/mwc.cfg";

    @SidedProxy(serverSide = "com.paneedah.weaponlib.CommonModContext", clientSide = "com.paneedah.weaponlib.ClientModContext")
    public static ModContext MOD_CONTEXT;

    // Todo: Make this configurable via the future YAML config system from FBP.
    public static int bulletHitParticleMult = 6;

    public static final SimpleNetworkWrapper CHANNEL = NetworkRegistry.INSTANCE.newSimpleChannel(ModReference.id);

    public static final CreativeTabs ArmorTab = new ArmorTab(CreativeTabs.getNextID(), "ArmorTab");
	public static final CreativeTabs AssaultRiflesTab = new AssaultRiflesTab(CreativeTabs.getNextID(), "AssaultRifles_tab");
	public static final CreativeTabs AmmoTab = new AmmoTab(CreativeTabs.getNextID(), "AmmoTab");
	public static final CreativeTabs AttachmentsTab = new AttachmentsTab(CreativeTabs.getNextID(), "AttachmentsTab");
	public static final CreativeTabs GrenadesTab = new GrenadesTab(CreativeTabs.getNextID(), "GrenadesTab");
	public static final CreativeTabs GadgetsTab = new GadgetsTab(CreativeTabs.getNextID(), "GadgetsTab");
	public static final CreativeTabs PropsTab = new PropsTab(CreativeTabs.getNextID(), "props_tab");
	public static final CreativeTabs BlocksTab = new BlocksTab(CreativeTabs.getNextID(), "BlocksTab");
	        
    @SidedProxy(serverSide = "com.paneedah.mwc.proxies.CommonProxy", clientSide = "com.paneedah.mwc.proxies.ClientProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLPreInitializationEvent event) {
        proxy.preInit(this);

        if (event.getSide() == Side.CLIENT)
            MinecraftForge.EVENT_BUS.register(ClientEventHandler.class);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        // Recipes
        MWCRecipes.register();
        proxy.init(this);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(this, event);
    }
    
    @EventHandler
    public void onServerStarting(FMLServerStartingEvent event) {
        event.registerServerCommand(new BalancePackCommand());
        event.registerServerCommand(new CraftingFileCommand());
        BalancePackManager.loadDirectory();
        CraftingFileManager.getInstance().loadDirectory();
    }
}
