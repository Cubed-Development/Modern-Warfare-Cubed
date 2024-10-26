package com.paneedah.weaponlib.vehicle;

import com.paneedah.weaponlib.EntityClassFactory;
import com.paneedah.weaponlib.EntityConfiguration;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.vehicle.jimphysics.PhysicsConfiguration;
import com.paneedah.weaponlib.vehicle.jimphysics.Transmission;
import lombok.Getter;
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
import java.util.regex.Pattern;

import static com.paneedah.mwc.ProjectConstants.ID;

public class EntityVehicleConfiguration implements EntityConfiguration {

    @Getter
    public static class Seat {
        Vec3d seatPosition;

        public Seat(Vec3d position) {
            seatPosition = position;
        }


    }

    private static final int DEFAULT_TRACKING_RANGE = 160;
    private static final int DEFAULT_UPDATE_FREQUENCY = 3;

    public static class Builder {

        private static final Pattern $ = Pattern.compile("$", Pattern.LITERAL);
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

        private final Function<Double, Double> speedThreshold = s -> Double.valueOf(1.5 * s + 0.07);

        private final List<Seat> seats = new ArrayList<>();

        private final List<VehiclePart> installedParts = new ArrayList<>();

        private final VehicleSuspensionStrategy suspensionStrategy = new VehicleSuspensionStrategy.StepSuspensionStrategy(
                0.01f, 10f, 0.01f,
                0.1f, 7f, 0.01f,
                0.3f, 5f, 0.05f);

        public PhysicsConfiguration physicsConfig;


        public Builder withName(String name) {
            this.name = name;
            return this;
        }


        public Builder withPhysicsConfig(PhysicsConfiguration conf) {
            physicsConfig = conf;
            return this;
        }


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
            obbLength = length;
            obbWidth = width;
            obbHeight = height;
            return this;

        }

        public Builder withExitSound(String exitSound) {
            this.exitSound = exitSound.toLowerCase();
            return this;
        }

        public Builder withConstantRevSound(String constantRev) {
            constantRevSound = constantRev.toLowerCase();
            return this;
        }

        public Builder withShiftSettings(boolean perform, boolean rightHand) {
            doShiftAnim = perform;
            shiftWRight = rightHand;
            return this;
        }

        public Builder withIdleSound(String idleSound) {
            this.idleSound = idleSound.toLowerCase();
            return this;
        }

        public Builder withRevSounds(String baseRevString) {
            rev1 = $.matcher(baseRevString).replaceAll("1");
            rev2 = $.matcher(baseRevString).replaceAll("2");
            rev3 = $.matcher(baseRevString).replaceAll("3");
            rev4 = $.matcher(baseRevString).replaceAll("4");
            rev5 = $.matcher(baseRevString).replaceAll("5");
            rev6 = $.matcher(baseRevString).replaceAll("6");

            return this;
        }

        public Builder withRunSound(String runSound) {
            this.runSound = runSound.toLowerCase();
            return this;
        }


        public Builder customBlock() {


            return this;
        }

        public Builder withSeat(Vec3d seatPos) {
            seats.add(new Seat(seatPos));
            return this;
        }


        public Builder withRenderer(StatefulRenderer<VehicleRenderableState> hierarchicalRenderer) {
            renderer = hierarchicalRenderer;
            return this;
        }

        public EntityVehicleConfiguration build(ModContext context) {
            int modEntityId = entityIdSupplier.get().intValue();
            String entityName = name != null ? name : baseClass.getSimpleName() + "Ext" + modEntityId;

            EntityVehicleConfiguration configuration = new EntityVehicleConfiguration(this);

            configuration.enterSound = context.registerSound(enterSound);
            configuration.exitSound = context.registerSound(exitSound);
            configuration.idleSound = context.registerSound(idleSound);
            configuration.runSound = context.registerSound(runSound);
            configuration.constantRevSound = context.registerSound(constantRevSound);

            configuration.backfireSound = context.registerSound(backfireSound);
            configuration.gearshiftSound = context.registerSound(gearshiftSound);


            configuration.shiftRight = shiftWRight;
            configuration.doShiftAnim = doShiftAnim;


            //  configuration.engine = engine;

            configuration.physicsConfig = physicsConfig;
            //  configuration.transmission = transmission;

            configuration.obbLength = obbLength;
            configuration.obbWidth = obbWidth;
            configuration.obbHeight = obbHeight;

            configuration.rev1 = context.registerSound(rev1);
            configuration.rev2 = context.registerSound(rev2);
            configuration.rev3 = context.registerSound(rev3);
            configuration.rev4 = context.registerSound(rev4);
            configuration.rev5 = context.registerSound(rev5);
            configuration.rev6 = context.registerSound(rev6);

            // configuration.pattern = this.shiftPattern;

            Class<? extends Entity> entityClass = EntityClassFactory.getInstance()
                    .generateEntitySubclass(baseClass, modEntityId, configuration);

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
            boolean sendVelocityUpdates = true;
            net.minecraftforge.fml.common.registry.EntityRegistry.registerModEntity(new ResourceLocation(ID, entityName), entityClass, entityName, modEntityId, context.getMod(), DEFAULT_TRACKING_RANGE, DEFAULT_UPDATE_FREQUENCY, sendVelocityUpdates);

            ItemVehicle vehicleItem = new ItemVehicle(entityName, entityClass);

            vehicleItem.setRegistryName(ID, entityName); // temporary hack
            ForgeRegistries.ITEMS.register(vehicleItem);
            //System.out.println("Renderer Registrar: " + (ID + ":"  + entityName));
            //ModelLoader.setCustomModelResourceLocation(vehicleItem, 0, new net.minecraft.client.renderer.block.model.ModelResourceLocation(ID + ":"  + entityName, "inventory"));

            // register the item renderer


            if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
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


    @Getter
    private SoundEvent enterSound;
    @Getter
    private SoundEvent exitSound;
    @Getter
    private SoundEvent idleSound;
    @Getter
    private SoundEvent runSound;
    private SoundEvent constantRevSound;

    @Getter
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

    private final Builder builder;

    @Getter
    private PhysicsConfiguration physicsConfig;

    public EntityVehicleConfiguration(Builder builder) {
        this.builder = builder;
    }

    public boolean performShiftAnimation() {
        return doShiftAnim;
    }

    public boolean shiftWithRight() {
        return shiftRight;
    }

    public SoundEvent getRevSound(int id) {
        switch (id) {
            case 1:
                return rev1;
            case 2:
                return rev2;
            case 3:
                return rev3;
            case 4:
                return rev4;
            case 5:
                return rev5;
            case 6:
                return rev6;
        }
        return rev1;
    }

    public AxisAlignedBB getAABBforOBB() {
        return new AxisAlignedBB(-obbWidth, -obbHeight, -obbLength, obbWidth, obbHeight, obbLength);
    }

    public SoundEvent getConstantRev() {
        return constantRevSound;
    }

    public SoundEvent getShiftSound() {
        return gearshiftSound;
    }

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
