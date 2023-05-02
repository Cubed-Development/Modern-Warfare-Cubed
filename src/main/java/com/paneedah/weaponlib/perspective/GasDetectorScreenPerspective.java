package com.paneedah.weaponlib.perspective;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class GasDetectorScreenPerspective extends ScreenPerspective {

    @Override
    protected void drawScreen() {
        float fontScale = 11f;
        FontRenderer fontRender = compatibility.getFontRenderer();
        int color = 0xAAAA07;

        GL11.glScalef(fontScale, fontScale, fontScale);

        String message = getMessage();
        fontRender.drawString(message, 5 + (int) (10f / fontScale), 5 + (int) ((10f) / fontScale), color, false);
    }

    private String getMessage() {
        float dose = 0f;
        ItemStack itemStack = compatibility.getHeldItemMainHand(compatibility.clientPlayer());
        if (itemStack != null) {
            NBTTagCompound nbt = compatibility.getTagCompound(itemStack);
            if (nbt != null) {
                dose = nbt.getFloat("dose");
            }
        }
        String message = String.format("%5.3f", dose);
        if (message.length() > 6) {
            message = message.substring(0, 6);
        }
        return message;
    }
}
