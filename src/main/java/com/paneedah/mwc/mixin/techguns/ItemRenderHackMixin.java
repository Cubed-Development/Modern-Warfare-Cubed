package com.paneedah.mwc.mixin.techguns;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import techguns.client.render.ItemRenderHack;

/**
 * @author Luna Lage (Desoroxxx)
 * @since 0.1
 */
@SideOnly(Side.CLIENT)
@Mixin(ItemRenderHack.class)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ItemRenderHackMixin {

    @Inject(method = "renderItem", at = @At(value = "HEAD"), remap = false, cancellable = true)
    private static void fixRenderItem(final ItemStack itemStack, final EntityLivingBase entityLivingBase, final ItemCameraTransforms.TransformType transform, final boolean leftHanded, final CallbackInfoReturnable<Boolean> callbackInfo) {
        if (entityLivingBase == null) {
            callbackInfo.setReturnValue(Boolean.FALSE);
        }
    }
}
