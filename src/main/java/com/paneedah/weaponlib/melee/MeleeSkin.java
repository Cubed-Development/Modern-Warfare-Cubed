package com.paneedah.weaponlib.melee;

import com.paneedah.weaponlib.AttachmentBuilder;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.ItemAttachment;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.model.FlatModel;
import net.minecraft.client.model.ModelBase;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class MeleeSkin extends ItemAttachment<ItemMelee> {
	
	public static final class Builder extends AttachmentBuilder<ItemMelee> {
		private List<String> textureVariants = new ArrayList<>();
		
		public Builder withTextureVariant(String... textureVariantNames) {
			for(String s: textureVariantNames) {
				this.textureVariants.add(stripFileExtension(s.toLowerCase(), ".png"));
			}
			return this;
		}

		@Override
		protected ItemAttachment<ItemMelee> createAttachment(ModContext modContext) {
		    MeleeSkin skin = new MeleeSkin(AttachmentCategory.SKIN, getModel(), getTextureName(), null, null, null);
			skin.textureVariants = this.textureVariants;
			return skin;
		}
		
		@Override
		public <V extends ItemAttachment<ItemMelee>> V build(ModContext modContext, Class<V> target) {
			this.model = new FlatModel();
			if(textureVariants.isEmpty()) {
				textureVariants.add(getTextureName());
			} else if(getTextureName() == null) {
				this.textureName = textureVariants.get(0);
			}
			if(inventoryPositioning == null) {
				withInventoryPositioning((itemStack) -> {
					GL11.glRotatef(20F, 1f, 0f, 0f);
					GL11.glRotatef(-45F, 0f, 1f, 0f);
					GL11.glRotatef(0F, 0f, 0f, 1f);
					GL11.glTranslatef(-0.6f, -0.6f, 0F);
					GL11.glScaled(15F, 15F, 15f);
				});
			}
			return super.build(modContext, target);
		}
	}
	
	private List<String> textureVariants;
	
	public MeleeSkin(AttachmentCategory category, ModelBase model, String textureName, String crosshair,
			com.paneedah.weaponlib.ItemAttachment.ApplyHandler<ItemMelee> apply,
			com.paneedah.weaponlib.ItemAttachment.ApplyHandler<ItemMelee> remove) {
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
