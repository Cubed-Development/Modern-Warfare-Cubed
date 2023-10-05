package com.paneedah.mwc.mixin;

import com.llamalad7.mixinextras.injector.WrapWithCondition;
import com.paneedah.mwc.mixininterfaces.IModernEntityRenderer;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@SideOnly(Side.CLIENT)
@Mixin(EntityRenderer.class)
public final class EntityRendererMixin implements IModernEntityRenderer {

    @Shadow private boolean useShader;
    @Shadow private ShaderGroup shaderGroup;

    @Unique private boolean mwc$prepareTerrain = true;
    @Unique private boolean mwc$renderHand = true;

    /**
     * Prevent everything from disabling the use of shaders allowing for flashbangs to work at all times.
     * <p>
     * TODO(Desoroxxx): We really need something for shaders, 1.12.2 needs it, it would be a godsend.
     */
    @Inject(method = "switchUseShader", at = @At(value = "HEAD"), cancellable = true)
    private void disableSwitchUseShader(CallbackInfo callbackInfo) {
        callbackInfo.cancel();
    }

    @WrapWithCondition(method = "renderWorldPass", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/RenderGlobal;setupTerrain(Lnet/minecraft/entity/Entity;DLnet/minecraft/client/renderer/culling/ICamera;IZ)V"))
    private boolean checkPrepareTerrain(final RenderGlobal renderGlobal, final Entity entity, final double partialTicks, final ICamera camera, final int frameCount, final boolean playerSpectator) {
        return mwc$prepareTerrain;
    }

    @WrapWithCondition(method = "updateRenderer", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;updateEquippedItem()V"))
    private boolean checkRenderHandToUpdateEquippedItem(final ItemRenderer itemRenderer) {
        return mwc$renderHand;
    }

    @WrapWithCondition(method = "renderHand", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/ItemRenderer;renderItemInFirstPerson(F)V"))
    private boolean checkRenderHand(final ItemRenderer itemRenderer, final float partialTicks) {
        return mwc$renderHand;
    }

    @Override
    public void mwc$setRenderHand(final boolean renderHand) {
        mwc$renderHand = renderHand;
    }

    @Override
    public boolean mwc$getRenderHand() {
        return mwc$renderHand;
    }

    @Override
    public void mwc$setPrepareTerrain(final boolean prepareTerrain) {
        mwc$prepareTerrain = prepareTerrain;
    }

    @Override
    public void mwc$setUseShader(final boolean useShader) {
        this.useShader = useShader;
    }

    @Override
    public void mwc$setShaderGroup(final ShaderGroup shaderGroup) {
        this.shaderGroup = shaderGroup;
    }
}
