package com.paneedah.mwc;

import com.paneedah.mwc.client.ClientConfig;
import com.paneedah.mwc.client.ClientProxy;
import com.paneedah.mwc.common.CommonConfig;
import com.paneedah.mwc.common.CommonProxy;
import com.paneedah.mwc.content.ContentPackHandler;
import com.paneedah.mwc.client.ModRegistry;
import com.paneedah.mwc.client.CTRegistry;
import com.paneedah.mwc.content.types.PackFile;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.commons.compress.utils.IOUtils;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.*;
import java.util.*;

@Mod(ModernWarfareCubed.MOD_ID)
public class ModernWarfareCubed {
    public static HashMap<String, PackFile> packs = new HashMap<String, PackFile>();
    public static PackFile contentFolder;
    public static File logFile;
    public static final String MOD_ID = "mwc";
    public static final Logger logger = LogManager.getLogger("MWC");

    public ModernWarfareCubed() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ClientConfig.SPEC, "mwc-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.SPEC, "mwc-common.toml");

        ModRegistry.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static CommonProxy proxy = new ClientProxy();

    private void commonSetup(FMLClientSetupEvent event) {
        contentFolder = new PackFile(FMLPaths.GAMEDIR.get() + "/MWC");
        if(contentFolder.mkdirs()) logger.info("Content folder not found, creating new empty folder.");

        if(CommonConfig.LOAD_DEFAULT_CP.get()) {
            logger.info("Downloading/Installing default content pack.");

            InputStream inputStream = getClass().getResourceAsStream("MWC.jar");
            File mwc = new File("MWC.jar");

            try {
                OutputStream outputStream = new FileOutputStream(mwc);
                IOUtils.copy(Objects.requireNonNull(inputStream, "NullPointer when making input stream of default content pack."), outputStream);
                outputStream.close();
                if (!mwc.exists()) {
                    try {
                        logger.log(Level.INFO, "Copying files to the world...");
                        FileUtils.copyDirectory(mwc, contentFolder);
                    } catch (IOException e) {
                        e.printStackTrace();
                        logger.log(Level.ERROR, "There was an error during copy, the content pack could not be found.");
                    }
                }
            } catch (Exception e) {
                logger.error("An error occurred when loading default content pack.");
                logger.throwing(e);
            }
            CommonConfig.LOAD_DEFAULT_CP.set(false);
        }

        logFile = new File(FMLPaths.GAMEDIR.get().toString(), "log.txt");
        if(logFile.mkdirs()) logger.info("Log file not found, creating new one.");

        ContentPackHandler.loadContent();
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == CTRegistry.BaseTab) {
            // INGOTS
            event.accept(ModRegistry.GUNMETAL_INGOT);
            event.accept(ModRegistry.STEEL_INGOT);
            event.accept(ModRegistry.ALUMINUM_INGOT);
            event.accept(ModRegistry.LEAD_INGOT);
            event.accept(ModRegistry.TITANIUM_INGOT);
            event.accept(ModRegistry.TUNGSTEN_INGOT);
            event.accept(ModRegistry.URANIUM_INGOT);
            event.accept(ModRegistry.OBSENUM_INGOT);

            // NUGGETS
            event.accept(ModRegistry.GUNMETAL_NUGGET);
            event.accept(ModRegistry.STEEL_NUGGET);
            event.accept(ModRegistry.ALUMINUM_NUGGET);
            event.accept(ModRegistry.LEAD_NUGGET);
            event.accept(ModRegistry.TITANIUM_NUGGET);
            event.accept(ModRegistry.TUNGSTEN_NUGGET);
            event.accept(ModRegistry.URANIUM_NUGGET);
            event.accept(ModRegistry.OBSENUM_NUGGET);

            // PLATES
            event.accept(ModRegistry.GUNMETAL_PLATE);
            event.accept(ModRegistry.STEEL_PLATE);
            event.accept(ModRegistry.ALUMINUM_PLATE);
            event.accept(ModRegistry.LEAD_PLATE);
            event.accept(ModRegistry.TITANIUM_PLATE);
            event.accept(ModRegistry.TUNGSTEN_PLATE);
            event.accept(ModRegistry.URANIUM_PLATE);
            event.accept(ModRegistry.OBSENUM_PLATE);

            // RAWS
            event.accept(ModRegistry.RAW_ALUMINUM);
            event.accept(ModRegistry.RAW_LEAD);
            event.accept(ModRegistry.RAW_TITANIUM);
            event.accept(ModRegistry.RAW_TUNGSTEN);
            event.accept(ModRegistry.RAW_URANIUM);
            event.accept(ModRegistry.RAW_POTASSIUM);

            // OTHER
            event.accept(ModRegistry.SULFUR);
            event.accept(ModRegistry.SALT_PETER);
            event.accept(ModRegistry.GRAPHITE);
            event.accept(ModRegistry.KEVLAR);
            event.accept(ModRegistry.LENS);
            event.accept(ModRegistry.SYNTHETIC_PLASTIC);
            event.accept(ModRegistry.SYNTHETIC_POLYMER_COMPOSITE);

            // TOOLS
            event.accept(ModRegistry.STIMPAK);
            event.accept(ModRegistry.EMPTY_SYRINGE);

            // ORES
            event.accept(ModRegistry.SULFUR_ORE);
            event.accept(ModRegistry.NITER_ORE);
            event.accept(ModRegistry.ALUMINUM_ORE);
            event.accept(ModRegistry.LEAD_ORE);
            event.accept(ModRegistry.GRAPHITE_ORE);
            event.accept(ModRegistry.TITANIUM_ORE);
            event.accept(ModRegistry.URANIUM_ORE);
            event.accept(ModRegistry.TUNGSTEN_ORE);
        }
    }
}
