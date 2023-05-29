package com.paneedah.weaponlib.compatibility;

import com.paneedah.weaponlib.ClassInfo;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class CompatibleClassInfoProvider {

    private static Map<String, ClassInfo> classInfoMap = new HashMap<>();

    static {
        
        classInfoMap.put("net/minecraft/client/renderer/EntityRenderer",
                new ClassInfo("net/minecraft/client/renderer/EntityRenderer", "buq")
                .addMethodInfo("hurtCameraEffect", "(F)V", "d")
                .addMethodInfo("setupCameraTransform", "(FI)V", "a")
                .addMethodInfo("setupViewBobbing", "applyBobbing", "(F)V", "e")
                .addMethodInfo2("updateCameraAndRender", "(FJ)V", "a", "(FJ)V")
                );
                
        classInfoMap.put("net/minecraft/client/model/ModelBiped", 
                new ClassInfo("net/minecraft/client/model/ModelBiped", "bpx")
                .addMethodInfo2("render", "(Lnet/minecraft/entity/Entity;FFFFFF)V", "a", "(Lvg;FFFFFF)V")
                .addMethodInfo2("postRenderArm", "(FLnet/minecraft/util/EnumHandSide;)V", "a", "(FLvo;)V")
                );
        
        classInfoMap.put("net/minecraft/client/model/ModelPlayer", 
                new ClassInfo("net/minecraft/client/model/ModelPlayer", "bqj")
                .addMethodInfo2("render", "(Lnet/minecraft/entity/Entity;FFFFFF)V", "a", "(Lvg;FFFFFF)V")
                );
        
        classInfoMap.put("net/minecraft/client/renderer/entity/RenderLivingBase", 
                new ClassInfo("net/minecraft/client/renderer/entity/RenderLivingBase", "caa")
                .addMethodInfo2("renderModel", "(Lnet/minecraft/entity/EntityLivingBase;FFFFFF)V", "a", "(Lvp;FFFFFF)V")
                .addMethodInfo2("getMainModel", "()Lnet/minecraft/client/model/ModelBase;", "b", "()Lbqf;")
                );
        
        classInfoMap.put("net/minecraft/client/model/ModelBase", 
                new ClassInfo("net/minecraft/client/model/ModelBase", "bqf")
                .addMethodInfo2("render", "(Lnet/minecraft/entity/Entity;FFFFFF)V", "a", "(Lvg;FFFFFF)V")
                );
        
        classInfoMap.put("net/minecraft/client/renderer/entity/layers/LayerArmorBase", 
                new ClassInfo("net/minecraft/client/renderer/entity/layers/LayerArmorBase", "cbp")
                .addMethodInfo2("renderArmorLayer", "(Lnet/minecraft/entity/EntityLivingBase;FFFFFFFLnet/minecraft/inventory/EntityEquipmentSlot;)V", "a", "(Lvp;FFFFFFFLvl;)V")
                );
        
        classInfoMap.put("net/minecraft/client/renderer/entity/layers/LayerHeldItem", 
                new ClassInfo("net/minecraft/client/renderer/entity/layers/LayerHeldItem", "ccc")
                .addMethodInfo2("renderHeldItem", "(Lnet/minecraft/entity/EntityLivingBase;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/renderer/block/model/ItemCameraTransforms$TransformType;Lnet/minecraft/util/EnumHandSide;)V", "a", "(Lvp;Laip;Lbwc$b;Lvo;)V")
                .addMethodInfo2("translateToHand", "(Lnet/minecraft/util/EnumHandSide;)V", "a", "(Lvo;)V")
                .addFieldInfo("livingEntityRenderer", "Lnet/minecraft/client/renderer/entity/RenderLivingBase;", "field_177206_a", "Lcaa;")
                );
        
        classInfoMap.put("net/minecraft/entity/player/EntityPlayer", 
                new ClassInfo("net/minecraft/entity/player/EntityPlayer", "aed")
                .addFieldInfo("inventory", "Lnet/minecraft/entity/player/InventoryPlayer;", "field_71071_by", "Laec;")
                );
        
        classInfoMap.put("net/minecraft/client/entity/EntityPlayerSP",
        		
        		new ClassInfo("net/minecraft/client/entity/EntityPlayerSP", "bud")
                //new ClassInfo("net/minecraft/client/entity/EntityPlayerSP", "bnn")
                .addMethodInfo2("isSneaking", "()Z", "aM", "()Z")
                .addMethodInfo2("updateEntityActionState", "()V", "cr", "()V")
                .addMethodInfo2("turn", "(FF)V", "c", "(FF)V")
                );
        //
        
        classInfoMap.put("net/minecraft/entity/player/EntityPlayerMP", 
                new ClassInfo("net/minecraft/entity/player/EntityPlayerMP", "oq")
                .addMethodInfo2("sendSlotContents", "(Lnet/minecraft/inventory/Container;ILnet/minecraft/item/ItemStack;)V", "a", "(Lafr;ILaip;)V")
                );
        
        classInfoMap.put("net/minecraft/advancements/critereon/InventoryChangeTrigger", 
                new ClassInfo("net/minecraft/advancements/critereon/InventoryChangeTrigger", "al")
                .addMethodInfo2("trigger", "(Lnet/minecraft/entity/player/EntityPlayerMP;Lnet/minecraft/entity/player/InventoryPlayer;)V", "a", "(Loq;Laec;)V")
                );
        
        classInfoMap.put("net/minecraft/entity/EntityLivingBase", 
                new ClassInfo("net/minecraft/entity/EntityLivingBase", "vp")
                .addMethodInfo2("attackEntityFrom", "(Lnet/minecraft/util/DamageSource;F)Z", "a", "(Lur;F)Z")
                .addMethodInfo2("knockBack", "(Lnet/minecraft/entity/Entity;FDD)V", "a", "(Lvg;FDD)V")
                );
        
        classInfoMap.put("net/minecraft/client/model/ModelRenderer", 
                new ClassInfo("net/minecraft/client/model/ModelRenderer", "brs")
                .addMethodInfo2("render", "(F)V", "a", "(F)V")
                .addFieldInfo("cubeList", "Lnet/minecraft/client/renderer/entity/RenderLivingBase;", "field_78804_l", "Lcaa;")
                );
        
        
        classInfoMap.put("paulscode.sound.libraries.SourceLWJGLOpenAL", 
        		new ClassInfo("paulscode.sound.libraries.SourceLWJGLOpenAL", "paulscode.sound.libraries.SourceLWJGLOpenAL")
        		.addMethodInfo("play", "(Lpaulscode/sound/Channel;)V", "play", "play")
        		);
        
        
    }

    private static CompatibleClassInfoProvider instance = new CompatibleClassInfoProvider();

    public static CompatibleClassInfoProvider getInstance() {
        return instance;
    }

    public ClassInfo getClassInfo(String mcpClassName) {
    	if(!mcpClassName.equals("paulscode.sound.libraries.SourceLWJGLOpenAL")) {
    		return classInfoMap.get(mcpClassName.replace('.', '/'));
    	} else return classInfoMap.get(mcpClassName);
        
    }

}
