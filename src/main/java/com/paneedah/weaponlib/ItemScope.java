package com.paneedah.weaponlib;

import com.paneedah.weaponlib.electronics.ScopePerspective;
import com.paneedah.weaponlib.perspective.ReflexScreen;
import com.paneedah.weaponlib.render.scopes.CyclicList;
import com.paneedah.weaponlib.render.scopes.Reticle;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class ItemScope extends ItemAttachment<Weapon> {

    private static final int DEFAULT_MAX_STACK_SIZE = 1;
    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 400;

    public static final class Builder extends AttachmentBuilder<Weapon> {

        private float minZoom;
        private float maxZoom;
        private boolean isOpticalZoom;
        private boolean hasNightVision;
        private boolean usesWhitePhosphor;
        private BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning;
        private int width = DEFAULT_WIDTH;
        private int height = DEFAULT_HEIGHT;
        
        
        public Reticle sniperReticle = new Reticle("holo");
        		
        public CyclicList<Reticle> reticles = new CyclicList<>();
        public ReflexScreen screen;
        private float radialCut = 20f;
        /*
        public ResourceLocation reticleTexture;
        public float texScale = 0.05f;
        public float reticleCut = 0.1f;
        private boolean hasReticle = false;
        public Vec3d background;
        */
        private BiConsumer<EntityLivingBase, ItemStack> reticlePositioning;

        
        
        
        public Builder withZoomRange(float minZoom, float maxZoom) {
            this.minZoom = minZoom;
            this.maxZoom = maxZoom;
            return this;
        }
        
        public Builder withRadialCut(float radius) {
        	this.radialCut = radius;
        	return this;
        }
        
        public Builder withSniperReticle(Reticle ret) {
        	this.sniperReticle = ret;
        	return this;
        }

        public Builder withOpticalZoom() {
            this.isOpticalZoom = true;
            return this;
        }
        
        public Builder withViewfinderSize(int width, int height) {
            this.width = width;
            this.height = height;
            return this;
        }
        
        public Builder withNightVision() {
            this.hasNightVision = true;
            return this;
        }
        
        public Builder withWhitePhosphor() {
        	this.usesWhitePhosphor = true;
        	return this;
        }
        
        // reticle
        
        public Builder withHolographicReticles(Reticle...reticles) {
        	this.reticles.addAll(Arrays.asList(reticles));
        	return this;
        }
        
        
        
     
        
        public Builder withReticlePositioning(BiConsumer<EntityLivingBase, ItemStack> reticlePositioning) {
        	this.reticlePositioning = reticlePositioning;
        	return this;
        }

        public Builder withViewfinderPositioning(BiConsumer<EntityLivingBase, ItemStack> viewfinderPositioning) {
            this.viewfinderPositioning = viewfinderPositioning;
            return this;
        }

        @Override
        protected ItemAttachment<Weapon> createAttachment(ModContext modContext) {
            if(isOpticalZoom) {
                if(viewfinderPositioning == null) {
                    viewfinderPositioning = (p, s) -> {
                        GL11.glScalef(1.1f, 1.1f, 1.1f);
                        GL11.glTranslatef(0.1f, 0.4f, 0.6f);
                    };
                }
                withPostRender(new ScopePerspective(viewfinderPositioning, sniperReticle));
            }
            
            if(!reticles.isEmpty()) {
            	this.screen = new ReflexScreen(reticlePositioning, radialCut, reticles);
            	withPostRender(this.screen);
            }

            ItemScope itemScope = new ItemScope(this);
            itemScope.modContext = modContext;

            return itemScope;
        }

        @Override
        public ItemAttachment<Weapon> build(ModContext modContext) {
            this.apply2 = (a, instance) -> {
                float zoom = minZoom + (maxZoom - minZoom) / 2f;
                instance.setZoom(zoom);
            };
            this.remove2 = (a, instance) -> {
                instance.setZoom(1);
            };
            return super.build(modContext);
        }
    }

    @SuppressWarnings("unused")
    private ModContext modContext;
    private Builder builder;

    private ItemScope(Builder builder) {
        super(AttachmentCategory.SCOPE, builder.getModel(), builder.getTextureName(), null,
                null, null);
        this.builder = builder;

        setMaxStackSize(DEFAULT_MAX_STACK_SIZE);
    }

    public boolean hasReticle() {
    	return !builder.reticles.isEmpty();
    }
    
   
    
    public float getMinZoom() {
        return builder.minZoom;
    }

    public float getMaxZoom() {
        return builder.maxZoom;
    }

    public boolean isOptical() {
        return builder.isOpticalZoom;
    }

    public boolean usesWhitePhosphor() {
    	return builder.usesWhitePhosphor;
    }
    
    public boolean hasNightVision() {
        return builder.hasNightVision;
    }

    public int getWidth() {
        return builder.width;
    }
    
    public void switchReticle() {
    	builder.screen.reticleList.next();
    }
    
    public int getHeight() {
        return builder.height;
    }
}
