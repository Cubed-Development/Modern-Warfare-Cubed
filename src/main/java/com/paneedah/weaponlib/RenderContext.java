package com.paneedah.weaponlib;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.animation.MatrixHelper;
import com.paneedah.weaponlib.animation.PartPositionProvider;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.util.vector.Matrix4f;

import java.util.HashMap;
import java.util.Map;

public class RenderContext<RS> implements PartPositionProvider {

    @Getter
    private EntityLivingBase player;
    private ItemStack itemStack;
    @Setter
    @Getter
    private float limbSwing;
    @Setter
    @Getter
    private float flimbSwingAmount;
    @Setter
    @Getter
    private float ageInTicks;
    @Setter
    @Getter
    private float netHeadYaw;
    @Setter
    @Getter
    private float headPitch;
    @Setter
    @Getter
    private float scale;
    @Setter
    @Getter
    private float transitionProgress;
    @Getter
    private ItemCameraTransforms.TransformType transformType;
    @Setter
    @Getter
    private RS fromState;
    @Setter
    @Getter
    private RS toState;
    @Setter
    @Getter
    private PlayerItemInstance<?> playerItemInstance;
    private boolean cancelBeizer;

    private final Map<Part, Matrix4f> attachablePartPositions;

    public RenderContext(EntityLivingBase player, ItemStack itemStack) {
        this.player = player;
        this.itemStack = itemStack;
        attachablePartPositions = new HashMap<>();
    }

    public void setCancelBeizer() {
        cancelBeizer = true;
    }

    public boolean getCancelBeizer() {
        return cancelBeizer;
    }

    public void setPlayer(EntityPlayer player) {
        this.player = player;
    }

    public void setWeapon(ItemStack weapon) {
        itemStack = weapon;
    }

    public ItemStack getWeapon() {
        return itemStack;
    }

    public void setCompatibleTransformType(ItemCameraTransforms.TransformType transformType) {
        this.transformType = transformType;
    }

    public PlayerWeaponInstance getWeaponInstance() {
        if (playerItemInstance instanceof PlayerWeaponInstance) {
            return (PlayerWeaponInstance) playerItemInstance;
        }
        PlayerItemInstance<?> itemInstance = MWC.modContext.getPlayerItemInstanceRegistry()
                .getItemInstance(player, itemStack);
        if (itemInstance instanceof PlayerWeaponInstance) {
            return (PlayerWeaponInstance) itemInstance;
        }
        return null;
    }

    public void capturePartPosition(Part part) {
        attachablePartPositions.put(part, MatrixHelper.captureMatrix());
    }

    @Override
    public Matrix4f getPartPosition(Object part) {
        if (part == null) {
            part = Part.MAIN_ITEM;
        }
        return attachablePartPositions.get(part);
    }
}
