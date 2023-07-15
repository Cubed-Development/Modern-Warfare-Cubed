package com.paneedah.mwc.proxies;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.PlayerAnimations;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.Workbench;
import com.paneedah.mwc.utils.ModReference;
import com.paneedah.mwc.utils.OptiNotFine;
import com.paneedah.mwc.wearables.Armors;
import com.paneedah.weaponlib.crafting.ammopress.TESRAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.model.AmmoPress;
import com.paneedah.weaponlib.crafting.workbench.TESRWorkbench;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.weaponlib.inventory.BackpackInventoryTab;
import com.paneedah.weaponlib.inventory.CustomPlayerInventoryTab;
import com.paneedah.weaponlib.inventory.InventoryTabs;
import com.paneedah.weaponlib.inventory.StandardPlayerInventoryTab;
import com.paneedah.weaponlib.render.CustomArmorLayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

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
    public void preInit(final MWC mod) {
        super.preInit(mod);

        final InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.registerTab(new StandardPlayerInventoryTab());
        inventoryTabs.registerTab(new CustomPlayerInventoryTab(MWC.modContext, MWCItems.vestRender));
        inventoryTabs.registerTab(new BackpackInventoryTab(MWC.modContext));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench.class, new TESRWorkbench(new Workbench(), new ResourceLocation(ModReference.ID + ":textures/blocks/workbench.png")));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmmoPress.class, new TESRAmmoPress(new AmmoPress(), new ResourceLocation(ModReference.ID + ":textures/blocks/ammo_press.png")));
    }

    @Override
    public void init(final MWC mod) {
        super.init(mod);

        PlayerAnimations.init(mod);

        final ItemModelMesher modelMesher = mc.getRenderItem().getItemModelMesher();

        modelMesher.register(Armors.Marineboots, 0, new ModelResourceLocation(ModReference.ID + ":marine_boots", "inventory"));
        modelMesher.register(Armors.Marinechest, 0, new ModelResourceLocation(ModReference.ID + ":marine_chest", "inventory"));
        modelMesher.register(Armors.Marinehelmet, 0, new ModelResourceLocation(ModReference.ID + ":marine_helmet", "inventory"));

        modelMesher.register(Armors.Spetznazboots, 0, new ModelResourceLocation(ModReference.ID + ":spetznaz_boots", "inventory"));
        modelMesher.register(Armors.Spetznazchest, 0, new ModelResourceLocation(ModReference.ID + ":spetznaz_chest", "inventory"));
        modelMesher.register(Armors.Spetznazhelmet, 0, new ModelResourceLocation(ModReference.ID + ":spetznaz_helmet", "inventory"));

        modelMesher.register(Armors.Urbanboots, 0, new ModelResourceLocation(ModReference.ID + ":urban_boots", "inventory"));
        modelMesher.register(Armors.Urbanchest, 0, new ModelResourceLocation(ModReference.ID + ":urban_chest", "inventory"));
        modelMesher.register(Armors.Urbanhelmet, 0, new ModelResourceLocation(ModReference.ID + ":urban_helmet", "inventory"));

        modelMesher.register(Armors.Ghilliehelmet, 0, new ModelResourceLocation(ModReference.ID + ":ghillie_helmet", "inventory"));
        modelMesher.register(Armors.Ghilliechest, 0, new ModelResourceLocation(ModReference.ID + ":ghillie_chest", "inventory"));
        modelMesher.register(Armors.Ghillieboots, 0, new ModelResourceLocation(ModReference.ID + ":ghillie_boots", "inventory"));

        modelMesher.register(Armors.Blackcamochest, 0, new ModelResourceLocation(ModReference.ID + ":blackcamo_chest", "inventory"));
        modelMesher.register(Armors.Forestchest, 0, new ModelResourceLocation(ModReference.ID + ":forest_chest", "inventory"));

        modelMesher.register(Armors.BlackJeansboots, 0, new ModelResourceLocation(ModReference.ID + ":blackjeans_boots", "inventory"));
        modelMesher.register(Armors.KhakiJeansboots, 0, new ModelResourceLocation(ModReference.ID + ":khakijeans_boots", "inventory"));

        modelMesher.register(Armors.Swatboots, 0, new ModelResourceLocation(ModReference.ID + ":swat_boots", "inventory"));
        modelMesher.register(Armors.Swatchest, 0, new ModelResourceLocation(ModReference.ID + ":swat_chest", "inventory"));
        modelMesher.register(Armors.Swathelmet, 0, new ModelResourceLocation(ModReference.ID + ":swat_helmet", "inventory"));

        modelMesher.register(Armors.Santaboots, 0, new ModelResourceLocation(ModReference.ID + ":santa_boots", "inventory"));
        modelMesher.register(Armors.Santachest, 0, new ModelResourceLocation(ModReference.ID + ":santa_chest", "inventory"));
        modelMesher.register(Armors.Santahelmet, 0, new ModelResourceLocation(ModReference.ID + ":santa_helmet", "inventory"));

        modelMesher.register(Armors.NaziSantaboots, 0, new ModelResourceLocation(ModReference.ID + ":nazisanta_boots", "inventory"));
        modelMesher.register(Armors.NaziSantachest, 0, new ModelResourceLocation(ModReference.ID + ":nazisanta_chest", "inventory"));
        modelMesher.register(Armors.NaziSantahelmet, 0, new ModelResourceLocation(ModReference.ID + ":nazisanta_helmet", "inventory"));

        modelMesher.register(Armors.SpecOpsboots, 0, new ModelResourceLocation(ModReference.ID + ":spec_ops_boots", "inventory"));
        modelMesher.register(Armors.SpecOpschest, 0, new ModelResourceLocation(ModReference.ID + ":spec_ops_chest", "inventory"));
        modelMesher.register(Armors.SpecOpshelmet, 0, new ModelResourceLocation(ModReference.ID + ":spec_ops_helmet", "inventory"));

        modelMesher.register(Armors.Juggernautboots, 0, new ModelResourceLocation(ModReference.ID + ":juggernaut_boots", "inventory"));
        modelMesher.register(Armors.Juggernautchest, 0, new ModelResourceLocation(ModReference.ID + ":juggernaut_chest", "inventory"));
        modelMesher.register(Armors.Juggernauthelmet, 0, new ModelResourceLocation(ModReference.ID + ":juggernaut_helmet", "inventory"));

        modelMesher.register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ModReference.ID + ":tactical_helmet", "inventory"));

        modelMesher.register(Armors.JPNVG18helmet, 0, new ModelResourceLocation(ModReference.ID + ":jpnvg18_helmet", "inventory"));

        modelMesher.register(Armors.GasMaskM40, 0, new ModelResourceLocation(ModReference.ID + ":m40gasmask_helmet", "inventory"));

        // Todo: Actually remove this once fixed.
        
        if (ForgeModContainer.allowEmissiveItems)
            ForgeModContainer.allowEmissiveItems = false;

        if (OptiNotFine.isOptiFineInstalled())
            MinecraftForge.EVENT_BUS.register(OptiNotFine.class);
    }

    @Override
    public void postInit(final MWC mod, final FMLPostInitializationEvent initializationEvent) {
        mc.getRenderManager().getSkinMap().forEach((p, r) -> r.addLayer(new CustomArmorLayer(r)));
    }
}
