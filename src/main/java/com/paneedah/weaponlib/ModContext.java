package com.paneedah.weaponlib;

import com.paneedah.weaponlib.crafting.RecipeManager;
import com.paneedah.weaponlib.grenade.GrenadeAttackAspect;
import com.paneedah.weaponlib.grenade.GrenadeRenderer;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeAttachmentAspect;
import com.paneedah.weaponlib.melee.MeleeAttackAspect;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public interface ModContext {

	boolean isClient();
	
	void preInitEnd(Object mod);

	void preInit(Object mod);

	void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer);

	void registerRenderableItem(String name, Item weapon, Object renderer);

	void registerRenderableItem(ResourceLocation name, Item weapon, Object renderer);

	SoundEvent registerSound(String sound);

	PlayerItemInstanceRegistry getPlayerItemInstanceRegistry();

	WeaponReloadAspect getWeaponReloadAspect();

	WeaponFireAspect getWeaponFireAspect();

	WeaponAttachmentAspect getAttachmentAspect();

	MagazineReloadAspect getMagazineReloadAspect();

	PlayerWeaponInstance getMainHeldWeapon();

	RecipeManager getRecipeManager();

	SoundEvent getZoomSound();

	void setChangeZoomSound(String sound);

	SoundEvent getChangeFireModeSound();

	void setChangeFireModeSound(String sound);

	SoundEvent getNoAmmoSound();

	void setNoAmmoSound(String sound);

	SoundEvent getExplosionSound();

	void setExplosionSound(String sound);

	SoundEvent getFlashExplosionSound();

	void setFlashExplosionSound(String sound);

	void setNightVisionOnSound(String sound);

	SoundEvent getNightVisionOnSound();

	void setNightVisionOffSound(String sound);

	SoundEvent getNightVisionOffSound();

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

	void init(Object mod);

	MaterialImpactSound getMaterialImpactSound(IBlockState iBlockState, WeaponSpawnEntity entity);

	CommonModContext setMaterialImpactSound(String sound, float volume, Material material);

	CommonModContext setMaterialsImpactSound(String sound, float volume, Material... materials);

	CommonModContext setMaterialsImpactSound(String sound, Material... materials);

	CommonModContext setMaterialImpactSounds(Material material, float volume, String... sounds);

	int getRegisteredTextureId(String textureName);

	int registerTexture(String explosionParticleTextureName);

	String getRegisteredTexture(int particleTextureId);

}
