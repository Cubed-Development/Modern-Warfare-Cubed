package com.paneedah.mwc.equipment;

import com.paneedah.mwc.ModernWarfareMod;
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
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentbackpack.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build(ModernWarfareMod.MOD_CONTEXT);

        CombatSustainmentBackpackBlack = new ItemCarryableStorage.Builder()
                .withName("combat_sustainment_backpack_black")
                .withSize(10)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentblack.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build(ModernWarfareMod.MOD_CONTEXT);

        CombatSustainmentBackpackForest = new ItemCarryableStorage.Builder()
                .withName("combat_sustainment_backpack_forest")
                .withSize(10)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.CombatSustainmentBackpack", "combatsustainmentforest.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -4.6, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(3.3, 3.3, 3.3)
                        .doGLDirect())
                .build(ModernWarfareMod.MOD_CONTEXT);

        AssaultBackpack = new ItemCarryableStorage.Builder()
                .withName("assault_backpack")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpack.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AssaultBackpackBlack = new ItemCarryableStorage.Builder()
                .withName("assault_backpack_black")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpackblack.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        AssaultBackpackForest = new ItemCarryableStorage.Builder()
                .withName("assault_backpack_forest")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.AssaultBackpack", "assaultbackpackforest.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        F5SwitchbladeBackpack = new ItemCarryableStorage.Builder()
                .withName("f5switchbladebackpack")
                .withSize(16)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.F5SwitchbladeBackpack", "f5switchbladebackpack.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        TruSpecCorduraBackpack = new ItemCarryableStorage.Builder()
                .withName("tru_spec_cordura_backpack")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccordurabackpack.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        TruSpecCorduraBackpackBlack = new ItemCarryableStorage.Builder()
                .withName("tru_spec_cordura_backpack_black")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccordurablack.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        TruSpecCorduraBackpackForest = new ItemCarryableStorage.Builder()
                .withName("tru_spec_cordura_backpack_forest")
                .withSize(20)
                .withValidItemPredicate(item -> !(item instanceof Weapon))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.TruSpecCorduraBackpack", "truspeccorduraforest.png")
                .build(ModernWarfareMod.MOD_CONTEXT);

        Dufflebag = new ItemCarryableStorage.Builder()
                .withName("duffle_bag")
                .withSize(24)
                .withValidItemPredicate(item -> !(item instanceof Weapon) || (((Weapon) item).getConfigurationGroup() == BalancePackManager.GunConfigurationGroup.SIDEARM || ((Weapon) item).getConfigurationGroup() == BalancePackManager.GunConfigurationGroup.REVOLVER))
                .withTab(ModernWarfareMod.ArmorTab)
                .withProperModel("com.paneedah.mwc.models.Dufflebag", "dufflebag.png")
                .withInventoryPositioning(stack -> new Transform()
                        .withPosition(-0.15, -3.65, 0.35)
                        .withRotation(18, -50, 0)
                        .withScale(2.4, 2.4, 2.4)
                        .doGLDirect())
                .build(ModernWarfareMod.MOD_CONTEXT);
    }
}
