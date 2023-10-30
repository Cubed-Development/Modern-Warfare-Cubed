package com.paneedah.weaponlib;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.animation.PartPositionProvider;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.lwjgl.util.vector.Matrix4f;

import java.util.HashMap;
import java.util.Map;

public class RenderContext<RS> implements PartPositionProvider {

	private EntityLivingBase entityLiving;
	private ItemStack itemStack;
	private float limbSwing;
	private float flimbSwingAmount;
	private float ageInTicks;
	private float netHeadYaw;
	private float headPitch;
	private float scale;
	private float transitionProgress;
	private ItemCameraTransforms.TransformType transformType;
	private RS fromState;
	private RS toState;
	private PlayerItemInstance<?> playerItemInstance;
	private boolean cancelBeizer;

	private Map<Part, Matrix4f> attachablePartPositions;

	public RenderContext(EntityLivingBase entityLiving, ItemStack itemStack) {
		this.entityLiving = entityLiving;
		this.itemStack = itemStack;
		this.attachablePartPositions = new HashMap<>();
	}
	
	public void setCancelBeizer() {
		cancelBeizer = true;
	}
	
	public boolean getCancelBeizer() {
		return cancelBeizer;
	}

	public float getLimbSwing() {
		return limbSwing;
	}

	public void setLimbSwing(float limbSwing) {
		this.limbSwing = limbSwing;
	}

	public float getFlimbSwingAmount() {
		return flimbSwingAmount;
	}

	public void setFlimbSwingAmount(float flimbSwingAmount) {
		this.flimbSwingAmount = flimbSwingAmount;
	}

	public float getAgeInTicks() {
		return ageInTicks;
	}

	public void setAgeInTicks(float ageInTicks) {
		this.ageInTicks = ageInTicks;
	}

	public float getNetHeadYaw() {
		return netHeadYaw;
	}

	public void setNetHeadYaw(float netHeadYaw) {
		this.netHeadYaw = netHeadYaw;
	}

	public float getHeadPitch() {
		return headPitch;
	}

	public void setHeadPitch(float headPitch) {
		this.headPitch = headPitch;
	}

	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public void setEntityLiving(EntityLivingBase entityLiving) {
		this.entityLiving = entityLiving;
	}

	public void setItemStack(ItemStack itemStack) {
		this.itemStack = itemStack;
	}

	public EntityLivingBase getEntityLiving() {
		return entityLiving;
	}

	public ItemStack getWeapon() {
		return itemStack;
	}

	public ItemCameraTransforms.TransformType getTransformType() {
		return transformType;
	}

	public void setCompatibleTransformType(ItemCameraTransforms.TransformType transformType) {
		this.transformType = transformType;
	}

	public RS getFromState() {
		return fromState;
	}

	public void setFromState(RS fromState) {
		this.fromState = fromState;
	}

	public RS getToState() {
		return toState;
	}

	public void setToState(RS toState) {
		this.toState = toState;
	}

	public float getTransitionProgress() {
		return transitionProgress;
	}

	public void setTransitionProgress(float transitionProgress) {
		this.transitionProgress = transitionProgress;
	}

	public PlayerItemInstance<?> getPlayerItemInstance() {
		return playerItemInstance;
	}

	public void setPlayerItemInstance(PlayerItemInstance<?> playerItemInstance) {
		this.playerItemInstance = playerItemInstance;
	}

	public PlayerWeaponInstance getWeaponInstance() {
		if(playerItemInstance instanceof PlayerWeaponInstance) {
			return (PlayerWeaponInstance) playerItemInstance;
		}
		PlayerItemInstance<?> itemInstance = MWC.modContext.getPlayerItemInstanceRegistry()
				.getItemInstance(entityLiving, itemStack);
		if(itemInstance instanceof PlayerWeaponInstance) {
			return (PlayerWeaponInstance) itemInstance;
		}
		return null;
	}

	public void capturePartPosition(Part part) {
	    attachablePartPositions.put(part, MatrixHelper.captureMatrix());
	}

    @Override
    public Matrix4f getPartPosition(Object part) {
        if(part == null) {
            part = Part.MAIN_ITEM;
        }
        return attachablePartPositions.get(part);
    }
}
