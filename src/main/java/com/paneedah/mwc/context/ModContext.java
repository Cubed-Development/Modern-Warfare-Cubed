package com.paneedah.mwc.context;

import com.paneedah.mwc.instancing.PlayerItemInstanceRegistry;
import com.paneedah.mwc.instancing.PlayerWeaponInstance;
import com.paneedah.mwc.network.NetworkPermitManager;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.crafting.RecipeManager;
import com.paneedah.weaponlib.grenade.GrenadeAttackAspect;
import com.paneedah.weaponlib.grenade.GrenadeRenderer;
import com.paneedah.weaponlib.grenade.ItemGrenade;
import com.paneedah.weaponlib.melee.ItemMelee;
import com.paneedah.weaponlib.melee.MeleeAttachmentAspect;
import com.paneedah.weaponlib.melee.MeleeAttackAspect;
import com.paneedah.weaponlib.melee.MeleeRenderer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public interface ModContext {

    void registerTileEntities();

    void preInit();

    void registerWeapon(String name, Weapon weapon, WeaponRenderer renderer);

    void registerRenderableItem(String name, Item weapon, Object renderer);

    void registerRenderableItem(ResourceLocation name, Item weapon, Object renderer);

    SoundEvent registerSound(String sound);

    PlayerItemInstanceRegistry getPlayerItemInstanceRegistry();

    WeaponReloadAspect getWeaponReloadAspect();

    WeaponFireAspect getWeaponFireAspect();

    WeaponAttachmentAspect getWeaponAttachmentAspect();

    MagazineReloadAspect getMagazineReloadAspect();

    /// @apiNote This method is expensive, store the result instead of calling multiple times in a row.
    PlayerWeaponInstance getMainHeldWeapon();

    RecipeManager getRecipeManager();

    SoundEvent getChangeFireModeSound();

    SoundEvent getNoAmmoSound();

    SoundEvent getExplosionSound();

    SoundEvent getFlashExplosionSound();

    SoundEvent getNightVisionOnSound();

    SoundEvent getNightVisionOffSound();

    void registerMeleeWeapon(String name, ItemMelee itemMelee, MeleeRenderer renderer);

    void registerGrenadeWeapon(String name, ItemGrenade itemGrenade, GrenadeRenderer renderer);

    MeleeAttackAspect getMeleeAttackAspect();

    MeleeAttachmentAspect getMeleeAttachmentAspect();

    ResourceLocation getNamedResource(final String path);

    float getAspectRatio();

    GrenadeAttackAspect getGrenadeAttackAspect();

    EffectManager getEffectManager();

    void registerRenderableEntity(Class<? extends Entity> entityClass, Object renderer);

    void init();

    MaterialImpactSound getMaterialImpactSound(Material material);

    void setMaterialImpactSounds(Material material, String... sounds);

    int registerTexture(String explosionParticleTextureName);

    String getRegisteredTexture(int particleTextureId);

    NetworkPermitManager getNetworkPermitManager();
}
