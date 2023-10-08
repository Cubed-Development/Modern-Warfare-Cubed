package com.paneedah.mwc.content;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.paneedah.mwc.ModernWarfareCubed;
import com.paneedah.mwc.client.ModRegistry;
import com.paneedah.mwc.content.types.PackFile;
import com.paneedah.mwc.content.types.PackZip;
import com.paneedah.mwc.content.types.TypeFile;
import com.paneedah.mwc.content.types.Types;
import com.paneedah.mwc.utils.Log;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

public class PackLoader {
    private final PackFile pack;
    private PackZip packZip = null;

    public PackLoader(PackFile pack) {
        this.pack = pack;
        try {
            this.packZip = new PackZip(pack);
        } catch (Exception e) {
            ModernWarfareCubed.log("A pack could not be loaded as a zip, now trying directory: " + pack.getName(), Log.INFO);
        }
        registerPack();
    }

    public void registerPack() {
        try {
            if(pack.isDirectory()) {
                File packJson = new File(pack, "/pack.json");
                if(packJson.exists()) {
                    handleLoadingDirectory();
                } else
                    ModernWarfareCubed.log("A possible content pack in MWC folder, failed to load due to missing pack.json", Log.WARN);
            } else if(ContentPackHandler.zipJar.matcher(pack.getName()).matches()) {
                ZipFile zip = new ZipFile(pack);
                ZipEntry entry = zip.getEntry("pack.json");
                if(entry != null && !entry.isDirectory()) {
                    handleLoadingZip();
                } else
                    ModernWarfareCubed.log("A possible content pack in MWC folder, failed to load due to missing pack.json", Log.WARN);
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void handleLoadingZip() {
        try {
            loadArchivePackInfo();
            File pack = null;
            for(Types type : TypeFile.files.keySet()) {
                if(type == Types.INFO) {
                    ArrayList<TypeFile> packs = TypeFile.files.get(type);
                    for(TypeFile possibleFile : packs) {
                        if(possibleFile.packName.equals(this.pack.getName()) && possibleFile.name.equals("pack.json")) {
                            pack = possibleFile.getAsFile();
                        }
                    }
                }

            }
            if(pack != null) {
                InputStream is = new FileInputStream(pack);
                int size = is.available();
                byte[] buffer = new byte[size];
                is.read(buffer);
                is.close();
                String json = new String(buffer, StandardCharsets.UTF_8);
                JsonObject obj = JsonParser.parseString(json).getAsJsonObject();
                if(obj.get("name").getAsString() == null || obj.get("id").getAsString() == null) {
                    ModernWarfareCubed.log("Content pack load failed due to missing name/id entry in pack.json", Log.ERROR);
                    return;
                }
                if(loadPackInfo(obj)){
                    loadArchive();
                    ModernWarfareCubed.log("["+this.pack.getPackName()+"] Successfully loaded!", Log.INFO);
                }
                ItemLoader items = new ItemLoader();
            } else ModernWarfareCubed.log("Pack.json was null while loading archive pack info.", Log.ERROR);
        } catch (Exception e) {
            ModernWarfareCubed.log("Error while handling a content pack as zip: "+pack.getName(), Log.ERROR);
            ModernWarfareCubed.log(ExceptionUtils.getStackTrace(e), Log.ERROR);
        }
    }

    private void handleLoadingDirectory() {
        ModernWarfareCubed.packs.put(pack.getName(), pack);
        try {
            JsonObject obj = (JsonObject) JsonParser.parseReader(new FileReader(new File(pack, "pack.json")));
            if(loadPackInfo(obj)) {
                loadDirectory();
                ItemLoader items = new ItemLoader();
                ModernWarfareCubed.log("["+this.pack.getPackName()+"] Successfully loaded!", Log.INFO);
            }
        } catch (Exception e) {
            ModernWarfareCubed.log("Error while handling a content pack as directory: ", Log.ERROR);
            ModernWarfareCubed.log(ExceptionUtils.getStackTrace(e), Log.ERROR);
        }
    }

    private boolean loadPackInfo(JsonObject obj) {
        String packName, packId;
        if((packId = obj.get("id").getAsString()) == null | (packName = obj.get("name").getAsString()) == null) {
            ModernWarfareCubed.log("Content pack load failed due to missing name/id entry in pack.json", Log.ERROR);
            return false;
        }
        if(!pack.setPackName(packName)) {
            ModernWarfareCubed.log("Content pack failed to load due to invalid name ["+packName+"]. Characters allowed include A-B|0-9|_|space", Log.ERROR);
            return false;
        }
        if(!pack.setPackId(packId)) {
            ModernWarfareCubed.log("Content pack failed to load due to invalid id ["+packId+"]. Characters allowed include A-B|0-9|_", Log.ERROR);
            return false;
        }
        return true;
    }

    private void loadArchivePackInfo() {
        try {
            ZipInputStream zipStream = new ZipInputStream(new FileInputStream(pack));
            BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream));
            ZipEntry entry;
            do {
                entry = zipStream.getNextEntry();
                if(entry == null)
                    continue;
                if(entry.isDirectory())
                    continue;
                TypeFile packFile = null;
                if(entry.getName().equals("pack.json")) {
                    packFile = new TypeFile(pack.getName(), "", Types.INFO, "pack.json");
                }
                if(packFile == null) continue;
                do {
                    String line = null;
                    try {
                        line = reader.readLine();
                    }
                    catch(Exception e) {
                        ModernWarfareCubed.log("An error occurred while loading: "+this.pack.getName()+"/pack.json", Log.ERROR);
                        e.printStackTrace();
                        break;
                    }
                    if(line == null)
                        break;
                    packFile.parseLine(line);
                } while (true);
                break;
            } while(true);
        } catch (Exception e) {
            ModernWarfareCubed.log("Error while handling a pack.json for zip: "+pack.getName(), Log.ERROR);
            ModernWarfareCubed.log(ExceptionUtils.getStackTrace(e), Log.ERROR);
        }
    }

    private void loadArchive() {
        try {
            ZipInputStream zipStream = new ZipInputStream(new FileInputStream(pack));
            BufferedReader reader = new BufferedReader(new InputStreamReader(zipStream));
            ZipEntry entry;
            do {
                entry = zipStream.getNextEntry();
                if(entry == null)
                    continue;
                if(entry.isDirectory())
                    continue;
                TypeFile typeFile = null;
                for(Types type : Types.values()) {
                    if(entry.getName().startsWith(type.folderName + "/") && entry.getName().split(type.folderName + "/").length > 1 && entry.getName().split(type.folderName + "/")[1].length() > 0) {
                        String[] splitName = entry.getName().split("/");
                        typeFile = new TypeFile(pack.getName(), type.folderName, type, splitName[splitName.length - 1].split("\\.")[0]);
                    }
                }
                if(typeFile == null) continue;
                do {
                    String line = null;
                    try {
                        line = reader.readLine();
                    }
                    catch(Exception e) {
                        ModernWarfareCubed.log("["+pack.getPackName()+"] An error occurred while loading "+typeFile.name, Log.ERROR);
                        ModernWarfareCubed.log(ExceptionUtils.getStackTrace(e), Log.ERROR);
                        break;
                    }
                    if(line == null)
                        break;
                    typeFile.parseLine(line);
                } while (true);
            } while(entry != null);
            reader.close();
            packZip.close();
            zipStream.close();
        }
        catch(Exception e) {
            ModernWarfareCubed.log("["+pack.getPackName()+"] An error occurred during loadArchive()", Log.ERROR);
            ModernWarfareCubed.log(ExceptionUtils.getStackTrace(e), Log.ERROR);
        }
    }

    private void loadDirectory() {
        for(Types type : Types.values()) {
            if(type == Types.INFO) continue;
            File folder = new File(this.pack, type.folderName);
            File[] files = folder.listFiles();
            if(files == null || files.length == 0) {
                ModernWarfareCubed.log("["+this.pack.getPackName()+"] No "+type.folderName+" were loaded.", Log.WARN);
            } else {
                for(File file : Objects.requireNonNull(files)) {
                    TypeFile newEntry = new TypeFile(this.pack.getName(), type.folderName, type, file.getName());
                }
            }
        }
    }

    // -------------------------------------------------- REGISTER ITEMS --------------------------------------------------
    private class ItemLoader {

        public ItemLoader() throws IOException {
            registerItems();
        }

        public void registerItems() throws IOException {
            for(Types type : TypeFile.files.keySet()) {
                switch (type) {
                    case ITEM:
                        if (TypeFile.files.get(type).isEmpty()) continue;
                        for (TypeFile item : TypeFile.files.get(type)) {
                            makeItem(item.getAsFile());
                        }
                }
            }
        }

        public void makeItem(File itemJson) {
            try {
                JsonObject obj = (JsonObject) JsonParser.parseReader(new FileReader(itemJson));
                RegistryObject<Item> item = ModRegistry.ITEMS.register(obj.get("id").getAsString(), () -> new Item(new Item.Properties()));
                LangLoader.list.put(item.get(), obj.get("name").getAsString());
                if(ModRegistry.items.contains(item)) {
                    ModernWarfareCubed.log("Cancelled loading for duplicate item: "+obj.get("name").getAsString()+" ("+obj.get("id").getAsString()+")", Log.WARN);
                    return;
                }
                ModRegistry.items.add(item);
            } catch (Exception e) {
                ModernWarfareCubed.log("Error in making an item:", Log.WARN);
                ModernWarfareCubed.log(ExceptionUtils.getStackTrace(e), Log.ERROR);
            }
        }
    }

    // ---------------------------------------------- REGISTER ITEM NAMES ----------------------------------------------
    public static class LangLoader {
        public static HashMap<Item, String> list = new HashMap<Item, String>();
        public static void addEntry(Item key, String value) {
            // LangProvider already handles duplicates
            list.put(key, value);
        }
    }
}
