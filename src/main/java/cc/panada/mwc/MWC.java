package cc.panada.mwc;

import cc.panada.mwc.handler.ConfigHandler;
import cc.panada.mwc.proxy.CommonProxy;
import cc.panada.mwc.utils.ModReference;
import cc.panada.mwc.gui.ResourcesTab;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = ModReference.MOD_ID, name = ModReference.NAME, version = ModReference.VERSION, guiFactory = "cc.panada.MWC.config.MWCConfigGuiFactory")
public class MWC {

    @Mod.Instance(ModReference.MOD_ID)
    public static MWC INSTANCE;

    public static final Minecraft mc = Minecraft.getMinecraft();

    public static final ResourceLocation bugIcon = new ResourceLocation(ModReference.MOD_ID + ":textures/gui/bugIcon.png");
    public static final ResourceLocation menuButtons = new ResourceLocation(ModReference.MOD_ID + ":textures/gui/menuButtons.png");

    public static File mainConfigFile;

    public static boolean exampleFeature;

    public static int exampleValue;

    public static float exampleDecimalValue;

    public MWC() {
        INSTANCE = this;
    }
    @SidedProxy(clientSide = ModReference.CLIENT_PROXY_CLASS, serverSide = ModReference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent) {
        mainConfigFile = new File(preInitializationEvent.getModConfigurationDirectory() + "/MWC/Config.txt");

        ConfigHandler.init();
        //KeyBindings.init();

        //MinecraftForge.EVENT_BUS.register(KeyInputHandler.class);
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent postInitializationEvent) {
        //MinecraftForge.EVENT_BUS.register(new GuiHandler());
    }

    public static final CreativeTabs ResourcesTab = new ResourcesTab(CreativeTabs.getNextID(),"resourcestab");
}
