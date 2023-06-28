package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.items.equipment.ItemCarryableStorage;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.config.BalancePackManager;
import net.minecraft.item.Item;

public class Backpacks {

    public static Item CombatSustainmentBackpack;
    public static Item CombatSustainmentBackpackBlack;
    public static Item CombatSustainmentBackpackForest;

    public static Item AssaultBackpack;
    public static Item AssaultBackpackBlack;
    public static Item AssaultBackpackForest;

    public static Item F5SwitchbladeBackpack;

    public static Item TruSpecCorduraBackpack;
    public static Item TruSpecCorduraBackpackBlack;
    public static Item TruSpecCorduraBackpackForest;

    public static Item Dufflebag;

    public static void init() {

        CombatSustainmentBackpack = new ItemCarryableStorage.Builder()
                .withName("combat_sustainment_backpack")
                .withSize(10)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentbackpack.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build(MWC.modContext);

        CombatSustainmentBackpackBlack = new ItemCarryableStorage.Builder()
                .withName("combat_sustainment_backpack_black")
                .withSize(10)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentblack.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build(MWC.modContext);

        CombatSustainmentBackpackForest = new ItemCarryableStorage.Builder()
                .withName("combat_sustainment_backpack_forest")
                .withSize(10)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentforest.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build(MWC.modContext);

        AssaultBackpack = new ItemCarryableStorage.Builder()
                .withName("assault_backpack")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpack.png")
                .build(MWC.modContext);

        AssaultBackpackBlack = new ItemCarryableStorage.Builder()
                .withName("assault_backpack_black")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpackblack.png")
                .build(MWC.modContext);

        AssaultBackpackForest = new ItemCarryableStorage.Builder()
                .withName("assault_backpack_forest")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpackforest.png")
                .build(MWC.modContext);

        F5SwitchbladeBackpack = new ItemCarryableStorage.Builder()
                .withName("f5switchbladebackpack")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.F5SwitchbladeBackpack", "f5switchbladebackpack.png")
                .build(MWC.modContext);

        TruSpecCorduraBackpack = new ItemCarryableStorage.Builder()
                .withName("tru_spec_cordura_backpack")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccordurabackpack.png")
                .build(MWC.modContext);

        TruSpecCorduraBackpackBlack = new ItemCarryableStorage.Builder()
                .withName("tru_spec_cordura_backpack_black")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccordurablack.png")
                .build(MWC.modContext);

        TruSpecCorduraBackpackForest = new ItemCarryableStorage.Builder()
                .withName("tru_spec_cordura_backpack_forest")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccorduraforest.png")
                .build(MWC.modContext);

        Dufflebag = new ItemCarryableStorage.Builder()
                .withName("duffle_bag")
                .withSize(24)
                .withValidItemPredicate(item -> !(item instanceof Weapon) || (((Weapon) item).getConfigurationGroup() == BalancePackManager.GunConfigurationGroup.SIDEARM || ((Weapon) item).getConfigurationGroup() == BalancePackManager.GunConfigurationGroup.REVOLVER))
                .withTab(MWC.ARMOR_TAB)
                .withProperModel("com.paneedah.mwc.models.Dufflebag", "dufflebag.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -3.65, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(2.4, 2.4, 2.4)
                        .doGLDirect())
                .build(MWC.modContext);
    }
}
