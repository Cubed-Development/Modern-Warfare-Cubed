package com.paneedah.mwc.proxies;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.equipment.Armors;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.Workbench;
import com.paneedah.mwc.renderer.EquipmentRenderer;
import com.paneedah.weaponlib.RenderingPhase;
import com.paneedah.weaponlib.crafting.ammopress.TESRAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.TileEntityAmmoPress;
import com.paneedah.weaponlib.crafting.ammopress.model.AmmoPress;
import com.paneedah.weaponlib.crafting.workbench.TESRWorkbench;
import com.paneedah.weaponlib.crafting.workbench.TileEntityWorkbench;
import com.paneedah.weaponlib.inventory.BackpackInventoryTab;
import com.paneedah.weaponlib.inventory.CustomPlayerInventoryTab;
import com.paneedah.weaponlib.inventory.InventoryTabs;
import com.paneedah.weaponlib.inventory.StandardPlayerInventoryTab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.ForgeModContainer;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.ProjectConstants.ID;

public class ClientProxy extends CommonProxy {

    /**
     * Static final reference to the Minecraft Client instance.
     */
    @SideOnly(Side.CLIENT)
    public static final Minecraft MC = Minecraft.getMinecraft();

    public static RenderingPhase renderingPhase;

    @Override
    public void preInit(final MWC mod) {
        super.preInit(mod);

        final InventoryTabs inventoryTabs = InventoryTabs.getInstance();

        inventoryTabs.registerTab(new StandardPlayerInventoryTab());
        inventoryTabs.registerTab(new CustomPlayerInventoryTab(MWC.modContext, MWCItems.vestRender));
        inventoryTabs.registerTab(new BackpackInventoryTab(MWC.modContext));

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWorkbench.class, new TESRWorkbench(new Workbench(), new ResourceLocation(ID + ":textures/blocks/workbench.png")));
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAmmoPress.class, new TESRAmmoPress(new AmmoPress(), new ResourceLocation(ID + ":textures/blocks/ammo_press.png")));
    }

    @Override
    public void init(final MWC mod) {
        super.init(mod);

        final ItemModelMesher modelMesher = MC.getRenderItem().getItemModelMesher();

        modelMesher.register(Armors.Marineboots, 0, new ModelResourceLocation(ID + ":marine_boots", "inventory"));
        modelMesher.register(Armors.Marinechest, 0, new ModelResourceLocation(ID + ":marine_chest", "inventory"));
        modelMesher.register(Armors.Marinehelmet, 0, new ModelResourceLocation(ID + ":marine_helmet", "inventory"));

        modelMesher.register(Armors.Spetznazboots, 0, new ModelResourceLocation(ID + ":spetznaz_boots", "inventory"));
        modelMesher.register(Armors.Spetznazchest, 0, new ModelResourceLocation(ID + ":spetznaz_chest", "inventory"));
        modelMesher.register(Armors.Spetznazhelmet, 0, new ModelResourceLocation(ID + ":spetznaz_helmet", "inventory"));

        modelMesher.register(Armors.Urbanboots, 0, new ModelResourceLocation(ID + ":urban_boots", "inventory"));
        modelMesher.register(Armors.Urbanchest, 0, new ModelResourceLocation(ID + ":urban_chest", "inventory"));
        modelMesher.register(Armors.Urbanhelmet, 0, new ModelResourceLocation(ID + ":urban_helmet", "inventory"));

        modelMesher.register(Armors.Ghilliehelmet, 0, new ModelResourceLocation(ID + ":ghillie_helmet", "inventory"));
        modelMesher.register(Armors.Ghilliechest, 0, new ModelResourceLocation(ID + ":ghillie_chest", "inventory"));
        modelMesher.register(Armors.Ghillieboots, 0, new ModelResourceLocation(ID + ":ghillie_boots", "inventory"));

        modelMesher.register(Armors.Blackcamochest, 0, new ModelResourceLocation(ID + ":blackcamo_chest", "inventory"));
        modelMesher.register(Armors.Forestchest, 0, new ModelResourceLocation(ID + ":forest_chest", "inventory"));

        modelMesher.register(Armors.BlackJeansboots, 0, new ModelResourceLocation(ID + ":blackjeans_boots", "inventory"));
        modelMesher.register(Armors.KhakiJeansboots, 0, new ModelResourceLocation(ID + ":khakijeans_boots", "inventory"));

        modelMesher.register(Armors.Swatboots, 0, new ModelResourceLocation(ID + ":swat_boots", "inventory"));
        modelMesher.register(Armors.Swatchest, 0, new ModelResourceLocation(ID + ":swat_chest", "inventory"));
        modelMesher.register(Armors.Swathelmet, 0, new ModelResourceLocation(ID + ":swat_helmet", "inventory"));

        modelMesher.register(Armors.Santaboots, 0, new ModelResourceLocation(ID + ":santa_boots", "inventory"));
        modelMesher.register(Armors.Santachest, 0, new ModelResourceLocation(ID + ":santa_chest", "inventory"));
        modelMesher.register(Armors.Santahelmet, 0, new ModelResourceLocation(ID + ":santa_helmet", "inventory"));

        modelMesher.register(Armors.NaziSantaboots, 0, new ModelResourceLocation(ID + ":nazisanta_boots", "inventory"));
        modelMesher.register(Armors.NaziSantachest, 0, new ModelResourceLocation(ID + ":nazisanta_chest", "inventory"));
        modelMesher.register(Armors.NaziSantahelmet, 0, new ModelResourceLocation(ID + ":nazisanta_helmet", "inventory"));

        modelMesher.register(Armors.SpecOpsboots, 0, new ModelResourceLocation(ID + ":spec_ops_boots", "inventory"));
        modelMesher.register(Armors.SpecOpschest, 0, new ModelResourceLocation(ID + ":spec_ops_chest", "inventory"));
        modelMesher.register(Armors.SpecOpshelmet, 0, new ModelResourceLocation(ID + ":spec_ops_helmet", "inventory"));

        modelMesher.register(Armors.Juggernautboots, 0, new ModelResourceLocation(ID + ":juggernaut_boots", "inventory"));
        modelMesher.register(Armors.Juggernautchest, 0, new ModelResourceLocation(ID + ":juggernaut_chest", "inventory"));
        modelMesher.register(Armors.Juggernauthelmet, 0, new ModelResourceLocation(ID + ":juggernaut_helmet", "inventory"));

        modelMesher.register(Armors.Tacticalhelmet, 0, new ModelResourceLocation(ID + ":tactical_helmet", "inventory"));

        modelMesher.register(Armors.JPNVG18helmet, 0, new ModelResourceLocation(ID + ":jpnvg18_helmet", "inventory"));

        modelMesher.register(Armors.GasMaskM40, 0, new ModelResourceLocation(ID + ":m40gasmask_helmet", "inventory"));

        // Todo: Actually remove this once fixed.

        try {
            if (ForgeModContainer.allowEmissiveItems) {
                ForgeModContainer.allowEmissiveItems = false;
            }
        } catch (NoSuchFieldError ignored) {
        }

        MC.getRenderManager().getSkinMap().forEach((model, playerRenderer) -> playerRenderer.addLayer(new EquipmentRenderer(playerRenderer)));
    }
}
