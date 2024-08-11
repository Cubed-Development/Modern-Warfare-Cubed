package com.paneedah.weaponlib;

import com.paneedah.mwc.renderer.ModelSourceTransforms;
import com.paneedah.weaponlib.animation.Transform;
import net.minecraft.client.model.ModelBase;

import java.util.ArrayList;
import java.util.List;

public class ItemBullet extends ItemAttachment<Weapon> {

    public static final class Builder extends AttachmentBuilder<Weapon> {

        {
            transforms = ModelSourceTransforms.builder()
                    .entityPositioning(() -> new Transform()
                            .withScale(0.17, 0.17, 0.17)
                            .withPosition(-0.5, -0.7, 0.5)
                            .doGLDirect())
                    .build();
        }

        private List<ItemMagazine> compatibleMagazines = new ArrayList<>();

        public Builder() {
            withMaxStackSize(64);
        }

        public Builder withCompatibleMagazine(ItemMagazine magazine) {
            compatibleMagazines.add(magazine);
            return this;
        }

        @Override
        protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
            ItemBullet bullet = new ItemBullet(AttachmentCategory.BULLET, getModel(), getTextureName(), null, null, null);
            bullet.compatibleMagazines = compatibleMagazines;
            return bullet;
        }
    }


    private List<ItemMagazine> compatibleMagazines = new ArrayList<>();

    public ItemBullet(AttachmentCategory category, ModelBase model, String textureName, String crosshair,
                      com.paneedah.weaponlib.ItemAttachment.ApplyHandler<Weapon> apply,
                      com.paneedah.weaponlib.ItemAttachment.ApplyHandler<Weapon> remove) {
        super(category, model, textureName, crosshair, apply, remove);
    }
}
