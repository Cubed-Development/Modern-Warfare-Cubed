package com.paneedah.weaponlib.perspective;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

public class GasDetectorScreenPerspective extends ScreenPerspective {

    @Override
    protected void drawScreen() {
        float fontScale = 11f;
        FontRenderer fontRender = MC.fontRenderer;
        int color = 0xAAAA07;

        GL11.glScalef(fontScale, fontScale, fontScale);

        String message = getMessage();
        fontRender.drawString(message, 5 + 0, 5 + 0, color, false);
    }

    private String getMessage() {
        float dose = 0f;
        ItemStack itemStack = MC.player.getHeldItemMainhand();
        NBTTagCompound nbt = itemStack.getTagCompound();
        if (nbt != null) {
            dose = nbt.getFloat("dose");
        }
        String message = String.format("%5.3f", Float.valueOf(dose));
        if (message.length() > 6) {
            message = message.substring(0, 6);
        }
        return message;
    }
}
