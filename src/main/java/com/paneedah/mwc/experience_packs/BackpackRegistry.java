package com.paneedah.mwc.experience_packs;

import com.google.gson.*;
import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.weaponlib.ModContext;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
import java.util.jar.JarFile;

public class BackpackRegistry implements IExpPackRegistry {

    private static final Gson GSON = new Gson();
    private static final String BACKPACK_PATH = "assets/mwc/experience_packs/backpacks";
    private static final File CONFIG_BACKPACK_DIR = new File("config/mwc/experience_packs/backpacks");
    private static final Map<String, ItemBackpack> BACKPACKS = new HashMap<>();

    public static void loadAll(ModContext modContext) {
        try {
            if (!CONFIG_BACKPACK_DIR.exists()) CONFIG_BACKPACK_DIR.mkdirs();

            extractBackpackFilesToConfig();

            File[] files = CONFIG_BACKPACK_DIR.listFiles((dir, name) -> name.endsWith(".json"));
            if (files == null) return;

            for (File file : files) {
                String jsonName = file.getName().replace(".json", "");
                try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file))) {
                    JsonObject json = GSON.fromJson(reader, JsonObject.class);
                    ItemBackpack backpack = buildBackpackFromJson(json);
                    BACKPACKS.put(jsonName, backpack);

                    System.out.println("[MWC] Loaded backpack: " + jsonName);
                } catch (Exception ex) {
                    System.err.println("[MWC] Failed to load backpack json: " + file.getAbsolutePath());
                    ex.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ItemBackpack getBackpack(String name) {
        ItemBackpack bp = BACKPACKS.get(name);
        if (bp != null) return bp;
        throw new RuntimeException("Null Backpack: " + name);
    }

    private static void extractBackpackFilesToConfig() {
        try {
            List<String> jarFiles = getBackpackFiles();
            for (String path : jarFiles) {
                String fileName = path.substring(path.lastIndexOf('/') + 1);
                File outFile = new File(CONFIG_BACKPACK_DIR, fileName);

                if (!outFile.exists()) {
                    try (InputStream in = BackpackRegistry.class.getClassLoader().getResourceAsStream(path)) {
                        if (in == null) continue;
                        java.nio.file.Files.copy(in, outFile.toPath());
                        System.out.println("[MWC] Extracted backpack JSON: " + outFile.getAbsolutePath());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<String> getBackpackFiles() throws Exception {
        List<String> files = new ArrayList<>();
        URL dirURL = BackpackRegistry.class.getClassLoader().getResource(BACKPACK_PATH);
        if (dirURL == null) {
            System.err.println("[MWC] Backpack folder not found: " + BACKPACK_PATH);
            return files;
        }

        if ("file".equals(dirURL.getProtocol())) {
            File directory = new File(dirURL.toURI());
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.getName().endsWith(".json")) files.add(BACKPACK_PATH + "/" + file.getName());
            }
        } else if ("jar".equals(dirURL.getProtocol())) {
            String jarPath = dirURL.getPath().substring(5, dirURL.getPath().indexOf("!"));
            try (JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"))) {
                Enumeration<java.util.jar.JarEntry> entries = jar.entries();
                while (entries.hasMoreElements()) {
                    String name = entries.nextElement().getName();
                    if (name.startsWith(BACKPACK_PATH) && name.endsWith(".json")) files.add(name);
                }
            }
        }
        return files;
    }

    private static ItemBackpack buildBackpackFromJson(JsonObject json) throws Exception {
        String name = json.get("name").getAsString();
        int size = json.get("size").getAsInt();

        JsonObject modelObj = json.getAsJsonObject("model");
        String modelClass = modelObj.get("class").getAsString();
        String modelTexture = modelObj.get("texture").getAsString();
        Object modelInstance = Class.forName(modelClass).getDeclaredConstructor().newInstance();

        ItemBackpack.Builder builder = new ItemBackpack.Builder()
                .withName(name)
                .withSize(size)
                .withModel(modelInstance.getClass().getSimpleName())
                .withTexture(modelTexture);

        if (json.has("positions")) {
            JsonObject positions = json.getAsJsonObject("positions");
            if (positions.has("inventory")) {
                builder.withInventoryPositioning(() ->
                        RegUtil.applyTransform(positions.getAsJsonArray("inventory")));
            }
            if (positions.has("firstPerson")) {
                builder.withFirstPersonModelPositioning(modelBase ->
                        RegUtil.applyTransform(positions.getAsJsonArray("firstPerson")));
            }
        }

        return builder.build();
    }
}
