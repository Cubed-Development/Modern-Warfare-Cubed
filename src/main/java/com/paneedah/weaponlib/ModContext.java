package com.paneedah.weaponlib;

import com.paneedah.weaponlib.compatibility.*;
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

	boolean isClient();
	
	void preInitEnd(Object mod, CompatibleFmlPreInitializationEvent event, CompatibleChannel channel);

	void preInit(Object mod, CompatibleFmlPreInitializationEvent event, CompatibleChannel channel);

	void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer);

	CompatibleChannel getChannel();

	void runSyncTick(Runnable runnable);

	void registerRenderableItem(String name, Item weapon, Object renderer);

	void registerRenderableItem(ResourceLocation name, Item weapon, Object renderer);

	// TODO: append mod id in 1.7.10
	CompatibleSound registerSound(String sound);

	void runInMainThread(Runnable runnable);

	PlayerItemInstanceRegistry getPlayerItemInstanceRegistry();

	WeaponReloadAspect getWeaponReloadAspect();

	WeaponFireAspect getWeaponFireAspect();

	WeaponAttachmentAspect getAttachmentAspect();

	MagazineReloadAspect getMagazineReloadAspect();

	PlayerWeaponInstance getMainHeldWeapon();

	StatusMessageCenter getStatusMessageCenter();

	RecipeManager getRecipeManager();

	CompatibleSound getZoomSound();

	void setChangeZoomSound(String sound);

	CompatibleSound getChangeFireModeSound();

	void setChangeFireModeSound(String sound);

	CompatibleSound getNoAmmoSound();

	void setNoAmmoSound(String sound);

	CompatibleSound getExplosionSound();

	void setExplosionSound(String sound);

	CompatibleSound getFlashExplosionSound();

	void setFlashExplosionSound(String sound);

	void setNightVisionOnSound(String sound);

	CompatibleSound getNightVisionOnSound();

	void setNightVisionOffSound(String sound);

	CompatibleSound getNightVisionOffSound();

	void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer);

	void registerGrenadeWeapon(String name, ItemGrenade itemGrenade, GrenadeRenderer renderer);

	MeleeAttackAspect getMeleeAttackAspect();

	MeleeAttachmentAspect getMeleeAttachmentAspect();

	AttachmentContainer getGrenadeAttachmentAspect();

	ResourceLocation getNamedResource(String name);

	float getAspectRatio();

	GrenadeAttackAspect getGrenadeAttackAspect();

	EffectManager getEffectManager();

	Object getMod();

	void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer);

	void setPlayerTransitionProvider(PlayerTransitionProvider playerTransitionProvider);

	void init(Object mod);

	MaterialImpactSound getMaterialImpactSound(CompatibleBlockState blockState, WeaponSpawnEntity entity);

	CommonModContext setMaterialsImpactSound(String sound, Item bulletItem, float volume, CompatibleMaterial... materials);

	CommonModContext setMaterialImpactSound(String sound, float volume, CompatibleMaterial material);

	CommonModContext setMaterialsImpactSound(String sound, float volume, CompatibleMaterial... materials);

	CommonModContext setMaterialsImpactSound(String sound, CompatibleMaterial... materials);

	CommonModContext setMaterialImpactSounds(CompatibleMaterial material, float volume, String... sounds);

	int getRegisteredTextureId(String textureName);

	int registerTexture(String explosionParticleTextureName);

	String getRegisteredTexture(int particleTextureId);

	MissionManager getMissionManager();

}
