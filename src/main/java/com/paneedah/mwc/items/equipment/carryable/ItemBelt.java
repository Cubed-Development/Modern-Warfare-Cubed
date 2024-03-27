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
import static com.paneedah.mwc.utils.ModReference.ID;

/**
 * @author Luna Lage (Desoroxxx)
 * @since
 */
public class ItemBelt extends ItemCarryable {

    public static class Builder extends ItemCarryable.Builder<ItemBelt.Builder> {

        @Override
        protected ItemBelt.Builder self() {
            return this;
        }

        @Override
        public ItemBelt build() {
            validateInput();

            ResourceLocation guiTexture = new ResourceLocation(ID, "textures/gui/inventory/carryable/" + size + "slots.png");

            ItemBelt itemBelt = new ItemBelt(size, validItemPredicate, guiTexture, this.guiTextureWidth, modelName, textureName);

            itemBelt.setTranslationKey(LangUtil.format(name)).setCreativeTab(MWC.EQUIPMENT_TAB);

            // Register hook
            CraftingRegistry.registerHook(itemBelt);

            MWC.modContext.registerRenderableItem(name, itemBelt, FMLCommonHandler.instance().getSide() == Side.CLIENT ? new StaticModelSourceRenderer(transforms) : null);

            COOKING_QUEUE.add(itemBelt);

            return itemBelt;
        }
    }

    public ItemBelt(int size, Predicate<Item> validItemPredicate, ResourceLocation guiTextureLocation, int guiTextureWidth, String modelName, String textureName) {
        super(size, validItemPredicate, guiTextureLocation, guiTextureWidth, modelName, textureName);
    }
}
