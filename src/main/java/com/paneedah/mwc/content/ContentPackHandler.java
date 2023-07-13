package com.paneedah.mwc.content;

import com.paneedah.mwc.ModernWarfare;
import com.paneedah.mwc.content.types.PackFile;

import java.util.Objects;
import java.util.regex.Pattern;

public class ContentPackHandler {
    protected static Pattern zipJar = Pattern.compile("(.+)\\.(zip|jar)$");
    public static void loadContent() {
        ModernWarfare.packs.clear();
        ModernWarfare.logger.info("Content pack loading started.");
        for(PackFile file : Objects.requireNonNull(ModernWarfare.contentFolder.listFiles(), "No content packs were found! If you believe this is incorrect then please contact mod support.")) {
            if(file.isDirectory() || zipJar.matcher(file.getName()).matches()) {
                if(ModernWarfare.packs.containsKey(file.getName())) {
                    ModernWarfare.logger.info("Skipping loading content pack as it is duplicate: " + file.getName());
                } else {
                    ModernWarfare.logger.info("Loading content pack: " + file.getName());
                    PackLoader pl = new PackLoader(file);
                    ModernWarfare.packs.put(file.getName(), file);
                }
            }
        }
        ModernWarfare.logger.info("Content pack loading ended.");
    }

}
