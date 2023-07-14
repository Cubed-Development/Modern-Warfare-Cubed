package com.paneedah.mwc.equipment;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.CustomArmor;
import com.paneedah.weaponlib.CustomArmor.Builder;
import com.paneedah.weaponlib.ModContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

import java.util.HashSet;
import java.util.Set;

public class Armors {
    
    // Lists of armours
    public static Set<Item> helmets = new HashSet<>();
    public static Set<Item> chestplates = new HashSet<>();
    public static Set<Item> leggings = new HashSet<>();
    public static Set<Item> boots = new HashSet<>();
	
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
    
    static ArmorMaterial Juggernaut = EnumHelper.addArmorMaterial("Juggernaut", "Juggernaut", 20, new int[] { 5, 6, 2, 5}, 20, null, 0);
    static ArmorMaterial Marine = EnumHelper.addArmorMaterial("Marine", "Marine", 60, new int[] { 2, 3, 3, 3 }, 15, null, 0);

    public static void init(Object mod, ModContext modContext) {
        Builder marineArmorBuilder = new CustomArmor.Builder()
    			.withMaterial(Marine)
                .withUnlocalizedName("Marine")
                .withTextureName("USMC")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Marinehelmet = marineArmorBuilder.buildHelmet(modContext);
        helmets.add(Marinehelmet);
        Marinechest = marineArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Marinechest);
        Marineboots = marineArmorBuilder.buildBoots(modContext.isClient());
        boots.add(Marineboots);
        
        Builder specopsArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withUnlocalizedName("Spec_Ops")
                .withTextureName("militaryuniformblack")
                .withModelClass("com.paneedah.mwc.models.SpecOps")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        SpecOpshelmet = specopsArmorBuilder.buildHelmet(modContext);
        helmets.add(SpecOpshelmet);
        SpecOpschest = specopsArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(SpecOpschest);
        SpecOpsboots = specopsArmorBuilder.buildBoots(modContext.isClient());
        boots.add(SpecOpsboots);
        
