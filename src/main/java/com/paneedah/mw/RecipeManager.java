package com.paneedah.mw;

import com.paneedah.mw.ores.Ores;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class RecipeManager {

    public static void init(ModContext modContext) {

        compatibility.addSmelting(Ores.CopperOre, new ItemStack(Ores.CopperIngot), 5f);
        compatibility.addSmelting(Ores.LeadOre, new ItemStack(Ores.LeadIngot), 5f);
        compatibility.addSmelting(Ores.TinOre, new ItemStack(Ores.TinIngot), 5f);
        compatibility.addSmelting(Ores.GunmetalComposite, new ItemStack(Ores.GunmetalIngot), 5f);
        compatibility.addSmelting(Ores.SulfurDust, compatibility.createItemStack(CompatibleItems.GUNPOWDER, 1, 0), 5f);
        compatibility.addSmelting(Ores.SteelDust, new ItemStack(Ores.SteelIngot), 1f);
        compatibility.addSmelting(Items.COAL, new ItemStack(Ores.GraphiteChunk), 3f);

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.GunmetalComposite, 6),
                "XXX",
                "FFF",
                'X', Ores.INGOT_COPPER,
                'F', Ores.INGOT_TIN
        );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.GunmetalPlate, 2),
                "XXX",
                "XXX",
                'X', Ores.GunmetalIngot
        );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SteelDust, 2),
                " X ",
                "XAX",
                " X ",
                'X', CompatibleItems.COAL,
                'A', CompatibleItems.IRON_INGOT
        );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.CarbonComposite, 3),
                "XXX",
                "XXX",
                'X', Ores.GraphiteChunk
        );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SyntheticPolymerComposite, 3),
                "XXX",
                "XXX",
                'X', Ores.CarbonComposite
        );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.SyntheticPlastic, 4),
                "FF",
                "XX",
                'F', Ores.SyntheticPolymerComposite,
                'X', Items.STRING
        );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.CarbonFiber, 6),
                "FF",
                "XA",
                'F', Ores.SyntheticPolymerComposite,
                'X', Ores.SyntheticPlastic,
                'A', Ores.INGOT_STEEL
        );

        /*
        modContext.getRecipeManager().registerShapedRecipe(Armors.Tacticalhelmet,
                "AXA",
                "A A",
                'A', CommonProxy.SteelPlate,
                'X', CommonProxy.ElectronicCircuitBoard);

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(, 6),
                "XXX",
                "FFF",
                'X', Ores.INGOT_COPPER,
                'F', Ores.INGOT_TIN
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(, 1),
                "FFF",
                "XXX",
                'F', Ores.SyntheticPolymerComposite,
                'X', Ores.CarbonFiber
                );

        modContext.getRecipeManager().registerShapedRecipe(new ItemStack(Ores.PlasticPlate, 1),
                "XXX",
                'X', Ores.SyntheticPlastic
                );
         */
    }
}
