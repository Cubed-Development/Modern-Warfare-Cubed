package com.paneedah.mwc.mixininterfaces;

import net.minecraft.client.shader.ShaderGroup;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Luna Lage (Desoroxxx)
 * @since 0.1
 */
@SideOnly(Side.CLIENT)
public interface IModernEntityRenderer {

    void mwc$setRenderHand(final boolean renderHand);

    boolean mwc$getRenderHand();

    void mwc$setPrepareTerrain(final boolean prepareTerrain);

    void mwc$setUseShader(final boolean useShader);

    void mwc$setShaderGroup(final ShaderGroup shaderGroup);
}
