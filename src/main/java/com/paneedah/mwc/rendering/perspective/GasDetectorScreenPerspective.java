package com.paneedah.mwc.rendering.perspective;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@SideOnly(Side.CLIENT)
public final class GasDetectorScreenPerspective extends ScreenPerspective {

    @Override
    protected void drawScreen() {
        final float fontScale = 11;

        GL11.glScalef(fontScale, fontScale, fontScale);

        MC.fontRenderer.drawString(getMessage(), 5 + (10 / fontScale), 5 + (10 / fontScale), 0xAAAA07, false);
    }

    private String getMessage() {
        float dose = 0;
        final NBTTagCompound nbt = MC.player.getHeldItemMainhand().getTagCompound();

        if (nbt != null)
            dose = nbt.getFloat("dose");

        String message = String.format("%5.3f", dose);
        if (message.length() > 6)
            message = message.substring(0, 6);

        return message;
    }
}
