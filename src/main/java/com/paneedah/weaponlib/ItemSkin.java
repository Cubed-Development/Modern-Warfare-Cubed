package com.paneedah.weaponlib;

import com.paneedah.weaponlib.model.FlatModel;
import net.minecraft.client.model.ModelBase;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class ItemSkin extends ItemAttachment<Weapon> {

	public static final class Builder extends AttachmentBuilder<Weapon> {
		private final List<String> textureVariants = new ArrayList<>();

		public Builder withTextureVariant(String... textureVariantNames) {
			for (String s: textureVariantNames)
				this.textureVariants.add(stripFileExtension(s.toLowerCase(), ".png"));
			return this;
		}

		@Override
		protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
			ItemSkin skin = new ItemSkin(AttachmentCategory.SKIN, getModel(), getTextureName(), null, null, null);
			skin.textureVariants = this.textureVariants;
			return skin;
		}

		@Override
		public <V extends ItemAttachment<Weapon>> V build(ModContext modContext, Class<V> target) {
			this.model = new FlatModel();
			if(textureVariants.isEmpty()) {
				textureVariants.add(getTextureName());
			} else if(getTextureName() == null) {
				this.textureName = textureVariants.get(0);
			}
			if(inventoryPositioning == null) {
				withInventoryPositioning((itemStack) -> {
					
					/*
					GlStateManager.scale(0.5, 0.5, 0.5);
					GlStateManager.translate(-0.5, -0.25, 0);
					GlStateManager.rotate(45f, 1, 0, 0);
					*/
					
					
					GL11.glRotatef(30F, 1f, 0f, 0f);
					GL11.glRotatef(-45F, 0f, 1f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glTranslatef(-0.75f, -0.6f, 0F);
					GL11.glScaled(15f, 15f, 15f);
					
				});
			}
			return super.build(modContext, target);
		}
	}

	private List<String> textureVariants;

	public ItemSkin(AttachmentCategory category, ModelBase model, String textureName, String crosshair, ItemAttachment.ApplyHandler<Weapon> apply, ItemAttachment.ApplyHandler<Weapon> remove) {
		super(category, model, textureName, crosshair, apply, remove);
	}

	public String getTextureName() {
		return textureName;
	}

	public int getTextureVariantIndex(String name) {
		return textureVariants.indexOf(name.toLowerCase());
	}

	public String getTextureVariant(int textureIndex) {
		return textureIndex >= 0 && textureIndex < textureVariants.size() ? textureVariants.get(textureIndex) : null;
	}
}
