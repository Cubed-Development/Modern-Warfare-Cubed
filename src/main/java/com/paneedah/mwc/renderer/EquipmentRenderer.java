package com.paneedah.mwc.renderer;

import com.paneedah.mwc.capabilities.EquipmentCapability;
import com.paneedah.mwc.equipment.inventory.EquipmentInventory;
import com.paneedah.mwc.items.equipment.carryable.ItemBelt;
import com.paneedah.mwc.items.equipment.carryable.ItemCarryable;
import com.paneedah.weaponlib.ItemVest;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;

import static com.paneedah.mwc.equipment.inventory.EquipmentInventory.BACKPACK_SLOT;
import static com.paneedah.mwc.equipment.inventory.EquipmentInventory.BELT_SLOT;
import static com.paneedah.mwc.equipment.inventory.EquipmentInventory.VEST_SLOT;
import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.mwc.utils.ModReference.ID;

@SideOnly(Side.CLIENT)
public final class EquipmentRenderer implements LayerRenderer<EntityPlayer> {

    private final RenderPlayer renderer;

    public EquipmentRenderer(RenderPlayer rendererIn) {
        this.renderer = rendererIn;
    }

    @Override
    public void doRenderLayer(final @Nonnull EntityPlayer player, final float limbSwing, final float limbSwingAmount, final float partialTicks, final float ageInTicks, final float netHeadYaw, final float headPitch, final float scale) {
        EquipmentInventory equipmentInventory = EquipmentCapability.getInventory(player);

        if (equipmentInventory == null) {
            return;
        }

        final ItemStack backpackSlot = equipmentInventory.getStackInSlot(BACKPACK_SLOT);
        final ItemStack beltSlot = equipmentInventory.getStackInSlot(BELT_SLOT);
        final ItemStack vestSlot = equipmentInventory.getStackInSlot(VEST_SLOT);

        if (!backpackSlot.isEmpty()) {
            final ItemCarryable itemCarryable = (ItemCarryable) backpackSlot.getItem();
            final ModelBiped model = EquipmentModelPools.getEquipped(itemCarryable.modelName);


            doEquipmentRender(model, player, new ResourceLocation(ID + ":textures/models/" + itemCarryable.textureName), limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
        }

        if (!beltSlot.isEmpty()) {
            final ItemBelt itemBelt = (ItemBelt) beltSlot.getItem();
            final ModelBiped model = EquipmentModelPools.getEquipped(itemBelt.modelName);

            doEquipmentRender(model, player, new ResourceLocation(ID + ":textures/models/" + itemBelt.textureName), limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
        }

        if (!vestSlot.isEmpty()) {
            final ItemVest itemVest = (ItemVest) vestSlot.getItem();
            final ModelBiped model = EquipmentModelPools.getEquipped(itemVest.modelFileString);

            doEquipmentRender(model, player, new ResourceLocation(ID + ":textures/models/" + itemVest.textureName), limbSwing, limbSwingAmount, partialTicks, ageInTicks, netHeadYaw, headPitch, scale);
        }
    }

    public void doEquipmentRender(ModelBiped model, EntityPlayer player, ResourceLocation texture, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        final float swingProgress = model.swingProgress;
        final boolean isRiding = model.isRiding;
        final boolean isChild = model.isChild;

        final ModelBiped.ArmPose leftArmPose = model.leftArmPose;
        final ModelBiped.ArmPose rightArmPose = model.rightArmPose;
        final boolean isSneak = model.isSneak;

        MC.getTextureManager().bindTexture(texture);

        model.setModelAttributes(this.renderer.getMainModel());

        model.render(MC.player, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);

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
