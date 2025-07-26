package com.paneedah.mwc.experience_packs;

import com.google.gson.*;
import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.ItemBullet;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.io.*;
import java.net.URL;
import java.net.URLDecoder;
import java.util.*;
import java.util.jar.JarFile;

public class BulletRegistry {

    private static final Gson GSON = new Gson();
    private static final String BULLET_PATH = "assets/mwc/experience_packs/bullets";
    private static final File CONFIG_BULLET_DIR = new File("config/mwc/experience_packs/bullets");
    private static final Map<String, ItemBullet> BULLETS = new HashMap<>();

    public static void loadAllBullets(ModContext modContext) {
        try {
            // Ensure config directory exists
            if (!CONFIG_BULLET_DIR.exists()) {
                CONFIG_BULLET_DIR.mkdirs();
            }

            // Extract bullet JSON files to config if they do not exist
            extractBulletFilesToConfig();

            // Load bullet JSONs from config directory
            File[] bulletFiles = CONFIG_BULLET_DIR.listFiles((dir, name) -> name.endsWith(".json"));
            if (bulletFiles == null) return;

            for (File file : bulletFiles) {
                String jsonName = file.getName().replace(".json", "");
                try (InputStreamReader reader = new InputStreamReader(new FileInputStream(file))) {
                    JsonObject json = GSON.fromJson(reader, JsonObject.class);
                    ItemBullet bullet = buildBulletFromJson(json, modContext);
                    BULLETS.put(jsonName, bullet);

                    System.out.println("[MWC] Loaded bullet: " + jsonName);
                } catch (Exception ex) {
                    System.err.println("[MWC] Failed to load bullet json: " + file.getAbsolutePath());
                    ex.printStackTrace();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ItemBullet getBullet(String name) {
        return BULLETS.get(name);
    }

    private static void extractBulletFilesToConfig() {
        try {
            List<String> jarBulletFiles = getBulletFiles(); // Get JSONs from assets
            for (String path : jarBulletFiles) {
                String fileName = path.substring(path.lastIndexOf('/') + 1);
                File outFile = new File(CONFIG_BULLET_DIR, fileName);

                if (!outFile.exists()) {
                    try (InputStream in = BulletRegistry.class.getClassLoader().getResourceAsStream(path)) {
                        if (in == null) continue;
                        java.nio.file.Files.copy(in, outFile.toPath());
                        System.out.println("[MWC] Extracted bullet JSON: " + outFile.getAbsolutePath());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<String> getBulletFiles() throws Exception {
        List<String> files = new ArrayList<>();

        URL dirURL = BulletRegistry.class.getClassLoader().getResource(BULLET_PATH);
        if (dirURL == null) {
            System.err.println("[MWC] Bullet folder not found: " + BULLET_PATH);
            return files;
        }

        if ("file".equals(dirURL.getProtocol())) {
            // Dev environment
            File directory = new File(dirURL.toURI());
            for (File file : Objects.requireNonNull(directory.listFiles())) {
                if (file.getName().endsWith(".json")) {
                    files.add(BULLET_PATH + "/" + file.getName());
                }
            }
        } else if ("jar".equals(dirURL.getProtocol())) {
            // Inside jar
            String jarPath = dirURL.getPath().substring(5, dirURL.getPath().indexOf("!"));
            try (JarFile jar = new JarFile(URLDecoder.decode(jarPath, "UTF-8"))) {
                Enumeration<java.util.jar.JarEntry> entries = jar.entries();
                while (entries.hasMoreElements()) {
                    String name = entries.nextElement().getName();
                    if (name.startsWith(BULLET_PATH) && name.endsWith(".json")) {
                        files.add(name);
                    }
                }
            }
        }

        return files;
    }

    private static ItemBullet buildBulletFromJson(JsonObject json, ModContext modContext) throws Exception {
        String name = json.get("name").getAsString();
        int maxStackSize = json.get("maxStackSize").getAsInt();
        String textureName = json.get("textureName").getAsString();

        // Model
        JsonObject modelObj = json.getAsJsonObject("model");
        String modelClass = modelObj.get("class").getAsString();
        String modelTexture = modelObj.get("texture").getAsString();
        Object modelInstance = Class.forName(modelClass).getDeclaredConstructor().newInstance();

        // Build bullet with base properties
        ItemBullet.Builder builder = (ItemBullet.Builder) new ItemBullet.Builder()
                .withName(name)
                .withMaxStackSize(maxStackSize)
                .withCreativeTab(MWC.AMMUNITION_AND_MAGAZINES_TAB)
                .withModel((ModelBase) modelInstance, modelTexture)
                .withFirstPersonPositioning(() ->
                        applyTransform(json.getAsJsonObject("positions").getAsJsonArray("firstPerson")))
                .withThirdPersonPositioning(() ->
                        applyTransform(json.getAsJsonObject("positions").getAsJsonArray("thirdPerson")))
                .withInventoryPositioning(() ->
                        applyTransform(json.getAsJsonObject("positions").getAsJsonArray("inventory")))
                .withTextureName(textureName);

        // Optional crafting section
        if (json.has("crafting")) {
            JsonObject crafting = json.getAsJsonObject("crafting");
            int craftingAmount = crafting.get("amount").getAsInt();
            CraftingComplexity complexity = CraftingComplexity.valueOf(
                    crafting.get("complexity").getAsString().toUpperCase(Locale.ROOT));
            Object[] ingredients = parseIngredients(crafting.getAsJsonArray("ingredients"));
            builder.withCrafting(craftingAmount, complexity, ingredients);
        } else {
            System.out.println("[MWC] Bullet " + name + " has no crafting recipe defined.");
        }

        return builder.build(modContext, ItemBullet.class);
    }

    /**
     * Accepts:
     *  - "ingotCopper" (OreDict)
     *  - "minecraft:gunpowder" (registry item)
     *  - { "ore": "plateSteel" }
     *  - { "item": "minecraft:gunpowder", "meta": 0, "count": 2 }
     */
    private static Object[] parseIngredients(JsonArray array) {
        List<Object> list = new ArrayList<>();
        for (JsonElement el : array) {
            Object ingredient = parseIngredient(el);
            if (ingredient != null) {
                list.add(ingredient);
            } else {
                System.err.println("[MWC] Skipping null ingredient from JSON: " + el.toString());
            }
        }
        return list.toArray(new Object[0]);
    }

    private static Object parseIngredient(JsonElement el) {
        if (el.isJsonPrimitive()) {
            // Could be ore name or registry name
            String val = el.getAsString();
            if (val.contains(":")) {
                Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(val));
                if (item == null) {
                    System.err.println("[MWC] Unknown item registry name: " + val);
                    return null;
                }
                return item;
            } else {
                return val; // OreDict name
            }
        } else if (el.isJsonObject()) {
            JsonObject obj = el.getAsJsonObject();
            if (obj.has("ore")) {
                return obj.get("ore").getAsString();
            }
            if (obj.has("item")) {
                String rl = obj.get("item").getAsString();
                int meta = obj.has("meta") ? obj.get("meta").getAsInt() : 0;
                int count = obj.has("count") ? obj.get("count").getAsInt() : 1;

                Item item = ForgeRegistries.ITEMS.getValue(new ResourceLocation(rl));
                if (item == null) {
                    System.err.println("[MWC] Unknown item registry name: " + rl);
                    return null;
                }
                return new ItemStack(item, count, meta);
            }

            System.err.println("[MWC] Ingredient object missing 'ore' or 'item': " + obj);
            return null;
        }

        System.err.println("[MWC] Unsupported ingredient element: " + el);
        return null;
    }

    private static void applyTransform(com.google.gson.JsonArray array) {
        float tx = array.get(0).getAsFloat();
        float ty = array.get(1).getAsFloat();
        float tz = array.get(2).getAsFloat();
        float rAngle = array.get(3).getAsFloat();
        float rx = array.get(4).getAsFloat();
        float ry = array.get(5).getAsFloat();
        float rz = array.get(6).getAsFloat();
        float sx = array.get(7).getAsFloat();
        float sy = array.get(8).getAsFloat();
        float sz = array.get(9).getAsFloat();

        GL11.glTranslatef(tx, ty, tz);
        GL11.glRotatef(rAngle, rx, ry, rz);
        GL11.glScalef(sx, sy, sz);
    }
}
