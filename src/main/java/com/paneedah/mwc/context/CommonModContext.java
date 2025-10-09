package com.paneedah.mwc.context;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.capabilities.EquipmentCapability;
import com.paneedah.mwc.instancing.PlayerGrenadeInstance;
import com.paneedah.mwc.instancing.PlayerItemInstanceRegistry;
import com.paneedah.mwc.instancing.PlayerMagazineInstance;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.network.NetworkPermitManager;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.compatibility.CompatiblePlayerEntityTrackerProvider;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.crafting.RecipeManager;
import com.paneedah.weaponlib.crafting.ammopress.BlockAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.weaponlib.crafting.workbench.WorkbenchBlock;
import com.paneedah.weaponlib.grenade.*;
import com.paneedah.weaponlib.inventory.GuiHandler;
import com.paneedah.weaponlib.melee.*;
import com.paneedah.weaponlib.state.StateManager;
import dev.redstudio.redcore.utils.Case;
import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.*;
import java.util.Map.Entry;

import static com.paneedah.mwc.ProjectConstants.ID;
import static com.paneedah.mwc.ProjectConstants.LOGGER;

public class CommonModContext implements ModContext {

    @Getter protected WeaponReloadAspect weaponReloadAspect;
    @Getter protected WeaponAttachmentAspect weaponAttachmentAspect;
    @Getter protected WeaponFireAspect weaponFireAspect;

    @Getter protected MeleeAttachmentAspect meleeAttachmentAspect;
    @Getter protected MeleeAttackAspect meleeAttackAspect;

    protected SyncManager<?> syncManager;

    @Getter protected MagazineReloadAspect magazineReloadAspect;

    @Getter protected NetworkPermitManager networkPermitManager;

    @Getter protected PlayerItemInstanceRegistry playerItemInstanceRegistry;

    private final Map<ResourceLocation, SoundEvent> registeredSounds = new HashMap<>();

    @Getter private RecipeManager recipeManager;

    @Getter private final SoundEvent changeFireModeSound = registerSound("firerate_toggle");

    @Getter private final SoundEvent noAmmoSound = registerSound("dry_fire");

    @Getter private final SoundEvent explosionSound = registerSound("grenadeexplosion");

    @Getter private final SoundEvent flashExplosionSound = registerSound("flashbang");

    @Getter private final SoundEvent nightVisionOnSound = registerSound("nightvision_on");

    @Getter private final SoundEvent nightVisionOffSound = registerSound("nightvision_off");

    private final Map<Material, MaterialImpactSound> bulletImpactSoundEntries = new HashMap<>();

    @Getter private GrenadeAttackAspect grenadeAttackAspect;

    private final Map<Integer, String> registeredTextureNames = new HashMap<>();

    private int registeredTextureCounter;

    @Override
    public void preInit() {
        weaponReloadAspect = new WeaponReloadAspect();
        magazineReloadAspect = new MagazineReloadAspect();
        weaponFireAspect = new WeaponFireAspect();
        weaponAttachmentAspect = new WeaponAttachmentAspect();

        meleeAttackAspect = new MeleeAttackAspect();
        meleeAttachmentAspect = new MeleeAttachmentAspect();

        grenadeAttackAspect = new GrenadeAttackAspect();
        StateManager<GrenadeState, PlayerGrenadeInstance> grenadeStateManager = new StateManager<>((s1, s2) -> s1 == s2);
        grenadeAttackAspect.setStateManager(grenadeStateManager);

        networkPermitManager = new NetworkPermitManager();

        syncManager = new SyncManager<>(networkPermitManager);

        playerItemInstanceRegistry = new PlayerItemInstanceRegistry(syncManager);

        StateManager<WeaponState, PlayerWeaponInstance> weaponStateManager = new StateManager<>((s1, s2) -> s1 == s2);
        weaponReloadAspect.setPermitManager(networkPermitManager);
        weaponReloadAspect.setStateManager(weaponStateManager);

        weaponFireAspect.setPermitManager(networkPermitManager);
        weaponFireAspect.setStateManager(weaponStateManager);

        weaponAttachmentAspect.setPermitManager(networkPermitManager);
        weaponAttachmentAspect.setStateManager(weaponStateManager);

        StateManager<MeleeState, PlayerMeleeInstance> meleeStateManager = new StateManager<>((s1, s2) -> s1 == s2);
        meleeAttackAspect.setStateManager(meleeStateManager);
        meleeAttachmentAspect.setPermitManager(networkPermitManager);
        meleeAttachmentAspect.setStateManager(meleeStateManager);

        StateManager<MagazineState, PlayerMagazineInstance> magazineStateManager = new StateManager<>((s1, s2) -> s1 == s2);

        magazineReloadAspect.setPermitManager(networkPermitManager);
        magazineReloadAspect.setStateManager(magazineStateManager);

        this.recipeManager = new RecipeManager();

        // Initiate config
        ModernConfigManager.init();

        CommonEventHandler serverHandler = new CommonEventHandler();
        MinecraftForge.EVENT_BUS.register(serverHandler);
        MinecraftForge.EVENT_BUS.register(serverHandler);

        MinecraftForge.EVENT_BUS.register(new WeaponKeyInputHandler(this::getPlayer));

        CompatiblePlayerEntityTrackerProvider.register();
        //CompatibleEntityPropertyProvider.register(this);
        CompatibleExposureCapability.register();
        EquipmentCapability.register();
    }

