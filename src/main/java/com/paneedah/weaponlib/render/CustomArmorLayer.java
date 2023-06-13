package com.paneedah.weaponlib.render;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.ItemStorage;
import com.paneedah.weaponlib.ItemVest;
import com.paneedah.weaponlib.compatibility.CompatibleCustomPlayerInventoryCapability;
import com.paneedah.weaponlib.inventory.CustomPlayerInventory;
import com.paneedah.weaponlib.model.USMCVestTwo;
import com.paneedah.weaponlib.render.modelrepo.GearModelRepository;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class CustomArmorLayer implements LayerRenderer<EntityPlayer> {

	private final RenderLivingBase<?> renderer;

	public CustomArmorLayer(RenderLivingBase<?> rendererIn) {
		this.renderer = rendererIn;
	}

	@Override
	public void doRenderLayer(EntityPlayer entitylivingbaseIn, float limbSwing, float limbSwingAmount,
			float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		if (!(entitylivingbaseIn instanceof EntityPlayer))
			return;
		
	
    	
		
		this.renderEquipLayer(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw,
				headPitch, scale, 1);
		this.renderEquipLayer(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw,
				headPitch, scale, 2);
	}
	
	public static final USMCVestTwo modeld = new USMCVestTwo();

	private void renderEquipLayer(EntityPlayer player, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch, float scale, int index) {
        // Construction
        CustomPlayerInventory capability = CompatibleCustomPlayerInventoryCapability.getInventory(player);
        
        if(capability == null) return;
        
      
        if(index == 1) {
        	if(capability.getStackInSlot(0) != null && !capability.getStackInSlot(0).isEmpty()) {
            	/*
        		ItemStack backpackStack = capability.getStackInSlot(0); 
            	
            	ItemStorage storage = (ItemStorage) backpackStack.getItem();
            	ModelBase model = (ModelBase) storage.getTexturedModels().get(0).getU();
    			
            	ResourceLocation resource = new ResourceLocation(ModReference.id + ":textures/models/" + storage.getTexturedModels().get(0).getV());
            	
            	
            	doEquipmentRender(model, player, backpackStack, storage.getCustomEquippedPositioning(), resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	*/
        		ItemStack backpackStack = capability.getStackInSlot(0); 

        		ItemStorage storage = (ItemStorage) backpackStack.getItem();
            	
            	ModelBiped biped = GearModelRepository.pull(storage.getModelFileString());
            	ResourceLocation resource = new ResourceLocation(ModReference.ID + ":textures/models/" + storage.getProperTextureName());
        		mc.getTextureManager().bindTexture(resource);
        		doEquipmentRender(biped, player, null, (a, b) -> {}, resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	//System.out.println("yo1");
            	
            	return;
            }
        }
        
        if(index == 2) {
        	if(capability.getStackInSlot(1) != null && !capability.getStackInSlot(1).isEmpty()) {   
            	
            	/*
            	ItemStack vestStack = capability.getStackInSlot(1); 
            	
            	
            	
            	ItemVest storage = (ItemVest) vestStack.getItem();
            	ModelBase model = (ModelBase) storage.getTexturedModels().get(0).getU();	
    			
            	ResourceLocation resource = new ResourceLocation(ModReference.id + "textures/models/" + storage.getTexturedModels().get(0).getV());
            	
            	doEquipmentRender(model, player, vestStack, storage.getCustomEquippedPositioning(), resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	return;
            	*/
            	ItemStack vestStack = capability.getStackInSlot(1); 
            	
            	
            
            	ItemVest storage = (ItemVest) vestStack.getItem();
            	
            	ModelBiped biped = GearModelRepository.pull(storage.getModelFileString());
            	ResourceLocation resource = new ResourceLocation(ModReference.ID + ":textures/models/" + storage.getProperTextureName());
        		mc.getTextureManager().bindTexture(resource);
        		doEquipmentRender(biped, player, null, (a, b) -> {}, resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	//System.out.println("yo2");
            	
            	/*
            	ResourceLocation resource = new ResourceLocation(ModReference.id + "textures/models/usmc.png");
        		mc.getTextureManager().bindTexture(resource);
        		doEquipmentRender(modeld, player, null, (a, b) -> {}, resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	*/
        		
            }
        }
        
	}

	
	public void doEquipmentRender(ModelBase model, EntityPlayer player, ItemStack itemStack, BiConsumer<EntityPlayer, ItemStack> positioning, ResourceLocation texture, float limbSwing, float limbSwingAmount, float partialTicks,
			float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		
		// Load the correct texture
		mc.getTextureManager().bindTexture(texture);
    	
    	GlStateManager.pushMatrix();
    	
    	
    	/*
    	// Apply positioning
    	positioning.accept(player, itemStack);

    	
    	if(player.isSneaking()) {
    		GlStateManager.translate(0, .2, -0.1);
    		GlStateManager.rotate(35f, 1, 0, 0);
    	}*/
    	//GlStateManager.scale(0.8, 0.8, 0.8);
    	
    	// Set the model attributes & render.
    
    	
    	model.setModelAttributes(this.renderer.getMainModel());
    	
    	//model.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, player);
    	
    	model.setLivingAnimations(player, limbSwing, limbSwingAmount, partialTicks);
    	
    	model.render(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    	
    	GlStateManager.popMatrix();
	}


	@Override
	public boolean shouldCombineTextures() {
		return false;
	}

}
