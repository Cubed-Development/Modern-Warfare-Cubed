package com.paneedah.mwc.weaponlib.compatibility;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.item.ItemStack;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class CompatibleRenderItem {
        
    private RenderItem getRenderItem() {
        return mc.getRenderItem();
    }

    public void setZLevel(float zLevel) {
        getRenderItem().zLevel = zLevel;
    }

    public void renderItemAndEffectIntoGUI(FontRenderer fontRenderer, TextureManager renderEngine, ItemStack itemStack,
            int x, int y) {
        getRenderItem().renderItemAndEffectIntoGUI(itemStack, x, y);
    }

    public void renderItemOverlayIntoGUI(FontRenderer fontRenderer, TextureManager renderEngine, ItemStack itemStack,
            int x, int y) {
        getRenderItem().renderItemOverlays(fontRenderer, itemStack, x, y);
    }

    
}
