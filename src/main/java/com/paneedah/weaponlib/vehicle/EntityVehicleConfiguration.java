package com.paneedah.weaponlib.vehicle;

import com.paneedah.mwc.utils.ModReference;
import com.paneedah.weaponlib.EntityClassFactory;
import com.paneedah.weaponlib.EntityConfiguration;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.jimphysics.PhysicsConfiguration;
import com.paneedah.weaponlib.vehicle.jimphysics.Transmission;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class EntityVehicleConfiguration implements EntityConfiguration {

    public static class Seat {
    	Vec3d seatPosition;
    	
    	public Seat(Vec3d position) {
    		seatPosition = position;
    	}
    	
    	public Vec3d getSeatPosition() {
    		return seatPosition;
    	}
    	
    	
    }
/*
    private static final double DEFAULT_BACKWARD_DECCELERATION_FACTOR = 0.94;
    private static final double DEFAULT_FORWARD_DECCELERATION_FACTOR = 0.96;
    private static final double DEFAULT_ACCELERATION_INCREMENT = 0.02;
    private static final double DEFAULT_MIN_VELOCITY_THRESHOLD = 0.01;
    private static final double DEFAULT_ON_GROUND_FRICTION_FACTOR = 0.97;
    private static final double DEFAULT_IN_AIR_FRICTION_FACTOR = 0.99;
    private static final double DEFAULT_UNRIDDEN_DECCELERATION = 0.9;
    private static final double DEFAULT_IN_WATER_DECCELERATION = 0.95; */
    private static final int DEFAULT_TRACKING_RANGE = 160;
    private static final int DEFAULT_UPDATE_FREQUENCY = 3;

    public static class Builder {

        private Class<? extends Entity> baseClass = EntityVehicle.class;
        private String name;
        private Supplier<Integer> entityIdSupplier;
        
        private Transmission transmission;
        
        
        private StatefulRenderer<VehicleRenderableState> renderer;
        
        
        private double obbLength = 1.0;
        private double obbWidth = 1.0;
        private double obbHeight = 1.0;
        
        
        private String enterSound;
        private String exitSound;
        private String idleSound;
        private String runSound;
        private String constantRevSound;
        
        
        public boolean doShiftAnim;
        public boolean shiftWRight;
        
        private String backfireSound;
        private String gearshiftSound;
        
        
        private String rev1;
        private String rev2;
        private String rev3;
        private String rev4;
        private String rev5;
        private String rev6;

        /*
        private double backwardDeccelerationFactor = DEFAULT_BACKWARD_DECCELERATION_FACTOR;
        private double forwardDeccelerationFactor = DEFAULT_FORWARD_DECCELERATION_FACTOR;
        private double accelerationIncrement = DEFAULT_ACCELERATION_INCREMENT;
        private double minVelocityThreshold = DEFAULT_MIN_VELOCITY_THRESHOLD;
        private double onGroundFrictionFactor = DEFAULT_ON_GROUND_FRICTION_FACTOR;
        private double inAirFrictionFactor = DEFAULT_IN_AIR_FRICTION_FACTOR;

        private double unriddenDecceleration = DEFAULT_UNRIDDEN_DECCELERATION;
        private double inWaterDecceleration = DEFAULT_IN_WATER_DECCELERATION;

*/
        private int trackingRange = DEFAULT_TRACKING_RANGE;
        private int updateFrequency = DEFAULT_UPDATE_FREQUENCY;
        private boolean sendVelocityUpdates = true;

        private Function<Double, Double> speedThreshold = s -> 1.5 * s + 0.07;

        /*
        private double handlingFactor = 5.0;
        private Function<Double, Double> handling = s -> 0.075 * s * s * handlingFactor + 0.08 * s * handlingFactor;
        private Function<Double, Double> offGroundHandling = s -> 0.015 * s * s * handlingFactor + 0.016 * s * handlingFactor;

*/
        private List<Seat> seats = new ArrayList<>();

        private List<VehiclePart> installedParts = new ArrayList<>();

        private VehicleSuspensionStrategy suspensionStrategy  = new VehicleSuspensionStrategy.StepSuspensionStrategy(
                0.01f, 10f, 0.01f,
                0.1f, 7f, 0.01f,
                0.3f, 5f, 0.05f);
        
   //     private GearShiftPattern shiftPattern = null;
  //      private Engine engine;
        
        public PhysicsConfiguration physicsConfig;
        

        public Builder withName(String name) {
            this.name = name;
            return this;
        }
        
        
        public Builder withPhysicsConfig(PhysicsConfiguration conf) {
        	this.physicsConfig = conf;
        	return this;
        }
        /*
        public Builder withEngine(Engine engine) {
        	this.engine = engine;
        	return this;
        }
        
        public Builder withGearShiftPattern(GearShiftPattern pattern) {
        	this.shiftPattern = pattern;
        	return this;
        }*/
        

        public Builder withBaseClass(Class<? extends Entity> baseClass) {
            this.baseClass = baseClass;
            return this;
        }

        public Builder withEntityIdSupplier(Supplier<Integer> entityIdSupplier) {
            this.entityIdSupplier = entityIdSupplier;
            return this;
        }
        
        public Builder withBackfireSound(String backfireSound) {
        	this.backfireSound = backfireSound.toLowerCase();
        	return this;
        }

        public Builder withEnterSound(String enterSound) {
            this.enterSound = enterSound.toLowerCase();
            return this;
        }
        
        public Builder withGearshiftSound(String gearshiftSound) {
        	this.gearshiftSound = gearshiftSound.toLowerCase();
        	return this;
        }
        
        public Builder withOBBDimensions(double length, double width, double height) {
        	this.obbLength = length;
        	this.obbWidth = width;
        	this.obbHeight = height;
        	return this;
        	
        }

        public Builder withExitSound(String exitSound) {
            this.exitSound = exitSound.toLowerCase();
            return this;
        }
        
        public Builder withConstantRevSound(String constantRev) {
        	this.constantRevSound = constantRev.toLowerCase();
        	return this;
        }
        
        public Builder withShiftSettings(boolean perform, boolean rightHand) {
        	this.doShiftAnim = perform;
        	this.shiftWRight = rightHand;
        	return this;
        }

        public Builder withIdleSound(String idleSound) {
            this.idleSound = idleSound.toLowerCase();
            return this;
        }
        
        public Builder withRevSounds(String baseRevString) {
        	this.rev1 = baseRevString.replace("$", "1");
        	this.rev2 = baseRevString.replace("$", "2");
        	this.rev3 = baseRevString.replace("$", "3");
        	this.rev4 = baseRevString.replace("$", "4");
        	this.rev5 = baseRevString.replace("$", "5");
        	this.rev6 = baseRevString.replace("$", "6");
        	
        	return this;
        }
        /*
        public Builder withTransmission(Transmission transmission) {
        	this.transmission = transmission;
        	return this;
        }*/

        public Builder withRunSound(String runSound) {
            this.runSound = runSound.toLowerCase();
            return this;
        }

        /*
        public Builder withHandling(Function<Double, Double> handling) {
            this.handling = handling;
            return this;
        }

        public Builder withOffGroundHandling(Function<Double, Double> offGroundHandling) {
            this.offGroundHandling = offGroundHandling;
            return this;
        }

        public Builder withHandlingFactor(double handlingFactor) {
            this.handlingFactor = handlingFactor;
            return this;
        }

        public Builder withBackwardDeccelerationFactor(double backwardDeccelerationFactor) {
            this.backwardDeccelerationFactor = backwardDeccelerationFactor;
            return this;
        }

        public Builder withForwardDeccelerationFactor(double forwardDeccelerationFactor) {
            this.forwardDeccelerationFactor = forwardDeccelerationFactor;
            return this;
        }

        public Builder withAccelerationIncrement(double accelerationIncrement) {
            this.accelerationIncrement = accelerationIncrement;
            return this;
        }

        public Builder withMinVelocityThreshold(double minVelocityThreshold) {
            this.minVelocityThreshold = minVelocityThreshold;
            return this;
        } */
        
        
        public Builder customBlock() {
        	
        	
        	
        	return this;
        }

        /*
        public Builder withOnGroundFrictionFactor(double onGroundFrictionFactor) {
            this.onGroundFrictionFactor = onGroundFrictionFactor;
            return this;
        }

        public Builder withInAirFrictionFactor(double inAirFrictionFactor) {
            this.inAirFrictionFactor = inAirFrictionFactor;
            return this;
        }

        public Builder withUnriddenDecceleration(double unriddenDecceleration) {
            this.unriddenDecceleration = unriddenDecceleration;
            return this;
        }

        public Builder withInWaterDecceleration(double inWaterDecceleration) {
            this.inWaterDecceleration = inWaterDecceleration;
            return this;
        }

        public Builder withSpeedThreshold(Function<Double, Double> speedThreshold) {
            this.speedThreshold = speedThreshold;
            return this;
        } */

        public Builder withSeat(Vec3d seatPos) {
            this.seats.add(new Seat(seatPos));
            return this;
        }

       
        public Builder withRenderer(StatefulRenderer<VehicleRenderableState> hierarchicalRenderer) {
            this.renderer = hierarchicalRenderer;
            return this;
        }

        public EntityVehicleConfiguration build(ModContext context) {
            int modEntityId = entityIdSupplier.get();
            String entityName = name != null ? name : baseClass.getSimpleName() + "Ext" + modEntityId;

            EntityVehicleConfiguration configuration = new EntityVehicleConfiguration(this);

            configuration.enterSound = context.registerSound(enterSound);
            configuration.exitSound = context.registerSound(exitSound);
            configuration.idleSound = context.registerSound(idleSound);
            configuration.runSound = context.registerSound(runSound);
            configuration.constantRevSound = context.registerSound(constantRevSound);
            
            configuration.backfireSound = context.registerSound(backfireSound);
            configuration.gearshiftSound = context.registerSound(gearshiftSound);
            
            
            configuration.shiftRight = this.shiftWRight;
            configuration.doShiftAnim = this.doShiftAnim;
            
            
          //  configuration.engine = engine;
            
            configuration.physicsConfig = physicsConfig;
          //  configuration.transmission = transmission;
            
            configuration.obbLength = this.obbLength;
            configuration.obbWidth = this.obbWidth;
            configuration.obbHeight = this.obbHeight;
            
            configuration.rev1 = context.registerSound(rev1);
            configuration.rev2 = context.registerSound(rev2);
            configuration.rev3 = context.registerSound(rev3);
            configuration.rev4 = context.registerSound(rev4);
            configuration.rev5 = context.registerSound(rev5);
            configuration.rev6 = context.registerSound(rev6);
            
           // configuration.pattern = this.shiftPattern;

            Class<? extends Entity> entityClass = EntityClassFactory.getInstance()
                    .generateEntitySubclass(baseClass, modEntityId, configuration);

            net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ModReference.ID, entityName),entityClass, entityName, modEntityId, context.getMod(), trackingRange, updateFrequency, sendVelocityUpdates);

            ItemVehicle vehicleItem = new ItemVehicle(entityName, entityClass);

            vehicleItem.setRegistryName(ModReference.ID, entityName); // temporary hack
            ForgeRegistries.ITEMS.register(vehicleItem);
            //System.out.println("Renderer Registrar: " + (ModReference.id + ":"  + entityName));
            //ModelLoader.setCustomModelResourceLocation(vehicleItem, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(ModReference.id + ":"  + entityName, "inventory"));
            
            // register the item renderer
          
            
            
           // System.out.println("VEHICLE REGISTRY NAME: " + vehicleItem.getRegistryName());
           // 
//            if(spawnEgg) {
//                compatibility.registerEgg(context, entityClass, entityName, primaryEggColor, secondaryEggColor);
//            }

            if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
                RendererRegistration.registerRenderableEntity(context, entityClass, renderer);
            }
            return new EntityVehicleConfiguration(this);
        }

        private static class RendererRegistration {
            /*
             * This method is wrapped into a static class to facilitate conditional client-side only loading
             */
            private static void registerRenderableEntity(ModContext modContext, 
                    Class<? extends Entity> entityClass, 
                    StatefulRenderer<VehicleRenderableState> renderer) {
                modContext.registerRenderableEntity(entityClass, new RenderVehicle2(renderer));
            }
        }

		public Builder customBlock(Object object) {
			// TODO Auto-generated method stub
			return null;
		}
    }
    
    //public Transmission transmission;
    

    private SoundEvent enterSound;
    private SoundEvent exitSound;
    private SoundEvent idleSound;
    private SoundEvent runSound;
    private SoundEvent constantRevSound;
    
    private SoundEvent backfireSound;
    private SoundEvent gearshiftSound;
    
    
    
    public boolean shiftRight;
    public boolean doShiftAnim;
    
    
    private SoundEvent rev1;
    private SoundEvent rev2;
    private SoundEvent rev3;
    private SoundEvent rev4;
    private SoundEvent rev5;
    private SoundEvent rev6;
    
    
    private double obbLength;
    private double obbWidth;
    private double obbHeight;
    
    private Builder builder;
    
    private PhysicsConfiguration physicsConfig;
    
