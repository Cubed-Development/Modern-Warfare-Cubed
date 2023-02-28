package cc.panada.mwc;

import cc.panada.mwc.handler.ConfigHandler;
import cc.panada.mwc.utils.ModReference;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = ModReference.MOD_ID, name = ModReference.NAME, version = ModReference.VERSION)
public class MWC {

    @Mod.Instance(ModReference.MOD_ID)
    public static MWC INSTANCE;

    public static final Minecraft mc = Minecraft.getMinecraft();

    public static File mainConfigFile;

    public static boolean exampleFeature;

    public static int exampleValue;

    public static float exampleDecimalValue;

    public MWC() {
        INSTANCE = this;
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent) {
        mainConfigFile = new File(preInitializationEvent.getModConfigurationDirectory() + "/MWC/Config.txt");

        ConfigHandler.init();
        //KeyBindings.init();

        //MinecraftForge.EVENT_BUS.register(KeyInputHandler.class);
    }
}
