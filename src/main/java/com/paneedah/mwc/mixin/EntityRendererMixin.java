package com.paneedah.mwc.mixin;

import net.minecraft.client.renderer.EntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityRenderer.class)
public final class EntityRendererMixin {

    @Inject(method = "switchUseShader", at = @At(value = "HEAD"), cancellable = true)
    private void disableSwitchUseShader(CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }
}
