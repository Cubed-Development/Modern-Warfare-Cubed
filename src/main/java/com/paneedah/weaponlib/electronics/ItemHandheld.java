package com.paneedah.weaponlib.electronics;

import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.perspective.Perspective;
import com.paneedah.weaponlib.perspective.PerspectiveRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.function.BiConsumer;

public class ItemHandheld<T> extends ItemAttachment<T>
implements PlayerItemInstanceFactory<PlayerHandheldInstance, HandheldState>, Updatable {
    
    private final int DEFAULT_MAX_STACK_SIZE = 1;
        
    public static final class Builder<T> extends AttachmentBuilder<T> {
        
        private BiConsumer<EntityLivingBase, ItemStack> screenPositioning;
        private Class<? extends Perspective<?>> perspectiveClass;
        
        public Builder<T> withScreenPositioning(BiConsumer<EntityLivingBase, ItemStack> screenPositioning) {
            this.screenPositioning = screenPositioning;
            return this;
        }
        
        public Builder<T> withScreenPerspectiveType(Class<? extends Perspective<?>> perspectiveClass) {
            this.perspectiveClass = perspectiveClass;
            return this;
        } 
        
        @Override
        protected ItemAttachment<T> createAttachment(ModContext modContext) {
            
            withPostRender(new PerspectiveRenderer(screenPositioning));
            
            ItemHandheld<T> itemHandheld = new ItemHandheld<>(this);
            itemHandheld.modContext = modContext;
            
            return itemHandheld;
        }
        
        @Override
        public ItemAttachment<T> build(ModContext modContext) {
            return super.build(modContext);
        }
    }
    
    @SuppressWarnings("unused")
    private ModContext modContext;
    private Builder<T> builder;
    
    private ItemHandheld(Builder<T> builder) {
        super(AttachmentCategory.SCOPE, builder.getModel(), builder.getTextureName(), null,
                null, null);
        this.builder = builder;
        
        setMaxStackSize(DEFAULT_MAX_STACK_SIZE);
    }

    @Override
    public void update(EntityPlayer player) {
    }

    @Override
    public PlayerHandheldInstance createItemInstance(EntityLivingBase player, ItemStack stack, int slot) {
        PlayerHandheldInstance instance = new PlayerHandheldInstance(slot, player, stack);
        instance.setState(HandheldState.READY);
        return instance;
    }

    public Class<? extends Perspective<?>> getRequiredPespectiveType() {
        return builder.perspectiveClass;
    }
}
