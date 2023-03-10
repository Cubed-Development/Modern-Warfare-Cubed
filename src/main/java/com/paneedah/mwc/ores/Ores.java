package com.paneedah.mwc.ores;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.misc.*;
import com.paneedah.mwc.resources.ItemSulfurDust;
import com.paneedah.mwc.resources.ItemTinIngot;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.crafting.items.CraftingItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class Ores {

    public static final String DUST_SULFUR = "dustSulfur";
    public static final String INGOT_STEEL = "ingotSteel";
    public static final String INGOT_COPPER = "ingotCopper";
    public static final String INGOT_TIN = "ingotTin";
    public static final String INGOT_LEAD = "ingotLead";

    public static Block LeadOre;
    public static Item LeadIngot;
    
    public static Block CopperOre;
    public static Item CopperIngot;

    public static Block GraphiteOre;
    public static Item GraphiteChunk;
    
    public static Block TinOre;
    public static Item TinIngot;
    
    public static Block SulfurOre;
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
        LeadOre = new BlockLeadOre();
        LeadIngot = new ItemLeadIngot();

        CopperOre = new BlockCopperOre();
        CopperIngot = new ItemCopperIngot();
        
        GraphiteOre = new BlockGraphiteOre();
        GraphiteChunk = new ItemGraphiteChunk();

        TinOre = new BlockTinOre();
        TinIngot = new ItemTinIngot();

        SulfurOre = new BlockSulfurOre();
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
        
        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, LeadOre, "LeadOre");
        compatibility.registerItem(LeadIngot, "leadingot");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, CopperOre, "CopperOre");
        compatibility.registerItem(CopperIngot, "CopperIngot");
        
        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, GraphiteOre, "GraphiteOre");
        compatibility.registerItem(GraphiteChunk, "GraphiteChunk");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, TinOre, "TinOre");
        compatibility.registerItem(TinIngot, "TinIngot");

        compatibility.registerBlock(ModernWarfareMod.MOD_CONTEXT, SulfurOre, "SulfurOre");
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