//    private GearShiftPattern pattern;
    
 //   private Engine engine;

    public EntityVehicleConfiguration(Builder builder) {
        this.builder = builder;
    }
    
    public PhysicsConfiguration getPhysicsConfig() {
    	return this.physicsConfig;
    }
    
    /*
    public GearShiftPattern getPattern() {
    	return this.pattern;
    }
    
    public Engine getEngine() {
    	return this.engine;
    }*/
    
    public boolean performShiftAnimation() {
    	return this.doShiftAnim;
    }
    
    public boolean shiftWithRight() {
    	return this.shiftRight;
    }
    
    public SoundEvent getRevSound(int id) {
    	switch(id) {
	    	case 1: return rev1;
	    	case 2: return rev2;
	    	case 3: return rev3;
	    	case 4: return rev4;
	    	case 5: return rev5;
	    	case 6: return rev6;
    	}
    	return rev1;
    }
    
    public AxisAlignedBB getAABBforOBB() {
    	return new AxisAlignedBB(-this.obbWidth, -obbHeight, -obbLength, this.obbWidth, obbHeight, obbLength);
    }

    /*
    public Transmission getVehicleTransmission() {
    	return transmission;
    }*/
    
    public SoundEvent getEnterSound() {
        return enterSound;
    }

    public SoundEvent getExitSound() {
        return exitSound;
    }

    public SoundEvent getIdleSound() {
        return idleSound;
    }

    public SoundEvent getRunSound() {
        return runSound;
    }
    
    public SoundEvent getConstantRev() {
    	return constantRevSound;
    }
    
    public SoundEvent getBackfireSound() {
    	return this.backfireSound;
    }
    
    public SoundEvent getShiftSound() {
    	return this.gearshiftSound;
    }

    /*
    public Function<Double, Double> getHandling() {
        return builder.handling;
    }

    public Function<Double, Double> getOffGroundHandling() {
        return builder.offGroundHandling;
    }
    
    
    

    public double getBackwardDeccelerationFactor() {
        return builder.backwardDeccelerationFactor;
    }

    public double getForwardDeccelerationFactor() {
        return builder.forwardDeccelerationFactor;
    }

    public double getAccelerationIncrement() {
        return builder.accelerationIncrement;
    }

    public double getMinVelocityThreshold() {
        return builder.minVelocityThreshold;
    }

    public double getOnGroundFrictionFactor() {
        return builder.onGroundFrictionFactor;
    }

    public double getInAirFrictionFactor() {
        return builder.inAirFrictionFactor;
    }

    public double getUnriddenDecceleration() {
        return builder.unriddenDecceleration;
    }

    public double getInWaterDecceleration() {
        return builder.inWaterDecceleration;
    }

    public Function<Double, Double> getSpeedThreshold() {
        return builder.speedThreshold;
    }
*/
    public VehicleSuspensionStrategy getSuspensionStrategy() {
        return builder.suspensionStrategy;
    }
    
    

    public List<Seat> getSeats() {
        return Collections.unmodifiableList(builder.seats);
    }
    
    public Seat getSeatAtIndex(int i) {
    	return builder.seats.get(i);
    }

    public List<VehiclePart> getParts() {
        return builder.installedParts;
    }
}
