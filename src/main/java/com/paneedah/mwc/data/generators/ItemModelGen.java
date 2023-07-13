package com.paneedah.mwc.data.generators;

import com.paneedah.mwc.ModernWarfareCubed;
import com.paneedah.mwc.client.ModRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModelGen extends ItemModelProvider {
    public ItemModelGen(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ModernWarfareCubed.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // Ingots
        includeItem(ModRegistry.GUNMETAL_INGOT);
        includeItem(ModRegistry.ALUMINUM_INGOT);
        includeItem(ModRegistry.LEAD_INGOT);
        includeItem(ModRegistry.STEEL_INGOT);
        includeItem(ModRegistry.OBSENUM_INGOT);
        includeItem(ModRegistry.URANIUM_INGOT);
        includeItem(ModRegistry.TITANIUM_INGOT);
        includeItem(ModRegistry.TUNGSTEN_INGOT);

        // Nuggets
        includeItem(ModRegistry.GUNMETAL_NUGGET);
        includeItem(ModRegistry.ALUMINUM_NUGGET);
        includeItem(ModRegistry.LEAD_NUGGET);
        includeItem(ModRegistry.STEEL_NUGGET);
        includeItem(ModRegistry.OBSENUM_NUGGET);
        includeItem(ModRegistry.URANIUM_NUGGET);
        includeItem(ModRegistry.TITANIUM_NUGGET);
        includeItem(ModRegistry.TUNGSTEN_NUGGET);

        // Plates
        includeItem(ModRegistry.GUNMETAL_PLATE);
        includeItem(ModRegistry.ALUMINUM_PLATE);
        includeItem(ModRegistry.LEAD_PLATE);
        includeItem(ModRegistry.STEEL_PLATE);
        includeItem(ModRegistry.OBSENUM_PLATE);
        includeItem(ModRegistry.URANIUM_PLATE);
        includeItem(ModRegistry.TITANIUM_PLATE);
        includeItem(ModRegistry.TUNGSTEN_PLATE);

        // Raws
        includeItem(ModRegistry.RAW_ALUMINUM);
        includeItem(ModRegistry.RAW_LEAD);
        includeItem(ModRegistry.RAW_POTASSIUM);
        includeItem(ModRegistry.RAW_TITANIUM);
        includeItem(ModRegistry.RAW_TUNGSTEN);
        includeItem(ModRegistry.RAW_URANIUM);

        // Others
        includeItem(ModRegistry.SULFUR);
        includeItem(ModRegistry.SALT_PETER);
        includeItem(ModRegistry.KEVLAR);
        includeItem(ModRegistry.SYNTHETIC_PLASTIC);
        includeItem(ModRegistry.SYNTHETIC_POLYMER_COMPOSITE);
        includeItem(ModRegistry.LENS);
        includeItem(ModRegistry.GRAPHITE);

        // Tools
        includeItem(ModRegistry.STIMPAK);
        includeItem(ModRegistry.EMPTY_SYRINGE);
    }

    private ItemModelBuilder includeItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ModernWarfareCubed.MOD_ID,"item/"+ item.getId().getPath()));
    }
}
