package com.paneedah.mwc.mixin;

import com.paneedah.mwc.rendering.renderer.ModelSourceRenderer;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * @author Luna Lage (Desoroxxx)
 * @since 0.1
 */
@SideOnly(Side.CLIENT)
@Mixin(RenderItem.class)
public final class RenderItemMixin {

    @Inject(method = "renderModel(Lnet/minecraft/client/renderer/block/model/IBakedModel;ILnet/minecraft/item/ItemStack;)V", at = @At("HEAD"), cancellable = true)
    private void renderModelSource(final IBakedModel iBakedModel, final int color, final ItemStack itemStack, final CallbackInfo callbackInfo) {
        if (iBakedModel instanceof ModelSourceRenderer) {
            ((ModelSourceRenderer) iBakedModel).render();
            callbackInfo.cancel();
        }
    }
}
