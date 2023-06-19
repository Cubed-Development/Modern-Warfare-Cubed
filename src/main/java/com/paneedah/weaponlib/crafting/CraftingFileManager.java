package com.paneedah.weaponlib.crafting;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.JSONDatabaseManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Arrays;
import java.util.Objects;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.LOG;

public class CraftingFileManager extends JSONDatabaseManager {

	// Crafting file manager instance
	private static final CraftingFileManager INSTANCE = new CraftingFileManager();

	// Main file / directory
	
	private static final File DIRECTORY = new File(Loader.instance().getConfigDir() + "/mwc/crafting");
	private static final File CACHE_DIR = new File(DIRECTORY, "cache/");
	private static final File MAIN_FILE = new File(DIRECTORY, "craftingmappings.json");
	private static final String DEFAULT_CRAFTING_MAPPINGS = "craftingmappings.json";
	
	
	private static final String CACHE_EXTENSION = ".cache";
	
	// Current file hash
	private byte[] currentFileHash;
	private byte[] defaultFileHash;

	// JSON Access Keys
	private static final String NAME_KEY = "entryName";
	private static final String CRAFTING_GROUP_KEY = "craftingGroup";
	private static final String RECIPE_ARRAY_KEY = "recipe";

	private static final String ORE_DICTIONARY_BOOLEAN_KEY = "isOreDictionary";
	private static final String COUNT_KEY = "count";
	private static final String ENTRY_ITEM_NAME_KEY = "entryName";
	private static final String ORE_DICTIONARY_DEFAULT_ITEM = "defaultItem";

	
	// {-1: Not loaded, 1: Default mappings, 2: Custom Mappings } 
	private int loadingStatus = -1;
	
	public static CraftingFileManager getInstance() {
		return INSTANCE;
	}

	public byte[] getCurrentFileHash() {
		return currentFileHash;
	}
	
	public int getLoadingStatus() {
		return this.loadingStatus;
	}

	@Override
	public JsonObject toJSON() {
		// Main json object
		JsonObject mainFileJSON = new JsonObject();
		JsonArray mainArray = new JsonArray();
		mainFileJSON.add("recipes", mainArray);

		// Entry json object
		JsonObject obj = new JsonObject();
		mainArray.add(obj);
		obj.addProperty(NAME_KEY, ModReference.ID + ":bullet50ae");
		obj.addProperty(CRAFTING_GROUP_KEY, CraftingGroup.BULLET.toString());

		CraftingEntry[] recipe = new CraftingEntry[] { new CraftingEntry(Blocks.ACACIA_FENCE, 4) };
		JsonArray recipeArray = new JsonArray();
		obj.add(RECIPE_ARRAY_KEY, recipeArray);

		for (CraftingEntry entry : recipe) {
			JsonObject jsonEntry = new JsonObject();

			String itemName = entry.getItem().getRegistryName().toString();

			jsonEntry.addProperty(ENTRY_ITEM_NAME_KEY, !entry.isOreDictionary() ? itemName : entry.getOreDictionaryEntry());
			jsonEntry.addProperty(ORE_DICTIONARY_BOOLEAN_KEY, false);
			jsonEntry.addProperty(COUNT_KEY, entry.getCount());

			if (entry.isOreDictionary())
				jsonEntry.addProperty(ORE_DICTIONARY_DEFAULT_ITEM, itemName);

			recipeArray.add(jsonEntry);
		}

		return mainFileJSON;
	}

	public ByteArrayOutputStream getCurrentFileBAOS() {
		if(loadingStatus == -1) return null;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		try {
			if(loadingStatus == 2) {
				// Custom mode
			
				FileInputStream fis = new FileInputStream(MAIN_FILE);
			
				int avaliable = fis.available();
				
				for(int i = 0; i < avaliable; ++i)
					baos.write(fis.read());

				fis.close();

			} else if(loadingStatus == 1) {
				// Default mode
				InputStream is = getClass().getClassLoader().getResourceAsStream(DEFAULT_CRAFTING_MAPPINGS);
				for(int i = 0; i < is.available(); ++i) baos.write(is.read());
				is.close();
			}

			return baos;

		} catch(IOException e) { e.printStackTrace(); }

		return baos;
	}
	
	public byte[] getDefaultFileHash() {
		// If we already have it, return it.
		if(defaultFileHash != null) return defaultFileHash;
		
		// If not, get it, store it, return it.
		defaultFileHash = getDigest(getDefaultFileStream());
		return defaultFileHash;
	}
	
	@Override
	public void fromJSON(JsonObject object) {
		InputStreamReader reader = new InputStreamReader(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream(DEFAULT_CRAFTING_MAPPINGS)));
		JsonObject defaultObject = GSON_MANAGER.fromJson(reader, JsonObject.class);

		JsonArray defaultArray = defaultObject.get("recipes").getAsJsonArray();
		JsonArray customArray = object.get("recipes").getAsJsonArray();

