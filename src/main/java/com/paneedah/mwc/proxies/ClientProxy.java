package com.paneedah.mwc.proxies;

import com.paneedah.mwc.ModernWarfareMod;
import com.paneedah.mwc.PlayerAnimations;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.Workbench;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.wearables.Armors;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleFmlInitializationEvent;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleFmlPreInitializationEvent;
import com.paneedah.mwc.weaponlib.crafting.ammopress.TESRAmmoPress;
import com.paneedah.mwc.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.mwc.weaponlib.crafting.ammopress.model.AmmoPress;
import com.paneedah.mwc.weaponlib.crafting.workbench.TESRWorkbench;
import com.paneedah.mwc.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.mwc.weaponlib.inventory.BackpackInventoryTab;
import com.paneedah.mwc.weaponlib.inventory.CustomPlayerInventoryTab;
import com.paneedah.mwc.weaponlib.inventory.InventoryTabs;
import com.paneedah.mwc.weaponlib.inventory.StandardPlayerInventoryTab;
import com.paneedah.mwc.weaponlib.render.CustomArmorLayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class ClientProxy extends CommonProxy {

    /**
     * Static final reference to the Minecraft Client instance.
     */
    public static final Minecraft mc = Minecraft.getMinecraft();

    @Override
    protected boolean isClient() {
        return true;
    }

    @Override
    public void preInit(final ModernWarfareMod mod, final CompatibleFmlPreInitializationEvent initializationEvent) {
        super.preInit(mod, initializationEvent);

        final InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.registerTab(new StandardPlayerInventoryTab());
        inventoryTabs.registerTab(new CustomPlayerInventoryTab(ModernWarfareMod.MOD_CONTEXT, MWCItems.vestRender));
        inventoryTabs.registerTab(new BackpackInventoryTab(ModernWarfareMod.MOD_CONTEXT));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench.class, new TESRWorkbench(new Workbench(), new ResourceLocation(ModReference.id + ":textures/blocks/workbench.png")));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmmoPress.class, new TESRAmmoPress(new AmmoPress(), new ResourceLocation(ModReference.id + ":textures/blocks/ammo_press.png")));
    }

    @Override
    public void init(final ModernWarfareMod mod, final CompatibleFmlInitializationEvent initializationEvent) {
        super.init(mod, initializationEvent);

        PlayerAnimations.init(mod, initializationEvent);

        final ItemModelMesher modelMesher = mc.getRenderItem().getItemModelMesher();

        modelMesher.register(Armors.Marineboots, 0, new ModelResourceLocation(ModReference.id + ":marine_boots", "inventory"));
        modelMesher.register(Armors.Marinechest, 0, new ModelResourceLocation(ModReference.id + ":marine_chest", "inventory"));
        modelMesher.register(Armors.Marinehelmet, 0, new ModelResourceLocation(ModReference.id + ":marine_helmet", "inventory"));

        modelMesher.register(Armors.Spetznazboots, 0, new ModelResourceLocation(ModReference.id + ":spetznaz_boots", "inventory"));
        modelMesher.register(Armors.Spetznazchest, 0, new ModelResourceLocation(ModReference.id + ":spetznaz_chest", "inventory"));
        modelMesher.register(Armors.Spetznazhelmet, 0, new ModelResourceLocation(ModReference.id + ":spetznaz_helmet", "inventory"));

        modelMesher.register(Armors.Urbanboots, 0, new ModelResourceLocation(ModReference.id + ":urban_boots", "inventory"));
        modelMesher.register(Armors.Urbanchest, 0, new ModelResourceLocation(ModReference.id + ":urban_chest", "inventory"));
        modelMesher.register(Armors.Urbanhelmet, 0, new ModelResourceLocation(ModReference.id + ":urban_helmet", "inventory"));

        modelMesher.register(Armors.Ghilliehelmet, 0, new ModelResourceLocation(ModReference.id + ":ghillie_helmet", "inventory"));
        modelMesher.register(Armors.Ghilliechest, 0, new ModelResourceLocation(ModReference.id + ":ghillie_chest", "inventory"));
        modelMesher.register(Armors.Ghillieboots, 0, new ModelResourceLocation(ModReference.id + ":ghillie_boots", "inventory"));

        modelMesher.register(Armors.Blackcamochest, 0, new ModelResourceLocation(ModReference.id + ":blackcamo_chest", "inventory"));
        modelMesher.register(Armors.Forestchest, 0, new ModelResourceLocation(ModReference.id + ":forest_chest", "inventory"));

        modelMesher.register(Armors.BlackJeansboots, 0, new ModelResourceLocation(ModReference.id + ":blackjeans_boots", "inventory"));
        modelMesher.register(Armors.KhakiJeansboots, 0, new ModelResourceLocation(ModReference.id + ":khakijeans_boots", "inventory"));

        modelMesher.register(Armors.Swatboots, 0, new ModelResourceLocation(ModReference.id + ":swat_boots", "inventory"));
        modelMesher.register(Armors.Swatchest, 0, new ModelResourceLocation(ModReference.id + ":swat_chest", "inventory"));
        modelMesher.register(Armors.Swathelmet, 0, new ModelResourceLocation(ModReference.id + ":swat_helmet", "inventory"));

        modelMesher.register(Armors.Santaboots, 0, new ModelResourceLocation(ModReference.id + ":santa_boots", "inventory"));
        modelMesher.register(Armors.Santachest, 0, new ModelResourceLocation(ModReference.id + ":santa_chest", "inventory"));
        modelMesher.register(Armors.Santahelmet, 0, new ModelResourceLocation(ModReference.id + ":santa_helmet", "inventory"));

        modelMesher.register(Armors.NaziSantaboots, 0, new ModelResourceLocation(ModReference.id + ":nazisanta_boots", "inventory"));
        modelMesher.register(Armors.NaziSantachest, 0, new ModelResourceLocation(ModReference.id + ":nazisanta_chest", "inventory"));
        modelMesher.register(Armors.NaziSantahelmet, 0, new ModelResourceLocation(ModReference.id + ":nazisanta_helmet", "inventory"));

        modelMesher.register(Armors.SpecOpsboots, 0, new ModelResourceLocation(ModReference.id + ":spec_ops_boots", "inventory"));
        modelMesher.register(Armors.SpecOpschest, 0, new ModelResourceLocation(ModReference.id + ":spec_ops_chest", "inventory"));
        modelMesher.register(Armors.SpecOpshelmet, 0, new ModelResourceLocation(ModReference.id + ":spec_ops_helmet", "inventory"));

        modelMesher.register(Armors.Juggernautboots, 0, new ModelResourceLocation(ModReference.id + ":juggernaut_boots", "inventory"));
        modelMesher.register(Armors.Juggernautchest, 0, new ModelResourceLocation(ModReference.id + ":juggernaut_chest", "inventory"));
        modelMesher.register(Armors.Juggernauthelmet, 0, new ModelResourceLocation(ModReference.id + ":juggernaut_helmet", "inventory"));

        modelMesher.register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ModReference.id + ":tactical_helmet", "inventory"));

        modelMesher.register(Armors.JPNVG18helmet, 0, new ModelResourceLocation(ModReference.id + ":jpnvg18_helmet", "inventory"));

        modelMesher.register(Armors.GasMaskM40, 0, new ModelResourceLocation(ModReference.id + ":m40gasmask_helmet", "inventory"));

        // Todo: Actually remove this once fixed.
        
        if (ForgeModContainer.allowEmissiveItems)
            ForgeModContainer.allowEmissiveItems = false;
    }

    @Override
    public void postInit(final ModernWarfareMod mod, final FMLPostInitializationEvent initializationEvent) {
        mc.getRenderManager().getSkinMap().forEach((p, r) -> r.addLayer(new CustomArmorLayer(r)));
    }
}
