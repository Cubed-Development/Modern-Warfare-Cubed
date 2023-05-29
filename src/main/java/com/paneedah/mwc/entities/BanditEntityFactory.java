package com.paneedah.mwc.entities;

import com.paneedah.mwc.weapons.Guns;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.ai.BetterAINearestAttackableTarget;
import com.paneedah.weaponlib.ai.EntityAIAttackRangedWeapon;
import com.paneedah.weaponlib.ai.EntityConfiguration;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.*;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;
import net.minecraftforge.common.BiomeDictionary;

public class BanditEntityFactory implements EntityFactory {

    @Override
    public void createEntity(ModContext modContext) {
        new EntityConfiguration.Builder()
        .withName("terrorist")
        .withBaseClass(EntityCustomMob.class)
        .withMaxHealth(40)
        .withEntityIdSupplier(() -> 10000)
        .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag)
        .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.HARD, 0.1f, Magazines.ASValMag)
        .withEquipmentOption(Guns.MakarovPM, EnumDifficulty.EASY, 0.1f, Magazines.MakarovMag)
        .withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f)
        .withPrimaryEquipmentDropChance(0.4f)
        .withSpawn(0, 20, 31, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.HILLS)
        .withMaxTolerableLightBrightness(1f)
        .withSpawnEgg(0xFF808000, 0xFF556B2F)
        .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew", "banditnew.png")
        .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew2", "banditnew2.png")
        .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew3", "banditnew3.png")
        .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew4", "banditnew4.png")
        .withTexturedModelVariant("com.paneedah.mwc.models.BanditNew5", "banditnew5.png")
        .withHurtSound("hurt")
        .withAmbientSound("drawweapon")
        // .withStepSound("step")
        .withAiTask(1, e -> new EntityAISwimming(e))
        .withAiTask(3, e -> new EntityAIAvoidEntity<>((EntityCreature) e, EntityWolf.class, 6.0F, 1.0D, 1.2D))
        .withAiTask(4, e -> new EntityAIAttackRangedWeapon((EntityCustomMob)e, 1.0D, 10, 30.0F))
        .withAiTask(5, e -> new EntityAIWander((EntityCreature)e, 1.0D))
        .withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0F))
        .withAiTask(6, e -> new EntityAILookIdle(e))
//        .withAiTask(7, e -> new EntityAIBreakDoor(e))
        
        .withAiTargetTask(1, e -> new EntityAIHurtByTarget((EntityCreature)e, false))
        .withAiTargetTask(2, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityPlayer.class, true))
        .withAiTargetTask(2, e -> new BetterAINearestAttackableTarget<>((EntityCreature) e, EntityCustomMob.class, "soldier", true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityVillager.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityZombie.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityHusk.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntitySkeleton.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntitySpider.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityEnderman.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityCreeper.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntitySlime.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityDragon.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityEndermite.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityBlaze.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityGhast.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityIllusionIllager.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityMagmaCube.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityPigZombie.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntitySpellcasterIllager.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityStray.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityVindicator.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityWitch.class, true))
        .withAiTargetTask(3, e -> new EntityAINearestAttackableTarget<>((EntityCreature) e, EntityZombieVillager.class, true))
        .withAiTargetTask(4, e -> new BetterAINearestAttackableTarget<>((EntityCreature) e, EntityCustomMob.class, "tyke", true))
        .register(modContext);
    }
}
