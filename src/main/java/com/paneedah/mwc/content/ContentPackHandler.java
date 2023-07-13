package com.paneedah.mwc.content;

import com.paneedah.mwc.ModernWarfareCubed;
import com.paneedah.mwc.content.types.PackFile;

import java.util.Objects;
import java.util.regex.Pattern;

public class ContentPackHandler {
    protected static Pattern zipJar = Pattern.compile("(.+)\\.(zip|jar)$");
    public static void loadContent() {
        ModernWarfareCubed.packs.clear();
        ModernWarfareCubed.logger.info("Content pack loading started.");
        for(PackFile file : Objects.requireNonNull(ModernWarfareCubed.contentFolder.listFiles(), "No content packs were found! If you believe this is incorrect then please contact mod support.")) {
            if(file.isDirectory() || zipJar.matcher(file.getName()).matches()) {
                if(ModernWarfareCubed.packs.containsKey(file.getName())) {
                    ModernWarfareCubed.logger.info("Skipping loading content pack as it is duplicate: " + file.getName());
                } else {
                    ModernWarfareCubed.logger.info("Loading content pack: " + file.getName());
                    PackLoader pl = new PackLoader(file);
                    ModernWarfareCubed.packs.put(file.getName(), file);
                }
            }
        }
        ModernWarfareCubed.logger.info("Content pack loading ended.");
    }

}
