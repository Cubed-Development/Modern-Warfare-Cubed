package com.paneedah.weaponlib.config;

import com.google.gson.*;
import com.paneedah.weaponlib.Weapon;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.common.DimensionManager;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class BalancePackManager {

	private static final Gson GSON_MANAGER = new GsonBuilder().setPrettyPrinting().create();

	private static File DIRECTORY;
	private static File INDEX_FILE;

	// JSON LOOKUP KEYS FOR PACK MANAGER VERSION 1.0v
	private static final String PACK_MANAGER_VERSION = "1.2";

	private static final String HEADSHOT_MULTIPLIER_KEY = "headshotMultiplier";
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

	public static enum GunConfigurationGroup {
		NONE, SIDEARM, SHOTGUN, REVOLVER, SMG, DMR, RIFLES, LONG_RANGE_RIFLES, HEAVY
	}

	public static String getPackManagerVersion() {
		return PACK_MANAGER_VERSION;
	}

	public static class GunCategoryBalanceConfiguration {
		private GunConfigurationGroup group;
		private double damageMultiplier = 1.0;
		private double recoilMultiplier = 1.0;
		private double hipFireSpreadMultiplier = 1.0;

		public GunCategoryBalanceConfiguration(GunConfigurationGroup group, double damageMultiplier,
				double recoilMultiplier, double hipFireSpread) {
			this.group = group;
			this.damageMultiplier = damageMultiplier;
			this.recoilMultiplier = recoilMultiplier;
			this.hipFireSpreadMultiplier = hipFireSpread;
		}

		public GunConfigurationGroup getGroup() {
			return group;
		}

		public void setGroup(GunConfigurationGroup group) {
			this.group = group;
		}

		public double getDamageMultiplier() {
			return damageMultiplier;
		}

		public void setDamageMultiplier(double damageMultiplier) {
			this.damageMultiplier = damageMultiplier;
		}

		public double getRecoilMultiplier() {
			return recoilMultiplier;
		}

		public void setRecoilMultiplier(double recoilMultiplier) {
			this.recoilMultiplier = recoilMultiplier;
		}

		public double getHipFireSpread() {
			return hipFireSpreadMultiplier;
		}

		public void setHipFireSpread(double hipFireSpread) {
			this.hipFireSpreadMultiplier = hipFireSpread;
		}

		public JsonObject toJSONObject() {
			JsonObject category = new JsonObject();
			category.addProperty("group", getGroup().toString());
			category.addProperty(DAMAGE_MULTIPLIER_KEY, getDamageMultiplier());
			category.addProperty(RECOIL_MULTIPLIER_KEY, getRecoilMultiplier());
			category.addProperty(HIP_FIRE_SPREAD_MULTIPLIER_KEY, getHipFireSpread());

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
		private String weaponName;
		private boolean enabled = true;

		// Damage as -1 means the damage is not modified
		private double damage = -1;

		// Recoil as -1 means the recoil is not modified
		private double recoil = -1;

		private float fireRate = -1;

		private float inaccuracy = -1;

		private boolean fireModePropertiesChanged = false;

		private boolean fireModeBurstChanged = false;
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
			this.fireRate = firerate;
			this.inaccuracy = inaccuracy;
		}

		public String getWeaponName() {
			return weaponName;
		}

		public void setBurstShots(int shots) {
			if (shots != 0)
				fireModeBurstChanged = true;
			fireModePropertiesChanged = true;
			burstShots = shots;
		}

		public void setFiremodeAuto(boolean fma) {
			fireModeAutoChanged = true;
			fireModePropertiesChanged = true;
			this.autoFireEnabled = fma;
		}

		public void setFiremodeSingle(boolean fms) {
			fireModeSingleChanged = true;
			fireModePropertiesChanged = true;
			this.singleFireEnabled = fms;
		}

		public boolean altersFiremodeAuto() {
			return this.fireModeAutoChanged;
		}

		public boolean altersFiremodeSingle() {
			return this.fireModeSingleChanged;
		}

		public boolean altersFiremodeBurst() {
			return this.fireModeBurstChanged;
		}

		public int getBurstShots() {
			return burstShots;
		}

		public boolean getFiremodeAuto() {
			return this.autoFireEnabled;
		}

		public boolean getFiremodeSingle() {
			return this.singleFireEnabled;
		}

		public boolean wereFiremodePropertiesAltered() {
			return this.fireModePropertiesChanged;
		}

		public void setWeaponName(String weaponName) {
			this.weaponName = weaponName;
		}

		public boolean isEnabled() {
			return enabled;
		}

		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}

		public double getDamage() {
			return damage;
		}

		public void setDamage(double damage) {
			this.damage = damage;
		}

		public double getRecoil() {
			return recoil;
		}

		public void setRecoil(double recoil) {
			this.recoil = recoil;
		}

		public void setFirerate(float firerate) {
			this.fireRate = firerate;
		}

		public double getFirerate() {
			return this.fireRate;
		}

		public void setInaccuracy(float inaccuracy) {
			this.inaccuracy = inaccuracy;
		}

		public double getInaccuracy() {
			return this.inaccuracy;
		}

		public JsonObject toJSONObject() {
			JsonObject weapon = new JsonObject();
			weapon.addProperty("name", getWeaponName());
			weapon.addProperty("enabled", isEnabled());
			weapon.addProperty("damage", getDamage());
			weapon.addProperty("recoil", getRecoil());

			if (getFirerate() != -1)
				weapon.addProperty(FIRE_RATE_MODIFIER, getFirerate());

			if (getInaccuracy() != -1)
				weapon.addProperty(INACCURACY_MODIFIER, getInaccuracy());

			if (wereFiremodePropertiesAltered()) {
				weapon.addProperty(FIRE_MODE_AUTO, getFiremodeAuto());
				weapon.addProperty(FIRE_MODE_BURST, getBurstShots());
				weapon.addProperty(FIRE_MODE_SINGLE, getFiremodeSingle());
			}

			return weapon;
		}

		public static GunBalanceConfiguration fromJSONObject(JsonObject obj) {

			String name = obj.get("name").getAsString();
			boolean enabled = obj.has("enabled") ? obj.get("enabled").getAsBoolean() : true;
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
		private String name;
		private String version;

		private double headshotMultiplier = 2.5;
		private double globalRecoilMultiplier = 1.0;
		private double globalDamageMultiplier = 1.0;
		private double globalHipFireSpread = 7.5;

		private String fileName;

		private HashMap<String, GunBalanceConfiguration> gunConfigurations = new HashMap<>();
		private HashMap<GunConfigurationGroup, GunCategoryBalanceConfiguration> gunCategoryConfigurations = new HashMap<>();

		public BalancePack(String name, String version, double headshotMult, double globalRecoilMultiplier,
				double globalDamageMultiplier, double globalHipFireSpread) {
			this.name = name;
			this.version = version;
			this.headshotMultiplier = headshotMult;
			this.globalDamageMultiplier = globalDamageMultiplier;
			this.globalRecoilMultiplier = globalRecoilMultiplier;
			this.globalHipFireSpread = globalHipFireSpread;
		}

		public void addFileName(String fileName) {
			this.fileName = fileName;
		}

		public void addWeaponConfig(GunBalanceConfiguration gbc) {
			this.gunConfigurations.put(gbc.getWeaponName(), gbc);
		}

		public void addBalancingCategory(GunCategoryBalanceConfiguration gscbc) {
			this.gunCategoryConfigurations.put(gscbc.getGroup(), gscbc);
		}

		public static BalancePack fromJSONObject(JsonObject jsonObject) {

			if (!jsonObject.has(PACK_NAME_KEY) || !jsonObject.has(PACK_VERSION_KEY)) {
				LOG.error("Missing pack name or version key! Cannot load balance pack from JSON data.");
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


				if (globalParameters.has(HEADSHOT_MULTIPLIER_KEY)) {
					headshotMultiplier = globalParameters.get(HEADSHOT_MULTIPLIER_KEY).getAsDouble();
				}

			} else {
				globalRecoil = 1.0;
				globalDamage = 1.0;
				globalHipFireSpread = 7.5;

			}

			BalancePack bp = new BalancePack(packName, packVersion, headshotMultiplier, globalRecoil, globalDamage, globalHipFireSpread);

			if (jsonObject.has(GUN_CONFIG_LIST)) {

				JsonArray array = jsonObject.get(GUN_CONFIG_LIST).getAsJsonArray();
				LOG.debug("Found weapon config list with {} entries.", array.size());
				for (int i = 0; i < array.size(); ++i) {
					GunBalanceConfiguration balanceConfig = GunBalanceConfiguration
							.fromJSONObject(array.get(i).getAsJsonObject());
					bp.addWeaponConfig(balanceConfig);
				}
			} else {
				LOG.debug("Weapon config list was empty.");
			}

			if (jsonObject.has(CATEGORY_CONFIG_LIST)) {
				JsonArray categoricalArray = jsonObject.get(CATEGORY_CONFIG_LIST).getAsJsonArray();
				LOG.debug("Found category config list with {} entries.", categoricalArray.size());
				for (int i = 0; i < categoricalArray.size(); ++i) {
					GunCategoryBalanceConfiguration categoryBalancing = GunCategoryBalanceConfiguration
							.fromJSONObject(categoricalArray.get(i).getAsJsonObject());
					bp.addBalancingCategory(categoryBalancing);
				}
			} else {
				LOG.debug("Weapon category config list was empty.");
			}

			return bp;

		}

		public JsonObject toJSONObject() {

			JsonObject obj = new JsonObject();

			// Fill in the pack 'header'
			obj.addProperty(PACK_NAME_KEY, this.name);
			obj.addProperty(PACK_VERSION_KEY, this.version);
			obj.addProperty(PACK_MANAGER_KEY, PACK_MANAGER_VERSION);

			// Write the global parameters in
			JsonObject globalParameters = new JsonObject();
			globalParameters.addProperty(DAMAGE_MULTIPLIER_KEY, this.globalDamageMultiplier);
			globalParameters.addProperty(RECOIL_MULTIPLIER_KEY, this.globalRecoilMultiplier);
			globalParameters.addProperty(HEADSHOT_MULTIPLIER_KEY, this.headshotMultiplier);
			globalParameters.addProperty(HIP_FIRE_SPREAD_KEY, this.globalHipFireSpread);
			obj.add(GLOBAL_PARAMETERS_KEY, globalParameters);

			// Write the individual weapon keys
			JsonArray gunObj = new JsonArray();
			for (Entry<String, GunBalanceConfiguration> gbc : this.gunConfigurations.entrySet())
				gunObj.add(gbc.getValue().toJSONObject());
			obj.add(GUN_CONFIG_LIST, gunObj);

			// Write the category keys
			JsonArray categoryObj = new JsonArray();
			for (Entry<GunConfigurationGroup, GunCategoryBalanceConfiguration> gcbc : this.gunCategoryConfigurations
					.entrySet())
				categoryObj.add(gcbc.getValue().toJSONObject());
			obj.add(CATEGORY_CONFIG_LIST, categoryObj);

			return obj;

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public double getGlobalRecoilMultiplier() {
			return globalRecoilMultiplier;
		}

		public void setGlobalRecoilMultiplier(double globalRecoilMultiplier) {
			this.globalRecoilMultiplier = globalRecoilMultiplier;
		}

		public double getGlobalDamageMultiplier() {
			return globalDamageMultiplier;
		}

		public void setGlobalDamageMultiplier(double globalDamageMultiplier) {
			this.globalDamageMultiplier = globalDamageMultiplier;
		}

		public double getGlobalHipFireSpread() {
			return globalHipFireSpread;
		}

		public void setGlobalHipFireSpread(double globalHipFireSpread) {
			this.globalHipFireSpread = globalHipFireSpread;
		}

		public HashMap<String, GunBalanceConfiguration> getGunConfigurations() {
			return gunConfigurations;
		}

		public void setGunConfigurations(HashMap<String, GunBalanceConfiguration> gunConfigurations) {
			this.gunConfigurations = gunConfigurations;
		}

		public HashMap<GunConfigurationGroup, GunCategoryBalanceConfiguration> getGunCategoryConfigurations() {
			return gunCategoryConfigurations;
		}

		public void setGunCategoryConfigurations(
				HashMap<GunConfigurationGroup, GunCategoryBalanceConfiguration> gunCategoryConfigurations) {
			this.gunCategoryConfigurations = gunCategoryConfigurations;
		}

		public boolean containsWeapon(String name) {
			return gunConfigurations.containsKey(name);
		}

		public GunBalanceConfiguration getWeaponBalancing(String name) {
			return gunConfigurations.get(name);
		}

		public boolean containsCategory(GunConfigurationGroup group) {
			return this.gunCategoryConfigurations.containsKey(group);
		}

		public GunCategoryBalanceConfiguration getCategoryBalancing(GunConfigurationGroup group) {
			return this.gunCategoryConfigurations.get(group);
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
			if (INDEX_FILE.exists())
				INDEX_FILE.delete();

			INDEX_FILE.createNewFile();

			updateIndexFile();

		} catch (IOException e) {
			LOG.catching(e);
			LOG.error("Failed to create a new index.json");
		}
	}

	public static void createNewIndexFile() {

		INDEX_FILE = new File(DimensionManager.getCurrentSaveRootDirectory() + "/balancepacksindex.json");
		try {
			if (!INDEX_FILE.exists()) {
				LOG.debug("No index file found! Creating a new index.json.");
				INDEX_FILE.createNewFile();
				updateIndexFile();
			}
		} catch (IOException e) {
			LOG.catching(e);
			LOG.error("Failed to create a new index.json");
		}
	}

	public static JsonObject readJSONFile(File file) throws JsonSyntaxException {
		FileReader reader = null;
		try {
			reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			LOG.catching(e);
		}

		if (reader == null) {
			LOG.error("Failed to read file {} from the disk!", file.getName());
			return null;
		}
		JsonObject object = null;
		try {
			object = GSON_MANAGER.fromJson(reader, JsonObject.class);
		} catch (JsonSyntaxException jse) {
			throw jse;
		}

		try {
			reader.close();
		} catch (IOException e) {
			LOG.catching(e);
			LOG.error("Failed to close file reader for file {}!", file.getName());
		}
		return object;
	}

	public static boolean writeJSONToFile(JsonObject object, File file) {

		if (!file.exists())
			try {
				file.createNewFile();
			} catch (IOException e1) {
				LOG.catching(e1);
				LOG.error("Tried to create new file {} in order to write JSON to it, but failed!", file.getName());
				return false;
			}

		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
		} catch (IOException e) {
			LOG.catching(e);
		}

		if (writer == null) {
			LOG.error("Failed to write file {} to the disk!", file.getName());
			return false;
		}

		GSON_MANAGER.toJson(object, writer);

		try {
			writer.close();
		} catch (IOException e) {
			LOG.catching(e);
			LOG.error("Failed to close file writer for file {}!", file.getName());
		}

		LOG.debug("Succesfully wrote file {} to disk!", file.getName());
		return true;
	}

	public static File getIndexFile() {
		if (INDEX_FILE != null) {
			return INDEX_FILE;
		} else {
			createNewIndexFile();
			return INDEX_FILE;
		}

	}

	public static void loadDirectory() {
		if (isLoaded)
			return;
		File f = new File("balancepacks/");
		if (!f.exists()) {
			f.mkdir();
			updateIndexFile();
		} else {
			JsonObject index = null;

			// System.out.println("FILE: " + getIndexFile());
			try {
				index = readJSONFile(getIndexFile());
			} catch (JsonSyntaxException e) {
				LOG.error("Index.json is not a proper JSON file. Recreating index.json.");
				remakeIndexFile();
				index = readJSONFile(getIndexFile());
			}

			if (!index.has("loadedPack")) {
				LOG.error(
						"Error! Index file for balance packs does not contain loadedPacks key. File may have been tampered with.");
			} else {
				String result = index.get("loadedPack").getAsString();
				if (result.equals("null")) {
					LOG.debug("No loaded pack.");
				} else {
					LOG.debug("Balance pack manager found actively loaded pack {}", result);
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

		JsonObject object = null;
		try {
			object = GSON_MANAGER.fromJson(alledgedJson, JsonObject.class);
		} catch (JsonSyntaxException e) {
			LOG.error("Attempt to load balance pack from String failed. Was not JSON.");
			if (sender != null)
				sender.sendMessage(new TextComponentString(
						header + " Attempt to load balance pack from String failed. Was not JSON."));
			return;
		}

		if (object == null)
			return;

		if (!object.has("packName")) {
			LOG.debug("Balance pack missing pack name key! Will not load.");
			if (sender != null)
				sender.sendMessage(new TextComponentString(
						header + " Balance pack downloading failed. Did not have pack name key."));
			return;
		}

		// Download this to disk
		String modifiedName = object.get("packName").getAsString().toLowerCase().replace(" ", "_") + ".json";
		if (writeJSONToFile(object, new File("balancepacks/" + modifiedName))) {
			if (sender != null)
				sender.sendMessage(new TextComponentString(header + " Succesfully downloaded balance pack to disk as "
						+ TextFormatting.RED + modifiedName + TextFormatting.WHITE + "."));
			loadBalancePack(sender, modifiedName);

			if ((hasActiveBalancePack() && getActiveBalancePack().fileName.equals(modifiedName)) && sender != null)
				sender.sendMessage(new TextComponentString(header + " Succesfully loaded balance pack "
						+ TextFormatting.RED + modifiedName + TextFormatting.WHITE + "."));

		} else {
			if (sender != null)
				sender.sendMessage(new TextComponentString(header + " Failed to download balance pack to disk."));

		}

	}

	public static void loadBalancePack(ICommandSender sender, String fileName) {
		String header = TextFormatting.GOLD + "(Balance Pack Manager " + BalancePackManager.getPackManagerVersion()
				+ ")" + TextFormatting.WHITE;

		File balancePack = new File("balancepacks/" + fileName);
		if (!balancePack.exists()) {
			if (sender != null)
				sender.sendMessage(
						new TextComponentString(header + " Balance pack loading failed. File does not exist."));
			LOG.error("Balance pack {} does not exist! Game refusing to load it. Recreating index.json.", fileName);
			remakeIndexFile();
			return;
		}

		JsonObject object = null;
		// Create balance pack from JSON file
		try {
			object = readJSONFile(balancePack);
		} catch (JsonSyntaxException e) {
			LOG.error("Json file {} is not proper JSON! Please check the formatting.", fileName);
			if (sender != null)
				sender.sendMessage(new TextComponentString(header + " Json file " + TextFormatting.RED + fileName
						+ TextFormatting.WHITE + " is not proper JSON! Please check the formatting."));
			return;
		}

		BalancePack pack = BalancePack.fromJSONObject(object);

		if (pack == null) {
			if (sender != null)
				sender.sendMessage(new TextComponentString(header + " Json file " + TextFormatting.RED + fileName
						+ TextFormatting.WHITE + " failed to load! Please check the console for more information."));
			return;
		}

		pack.fileName = fileName;
		// if(sender != null) sender.sendMessage(new TextComponentString(header + "
		// Loaded balance pack " + TextFormatting.RED + fileName + TextFormatting.WHITE
		// + "."));

		setCurrentBalancePack(pack);

		updateIndexFile();

	}

	public static double getHeadshotMultiplier() {
		if (!hasActiveBalancePack()) {
			return 2.5;
		} else {
			return getActiveBalancePack().headshotMultiplier;
		}

	}

	public static void createDefaultBalancePack() {
		BalancePack defaultPack = new BalancePack("default", "1.0", 2.5, 1.0, 1.0, 7.5);
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
		if (!hasActiveBalancePack())
			return false;

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
		if (!hasActiveBalancePack())
			return false;
		return getActiveBalancePack().containsCategory(group);
	}

	public static double getNewWeaponDamage(Weapon weapon) {
		if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon))
			return weapon.getSpawnEntityDamage();
		return getActiveBalancePack().getWeaponBalancing(weapon.getName()).getDamage();
	}

	public static boolean isWeaponDisabled(Weapon weapon) {
		if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon))
			return false;
		return !getActiveBalancePack().getWeaponBalancing(weapon.getName()).isEnabled();
	}

	public static boolean shouldChangeWeaponDamage(Weapon weapon) {
		if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)
				|| getActiveBalancePack().getWeaponBalancing(weapon.getName()).getDamage() < 0)
			return false;
		return true;
	}

	public static boolean firemodePropertiesAltered(Weapon weapon) {
		if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)) {
			return false;
		} else
			return getActiveBalancePack().getWeaponBalancing(weapon.getName()).wereFiremodePropertiesAltered();

	}

	public static List<Integer> getFiremodeListForWeapon(Weapon weapon) {
		if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)
				|| !getActiveBalancePack().getWeaponBalancing(weapon.getName()).wereFiremodePropertiesAltered()) {
			return weapon.builder.getMaxShots();
		}

		GunBalanceConfiguration gbc = getActiveBalancePack().getWeaponBalancing(weapon.getName());
		List<Integer> shotsList = new ArrayList<>();

		if (gbc.autoFireEnabled)
			shotsList.add(Integer.MAX_VALUE);
		if (gbc.singleFireEnabled)
			shotsList.add(1);
		if (gbc.burstShots != 0)
			shotsList.add(gbc.burstShots);

		return shotsList;
	}

	public static boolean shouldChangeWeaponRecoil(Weapon weapon) {
		if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon)
				|| getActiveBalancePack().getWeaponBalancing(weapon.getName()).getRecoil() < 0)
			return false;
		return true;
	}

	public static double getNewWeaponRecoil(Weapon weapon) {
		if (!hasActiveBalancePack() || !balancePackAddressesWeapon(weapon))
			return weapon.getRecoil();
		return getActiveBalancePack().getWeaponBalancing(weapon.getName()).getRecoil();
	}

	public static double getGroupDamageMultiplier(GunConfigurationGroup group) {
		if (!hasActiveBalancePack() || !balancePackAddressesGroup(group))
			return 1.0;
		return getActiveBalancePack().getCategoryBalancing(group).getDamageMultiplier();
	}

	public static double getGroupRecoilMultiplier(GunConfigurationGroup group) {
		if (!hasActiveBalancePack() || !balancePackAddressesGroup(group))
			return 1.0;
		return getActiveBalancePack().getCategoryBalancing(group).getRecoilMultiplier();
	}

	public static double getGroupHipFireSpread(GunConfigurationGroup group) {
		if (!hasActiveBalancePack() || !balancePackAddressesGroup(group))
			return 1.0;
		return getActiveBalancePack().getCategoryBalancing(group).getHipFireSpread();
	}

	public static double getGlobalDamageMultiplier() {
		if (!hasActiveBalancePack())
			return 1.0;
		return getActiveBalancePack().getGlobalDamageMultiplier();
	}

	public static double getGlobalRecoilMultiplier() {
		if (!hasActiveBalancePack())
			return 1.0;
		return getActiveBalancePack().getGlobalRecoilMultiplier();
	}

	public static double getGlobalHipFireSpread() {
		if (!hasActiveBalancePack())
			return 7.5;
		return getActiveBalancePack().getGlobalHipFireSpread();
	}

	public static double getNetGunDamage(Weapon weapon) {
		double dmg = weapon.getSpawnEntityDamage();
		if (shouldChangeWeaponDamage(weapon))
			dmg = getNewWeaponDamage(weapon);
		dmg *= getGlobalDamageMultiplier();
		return dmg;
	}

}
