package com.paneedah.mwc.items.equipment.carryable;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.utils.LangUtil;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.Tuple;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.function.Predicate;

import static com.paneedah.mwc.utils.ModReference.ID;

public class ItemBackpack extends ItemCarryable {

    public static class Builder extends ItemCarryable.Builder<Builder> {

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public ItemBackpack build() {
            validateInput();

            ResourceLocation guiTexture = new ResourceLocation(ID, "textures/gui/inventory/carryable/" + size + "slots.png");

            ItemBackpack itemBackpack = new ItemBackpack(size, validItemPredicate, guiTexture, this.guiTextureWidth, model, textureName);

            itemBackpack.setTranslationKey(LangUtil.format(name)).setCreativeTab(MWC.EQUIPMENT_TAB);

            // Register hook
            CraftingRegistry.registerHook(itemBackpack);

            itemBackpack.customEquippedPositioning = customEquippedPositioning;

            MWC.modContext.registerRenderableItem(name, itemBackpack, FMLCommonHandler.instance().getSide() == Side.CLIENT ? RendererRegistrationHelper.registerRenderer(this) : null);

            return itemBackpack;
        }
    }

    public ItemBackpack(int size, Predicate<Item> validItemPredicate, ResourceLocation guiTextureLocation, int guiTextureWidth, ModelBiped model, String textureName) {
        super(size, validItemPredicate, guiTextureLocation, guiTextureWidth, model, textureName);
    }
}
