package com.paneedah.weaponlib;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.MagazineReloadAspect.LoadPermit;
import com.paneedah.weaponlib.WeaponAttachmentAspect.ChangeAttachmentPermit;
import com.paneedah.weaponlib.WeaponAttachmentAspect.EnterAttachmentModePermit;
import com.paneedah.weaponlib.WeaponAttachmentAspect.ExitAttachmentModePermit;
import com.paneedah.weaponlib.WeaponReloadAspect.CompoundPermit;
import com.paneedah.weaponlib.WeaponReloadAspect.UnloadPermit;
import com.paneedah.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatibleExtraEntityFlags;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
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
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

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
    }

    static class BulletImpactSoundKey {
        private Material material;

        public BulletImpactSoundKey(Material material) {
            this.material = material;
        }
        
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
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

            if (material == null)
                return other.material == null;

            return material.equals(other.material);
        }
    }

	protected Object mod;
	
	protected SimpleNetworkWrapper channel;

	protected WeaponReloadAspect weaponReloadAspect;
	protected WeaponAttachmentAspect weaponAttachmentAspect;
	protected WeaponFireAspect weaponFireAspect;

	protected MeleeAttachmentAspect meleeAttachmentAspect;
    protected MeleeAttackAspect meleeAttackAspect;

    protected SyncManager<?> syncManager;

	protected MagazineReloadAspect magazineReloadAspect;

	protected NetworkPermitManager permitManager;

	protected PlayerItemInstanceRegistry playerItemInstanceRegistry;

	private Map<ResourceLocation, SoundEvent> registeredSounds = new HashMap<>();

	private RecipeManager recipeManager;

	private SoundEvent changeZoomSound;

	private SoundEvent changeFireModeSound;

	private SoundEvent noAmmoSound;
	
    private SoundEvent explosionSound;
    
    private SoundEvent flashExplosionSound;
    
    private SoundEvent nightVisionOnSound;
    
    private SoundEvent nightVisionOffSound;
    
    private Map<BulletImpactSoundKey, MaterialImpactSound> bulletImpactSoundEntries = new HashMap<>();

	private int modEntityID = 256;

    private GrenadeAttackAspect grenadeAttackAspect;
    
    private Map<Integer, String> registeredTextureNames = new HashMap<>();
    
    private int registeredTextureCounter;
    
    protected static ModContext currentContext;


	@Override
    public void preInit(Object mod, SimpleNetworkWrapper channel) {
		this.mod = mod;
	    this.channel = channel;

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
		
		channel.registerMessage(new TryFireMessageHandler(weaponFireAspect), TryFireMessage.class, 11, Side.SERVER);

		channel.registerMessage(permitManager, PermitMessage.class, 14, Side.SERVER);

		channel.registerMessage(permitManager, PermitMessage.class, 15, Side.CLIENT);

		channel.registerMessage(new TryAttackMessageHandler(meleeAttackAspect), TryAttackMessage.class, 16, Side.SERVER);

		channel.registerMessage(new SyncPlayerEntityTrackerMessageMessageHandler(this), SyncPlayerEntityTrackerMessage.class, 17, Side.CLIENT);

		channel.registerMessage(new SpawnParticleMessageHandler(this), SpawnParticleMessage.class, 18, Side.CLIENT);

		channel.registerMessage(new BlockHitMessageHandler(), BlockHitMessage.class, 19, Side.CLIENT);

		channel.registerMessage(new GrenadeMessageHandler(grenadeAttackAspect), GrenadeMessage.class, 20, Side.SERVER);

		channel.registerMessage(new ExplosionMessageHandler(this), ExplosionMessage.class, 21, Side.CLIENT);
		
		channel.registerMessage(new ArmorControlHandler(), ArmorControlMessage.class, 22, Side.SERVER);
		
//		channel.registerMessage(new SpreadableExposureMessageHandler(this),	SpreadableExposureMessage.class, 23, Side.CLIENT);
		
	    channel.registerMessage(new ExposureMessageHandler(), ExposureMessage.class, 23, Side.CLIENT);
		
		channel.registerMessage(new EntityControlHandler(this), EntityControlMessage.class, 24, Side.CLIENT);
		
		channel.registerMessage(new EntityControlHandler(this), EntityControlMessage.class, 25, Side.SERVER);
		
		channel.registerMessage(new EntityInventorySyncHandler(this), EntityInventorySyncMessage.class, 26, Side.CLIENT);
		
		channel.registerMessage(new EntityInventorySyncHandler(this), EntityInventorySyncMessage.class, 27, Side.SERVER);

		channel.registerMessage(new OpenCustomInventoryGuiHandler(this), OpenCustomPlayerInventoryGuiMessage.class, 28, Side.SERVER);
		
        channel.registerMessage(new VehicleControlPacketHandler(this), VehicleControlPacket.class, 34, Side.SERVER);

        channel.registerMessage(new VehicleClientPacketHandler(), VehicleClientPacket.class, 35, Side.CLIENT);
        
        channel.registerMessage(new VehicleInteractPHandler(this), VehicleInteractPacket.class, 36, Side.SERVER);
        
        channel.registerMessage(new GunFXPacket.GunFXPacketHandler(), GunFXPacket.class, 37, Side.CLIENT);
        
        channel.registerMessage(new BulletShellClient.GunFXPacketHandler(), BulletShellClient.class, 38, Side.CLIENT);
        
        channel.registerMessage(new BalancePackClient.BalancePacketHandler(), BalancePackClient.class, 39, Side.CLIENT);

        channel.registerMessage(new HeadshotSFXPacket.GunFXPacketHandler(), HeadshotSFXPacket.class, 40, Side.CLIENT);

        channel.registerMessage(new BloodPacketClient.BalancePacketHandler(), BloodPacketClient.class, 41, Side.CLIENT);
        
        channel.registerMessage(new OpenDoorPacket.OpenDoorPacketHandler(), OpenDoorPacket.class, 42, Side.SERVER);

        channel.registerMessage(new StationPacket.WorkbenchPacketHandler(this), StationPacket.class, 43, Side.SERVER);
        
        channel.registerMessage(new StationClientPacket.WorkshopClientPacketHandler(), StationClientPacket.class, 44, Side.CLIENT);
        
        channel.registerMessage(new CraftingClientPacket.SimplePacketHandler(this), CraftingClientPacket.class, 45, Side.CLIENT);
        
        channel.registerMessage(new CraftingServerPacket.SimplePacketHandler(this), CraftingServerPacket.class, 46, Side.SERVER);
        
        channel.registerMessage(new HighIQPickupPacket.SimplePacketHandler(), HighIQPickupPacket.class, 47, Side.SERVER);
        
        
		ServerEventHandler serverHandler = new ServerEventHandler(this);
        MinecraftForge.EVENT_BUS.register(serverHandler);
        MinecraftForge.EVENT_BUS.register(serverHandler);

		MinecraftForge.EVENT_BUS.register(new WeaponKeyInputHandler(this, (ctx) -> getPlayer(ctx),
				weaponAttachmentAspect, channel));

		CompatiblePlayerEntityTrackerProvider.register(this);
		//CompatibleEntityPropertyProvider.register(this);
		CompatibleExposureCapability.register(this);
		CompatibleExtraEntityFlags.register(this);
		CompatibleCustomPlayerInventoryCapability.register(this);

        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "ammo" + modEntityID), WeaponSpawnEntity.class, "Ammo" + modEntityID, modEntityID++, mod, 64, 3, true);
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "wcam" + modEntityID), EntityWirelessCamera.class, "wcam" + modEntityID, modEntityID++, mod, 200, 3, true);
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "ShellCasing" + modEntityID), EntityShellCasing.class, "ShellCasing" + modEntityID, modEntityID++, mod, 64, 500, true);
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "Grenade" + modEntityID), EntityGrenade.class, "Grenade" + modEntityID, modEntityID++, mod, 64, 10000, false);
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "SmokeGrenade" + modEntityID), EntitySmokeGrenade.class, "SmokeGrenade" + modEntityID, modEntityID++, mod, 64, 10000, false);
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "GasGrenade" + modEntityID), EntityGasGrenade.class, "GasGrenade" + modEntityID, modEntityID++, mod, 64, 10000, false);
        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "FlashGrenade" + modEntityID), EntityFlashGrenade.class, "FlashGrenade" + modEntityID, modEntityID++, mod, 64, 10000, false);

        net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, "EntitySpreadable" + modEntityID), EntitySpreadable.class, "EntitySpreadable" + modEntityID, modEntityID++, mod, 64, 3, false);

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
	public void preInitEnd(Object mod, SimpleNetworkWrapper channel) {
        // Workbench
		GameRegistry.registerTileEntity(TileEntityWorkbench.class, ModReference.ID + ":tileworkbench");
        Block workbenchblock = new WorkbenchBlock(this, "weapon_workbench", Material.WOOD).setCreativeTab(MWC.BLOCKS_TAB);
        if (workbenchblock.getRegistryName() == null) {
            if (workbenchblock.getTranslationKey().length() < ModReference.ID.length() + 2 + 5) {
                throw new IllegalArgumentException("Unlocalize block name too short " + workbenchblock.getTranslationKey());
            }
            String unlocalizedName = workbenchblock.getTranslationKey().toLowerCase();
            String registryName = unlocalizedName.substring(5 + ModReference.ID.length() + 1);
            workbenchblock.setRegistryName(ModReference.ID, registryName);
        }

        ForgeRegistries.BLOCKS.register(workbenchblock);
        ItemBlock workbenchItemBlock = new ItemBlock(workbenchblock);
        this.registerRenderableItem(workbenchblock.getRegistryName(), workbenchItemBlock, null);

        // Ammo press
		GameRegistry.registerTileEntity(TileEntityAmmoPress.class, ModReference.ID + ":tileammopress");
        Block ammopressblock = new BlockAmmoPress(this, "ammo_press", Material.IRON).setCreativeTab(MWC.BLOCKS_TAB);

        if (ammopressblock.getRegistryName() == null) {
            if (ammopressblock.getTranslationKey().length() < ModReference.ID.length() + 2 + 5) {
                throw new IllegalArgumentException("Unlocalize block name too short " + ammopressblock.getTranslationKey());
            }
            String unlocalizedName = ammopressblock.getTranslationKey().toLowerCase();
            String registryName = unlocalizedName.substring(5 + ModReference.ID.length() + 1);
            ammopressblock.setRegistryName(ModReference.ID, registryName);
        }

        ForgeRegistries.BLOCKS.register(ammopressblock);
        ItemBlock ammoItemBlock = new ItemBlock(ammopressblock);
        this.registerRenderableItem(ammopressblock.getRegistryName(), ammoItemBlock, null);
    }

    @Override
    public void init(Object mod) {

        NetworkRegistry.INSTANCE.registerGuiHandler(mod, new GuiHandler());
    }
    
    public static ModContext getContext() {
        return currentContext;
    }
	
	@Override
	public boolean isClient() {
	    return false;
	}

	public void registerServerSideOnly() {

	}

	@Override
	public SoundEvent registerSound(String sound) {
	    if(sound == null) {
	        return null;
	    }
		ResourceLocation soundResourceLocation = new ResourceLocation(ModReference.ID, sound);
		return registerSound(soundResourceLocation);
	}

	protected SoundEvent registerSound(ResourceLocation soundResourceLocation) {
        SoundEvent result = registeredSounds.get(soundResourceLocation);
		if(result == null) {
			result = new SoundEvent(soundResourceLocation);
			registeredSounds.put(soundResourceLocation, result);
            result.setRegistryName(soundResourceLocation);
            ForgeRegistries.SOUND_EVENTS.register(result);
		}
		return result;
	}

	@Override
	public void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer) {
        weapon.setRegistryName(ModReference.ID, name); // temporary hack
        ForgeRegistries.ITEMS.register(weapon);
	}

	private EntityPlayer getServerPlayer(MessageContext ctx) {
		return ctx != null ? ctx.getServerHandler().player : null;
	}

	protected EntityPlayer getPlayer(MessageContext ctx) {
		return getServerPlayer(ctx);
	}

	@Override
	public SimpleNetworkWrapper getChannel() {
		return channel;
	}

	@Override
	public void runSyncTick(Runnable runnable) {
		throw new UnsupportedOperationException();
	}

    @Override
	public void registerRenderableItem(String name, Item item, Object renderer) {
        item.setRegistryName(ModReference.ID, name); // temporary hack
        ForgeRegistries.ITEMS.register(item);
	}
	
	@Override
    public void registerRenderableItem(ResourceLocation name, Item item, Object renderer) {
        item.setRegistryName(name); // temporary hack
        ForgeRegistries.ITEMS.register(item);
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
	public SoundEvent getZoomSound() {
		return changeZoomSound;
	}

	@Override
	public SoundEvent getChangeFireModeSound() {
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
	public SoundEvent getNoAmmoSound() {
		return noAmmoSound;
	}

	@Override
	public void setExplosionSound(String sound) {
	    this.explosionSound = registerSound(sound.toLowerCase());
	}

	@Override
	public SoundEvent getExplosionSound() {
	    return explosionSound;
	}
	
	@Override
	public SoundEvent getFlashExplosionSound() {
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
    public SoundEvent getNightVisionOnSound() {
        return nightVisionOnSound;
    }
    
    @Override
    public void setNightVisionOffSound(String sound) {
        this.nightVisionOffSound = registerSound(sound.toLowerCase());
    }

    @Override
    public SoundEvent getNightVisionOffSound() {
        return nightVisionOffSound;
    }

    @Override
    public void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer) {
        itemMelee.setRegistryName(ModReference.ID, name); // temporary hack
        ForgeRegistries.ITEMS.register(itemMelee);
    }

    @Override
    public void registerGrenadeWeapon(String name, ItemGrenade itemMelee, GrenadeRenderer renderer) {
        itemMelee.setRegistryName(ModReference.ID, name); // temporary hack
        ForgeRegistries.ITEMS.register(itemMelee);
    }

    @Override
    public ResourceLocation getNamedResource(String name) {
        return new ResourceLocation(ModReference.ID, name);
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
    public void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer) {}

    @Override
    public void setPlayerTransitionProvider(PlayerTransitionProvider playerTransitionProvider) {}

    @Override
    public CommonModContext setMaterialImpactSound(String sound, float volume, Material material) {
        MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.computeIfAbsent(new BulletImpactSoundKey(material), key -> new MaterialImpactSound(volume));
        materialImpactSound.addSound(registerSound(sound.toLowerCase()));
        return this;
    }
    
    @Override
    public CommonModContext setMaterialsImpactSound(String sound, float volume, Material...materials) {
        for(Material material: materials) {
            MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.computeIfAbsent(new BulletImpactSoundKey(material), key -> new MaterialImpactSound(volume));
            materialImpactSound.addSound(registerSound(sound.toLowerCase()));
        }
        return this;
    }
    
    @Override
    public CommonModContext setMaterialsImpactSound(String sound, Material...materials) {
        for(Material material: materials) {
            MaterialImpactSound materialImpactSound = bulletImpactSoundEntries.computeIfAbsent(new BulletImpactSoundKey(material), key -> new MaterialImpactSound(1f));
            materialImpactSound.addSound(registerSound(sound.toLowerCase()));
        }
        return this;
    }

    @Override
    public MaterialImpactSound getMaterialImpactSound(IBlockState iBlockState, WeaponSpawnEntity entity) {
        return bulletImpactSoundEntries.get(new BulletImpactSoundKey(iBlockState.getMaterial()));
    }


    @Override
    public CommonModContext setMaterialImpactSounds(Material material, float volume, String... sounds) {
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