        Builder spetznazArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("Spetznaz")
                .withTextureName("militaryuniformforest")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Spetznazhelmet = spetznazArmorBuilder.buildHelmet(modContext);
        helmets.add(Spetznazhelmet);
        Spetznazchest = spetznazArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Spetznazchest);
        Spetznazboots = spetznazArmorBuilder.buildBoots(modContext.isClient());
        boots.add(Spetznazboots);
        
        Builder urbanArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("Urban")
                .withTextureName("militaryuniformurban")
                .withModelClass("com.paneedah.mwc.models.USMC")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Urbanhelmet = urbanArmorBuilder.buildHelmet(modContext);
        helmets.add(Urbanhelmet);
        Urbanchest = urbanArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Urbanchest);
        Urbanboots = urbanArmorBuilder.buildBoots(modContext.isClient());
        boots.add(Urbanboots);
        
        Builder multicamoblackArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("blackcamo")
                .withTextureName("multicamoblackshirt")
                .withModelClass("com.paneedah.mwc.models.MultiCamoBlackShirt")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Blackcamochest = multicamoblackArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Blackcamochest);
        
        Builder forestArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("forest")
                .withTextureName("militaryshirtforest")
                .withModelClass("com.paneedah.mwc.models.MultiCamoBlackShirt")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Forestchest = forestArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Forestchest);
        
        Builder blackjeansArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("blackjeans")
                .withTextureName("blackjeans")
                .withModelClass("com.paneedah.mwc.models.Jeans")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        BlackJeansboots = blackjeansArmorBuilder.buildBoots(modContext.isClient());
        boots.add(BlackJeansboots);
        
        Builder khakijeansArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withCreativeTab(MWC.EQUIPMENT_TAB)
                .withUnlocalizedName("khakijeans")
                .withTextureName("khakijeans")
                .withModelClass("com.paneedah.mwc.models.Jeans")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        KhakiJeansboots = khakijeansArmorBuilder.buildBoots(modContext.isClient());
        boots.add(KhakiJeansboots);
        
        Builder santaArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withUnlocalizedName("Santa")
                .withTextureName("santasuit_normal")
                .withModelClass("com.paneedah.mwc.models.SantasuitNormal")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Santahelmet = santaArmorBuilder.buildHelmet(modContext);
        helmets.add(Santahelmet);
        Santachest = santaArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Santachest);
        Santaboots = santaArmorBuilder.buildBoots(modContext.isClient());
        boots.add(Santaboots);
        
        Builder nazisantaArmorBuilder = new CustomArmor.Builder().withMaterial(Marine)
                .withUnlocalizedName("Nazisanta")
                .withTextureName("santasuit_nazi")
                .withModelClass("com.paneedah.mwc.models.SantaSuit")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        NaziSantahelmet = nazisantaArmorBuilder.buildHelmet(modContext);
        helmets.add(NaziSantahelmet);
        NaziSantachest = nazisantaArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(NaziSantachest);
        NaziSantaboots = nazisantaArmorBuilder.buildBoots(modContext.isClient());
        boots.add(NaziSantaboots);
        
        Builder juggernautsuitArmorBuilder = new CustomArmor.Builder().withMaterial(Juggernaut)
                .withUnlocalizedName("Juggernaut")
                .withTextureName("JuggernautSuit")
                .withModelClass("com.paneedah.mwc.models.JuggernautSuit")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Juggernauthelmet = juggernautsuitArmorBuilder.buildHelmet(modContext);
        helmets.add(Juggernauthelmet);
        Juggernautchest = juggernautsuitArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Juggernautchest);
        Juggernautboots = juggernautsuitArmorBuilder.buildBoots(modContext.isClient());
        boots.add(Juggernautboots);
        
        Builder ghillieArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withUnlocalizedName("ghillie")
                .withTextureName("ghillie")
                .withModelClass("com.paneedah.mwc.models.Ghillie")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Ghilliehelmet = ghillieArmorBuilder.buildHelmet(modContext);
        helmets.add(Ghilliehelmet);
        Ghilliechest = ghillieArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Ghilliechest);
        Ghillieboots = ghillieArmorBuilder.buildBoots(modContext.isClient());
        boots.add(Ghillieboots);

        Builder swatArmorBuilder = new CustomArmor.Builder().withMaterial(Marine)
                .withUnlocalizedName("Swat")
                .withTextureName("Swat")
                .withModelClass("com.paneedah.mwc.models.Swat")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Swathelmet = swatArmorBuilder.buildHelmet(modContext);
        helmets.add(Swathelmet);
        Swatchest = swatArmorBuilder.buildChest(modContext.isClient());
        chestplates.add(Swatchest);
        Swatboots = swatArmorBuilder.buildBoots(modContext.isClient());
        boots.add(Swatboots);

        Builder tacticalArmorBuilder = new CustomArmor.Builder()
        		.withMaterial(Marine)
                .withUnlocalizedName("Tactical")
                .withTextureName("Tactical")
                .withModelClass("com.paneedah.mwc.models.Tactical")
                .withNightVision(true)
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        Tacticalhelmet = tacticalArmorBuilder.buildHelmet(modContext);
        helmets.add(Tacticalhelmet);
        
        Builder jpnvg18ArmorBuilder = new CustomArmor.Builder().withMaterial(Marine)
                .withUnlocalizedName("JPNVG18")
                .withTextureName("jpnvg18")
                .withModelClass("com.paneedah.mwc.models.JPNVG18")
                .withNightVision(true)
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        JPNVG18helmet = jpnvg18ArmorBuilder.buildHelmet(modContext);
        helmets.add(JPNVG18helmet);

        Builder gasSuitArmorBuilder = new CustomArmor.Builder().withMaterial(Marine)
                .withUnlocalizedName("m40gasmask")
                .withTextureName("m40gasmask")
                .withExposureReductionFactor(0.99f)
                .withModelClass("com.paneedah.mwc.models.M40GasMask")
                .withHudTextureName("goggles_overlay")
                .withCreativeTab(MWC.EQUIPMENT_TAB);

        GasMaskM40 = gasSuitArmorBuilder.buildHelmet(modContext);
        helmets.add(GasMaskM40);
    }
}
