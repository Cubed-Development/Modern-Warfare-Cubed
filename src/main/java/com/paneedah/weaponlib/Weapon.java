package com.paneedah.weaponlib;

import akka.japi.Pair;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.BulletHoleRenderer.BulletHole;
import com.paneedah.weaponlib.animation.ScreenShakeAnimation;
import com.paneedah.weaponlib.animation.ScreenShakingAnimationManager;
import com.paneedah.weaponlib.animation.SpecialAttachments;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.crafting.*;
import com.paneedah.weaponlib.model.Shell;
import com.paneedah.weaponlib.render.WeaponSpritesheetBuilder;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.oredict.ShapedOreRecipe;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.*;
import java.util.stream.Collectors;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class Weapon extends Item implements PlayerItemInstanceFactory<PlayerWeaponInstance, WeaponState>,
AttachmentContainer, Reloadable, Inspectable, Modifiable, Updatable, IModernCrafting {

    public enum ShellCasingEjectDirection { LEFT, RIGHT };
    
    public static class ScreenShaking {
        
        private float zRotationCoefficient;

        public ScreenShaking(float zRotationCoefficient) {
            this.zRotationCoefficient = zRotationCoefficient;
        }
        
        public float getZRotationCoefficient() {
            return zRotationCoefficient;
        }
    }

    public static class Builder {

        public static int noRecipe = 0;

        private static final float DEFAULT_SPAWN_ENTITY_SPEED = 150f;
        private static final float DEFAULT_INACCURACY = 0f;
        private static final String DEFAULT_SHELL_CASING_TEXTURE_NAME = "weaponlib:/com/paneedah/weaponlib/resources/shell.png";
        private static final float DEFAULT_SHELL_CASING_VELOCITY = 0.1f;
        private static final float DEFAULT_SHELL_CASING_GRAVITY_VELOCITY = 0.05f;
        private static final float DEFAULT_SHELL_CASING_INACCURACY = 20f;
       

        String name;
        List<String> textureNames = new ArrayList<>();
        int ammoCapacity = 0;
        float recoil = 1.0F;

        private boolean hasFlashPedals = false;
        
        private String shootSound;
        private String silencedShootSound;
        private String reloadSound;
        private String reloadIterationSound;
        private String inspectSound;
        private String drawSound;
        private String allReloadIterationsCompletedSound;
        private String unloadSound;
        private String ejectSpentRoundSound;
        private String endOfShootSound;
        private String burstShootSound;
        private String silencedBurstShootSound;
        
        private GunConfigurationGroup configGroup = GunConfigurationGroup.NONE;
        
        private Vec3d muzzlePosition = new Vec3d(-.3, -1.0, -5.3);

        @SuppressWarnings("unused")
        private String exceededMaxShotsSound;
        ItemAmmo ammo;
        float fireRate = Weapon.DEFAULT_FIRE_RATE;
        private CreativeTabs creativeTab;
        private WeaponRenderer renderer;
        //float zoom = Weapon.DEFAULT_ZOOM;
        List<Integer> maxShots = new ArrayList<>();
        String crosshair;
        String crosshairRunning;
        String crosshairZoomed;
        BiFunction<Weapon, EntityLivingBase, ? extends WeaponSpawnEntity> spawnEntityWith;
        BiFunction<PlayerWeaponInstance, EntityLivingBase, ? extends EntityShellCasing> spawnShellWith;
        private float spawnEntityDamage;
        private boolean spawnEntityRocketParticles;
        private float spawnEntityExplosionRadius;
        private boolean isDestroyingBlocks = true;
        private float spawnEntityGravityVelocity;
        private float spawnEntityParticleAgeCoefficient = 1f;
        private float spawnEntitySmokeParticleAgeCoefficient = 1f;
        private float spawnEntityExplosionParticleScaleCoefficient = 1.5f;
        private float spawnEntitySmokeParticleScaleCoefficient = 1f;
        public long reloadingTimeout = Weapon.DEFAULT_RELOADING_TIMEOUT_TICKS;
        long loadIterationTimeout = Weapon.DEFAULT_LOAD_ITERATION_TIMEOUT_TICKS;

        


        boolean crosshairFullScreen = false;
        boolean crosshairZoomedFullScreen = false;

        
        
        Map<ItemAttachment<Weapon>, CompatibleAttachment<Weapon>> compatibleAttachments = new HashMap<>();
        ModelBase ammoModel;
        String ammoModelTextureName;
        ModelBase shellCasingModel;
        String shellCasingModelTextureName;

        private float spawnEntitySpeed = DEFAULT_SPAWN_ENTITY_SPEED;
        private Class<? extends WeaponSpawnEntity> spawnEntityClass;
        ImpactHandler blockImpactHandler;
        long pumpTimeoutMilliseconds;
        long burstTimeoutMilliseconds = Weapon.DEFAULT_BURST_TIMEOUT_MILLISECONDS;

        private float inaccuracy = DEFAULT_INACCURACY;

        int pellets = 1;
        
        boolean smokeEnabled = true;
        
        float bleedingCoefficient = 1f;
        
        String explosionParticleTexture;
        
        String smokeParticleTexture;

        float flashIntensity = 0.2f;

        Supplier<Float> flashScale = () -> 1f;

        Supplier<Float> flashOffsetX = () -> 0f;

        Supplier<Float> flashOffsetY = () -> 0f;

        Supplier<Float> smokeOffsetX = () -> 0f;

        Supplier<Float> smokeOffsetY = () -> 0f;

        long unloadingTimeout = Weapon.DEFAULT_UNLOADING_TIMEOUT_TICKS;

        private boolean ejectSpentRoundRequired;

        public int maxBulletsPerReload;

        private Function<ItemStack, List<String>> informationProvider;

        private CraftingComplexity craftingComplexity;

        private Object[] craftingMaterials;
        
        private String gunType = "LAUNCHER";

        private float shellCasingForwardOffset = Weapon.DEFAULT_SHELL_CASING_FORWARD_OFFSET;

        private float shellCasingVerticalOffset = Weapon.DEFAULT_SHELL_CASING_VERTICAL_OFFSET;

        private float shellCasingSideOffset = Weapon.DEFAULT_SHELL_CASING_SIDE_OFFSET;

        private float shellCasingSideOffsetAimed = Weapon.DEFAULT_SHELL_CASING_SIDE_OFFSET_AIMED;

        public boolean shellCasingEjectEnabled = true;
        
        public RecoilParam recoilParam = new RecoilParam();
        
        private boolean hasIteratedLoad;

        private ShellCasingEjectDirection shellCasingEjectDirection = ShellCasingEjectDirection.RIGHT;

        private float silencedShootSoundVolume = Weapon.DEFAULT_SILENCED_SHOOT_SOUND_VOLUME;
        private float shootSoundVolume = Weapon.DEFAULT_SHOOT_SOUND_VOLUME;
        private Object[] craftingRecipe;
        private CraftingEntry[] modernCraftingRecipe;
        public boolean isOneClickBurstAllowed;
        String flashTexture;
        
        
        private com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type shellType = Type.ASSAULT;
        
        private Set<AttachmentCategory> unremovableAttachmentCategories = new HashSet<>();
//        private Map<RenderableState, ScreenShaking> screenShakings = new HashMap<>();
        private Map<RenderableState, ScreenShakeAnimation.Builder> screenShakingBuilders = new HashMap<>();
        
        private float zoom;
        
        
        protected Pair<Double, Double> screenShakingParameters = new Pair<Double, Double>(100.0, 1.0);
        
        private boolean newSys = false;
        
        private int[][] guiPositions = new int[][] {{-43, 86},{97, 96},{92, 34},{14, -55},{164, -26},{145, 67},{60, 110},{0, -50},{-100, -50},{-29, 44},{50, 100}};


        public Builder() {
            ScreenShakeAnimation.Builder defaultShootingStateScreenShakingBuilder = new ScreenShakeAnimation.Builder()
                .withState(ScreenShakingAnimationManager.State.SHOOTING)
                .withRotationAttenuation(0.5f)
                .withTranslationAttenuation(0.05f)
                .withZRotationCoefficient(2f)
                .withTransitionDuration(50);
            screenShakingBuilders.put(RenderableState.SHOOTING, defaultShootingStateScreenShakingBuilder);
        }
        
        public Builder withConfigGroup(GunConfigurationGroup group) {
            this.gunType = String.valueOf(group);
        	this.configGroup = group;
			return this;
        }
        
        public Builder withWeaponType(String type) {
            this.gunType = type;
            return this;
        }
        
        public String getWeaponType() {
            return this.gunType;
        }
        
        
        public Builder hasGUIPositions(int[][] gp) {
            this.guiPositions = gp;
            return this;
        }
        
        public List<Integer> getMaxShots() {
            return this.maxShots;
        }
        
        public int[][] getGUIPositions() {
            return this.guiPositions;
        }
        
        public float getFirerate() {
            return this.fireRate;
        }

        public float getInaccuracy() {
            return this.inaccuracy;
        }
        
        public Builder hasFlashPedals() {
            this.hasFlashPedals = true;
            return this;
        }
        
        public Builder useNewSystem() {
            this.newSys = true;
            return this;
        }
        
        public Builder withShellType(Type type) {
            this.shellType = type;
            return this;
        }
        
        public boolean isUsingNewSystem() {
            return this.newSys;
        }

        public Builder withEjectRoundRequired() {
            this.ejectSpentRoundRequired = true;
            return this;
        }

        @Deprecated
        public Builder withInformationProvider(Function<ItemStack, List<String>> informationProvider) {
            //this.informationProvider = informationProvider;
            return this;
        }

        public Builder withReloadingTime(long reloadingTime) {
            this.reloadingTimeout = reloadingTime;
            return this;
        }

        public Builder withUnloadingTime(long unloadingTime) {
            this.unloadingTimeout = unloadingTime;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        
        public Builder withRecoilParam(RecoilParam param) {
            this.recoilParam = param;
            return this;
        }

        public Builder withAmmoCapacity(int ammoCapacity) {
            this.ammoCapacity = ammoCapacity;
            return this;
        }

        public Builder withMaxBulletsPerReload(int maxBulletsPerReload) {
            this.maxBulletsPerReload = maxBulletsPerReload;
            return this;
        }
        
        public Builder withIteratedLoad() {
            this.hasIteratedLoad = true;
            return this;
        }

        public Builder withRecoil(float recoil) {
            this.recoil = recoil;
            return this;
        }

        
        public Builder withZoom(float zoom) {
            this.zoom = zoom;
            return this;
        }

        public Builder withAmmo(ItemAmmo ammo) {
            this.ammo = ammo;
            return this;
        }
        


 
        public Builder withMaxShots(int... maxShots) {
            for(int m: maxShots) {
                this.maxShots.add(m);
            }
            return this;
        }
        
        public Builder withOneClickBurst() {
            this.isOneClickBurstAllowed = true;
            return this;
        }
        
        public Builder withBurstTimeout(long burstTimeoutMilliseconds) {
            this.burstTimeoutMilliseconds = burstTimeoutMilliseconds;
            return this;
        }

        public Builder withFireRate(float fireRate) {
            if (fireRate >= 1 || fireRate <= 0) {
                throw new IllegalArgumentException("Invalid fire rate " + fireRate);
            }
            this.fireRate = fireRate;
            return this;
        }

        public Builder withTextureNames(String... textureNames) {
            for (String textureName : textureNames) {
                this.textureNames.add(textureName.toLowerCase() + ".png");
            }
            return this;
        }

        public Builder withCrosshair(String crosshair) {
            this.crosshair = ModReference.ID + ":textures/crosshairs/" + crosshair.toLowerCase() + ".png";
            return this;
        }

        public Builder withCrosshair(String crosshair, boolean fullScreen) {
            this.crosshair = ModReference.ID + ":textures/crosshairs/" + crosshair.toLowerCase() + ".png";
            this.crosshairFullScreen = fullScreen;
            return this;
        }

        public Builder withCrosshairRunning(String crosshairRunning) {
            this.crosshairRunning = ModReference.ID + ":textures/crosshairs/" + crosshairRunning.toLowerCase() + ".png";
            return this;
        }

        public Builder withCrosshairZoomed(String crosshairZoomed) {
            return withCrosshairZoomed(crosshairZoomed, true);
        }

        public Builder withCrosshairZoomed(String crosshairZoomed, boolean fullScreen) {
            this.crosshairZoomed = ModReference.ID + ":textures/crosshairs/" + crosshairZoomed.toLowerCase() + ".png";
            this.crosshairZoomedFullScreen = fullScreen;
            return this;
        }
        
        public Builder withMuzzlePosition(Vec3d pos) {
            this.muzzlePosition = pos;
            return this;
        }

        public Builder withShootSound(String shootSound) {
            this.shootSound = shootSound.toLowerCase(); //ModReference.id + ":" + shootSound;
            return this;
        }
        
        public Builder withEndOfShootSound(String endOfShootSound) {
            this.endOfShootSound = endOfShootSound.toLowerCase(); //ModReference.id + ":" + shootSound;
            return this;
        }

        public Builder withEjectSpentRoundSound(String ejectSpentRoundSound) {
            this.ejectSpentRoundSound = ejectSpentRoundSound.toLowerCase();
            return this;
        }

        public Builder withSilencedShootSound(String silencedShootSound) {
            this.silencedShootSound = silencedShootSound.toLowerCase();
            return this;
        }
        
        public Builder withBurstShootSound(String burstShootSound) {
            this.burstShootSound = burstShootSound.toLowerCase(); //ModReference.id + ":" + shootSound;
            return this;
        }
        
        public Builder withSilencedBurstShootSound(String silencedBurstShootSound) {
            this.silencedBurstShootSound = silencedBurstShootSound.toLowerCase(); //ModReference.id + ":" + shootSound;
            return this;
        }

        public Builder withReloadSound(String reloadSound) {
            this.reloadSound = reloadSound.toLowerCase(); //ModReference.id + ":" + reloadSound;
            return this;
        }
        
        public Builder withReloadIterationSound(String reloadIterationSound) {
            this.reloadIterationSound = reloadIterationSound.toLowerCase(); //ModReference.id + ":" + reloadSound;
            return this;
        }
        
        public Builder withInspectSound(String inspectSound) {
            this.inspectSound = inspectSound.toLowerCase(); //ModReference.id + ":" + reloadSound;
            return this;
        }
        
        public Builder withDrawSound(String drawSound) {
            this.drawSound = drawSound.toLowerCase(); //ModReference.id + ":" + reloadSound;
            return this;
        }
        
        public Builder withAllReloadIterationsCompletedSound(String allReloadIterationCompletedSound) {
            this.allReloadIterationsCompletedSound = allReloadIterationCompletedSound.toLowerCase(); //ModReference.id + ":" + reloadSound;
            return this;
        }

        public Builder withUnloadSound(String unloadSound) {
            this.unloadSound = unloadSound.toLowerCase();
            return this;
        }

        public Builder withShootSoundVolume(float volume) {
            this.shootSoundVolume = volume;
            return this;
        }

        public Builder withSilenceShootSoundVolume(float volume) {
            this.silencedShootSoundVolume = volume;
            return this;
        }

        public Builder withExceededMaxShotsSound(String shootSound) {
            this.exceededMaxShotsSound = shootSound.toLowerCase(); //ModReference.id + ":" + shootSound;
            return this;
        }

        public Builder withCreativeTab(CreativeTabs creativeTab) {
            this.creativeTab = creativeTab;
            return this;
        }

        
        public Builder withSpawnEntityRocketParticles() {
            this.spawnEntityRocketParticles = true;
            return this;
        }
        
        public Builder withSpawnEntityDamage(float spawnEntityDamage) {
            this.spawnEntityDamage = spawnEntityDamage;
            return this;
        }

        public Builder withSpawnEntitySpeed(float spawnEntitySpeed) {
            this.spawnEntitySpeed = spawnEntitySpeed;
            return this;
        }

        public Builder withSpawnEntityExplosionRadius(float spawnEntityExplosionRadius) {
            this.spawnEntityExplosionRadius = spawnEntityExplosionRadius;
            return this;
        }
        
        public Builder withDestroyingBlocks(boolean isDestroyingBlocks) {
            this.isDestroyingBlocks = isDestroyingBlocks;
            return this;
        }

        public Builder withSpawnEntityGravityVelocity(float spawnEntityGravityVelocity) {
            this.spawnEntityGravityVelocity = spawnEntityGravityVelocity;
            return this;
        }
        
        public Builder withSpawnEntityParticleAgeCoefficient(float spawnEntityParticleAgeCoefficient) {
            this.spawnEntityParticleAgeCoefficient = spawnEntityParticleAgeCoefficient;
            return this;
        }
        
        public Builder withSpawnEntitySmokeParticleAgeCoefficient(float spawnEntitySmokeParticleAgeCoefficient) {
            this.spawnEntitySmokeParticleAgeCoefficient = spawnEntitySmokeParticleAgeCoefficient;
            return this;
        }
        
        public Builder withSpawnEntityExplosionParticleScaleCoefficient(float spawnEntityExplosionParticleScaleCoefficient) {
            this.spawnEntityExplosionParticleScaleCoefficient = spawnEntityExplosionParticleScaleCoefficient;
            return this;
        }
        
        public Builder withSpawnEntitySmokeParticleScaleCoefficient(float spawnEntitySmokeParticleScaleCoefficient) {
            this.spawnEntitySmokeParticleScaleCoefficient = spawnEntitySmokeParticleScaleCoefficient;
            return this;
        }

        public Builder withInaccuracy(float inaccuracy) {
            this.inaccuracy = inaccuracy;
            return this;
        }

        
        public Builder withRenderer(WeaponRenderer renderer) {
            //if(VMWHooksHandler.isOnServer()) return this;
            this.renderer = renderer;
            return this;
        }

        public Builder withCompatibleBullet(ItemBullet bullet, Consumer<ModelBase> positioner) {
            compatibleAttachments.put(bullet, new CompatibleAttachment<>(bullet, positioner));
            return this;
        }
        
        public Builder withUnremovableAttachmentCategories(AttachmentCategory...categories) {
            for(AttachmentCategory category: categories) {
                unremovableAttachmentCategories.add(category);
            }
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, ItemAttachment.ApplyHandler2<Weapon> applyHandler,
                ItemAttachment.ApplyHandler2<Weapon> removeHandler) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, applyHandler, removeHandler));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, modelPositioning, false));
            return this;
        }
        
        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, Consumer<RenderContext<RenderableState>> positioning, Consumer<ModelBase> modelPositioning, boolean isDefault, boolean isPermanent) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, modelPositioning, isDefault, isPermanent));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, BiConsumer<EntityLivingBase, ItemStack> positioning) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, null, false));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, Consumer<ModelBase> positioner) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioner));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, boolean isDefault,
                BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, modelPositioning, isDefault));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, boolean isDefault, boolean isPermanent,
                BiConsumer<EntityLivingBase, ItemStack> positioning, Consumer<ModelBase> modelPositioning) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioning, modelPositioning, isDefault, isPermanent));
            return this;
        }

        public Builder withCompatibleAttachment(ItemAttachment<Weapon> attachment, boolean isDefault,
                Consumer<ModelBase> positioner) {
            compatibleAttachments.put(attachment, new CompatibleAttachment<>(attachment, positioner, isDefault));
            return this;
        }

        public Builder withSpawnEntityModel(ModelBase ammoModel) {
            this.ammoModel = ammoModel;
            return this;
        }

        public Builder withSpawnEntityModelTexture(String ammoModelTextureName) {
            this.ammoModelTextureName = ModReference.ID + ":textures/models/" + ammoModelTextureName.toLowerCase() + ".png";
            return this;
        }

        public Builder withSpawnEntityBlockImpactHandler(ImpactHandler impactHandler) {
            this.blockImpactHandler = impactHandler;
            return this;
        }

        public Builder withShellCasingEjectEnabled(boolean shellCasingEjectEnabled) {
            this.shellCasingEjectEnabled = shellCasingEjectEnabled;
            return this;
        }

        public Builder withShellCasingModel(ModelBase shellCasingModel) {
            this.shellCasingModel = shellCasingModel;
            return this;
        }

        public Builder withShellCasingModelTexture(String shellModelTextureName) {
            this.shellCasingModelTextureName = ModReference.ID + ":textures/models/" + shellModelTextureName.toLowerCase() + ".png";
            return this;
        }

        public Builder withShellCasingForwardOffset(float shellCasingForwardOffset) {
            this.shellCasingForwardOffset = shellCasingForwardOffset;
            return this;
        }

        public Builder withShellCasingVerticalOffset(float shellCasingVerticalOffset) {
            this.shellCasingVerticalOffset = shellCasingVerticalOffset;
            return this;
        }

        public Builder withShellCasingSideOffset(float shellCasingSideOffset) {
            this.shellCasingSideOffset = shellCasingSideOffset;
            return this;
        }

        public Builder withShellCasingSideOffsetAimed(float shellCasingSideOffsetAimed) {
            this.shellCasingSideOffsetAimed = shellCasingSideOffsetAimed;
            return this;
        }

        public Builder withShellCasingEjectDirection(ShellCasingEjectDirection shellCasingEjectDirection) {
            this.shellCasingEjectDirection = shellCasingEjectDirection;
            return this;
        }

        public Builder withPumpTimeout(long pumpTimeoutMilliseconds) {
            this.pumpTimeoutMilliseconds = pumpTimeoutMilliseconds;
            return this;
        }

        public Builder withPellets(int pellets) {
            if (pellets < 1) {
                throw new IllegalArgumentException("Pellet count must be >= 1");
            }
            this.pellets = pellets;
            return this;
        }
        
        public Builder withSmoke(boolean smokeEnabled) {
            this.smokeEnabled = smokeEnabled;
            return this;
        }

        public Builder withFlashIntensity(float flashIntensity) {
            if (flashIntensity < 0f || flashIntensity > 1f) {
                throw new IllegalArgumentException("Invalid flash intencity");
            }
            this.flashIntensity = flashIntensity;
            return this;
        }

        public Builder withFlashScale(Supplier<Float> flashScale) {
            this.flashScale = flashScale;
            return this;
        }

        public Builder withFlashOffsetX(Supplier<Float> flashOffsetX) {
            this.flashOffsetX = flashOffsetX;
            return this;
        }

        public Builder withFlashOffsetY(Supplier<Float> flashOffsetY) {
            this.flashOffsetY = flashOffsetY;
            return this;
        }
        
        public Builder withFlashTexture(String flashTexture) {
            this.flashTexture = ModReference.ID + ":textures/particle/" + flashTexture.toLowerCase() + ".png";
            return this;
        }

        public Builder withSmokeOffsetX(Supplier<Float> smokeOffsetX) {
            this.smokeOffsetX = smokeOffsetX;
            return this;
        }

        public Builder withSmokeOffsetY(Supplier<Float> smokeOffsetY) {
            this.smokeOffsetY = smokeOffsetY;
            return this;
        }

        
        @Deprecated
        public Builder withCrafting(CraftingComplexity craftingComplexity, Object...craftingMaterials) {
            if(craftingComplexity == null) {
                throw new IllegalArgumentException("Crafting complexity not set");
            }
            if(craftingMaterials.length < 2) {
                throw new IllegalArgumentException("2 or more materials required for crafting");
            }
            this.craftingComplexity = craftingComplexity;
            this.craftingMaterials = craftingMaterials;
            return this;
        }
        
        
        
        public Builder withTest() {
            return this;
        }
        
        
        public Builder withModernRecipe(CraftingEntry...itemStacks) {
            this.modernCraftingRecipe = itemStacks;
            return this;
        }

        public Builder withCraftingRecipe(Object...craftingRecipe) {
            this.craftingRecipe = craftingRecipe;
            return this;
        }
        
        public Builder withBleedingCoefficient(float bleedingCoefficient) {
            this.bleedingCoefficient = bleedingCoefficient;
            return this;
        }
        
        public Builder withExplosionParticleTexture(String explosionParticleTexture) {
            if(explosionParticleTexture.endsWith(".png") && explosionParticleTexture.length() > 4) {
                explosionParticleTexture = explosionParticleTexture.substring(0, explosionParticleTexture.length() - 4);
            }
            this.explosionParticleTexture = ModReference.ID + ":textures/particle/" + explosionParticleTexture.toLowerCase() + ".png";
            return this;
        }
        
        public Builder withSmokeParticleTexture(String smokeParticleTexture) {
            if(smokeParticleTexture.endsWith(".png") && smokeParticleTexture.length() > 4) {
                smokeParticleTexture = smokeParticleTexture.substring(0, smokeParticleTexture.length() - 4);
            }
            this.smokeParticleTexture = ModReference.ID + ":textures/particle/" + smokeParticleTexture.toLowerCase() + ".png";
            return this;
        }
        
        public Builder withScreenShaking(RenderableState state, float zRotationCoefficient) {
            ScreenShakeAnimation.Builder defaultShootingStateScreenShakingBuilder = new ScreenShakeAnimation.Builder()
                    .withState(state)
                    .withRotationAttenuation(0.5f)
                    .withTranslationAttenuation(0.05f)
                    .withZRotationCoefficient(zRotationCoefficient)
                    .withTransitionDuration(50);
            screenShakingBuilders.put(RenderableState.SHOOTING, defaultShootingStateScreenShakingBuilder);
            return this;
        }
        
        public Builder withModernScreenShaking(double intensity, double speedModifier) {
            this.screenShakingParameters = new Pair<Double, Double>(intensity, speedModifier);
            return this;
        }
        
        public Builder withScreenShaking(RenderableState state, float xRotationCoefficient, float yRotationCoefficient, float zRotationCoefficient) {
            ScreenShakeAnimation.Builder defaultShootingStateScreenShakingBuilder = new ScreenShakeAnimation.Builder()
                    .withState(state)
                    .withRotationAttenuation(0.5f)
                    .withTranslationAttenuation(0.05f)
                    .withXRotationCoefficient(xRotationCoefficient)
                    .withYRotationCoefficient(yRotationCoefficient)
                    .withZRotationCoefficient(zRotationCoefficient)
                    .withTransitionDuration(50);
            screenShakingBuilders.put(RenderableState.SHOOTING, defaultShootingStateScreenShakingBuilder);
            return this;
        }

        public Weapon build(ModContext modContext) {

            if (name == null) {
                throw new IllegalStateException("Weapon name not provided");
            }

            if (shootSound == null) {
                shootSound = name;
            }

            if (silencedShootSound == null) {
                silencedShootSound = shootSound;
            }

            if (reloadSound == null) {
                reloadSound = "reload";
            }

            if (unloadSound == null) {
                unloadSound = "unload";
            }

            if (spawnEntityClass == null) {
                spawnEntityClass = WeaponSpawnEntity.class;
            }

            
            for(ItemSkin skin : CommonRegistry.gunSkins) {
                withCompatibleAttachment(skin, (c) -> {});
            }
            
           
            
            if (spawnEntityWith == null) {
                

                int explosionParticleTextureId = modContext.registerTexture(explosionParticleTexture);
                int smokeParticleTextureId = modContext.registerTexture(smokeParticleTexture);
                
               
                
                
                spawnEntityWith = (weapon, player) -> {


                    double damage = spawnEntityDamage;
                     if(BalancePackManager.hasActiveBalancePack()) {
                         if(BalancePackManager.shouldChangeWeaponDamage(weapon)) damage = BalancePackManager.getNewWeaponDamage(weapon);
                         damage *= BalancePackManager.getGroupDamageMultiplier(weapon.getConfigurationGroup());
                         damage *= BalancePackManager.getGlobalDamageMultiplier();
                     }

                    // System.out.println(weapon.getName() + " | " + spawnEntityRocketParticles);
                     
                    WeaponSpawnEntity bullet = new WeaponSpawnEntity(weapon, player.world, player, spawnEntitySpeed,
                            spawnEntityGravityVelocity, inaccuracy, (float) damage, spawnEntityExplosionRadius,
                            isDestroyingBlocks, spawnEntityRocketParticles, spawnEntityParticleAgeCoefficient, spawnEntitySmokeParticleAgeCoefficient,
                            spawnEntityExplosionParticleScaleCoefficient, spawnEntitySmokeParticleScaleCoefficient,
                            explosionParticleTextureId,
                            smokeParticleTextureId);
                    bullet.setPositionAndDirection(true);
                    return bullet;
                };
            }

            if ((FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT)) {
                // Register in spritesheet builder
                WeaponSpritesheetBuilder.registerSprite(this.name);
                this.renderer.name = this.name;
            }
            
           

            if(shellCasingModel == null) {
                shellCasingModel = new Shell();
            }

            if(shellCasingModelTextureName == null) {
                shellCasingModelTextureName = DEFAULT_SHELL_CASING_TEXTURE_NAME;
            }

            if(spawnShellWith == null) {
                spawnShellWith = (weaponInstance, player) -> {
                    EntityShellCasing shell = new EntityShellCasing(weaponInstance, player.world, player,
                            DEFAULT_SHELL_CASING_VELOCITY, DEFAULT_SHELL_CASING_GRAVITY_VELOCITY, DEFAULT_SHELL_CASING_INACCURACY);
                    shell.setPositionAndDirection(true);
                    return shell;
                };
            }

            if (crosshairRunning == null) {
                crosshairRunning = crosshair;
            }

            if (crosshairZoomed == null) {
                crosshairZoomed = crosshair;
            }

            if (blockImpactHandler == null) {
                blockImpactHandler = (world, player, entity, position) -> {
                    IBlockState iBlockState = world.getBlockState(new BlockPos(position.getBlockPos().getX(), position.getBlockPos().getY(), position.getBlockPos().getZ()));

                    if (ModernConfigManager.bulletBreakGlass && iBlockState.getMaterial() == Material.GLASS) {
                        world.destroyBlock(new BlockPos(new BlockPos(position.getBlockPos().getX(), position.getBlockPos().getY(), position.getBlockPos().getZ())), true);
                    } else {
                        //compatibility.addBlockHitEffect(position);
                        //compatibility.playSound(world, posX, posY, posZ, explosionSound, volume, pitch);
                        NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(entity.dimension, position.getBlockPos().getX(), position.getBlockPos().getY(), position.getBlockPos().getZ(), 100);
                        modContext.getChannel().sendToAllAround(new BlockHitMessage(position.getBlockPos(), position.hitVec.x, position.hitVec.y, position.hitVec.z, position.sideHit), point);
                        
                        MaterialImpactSound materialImpactSound = modContext.getMaterialImpactSound(iBlockState, entity);
                        if(materialImpactSound != null) {
                            world.playSound(null, position.getBlockPos().getX(), position.getBlockPos().getY(), position.getBlockPos().getZ(), materialImpactSound.getSound(), SoundCategory.BLOCKS, materialImpactSound.getVolume(), 1f);
                        }
                    }
                };
            }

            if(maxBulletsPerReload == 0) {
                maxBulletsPerReload = ammoCapacity;
            }

            if(maxShots.isEmpty()) {
                maxShots.add(Integer.MAX_VALUE);
            }

            Weapon weapon = new Weapon(this, modContext);

            weapon.shootSound = modContext.registerSound(this.shootSound);
            if(this.endOfShootSound != null) {
                weapon.endOfShootSound = modContext.registerSound(this.endOfShootSound);
            }
            
            weapon.muzzlePosition = this.muzzlePosition;
            
            weapon.burstShootSound = modContext.registerSound(this.burstShootSound);
            weapon.silencedBurstShootSound = modContext.registerSound(this.silencedBurstShootSound);

            weapon.reloadSound = modContext.registerSound(this.reloadSound);
            weapon.reloadIterationSound = modContext.registerSound(this.reloadIterationSound);
            weapon.inspectSound = modContext.registerSound(this.inspectSound);
            weapon.drawSound = modContext.registerSound(this.drawSound);

            weapon.allReloadIterationsCompletedSound = modContext.registerSound(this.allReloadIterationsCompletedSound);
            weapon.unloadSound = modContext.registerSound(this.unloadSound);
            weapon.silencedShootSound = modContext.registerSound(this.silencedShootSound);

            if(ejectSpentRoundSound != null) {
                weapon.ejectSpentRoundSound = modContext.registerSound(this.ejectSpentRoundSound);
            }

            weapon.setCreativeTab(creativeTab);
            weapon.setTranslationKey(name);
            if (ammo != null) {
                ammo.addCompatibleWeapon(weapon);
            }

            // Add the magic mag
            withCompatibleAttachment(SpecialAttachments.MagicMag, true, (model) -> {});
            
            for (ItemAttachment<Weapon> attachment : this.compatibleAttachments.keySet()) {

                attachment.addCompatibleWeapon(weapon);
            }

            modContext.registerWeapon(name, weapon, renderer);

            if(craftingRecipe != null && craftingRecipe.length >= 2) {
                ItemStack itemStack = new ItemStack(weapon);
                List<Object> registeredRecipe = modContext.getRecipeManager().registerShapedRecipe(weapon, craftingRecipe);
                boolean hasOres = Arrays.stream(craftingRecipe).anyMatch(r -> r instanceof String);
                if(hasOres) {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, registeredRecipe.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe") /*TODO: temporary hack*/);
                } else {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, itemStack, registeredRecipe.toArray()).setMirrored(false).setRegistryName(ModReference.ID, itemStack.getItem().getTranslationKey() + "_recipe"));
                }
            } else if(craftingComplexity != null) {
                OptionsMetadata optionsMetadata = new OptionsMetadata.OptionMetadataBuilder()
                        .withSlotCount(9)
                        .build(craftingComplexity, Arrays.copyOf(craftingMaterials, craftingMaterials.length));

                List<Object> shape = modContext.getRecipeManager().createShapedRecipe(weapon, weapon.getName(), optionsMetadata);

                if(optionsMetadata.hasOres()) {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, new ItemStack(weapon), shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, new ItemStack(weapon).getItem().getTranslationKey() + "_recipe"));
                } else {
                    ForgeRegistries.RECIPES.register(new ShapedOreRecipe(null, new ItemStack(weapon), shape.toArray()).setMirrored(false).setRegistryName(ModReference.ID, new ItemStack(weapon).getItem().getTranslationKey() + "_recipe"));
                }

            } else {
                noRecipe += 1;
                //System.err.println("!!!No recipe defined for weapon " + name);
            }
            
            weapon.modernRecipe = modernCraftingRecipe;
            
            this.informationProvider = (stack) -> {
            	TextFormatting plate = TextFormatting.GREEN;
            	TextFormatting plain = TextFormatting.GRAY;
            	
            	ArrayList<String> descriptionBuilder = new ArrayList<>();
            	
            	
            	descriptionBuilder.add(plate + "Type: " + plain + this.gunType);
            	descriptionBuilder.add(plate + "Damage: " + plain + String.format("%.1f" , (BalancePackManager.getNetGunDamage(weapon))));
            	descriptionBuilder.add(plate + "Firerate: " + plain + Math.round(BalancePackManager.getFirerate(weapon)*100) + "/100");
            	
                
            	boolean cartridgeDriven = false;
            	String catridgeName = "";
            	for(Entry<ItemAttachment<Weapon>, CompatibleAttachment<Weapon>> i : compatibleAttachments.entrySet()) {
            		if(i.getValue().getAttachment().getCategory() == AttachmentCategory.BULLET) {
            			cartridgeDriven = true;
            			catridgeName = new TextComponentTranslation(i.getValue().getAttachment().getTranslationKey() + ".name").getFormattedText();
            		}
            	}
            	
            	if(!cartridgeDriven) {
            		descriptionBuilder.add(plate + "Magazines:");
            		ArrayList<ItemMagazine> mags = new ArrayList<>();
                    weapon.getCompatibleAttachments(AttachmentCategory.MAGAZINE).forEach(c -> mags.add((ItemMagazine) c.getAttachment()));
                    mags.sort((a, b) -> a.getCapacity()-b.getCapacity());
                  
                    mags.forEach(c -> descriptionBuilder.add(plain + (I18n.format(c.getTranslationKey() + ".name"))));
                } else {
                    descriptionBuilder.add(plate + "Cartridge: " + plain + catridgeName);
                }


                //mags.sort((a, b) -> a
                 
                 
              // descriptionBuilder.add(plain + (I18n.format(ca.getAttachment().getTranslationKey() + ".name")));


                return descriptionBuilder;
            };

            
            // Do not register weapons to the registry if they do not
            // have a crafting recipe.
            CraftingRegistry.registerHook(weapon);

            return weapon;
        }
    }
    
    private CraftingGroup craftingGroup = CraftingGroup.GUN;
    
    public static final int FIREMODE_AUTO = 2;
    public static final int FIREMODE_SINGLE = 0;
    public static final int FIREMODE_BURST = 1;

    private static final long DEFAULT_RELOADING_TIMEOUT_TICKS = 10;
    private static final long DEFAULT_UNLOADING_TIMEOUT_TICKS = 10;
    private static final long DEFAULT_LOAD_ITERATION_TIMEOUT_TICKS = 10;
    
    static final long MAX_RELOAD_TIMEOUT_TICKS = 60;
    static final long MAX_UNLOAD_TIMEOUT_TICKS = 60;
    
    private static final long DEFAULT_BURST_TIMEOUT_MILLISECONDS = 150;

    public static final float DEFAULT_SHELL_CASING_FORWARD_OFFSET = 0.1f;
    public static final float DEFAULT_SHELL_CASING_VERTICAL_OFFSET = 0.0f;
    public static final float DEFAULT_SHELL_CASING_SIDE_OFFSET = 0.15f;
    public static final float DEFAULT_SHELL_CASING_SIDE_OFFSET_AIMED = 0.05f;

    //private static final float DEFAULT_ZOOM = 0.75f;
    private static final float DEFAULT_FIRE_RATE = 0.5f;

    private static final float DEFAULT_SILENCED_SHOOT_SOUND_VOLUME = 0.7f;
    private static final float DEFAULT_SHOOT_SOUND_VOLUME = 10f;

    public Builder builder;

    private ModContext modContext;

    private Vec3d muzzlePosition;
    
    private CraftingEntry[] modernRecipe;
    
    private SoundEvent shootSound;
    private SoundEvent endOfShootSound;
    private SoundEvent silencedShootSound;
    private SoundEvent reloadSound;
    private SoundEvent reloadIterationSound;
    private SoundEvent inspectSound;
    private SoundEvent drawSound;
    private SoundEvent allReloadIterationsCompletedSound;
    private SoundEvent unloadSound;
    private SoundEvent ejectSpentRoundSound;
    private SoundEvent burstShootSound;
    private SoundEvent silencedBurstShootSound;

    public static enum State { READY, SHOOTING, RELOAD_REQUESTED, RELOAD_CONFIRMED, UNLOAD_STARTED, UNLOAD_REQUESTED_FROM_SERVER, UNLOAD_CONFIRMED, PAUSED, MODIFYING, EJECT_SPENT_ROUND};

    Weapon(Builder builder, ModContext modContext) {
        this.builder = builder;
        this.modContext = modContext;
        setMaxStackSize(1);
    }

    public String getName() {
        return builder.name;
    }
    
    
    @Override
    public CraftingGroup getCraftingGroup() {
        return this.craftingGroup;
    }
    
    @Override
    public Item getItem() {
        return this;
    }

    @Override
    public CraftingEntry[] getModernRecipe() {
        return this.modernRecipe;
        //return CraftingRegistry.getDatabaseRecipe(this);
    }
    
    
    public SoundEvent getShootSound() {
        return shootSound;
    }
    
    public SoundEvent getBurstShootSound() {
        return burstShootSound;
    }
    
    public SoundEvent getSilencedBurstShootSound() {
        return silencedBurstShootSound;
    }
    
    public SoundEvent getEndOfShootSound() {
        return endOfShootSound;
    }

    public SoundEvent getSilencedShootSound() {
        return silencedShootSound;
    }

    public SoundEvent getReloadSound() {
        return reloadSound;
    }
    

    public SoundEvent getReloadIterationSound() {
        return reloadIterationSound;
    }
    
    public SoundEvent getInspectSound() {
        return inspectSound;
    }
    
    public SoundEvent getDrawSound() {
        return drawSound;
    }
    
    public SoundEvent getAllReloadIterationsCompletedSound() {
        return allReloadIterationsCompletedSound;
    }

    public SoundEvent getUnloadSound() {
        return unloadSound;
    }

    public SoundEvent getEjectSpentRoundSound() {
        return ejectSpentRoundSound;
    }
    
    public Vec3d getMuzzlePosition() {
        return this.muzzlePosition;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack itemStack) {
        return true;
    }

    void toggleAiming() {

        PlayerWeaponInstance mainHandHeldWeaponInstance = modContext.getMainHeldWeapon();
        
        if(mainHandHeldWeaponInstance != null
                && (mainHandHeldWeaponInstance.getState() == WeaponState.READY
                || mainHandHeldWeaponInstance.getState() == WeaponState.PAUSED
                || mainHandHeldWeaponInstance.getState() == WeaponState.EJECT_REQUIRED)
                ) {
            mainHandHeldWeaponInstance.setAimed(!mainHandHeldWeaponInstance.isAimed());
        }
    }

    @Override
    public void onUpdate(ItemStack itemStack, World world, Entity entity, int p_77663_4_, boolean active) {
    }

    public void changeRecoil(EntityLivingBase player, float factor) {
        PlayerWeaponInstance instance = modContext.getMainHeldWeapon();
        if(instance != null) {
            float recoil = instance.getWeapon().builder.recoil * factor;
            LOG.debug("Changing recoil to {} for instance {}", recoil, instance);
            instance.setRecoil(recoil);
        }
    }

    public Map<ItemAttachment<Weapon>, CompatibleAttachment<Weapon>> getCompatibleAttachments() {
        return builder.compatibleAttachments;
    }

    public Collection<CompatibleAttachment<? extends AttachmentContainer>> getCompatibleAttachments(AttachmentCategory...categories) {
        Collection<CompatibleAttachment<Weapon>> c = builder.compatibleAttachments.values();
        List<AttachmentCategory> inputCategoryList = Arrays.asList(categories);
        return c.stream().filter(e -> inputCategoryList.contains(e.getAttachment().getCategory())).collect(Collectors.toList());
    }

    String getCrosshair(PlayerWeaponInstance weaponInstance) {
        if(weaponInstance.isAimed()) {
            String crosshair = null;
            ItemAttachment<Weapon> scopeAttachment = WeaponAttachmentAspect.getActiveAttachment(AttachmentCategory.SCOPE, weaponInstance);
            if(scopeAttachment != null) {
                crosshair = scopeAttachment.getCrosshair();
            }
            if(crosshair == null) {
                crosshair = builder.crosshairZoomed;
            }
            return crosshair;
        } else if(weaponInstance.getPlayer().isSprinting()){
            return builder.crosshairRunning;
        }
        return builder.crosshair;
    }

    public static boolean isActiveAttachment(PlayerWeaponInstance weaponInstance, ItemAttachment<Weapon> attachment) {
        return weaponInstance != null ? WeaponAttachmentAspect.isActiveAttachment(attachment, weaponInstance) : false;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 0;
    }

    int getCurrentAmmo(EntityPlayer player) {
        PlayerWeaponInstance state = modContext.getMainHeldWeapon();
        return state.getAmmo();

    }

    public int getAmmoCapacity() {
        return builder.ammoCapacity;
    }

    int getMaxBulletsPerReload() {
        return builder.maxBulletsPerReload;
    }

    ModelBase getAmmoModel() {
        return builder.ammoModel;
    }

    String getAmmoModelTextureName() {
        return builder.ammoModelTextureName;
    }

    ModelBase getShellCasingModel() {
        return builder.shellCasingModel;
    }

    String getShellCasingTextureName() {
        return builder.shellCasingModelTextureName;
    }

    void onSpawnEntityBlockImpact(World world, EntityPlayer player, WeaponSpawnEntity entity, RayTraceResult position) {

        if(world.isRemote) {
            EnumFacing facing = EnumFacing.valueOf(position.sideHit.toString());
            ClientEventHandler.BULLET_HOLE_RENDERER.addBulletHole(new BulletHole(new Vector3D(position.hitVec.x, position.hitVec.y, position.hitVec.z), facing, 0.05));
        }

        if(builder.blockImpactHandler != null) {
            builder.blockImpactHandler.onImpact(world, player, entity, position);
        }
    }

    @Override
    public List<CompatibleAttachment<? extends AttachmentContainer>> getActiveAttachments(EntityLivingBase player, ItemStack itemStack) {
        return modContext.getAttachmentAspect().getActiveAttachments(player, itemStack);
    }

    long getUnloadTimeoutTicks() {
        return builder.unloadingTimeout;
    }

    boolean ejectSpentRoundRequired() {
        return builder.ejectSpentRoundRequired;
    }

    List<ItemMagazine> getCompatibleMagazines() {
        return builder.compatibleAttachments.keySet().stream()
                .filter(a -> a instanceof ItemMagazine)
                .map(a -> (ItemMagazine)a)
                .collect(Collectors.toList());
    }

    public WeaponRenderer getRenderer() {
        return builder.renderer;
    }

    List<ItemAttachment<Weapon>> getCompatibleAttachments(Class<? extends ItemAttachment<Weapon>> target) {
        return builder.compatibleAttachments.entrySet().stream()
                .filter(e -> target.isInstance(e.getKey()))
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }
    
    @Override
    public void addInformation(ItemStack itemStack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if (tooltip != null) {
            tooltip.add((builder.newSys ? "§aWeapon System Version: §72" : "§aWeapon System Version: §c1"));

            if(builder.informationProvider != null)
                tooltip.addAll(builder.informationProvider.apply(itemStack));
        }
    }

    @Override
    public void reloadMainHeldItemForPlayer(EntityPlayer player) {
        modContext.getWeaponReloadAspect().reloadMainHeldItem(player);
    }
    
    @Override
    public void unloadMainHeldItemForPlayer(EntityPlayer player) {
        modContext.getWeaponReloadAspect().unloadMainHeldItem(player);
    }
    
    @Override
    public void inspectMainHeldItemForPlayer(EntityPlayer player) {
        modContext.getWeaponReloadAspect().inspectMainHeldItem(player);
    }

    @Override
    public void update(EntityPlayer player) {        
        modContext.getWeaponReloadAspect().updateMainHeldItem(player);
        modContext.getWeaponFireAspect().onUpdate(player);
        modContext.getAttachmentAspect().updateMainHeldItem(player);
    }

    public void tryFire(EntityPlayer player) {
        modContext.getWeaponFireAspect().onFireButtonDown(player);
    }

    public void tryStopFire(EntityPlayer player) {
        modContext.getWeaponFireAspect().onFireButtonRelease(player);
    }

    @Override
    public PlayerWeaponInstance createItemInstance(EntityLivingBase player, ItemStack itemStack, int slot){
        PlayerWeaponInstance instance = new PlayerWeaponInstance(slot, player, itemStack);
        //state.setAmmo(Tags.getAmmo(itemStack)); // TODO: get ammo properly
        instance.setState(WeaponState.READY);
    
        instance.setRecoil(BalancePackManager.shouldChangeWeaponRecoil(instance.getWeapon()) ? (float) BalancePackManager.getNewWeaponRecoil(instance.getWeapon()) : builder.recoil);
        instance.setMaxShots(builder.maxShots.get(0));

        for(CompatibleAttachment<Weapon> compatibleAttachment: ((Weapon) itemStack.getItem()).getCompatibleAttachments().values()) {
            ItemAttachment<Weapon> attachment = compatibleAttachment.getAttachment();
            if(compatibleAttachment.isDefault() && attachment.getApply2() != null) {
                attachment.apply2.apply(attachment, instance);
            }
        }
        return instance;
    }

    @Override
    public void toggleClientAttachmentSelectionMode(EntityPlayer player) {
        modContext.getAttachmentAspect().toggleClientAttachmentSelectionMode(player);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack itemStack, EntityPlayer player) {
        // Server side only method
        PlayerWeaponInstance instance = (PlayerWeaponInstance) Tags.getInstance(itemStack);
        return instance == null || instance.getState() == WeaponState.READY;
    }

    void changeFireMode(PlayerWeaponInstance instance) {
        int result;
        
        
        List<Integer> maxShotsList = BalancePackManager.getFiremodeListForWeapon(instance.getWeapon());
        
        Iterator<Integer> it = maxShotsList.iterator();
      //  Iterator<Integer> it = builder.maxShots.iterator();
        while(it.hasNext()) {
            if(instance.getMaxShots() == it.next()) {
                break;
            }
        }
       
        if(it.hasNext()) {
            result = it.next();
        } else {
            result = maxShotsList.get(0);
        }

        instance.setMaxShots(result);
        String message;
        if(result == 1) {
            message = net.minecraft.util.text.translation.I18n.translateToLocalFormatted("gui.firearmMode.semi");
        } else if(result == Integer.MAX_VALUE) {
            message = net.minecraft.util.text.translation.I18n.translateToLocalFormatted("gui.firearmMode.auto");
        } else {
            message = net.minecraft.util.text.translation.I18n.translateToLocalFormatted("gui.firearmMode.burst");
        }
        LOG.debug("Changed fire mode of {} to {}", instance, result);

        modContext.getStatusMessageCenter().addMessage(net.minecraft.util.text.translation.I18n.translateToLocalFormatted("gui.firearmMode", message), 1000);

        instance.getPlayer().playSound(modContext.getChangeFireModeSound(), 1, 1);
    }
    
   

    public long getTotalReloadingDuration() {

        return builder.renderer.getTotalReloadingDuration();
        //log.debug("Total load duration " + builder.renderer.getTotalReloadingDuration());
        
    }
    
    public long getPrepareFirstLoadIterationAnimationDuration() {
        return builder.renderer.getPrepareFirstLoadIterationAnimationDuration();
    }
    
    public long getAllLoadIterationAnimationsCompletedDuration() {
        return builder.renderer.getAllLoadIterationAnimationsCompletedDuration();
    }
    
    public long getTotalLoadIterationDuration() {
        return builder.renderer.getTotalLoadIterationDuration();
    }

    public long getTotalUnloadingDuration() {
        return builder.renderer.getTotalUnloadingDuration();
    }
    
    public long getTotalDrawingDuration() {
        return builder.renderer.getTotalDrawingDuration();
    }

    public boolean hasRecoilPositioning() {
        return builder.renderer.hasRecoilPositioning();
    }
    
    /**
     * Only for debugging purposes
     * @param param
     * @return
     */
    public void setRecoilParameters(RecoilParam param) {
        this.builder.recoilParam = param;
    }
    
    public RecoilParam getRecoilParameters() {
        return builder.recoilParam;
    }

    void incrementZoom(PlayerWeaponInstance instance) {
        Item scopeItem = instance.getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
        if(scopeItem instanceof ItemScope && ((ItemScope) scopeItem).isOptical()) {
            float minZoom = ((ItemScope) scopeItem).getMinZoom();
            float maxZoom = ((ItemScope) scopeItem).getMaxZoom();
            float increment = (minZoom - maxZoom) / 7.5f;
            float zoom = instance.getZoom();

            if(zoom > maxZoom) {
                zoom = Math.max(zoom - increment, maxZoom);
            }

            instance.setZoom(zoom);

            float ratio = (minZoom - zoom) / (minZoom - maxZoom);

            modContext.getStatusMessageCenter().addMessage(net.minecraft.util.text.translation.I18n.translateToLocalFormatted("gui.currentZoom", Math.round(ratio * 100)), 800);
            instance.getPlayer().playSound(modContext.getZoomSound(), 1, 1);
            LOG.debug("Changed optical zoom to {}", instance.getZoom());
        } else {
            LOG.debug("Cannot change non-optical zoom");
        }
    }

    void decrementZoom(PlayerWeaponInstance instance) {
        Item scopeItem = instance.getAttachmentItemWithCategory(AttachmentCategory.SCOPE);
        if(scopeItem instanceof ItemScope && ((ItemScope) scopeItem).isOptical()) {
            float minZoom = ((ItemScope) scopeItem).getMinZoom();
            float maxZoom = ((ItemScope) scopeItem).getMaxZoom();
            float increment = (minZoom - maxZoom) / 7.5f;
            float zoom = instance.getZoom();

            if(zoom < minZoom) {
                zoom = Math.min(zoom + increment, minZoom);
            }
            instance.setZoom(zoom);

            float ratio = (minZoom - zoom) / (minZoom - maxZoom);
            modContext.getStatusMessageCenter().addMessage(net.minecraft.util.text.translation.I18n.translateToLocalFormatted("gui.currentZoom", Math.round(ratio * 100)), 800);
            instance.getPlayer().playSound(modContext.getZoomSound(), 1, 1);
            LOG.debug("Changed optical zoom to {}", zoom);
        } else {
            LOG.debug("Cannot change non-optical zoom");
        }
    }

    public ItemAttachment.ApplyHandler2<Weapon> getEquivalentHandler(AttachmentCategory attachmentCategory) {
        ItemAttachment.ApplyHandler2<Weapon> handler = (a, i) -> {};
        switch(attachmentCategory) {
        case SCOPE:
            //handler = (a, i) -> {
            //    //i.setZoom(builder.zoom);
            //};
            break;
        case GRIP:
            handler = (a, i) -> {
                i.setRecoil(BalancePackManager.shouldChangeWeaponRecoil(i.getWeapon()) ? (float) BalancePackManager.getNewWeaponRecoil(i.getWeapon()) : builder.recoil);
            };
            break;
        }
        return handler;
    }

    public String getTextureName() {
        return builder.textureNames.get(0);
    }

    public float getRecoil() {
        return BalancePackManager.shouldChangeWeaponRecoil(this) ? (float) BalancePackManager.getNewWeaponRecoil(this) : builder.recoil;
    }

    public ModContext getModContext() {
        return modContext;
    }

    public float getShellCasingVerticalOffset() {
        return builder.shellCasingVerticalOffset;
    }

    public float getShellCasingForwardOffset() {
        return builder.shellCasingForwardOffset;
    }
    
    public Type getShellType() {
        return builder.shellType;
    }

    public float getShellCasingSideOffset() {
        return builder.shellCasingSideOffset;
    }

    public float getShellCasingSideOffsetAimed() {
        return builder.shellCasingSideOffsetAimed;
    }

    public boolean isShellCasingEjectEnabled() {
        return builder.shellCasingEjectEnabled;
    }

    public ShellCasingEjectDirection getShellCasingEjectDirection() {
        return builder.shellCasingEjectDirection;
    }

    public float getSilencedShootSoundVolume() {
        return builder.silencedShootSoundVolume;
    }

    public float getShootSoundVolume() {
        return builder.shootSoundVolume;
    }
    
    public boolean hasFlashPedals() {
        return builder.hasFlashPedals;
    }
    
    public GunConfigurationGroup getConfigurationGroup() {
        return builder.configGroup;
    }

    public boolean hasIteratedLoad() {
        return builder.hasIteratedLoad;
    }
    
    public float getSpawnEntityVelocity() {
        return builder.spawnEntitySpeed;
    }
    
    public float getSpawnEntityGravityVelocity() {
        return builder.spawnEntityGravityVelocity;
    }

    public float getSpawnEntityDamage() {
        return builder.spawnEntityDamage;
    }
    
    public float getSpawnEntityExplosionRadius() {
        return builder.spawnEntityExplosionRadius;
    }
    
    public float getInaccuracy() {
        return builder.inaccuracy;
    }

    public boolean isCategoryRemovable(AttachmentCategory category) {
        return !builder.unremovableAttachmentCategories.contains(category);
    }
    
    public float getADSZoom() {
        return builder.zoom;
    }

    public boolean isDestroyingBlocks() {
        return builder.isDestroyingBlocks;
    }
    
    public float getSmokeParticleAgeCoefficient() {
        return builder.spawnEntitySmokeParticleAgeCoefficient;
    }
    
    public float getSmokeParticleScaleCoefficient() {
        return builder.spawnEntitySmokeParticleScaleCoefficient;
    }
    
    public float getParticleAgeCoefficient() {
        return builder.spawnEntityParticleAgeCoefficient;
    }
    
    public float getExplosionScaleCoefficient() {
        return builder.spawnEntityExplosionParticleScaleCoefficient;
    }
    
    public boolean isSmokeEnabled() {
        return builder.smokeEnabled;
    }

    public float getBleedingCoefficient() {
        return builder.bleedingCoefficient;
    }
    
    public boolean hasRocketParticles() {
        return builder.spawnEntityRocketParticles;
    }
    
//    public ScreenShaking getScreenShaking(RenderableState state) {
//        return builder.screenShakings.get(state);
//    }
    
    public Pair<Double, Double> getModernScreenShakeParameters() {
        return this.builder.screenShakingParameters;
    }
    
    public ScreenShakeAnimation.Builder getScreenShakeAnimationBuilder(RenderableState renderableState) {
        return builder.screenShakingBuilders.get(renderableState);
    }

    @Override
    public void setCraftingRecipe(CraftingEntry[] recipe) {
        this.modernRecipe = recipe;
    }

    @Override
    public void setCraftingGroup(CraftingGroup group) {
        this.craftingGroup = group;
    }

    // Todo: Remove this method once models are fixed to be at correct height
    @Override
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return true;
    }
}
