package com.paneedah.weaponlib.render;

import com.paneedah.mwc.items.equipment.carryable.ItemCarryable;
import com.paneedah.weaponlib.ItemVest;
import com.paneedah.mwc.capabilities.EquipmentCapability;
import com.paneedah.mwc.equipment.inventory.EquipmentInventory;
import com.paneedah.weaponlib.model.USMCVestTwo;
import com.paneedah.weaponlib.render.modelrepo.GearModelRepository;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.BiConsumer;

import static com.paneedah.mwc.proxies.ClientProxy.mc;
import static com.paneedah.mwc.utils.ModReference.ID;

@SideOnly(Side.CLIENT)
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
        EquipmentInventory capability = EquipmentCapability.getInventory(player);
        
        if(capability == null) return;
        
      
        if(index == 1) {

        	if(capability.getStackInSlot(0) != null && !capability.getStackInSlot(0).isEmpty()) {
            	/*
        		ItemStack backpackStack = capability.getStackInSlot(0);

            	ItemBackpack storage = (ItemBackpack) backpackStack.getItem();
            	ModelBase model = (ModelBase) storage.getTexturedModels().get(0).getU();

            	ResourceLocation resource = new ResourceLocation(ID + ":textures/models/" + storage.getTexturedModels().get(0).getV());


            	doEquipmentRender(model, player, backpackStack, storage.getCustomEquippedPositioning(), resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	*/
        		ItemStack backpackStack = capability.getStackInSlot(0);

        		ItemCarryable storage = (ItemCarryable) backpackStack.getItem();

            	ModelBiped biped = storage.getModel();
            	ResourceLocation resource = new ResourceLocation(ID + ":textures/models/" + storage.getTextureName());
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
    			
            	ResourceLocation resource = new ResourceLocation(ID + "textures/models/" + storage.getTexturedModels().get(0).getV());
            	
            	doEquipmentRender(model, player, vestStack, storage.getCustomEquippedPositioning(), resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	return;
            	*/
            	ItemStack vestStack = capability.getStackInSlot(1); 
            	
            	
            
            	ItemVest storage = (ItemVest) vestStack.getItem();
            	
            	ModelBiped biped = GearModelRepository.pull(storage.getModelFileString());
            	ResourceLocation resource = new ResourceLocation(ID + ":textures/models/" + storage.getProperTextureName());
        		mc.getTextureManager().bindTexture(resource);
        		doEquipmentRender(biped, player, null, (a, b) -> {}, resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	//System.out.println("yo2");
            	
            	/*
            	ResourceLocation resource = new ResourceLocation(ID + "textures/models/usmc.png");
        		mc.getTextureManager().bindTexture(resource);
        		doEquipmentRender(modeld, player, null, (a, b) -> {}, resource, limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
            	*/
        		
            }
        }
        
	}

	
	public void doEquipmentRender(ModelBiped model, EntityPlayer player, ItemStack itemStack, BiConsumer<EntityPlayer, ItemStack> positioning, ResourceLocation texture, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		final float swingProgress = model.swingProgress;
		final boolean isRiding = model.isRiding;
		final boolean isChild = model.isChild;
		final ModelBiped.ArmPose leftArmPose = model.leftArmPose;
		final ModelBiped.ArmPose rightArmPose = model.rightArmPose;
		final boolean isSneak = model.isSneak;

		// Load the correct texture
		mc.getTextureManager().bindTexture(texture);

    	GlStateManager.pushMatrix();

    	// Set the model attributes & render.
    	model.setModelAttributes(this.renderer.getMainModel());
    	model.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, player);
    	model.setLivingAnimations(player, limbSwing, limbSwingAmount, partialTicks);
    	model.render(player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

    	GlStateManager.popMatrix();

		model.swingProgress = swingProgress;
		model.isRiding = isRiding;
		model.isChild = isChild;
		model.leftArmPose = leftArmPose;
		model.rightArmPose = rightArmPose;
		model.isSneak = isSneak;
	}


	@Override
	public boolean shouldCombineTextures() {
		return false;
	}

}
