package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.*;
import com.paneedah.weaponlib.configold.ConfigurationManager;
import com.paneedah.weaponlib.crafting.RecipeManager;
import com.paneedah.weaponlib.grenade.GrenadeAttackAspect;
import com.paneedah.weaponlib.grenade.GrenadeRenderer;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeAttachmentAspect;
import com.paneedah.weaponlib.melee.MeleeAttackAspect;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import com.paneedah.weaponlib.mission.MissionManager;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public interface ModContext {

	public boolean isClient();
	
	public void preInitEnd(Object mod, String modId, ConfigurationManager configurationManager,
			CompatibleFmlPreInitializationEvent event, CompatibleChannel channel);

	public void preInit(Object mod, String modId, ConfigurationManager configurationManager,
			CompatibleFmlPreInitializationEvent event, CompatibleChannel channel);

	public void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer);

	public CompatibleChannel getChannel();

	public void runSyncTick(Runnable runnable);

	public void registerRenderableItem(String name, Item weapon, Object renderer);

	public void registerRenderableItem(ResourceLocation name, Item weapon, Object renderer);

	// TODO: append mod id in 1.7.10
	public CompatibleSound registerSound(String sound);

	public void runInMainThread(Runnable runnable);

	public PlayerItemInstanceRegistry getPlayerItemInstanceRegistry();

	public WeaponReloadAspect getWeaponReloadAspect();

	public WeaponFireAspect getWeaponFireAspect();

	public WeaponAttachmentAspect getAttachmentAspect();

	public MagazineReloadAspect getMagazineReloadAspect();

	public PlayerWeaponInstance getMainHeldWeapon();

	public StatusMessageCenter getStatusMessageCenter();

	public RecipeManager getRecipeManager();

	public CompatibleSound getZoomSound();

	public void setChangeZoomSound(String sound);

	public CompatibleSound getChangeFireModeSound();

	public void setChangeFireModeSound(String sound);

	public CompatibleSound getNoAmmoSound();

	public void setNoAmmoSound(String sound);

	public CompatibleSound getExplosionSound();

	public void setExplosionSound(String sound);

	public CompatibleSound getFlashExplosionSound();

	public void setFlashExplosionSound(String sound);

	public void setNightVisionOnSound(String sound);

	public CompatibleSound getNightVisionOnSound();

	public void setNightVisionOffSound(String sound);

	public CompatibleSound getNightVisionOffSound();

	public void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer);

	public void registerGrenadeWeapon(String name, ItemGrenade itemGrenade, GrenadeRenderer renderer);

	public MeleeAttackAspect getMeleeAttackAspect();

	public MeleeAttachmentAspect getMeleeAttachmentAspect();

	public AttachmentContainer getGrenadeAttachmentAspect();

	public ResourceLocation getNamedResource(String name);

	public float getAspectRatio();

	public GrenadeAttackAspect getGrenadeAttackAspect();

	public String getModId();

	public EffectManager getEffectManager();

	public ConfigurationManager getConfigurationManager();

	public Object getMod();

	public void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer);

	public void setPlayerTransitionProvider(PlayerTransitionProvider playerTransitionProvider);

	public void init(Object mod, String modid);

	public MaterialImpactSound getMaterialImpactSound(CompatibleBlockState blockState, WeaponSpawnEntity entity);

	public CommonModContext setMaterialsImpactSound(String sound, Item bulletItem, float volume,
			CompatibleMaterial... materials);

	public CommonModContext setMaterialImpactSound(String sound, float volume, CompatibleMaterial material);

	public CommonModContext setMaterialsImpactSound(String sound, float volume, CompatibleMaterial... materials);

	public CommonModContext setMaterialsImpactSound(String sound, CompatibleMaterial... materials);

	public CommonModContext setMaterialImpactSounds(CompatibleMaterial material, float volume, String... sounds);

	public int getRegisteredTextureId(String textureName);

	public int registerTexture(String explosionParticleTextureName);

	public String getRegisteredTexture(int particleTextureId);

	public MissionManager getMissionManager();

}
