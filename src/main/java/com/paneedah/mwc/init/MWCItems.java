package com.paneedah.mwc.init;

import com.paneedah.mwc.bases.ItemBase;
import com.paneedah.mwc.bases.ManufacturingItemBase;
import com.paneedah.mwc.utils.ModReference;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber(modid = ModReference.ID)
public class MWCItems {

    //Ingots
    public static ItemBase copperIngot;
    public static ItemBase tinIngot;
    public static ItemBase leadIngot;

    //Dusts
    public static ItemBase sulfurDust;
    public static ItemBase steelDust;
    public static ItemBase graphiteChunk;

    //Misc Items
    public static ItemBase gunmetalComposite;
    public static ItemBase carbonFiber;
    public static ItemBase syntheticPolymerComposite;
    public static ItemBase syntheticPlastic;


    //Items used in the custom crafting table
    public static ManufacturingItemBase steelIngot;
    public static ManufacturingItemBase gunmetalIngot;
    public static ManufacturingItemBase gunmetalPlate;
    public static ManufacturingItemBase carbonComposite;

    //Render...?
    public static ItemBase vestRender;

    public static ItemBase[] items;

    public static void init() {
        copperIngot = new ItemBase("copper_ingot");
        copperIngot.setOreDict("ingotCopper");

        tinIngot = new ItemBase("tin_ingot");
        tinIngot.setOreDict("ingotTin");

        leadIngot = new ItemBase("lead_ingot");
        leadIngot.setOreDict("ingotLead");

        sulfurDust = new ItemBase("sulfur_dust");
        sulfurDust.setOreDict(new String[]{"dustSulfur", "gunpowder"}); // Set the sulfur as gunpowder directly, instead of having to smelt it; just remove the gunpowder oredict to fix.

        steelDust = new ItemBase("steel_dust");
        steelDust.setOreDict("dustSteel");

        graphiteChunk = new ItemBase("graphite_chunk");
        graphiteChunk.setOreDict(new String[]{"dustGraphite", "dustCharcoal"});

        gunmetalComposite = new ItemBase("gunmetal_composite");
        gunmetalComposite.setOreDict("compositeGunmetal");

        carbonFiber = new ItemBase("carbon_fiber");
        carbonFiber.setOreDict("fiberCarbon"); // Not sure about this one

        syntheticPolymerComposite = new ItemBase("synthetic_polymer_composite");
        syntheticPolymerComposite.setOreDict(new String[]{"compositePolymerSynthetic", "Nylon"});

        // Since there are no other plastics
        syntheticPlastic = new ItemBase("synthetic_plastic");
        syntheticPlastic.setOreDict("plastic");

        gunmetalIngot = new ManufacturingItemBase("gunmetal_ingot");
        gunmetalIngot.setOreDict("ingotGunmetal");
        gunmetalIngot.setRecoveryChance(.3);

        steelIngot = new ManufacturingItemBase("steel_ingot");
        steelIngot.setOreDict("ingotSteel");
        steelIngot.setRecoveryChance(.3);

        gunmetalPlate = new ManufacturingItemBase("gunmetal_plate");
        gunmetalPlate.setOreDict("plateGunmetal");
        gunmetalPlate.setRecoveryChance(.3);

        carbonComposite = new ManufacturingItemBase("carbon_composite");
        carbonComposite.setOreDict("compositeCarbon");
        carbonComposite.setRecoveryChance(.3);

        vestRender = (ItemBase) new ItemBase("vest_render").setCreativeTab(null);

        items = new ItemBase[] {
                copperIngot,
                tinIngot,
                leadIngot,
                sulfurDust,
                steelDust,
                graphiteChunk,
                gunmetalComposite,
                carbonFiber,
                syntheticPolymerComposite,
                syntheticPlastic,
                steelIngot,
                gunmetalIngot,
                gunmetalPlate,
                carbonComposite,
                vestRender
        };
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> itemRegistryEvent) {
        //init();
        itemRegistryEvent.getRegistry().registerAll(items);
        registerOreDictionaryKeys(items);
    }

    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent modelRegistryEvent) {
        for (ItemBase item : items)
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

    static void registerOreDictionaryKeys(ItemBase[] items){
        for (ItemBase item : items) {
            String[] oreDictKeys = item.getOreDictKeys();

            if(oreDictKeys == null)
                continue;

            for (String oreDictKey : oreDictKeys)
                OreDictionary.registerOre(oreDictKey, item);
        }
    }
}