    @Override
    public void registerTileEntities() {
        GameRegistry.registerTileEntity(TileEntityWorkbench.class, new ResourceLocation(ID, "tileworkbench"));
        final Block workbenchblock = new WorkbenchBlock("weapon_workbench", Material.WOOD).setCreativeTab(MWC.BLOCKS_AND_INGOTS_TAB);
        ForgeRegistries.BLOCKS.register(workbenchblock); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
        registerRenderableItem(workbenchblock.getRegistryName(), new ItemBlock(workbenchblock), null);

        GameRegistry.registerTileEntity(TileEntityAmmoPress.class, new ResourceLocation(ID, "tileammopress"));
        final Block ammopressblock = new BlockAmmoPress("ammo_press", Material.IRON).setCreativeTab(MWC.BLOCKS_AND_INGOTS_TAB);
        ForgeRegistries.BLOCKS.register(ammopressblock); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
        registerRenderableItem(ammopressblock.getRegistryName(), new ItemBlock(ammopressblock), null);
    }

    @Override
    public void init() {
        NetworkRegistry.INSTANCE.registerGuiHandler(MWC.instance, new GuiHandler());
    }

    @Override
    public SoundEvent registerSound(final String path) {
        if (path == null) {
            LOGGER.warn("Attempted to register null sound.");
            return null;
        }

        if (path.isEmpty())
            throw new IllegalArgumentException("Path cannot be empty.");

        if (!Case.LOWER_SNAKE_CASE.check(path))
            LOGGER.warn("Registering sound with wrong casing: {}", path);

        final ResourceLocation soundResourceLocation = new ResourceLocation(ID, path);

        if (registeredSounds.containsKey(soundResourceLocation)) {
            LOGGER.warn("Attempted to re-register sound: {}", soundResourceLocation);
            return (registeredSounds.get(soundResourceLocation));
        }

        final SoundEvent result = new SoundEvent(soundResourceLocation);
        registeredSounds.put(soundResourceLocation, result);

        result.setRegistryName(soundResourceLocation);
        ForgeRegistries.SOUND_EVENTS.register(result); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19

        return result;
    }

    @Override
    public void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer) {
        weapon.setRegistryName(ID, name);
        ForgeRegistries.ITEMS.register(weapon); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
    }

    private EntityPlayer getServerPlayer(MessageContext ctx) {
        return ctx != null ? ctx.getServerHandler().player : null;
    }

    protected EntityPlayer getPlayer(MessageContext ctx) {
        return getServerPlayer(ctx);
    }

    @Override
    public void registerRenderableItem(String name, Item item, Object renderer) {
        item.setRegistryName(ID, name);
        ForgeRegistries.ITEMS.register(item); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
    }

    @Override
    public void registerRenderableItem(ResourceLocation name, Item item, Object renderer) {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
    }

    @Override
    public PlayerWeaponInstance getMainHeldWeapon() {
        throw new IllegalStateException();
    }

    @Override
    public void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer) {
        itemMelee.setRegistryName(ID, name);
        ForgeRegistries.ITEMS.register(itemMelee); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
    }

    @Override
    public void registerGrenadeWeapon(String name, ItemGrenade itemMelee, GrenadeRenderer renderer) {
        itemMelee.setRegistryName(ID, name);
        ForgeRegistries.ITEMS.register(itemMelee); // ! TODO: Temporary hack because we should use the registry event instead - Luna Mira Lage (Desoroxxx) 2025-09-19
    }

    @Override
    public ResourceLocation getNamedResource(final String path) {
        return new ResourceLocation(ID, path);
    }

    @Override
    public float getAspectRatio() {
        throw new IllegalStateException();
    }

    @Override
    public EffectManager getEffectManager() {
        throw new IllegalStateException();
    }

    @Override
    public void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer) {}

    @Override
    public MaterialImpactSound getMaterialImpactSound(Material material) {
        return bulletImpactSoundEntries.get(material);
    }

    @Override
    public void setMaterialImpactSounds(Material material, String... paths) {
        for (final String path : paths) {
            if (!bulletImpactSoundEntries.containsKey(material))
                bulletImpactSoundEntries.put(material, new MaterialImpactSound(1.5F));

            bulletImpactSoundEntries.get(material).addSound(registerSound(path));
        }
    }

    @Override
    public String getRegisteredTexture(int textureId) {
        return registeredTextureNames.get(textureId);
    }

    @Override
    public int registerTexture(String textureName) {
        if (textureName == null) {
            return -1;
        }
        Optional<Entry<Integer, String>> existingEntry = registeredTextureNames.entrySet().stream().filter(e -> textureName.equals(e.getValue()))
                .findFirst();
        int id;
        if (existingEntry.isPresent()) {
            id = existingEntry.get().getKey();
        } else {
            id = registeredTextureCounter++;
            registeredTextureNames.put(id, textureName);
        }

        return id;
    }
}
