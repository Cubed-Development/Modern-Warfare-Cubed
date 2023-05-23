package com.paneedah.weaponlib;

import com.paneedah.weaponlib.SpreadableExposure.Blackout;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import com.paneedah.weaponlib.shader.DynamicShaderGroupSource;
import com.paneedah.weaponlib.shader.DynamicShaderGroupSourceProvider;
import com.paneedah.weaponlib.shader.DynamicShaderPhase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;

import java.util.UUID;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

class PipelineShaderGroupSourceProvider implements DynamicShaderGroupSourceProvider {
    
    private boolean flashEnabled;
    private boolean nightVisionEnabled;
    private boolean blurEnabled;
    private boolean vignetteEnabled;
    private float sepiaRatio;
    private float spreadableExposureProgress;
    private float vignetteRadius;
    private float brightness;
    private SpreadableExposure spreadableExposure;
    private LightExposure lightExposure;
    private float colorImpairmentR;
    private float colorImpairmentG;
    private float colorImpairmentB;
    	    
    final DynamicShaderGroupSource source = new DynamicShaderGroupSource(UUID.randomUUID(),
            new ResourceLocation("weaponlib:/com/paneedah/weaponlib/resources/post-processing-pipeline.json"))
                .withUniform("NightVisionEnabled", context -> nightVisionEnabled ? 1.0f : 0.0f)
                .withUniform("BlurEnabled", context -> blurEnabled ? 1.0f : 0.0f)
                .withUniform("BlurVignetteRadius", context -> 0.0f)
                .withUniform("Radius", context -> 10f)
                .withUniform("sussus", context -> 10f)
                .withUniform("Progress", context -> spreadableExposureProgress)
                .withUniform("VignetteEnabled", context -> vignetteEnabled ? 1.0f : 0.0f)
                .withUniform("VignetteRadius", context -> vignetteRadius)
                .withUniform("Brightness", context -> brightness)
                .withUniform("SepiaRatio", context -> sepiaRatio)
                .withUniform("SepiaColor", context -> new float[] {colorImpairmentR, colorImpairmentG, colorImpairmentB})
                .withUniform("IntensityAdjust", context -> 40f - mc.gameSettings.gammaSetting * 38)
                .withUniform("NoiseAmplification", context ->  2f + 3f * mc.gameSettings.gammaSetting);
    
    @Override
    public DynamicShaderGroupSource getShaderSource(DynamicShaderPhase phase) {
        lightExposure = CompatibleExposureCapability.getExposure(mc.player, LightExposure.class);
        spreadableExposure = CompatibleExposureCapability.getExposure(mc.player, SpreadableExposure.class);
        spreadableExposureProgress = MiscUtils.smoothstep(0, 1, spreadableExposure != null ? spreadableExposure.getTotalDose() : 0f);
        updateNightVision();
        updateVignette();
        updateBlur();
        updateSepia();
        updateBrightness();
        spreadableExposure = null;
        lightExposure = null;
        return nightVisionEnabled || blurEnabled || vignetteEnabled || sepiaRatio > 0 || flashEnabled ?
                source : null;
    }
    
    private void updateBrightness() {
        brightness = 1f;

//        System.out.println("Hello");
        long worldTime = mc.player.world.getWorldTime();
//        System.out.println("Day brightness: " + dayBrightness + ", time: " + (worldTime % 24000));
        if(lightExposure != null && lightExposure.getTotalDose() > 0.0003f) { //lightExposure.isEffective(compatibility.world(mc.player))) {
            flashEnabled = true;
            float dayBrightness = (MathHelper.sin( (float)Math.PI * 2 * (float)(worldTime % 24000 - 24000f) / 24000f) + 1f) / 2f;
//            dayBrightness *= dayBrightness;
            brightness = 1f + (100f + (1 - dayBrightness) * 100f) * lightExposure.getTotalDose() ;
//            System.out.println("Brightness: " + brightness);
        }
        
        if(spreadableExposure != null && !mc.player.isDead) {
            Blackout blackout = spreadableExposure.getBlackout();
            blackout.update();
            switch(blackout.getPhase()) {
            case ENTER:
                brightness = 1f - blackout.getEnterProgress();
                break;
            case EXIT:
                brightness = blackout.getExitProgress();
                break;
            case DARK:
                brightness = 0f;
                break;
            case NONE:
                brightness = 1f;
                break;
            }
        }
    }

    private void updateBlur() {
        blurEnabled = spreadableExposureProgress > 0.01f; // TODO: set min
    }

    private void updateVignette() {
        vignetteEnabled = nightVisionEnabled;
        ItemStack helmetStack = mc.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if(nightVisionEnabled && helmetStack != null && helmetStack.getItem() instanceof CustomArmor) {
            CustomArmor helmet = (CustomArmor)helmetStack.getItem();
            vignetteEnabled = helmet.isVignetteEnabled();
        }
        vignetteRadius = 0.55f;            
    }

    private void updateNightVision() {
        ItemStack helmetStack = mc.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        if(helmetStack != null) {
            NBTTagCompound tagCompound = helmetStack.getTagCompound();
            if(tagCompound != null) {
                nightVisionEnabled = tagCompound.getBoolean("nv");
            } else {
                nightVisionEnabled = false;
            }
        } else {
            nightVisionEnabled = false;
        }
    }
    
    private void updateSepia() {
        sepiaRatio = spreadableExposureProgress;
        if(spreadableExposure != null) {
            colorImpairmentR = spreadableExposure.getColorImpairmentR();
            colorImpairmentG = spreadableExposure.getColorImpairmentG();
            colorImpairmentB = spreadableExposure.getColorImpairmentB();
        }
    }

}
