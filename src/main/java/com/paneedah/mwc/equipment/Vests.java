package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.ItemVest;

public class Vests {

    public static void init(Object mod) {

        new ItemVest.Builder()
                .withName("m43a_chest_harness")
                .withPercentDamageBlocked(0.1)
                .withDurability(150)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.M43AChestHarness", "m43achestharness.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("flyye_field_compact_plate_carrier")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.MollePlateCarrier", "molleplatecarrier.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("molle_black")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.MollePlateCarrier", "molleplatecarrier_black.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("molle_green")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.MollePlateCarrier", "molleplatecarrier_green.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("molle_urban")
                .withPercentDamageBlocked(0.2)
                .withDurability(175)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.MollePlateCarrier", "molleplatecarrier_urban.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("swat_vest")
                .withPercentDamageBlocked(0.3)
                .withDurability(250)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.UTG547Vest", "utg547vest.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("usMC_vest")
                .withPercentDamageBlocked(0.4)
                .withDurability(250)
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.USMCVest", "usMC.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("usMC_vest_black")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
                .withPercentDamageBlocked(0.4)
                .withDurability(250) // works the same way as shield's max capacity
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.USMCVest", "usMCvestblack.png")
//        .withModelTextureName("usMC.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("usMC_vest_green")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
                .withPercentDamageBlocked(0.4)
                .withDurability(250) // works the same way as shield's max capacity
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.USMCVest", "militaryuniformforest.png")
//        .withModelTextureName("usMC.png")
                .build(MWC.modContext);

        new ItemVest.Builder()
                .withName("usMC_vest_urban")
//        .withDamageReduceAmount(8) // use numbers from 1 to 8
                .withPercentDamageBlocked(0.4)
                .withDurability(250) // works the same way as shield's max capacity
                .withTab(MWC.EQUIPMENT_TAB)
                .withProperModel("com.paneedah.mwc.models.weapons.USMCVest", "militaryuniformurban.png")
//        .withModelTextureName("usMC.png")
                .build(MWC.modContext);
    }
}
