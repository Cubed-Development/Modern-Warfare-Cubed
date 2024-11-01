package com.paneedah.mwc.items.equipment.carryable;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.renderer.StaticModelSourceRenderer;
import com.paneedah.mwc.utils.LangUtil;
import com.paneedah.weaponlib.crafting.CraftingRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.relauncher.Side;

import java.util.function.Predicate;

import static com.paneedah.mwc.handlers.ClientEventHandler.COOKING_QUEUE;
import static com.paneedah.mwc.ProjectConstants.ID;

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

            ItemBackpack itemBackpack = new ItemBackpack(size, validItemPredicate, guiTexture, guiTextureWidth, modelName, textureName);

            itemBackpack.setTranslationKey(LangUtil.format(name)).setCreativeTab(MWC.EQUIPMENT_TAB);

            // Register hook
            CraftingRegistry.registerHook(itemBackpack);

            MWC.modContext.registerRenderableItem(name, itemBackpack, FMLCommonHandler.instance().getSide() == Side.CLIENT ? new StaticModelSourceRenderer(transforms) : null);

            if (FMLCommonHandler.instance().getSide().isClient()) {
                COOKING_QUEUE.add(itemBackpack);
            }

            return itemBackpack;
        }
    }

    public ItemBackpack(int size, Predicate<Item> validItemPredicate, ResourceLocation guiTextureLocation, int guiTextureWidth, String modelName, String textureName) {
        super(size, validItemPredicate, guiTextureLocation, guiTextureWidth, modelName, textureName);
    }
}
