package com.paneedah.weaponlib;

import com.paneedah.mwc.models.Plane;
import com.paneedah.mwc.rendering.TexturedModel;

public final class ItemSkin extends ItemAttachment<Weapon> {

    public static final class Builder extends AttachmentBuilder<Weapon> {

        private String textureName;

        public Builder withTexture(final String textureName) {
            this.textureName = addFileExtension(textureName, ".png");
            return this;
        }

        @Override
        protected ItemAttachment<Weapon> createAttachment(final ModContext modContext) {
            return new ItemSkin();
        }

        @Override
        public <V extends ItemAttachment<Weapon>> V build(final Class<V> target) {
            texturedModels.add(new TexturedModel(new Plane(), textureName));
            return super.build(target);
        }
    }

    private ItemSkin() {
        super(AttachmentCategory.SKIN);
    }
}
