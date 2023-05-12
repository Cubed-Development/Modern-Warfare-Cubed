package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Deprecated
public abstract class CompatibleInventoryTabs {

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void onGuiPostInit(GuiScreenEvent.InitGuiEvent.Post event) {
        guiPostInit(event.getGui());
    }

    protected abstract void guiPostInit(GuiScreen gui);
    
    protected int getPotionOffset() {
        return 0;
    }
}
