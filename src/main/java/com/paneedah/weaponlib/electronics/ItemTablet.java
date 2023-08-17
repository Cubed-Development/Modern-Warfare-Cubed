package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.MWC;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.perspective.PerspectiveRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemTablet<T> extends ItemAttachment<T> implements PlayerItemInstanceFactory<PlayerTabletInstance, TabletState>, Updatable {

    private final int DEFAULT_MAX_STACK_SIZE = 1;

    public static final class Builder<T> extends AttachmentBuilder<T> {

        {
            creativeTab = MWC.EQUIPMENT_TAB;
        }

        private Runnable viewfinderPositioning;

        public Builder<T> withViewfinderPositioning(Runnable viewfinderPositioning) {
            this.viewfinderPositioning = viewfinderPositioning;
            return this;
        }

        @Override
        protected ItemAttachment<T> createAttachment(ModContext modContext) {
            if (viewfinderPositioning == null) {
                viewfinderPositioning = () -> {
                    GL11.glScalef(3f, 3f, 3f);
                    GL11.glTranslatef(0.1f, 0.5f, 0.1f);
                };
            }
            withPostRender(new PerspectiveRenderer(viewfinderPositioning));

            ItemTablet<T> itemTablet = new ItemTablet<>(this);
            itemTablet.modContext = modContext;

            return itemTablet;
        }

        @Override
        public ItemAttachment<T> build() {
            return super.build();
        }
    }


    private ModContext modContext;
    private Builder<T> builder;

    private ItemTablet(Builder<T> builder) {
        super(AttachmentCategory.SCOPE, builder.getModel(), builder.getTextureName(), null, null, null);
        this.builder = builder;

        setMaxStackSize(DEFAULT_MAX_STACK_SIZE);
    }

    @Override
    public void update(EntityPlayer player) {

    }

    @Override
    public PlayerTabletInstance createItemInstance(EntityLivingBase player, ItemStack stack, int slot) {
        PlayerTabletInstance instance = new PlayerTabletInstance(slot, player, stack);
        instance.setState(TabletState.READY);
        return instance;
    }
}
