package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.animation.DebugPositioner;
import com.paneedah.weaponlib.animation.MultipartPositioning;
import com.paneedah.weaponlib.animation.MultipartPositioning.Positioner;
import com.paneedah.weaponlib.animation.MultipartRenderStateManager;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

final class HierarchicalPartRenderer<Part, State> implements StatefulRenderer<State> {
    
    static enum SinglePart { MAIN }
       
    private StatefulRenderer<State> modelRenderer;
    private ResourceLocation textureResource;
    
    private Part part;
    
    protected Map<Part, HierarchicalPartRenderer<Part, State>> partRenderers;
    
    protected Supplier<MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>> stateManagerSupplier;
    
    private BiConsumer<MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>, PartRenderContext<State>> stateSetter;

    private Function<PartRenderContext<State>, Float> currentProgressProvider;
    
    private Map<Entity, MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>> stateManagers = new HashMap<>();
    
    protected HierarchicalPartRenderer(Part part, 
            StatefulRenderer<State> modelRenderer,
            ResourceLocation textureResource,
            Map<Part, HierarchicalPartRenderer<Part, State>> partRenderers,
            Supplier<MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>> stateManagerSupplier,
            BiConsumer<MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>>, PartRenderContext<State>> stateSetter,
            Function<PartRenderContext<State>, Float> currentProgressProvider) {
        this.part = part;
        this.modelRenderer = modelRenderer;
        this.textureResource = textureResource;
        this.partRenderers = partRenderers;
        this.stateManagerSupplier = stateManagerSupplier;
        this.stateSetter = stateSetter;
        this.currentProgressProvider = currentProgressProvider;
    }
    
    @SuppressWarnings("unchecked")
    public void render(PartRenderContext<State> context) {
        
        MultipartRenderStateManager<State, SinglePart, PartRenderContext<State>> stateManager = stateManagers.computeIfAbsent(context.getEntity(), e -> stateManagerSupplier.get());
        
        
        
        stateSetter.accept(stateManager, context);
        MultipartPositioning<SinglePart, PartRenderContext<State>> multipartPositioning = stateManager.nextPositioning();
       // System.out.println(multipartPositioning.getProgress());
        Positioner<SinglePart, PartRenderContext<State>> positioner = multipartPositioning.getPositioner();
        
        
       
        
        context.setProgress(currentProgressProvider.apply(context));
        
        /*
         * NEXT FEW LINES ARE BY JIM (saying this for debug purposes)
         * This just tells the renderer to use an alternative texture
         * USE CASE: vehicle lights
         */
        if(context.shouldRenderAlternateTexture()) {
        	mc.getTextureManager().bindTexture(context.getAlternateTexture());
        } else {
        	mc.getTextureManager().bindTexture(textureResource);
        }
        
        
        
        GL11.glPushMatrix();
        
        try {
        	
        	 EntityVehicle v = (EntityVehicle) context.getEntity();
             VehicleState state = (v).getState();
             
        	
        	
            positioner.position(SinglePart.MAIN, context);
            
            if(DebugPositioner.isDebugModeEnabled()) {
                DebugPositioner.position(part, context);
            }
    
            int pass = net.minecraftforge.client.MinecraftForgeClient.getRenderPass();
            
            
            double susRoll = InterpolationKit.interpolateValue(v.getSolver().prevSuspensionRoll, v.getSolver().suspensionRoll, mc.getRenderPartialTicks());
            double susPitch = InterpolationKit.interpolateValue(v.getSolver().prevSuspensionPitch, v.getSolver().suspensionPitch, mc.getRenderPartialTicks());
            
           // System.out.println(susPitch);
            if(pass == 0 && part != VehiclePart.WINDOWS) {
            	
            	if(part == VehiclePart.MAIN) {
            		
            		GL11.glRotated(susRoll, 0, 0, 1);
            		GL11.glRotated(susPitch, 1, 0, 0);
            		modelRenderer.render(context);
            		GL11.glRotated(-susPitch, 1, 0, 0);
            		GL11.glRotated(-susRoll, 0, 0, 1);
            		
            	} else {
            		modelRenderer.render(context);
            	}
            
               
            } else if(pass == 1 && part == VehiclePart.WINDOWS) {
            	if(part == VehiclePart.WINDOWS) {
                  	 GlStateManager.enableBlend();
                  	 float transparency = 0.5f;
                  	 if(mc.gameSettings.thirdPersonView == 0) {
                  		 transparency = 0.2f;
                  	 }
                  	 GlStateManager.color(0.1f, 0.1f, 0.15f, transparency);
                  }
            	modelRenderer.render(context);
            }
            
           
          
            
           boolean shiftState = (state == VehicleState.STARTING_TO_SHIFT || state == VehicleState.SHIFTING || state == VehicleState.FINISHING_SHIFT);
          
            if(part instanceof PartContainer) {
            	
            	
            	
            	
            	
                for(Part renderablePart: ((PartContainer<Part>)part).getChildParts()) {
                    HierarchicalPartRenderer<Part, State> partRenderer = partRenderers.get(renderablePart);
                    if(partRenderer != null) {
                    	
                    	
                    	
                    	//System.out.println(partRenderer.);
                    	

  
                    	if(v.getConfiguration().performShiftAnimation()) {
                    		if(v.getConfiguration().shiftWithRight()) {
                    			if(renderablePart == VehiclePart.RIGHT_HAND) {
                    				
                            		if(part == VehiclePart.MAIN && !shiftState) {
                            			continue;
                            		}
                            		if(part == VehiclePart.STEERING_WHEEL && shiftState) {
                            	
                            			continue;
                            		}
                            	}
                    		} else {
                    			if(renderablePart == VehiclePart.LEFT_HAND) {
                    				
                            		if(part == VehiclePart.MAIN && !shiftState) {
                            			continue;
                            		}
                            		if(part == VehiclePart.STEERING_WHEEL && shiftState) {
                            			continue;
                            		}
                            	}
                    		}
                    	} else {
                    		
                    	}
                    	
                    	if(renderablePart == VehiclePart.RIGHT_HAND && (!v.getConfiguration().shiftWithRight() || !v.getConfiguration().performShiftAnimation())
                    			&& part == VehiclePart.MAIN) {
                    		continue;
                    		
                    	}
                    	
                    	if(renderablePart == VehiclePart.LEFT_HAND && (v.getConfiguration().shiftWithRight() || !v.getConfiguration().performShiftAnimation())
                    			&& part == VehiclePart.MAIN) {
                    		continue;
                    		
                    	}
                    	
                    	
                    	
                    	
//                        System.out.println("Rendering part " + renderablePart);
                        partRenderer.render(context);
                    }
                }
            }
        } finally {
            GL11.glPopMatrix();
        }
        
    }
}
