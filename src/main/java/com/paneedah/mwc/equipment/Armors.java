package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.CustomArmor;
import com.paneedah.weaponlib.CustomArmor.Builder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Armors {

    // realistic armors
    public static Item JPNVG18helmet;

    // armors

    public static Item Marinechest;
    public static Item Marineboots;
    public static Item Marinehelmet;

    public static Item Urbanchest;
    public static Item Urbanboots;
    public static Item Urbanhelmet;

    public static Item Blackcamochest;

    public static Item Forestchest;

    public static Item BlackJeansboots;
    public static Item KhakiJeansboots;

    public static Item Ghilliechest;
    public static Item Ghillieboots;
    public static Item Ghilliehelmet;

    public static CustomArmor GasMaskM40;

    public static Item Spetznazchest;
    public static Item Spetznazboots;
    public static Item Spetznazhelmet;

    public static Item Swatchest;
    public static Item Swatboots;
    public static Item Swathelmet;

    public static Item Tacticalhelmet;

    public static Item SpecOpschest;
    public static Item SpecOpsboots;
    public static Item SpecOpshelmet;

    public static Item Juggernautchest;
    public static Item Juggernautboots;
    public static Item Juggernauthelmet;

    public static Item NaziSantachest;
    public static Item NaziSantaboots;
    public static Item NaziSantahelmet;

    public static Item Santachest;
    public static Item Santaboots;
    public static Item Santahelmet;

    static ArmorMaterial Juggernaut = EnumHelper.addArmorMaterial("Juggernaut", "Juggernaut", 20, new int[]{5, 6, 2, 5}, 20, null, 0);
    static ArmorMaterial Marine = EnumHelper.addArmorMaterial("Marine", "Marine", 60, new int[]{2, 3, 3, 3}, 15, null, 0);

    public static void createEquipment() {
        Builder marineArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withUnlocalizedName("Marine")
                .withTextureName("USMC")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Marinehelmet = marineArmorBuilder.buildHelmet();
        Armors.Marinechest = marineArmorBuilder.buildChest();
        Armors.Marineboots = marineArmorBuilder.buildBoots();

        Builder specopsArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withUnlocalizedName("Spec_Ops")
                .withTextureName("militaryuniformblack")
                .withModelClass("com.paneedah.mwc.models.SpecOps")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.SpecOpshelmet = specopsArmorBuilder.buildHelmet();
        Armors.SpecOpschest = specopsArmorBuilder.buildChest();
        Armors.SpecOpsboots = specopsArmorBuilder.buildBoots();

        Builder spetznazArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("Spetznaz")
                .withTextureName("militaryuniformforest")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Spetznazhelmet = spetznazArmorBuilder.buildHelmet();
        Armors.Spetznazchest = spetznazArmorBuilder.buildChest();
        Armors.Spetznazboots = spetznazArmorBuilder.buildBoots();

        Builder urbanArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("Urban")
                .withTextureName("militaryuniformurban")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Urbanhelmet = urbanArmorBuilder.buildHelmet();
        Armors.Urbanchest = urbanArmorBuilder.buildChest();
        Armors.Urbanboots = urbanArmorBuilder.buildBoots();

        Builder multicamoblackArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("blackcamo")
                .withTextureName("multicamoblackshirt")
                .withModelClass("com.paneedah.mwc.models.MultiCamoBlackShirt")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Blackcamochest = multicamoblackArmorBuilder.buildChest();

        Builder forestArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("forest")
                .withTextureName("militaryshirtforest")
                .withModelClass("com.paneedah.mwc.models.MultiCamoBlackShirt")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Forestchest = forestArmorBuilder.buildChest();

        Builder blackjeansArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("blackjeans")
                .withTextureName("blackjeans")
                .withModelClass("com.paneedah.mwc.models.Jeans")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.BlackJeansboots = blackjeansArmorBuilder.buildBoots();

        Builder khakijeansArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("khakijeans")
                .withTextureName("khakijeans")
                .withModelClass("com.paneedah.mwc.models.Jeans")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.KhakiJeansboots = khakijeansArmorBuilder.buildBoots();

        Builder santaArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withUnlocalizedName("Santa")
                .withTextureName("santasuit_normal")
                .withModelClass("com.paneedah.mwc.models.SantasuitNormal")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Santahelmet = santaArmorBuilder.buildHelmet();
        Armors.Santachest = santaArmorBuilder.buildChest();
        Armors.Santaboots = santaArmorBuilder.buildBoots();

        Builder nazisantaArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Marine)
                .withUnlocalizedName("Nazisanta")
                .withTextureName("santasuit_nazi")
                .withModelClass("com.paneedah.mwc.models.SantaSuit")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.NaziSantahelmet = nazisantaArmorBuilder.buildHelmet();
        Armors.NaziSantachest = nazisantaArmorBuilder.buildChest();
        Armors.NaziSantaboots = nazisantaArmorBuilder.buildBoots();

        Builder juggernautsuitArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Juggernaut)
                .withUnlocalizedName("Juggernaut")
                .withTextureName("JuggernautSuit")
                .withModelClass("com.paneedah.mwc.models.JuggernautSuit")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Juggernauthelmet = juggernautsuitArmorBuilder.buildHelmet();
        Armors.Juggernautchest = juggernautsuitArmorBuilder.buildChest();
        Armors.Juggernautboots = juggernautsuitArmorBuilder.buildBoots();

        Builder ghillieArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withUnlocalizedName("ghillie")
                .withTextureName("ghillie")
                .withModelClass("com.paneedah.mwc.models.Ghillie")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Ghilliehelmet = ghillieArmorBuilder.buildHelmet();
        Armors.Ghilliechest = ghillieArmorBuilder.buildChest();
        Armors.Ghillieboots = ghillieArmorBuilder.buildBoots();

        Builder swatArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Marine)
                .withUnlocalizedName("Swat")
                .withTextureName("Swat")
                .withModelClass("com.paneedah.mwc.models.Swat")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Swathelmet = swatArmorBuilder.buildHelmet();
        Armors.Swatchest = swatArmorBuilder.buildChest();
        Armors.Swatboots = swatArmorBuilder.buildBoots();

        Builder tacticalArmorBuilder = new CustomArmor.Builder()
                .withMaterial(Armors.Marine)
                .withUnlocalizedName("Tactical")
                .withTextureName("Tactical")
                .withModelClass("com.paneedah.mwc.models.Tactical")
                .withNightVision(true)
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.Tacticalhelmet = tacticalArmorBuilder.buildHelmet();

        Builder jpnvg18ArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Marine)
                .withUnlocalizedName("JPNVG18")
                .withTextureName("jpnvg18")
                .withModelClass("com.paneedah.mwc.models.JPNVG18")
                .withNightVision(true)
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.JPNVG18helmet = jpnvg18ArmorBuilder.buildHelmet();

        Builder gasSuitArmorBuilder = new CustomArmor.Builder().withMaterial(Armors.Marine)
                .withUnlocalizedName("m40gasmask")
                .withTextureName("m40gasmask")
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.paneedah.mwc.models.M40GasMask")
                .withHudTextureName("goggles_overlay")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Armors.GasMaskM40 = gasSuitArmorBuilder.buildHelmet();
    }
}
