package com.paneedah.weaponlib.config;

import com.google.gson.*;
import com.paneedah.weaponlib.Weapon;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.DimensionManager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class BalancePackManager {

    private static final Gson GSON_MANAGER = new GsonBuilder().setPrettyPrinting().create();
    private static final Pattern PATTERN = Pattern.compile(" ", Pattern.LITERAL);

    private static File DIRECTORY;
    private static File INDEX_FILE;

    // JSON LOOKUP KEYS FOR PACK MANAGER VERSION 1.0v
    private static final String PACK_MANAGER_VERSION = "1.3";

    private static final String DAMAGE_MULTIPLIER_KEY = "damageMultiplier";
    private static final String RECOIL_MULTIPLIER_KEY = "recoilMultiplier";
    private static final String HIP_FIRE_SPREAD_KEY = "hipFireSpread";
    private static final String HIP_FIRE_SPREAD_MULTIPLIER_KEY = "hipFireSpreadMultiplier";
    private static final String GLOBAL_PARAMETERS_KEY = "globalParameters";
    private static final String PACK_VERSION_KEY = "version";
    private static final String PACK_NAME_KEY = "packName";
    private static final String PACK_MANAGER_KEY = "packManagerVersion";

    private static final String GUN_CONFIG_LIST = "gunConfigurations";
    private static final String CATEGORY_CONFIG_LIST = "categoryConfigurations";

    private static final String FIRE_RATE_MODIFIER = "firerate";

    private static final String INACCURACY_MODIFIER = "inaccuracy";

    // firemodeAuto

    private static final String FIRE_MODE_AUTO = "firemodeAuto";
    private static final String FIRE_MODE_BURST = "firemodeBurst";
    private static final String FIRE_MODE_SINGLE = "firemodeSingle";

    public enum GunConfigurationGroup {
        NONE,
        HANDGUN,
        LONG_GUN,
        RIFLE,
        SHOTGUN,
        CARBINE,
        ASSAULT_RIFLE,
        BATTLE_RIFLE,
        SNIPER_RIFLE,
        MACHINE_GUN,
        SUBMACHINE_GUN,

        @Deprecated
        SIDEARM,
        @Deprecated
        REVOLVER,
        @Deprecated
        SMG,
        @Deprecated
        DMR,
        @Deprecated
        RIFLES,
        @Deprecated
        LONG_RANGE_RIFLES,
        @Deprecated
        HEAVY
    }

    public static String getPackManagerVersion() {
        return PACK_MANAGER_VERSION;
    }

    public static class GunCategoryBalanceConfiguration {
        @Getter
        @Setter
        private GunConfigurationGroup group;
        @Getter
        @Setter
        private double damageMultiplier;
        @Getter
        @Setter
        private double recoilMultiplier;
        private double hipFireSpreadMultiplier;

        public GunCategoryBalanceConfiguration(GunConfigurationGroup group, double damageMultiplier,
                                               double recoilMultiplier, double hipFireSpread) {
            this.group = group;
            this.damageMultiplier = damageMultiplier;
            this.recoilMultiplier = recoilMultiplier;
            hipFireSpreadMultiplier = hipFireSpread;
        }

        public double getHipFireSpread() {
            return hipFireSpreadMultiplier;
        }

        public void setHipFireSpread(double hipFireSpread) {
            hipFireSpreadMultiplier = hipFireSpread;
        }

        public JsonObject toJSONObject() {
            JsonObject category = new JsonObject();
            category.addProperty("group", getGroup().toString());
            category.addProperty(DAMAGE_MULTIPLIER_KEY, Double.valueOf(getDamageMultiplier()));
            category.addProperty(RECOIL_MULTIPLIER_KEY, Double.valueOf(getRecoilMultiplier()));
            category.addProperty(HIP_FIRE_SPREAD_MULTIPLIER_KEY, Double.valueOf(getHipFireSpread()));

            return category;
        }

        public static GunCategoryBalanceConfiguration fromJSONObject(JsonObject obj) {
            GunConfigurationGroup configurationGroup = GunConfigurationGroup
                    .valueOf(obj.get("group").getAsString().toUpperCase());
            double damage = obj.has(DAMAGE_MULTIPLIER_KEY) ? obj.get(DAMAGE_MULTIPLIER_KEY).getAsDouble() : 1.0;
            double recoil = obj.has(RECOIL_MULTIPLIER_KEY) ? obj.get(RECOIL_MULTIPLIER_KEY).getAsDouble() : 1.0;
            double hipFireSpread = obj.has(HIP_FIRE_SPREAD_MULTIPLIER_KEY) ? obj.get(HIP_FIRE_SPREAD_MULTIPLIER_KEY).getAsDouble() : 1.0;

            return new GunCategoryBalanceConfiguration(configurationGroup, damage, recoil, hipFireSpread);
        }

    }

    public static class GunBalanceConfiguration {
        @Getter
        @Setter
        private String weaponName;
        @Getter
        @Setter
        private boolean enabled;

        // Damage as -1 means the damage is not modified
        @Getter
        @Setter
        private double damage;

        // Recoil as -1 means the recoil is not modified
        @Getter
        @Setter
        private double recoil;

        private float fireRate;

        @Setter
        private float inaccuracy;

        private boolean fireModePropertiesChanged = false;

        private boolean fireModeBurstChanged = false;
        @Getter
        private int burstShots = 3;

        private boolean fireModeSingleChanged = false;
        private boolean singleFireEnabled = false;

        private boolean fireModeAutoChanged = false;
        private boolean autoFireEnabled = false;

        public GunBalanceConfiguration(String weaponName, boolean enabled, double damage, double recoil, float firerate, float inaccuracy) {
            this.weaponName = weaponName;
            this.enabled = enabled;
            this.damage = damage;
            this.recoil = recoil;
            fireRate = firerate;
            this.inaccuracy = inaccuracy;
        }

        public void setBurstShots(int shots) {
            if (shots != 0) {
                fireModeBurstChanged = true;
            }
            fireModePropertiesChanged = true;
            burstShots = shots;
        }

        public void setFiremodeAuto(boolean fma) {
            fireModeAutoChanged = true;
            fireModePropertiesChanged = true;
            autoFireEnabled = fma;
        }

        public void setFiremodeSingle(boolean fms) {
            fireModeSingleChanged = true;
            fireModePropertiesChanged = true;
            singleFireEnabled = fms;
        }

        public boolean altersFiremodeAuto() {
            return fireModeAutoChanged;
        }

        public boolean altersFiremodeSingle() {
            return fireModeSingleChanged;
        }

        public boolean altersFiremodeBurst() {
            return fireModeBurstChanged;
        }

        public boolean getFiremodeAuto() {
            return autoFireEnabled;
        }

        public boolean getFiremodeSingle() {
            return singleFireEnabled;
        }

        public boolean wereFiremodePropertiesAltered() {
            return fireModePropertiesChanged;
        }

        public void setFirerate(float firerate) {
            fireRate = firerate;
        }

        public double getFirerate() {
            return fireRate;
        }

        public double getInaccuracy() {
            return inaccuracy;
        }

        public JsonObject toJSONObject() {
            JsonObject weapon = new JsonObject();
            weapon.addProperty("name", getWeaponName());
            weapon.addProperty("enabled", Boolean.valueOf(isEnabled()));
            weapon.addProperty("damage", Double.valueOf(getDamage()));
            weapon.addProperty("recoil", Double.valueOf(getRecoil()));

            if (getFirerate() != -1) {
                weapon.addProperty(FIRE_RATE_MODIFIER, Double.valueOf(getFirerate()));
            }

            if (getInaccuracy() != -1) {
                weapon.addProperty(INACCURACY_MODIFIER, Double.valueOf(getInaccuracy()));
            }

            if (wereFiremodePropertiesAltered()) {
                weapon.addProperty(FIRE_MODE_AUTO, Boolean.valueOf(getFiremodeAuto()));
                weapon.addProperty(FIRE_MODE_BURST, Integer.valueOf(getBurstShots()));
                weapon.addProperty(FIRE_MODE_SINGLE, Boolean.valueOf(getFiremodeSingle()));
            }

            return weapon;
        }

        public static GunBalanceConfiguration fromJSONObject(JsonObject obj) {

            String name = obj.get("name").getAsString();
            boolean enabled = !obj.has("enabled") || obj.get("enabled").getAsBoolean();
            double damage = obj.has("damage") ? obj.get("damage").getAsDouble() : -1;
            double recoil = obj.has("recoil") ? obj.get("recoil").getAsDouble() : -1;
            float fireRate = obj.has("firerate") ? obj.get("firerate").getAsFloat() : -1;
            float inaccuracy = obj.has("inaccuracy") ? obj.get("inaccuracy").getAsFloat() : -1;

            GunBalanceConfiguration gbc = new GunBalanceConfiguration(name, enabled, damage, recoil, fireRate, inaccuracy);

            if (obj.has(FIRE_RATE_MODIFIER)) {
                gbc.setFirerate(obj.get(FIRE_RATE_MODIFIER).getAsFloat());
            }

            if (obj.has(INACCURACY_MODIFIER)) {
                gbc.setInaccuracy(obj.get(INACCURACY_MODIFIER).getAsFloat());
            }

            if (obj.has(FIRE_MODE_AUTO) && obj.has(FIRE_MODE_BURST) && obj.has(FIRE_MODE_SINGLE)) {
                gbc.setFiremodeAuto(obj.get(FIRE_MODE_AUTO).getAsBoolean());
                gbc.setBurstShots(obj.get(FIRE_MODE_BURST).getAsInt());
                gbc.setFiremodeSingle(obj.get(FIRE_MODE_SINGLE).getAsBoolean());
            }

            return gbc;
        }
    }

    public static class BalancePack {
        @Getter
        @Setter
        private String name;
        @Getter
        @Setter
        private String version;

        @Getter
        @Setter
        private double globalRecoilMultiplier;
        @Getter
        @Setter
        private double globalDamageMultiplier;
        @Getter
        @Setter
        private double globalHipFireSpread;

        private String fileName;

        @Getter
        @Setter
        private HashMap<String, GunBalanceConfiguration> gunConfigurations = new HashMap<>();
        @Getter
        @Setter
        private HashMap<GunConfigurationGroup, GunCategoryBalanceConfiguration> gunCategoryConfigurations = new HashMap<>();

        public BalancePack(String name, String version, double globalRecoilMultiplier,
                           double globalDamageMultiplier, double globalHipFireSpread) {
            this.name = name;
            this.version = version;
            this.globalDamageMultiplier = globalDamageMultiplier;
            this.globalRecoilMultiplier = globalRecoilMultiplier;
            this.globalHipFireSpread = globalHipFireSpread;
        }

        public void addFileName(String fileName) {
            this.fileName = fileName;
        }

        public void addWeaponConfig(GunBalanceConfiguration gbc) {
            gunConfigurations.put(gbc.getWeaponName(), gbc);
        }

        public void addBalancingCategory(GunCategoryBalanceConfiguration gscbc) {
            gunCategoryConfigurations.put(gscbc.getGroup(), gscbc);
        }

        public static BalancePack fromJSONObject(JsonObject jsonObject) {

            if (!jsonObject.has(PACK_NAME_KEY) || !jsonObject.has(PACK_VERSION_KEY)) {
                LOGGER.error("Missing pack name or version key! Cannot load balance pack from JSON data.");
                return null;
            }

            // System.out.println("JSONOBJ " + jsonObject);

            String packName = jsonObject.get(PACK_NAME_KEY).getAsString();
            String packVersion = jsonObject.get(PACK_VERSION_KEY).getAsString();

            double globalRecoil, globalDamage, headshotMultiplier = 2.5, globalHipFireSpread;
            if (jsonObject.has(GLOBAL_PARAMETERS_KEY)) {
                JsonObject globalParameters = jsonObject.get(GLOBAL_PARAMETERS_KEY).getAsJsonObject();

                globalDamage = globalParameters.get(DAMAGE_MULTIPLIER_KEY).getAsDouble();
                globalRecoil = globalParameters.get(RECOIL_MULTIPLIER_KEY).getAsDouble();
                globalHipFireSpread = globalParameters.get(HIP_FIRE_SPREAD_KEY).getAsDouble();
            } else {
                globalRecoil = 1.0;
                globalDamage = 1.0;
                globalHipFireSpread = 7.5;

            }

            BalancePack bp = new BalancePack(packName, packVersion, globalRecoil, globalDamage, globalHipFireSpread);

            if (jsonObject.has(GUN_CONFIG_LIST)) {

                JsonArray array = jsonObject.get(GUN_CONFIG_LIST).getAsJsonArray();
                LOGGER.debug("Found weapon config list with {} entries.", array.size());
                for (int i = 0; i < array.size(); ++i) {
                    GunBalanceConfiguration balanceConfig = GunBalanceConfiguration
                            .fromJSONObject(array.get(i).getAsJsonObject());
                    bp.addWeaponConfig(balanceConfig);
                }
            } else {
                LOGGER.debug("Weapon config list was empty.");
            }

            if (jsonObject.has(CATEGORY_CONFIG_LIST)) {
                JsonArray categoricalArray = jsonObject.get(CATEGORY_CONFIG_LIST).getAsJsonArray();
                LOGGER.debug("Found category config list with {} entries.", categoricalArray.size());
                for (int i = 0; i < categoricalArray.size(); ++i) {
                    GunCategoryBalanceConfiguration categoryBalancing = GunCategoryBalanceConfiguration
                            .fromJSONObject(categoricalArray.get(i).getAsJsonObject());
                    bp.addBalancingCategory(categoryBalancing);
                }
            } else {
                LOGGER.debug("Weapon category config list was empty.");
            }

            return bp;

        }

        public JsonObject toJSONObject() {

            JsonObject obj = new JsonObject();

            // Fill in the pack 'header'
            obj.addProperty(PACK_NAME_KEY, name);
            obj.addProperty(PACK_VERSION_KEY, version);
            obj.addProperty(PACK_MANAGER_KEY, PACK_MANAGER_VERSION);

            // Write the global parameters in
            JsonObject globalParameters = new JsonObject();
            globalParameters.addProperty(DAMAGE_MULTIPLIER_KEY, Double.valueOf(globalDamageMultiplier));
            globalParameters.addProperty(RECOIL_MULTIPLIER_KEY, Double.valueOf(globalRecoilMultiplier));
            globalParameters.addProperty(HIP_FIRE_SPREAD_KEY, Double.valueOf(globalHipFireSpread));
            obj.add(GLOBAL_PARAMETERS_KEY, globalParameters);

            // Write the individual weapon keys
            JsonArray gunObj = new JsonArray();
            for (Entry<String, GunBalanceConfiguration> gbc : gunConfigurations.entrySet())
                gunObj.add(gbc.getValue().toJSONObject());
            obj.add(GUN_CONFIG_LIST, gunObj);

            // Write the category keys
            JsonArray categoryObj = new JsonArray();
            for (Entry<GunConfigurationGroup, GunCategoryBalanceConfiguration> gcbc : gunCategoryConfigurations
                    .entrySet())
                categoryObj.add(gcbc.getValue().toJSONObject());
            obj.add(CATEGORY_CONFIG_LIST, categoryObj);

            return obj;

        }

        public boolean containsWeapon(String name) {
            return gunConfigurations.containsKey(name);
        }

        public GunBalanceConfiguration getWeaponBalancing(String name) {
            return gunConfigurations.get(name);
        }

        public boolean containsCategory(GunConfigurationGroup group) {
            return gunCategoryConfigurations.containsKey(group);
        }

        public GunCategoryBalanceConfiguration getCategoryBalancing(GunConfigurationGroup group) {
            return gunCategoryConfigurations.get(group);
        }

    }

    private static BalancePack balancePackCurrentlyLoaded;
    private static boolean isLoaded = false;

    public static boolean hasActiveBalancePack() {
        return balancePackCurrentlyLoaded != null;
    }

    public static BalancePack getActiveBalancePack() {
        return balancePackCurrentlyLoaded;
    }

    public static void setCurrentBalancePack(BalancePack pack) {
        balancePackCurrentlyLoaded = pack;
    }

    public static File getDirectory() {
        loadDirectory();
        return DIRECTORY;
    }

    public static void remakeIndexFile() {
        INDEX_FILE = new File(DimensionManager.getCurrentSaveRootDirectory() + "/balancepacksindex.json");
        try {
            if (INDEX_FILE.exists()) {
                INDEX_FILE.delete();
            }

            INDEX_FILE.createNewFile();

            updateIndexFile();

        } catch (IOException e) {
            LOGGER.catching(e);
            LOGGER.error("Failed to create a new index.json");
        }
    }

    public static void createNewIndexFile() {

        INDEX_FILE = new File(DimensionManager.getCurrentSaveRootDirectory() + "/balancepacksindex.json");
        try {
            if (!INDEX_FILE.exists()) {
                LOGGER.debug("No index file found! Creating a new index.json.");
                INDEX_FILE.createNewFile();
                updateIndexFile();
            }
        } catch (IOException e) {
            LOGGER.catching(e);
            LOGGER.error("Failed to create a new index.json");
        }
    }

    public static JsonObject readJSONFile(File file) throws JsonSyntaxException {
        FileReader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            LOGGER.catching(e);
        }

        if (reader == null) {
            LOGGER.error("Failed to read file {} from the disk!", file.getName());
            return null;
        }
        JsonObject object;
        object = GSON_MANAGER.fromJson(reader, JsonObject.class);

        try {
            reader.close();
        } catch (IOException e) {
            LOGGER.catching(e);
            LOGGER.error("Failed to close file reader for file {}!", file.getName());
        }
        return object;
    }

    public static boolean writeJSONToFile(JsonObject object, File file) {

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e1) {
                LOGGER.catching(e1);
                LOGGER.error("Tried to create new file {} in order to write JSON to it, but failed!", file.getName());
                return false;
            }
        }

        FileWriter writer = null;
        try {
            writer = new FileWriter(file);
        } catch (IOException e) {
            LOGGER.catching(e);
        }

        if (writer == null) {
            LOGGER.error("Failed to write file {} to the disk!", file.getName());
            return false;
        }

        GSON_MANAGER.toJson(object, writer);

        try {
            writer.close();
        } catch (IOException e) {
            LOGGER.catching(e);
            LOGGER.error("Failed to close file writer for file {}!", file.getName());
        }

        LOGGER.debug("Succesfully wrote file {} to disk!", file.getName());
        return true;
    }

    public static File getIndexFile() {
        if (INDEX_FILE == null) {
            createNewIndexFile();
        }
        return INDEX_FILE;

    }

    public static void loadDirectory() {
        if (isLoaded) {
            return;
        }
        File f = new File("balancepacks/");
        if (!f.exists()) {
            f.mkdir();
            updateIndexFile();
        } else {
            JsonObject index;

            // System.out.println("FILE: " + getIndexFile());
            try {
                index = readJSONFile(getIndexFile());
            } catch (JsonSyntaxException e) {
                LOGGER.error("Index.json is not a proper JSON file. Recreating index.json.");
                remakeIndexFile();
                index = readJSONFile(getIndexFile());
            }

            assert index != null;
            if (!index.has("loadedPack")) {
                LOGGER.error(
                        "Error! Index file for balance packs does not contain loadedPacks key. File may have been tampered with.");
            } else {
                String result = index.get("loadedPack").getAsString();
                if (result.equals("null")) {
                    LOGGER.debug("No loaded pack.");
                } else {
                    LOGGER.debug("Balance pack manager found actively loaded pack {}", result);
                    loadBalancePack(null, result);
                }
            }

        }
        DIRECTORY = f;
        isLoaded = true;

    }

    public static void loadBalancePackFromString(ICommandSender sender, String alledgedJson) {
        String header = TextFormatting.GOLD + "(Balance Pack Manager " + BalancePackManager.getPackManagerVersion()
                + ")" + TextFormatting.WHITE;

        JsonObject object;
        try {
            object = GSON_MANAGER.fromJson(alledgedJson, JsonObject.class);
        } catch (JsonSyntaxException e) {
            LOGGER.error("Attempt to load balance pack from String failed. Was not JSON.");
            if (sender != null) {
                sender.sendMessage(new TextComponentString(
                        header + " Attempt to load balance pack from String failed. Was not JSON."));
            }
            return;
        }

        if (object == null) {
            return;
        }

        if (!object.has("packName")) {
            LOGGER.debug("Balance pack missing pack name key! Will not load.");
            if (sender != null) {
                sender.sendMessage(new TextComponentString(
                        header + " Balance pack downloading failed. Did not have pack name key."));
            }
            return;
        }

        // Download this to disk
        String modifiedName = PATTERN.matcher(object.get("packName").getAsString().toLowerCase()).replaceAll("_") + ".json";
        if (writeJSONToFile(object, new File("balancepacks/" + modifiedName))) {
            if (sender != null) {
                sender.sendMessage(new TextComponentString(header + " Succesfully downloaded balance pack to disk as "
                        + TextFormatting.RED + modifiedName + TextFormatting.WHITE + "."));
            }
            loadBalancePack(sender, modifiedName);

            if ((hasActiveBalancePack() && getActiveBalancePack().fileName.equals(modifiedName)) && sender != null) {
                sender.sendMessage(new TextComponentString(header + " Succesfully loaded balance pack "
                        + TextFormatting.RED + modifiedName + TextFormatting.WHITE + "."));
            }

        } else {
            if (sender != null) {
                sender.sendMessage(new TextComponentString(header + " Failed to download balance pack to disk."));
            }

        }

    }

    public static void loadBalancePack(ICommandSender sender, String fileName) {
        String header = TextFormatting.GOLD + "(Balance Pack Manager " + BalancePackManager.getPackManagerVersion()
                + ")" + TextFormatting.WHITE;

        File balancePack = new File("balancepacks/" + fileName);
        if (!balancePack.exists()) {
            if (sender != null) {
                sender.sendMessage(
                        new TextComponentString(header + " Balance pack loading failed. File does not exist."));
            }
            LOGGER.error("Balance pack {} does not exist! Game refusing to load it. Recreating index.json.", fileName);
            remakeIndexFile();
            return;
        }

        JsonObject object;
        // Create balance pack from JSON file
        try {
            object = readJSONFile(balancePack);
        } catch (JsonSyntaxException e) {
            LOGGER.error("Json file {} is not proper JSON! Please check the formatting.", fileName);
            if (sender != null) {
                sender.sendMessage(new TextComponentString(header + " Json file " + TextFormatting.RED + fileName
                        + TextFormatting.WHITE + " is not proper JSON! Please check the formatting."));
            }
            return;
        }

        assert object != null;
        BalancePack pack = BalancePack.fromJSONObject(object);

        if (pack == null) {
            if (sender != null) {
                sender.sendMessage(new TextComponentString(header + " Json file " + TextFormatting.RED + fileName
                        + TextFormatting.WHITE + " failed to load! Please check the console for more information."));
            }
            return;
        }

        pack.fileName = fileName;
        // if(sender != null) sender.sendMessage(new TextComponentString(header + "
        // Loaded balance pack " + TextFormatting.RED + fileName + TextFormatting.WHITE
        // + "."));

        setCurrentBalancePack(pack);

        updateIndexFile();

    }

    public static void createDefaultBalancePack() {
        BalancePack defaultPack = new BalancePack("default", "1.0", 1.0, 1.0, 7.5);
        defaultPack.addWeaponConfig(new GunBalanceConfiguration("exampleWeapon", true, 8.0, 1.0, 0.5f, 0.0f));
        for (GunConfigurationGroup i : GunConfigurationGroup.values()) {
            defaultPack.addBalancingCategory(new GunCategoryBalanceConfiguration(i, 1.0, 1.0, 1.0));
        }
        writeJSONToFile(defaultPack.toJSONObject(), new File("balancepacks/default_pack.json"));
    }

    public static void updateIndexFile() {
        JsonObject obj = new JsonObject();
        obj.addProperty("loadedPack", hasActiveBalancePack() ? getActiveBalancePack().fileName : "null");
        writeJSONToFile(obj, getIndexFile());
    }

    public static void unloadBalancePack() {
        balancePackCurrentlyLoaded = null;
        updateIndexFile();
    }

    public static boolean balancePackAddressesWeapon(Weapon weapon) {
        if (!hasActiveBalancePack()) {
            return false;
        }

        return getActiveBalancePack().containsWeapon(weapon.getName());
    }

    public static float getFirerate(Weapon weapon) {

        if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)
                || getActiveBalancePack().getWeaponBalancing(weapon.getName()).getFirerate() < 0) {
            return weapon.builder.getFirerate();
        }

        return (float) getActiveBalancePack().getWeaponBalancing(weapon.getName()).getFirerate();
    }

    public static float getInaccuracy(Weapon weapon) {

        if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)
                || getActiveBalancePack().getWeaponBalancing(weapon.getName()).getInaccuracy() < 0) {
            return weapon.builder.getInaccuracy();
        }

        return (float) getActiveBalancePack().getWeaponBalancing(weapon.getName()).getInaccuracy();
    }

    public static boolean balancePackAddressesGroup(GunConfigurationGroup group) {
        if (!hasActiveBalancePack()) {
            return false;
        }
        return getActiveBalancePack().containsCategory(group);
    }

    public static double getNewWeaponDamage(Weapon weapon) {
        if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)) {
            return weapon.getSpawnEntityDamage();
        }
        return getActiveBalancePack().getWeaponBalancing(weapon.getName()).getDamage();
    }

    public static boolean isWeaponDisabled(Weapon weapon) {
        if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)) {
            return false;
        }
        return !getActiveBalancePack().getWeaponBalancing(weapon.getName()).isEnabled();
    }

    public static boolean shouldChangeWeaponDamage(Weapon weapon) {
        return hasActiveBalancePack() && balancePackAddressesWeapon(weapon)
                && !(getActiveBalancePack().getWeaponBalancing(weapon.getName()).getDamage() < 0);
    }

    public static boolean firemodePropertiesAltered(Weapon weapon) {
        if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)) {
            return false;
        } else {
            return getActiveBalancePack().getWeaponBalancing(weapon.getName()).wereFiremodePropertiesAltered();
        }

    }

    public static List<Integer> getFiremodeListForWeapon(Weapon weapon) {
        if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)
                || !getActiveBalancePack().getWeaponBalancing(weapon.getName()).wereFiremodePropertiesAltered()) {
            return weapon.builder.getMaxShots();
        }

        GunBalanceConfiguration gbc = getActiveBalancePack().getWeaponBalancing(weapon.getName());
        List<Integer> shotsList = new ArrayList<>();

        if (gbc.autoFireEnabled) {
            shotsList.add(Integer.valueOf(Integer.MAX_VALUE));
        }
        if (gbc.singleFireEnabled) {
            shotsList.add(Integer.valueOf(1));
        }
        if (gbc.burstShots != 0) {
            shotsList.add(Integer.valueOf(gbc.burstShots));
        }

        return shotsList;
    }

    public static boolean shouldChangeWeaponRecoil(Weapon weapon) {
        return hasActiveBalancePack() && balancePackAddressesWeapon(weapon)
                && !(getActiveBalancePack().getWeaponBalancing(weapon.getName()).getRecoil() < 0);
    }

    public static double getNewWeaponRecoil(Weapon weapon) {
        if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)) {
            return weapon.getRecoil();
        }
        return getActiveBalancePack().getWeaponBalancing(weapon.getName()).getRecoil();
    }

    public static double getGroupDamageMultiplier(GunConfigurationGroup group) {
        if (!hasActiveBalancePack() || !balancePackAddressesGroup(group)) {
            return 1.0;
        }
        return getActiveBalancePack().getCategoryBalancing(group).getDamageMultiplier();
    }

    public static double getGroupRecoilMultiplier(GunConfigurationGroup group) {
        if (!hasActiveBalancePack() || !balancePackAddressesGroup(group)) {
            return 1.0;
        }
        return getActiveBalancePack().getCategoryBalancing(group).getRecoilMultiplier();
    }

    public static double getGroupHipFireSpread(GunConfigurationGroup group) {
        if (!hasActiveBalancePack() || !balancePackAddressesGroup(group)) {
            return 1.0;
        }
        return getActiveBalancePack().getCategoryBalancing(group).getHipFireSpread();
    }

    public static double getGlobalDamageMultiplier() {
        if (!hasActiveBalancePack()) {
            return 1.0;
        }
        return getActiveBalancePack().getGlobalDamageMultiplier();
    }

    public static double getGlobalRecoilMultiplier() {
        if (!hasActiveBalancePack()) {
            return 1.0;
        }
        return getActiveBalancePack().getGlobalRecoilMultiplier();
    }

    public static double getGlobalHipFireSpread() {
        if (!hasActiveBalancePack()) {
            return 7.5;
        }
        return getActiveBalancePack().getGlobalHipFireSpread();
    }

    public static double getNetGunDamage(Weapon weapon) {
        double dmg = weapon.getSpawnEntityDamage();
        if (shouldChangeWeaponDamage(weapon)) {
            dmg = getNewWeaponDamage(weapon);
        }
        dmg *= getGlobalDamageMultiplier();
        return dmg;
    }

}
