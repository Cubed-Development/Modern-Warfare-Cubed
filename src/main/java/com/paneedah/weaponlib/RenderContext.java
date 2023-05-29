package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.animation.PartPositionProvider;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.util.vector.Matrix4f;

import java.util.HashMap;
import java.util.Map;

public class RenderContext<RS> implements PartPositionProvider {

	private EntityLivingBase player;
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
	private ModContext modContext;
	private PlayerItemInstance<?> playerItemInstance;
	private boolean cancelBeizer;

	private Map<Part, Matrix4f> attachablePartPositions;

	public RenderContext(ModContext modContext, EntityLivingBase player, ItemStack itemStack) {
		this.modContext = modContext;
		this.player = player;
		this.itemStack = itemStack;
		this.attachablePartPositions = new HashMap<>();
	}

	public ModContext getModContext() {
		return modContext;
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

	public void setPlayer(EntityPlayer player) {
		this.player = player;
	}

	public void setWeapon(ItemStack weapon) {
		this.itemStack = weapon;
	}

	public EntityLivingBase getPlayer() {
		return player;
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
		PlayerItemInstance<?> itemInstance = modContext.getPlayerItemInstanceRegistry()
				.getItemInstance(player, itemStack);
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
