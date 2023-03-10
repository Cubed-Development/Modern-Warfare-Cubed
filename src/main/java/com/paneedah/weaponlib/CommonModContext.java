package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.MagazineReloadAspect.LoadPermit;
import com.paneedah.weaponlib.WeaponAttachmentAspect.ChangeAttachmentPermit;
import com.paneedah.weaponlib.WeaponAttachmentAspect.EnterAttachmentModePermit;
import com.paneedah.weaponlib.WeaponAttachmentAspect.ExitAttachmentModePermit;
import com.paneedah.weaponlib.WeaponReloadAspect.CompoundPermit;
import com.paneedah.weaponlib.WeaponReloadAspect.UnloadPermit;
import com.paneedah.weaponlib.compatibility.*;
import com.paneedah.weaponlib.configold.ConfigurationManager;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.crafting.RecipeManager;
import com.paneedah.weaponlib.crafting.ammopress.BlockAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.weaponlib.crafting.workbench.WorkbenchBlock;
import com.paneedah.weaponlib.electronics.*;
import com.paneedah.weaponlib.grenade.*;
import com.paneedah.weaponlib.inventory.*;
import com.paneedah.weaponlib.melee.*;
import com.paneedah.weaponlib.mission.*;
import com.paneedah.weaponlib.network.NetworkPermitManager;
import com.paneedah.weaponlib.network.PermitMessage;
import com.paneedah.weaponlib.network.TypeRegistry;
import com.paneedah.weaponlib.network.packets.*;
import com.paneedah.weaponlib.particle.SpawnParticleMessage;
import com.paneedah.weaponlib.particle.SpawnParticleMessageHandler;
import com.paneedah.weaponlib.state.Permit;
import com.paneedah.weaponlib.state.StateManager;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessageMessageHandler;
import com.paneedah.weaponlib.vehicle.network.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class CommonModContext implements ModContext {

	
	
    static {
        TypeRegistry.getInstance().register(LoadPermit.class);
        TypeRegistry.getInstance().register(MagazineState.class);
        TypeRegistry.getInstance().register(PlayerItemInstance.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        TypeRegistry.getInstance().register(PlayerMagazineInstance.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        TypeRegistry.getInstance().register(Permit.class);
        TypeRegistry.getInstance().register(EnterAttachmentModePermit.class);
        TypeRegistry.getInstance().register(ExitAttachmentModePermit.class);
        TypeRegistry.getInstance().register(ChangeAttachmentPermit.class);
        TypeRegistry.getInstance().register(CompoundPermit.class);
        TypeRegistry.getInstance().register(UnloadPermit.class);
        TypeRegistry.getInstance().register(LoadPermit.class);
        TypeRegistry.getInstance().register(PlayerWeaponInstance.class);
        TypeRegistry.getInstance().register(WeaponState.class);
        TypeRegistry.getInstance().register(PlayerMeleeInstance.class);
        TypeRegistry.getInstance().register(PlayerGrenadeInstance.class);
        TypeRegistry.getInstance().register(PlayerTabletInstance.class);
        TypeRegistry.getInstance().register(PlayerHandheldInstance.class);
        TypeRegistry.getInstance().register(MeleeState.class);
        TypeRegistry.getInstance().register(TabletState.class);
        TypeRegistry.getInstance().register(HandheldState.class);
        TypeRegistry.getInstance().register(SpreadableExposure.class);
        TypeRegistry.getInstance().register(LightExposure.class);
        TypeRegistry.getInstance().register(Mission.class);
        TypeRegistry.getInstance().register(Goal.class);
        TypeRegistry.getInstance().register(KillEntityAction.class);
        TypeRegistry.getInstance().register(ObtainItemAction.class);
        TypeRegistry.getInstance().register(GoToLocationAction.class);
        TypeRegistry.getInstance().register(MissionReward.ItemReward.class);
        TypeRegistry.getInstance().register(MissionOffering.class);
        TypeRegistry.getInstance().register(MissionOffering.NoMissionsInProgressRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.CompletedMissionRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.CooldownMissionRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.CompositeRequirement.class);
        TypeRegistry.getInstance().register(MissionOffering.NoRequirement.class);
    }

    static class BulletImpactSoundKey {
        private CompatibleMaterial material;
        private Item bulletItem;
        
        public BulletImpactSoundKey(CompatibleMaterial material, Item bulletItem) {
            this.material = material;
            this.bulletItem = bulletItem;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((bulletItem == null) ? 0 : bulletItem.hashCode());
            result = prime * result + ((material == null) ? 0 : material.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;

            if (obj == null || getClass() != obj.getClass())
                return false;

            BulletImpactSoundKey other = (BulletImpactSoundKey) obj;

            if (bulletItem != other.bulletItem)
                return false;

            if (material == null)
                return other.material == null;

            return material.equals(other.material);
        }
    }

	protected Object mod;
	
	protected CompatibleChannel channel;

	protected WeaponReloadAspect weaponReloadAspect;
	protected WeaponAttachmentAspect weaponAttachmentAspect;
	protected WeaponFireAspect weaponFireAspect;

	protected MeleeAttachmentAspect meleeAttachmentAspect;
    protected MeleeAttackAspect meleeAttackAspect;

    protected SyncManager<?> syncManager;

	protected MagazineReloadAspect magazineReloadAspect;

	protected NetworkPermitManager permitManager;

	protected PlayerItemInstanceRegistry playerItemInstanceRegistry;

	private Map<ResourceLocation, CompatibleSound> registeredSounds = new HashMap<>();

	private RecipeManager recipeManager;

	private CompatibleSound changeZoomSound;

	private CompatibleSound changeFireModeSound;

	private CompatibleSound noAmmoSound;
	
    private CompatibleSound explosionSound;
    
    private CompatibleSound flashExplosionSound;
    
    private CompatibleSound nightVisionOnSound;
    
    private CompatibleSound nightVisionOffSound;
    
    private Map<BulletImpactSoundKey, MaterialImpactSound> bulletImpactSoundEntries = new HashMap<>();

	private int modEntityID = 256;

    private GrenadeAttackAspect grenadeAttackAspect;

    protected ConfigurationManager configurationManager;
    
    private Map<Integer, String> registeredTextureNames = new HashMap<>();
    
    private int registeredTextureCounter;

    private MissionManager missionManager;
    
    protected static ThreadLocal<ModContext> currentContext = new ThreadLocal<>();

    
    
    
	@Override
    public void preInit(Object mod, ConfigurationManager configurationManager,
            CompatibleFmlPreInitializationEvent event, CompatibleChannel channel) {
		this.mod = mod;
	    this.channel = channel;

		this.configurationManager = configurationManager;

		this.weaponReloadAspect = new WeaponReloadAspect(this);
		this.magazineReloadAspect = new MagazineReloadAspect(this);
		this.weaponFireAspect = new WeaponFireAspect(this);
		this.weaponAttachmentAspect = new WeaponAttachmentAspect(this);

		this.meleeAttackAspect = new MeleeAttackAspect(this);
        this.meleeAttachmentAspect = new MeleeAttachmentAspect(this);

        this.grenadeAttackAspect = new GrenadeAttackAspect(this);
        StateManager<GrenadeState, PlayerGrenadeInstance> grenadeStateManager = new StateManager<>((s1, s2) -> s1 == s2);
        grenadeAttackAspect.setStateManager(grenadeStateManager);

		this.permitManager = new NetworkPermitManager(this);

		this.syncManager = new SyncManager<>(permitManager);

        this.playerItemInstanceRegistry = new PlayerItemInstanceRegistry(syncManager);

		StateManager<WeaponState, PlayerWeaponInstance> weaponStateManager = new StateManager<>((s1, s2) -> s1 == s2);
        weaponReloadAspect.setPermitManager(permitManager);
        weaponReloadAspect.setStateManager(weaponStateManager);

        weaponFireAspect.setPermitManager(permitManager);
        weaponFireAspect.setStateManager(weaponStateManager);

        weaponAttachmentAspect.setPermitManager(permitManager);
        weaponAttachmentAspect.setStateManager(weaponStateManager);

        StateManager<MeleeState, PlayerMeleeInstance> meleeStateManager = new StateManager<>((s1, s2) -> s1 == s2);
        meleeAttackAspect.setStateManager(meleeStateManager);
        meleeAttachmentAspect.setPermitManager(permitManager);
        meleeAttachmentAspect.setStateManager(meleeStateManager);

        StateManager<MagazineState, PlayerMagazineInstance> magazineStateManager = new StateManager<>((s1, s2) -> s1 == s2);

        magazineReloadAspect.setPermitManager(permitManager);
        magazineReloadAspect.setStateManager(magazineStateManager);

		this.recipeManager = new RecipeManager();
		
		
		// Initiate config
		ModernConfigManager.init();
		

		
		channel.registerMessage(new TryFireMessageHandler(weaponFireAspect),
				TryFireMessage.class, 11, CompatibleSide.SERVER);

		channel.registerMessage(permitManager,
				PermitMessage.class, 14, CompatibleSide.SERVER);

		channel.registerMessage(permitManager,
				PermitMessage.class, 15, CompatibleSide.CLIENT);

		channel.registerMessage(new TryAttackMessageHandler(meleeAttackAspect),
                TryAttackMessage.class, 16, CompatibleSide.SERVER);

		channel.registerMessage(new SyncPlayerEntityTrackerMessageMessageHandler(this),
		        SyncPlayerEntityTrackerMessage.class, 17, CompatibleSide.CLIENT);

		channel.registerMessage(new SpawnParticleMessageHandler(this),
		        SpawnParticleMessage.class, 18, CompatibleSide.CLIENT);

		channel.registerMessage(new BlockHitMessageHandler(this),
		        BlockHitMessage.class, 19, CompatibleSide.CLIENT);

		channel.registerMessage(new GrenadeMessageHandler(grenadeAttackAspect),
                GrenadeMessage.class, 20, CompatibleSide.SERVER);

		channel.registerMessage(new ExplosionMessageHandler(this),
                ExplosionMessage.class, 21, CompatibleSide.CLIENT);
		
		channel.registerMessage(new ArmorControlHandler(this),
                ArmorControlMessage.class, 22, CompatibleSide.SERVER);
		
//		channel.registerMessage(new SpreadableExposureMessageHandler(this),
//		        SpreadableExposureMessage.class, 23, CompatibleSide.CLIENT);
		
	    channel.registerMessage(new ExposureMessageHandler(this),
	            ExposureMessage.class, 23, CompatibleSide.CLIENT);
		
		channel.registerMessage(new EntityControlHandler(this),
                EntityControlMessage.class, 24, CompatibleSide.CLIENT);
		
		channel.registerMessage(new EntityControlHandler(this),
                EntityControlMessage.class, 25, CompatibleSide.SERVER);
		
		channel.registerMessage(new EntityInventorySyncHandler(this),
		        EntityInventorySyncMessage.class, 26, CompatibleSide.CLIENT);
		
		channel.registerMessage(new EntityInventorySyncHandler(this),
                EntityInventorySyncMessage.class, 27, CompatibleSide.SERVER);

		channel.registerMessage(new OpenCustomInventoryGuiHandler(this),
		        OpenCustomPlayerInventoryGuiMessage.class, 28, CompatibleSide.SERVER);
		
		channel.registerMessage(new OpenMissionGuiHandler(this),
                OpenMissionGuiMessage.class, 29, CompatibleSide.CLIENT);
		
		channel.registerMessage(new PlayerMissionSyncHandler(this),
                PlayerMissionSyncMessage.class, 30, CompatibleSide.CLIENT);
		
		channel.registerMessage(new AcceptMissionHandler(this),
                AcceptMissionMessage.class, 31, CompatibleSide.SERVER);
		
        channel.registerMessage(new MissionOfferingSyncHandler(this),
                MissionOfferingSyncMessage.class, 32, CompatibleSide.CLIENT);
        
        channel.registerMessage(new EntityMissionOfferingSyncHandler(this),
                EntityMissionOfferingSyncMessage.class, 33, CompatibleSide.CLIENT);
		
        channel.registerMessage(new VehicleControlPacketHandler(this),
        		VehicleControlPacket.class, 34, CompatibleSide.SERVER);
        
        channel.registerMessage(new VehicleClientPacketHandler(this),
        		VehicleClientPacket.class, 35, CompatibleSide.CLIENT);
        
        channel.registerMessage(new VehicleInteractPHandler(this),
        		VehicleInteractPacket.class, 36, CompatibleSide.SERVER);
        
        channel.registerMessage(new GunFXPacket.GunFXPacketHandler(),
        		GunFXPacket.class, 37, CompatibleSide.CLIENT);
        
        channel.registerMessage(new BulletShellClient.GunFXPacketHandler(),
        		BulletShellClient.class, 38, CompatibleSide.CLIENT);
        
        channel.registerMessage(new BalancePackClient.BalancePacketHandler(), BalancePackClient.class, 39, CompatibleSide.CLIENT);
        channel.registerMessage(new HeadshotSFXPacket.GunFXPacketHandler(), HeadshotSFXPacket.class, 40, CompatibleSide.CLIENT);
        channel.registerMessage(new BloodPacketClient.BalancePacketHandler(this),
        		BloodPacketClient.class, 41, CompatibleSide.CLIENT);
        
        channel.registerMessage(new OpenDoorPacket.OpenDoorPacketHandler(this),
        		OpenDoorPacket.class, 42, CompatibleSide.SERVER);

        channel.registerMessage(new StationPacket.WorkbenchPacketHandler(this),
        		StationPacket.class, 43, CompatibleSide.SERVER);
        
        channel.registerMessage(new StationClientPacket.WorkshopClientPacketHandler(this),
        		StationClientPacket.class, 44, CompatibleSide.CLIENT);
        
        channel.registerMessage(new CraftingClientPacket.SimplePacketHandler(this),
        		CraftingClientPacket.class, 45, CompatibleSide.CLIENT);
        
        channel.registerMessage(new CraftingServerPacket.SimplePacketHandler(this),
        		CraftingServerPacket.class, 46, CompatibleSide.SERVER);
        
        channel.registerMessage(new HighIQPickupPacket.SimplePacketHandler(this),
        		HighIQPickupPacket.class, 47, CompatibleSide.SERVER);
        
        
		ServerEventHandler serverHandler = new ServerEventHandler(this);
        compatibility.registerWithFmlEventBus(serverHandler);
        compatibility.registerWithEventBus(serverHandler);

		compatibility.registerWithFmlEventBus(new WeaponKeyInputHandler(this, (ctx) -> getPlayer(ctx),
				weaponAttachmentAspect, channel));

		CompatiblePlayerEntityTrackerProvider.register(this);
		//CompatibleEntityPropertyProvider.register(this);
		CompatibleExposureCapability.register(this);
		CompatibleExtraEntityFlags.register(this);
		CompatibleCustomPlayerInventoryCapability.register(this);
		CompatibleMissionCapability.register(this);

        compatibility.registerModEntity(WeaponSpawnEntity.class, "Ammo" + modEntityID, modEntityID++, mod, 64, 3, true);
        compatibility.registerModEntity(EntityWirelessCamera.class, "wcam" + modEntityID, modEntityID++, mod, 200, 3, true);
        compatibility.registerModEntity(EntityShellCasing.class, "ShellCasing" + modEntityID, modEntityID++, mod, 64, 500, true);
        compatibility.registerModEntity(EntityGrenade.class, "Grenade" + modEntityID, modEntityID++, mod, 64, 10000, false);
        compatibility.registerModEntity(EntitySmokeGrenade.class, "SmokeGrenade" + modEntityID, modEntityID++, mod, 64, 10000, false);
        compatibility.registerModEntity(EntityGasGrenade.class, "GasGrenade" + modEntityID, modEntityID++, mod, 64, 10000, false);
        compatibility.registerModEntity(EntityFlashGrenade.class, "FlashGrenade" + modEntityID, modEntityID++, mod, 64, 10000, false);

        compatibility.registerModEntity(EntitySpreadable.class, "EntitySpreadable" + modEntityID, modEntityID++, mod, 64, 3, false);

        //compatibility.registerModEntity(EntityVehicle.class, "EntityVehicle" + modEntityID, modEntityID++, mod, 64, 3, false);

//        compatibility.registerModEntity(EntityCustomMob.class, "CustomMob" + modEntityID, modEntityID++, mod, 64, 3, true);
//
//        EntityRegistry.addSpawn(EntityCustomMob.class, 1, 1, 3, EnumCreatureType.MONSTER, 
//                BiomeDictionary.getBiomesForType(Type.PLAINS));
        
//        Instance inventoryChangeTriggerInstance = new InventoryChangeTrigger.Instance(
//                MinMaxBounds.UNBOUNDED, 
//                MinMaxBounds.UNBOUNDED, 
//                MinMaxBounds.UNBOUNDED, 
//                new ItemPredicate[] {new ItemPredicate(
//                        Items.APPLE, 
//                        null, 
//                        MinMaxBounds.UNBOUNDED,
//                        MinMaxBounds.UNBOUNDED,
//                        new EnchantmentPredicate[0],
//                        null,
//                        NBTPredicate.ANY)});
//
//        CriteriaTriggers.INVENTORY_CHANGED.addListener(
//                null, new ICriterionTrigger.Listener(inventoryChangeTriggerInstance, null, "Custom inventory change"));
        
     //   File missionsDir = new File(new File(event.getEvent().getSuggestedConfigurationFile().getParent(), "mwc"), "missions");
       // File entityMissionFile = new File(new File(event.getEvent().getSuggestedConfigurationFile().getParent(), "mwc"), "entity_mission_offerings.json");

        
       
        
     
       // compatibility.registerBlock(this, new WorkbenchBlock("workbench", Material.ROCK), "workbench");
        
       // this.missionManager = new MissionManager(missionsDir, entityMissionFile);
	}
	
	@Override
	public void preInitEnd(Object mod, ConfigurationManager configurationManager,
			CompatibleFmlPreInitializationEvent event, CompatibleChannel channel) {
		compatibility.registerTileEntity(TileEntityWorkbench.class, ModReference.id + ":tileworkbench");
		compatibility.registerBlock(this, new WorkbenchBlock(this, "weapon_workbench", Material.WOOD), "weapon_workbench");
		
		compatibility.registerTileEntity(TileEntityAmmoPress.class, ModReference.id + ":tileammopress");
		compatibility.registerBlock(this, new BlockAmmoPress(this, "ammo_press", Material.IRON), "ammo_press");	
	}
	
	@Override
	public MissionManager getMissionManager() {
	    return this.missionManager;
	}

    @Override
    public void init(Object mod) {
    
        compatibility.registerGuiHandler(mod, new GuiHandler());
    }
    
    public static ModContext getContext() {
        return currentContext.get();
    }
	
	@Override
	public boolean isClient() {
	    return false;
	}

	public void registerServerSideOnly() {

	}

	@Override
	public CompatibleSound registerSound(String sound) {
	    if(sound == null) {
	        return null;
	    }
		ResourceLocation soundResourceLocation = new ResourceLocation(ModReference.id, sound);
		return registerSound(soundResourceLocation);
	}

	protected CompatibleSound registerSound(ResourceLocation soundResourceLocation) {
		CompatibleSound result = registeredSounds.get(soundResourceLocation);
		if(result == null) {
			result = new CompatibleSound(soundResourceLocation);
			registeredSounds.put(soundResourceLocation, result);
			compatibility.registerSound(result);
		}
		return result;
	}

	@Override
	public void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer) {
		compatibility.registerItem(weapon, name);
	}

	private EntityPlayer getServerPlayer(CompatibleMessageContext ctx) {
		return ctx != null ? ctx.getPlayer() : null;
	}

	protected EntityPlayer getPlayer(CompatibleMessageContext ctx) {
		return getServerPlayer(ctx);
	}

	@Override
	public CompatibleChannel getChannel() {
		return channel;
	}

	@Override
	public void runSyncTick(Runnable runnable) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void runInMainThread(Runnable runnable) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void registerRenderableItem(String name, Item item, Object renderer) {
		compatibility.registerItem(item, name);
	}
	
	@Override
    public void registerRenderableItem(ResourceLocation name, Item item, Object renderer) {
        compatibility.registerItem(item, name);
    }

	@Override
	public PlayerItemInstanceRegistry getPlayerItemInstanceRegistry() {
        return playerItemInstanceRegistry;
    }

	@Override
	public WeaponReloadAspect getWeaponReloadAspect() {
		return weaponReloadAspect;
	}

	@Override
	public WeaponFireAspect getWeaponFireAspect() {
		return weaponFireAspect;
	}

	@Override
	public WeaponAttachmentAspect getAttachmentAspect() {
		return weaponAttachmentAspect;
	}

	@Override
	public MagazineReloadAspect getMagazineReloadAspect() {
		return magazineReloadAspect;
	}

	@Override
	public MeleeAttackAspect getMeleeAttackAspect() {
	    return meleeAttackAspect;
	}

	@Override
	public MeleeAttachmentAspect getMeleeAttachmentAspect() {
	    return meleeAttachmentAspect;
	}

	@Override
	public PlayerWeaponInstance getMainHeldWeapon() {
		throw new IllegalStateException();
	}

	@Override
	public StatusMessageCenter getStatusMessageCenter() {
		throw new IllegalStateException();
	}


	@Override
	public RecipeManager getRecipeManager() {
		return recipeManager;
	}

	@Override
	public void setChangeZoomSound(String sound) {
		this.changeZoomSound = registerSound(sound.toLowerCase());
	}

	@Override
	public CompatibleSound getZoomSound() {
		return changeZoomSound;
	}

	@Override
	public CompatibleSound getChangeFireModeSound() {
		return changeFireModeSound;
	}

	@Override
	public void setChangeFireModeSound(String sound) {
		this.changeFireModeSound = registerSound(sound.toLowerCase());
	}

	@Override
	public void setNoAmmoSound(String sound) {
		this.noAmmoSound = registerSound(sound.toLowerCase());
	}

	@Override
	public CompatibleSound getNoAmmoSound() {
		return noAmmoSound;
	}

	@Override
	public void setExplosionSound(String sound) {
	    this.explosionSound = registerSound(sound.toLowerCase());
	}

	@Override
	public CompatibleSound getExplosionSound() {
	    return explosionSound;
	}
	
	@Override
	public CompatibleSound getFlashExplosionSound() {
	    return flashExplosionSound;
	}
	
	@Override
	public void setFlashExplosionSound(String sound) {
	    this.flashExplosionSound = registerSound(sound.toLowerCase());
	}
	
	@Override
    public void setNightVisionOnSound(String sound) {
        this.nightVisionOnSound = registerSound(sound.toLowerCase());
    }

    @Override
    public CompatibleSound getNightVisionOnSound() {
        return nightVisionOnSound;
    }
    
    @Override
    public void setNightVisionOffSound(String sound) {
        this.nightVisionOffSound = registerSound(sound.toLowerCase());
    }

    @Override
    public CompatibleSound getNightVisionOffSound() {
        return nightVisionOffSound;
    }

    @Override
    public void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer) {
        compatibility.registerItem(itemMelee, name);
    }

    @Override
    public void registerGrenadeWeapon(String name, ItemGrenade itemMelee, GrenadeRenderer renderer) {
        compatibility.registerItem(itemMelee, name);
    }

    @Override
    public ResourceLocation getNamedResource(String name) {
        return new ResourceLocation(ModReference.id, name);
    }

    @Override
    public float getAspectRatio() {
        return 1f;
    }

    @Override
    public AttachmentContainer getGrenadeAttachmentAspect() {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public GrenadeAttackAspect getGrenadeAttackAspect() {
        return grenadeAttackAspect;
    }
    
    @Override
    public Object getMod() {
        return mod;
    }

    @Override
    public EffectManager getEffectManager() {
        throw new IllegalStateException();
    }

    @Override
    public ConfigurationManager getConfigurationManager() {
        return configurationManager;
    }

    @Override
    public void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer) {}

    @Override
    public void setPlayerTransitionProvider(PlayerTransitionProvider playerTransitionProvider) {}

    @Override
    public CommonModContext setMaterialsImpactSound(String sound, Item bulletItem, float volume, CompatibleMaterial...materials) {
        for(CompatibleMaterial material: materials) {
            MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.computeIfAbsent(
                    new BulletImpactSoundKey(material, bulletItem), key -> new MaterialImpactSound(volume));
            materialImpactSound.addSound(registerSound(sound.toLowerCase()));
        }
        return this;
    }
    
    @Override
    public CommonModContext setMaterialImpactSound(String sound, float volume, CompatibleMaterial material) {
        MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.computeIfAbsent(
                new BulletImpactSoundKey(material, null), key -> new MaterialImpactSound(volume));
        materialImpactSound.addSound(registerSound(sound.toLowerCase()));
        return this;
    }
    
    @Override
    public CommonModContext setMaterialsImpactSound(String sound, float volume, CompatibleMaterial...materials) {
        for(CompatibleMaterial material: materials) {
            MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.computeIfAbsent(
                    new BulletImpactSoundKey(material, null), key -> new MaterialImpactSound(volume));
            materialImpactSound.addSound(registerSound(sound.toLowerCase()));
        }
        return this;
    }
    
    @Override
    public CommonModContext setMaterialsImpactSound(String sound, CompatibleMaterial...materials) {
        for(CompatibleMaterial material: materials) {
            MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.computeIfAbsent(
                    new BulletImpactSoundKey(material, null), key -> new MaterialImpactSound(1f));
            materialImpactSound.addSound(registerSound(sound.toLowerCase()));
        }
        return this;
    }

    @Override
    public MaterialImpactSound getMaterialImpactSound(CompatibleBlockState blockState, WeaponSpawnEntity entity) {
        MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.get(
                new BulletImpactSoundKey(blockState.getMaterial(), entity.getSpawnedItem()));
        if(materialImpactSound == null) {
            bulletImpactSoundEntries.get(
                    new BulletImpactSoundKey(blockState.getMaterial(), null));
        }
        return materialImpactSound;
    }


    @Override
    public CommonModContext setMaterialImpactSounds(CompatibleMaterial material, float volume, String... sounds) {
        for(String sound: sounds) {
            setMaterialImpactSound(sound, volume, material);
        }
        return this;
    }

    @Override
    public int getRegisteredTextureId(String textureName) {
        if(textureName == null) {
            return -1;
        }
        Optional<Entry<Integer, String>> existingEntry = registeredTextureNames
                .entrySet()
                .stream()
                .filter(e -> textureName.equals(e.getValue()))
                .findFirst();
        return existingEntry.isPresent() ? existingEntry.get().getKey() : -1;
    }

    @Override
    public String getRegisteredTexture(int textureId) {
        return registeredTextureNames.get(textureId);
    }

    @Override
    public int registerTexture(String textureName) {
        if(textureName == null) {
            return -1;
        }
        Optional<Entry<Integer, String>> existingEntry = registeredTextureNames.entrySet().stream().filter(e -> textureName.equals(e.getValue()))
            .findFirst();
        int id;
        if(existingEntry.isPresent()) {
            id = existingEntry.get().getKey();
        } else {
            id = registeredTextureCounter++;
            registeredTextureNames.put(id, textureName);
        }
        
        return id;
    }
}
