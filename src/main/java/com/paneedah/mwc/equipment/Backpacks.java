package com.paneedah.mwc.equipment;

import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import net.minecraft.item.Item;

public class Backpacks {

    public static Item combatSustainmentBackpackTan;
    public static Item combatSustainmentBackpackBlack;
    public static Item combatSustainmentBackpackForest;

    public static Item assaultBackpackTan;
    public static Item assaultBackpackBlack;
    public static Item assaultBackpackForest;

    public static Item truSpecCorduraBackpackTan;
    public static Item truSpecCorduraBackpackBlack;
    public static Item truSpecCorduraBackpackForest;

    public static Item f5SwitchbladeBackpack;

    public static Item duffleBag;

    public static void init() {

        combatSustainmentBackpackTan = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_tan")
                .withSize(10)
                .withModel("CombatSustainmentBackpack")
                .withTexture("equipments/backpacks/combat_sustainment_backpack_tan")
                .build();

        combatSustainmentBackpackBlack = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_black")
                .withSize(10)
                .withModel("CombatSustainmentBackpack")
                .withTexture("equipments/backpacks/combat_sustainment_backpack_black")
                .build();

        combatSustainmentBackpackForest = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_forest")
                .withSize(10)
                .withModel("CombatSustainmentBackpack")
                .withTexture("equipments/backpacks/combat_sustainment_backpack_forest")
                .build();

        assaultBackpackTan = new ItemBackpack.Builder()
                .withName("assault_backpack_tan")
                .withSize(16)
                .withModel("AssaultBackpack")
                .withTexture("equipments/backpacks/assault_backpack_tan")
                .build();

        assaultBackpackBlack = new ItemBackpack.Builder()
                .withName("assault_backpack_black")
                .withSize(16)
                .withModel("AssaultBackpack")
                .withTexture("equipments/backpacks/assault_backpack_black")
                .build();

        assaultBackpackForest = new ItemBackpack.Builder()
                .withName("assault_backpack_forest")
                .withSize(16)
                .withModel("AssaultBackpack")
                .withTexture("equipments/backpacks/assault_backpack_forest")
                .build();

        truSpecCorduraBackpackTan = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_tan")
                .withSize(20)
                .withModel("TruSpecCorduraBackpack")
                .withTexture("equipments/backpacks/tru_spec_cordura_backpack_tan")
                .build();

        truSpecCorduraBackpackBlack = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_black")
                .withSize(20)
                .withModel("TruSpecCorduraBackpack")
                .withTexture("equipments/backpacks/tru_spec_cordura_backpack_black")
                .build();

        truSpecCorduraBackpackForest = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_forest")
                .withSize(20)
                .withModel("TruSpecCorduraBackpack")
                .withTexture("equipments/backpacks/tru_spec_cordura_backpack_forest")
                .build();

        f5SwitchbladeBackpack = new ItemBackpack.Builder()
                .withName("f5_switchblade_backpack")
                .withSize(16)
                .withModel("F5SwitchbladeBackpack")
                .withTexture("equipments/backpacks/f5_switchblade_backpack")
                .build();

        duffleBag = new ItemBackpack.Builder()
                .withName("duffle_bag")
                .withSize(24)
                .withModel("DuffleBag")
                .withTexture("equipments/backpacks/duffle_bag")
                .build();
    }
}
