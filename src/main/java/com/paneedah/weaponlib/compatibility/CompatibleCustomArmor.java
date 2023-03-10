package com.paneedah.weaponlib.compatibility;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mw.proxies.ClientProxy.mc;

public class CompatibleCustomArmor extends ItemArmor {

	protected String textureName;
	protected ModelBiped model;
	protected String hudTextureName;
	protected String modId;

	protected CompatibleCustomArmor(String modId, ArmorMaterial material, int renderIndex, CompatibleEntityEquipmentSlot armorType, String iconName, String textureName,
			ModelBiped model, String hudTextureName) {
		super(material, renderIndex, armorType.getSlot());
		this.modId = modId;
		this.textureName = textureName;
		this.model = model;
		this.hudTextureName = hudTextureName;
	}

	public String getHudTexture() {
		return modId + ":" + "textures/hud/" + hudTextureName + ".png";
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return modId + ":textures/models/" + textureName + ".png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			ModelBiped _default) {

		ModelBiped armorModel = null;

		if (itemStack != null) {

			if (itemStack.getItem() instanceof CompatibleCustomArmor) {
				armorModel = model;
			}

			if (armorModel != null) {

				armorModel.bipedHead.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.bipedHeadwear.showModel = armorSlot == EntityEquipmentSlot.HEAD;
				armorModel.bipedBody.showModel = armorSlot == EntityEquipmentSlot.CHEST;
				armorModel.bipedRightArm.showModel = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;
				armorModel.bipedLeftArm.showModel = armorSlot == EntityEquipmentSlot.MAINHAND || armorSlot == EntityEquipmentSlot.OFFHAND;

				armorModel.bipedRightLeg.showModel = armorSlot == EntityEquipmentSlot.FEET;
				armorModel.bipedLeftLeg.showModel = armorSlot == EntityEquipmentSlot.FEET;

				armorModel.isSneak = entityLiving.isSneaking();
				armorModel.isRiding = entityLiving.isRiding();
				armorModel.isChild = entityLiving.isChild();

				if (entityLiving instanceof EntityPlayer) {

					Render<AbstractClientPlayer> entityRenderObject = mc
							.getRenderManager().getEntityRenderObject((AbstractClientPlayer)entityLiving);
					RenderPlayer renderPlayer = (RenderPlayer) entityRenderObject;
					armorModel.leftArmPose = renderPlayer.getMainModel().leftArmPose;
					armorModel.rightArmPose = renderPlayer.getMainModel().rightArmPose;
				}
				return armorModel;
			}
		}
		return null;
	}

}
