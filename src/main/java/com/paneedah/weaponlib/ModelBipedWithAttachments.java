package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.compatibility.CompatibleModelBiped;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.TextureOffset;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.List;
import java.util.Random;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class ModelBipedWithAttachments extends CompatibleModelBiped {
	
	public ModelBipedWithAttachments(ModelBiped delegate) {
		super(delegate);
	}

	public int hashCode() {
		return delegate.hashCode();
	}

	public void setLivingAnimations(EntityLivingBase p_78086_1_,
			float p_78086_2_, float p_78086_3_, float p_78086_4_) {
		delegate.setLivingAnimations(p_78086_1_, p_78086_2_, p_78086_3_,
				p_78086_4_);
	}

	public ModelRenderer getRandomModelBox(Random p_85181_1_) {
		return delegate.getRandomModelBox(p_85181_1_);
	}

	public TextureOffset getTextureOffset(String p_78084_1_) {
		return delegate.getTextureOffset(p_78084_1_);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		delegate.render(entity, f, f1, f2, f3, f4, f5);
	}

	public boolean equals(Object obj) {
		return delegate.equals(obj);
	}

	public void setRotationAngles(float p_78087_1_, float p_78087_2_,
			float p_78087_3_, float p_78087_4_, float p_78087_5_,
			float p_78087_6_, Entity p_78087_7_) {
		delegate.setRotationAngles(p_78087_1_, p_78087_2_, p_78087_3_,
				p_78087_4_, p_78087_5_, p_78087_6_, p_78087_7_);
	}

	public String toString() {
		return delegate.toString();
	}

	public void renderAttachments(List<CompatibleAttachment<?>> attachments, Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		for(CompatibleAttachment<?> compatibleAttachment: attachments) {
			if(compatibleAttachment != null) {
				for(Tuple<ModelBase, String> texturedModel: compatibleAttachment.getAttachment().getTexturedModels()) {
					mc.renderEngine.bindTexture(new ResourceLocation(ModReference.id + ":textures/models/" + texturedModel.getV()));
					GL11.glPushMatrix();
					if(compatibleAttachment.getModelPositioning() != null) {
						compatibleAttachment.getModelPositioning().accept(texturedModel.getU());
					}
					texturedModel.getU().render(entity, f, f1, f2, f3, f4, f5);
					GL11.glPopMatrix();
				}
			}
		}
	}
}
