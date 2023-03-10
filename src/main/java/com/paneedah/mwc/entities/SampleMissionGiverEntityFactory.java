package com.paneedah.mwc.entities;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.Guns;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.ai.EntityConfiguration;
import com.paneedah.weaponlib.ai.EntityCustomMob;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.EnumDifficulty;

public class SampleMissionGiverEntityFactory implements EntityFactory {

    @Override
    public void createEntity(ModContext modContext) {

        String missionDescription = "Put your long mission description here as long as it does not exceed the dialog area on the screen";
        new EntityConfiguration.Builder()

                .withName("sampleMissionGiver")
                .withBaseClass(EntityCustomMob.class)
                .withMaxHealth(20)
                .withEntityIdSupplier(() -> 20000)
                .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag)
                .withEquipmentOption(Guns.VSSVintorez, EnumDifficulty.EASY, 0.1f, Magazines.VSSVintorezMag,
                        Attachments.PSO1)
                .withEquipmentOption(Guns.Remington870, EnumDifficulty.EASY, 0.07f)
                .withPrimaryEquipmentDropChance(1f)
//                .withSpawn(1, 1, 7, CompatibleBiomeType.PLAINS, CompatibleBiomeType.FOREST, CompatibleBiomeType.HILLS)
//                .withSpawnEgg(0xA0A000, 0xA0A010) 
                .withTexturedModelVariant("com.paneedah.mwc.models.Biped", "bandit1.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.Biped", "bandit3.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.Biped", "bandit4.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.Biped", "bandit5.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.Biped", "bandit6.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.Biped", "bandit7.png")
                .withTexturedModelVariant("com.paneedah.mwc.models.Biped", "bandit8.png")
                .withHurtSound("hurt")
//                .withPushability(false)
//                .withCollidability(false)
                .withDespawnability(false)
                .withInvulnerability()
                .withAmbientSound("drawweapon")

                .withAiTask(6, e -> new EntityAIWatchClosest(e, EntityPlayer.class, 50.0F))
                .withAiTask(6, e -> new EntityAILookIdle(e))

//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 1 cow")
//                                .withMissionDescription("ss")
//                                .withGoal(new KillEntityAction("cow"), 1)
//                                .withLevel(Level.EASY)
//                                .withReward(Attachments.ACOG)
//                                .withReward(Guns.M4A1)
//                                .build(ModReference.id)
//                )
//
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Bring an apple")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new ObtainItemAction(Items.APPLE, false), 1)
//                                .withMaxDuration(1000)
//                                .withCooldownTime(500)
//                                .withLevel(Level.EASY)
//                                .withReward(Guns.M4A1)
//                                .build(ModReference.id))
//
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Find a location")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new GoToLocationAction(500, 4, 500, 10), 1)
//                                .withMaxDuration(1000)
//                                .withCooldownTime(1000)
//                                .withLevel(Level.EASY)
//                                .withReward(Guns.M4A1)
//                                .build(ModReference.id))
//
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 2 cows")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("cow"), 2)
//                                .requiresAll("Kill 1 cow")
//                                .withLevel(Level.EASY)
//                                .withReward(Items.APPLE, 5)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//
//                )
//
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 3 cows")
//                                .withMissionDescription(missionDescription)
//                                .requiresAll("Kill 2 cows")
//                                .withLevel(Level.MEDIUM)
//                                .withGoal(new KillEntityAction("cow"), 3)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .build(ModReference.id)
//
//                )
//
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 3 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 3)
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//                )
//
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 4 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 4)
//                                .requiresAll("Kill 3 zombies")
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//                )

//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 5 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 5)
//                                .requiresAll("Kill 4 zombies")
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//
//                )
//
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 6 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 6)
////                                .requiresAll("Kill 5 zombies")
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//
//                )
//                
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 7 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 6)
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//
//                )
//                
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 8 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 6)
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//
//                )
//                
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 9 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 6)
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//
//                )
//                
//                .withMissionOffering(
//
//                        new MissionOffering.Builder("Kill 10 zombies")
//                                .withMissionDescription(missionDescription)
//                                .withGoal(new KillEntityAction("zombie"), 6)
//                                .withLevel(Level.HARD)
//                                .withReward(Items.DIAMOND_AXE)
//                                .withReward(Items.DIAMOND_PICKAXE)
//                                .withReward(Items.DIAMOND_BOOTS)
//                                .withReward(Items.DIAMOND_SWORD)
//                                .build(ModReference.id)
//
//                )
                .withIntroDialog(
                        "The Mysterious Stranger admired your family cow and asked if it was for sale.\n\nWhen you nodded, he offered to trade some Magic Beans, that (if planted in tilled dirt) would lead to more wealth than you could imagine.")
                .withIntroDialog(
                        "So you handed him your cow, and grabbed the Magic Beans.\n\nPleased with yourself, you hurried away, looking for tilled dirt in which to plant the Magic Beans.\n\nYou couldn't wait to see how proud your mother would be for")
                .withIntroDialog(
                        "being so shrewd!  Untold wealth in return for an old, milkless cow; what a good deal you made!\n\nSo off you went, looking for a place to plant the Magic Beans with room to grow...")

                .withIntroImage("mob.png")
                .withDialogBackground("black_leather.png")
                .withMissionSelectionBackground("mission_selection_background.png")
                .withRewardsBackground("rewards.png")
                .register(ModernWarfareMod.MOD_CONTEXT);
    }
}
