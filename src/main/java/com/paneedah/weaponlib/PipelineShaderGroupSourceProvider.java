package com.paneedah.weaponlib;

import com.paneedah.mwc.network.handlers.NightVisionToggleMessageHandler;
import com.paneedah.weaponlib.SpreadableExposure.Blackout;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.MathHelper;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

class PipelineShaderGroupSourceProvider {

    private boolean nightVisionEnabled;
    private boolean blurEnabled;
    private boolean vignetteEnabled;
    private float sepiaRatio;
    private float spreadableExposureProgress;
    private float vignetteRadius;
    private SpreadableExposure spreadableExposure;
    private float colorImpairmentR;
    private float colorImpairmentG;
    private float colorImpairmentB;

    private void updateBlur() {
        blurEnabled = spreadableExposureProgress > 0.01f; // TODO: set min
    }

    private void updateVignette() {
        vignetteEnabled = nightVisionEnabled;
        ItemStack helmetStack = MC.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if (nightVisionEnabled && helmetStack != null && helmetStack.getItem() instanceof CustomArmor) {
            CustomArmor helmet = (CustomArmor) helmetStack.getItem();
            vignetteEnabled = helmet.isVignetteEnabled();
        }
        vignetteRadius = 0.55f;
    }

    private void updateNightVision() {
        ItemStack helmetStack = MC.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if (helmetStack != null) {
            NBTTagCompound tagCompound = helmetStack.getTagCompound();
            if (tagCompound != null) {
                nightVisionEnabled = tagCompound.getBoolean(NightVisionToggleMessageHandler.TAG_NIGHT_VISION_STATE);
            } else {
                nightVisionEnabled = false;
            }
        } else {
            nightVisionEnabled = false;
        }
    }

    private void updateSepia() {
        sepiaRatio = spreadableExposureProgress;
        if (spreadableExposure != null) {
            colorImpairmentR = spreadableExposure.getColorImpairmentR();
            colorImpairmentG = spreadableExposure.getColorImpairmentG();
            colorImpairmentB = spreadableExposure.getColorImpairmentB();
        }
    }

}
