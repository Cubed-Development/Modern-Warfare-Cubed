package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.items.equipment.carryable.ItemBackpack;
import com.paneedah.mwc.models.*;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.config.BalancePackManager;
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
                .withModel(new CombatSustainmentBackpack())
                .withTexture("equipment/carryable/backpacks/combat_sustainment_backpack_tan")
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build();

        combatSustainmentBackpackBlack = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_black")
                .withSize(10)
                .withModel(new CombatSustainmentBackpack())
                .withTexture("equipment/carryable/backpacks/combat_sustainment_backpack_black")
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build();

        combatSustainmentBackpackForest = new ItemBackpack.Builder()
                .withName("combat_sustainment_backpack_forest")
                .withSize(10)
                .withModel(new CombatSustainmentBackpack())
                .withTexture("equipment/carryable/backpacks/combat_sustainment_backpack_forest")
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build();

        assaultBackpackTan = new ItemBackpack.Builder()
                .withName("assault_backpack_tan")
                .withSize(16)
                .withModel(new AssaultBackpack())
                .withTexture("equipment/carryable/backpacks/assault_backpack_tan")
                .build();

        assaultBackpackBlack = new ItemBackpack.Builder()
                .withName("assault_backpack_black")
                .withSize(16)
                .withModel(new AssaultBackpack())
                .withTexture("equipment/carryable/backpacks/assault_backpack_black")
                .build();

        assaultBackpackForest = new ItemBackpack.Builder()
                .withName("assault_backpack_forest")
                .withSize(16)
                .withModel(new AssaultBackpack())
                .withTexture("equipment/carryable/backpacks/assault_backpack_forest")
                .build();

        truSpecCorduraBackpackTan = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_tan")
                .withSize(20)
                .withModel(new TruSpecCorduraBackpack())
                .withTexture("equipment/carryable/backpacks/tru_spec_cordura_backpack_tan")
                .build();

        truSpecCorduraBackpackBlack = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_black")
                .withSize(20)
                .withModel(new TruSpecCorduraBackpack())
                .withTexture("equipment/carryable/backpacks/tru_spec_cordura_backpack_black")
                .build();

        truSpecCorduraBackpackForest = new ItemBackpack.Builder()
                .withName("tru_spec_cordura_backpack_forest")
                .withSize(20)
                .withModel(new TruSpecCorduraBackpack())
                .withTexture("equipment/carryable/backpacks/tru_spec_cordura_backpack_forest")
                .build();

        f5SwitchbladeBackpack = new ItemBackpack.Builder()
                .withName("f5_switchblade_backpack")
                .withSize(16)
                .withModel(new F5SwitchbladeBackpack())
                .withTexture("equipment/carryable/backpacks/f5_switchblade_backpack")
                .build();

        duffleBag = new ItemBackpack.Builder()
                .withName("duffle_bag")
                .withSize(24)
                .withModel(new Dufflebag())
                .withTexture("equipment/carryable/backpacks/duffle_bag")
                .withInventoryPositioning(itemStack -> new Transform()
                        .withPosition(-0.15, -3.65, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(2.4, 2.4, 2.4)
                        .doGLDirect())
                .build();
    }
}
