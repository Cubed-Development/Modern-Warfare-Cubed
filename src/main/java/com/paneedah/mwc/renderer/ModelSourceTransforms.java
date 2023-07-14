package com.paneedah.mwc.renderer;

import com.paneedah.weaponlib.RenderContext;
import com.paneedah.weaponlib.RenderableState;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

@Getter
@Setter
@Builder
@SideOnly(Side.CLIENT)
public final class ModelSourceTransforms {

    @Builder.Default private Consumer<ItemStack> entityPositioning = itemStack -> {};
    @Builder.Default private Consumer<ItemStack> inventoryPositioning = itemStack -> {};
    @Builder.Default private BiConsumer<EntityPlayer, ItemStack> thirdPersonPositioning = (player, itemStack) -> {
//        GL11.glTranslatef(-0.8F, 0.2F, 0.4F);
//        GL11.glRotatef(-45F, 0f, 1f, 0f);
//        GL11.glRotatef(70F, 1f, 0f, 0f);
//        GL11.glScalef(4, 4, 4);
    };
    @Builder.Default private BiConsumer<EntityPlayer, ItemStack> firstPersonPositioning = (player, itemStack) -> {};
    @Builder.Default private BiConsumer<EntityPlayer, ItemStack> customEquippedPositioning = (player, itemStack) -> {};
    @Builder.Default private BiConsumer<ModelBase, ItemStack> firstPersonModelPositioning = (model, itemStack) -> {};
    @Builder.Default private BiConsumer<ModelBase, ItemStack> thirdPersonModelPositioning = (model, itemStack) -> {};
    @Builder.Default private BiConsumer<ModelBase, ItemStack> inventoryModelPositioning = (model, itemStack) -> {};
    @Builder.Default private BiConsumer<ModelBase, ItemStack> entityModelPositioning = (model, itemStack) -> {};
    @Builder.Default private Consumer<RenderContext<RenderableState>> firstPersonLeftHandPositioning = renderContext -> GL11.glScalef(0f, 0f, 0f);
    @Builder.Default private Consumer<RenderContext<RenderableState>> firstPersonRightHandPositioning = renderContext -> GL11.glScalef(0f, 0f, 0f);
}