		// Loop through the default array and see if we have a custom entry for it.
		for (int i = 0; i < defaultArray.size(); ++i) {
			JsonObject defaultRecipe = (JsonObject) defaultArray.get(i);
			JsonObject customRecipe = null;

			// Loop through the custom array and see if we have a custom entry for it.
			for (int j = 0; j < customArray.size(); ++j) {
				JsonObject customRecipeTemp = (JsonObject) customArray.get(j);

				if (customRecipeTemp.get(NAME_KEY).getAsString().equalsIgnoreCase(defaultRecipe.get(NAME_KEY).getAsString())) {
					customRecipe = customRecipeTemp;
					break;
				}
			}

			String recipeName;
			CraftingGroup recipeCraftingGroup;
			JsonArray subRecipeArray;

			// If we don't have a custom entry, we should add it.
			if (customRecipe == null) {
				recipeName = defaultRecipe.get(NAME_KEY).getAsString();
				recipeCraftingGroup = CraftingGroup.valueOf(defaultRecipe.get(CRAFTING_GROUP_KEY).getAsString());
				subRecipeArray = defaultRecipe.get(RECIPE_ARRAY_KEY).getAsJsonArray();

			} else {
				recipeName = customRecipe.get(NAME_KEY).getAsString();
				recipeCraftingGroup = CraftingGroup.valueOf(customRecipe.get(CRAFTING_GROUP_KEY).getAsString());
				subRecipeArray = customRecipe.get(RECIPE_ARRAY_KEY).getAsJsonArray();
			}

			boolean cancellationFlag = false;
			CraftingEntry[] entryArray = new CraftingEntry[subRecipeArray.size()];
			for (int r = 0; r < subRecipeArray.size(); ++r) {
				JsonObject subRecipe = subRecipeArray.get(r).getAsJsonObject();
				boolean isOreDictionary = false;

				// Validate subrecipe
				// First let's check to see if it has the ESSENTIAL keys
				if (!subRecipe.has(ENTRY_ITEM_NAME_KEY) || !subRecipe.has(COUNT_KEY)) {
					LOG.debug("Sub-recipe no. {} for recipe {} missing essential keys.", r, recipeName);
					cancellationFlag = true;
					break;
				}

				// Make sure OreDictionary set up properly
				if (subRecipe.has(ORE_DICTIONARY_BOOLEAN_KEY)) {
					isOreDictionary = subRecipe.get(ORE_DICTIONARY_BOOLEAN_KEY).getAsBoolean();
					if (isOreDictionary && !subRecipe.has(ORE_DICTIONARY_DEFAULT_ITEM)) {
						LOG.debug("Sub-recipe no. {} for recipe {} states it is OreDictionary, but does not provide a default item.", r, recipeName);
						cancellationFlag = true;
						break;
					}
				}

				if (isOreDictionary) {
					Item defaultItem = Item.getByNameOrId(subRecipe.get(ORE_DICTIONARY_DEFAULT_ITEM).getAsString());
					entryArray[r] = new CraftingEntry(defaultItem, subRecipe.get(ENTRY_ITEM_NAME_KEY).getAsString(), subRecipe.get(COUNT_KEY).getAsInt());
				} else {
					entryArray[r] = new CraftingEntry(Item.getByNameOrId(subRecipe.get(ENTRY_ITEM_NAME_KEY).getAsString()), subRecipe.get(COUNT_KEY).getAsInt());
				}
			}

			// Allows us to skip the recipe if there are problems
			if (cancellationFlag)
				continue;

			Item item = Item.getByNameOrId(recipeName);
			if (item == null) {
				ModReference.LOG.error("Could not find item with name: " + recipeName);
				continue;
			}

			// Register the recipe
			CraftingRegistry.registerRecipe(item, recipeCraftingGroup, entryArray);
		}
	}

	@Override
	public File getDirectory() {
		DIRECTORY.mkdirs();
		return DIRECTORY;
	}

	private void initializeJSON(InputStream is) throws JsonIOException, JsonSyntaxException {
		byte[] array;
		try { array = IOUtils.toByteArray(is); }
		catch (IOException e) { throw new JsonIOException("Failed to copy array into bytes!"); }
		
		if(array == null)
			throw new JsonIOException("Failed to copy array into bytes!");
		
		ByteArrayInputStream hashStream = new ByteArrayInputStream(array);
		ByteArrayInputStream readStream = new ByteArrayInputStream(array);
		InputStreamReader reader = new InputStreamReader(readStream);
		
		JsonObject extractedObject = GSON_MANAGER.fromJson(reader, JsonObject.class);

		fromJSON(extractedObject);

		try {
			readStream.close();
			reader.close();
		} catch (IOException e) {
			LOG.catching(e);
			LOG.error("Failed to close reader/reading stream for file!");
		}
		
		currentFileHash = getDigest(hashStream);
	}
	
	public InputStream getDefaultFileStream() {
		 return getClass().getClassLoader().getResourceAsStream(DEFAULT_CRAFTING_MAPPINGS);
	}

	@Override
	public void loadDirectory() {
		// Gets directory-- this will initialize it
		getDirectory();

		boolean inCustomMode = false;

		InputStream is;
		if (!MAIN_FILE.exists()) {
			// Use default crafting mappings
			LOG.debug("No custom mappings found, switching to default mode.");

			// Set our input stream reader to the default stream
			is = getClass().getClassLoader().getResourceAsStream(DEFAULT_CRAFTING_MAPPINGS);
			
		} else {
			// Use custom mappings
			LOG.debug("Detected custom mappings, using those!");

			// Make the custom input stream
			try {
				is = new FileInputStream(MAIN_FILE);
				inCustomMode = true;

			} catch (FileNotFoundException e) {
				LOG.catching(e);
				LOG.error("Could not find the custom mappings file! Switching to default mappings!");

				// Set our input stream reader to the default stream
				is = getClass().getClassLoader().getResourceAsStream(DEFAULT_CRAFTING_MAPPINGS);
			}
		}

		// Load the input stream to JSON
		try {
			initializeJSON(is);
			loadingStatus = inCustomMode ? 2 : 1;

		} catch(JsonIOException | JsonSyntaxException e) {
			if(inCustomMode) {
				is = getClass().getClassLoader().getResourceAsStream(DEFAULT_CRAFTING_MAPPINGS);
				try {
					initializeJSON(is);
					LOG.debug("Could not initialize custom JSON, succesfully loaded default mappings though!");
					loadingStatus = 1;
				} catch(Exception e1) {
					LOG.error("Could not initialize custom JSON, so attempted to load default, but it failed!");
				}
				
			} else {
				LOG.error("Attempted to load default mappings, but it failed!");
			}
		}
	}

	public int loadJSONStore(InputStream io) {
		try {
			initializeJSON(io);

		} catch(JsonIOException e1) {
			LOG.error("GSON had troubles reading from the Input Stream ({})", io.toString());
			LOG.error("Check your directory permissions and ensure the system can read the file.");
			LOG.catching(e1);
			return -1;
		} catch(JsonSyntaxException e2) {
			LOG.error("GSON had troubles parsing the file syntax for InputStream ({}).", io.toString());
			LOG.catching(e2);
			return -2;
		}

		return 1;
	}
	
	/**
	 * CLIENT ONLY METHODS BELOW
	 */
	
	@SideOnly(Side.CLIENT)
	public boolean checkFileHashAndLoad(byte[] hash) {
		// Check if it's using the default hash.
		if(Arrays.equals(hash, getDefaultFileHash())) {
			// Load the default directory
			if(loadJSONStore(getDefaultFileStream()) == 1) {
				return true;
			} else {
				LOG.error("Could not load default file stream. This means we could not access a file within your jar, check if your version was sourced from CurseForge!");
				return false;
			}
		}
		
		// If we don't have a cache directory, obviously
		// we don't have a custom hash.
		if(!CACHE_DIR.exists())
			return false;
		
		for(File f : CACHE_DIR.listFiles()) {
			
			byte[] checkHash = getDigest(f);

			// Get a new input stream
			try (FileInputStream fis = new FileInputStream(f)) {
				if(Arrays.equals(hash, checkHash)) {
					int status = loadJSONStore(fis);
					// Successfully found a suitable catch and loaded it.
					// Found a cache but failed to load
					return status == 1;
				}

			} catch (FileNotFoundException e) {
				LOG.error("Was testing hashes against cache directory, could not find {}!", f.toString());
				LOG.error("Does your system have permissions set to read that directory?");
			} catch (IOException e) {
				LOG.error("Was unable to reset InputStream for {}", f.toString());
				LOG.catching(e);
			}
		}

		return false;
	}
	
	

	
	@SideOnly(Side.CLIENT)
	public void saveCacheAndLoad(ByteArrayOutputStream baos) {
		// If we are in single player, cancel this.
		// We have alternate loading mechanisms for this.
		if(mc.isIntegratedServerRunning())
			return;
		
		// Get the server IP
		String serverIP = mc.getCurrentServerData().serverIP;
		
		// Create the cache directory if it doesn't exist
		CACHE_DIR.mkdirs();
		
		File cache = new File(CACHE_DIR, serverIP + CACHE_EXTENSION);
		
		// We will usually have to create a cache file, so let's try to
		// do that.
		if(!cache.exists()) {
			try {
				cache.createNewFile();

			} catch (IOException e) {
				LOG.error("Failed to create a new cache file {}!", cache.getName());
				LOG.error("Check system writing priveleges for {} path.", cache.getPath());
				LOG.catching(e);
				return;
			}
		}
		
		// Now we write to our file output stream which is automatically
		// closed through the try-catch.
		try (FileOutputStream fos = new FileOutputStream(cache)) {
			fos.write(baos.toByteArray());
			baos.close();

		} catch (FileNotFoundException e) {
			LOG.error("Failed to find file {}, could not create file output stream to write to cache.", cache);
			LOG.error("Check permissions for directory path {}", cache.getPath());
			LOG.catching(e);

		} catch (IOException e) {
			LOG.error("Failed to write to the file output stream for file {}", cache);
			LOG.catching(e);
		}
	}
}
