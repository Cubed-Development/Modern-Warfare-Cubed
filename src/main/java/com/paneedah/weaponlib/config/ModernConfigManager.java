package com.paneedah.weaponlib.config;

import net.minecraftforge.common.config.Config.RangeDouble;
import net.minecraftforge.common.config.Config.RangeInt;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class ModernConfigManager {
	
	private static final HashMap<Field, Property> elementMappings = new HashMap<>();
	
	//private static final List<Field> MODERN_CONFIG_FIELDS = new ArrayList<>();
	
	public static final String CATEGORY_RENDERING = "rendering";
	public static final String CATEGORY_RENDERING_SCREENSHADERS = "rendering.screenshaders";
	public static final String CATEGORY_GAMEPLAY = "gameplay";
	public static final String CATEGORY_ENTITIES = "entities";
	public static final String CATEGORY_ORES = "ores";

	@ConfigSync(category = CATEGORY_ORES, comment = "Spawns per chunk for sulfur ore.")
	public static int sulfurSpawnsPerChunk = 13;

	@ConfigSync(category = CATEGORY_ORES, comment = "Spawns per chunk for copper ore.")
	public static int copperSpawnsPerChunk = 12;

	@ConfigSync(category = CATEGORY_ORES, comment = "Spawns per chunk for tin ore.")
	public static int tinSpawnsPerChunk = 10;

	@ConfigSync(category = CATEGORY_ORES, comment = "Spawns per chunk for lead ore.")
	public static int leadSpawnsPerChunk = 11;

	@ConfigSync(category = CATEGORY_ORES, comment = "Spawns per chunk for graphite ore.")
	public static int graphiteSpawnsPerChunk = 9;

	
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Setting this to false disables all shaders, enabling allows to select which shaders are used.")
	public static boolean enableAllShaders = true;

	@ConfigSync(category = CATEGORY_RENDERING, comment = "Setting this to false disables all world shaders, enabling allows to select which world shaders are used.")
	public static boolean enableWorldShaders = true;
	
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Setting this to false disables all screen shaders, enabling allows to select which screen shaders are used.")
	public static boolean enableScreenShaders = true;
	
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Enables gun shaders, so skinning & lighting")
	public static boolean enableGunShaders = true;
	
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Enables scope effects")
	public static boolean enableScopeEffects = true;
	
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Enables flash shaders")
	public static boolean enableFlashShaders = true;
	
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Enables reticle shaders")
	public static boolean enableReticleShaders = true;
	
	
	@ConfigSync(category = CATEGORY_RENDERING_SCREENSHADERS, comment = "Enables film grain effect")
	public static boolean filmGrain = true;
	
	@RangeDouble(min = 0.0, max = 1.0)
	@ConfigSync(category = CATEGORY_RENDERING_SCREENSHADERS, comment = "Configures the intensity of the film grain effect")
	public static double filmGrainIntensity = 0.025;
	
	@ConfigSync(category = CATEGORY_RENDERING_SCREENSHADERS, comment = "Enables glow around bright objects (bloom)")
	public static boolean bloomEffect = true;
	
	@RequiresMcRestart
	@RangeInt(min = 2, max = 8)
	@ConfigSync(category = CATEGORY_RENDERING_SCREENSHADERS, comment = "Lower numbers = better performance")
	public static int bloomLayers = 3;
	
	@ConfigSync(category = CATEGORY_RENDERING_SCREENSHADERS, comment = "Enable on-screen rain/snow VFX")
	public static boolean onScreenRainAndSnow = false;
	
	@RequiresMcRestart
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Enables the HDR framebuffer, requires restart. The HDR is the cause of a lot of shader incompat")
	public static boolean enableHDRFramebuffer = true;
	
	@ConfigSync(category = CATEGORY_RENDERING, comment = "Enables the fancy MWC snow/rain (BROKEN - CRASHES GAME IF ENABLED)")
	public static boolean enableFancyRainAndSnow = false;
	
	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Enables the ammo counter")
	public static boolean enableAmmoCounter = true;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "")
	public static int ammoCounterX = 0;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "")
	public static int ammoCounterY = 0;

	@RangeDouble(min=0.1, max=3.0)
	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "")
	public static double ammoCounterSize = 0.50;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Enables the black background on the ammo counter.")
	public static boolean enableAmmoCounterBackground = true;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "")
	public static boolean ammoCounterBackgroundReverse = false;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Enable open door key display when hovering doors")
	public static boolean enableOpenDoorDisplay = true;
	
	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "If true, hold to aim. If false, toggle to aim.")
	public static boolean holdToAim = true;

	@RangeDouble(min=0.0, max=1.0)
	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Should players bleed when hit?")
	public static double enableBleedingOnHit = 1.0F;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Should glass blocks be breakable by bullets?")
	public static boolean bulletBreakGlass = true;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "A list of blocks that will be penetrable by bullets.")
	public static String penetrableBlocks = "minecraft:glass, minecraft:glass_pane, minecraft:stained_glass, minecraft:stained_glass_pane";

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Whether entities should have knockback applied to them when shot.")
	public static boolean knockbackOnHit = true;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Enables muzzle effects.")
	public static boolean enableMuzzleEffects = true;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Should blur be applied when aiming?")
	public static boolean enableBlurOnAim = true;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Should the explosion break blocks?")
	public static boolean explosionBreak = true;
	
	@RangeDouble(min=0.0, max=20.0)
	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "How much damage explosions should deal.")
	public static double explosionDamage = 5.0;

	@RangeDouble(min=0.0, max=1.0)
	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "What should the block drop chance be?")
	public static double explodedBlockDropChance = 1.0;

	@ConfigSync(category = CATEGORY_GAMEPLAY, comment = "Where should the status bar be located?")
	public static String statusBarPosition = "TOP_RIGHT";

	// It is temporary and should be deleted
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posX = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posY = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posZ = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posX1 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posY1 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posZ1 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posX2 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posY2 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posZ2 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posX3 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posY3 = 0.0;
	@ConfigSync(category = "DEBUG", comment = "")
	public static double posZ3 = 0.0;


	@RequiresMcRestart
	@RangeDouble(min=0.1, max=5.0)
	@ConfigSync(category = CATEGORY_ENTITIES, comment = "How much health should terrorists have?")
	public static double terroristHealth = 1.0;

	@RequiresMcRestart
	@RangeDouble(min=0, max=2.0)
	@ConfigSync(category = CATEGORY_ENTITIES, comment = "How much should terrorists spawn?")
	public static double terroristSpawn = 0.1;

	@RequiresMcRestart
	@RangeDouble(min=0.1, max=5.0)
	@ConfigSync(category = CATEGORY_ENTITIES, comment = "How much health should soldiers have?")
	public static double soldierHealth = 2.0;

	@RequiresMcRestart
	@RangeDouble(min=0, max=2.0)
	@ConfigSync(category = CATEGORY_ENTITIES, comment = "How much should soldiers spawn?")
	public static double soldierSpawn = 0.0;

	@ConfigSync(category = CATEGORY_ENTITIES, comment = "What equipments should the terrorists have?")
	public static String terroristEquipmentConfiguration = "m4a1:1.0:M4A1Mag_2, m16a1:1.0:M4A1Mag_2, Remington870:1.0";

	private static Configuration config = null;

	private static boolean isLoaded = false;
	
	public static void updateField(Field f, Object value) {
		
		// Try to set field
		try {
			// Instance is 'null' because all of these
			// fields are static.
			f.set(null, value);
		} catch (IllegalArgumentException | IllegalAccessException e) {
			LOG.error("Could not set field for field name: {}, please report this to developers.", f.getName());
			e.printStackTrace();
		}

		if(f.getType() == int.class) {
			elementMappings.get(f).set((int) value);
		} else if(f.getType() == int[].class) {
			elementMappings.get(f).set((int[]) value);
		} else if(f.getType() == boolean.class) {
		 	elementMappings.get(f).set((boolean) value);
		} else if(f.getType() == boolean[].class) {
			elementMappings.get(f).set((boolean[]) value);
		} else if(f.getType() == String.class) {
			elementMappings.get(f).set((String) value);
		} else if(f.getType() == String[].class) {
			elementMappings.get(f).set((String[]) value);
		} else if(f.getType() == double.class) {
			elementMappings.get(f).set((double) value);
		} else if(f.getType() == double[].class) {
			elementMappings.get(f).set((double[]) value);
		} else if(f.getType() == long.class) {
			elementMappings.get(f).set((long) value);
		}
	}
	
	private static void registerProperty(Field f, ConfigSync annotation) {
		Property property = null;
		
		try {
			if(f.getType() == int.class) {
				boolean isRanged = f.isAnnotationPresent(RangeInt.class);
				if(!isRanged) {
					property = config.get(annotation.category(), f.getName(), f.getInt(null), annotation.comment());
					f.set(null, property.getInt());

				} else {
					RangeInt rangedAnnotation = f.getAnnotation(RangeInt.class);
					property = config.get(annotation.category(), f.getName(), f.getInt(null), annotation.comment(), rangedAnnotation.min(), rangedAnnotation.max());
					f.set(null, property.getInt());
				}

			} else if(f.getType() == boolean.class) {
				property = config.get(annotation.category(), f.getName(), f.getBoolean(null), annotation.comment());
				f.set(null, property.getBoolean());

			} else if(f.getType() == String.class) {
				property = config.get(annotation.category(), f.getName(), (String) f.get(null), annotation.comment());
				f.set(null, property.getString());

			} else if(f.getType() == double.class) {
				boolean isRanged = f.isAnnotationPresent(RangeDouble.class);
				if(!isRanged) {
					property = config.get(annotation.category(), f.getName(), f.getDouble(null), annotation.comment());
					f.set(null, property.getDouble());

				} else {
					RangeDouble range = f.getAnnotation(RangeDouble.class);
					property = config.get(annotation.category(), f.getName(), f.getDouble(null), annotation.comment(), range.min(), range.max());
					f.set(null, property.getDouble());
				}
			}

		} catch(IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}

		if (f.isAnnotationPresent(RequiresMcRestart.class) && property != null) {
			property.setRequiresMcRestart(true);
		}

		// Put property into the map
		elementMappings.put(f, property);
	}
	
	public static void saveConfig() {
		config.save();
	}
	
	public static void init() {
		if(isLoaded)
			return;

		isLoaded = true;
		config = new Configuration(new File(Loader.instance().getConfigDir(), "mwc.cfg"));
		
		// Initialize this class' fields
		for(Field f : ModernConfigManager.class.getFields()) {
			ConfigSync annotation = f.getAnnotation(ConfigSync.class);
			if(annotation == null) continue;
			//MODERN_CONFIG_FIELDS.add(f);

			registerProperty(f, annotation);
			
			if(!FMLCommonHandler.instance().getSide().isServer()) {
				// Submits field to be organized within the tree
				VMWModConfigGUI.submitField(annotation, f);
			}
		}

		saveConfig();
	}
}
