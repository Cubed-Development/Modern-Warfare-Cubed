package com.paneedah.mwc.ores;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.misc.*;
import com.paneedah.mwc.resources.ItemSulfurDust;
import com.paneedah.mwc.resources.ItemTinIngot;
import com.paneedah.weaponlib.crafting.items.CraftingItem;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

/* Maybe rename this class? and also move it; make it general.*/
public class Ores {

    public static final String DUST_SULFUR = "dustSulfur";
    public static final String INGOT_STEEL = "ingotSteel";
    public static final String INGOT_COPPER = "ingotCopper";
    public static final String INGOT_TIN = "ingotTin";
    public static final String INGOT_LEAD = "ingotLead";

    public static Item LeadIngot;

    public static Item CopperIngot;

    public static Item GraphiteChunk;

    public static Item TinIngot;

    public static Item SulfurDust;
    
    public static Item GunmetalComposite;
    public static Item GunmetalIngot;
    public static Item GunmetalPlate;
    
    public static Item SteelDust;
    public static CraftingItem SteelIngot;
    
    public static Item CarbonComposite;
    public static Item CarbonFiber;
    public static Item SyntheticPolymerComposite;
    public static Item SyntheticPlastic;
    
    public static Item VestRender;

    public static void init() {
        LeadIngot = new ItemLeadIngot();

        CopperIngot = new ItemCopperIngot();
        
        GraphiteChunk = new ItemGraphiteChunk();

        TinIngot = new ItemTinIngot();

        SulfurDust = new ItemSulfurDust();

        SteelDust = new ItemSteelDust();
        SteelIngot = new CraftingItem("SteelIngot", Ores.SteelIngot, 0.3, ModernWarfareMod.BlocksTab);
        
        GunmetalComposite = new ItemGunmetalComposite();
        GunmetalIngot = new ItemGunmetalIngot();
        GunmetalIngot = new CraftingItem("GunmetalIngot", Ores.GunmetalIngot, 0.3, ModernWarfareMod.BlocksTab);
        GunmetalPlate = new ItemGunmetalPlate();
        GunmetalPlate = new CraftingItem("GunmetalPlate", Ores.GunmetalPlate, 0.3, ModernWarfareMod.BlocksTab);
        
        CarbonComposite = new ItemCarbonComposite();
        CarbonComposite = new CraftingItem("CarbonComposite", Ores.CarbonComposite, 0.3, ModernWarfareMod.BlocksTab);
        CarbonFiber = new ItemCarbonFiber();
        SyntheticPolymerComposite = new ItemSyntheticPolymerComposite();
        SyntheticPlastic = new ItemSyntheticPlastic();
        
        VestRender = new ItemVestRender();
        
        compatibility.registerItem(LeadIngot, "leadingot");

        compatibility.registerItem(CopperIngot, "CopperIngot");
        
        compatibility.registerItem(GraphiteChunk, "GraphiteChunk");

        compatibility.registerItem(TinIngot, "TinIngot");

        compatibility.registerItem(SulfurDust, "SulfurDust");

        compatibility.registerItem(SteelDust, "SteelDust");
        compatibility.registerItem(SteelIngot, "SteelIngot");
        
        compatibility.registerItem(GunmetalIngot, "GunmetalIngot");
        compatibility.registerItem(GunmetalPlate, "GunmetalPlate");
        compatibility.registerItem(GunmetalComposite, "GunmetalComposite");
        
        compatibility.registerItem(CarbonComposite, "CarbonComposite");
        compatibility.registerItem(CarbonFiber, "CarbonFiber");
        compatibility.registerItem(SyntheticPolymerComposite, "SyntheticPolymerComposite");
        compatibility.registerItem(SyntheticPlastic, "SyntheticPlastic");
        
        compatibility.registerItem(VestRender, "vestrender");

        OreDictionary.registerOre(INGOT_LEAD, LeadIngot);
        OreDictionary.registerOre(INGOT_COPPER, CopperIngot);
        OreDictionary.registerOre(INGOT_TIN, TinIngot);
        OreDictionary.registerOre(DUST_SULFUR, SulfurDust);
        OreDictionary.registerOre(INGOT_STEEL, SteelIngot);
    }

}
