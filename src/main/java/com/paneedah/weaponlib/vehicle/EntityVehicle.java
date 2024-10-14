package com.paneedah.weaponlib.vehicle;

import com.google.common.collect.Lists;
import com.paneedah.mwc.network.messages.VehicleControlMessage;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Randomizer;
import com.paneedah.weaponlib.compatibility.sound.EngineMovingSound;
import com.paneedah.weaponlib.particle.DriftSmokeFX;
import com.paneedah.weaponlib.particle.vehicle.DriftCloudParticle;
import com.paneedah.weaponlib.particle.vehicle.ExhaustParticle;
import com.paneedah.weaponlib.particle.vehicle.TireTracks;
import com.paneedah.weaponlib.particle.vehicle.VehicleExhaustFlameParticle;
import com.paneedah.weaponlib.state.ExtendedState;
import com.paneedah.weaponlib.vehicle.collisions.*;
import com.paneedah.weaponlib.vehicle.jimphysics.InterpolationKit;
import com.paneedah.weaponlib.vehicle.jimphysics.Transmission;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.VehiclePhysicsSolver;
import com.paneedah.weaponlib.vehicle.jimphysics.solver.WheelSolver;
import com.paneedah.weaponlib.vehicle.network.VehicleDataContainer;
import com.paneedah.weaponlib.vehicle.network.VehicleDataSerializer;
import com.paneedah.weaponlib.vehicle.network.VehiclePhysSerializer;
import com.paneedah.weaponlib.vehicle.network.VehicleSmoothShell;
import com.paneedah.weaponlib.vehicle.smoothlib.PTIVec;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import lombok.Getter;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.client.audio.PositionedSound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.*;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import javax.vecmath.Vector3d;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.mwc.proxies.ClientProxy.MC;

/*   __      __  _     _      _           
	 \ \    / / | |   (_)    | |          
	  \ \  / /__| |__  _  ___| | ___  ___ 
	   \ \/ / _ \ '_ \| |/ __| |/ _ \/ __|
	    \  /  __/ | | | | (__| |  __/\__ \
	     \/ \___|_| |_|_|\___|_|\___||___/       
	     
	   ~ by Victor Matskiv and Jim Holden ~
 * 
 */

public class EntityVehicle extends Entity implements Configurable<EntityVehicleConfiguration>,
        ExtendedState<VehicleState>, IDynamicCollision, Contextual {

    private enum DriverInteractionEvent {
        NONE, ENTER, EXIT, DRIVING, OUT
    }

    public boolean vehicleIsRunning = false;

    /*
     * GENERIC VARIABLES (misc variables)
     */
    private EntityVehicleConfiguration configuration;
    private VehicleState vehicleState = VehicleState.IDLE;
    private VehicleDrivingAspect drivingAspect = new VehicleDrivingAspect();
    private final DriverInteractionEvent driverInteractionEvent = DriverInteractionEvent.NONE;
    private long stateUpdateTimestamp;
    private Randomizer randomizer;
    public float outOfControlTicks = 0.0F;
    private int lerpSteps;

    public float deltaRotation;

    //
    private double boatPitch;
    private double lerpY;
    private double lerpZ;
    private double boatYaw;
    private double lerpXRot;

    public static final DataParameter<VehicleDataSerializer> VEHICLE_DAT = EntityDataManager
            .createKey(EntityVehicle.class, VehicleDataSerializer.SERIALIZER);
    public static final DataParameter<VehiclePhysSerializer> SOLVER_DAT = EntityDataManager
            .createKey(EntityVehicle.class, VehiclePhysSerializer.SERIALIZER);

    public ModContext context;

    public float prevLiftOffset = 0.0f;
    public float liftOffset = 0.0f;

    /*
     * SOUND DECLARATIONS/VARIABLES
     */

    private final Supplier<Vector3D> soundPositionProvider = () -> new Vector3D(posX, posY, posZ);
    private final Supplier<Boolean> donePlayingSoundProvider = () -> isDead;
    private final Supplier<Boolean> isDorifto = () -> Boolean.valueOf(!getSolver().isDrifting);
    private final Supplier<Float> doriftoSoundProvider = () -> Float.valueOf(1.0f);

    /*
     * PHYSICS + COLLISION VARIABLES
     */
    public OreintedBB oreintedBoundingBox;

    // rot
    @Getter
    public float wheelRotationAngle;
    public float prevWheelRotationAngle;

    public VehiclePhysicsSolver solver;
    public double steerangle;
    public double throttle = 0;
    public double angularvelocity = 0;

    public double forwardLean = 0.0;
    public double sideLean = 0.0;

    public double prevSideLean;

    public double driftTuner = 0.0;
    public boolean isBraking = false;

    public double rideOffset = 0.0;

    public float rotationRoll = 0.0f;
    public float prevRotationRoll = 0.0f;

    public float rotationRollH = 0.0f;
    public float prevRotationRollH = 0.0f;

    public double prevLastYawDelta = 0.0;
    @Getter
    public double lastYawDelta = 0.0;

    public boolean isReversing = false;
    private float nextStepDistance;
    private float nextFlap;
    private int fire;

    public boolean reverseLockout = true;

    /*
     * Animations
     */
    public PTIVec smoothShift = new PTIVec();

    /*
     * Sounds
     */

    public MovingSound drivingSound;
    public MovingSound driftingSound;

    /*
     * CONSTRUCTORS
     */

    public VehicleSmoothShell smoothShell;

    public int clutchTimer = 0;

    public List<Entity> riddenByEntities = Lists.newArrayList();

    public EntityVehicle(World worldIn) {
        super(worldIn);


        this.ignoreFrustumCheck = true;

        smoothShell = new VehicleSmoothShell(this);
        //this.setSize(0.2F, 0.1f);
        setSize(0.2f, 0.5f);

        oreintedBoundingBox = new OreintedBB(getConfiguration().getAABBforOBB());
    }


    public EntityVehicle(World worldIn, double x, double y, double z) {
        this(worldIn);
        setPosition(x, y, z);

        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
    }

    /**
     * Initializes the vehicle.
     */
    @Override
    protected void entityInit() {

        getDataManager().register(VEHICLE_DAT, new VehicleDataSerializer(this));
        getDataManager().register(SOLVER_DAT, new VehiclePhysSerializer(getSolver()));
    }

    /*
     * Data manager
     */

    /*
     * IMPORTANT GETTERS
     */

    public int getCurrentRiders() {
        return getPassengers().size();
    }

    public int getCarMaxPersonnel() {
        return getConfiguration().getSeats().size();
    }

    public VehiclePhysicsSolver getSolver() {
        updateSolver();
        return solver;
    }

    @Override
    public EntityVehicleConfiguration getConfiguration() {
        if (configuration == null) {
            configuration = (EntityVehicleConfiguration) EntityClassFactory.getInstance().getConfiguration(getClass());
        }
        return configuration;
    }

    @Override
    public OreintedBB getOreintedBoundingBox() {
        if (oreintedBoundingBox == null) {
            oreintedBoundingBox = new OreintedBB(getConfiguration().getAABBforOBB());
        }
        return oreintedBoundingBox;
    }

    public float getInterpolatedWheelRotation() {
        return (float) InterpolationKit.interpolateValue(prevWheelRotationAngle, wheelRotationAngle,
                MC.getRenderPartialTicks());
    }

    public float getInterpolatedYawDelta() {
        return (float) InterpolationKit.interpolateValue(prevLastYawDelta, lastYawDelta,
                MC.getRenderPartialTicks());
    }

    public double getSpeed() {
        updateSolver();
        return solver.synthAccelFor;
    }

    @Override
    public VehicleState getState() {
        return vehicleState;
    }

    @Override
    public long getStateUpdateTimestamp() {
        return stateUpdateTimestamp;
    }

    public Randomizer getRandomizer() {
        if (randomizer == null) {
            randomizer = new Randomizer();
        }
        return randomizer;
    }

    public VehicleSuspensionStrategy getSuspensionStrategy() {
        return getConfiguration().getSuspensionStrategy();
    }

    @Nullable
    public Entity getControllingPassenger() {
        List<Entity> list = getPassengers();
        return list.isEmpty() ? null : list.get(0);
    }

    /*
     * LOGIC
     */

    @Override
    public void updatePassenger(Entity passenger) {


        if (isPassenger(passenger)) {


            if (passenger.motionY == 0) {
                passenger.motionY = 0.00001;
            }
            float f = 0.0F;
            float f1 = (float) ((this.isDead ? 0.009999999776482582D : getMountedYOffset())
                    + passenger.getYOffset());

            int i = getPassengers().indexOf(passenger);
            Vec3d seatOffset = getConfiguration().getSeatAtIndex(i).getSeatPosition();
            //System.out.println(passenger + " | " + i);
            if (i == 1) {
                seatOffset = new Vec3d(-1, -0.3, -1);
            }


            if (getPassengers().size() > 1) {

                if (i == 0) {
                    f = 0.2F;
                } else {
                    f = -0.6F;
                }

                if (passenger instanceof EntityAnimal) {
                    f = (float) ((double) f + 0.2D);
                }
            }

            // Vec3d vec3d = Vec3d.ZERO;
            Vec3d vec3d = (new Vec3d(f, 0.0D, 0.0D))
                    .rotateYaw(-this.rotationYaw * 0.017453292F - ((float) Math.PI / 2F));

            /*
             * float muRoll = (float) ((1 -
             * Math.cos(MC.getRenderPartialTicks() * Math.PI)) / 2f);
             * float roll = (prevRotationRollH+prevRotationRoll) +
             * ((rotationRoll+rotationRollH)-(prevRotationRoll+prevRotationRollH))*muRoll;
             *
             * rotationYaw = 0; rotationRoll = 45f; rotationRollH = 0f;
             *
             *
             *
             *
             * double interpH = 1.0*(roll/45f); if(!world.isRemote) {
             * System.out.println("Interpolated: " + interpH); }
             *
             * double h = interpH * Math.signum(roll); float aPRX = (float)
             * -(Math.cos(Math.toRadians(roll))*h); float aPRY = (float)
             * -(Math.sin(Math.toRadians(roll))*h);
             *
             * System.out.println(rotationYaw-130);
             *
             * //Vec3d apr = new Vec3d(aPRX/2, aPRY, aPRX); Vec3d apr = new Vec3d(-aPRX,
             * aPRY, 10.0); if(aPRX == 1.0f || aPRX == -1.0f) aPRX = 0.0f;
             */

            float mu = (float) ((1 - Math.cos(0.5f * Math.PI)) / 2f);
            float iRoll = (prevRotationRollH + prevRotationRoll)
                    + ((rotationRoll + rotationRollH) - (prevRotationRoll + prevRotationRollH)) * mu;
            float iPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * mu;

            // rotationRoll = 30f;

            Vec3d apr = new Vec3d(this.posX /* + vec3d.x + seatOffset.x */, this.posY /* + (double)f1 + seatOffset.y */,
                    this.posZ /* + vec3d.z + seatOffset.z */);

            float nin = (float) Math.toRadians(90);
            Vec3d tBro = new Vec3d(seatOffset.x, seatOffset.y, seatOffset.z).rotatePitch((float) Math.toRadians(iPitch))
                    .rotateYaw((float) Math.toRadians(-rotationYaw));

            passenger.setPosition(apr.x + tBro.x, apr.y + tBro.y, apr.z + tBro.z);

            passenger.rotationYaw += deltaRotation;
            passenger.setRotationYawHead(passenger.getRotationYawHead() + deltaRotation);

            applyYawToEntity(passenger);

            if (passenger instanceof EntityAnimal && getPassengers().size() > 1) {
                int j = passenger.getEntityId() % 2 == 0 ? 90 : 270;
                passenger.setRenderYawOffset(((EntityAnimal) passenger).renderYawOffset + (float) j);
                passenger.setRotationYawHead(passenger.getRotationYawHead() + (float) j);
            }
        }

    }

    protected void applyYawToEntity(Entity entityToUpdate) {
        entityToUpdate.setRenderYawOffset(this.rotationYaw);
        float f = MathHelper.wrapDegrees(entityToUpdate.rotationYaw - this.rotationYaw);
        float f1 = MathHelper.clamp(f, -105.0F, 105.0F);
        entityToUpdate.prevRotationYaw += f1 - f;
        entityToUpdate.rotationYaw += f1 - f;
        entityToUpdate.setRotationYawHead(entityToUpdate.rotationYaw);
    }


    @Override
    protected void removePassenger(Entity passenger) {

        Vec3d p = (new Vec3d(2, 0, 1)).rotatePitch((float) Math.toRadians(rotationPitch))
                .rotateYaw((float) Math.toRadians(-rotationYaw));
        passenger.move(MoverType.SELF, p.x, p.y, p.z);


        Vec3d speed = getSolver().getVelocityVector().scale(0.5);
        double bruh = 0.0;
        if (speed.length() != 0.0) {
        }
        passenger.addVelocity(speed.x, speed.y, speed.z);

        super.removePassenger(passenger);

    }

    public boolean processInitialInteract(EntityPlayer player, EnumHand hand) {


        if (player.isSneaking()) {
            return false;
        } else {
            if (!this.world.isRemote && outOfControlTicks < 60.0F && canFitPassenger(player)) {
                player.startRiding(this);
            }

            return true;
        }
    }

    public boolean canFitPassenger(Entity passenger) {
        return getCurrentRiders() + 1 <= getCarMaxPersonnel();
    }

    public boolean isSteeredForward() {
        return !isReversing;
    }

    public boolean isSteeredBackward() {
        return isReversing;
    }

    @Override
    public boolean canBeCollidedWith() {
        return !this.isDead;
    }

    @SideOnly(Side.CLIENT)
    public void updateInputs(boolean left, boolean right, boolean forward, boolean back) {
        /*
         * Key Inputs
         */
    }

    @Override
    public boolean setState(VehicleState vehicleState) {
        this.vehicleState = vehicleState;

        // DEBUG: System.out.println("State changed to " + vehicleState);

        stateUpdateTimestamp = System.currentTimeMillis();
        return false;
    }

    @Override
    public void updateOBB() {
        Vec3d d = getSolver().getPhysConf().dimensions;
        Vec3d corDim = new Vec3d(d.y, d.z, d.x);


        AxisAlignedBB bb = AABBTool.createAABB(corDim.scale(-0.5), corDim.scale(0.5));
        bb = bb.offset(0.5, 1.0, 0.0).grow(0.0, -0.2, 0.0);
        oreintedBoundingBox = OreintedBB.fromAABB(bb, getPositionVector());

        oreintedBoundingBox.setPosition(posX, posY, posZ);
        oreintedBoundingBox.setRotation(Math.toRadians(180 - rotationYaw), Math.toRadians(this.rotationPitch),
                Math.toRadians(rotationRoll + rotationRollH));

    }

    public void updateSolver() {
        if (solver == null) {
            solver = getConfiguration().getPhysicsConfig().getPhysicsSolver().clone();

            if (solver.vehicle == null) {
                solver.activate(this);
            }
        }
    }

    private void tickLerp() {
        if (lerpSteps > 0 && !canPassengerSteer()) {
            double d0 = this.posX + (boatPitch - this.posX) / (double) lerpSteps;
            double d1 = this.posY + (lerpY - this.posY) / (double) lerpSteps;
            double d2 = this.posZ + (lerpZ - this.posZ) / (double) lerpSteps;
            double d3 = MathHelper.wrapDegrees(boatYaw - (double) this.rotationYaw);
            this.rotationYaw = (float) ((double) this.rotationYaw + d3 / (double) lerpSteps);
//            this.rotationPitch = (float)((double)this.rotationPitch + (this.lerpXRot - (double)this.rotationPitch) / (double)this.lerpSteps);
            --lerpSteps;
            setPosition(d0, d1, d2);
            setRotation(this.rotationYaw, this.rotationPitch);
        }
    }

    @SideOnly(Side.CLIENT)
    public void setPositionAndRotationDirect(double x, double y, double z, float yaw, float pitch,
                                             int posRotationIncrements, boolean teleport) {
        boatPitch = x;
        lerpY = y;
        lerpZ = z;
        boatYaw = yaw;
        lerpXRot = pitch;
        lerpSteps = 10;
    }

    @Override
    protected void addPassenger(Entity passenger) {
        super.addPassenger(passenger);
        if (canPassengerSteer() && lerpSteps > 0) {
            lerpSteps = 0;
            this.posX = boatPitch;
            this.posY = lerpY;
            this.posZ = lerpZ;
            this.rotationYaw = (float) boatYaw;
            this.rotationPitch = (float) lerpXRot;
        }
    }

    /*
     * CONTROLLING
     */

    public void keyBasedSteering() {

        double angle = Math.toDegrees(steerangle);
        double sensitivity = 5;
        if (KeyBindings.vehicleTurnLeft.isKeyDown()) {
            angle -= sensitivity;
        }

        if (KeyBindings.vehicleTurnRight.isKeyDown()) {
            angle += sensitivity;
        }

        if (angle < -45.0F) {
            angle = -45.0F;
        }
        if (angle > 45.0F) {
            angle = 45.0F;
        }

        steerangle = Math.toRadians(angle);


    }

    /**
     * Unless you are trying to add self-driven vehicles, please keep this on client
     */
    public void updateSteering(EntityPlayer driver) {

        float yaw = driver.rotationYaw;
        float pitch = driver.rotationPitch;

        float f = 1.0f;
        double motionX = -MathHelper.sin(yaw / 180.0F * (float) Math.PI)
                * MathHelper.cos(pitch / 180.0F * (float) Math.PI) * f;
        double motionZ = MathHelper.cos(yaw / 180.0F * (float) Math.PI)
                * MathHelper.cos(pitch / 180.0F * (float) Math.PI) * f;
        double motionY = -MathHelper.sin((pitch) / 180.0F * (float) Math.PI) * f;
        Vec3d dirVec = new Vec3d(motionX, 0, motionZ);
        Vec3d oreintVec = Vec3d.fromPitchYaw(this.rotationPitch, this.rotationYaw);

        double det = dirVec.crossProduct(oreintVec).y;
        if (det > 0) {
            det = 1;
        } else {
            det = -1;
        }
        Vector3d dir = new Vector3d(dirVec.x, dirVec.y, dirVec.z);
        Vector3d ore = new Vector3d(oreintVec.x, oreintVec.y, oreintVec.z);
        double aT = Math.toDegrees(dir.angle(ore)) / 2;
        double steeringAngle = aT * det * -1;
        if (aT < -45.0F) {
            aT = -45.0F;
        }
        if (aT > 45.0F) {
        }
        steerangle = Math.toRadians(-steeringAngle);

    }

    public boolean isVehicleRunning() {
        return vehicleIsRunning;
    }

    /**
     * Updates the vehicles controls, like throttle, braking, handbraking,
     * drift-tuning, etc.
     */
    @SideOnly(Side.CLIENT)
    public void updateControls() {


        Transmission trans = getSolver().transmission;

        if (KeyBindings.vehicleTurnOff.isPressed()) {
            if (isVehicleRunning()) {

                vehicleIsRunning = false;
                drivingSound = null;
                CustomGui.vehicleGUIOverlay.keyAnimator.removeKey();
            } else {

                vehicleIsRunning = true;
                drivingSound = null;
                CustomGui.vehicleGUIOverlay.keyAnimator.turnKey();
            }
        }

        if (!trans.isReverseGear) {
            /*
             * HOW THE CONTROLS WORK UNDER NORMAL CONDITIONS (NO REVERSING!)
             */
            if (isVehicleRunning()) {
                if (KeyBindings.vehicleThrottle.isKeyDown()) {
                    reverseLockout = true;
                    if (throttle < 1) {
                        throttle += 0.1;
                    }
                } else {
                    if (throttle > 0) {
                        throttle -= 0.1;
                    }
                }

                if (getSolver().getVelocityVector().length() < 0.5 && !KeyBindings.vehicleBrake.isKeyDown()) {
                    reverseLockout = false;
                }
            }


            if (KeyBindings.vehicleBrake.isKeyDown()) {

                // REVERSE LOCKOUT ALLOWS THE PROCESS TO BE SMOOTHER;
                // YOU HAVE TO LET GO OF THE BRAKE TO ENTER REVERSE.
                if (isVehicleRunning()) {
                    if (getSolver().getVelocityVector().length() < 0.5 && !reverseLockout) {
                        trans.enterReverse();
                    }
                }


                isBraking = true;
            } else {
                isBraking = false;
            }

        } else if (isVehicleRunning()) {
            /*
             * HOW THE CONTROLS WORK UNDER REVERSE CONDITIONS
             */

            if (KeyBindings.vehicleThrottle.isKeyDown()) {

                if (getSolver().getVelocityVector().length() < 2.5) {
                    trans.exitReverse();
                }

                isBraking = true;
            } else {
                isBraking = false;
            }

            if (KeyBindings.vehicleBrake.isKeyDown()) {
                if (throttle < 1) {
                    throttle += 0.1;
                }
            } else {
                if (throttle > 0) {
                    throttle -= 0.1;
                }
            }

        }

        if (throttle < 0) {
            throttle = 0;
        }
        if (throttle > 1) {
            throttle = 1;
        }

        //throttle = 0;

        if (isVehicleRunning()) {
            if (KeyBindings.vehicleHandbrake.isKeyDown()) {
                solver.applyHandbrake();
            } else {
                solver.releaseHandbrake();
            }
        }

        //driftTuner = 0;


        if (KeyBindings.vehicleClutch.isKeyDown()) {
            getSolver().transmission.declutch();
        } else {
            getSolver().transmission.clutch();
        }


        if (!KeyBindings.vehicleTurnLeft.isKeyDown() && !KeyBindings.vehicleTurnRight.isKeyDown()) {
            steerangle *= 0.6;
        } else {
            steerangle *= 0.8;
        }

        // MOUSE BASED steerangle *= 0.5;
        int mA = 45;

        // Code below fixes bug where players are unable
        // to become Takumi Fujiwara, even when listening to
        // EuroBeat. This allows you to do the C-121, so you
        // will win the Usui Pass Battle.
        /*
         * if(Keyboard.isKeyDown(Keyboard.KEY_A)) { driftTuner -= 5; if(driftTuner <
         * -mA) driftTuner = -mA; } else if( Keyboard.isKeyDown(Keyboard.KEY_D) ) {
         * driftTuner += 5; if(driftTuner > mA) driftTuner = mA; } else { double newTune
         * = ((Math.abs(driftTuner) - 5))*Math.signum(driftTuner); driftTuner = newTune;
         * if(driftTuner < -mA) driftTuner = -mA;
         *
         * }
         */

        double maxSteerAngle = 35;
        double dSA = Math.toDegrees(steerangle);
        if (dSA > maxSteerAngle) {
            steerangle = Math.toRadians(maxSteerAngle);
        }
        if (dSA < -maxSteerAngle) {
            steerangle = Math.toRadians(-maxSteerAngle);
        }
        prevLastYawDelta = lastYawDelta;
        lastYawDelta = steerangle;

        prevWheelRotationAngle = wheelRotationAngle;
        double angVel = getRealSpeed();
        wheelRotationAngle += (float) (angVel % 360); // wheelRotationAngle = 0.0f;
        // wheelRotationAngle -= (float) solver.velocity.length();

    }

    /*
     * COLLISIONS
     */


    /**
     * <a href="https://research.ncl.ac.uk/game/mastersdegree/gametechnologies/physicstutorials/5collisionresponse/Physics%20-%20Collision%20Response.pdf">...</a>
     */
    @Override
    public void doOBBCollision() {
        OreintedBB obb = getOreintedBoundingBox();
        //if(1+1==2) return;


        if (Math.abs(rotationPitch) < 0.0000001) {
            List<AxisAlignedBB> list3 = this.world.getCollisionBoxes(this, getEntityBoundingBox().grow(3).expand(1, 1, 1));

            OreintedBB bb = getOreintedBoundingBox();
            GJKResult bestResult = new GJKResult();

            for (AxisAlignedBB aabb : list3) {
                Vec3d pos = new Vec3d(aabb.maxX - 0.5, aabb.maxY - 0.5, aabb.maxZ - 0.5);
                AxisAlignedBB fixedBB = aabb.offset(pos.scale(-1));

                GJKResult result = OBBCollider.areColliding(bb, OreintedBB.fromAABB(fixedBB, pos));
                if (result.status == GJKResult.Status.COLLIDING && result.penetrationDepth > bestResult.penetrationDepth) {
                    bestResult = result;
                }

            }

            if (bestResult.status != GJKResult.Status.COLLIDING) {
                return;
            }

            Vec3d normal = bestResult.separationVector;

            double yawInertia = 1 / getSolver().getPhysConf().getVehicleMassObject().inertia.m11;

            // PROJECTION
            double a = 1;

            //if(solver.velocity.length() > 15) a = 0.5;
            Vec3d aSep = normal.scale(-bestResult.penetrationDepth * a);
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            if (aSep.length() > 0.1) {
                aSep = aSep.scale(1 / (aSep.length() / 0.1));
            }
            // System.out.println(aSep.length());
            setPosition(this.posX + aSep.x, this.posY/*+aSep.y*/, this.posZ + aSep.z);


            double totalMass = 1 / getSolver().getPhysConf().getVehicleMassObject().mass;
            Vec3d relativeA = bestResult.contactPointA.subtract(getPositionVector()).rotateYaw((float) Math.toRadians(rotationYaw));

            Vec3d angularVelocityA = new Vec3d(0.0, getSolver().angularVelocity, 0.0).crossProduct(relativeA);

            Vec3d fullVelocityA = getSolver().velocity.add(angularVelocityA);

            Vec3d contactVelocity = fullVelocityA.scale(-1);

            double impulseForce = contactVelocity.dotProduct(normal);

            Vec3d inertiaA = relativeA.crossProduct(normal).scale(yawInertia).crossProduct(relativeA);

            double angularEffect = inertiaA.dotProduct(normal);

            double restitution = 0.30;

            double j = (-(1.0 + restitution) * impulseForce) / (totalMass + angularEffect);

            Vec3d fullImpulse = normal.scale(j);

            getSolver().velocity = getSolver().velocity.add(fullImpulse.scale(-1).scale(totalMass));

            Vec3d angularImpulse = relativeA.crossProduct(fullImpulse).scale(-1);
            getSolver().angularVelocity += angularImpulse.scale(yawInertia).y * 0.02;


        }


    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox() {
        // TODO Auto-generated method stub
        return null;
    }

    public void oldCollisions() {

        // DO BLOCK SHIT
        OreintedBB carBound = getOreintedBoundingBox();
		
		/* functional
		if(Math.abs(rotationPitch) < 0.0000001) {
			List<AxisAlignedBB> list3 = this.world.getCollisionBoxes(this, this.getEntityBoundingBox().grow(3).expand(1, 1, 1));
		    
	        OreintedBB bb = this.getOreintedBoundingBox();
	        GJKResult bestResult = new GJKResult();
	         
	         for(AxisAlignedBB aabb : list3) {
	             
	             Vec3d pos = new Vec3d(aabb.maxX-0.5, aabb.maxY-0.5, aabb.maxZ-0.5);
	             AxisAlignedBB fixedBB = aabb.offset(pos.scale(-1));
	             
	             GJKResult result = OBBCollider.areColliding(bb, OreintedBB.fromAABB(fixedBB, pos));
	             if(result.status == GJKResult.Status.COLLIDING && result.penetrationDepth > bestResult.penetrationDepth) {
	                 bestResult = result;
	             }
	             
	         }
	         
	         Vec3d aSep = Vec3d.ZERO;
	         if(bestResult.penetrationDepth != 0.0) {
	        	
	             aSep = bestResult.separationVector.scale(-bestResult.penetrationDepth);
	             aSep = new Vec3d(aSep.x, 0.0, aSep.z);
	             
	         }
	        // System.out.println(aSep);
	         if(aSep.length() != 0.0) {

	        	 Vec3d rC = bestResult.contactPointA.subtract(getPositionVector()).rotateYaw((float) Math.toRadians(rotationYaw));
	        	 Vec3d coG = getSolver().getPhysConf().getVehicleMassObject().centerOfGravity;
	        	 
	        	 Vec3d cross = rC.crossProduct(coG);
	        	 
	        	 double momentum = getSolver().getPhysConf().vehicleMass*getRealSpeed()/50;
	        	 
	 
	        	
	 		
	        	 
	        	 getSolver().collisionTorque += momentum*cross.y;
	        	 
	        	 //System.out.println("septes"  + aSep.y);
	        	 
	        	 getSolver().velocity = getSolver().velocity.add(aSep.scale(1/0.1));
	        	 setPosition(this.posX+aSep.x, this.posY+aSep.y, this.posZ+aSep.z);
	        	 updateOBB();
	        	//  move(MoverType.SELF, aSep.x, aSep.y, aSep.z);
	         }
		}
		*/


        /// Vec3d p3 = getPositionVector();


        List<Entity> list = this.world.getEntitiesInAABBexcluding(this, getEntityBoundingBox().grow(10.0),
                EntitySelectors.IS_ALIVE);


        list.removeIf((e) -> isPassenger(e));

        for (Entity ent : list) {

            AxisAlignedBB cEnt = ent.getEntityBoundingBox();
            AxisAlignedBB aabbEnt = new AxisAlignedBB(cEnt.minX - ent.posX, cEnt.minY - ent.posY, cEnt.minZ - ent.posZ,
                    cEnt.maxX - ent.posX, cEnt.maxY - ent.posY, cEnt.maxZ - ent.posZ);

            GJKResult result = OBBCollider.areColliding(getOreintedBoundingBox(),
                    OreintedBB.fromAABB(aabbEnt, ent.getPositionVector()));
            if (result.status == GJKResult.Status.COLLIDING) {
                //System.out.println("COLLISION DETECTED!");

                Vec3d shoot = result.separationVector.scale(result.penetrationDepth);
                Vec3d p = ent.getPositionVector();
                if (ent instanceof EntityPlayer) {
                    if (this.world.isRemote) {
                        ent.setPosition(p.x + shoot.x, p.y + shoot.y, p.z + shoot.z);


                        EntityPlayer player = (EntityPlayer) ent;


                        if (!player.onGround) {

                            player.motionY += 0.08D;
                            player.motionX *= 0.9;
                            player.motionZ *= 0.9;
                        }


                    }
                } else {
                    applyEntityCollision(ent);
                    ent.setPosition(p.x + shoot.x, p.y + shoot.y, p.z + shoot.z);

                }


                //((EntityPlayer) ent).onGround = true;

                /*
                 * Vec3d shoot = result.separationVector.scale(result.penetrationDepth*5.0);
                 * ent.addVelocity(shoot.x, shoot.y+1, shoot.z);
                 */

            }

        }

    }


    @Override
    protected void doBlockCollisions() {


        //super.doBlockCollisions();
    }

    @Override
    public void move(MoverType type, double x, double y, double z) {


        if (this.noClip) {
            setEntityBoundingBox(getEntityBoundingBox().offset(x, 0.0, z));
            resetPositionToBB();
        } else {

            this.world.profiler.startSection("move");
            double d10 = this.posX;
            double d11 = this.posY;
            double d1 = this.posZ;

            if (this.isInWeb) {
                this.isInWeb = false;
                x *= 0.25D;
                y *= 0.05000000074505806D;
                z *= 0.25D;
                this.motionX = 0.0D;
                this.motionY = 0.0D;
                this.motionZ = 0.0D;
            }

            double d2 = x;
            double d3 = y;
            double d4 = z;

            if ((type == MoverType.SELF || type == MoverType.PLAYER) && this.onGround && isSneaking()) {
                for (double d5 = 0.05D; x != 0.0D && this.world
                        .getCollisionBoxes(this,
                                getEntityBoundingBox().offset(x, -this.stepHeight, 0.0D))
                        .isEmpty(); d2 = x) {
                    if (x < 0.05D && x >= -0.05D) {
                        x = 0.0D;
                    } else if (x > 0.0D) {
                        x -= 0.05D;
                    } else {
                        x += 0.05D;
                    }
                }

                for (; z != 0.0D && this.world
                        .getCollisionBoxes(this,
                                getEntityBoundingBox().offset(0.0D, -this.stepHeight, z))
                        .isEmpty(); d4 = z) {
                    if (z < 0.05D && z >= -0.05D) {
                        z = 0.0D;
                    } else if (z > 0.0D) {
                        z -= 0.05D;
                    } else {
                        z += 0.05D;
                    }
                }


                for (; x != 0.0D && z != 0.0D
                        && this.world
                        .getCollisionBoxes(this,
                                getEntityBoundingBox().offset(x, -this.stepHeight, z))
                        .isEmpty(); d4 = z) {
                    if (x < 0.05D && x >= -0.05D) {
                        x = 0.0D;
                    } else if (x > 0.0D) {
                        x -= 0.05D;
                    } else {
                        x += 0.05D;
                    }

                    d2 = x;

                    if (z < 0.05D && z >= -0.05D) {
                        z = 0.0D;
                    } else if (z > 0.0D) {
                        z -= 0.05D;
                    } else {
                        z += 0.05D;
                    }
                }
            }

            List<AxisAlignedBB> list1 = this.world.getCollisionBoxes(this, getEntityBoundingBox().expand(x, y, z));
            AxisAlignedBB axisalignedbb = getEntityBoundingBox();

            /*
             * Le magique
             */

            ArrayList<AxisAlignedBB> rList = new ArrayList<>();
            for (int q = 0; q < list1.size(); ++q) {
                AxisAlignedBB item = list1.get(q);

                Vec3d centerOfPos = new Vec3d(item.minX + (item.maxX - item.minX) * 0.5D, item.minY + (item.maxY - item.minY) * 0.5D, item.minZ + (item.maxZ - item.minZ) * 0.5D);

                BlockPos pos = new BlockPos(centerOfPos);
                IBlockState state = this.world.getBlockState(pos);

                if (state.getBlock() instanceof BlockCarpet /*|| state.getBlock() instanceof BlockSnow*/) {

                    IBlockState below = world.getBlockState(getPosition().down());
                    below.getCollisionBoundingBox(world, getPosition().down());
                    AxisAlignedBB bb;
                    rList.add(item);


                    bb = new AxisAlignedBB(0, 0, 0, 1, 1, 1);
                    list1.add(bb.offset(getPosition().down()));
                }
            }

            for (AxisAlignedBB bruh : rList) {

                list1.remove(bruh);
            }


            IBlockState below = world.getBlockState(getPosition().down());
            AxisAlignedBB bb = below.getCollisionBoundingBox(world, getPosition().down());
            if (bb != null) {
                if (bb.maxY >= 0.75 && bb.maxY < 1.0) {
                    // System.out.println(bb.maxY);
                    bb = new AxisAlignedBB(0, 0, 0, 1, 1, 1);
                    list1.add(bb.offset(getPosition().down()));
                }
            }

            if (y != 0.0D) {
                int k = 0;

                for (int l = list1.size(); k < l; ++k) {
                    y = list1.get(k).calculateYOffset(getEntityBoundingBox(), y);
                }

                setEntityBoundingBox(getEntityBoundingBox().offset(0.0D, y, 0.0D));
            }

            if (x != 0.0D) {
                int j5 = 0;

                for (int l5 = list1.size(); j5 < l5; ++j5) {
                    x = list1.get(j5).calculateXOffset(getEntityBoundingBox(), x);
                }

                if (x != 0.0D) {
                    setEntityBoundingBox(getEntityBoundingBox().offset(x, 0.0D, 0.0D));
                }
            }

            if (z != 0.0D) {
                int k5 = 0;

                for (int i6 = list1.size(); k5 < i6; ++k5) {
                    z = list1.get(k5).calculateZOffset(getEntityBoundingBox(), z);
                }

                if (z != 0.0D) {
                    setEntityBoundingBox(getEntityBoundingBox().offset(0.0D, 0.0D, z));
                }
            }


            boolean flag = this.onGround || d3 != y && d3 < 0.0D;

            if (this.stepHeight > 0.0F && flag && (d2 != x || d4 != z)) {
                double d14 = x;
                double d6 = y;
                double d7 = z;
                AxisAlignedBB axisalignedbb1 = getEntityBoundingBox();
                setEntityBoundingBox(axisalignedbb);
                y = this.stepHeight;
                List<AxisAlignedBB> list = this.world.getCollisionBoxes(this,
                        getEntityBoundingBox().expand(d2, y, d4));
                AxisAlignedBB axisalignedbb2 = getEntityBoundingBox();
                AxisAlignedBB axisalignedbb3 = axisalignedbb2.expand(d2, 0.0D, d4);
                double d8 = y;
                int j1 = 0;

                for (int k1 = list.size(); j1 < k1; ++j1) {
                    d8 = list.get(j1).calculateYOffset(axisalignedbb3, d8);
                }

                axisalignedbb2 = axisalignedbb2.offset(0.0D, d8, 0.0D);
                double d18 = d2;
                int l1 = 0;

                for (int i2 = list.size(); l1 < i2; ++l1) {
                    d18 = list.get(l1).calculateXOffset(axisalignedbb2, d18);
                }

                axisalignedbb2 = axisalignedbb2.offset(d18, 0.0D, 0.0D);
                double d19 = d4;
                int j2 = 0;

                for (int k2 = list.size(); j2 < k2; ++j2) {
                    d19 = list.get(j2).calculateZOffset(axisalignedbb2, d19);
                }

                axisalignedbb2 = axisalignedbb2.offset(0.0D, 0.0D, d19);
                AxisAlignedBB axisalignedbb4 = getEntityBoundingBox();
                double d20 = y;
                int l2 = 0;

                for (int i3 = list.size(); l2 < i3; ++l2) {
                    d20 = list.get(l2).calculateYOffset(axisalignedbb4, d20);
                }

                axisalignedbb4 = axisalignedbb4.offset(0.0D, d20, 0.0D);
                double d21 = d2;
                int j3 = 0;

                for (int k3 = list.size(); j3 < k3; ++j3) {
                    d21 = list.get(j3).calculateXOffset(axisalignedbb4, d21);
                }

                axisalignedbb4 = axisalignedbb4.offset(d21, 0.0D, 0.0D);
                double d22 = d4;
                int l3 = 0;

                for (int i4 = list.size(); l3 < i4; ++l3) {
                    d22 = list.get(l3).calculateZOffset(axisalignedbb4, d22);
                }

                axisalignedbb4 = axisalignedbb4.offset(0.0D, 0.0D, d22);
                double d23 = d18 * d18 + d19 * d19;
                double d9 = d21 * d21 + d22 * d22;

                if (d23 > d9) {
                    x = d18;
                    z = d19;
                    y = -d8;
                    setEntityBoundingBox(axisalignedbb2);
                } else {
                    x = d21;
                    z = d22;
                    y = -d20;
                    setEntityBoundingBox(axisalignedbb4);
                }

                int j4 = 0;

                for (int k4 = list.size(); j4 < k4; ++j4) {
                    y = list.get(j4).calculateYOffset(getEntityBoundingBox(), y);
                }

                setEntityBoundingBox(getEntityBoundingBox().offset(0.0D, y, 0.0D));

                if (d14 * d14 + d7 * d7 >= x * x + z * z) {
                    x = d14;
                    y = d6;
                    z = d7;
                    setEntityBoundingBox(axisalignedbb1);
                }
            }

            this.world.profiler.endSection();
            this.world.profiler.startSection("rest");
            resetPositionToBB();
            this.collidedHorizontally = d2 != x || d4 != z;
            this.collidedVertically = d3 != y;
            this.onGround = this.collidedVertically && d3 < 0.0D;
            this.collided = this.collidedHorizontally || this.collidedVertically;
            int j6 = MathHelper.floor(this.posX);
            int i1 = MathHelper.floor(this.posY - 0.20000000298023224D);
            int k6 = MathHelper.floor(this.posZ);
            BlockPos blockpos = new BlockPos(j6, i1, k6);
            IBlockState iblockstate = this.world.getBlockState(blockpos);

            if (iblockstate.getMaterial() == Material.AIR) {
                BlockPos blockpos1 = blockpos.down();
                IBlockState iblockstate1 = this.world.getBlockState(blockpos1);
                Block block1 = iblockstate1.getBlock();

                if (block1 instanceof BlockWall || null instanceof BlockFenceGate) {
                    iblockstate = iblockstate1;
                    blockpos = blockpos1;
                }
            }

            updateFallState(y, this.onGround, iblockstate, blockpos);

            if (d2 != x) {
                this.motionX = 0.0D;
            }

            if (d4 != z) {
                this.motionZ = 0.0D;
            }

            Block block = iblockstate.getBlock();

            if (d3 != y) {
                block.onLanded(this.world, this);
            }

            if (canTriggerWalking() && (!this.onGround || !isSneaking() || !isRiding())) {
                double d15 = this.posX - d10;
                double d16 = this.posY - d11;
                double d17 = this.posZ - d1;

                if (block != Blocks.LADDER) {
                    d16 = 0.0D;
                }

                if (block != null && this.onGround) {
                    block.onEntityWalk(this.world, blockpos, this);
                }

                this.distanceWalkedModified = (float) ((double) this.distanceWalkedModified
                        + (double) MathHelper.sqrt(d15 * d15 + d17 * d17) * 0.6D);
                this.distanceWalkedOnStepModified = (float) ((double) this.distanceWalkedOnStepModified
                        + (double) MathHelper.sqrt(d15 * d15 + d16 * d16 + d17 * d17) * 0.6D);

                if (this.distanceWalkedOnStepModified > nextStepDistance
                        && iblockstate.getMaterial() != Material.AIR) {
                    nextStepDistance = (int) this.distanceWalkedOnStepModified + 1;

                    if (isInWater()) {
                        Entity entity = isBeingRidden() && getControllingPassenger() != null
                                ? getControllingPassenger()
                                : this;
                        float f = entity == this ? 0.35F : 0.4F;
                        float f1 = MathHelper.sqrt(
                                entity.motionX * entity.motionX * 0.20000000298023224D + entity.motionY * entity.motionY
                                        + entity.motionZ * entity.motionZ * 0.20000000298023224D)
                                * f;

                        if (f1 > 1.0F) {
                            f1 = 1.0F;
                        }

                        playSound(getSwimSound(), f1,
                                1.0F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
                    } else {
                        playStepSound(blockpos, block);
                    }
                } else if (this.distanceWalkedOnStepModified > nextFlap && makeFlySound()
                        && iblockstate.getMaterial() == Material.AIR) {
                    nextFlap = playFlySound(this.distanceWalkedOnStepModified);
                }
            }

            try {
                doBlockCollisions();
            } catch (Throwable throwable) {
                CrashReport crashreport = CrashReport.makeCrashReport(throwable, "Checking entity block collision");
                CrashReportCategory crashreportcategory = crashreport
                        .makeCategory("Entity being checked for collision");
                addEntityCrashInfo(crashreportcategory);
                throw new ReportedException(crashreport);
            }

            boolean flag1 = isWet();

            if (this.world.isFlammableWithin(getEntityBoundingBox().shrink(0.001D))) {
                dealFireDamage(1);

                if (!flag1) {
                    ++fire;

                    if (fire == 0) {
                        setFire(8);
                    }
                }
            } else if (fire <= 0) {
                fire = -getFireImmuneTicks();
            }

            if (flag1 && isBurning()) {
                playSound(SoundEvents.ENTITY_GENERIC_EXTINGUISH_FIRE, 0.7F,
                        1.6F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
                fire = -getFireImmuneTicks();
            }

            this.world.profiler.endSection();
        }
    }

    public float getInterpolatedLiftOffset() {
        return (float) InterpolationKit.interpolateValue(prevLiftOffset, liftOffset,
                MC.getRenderPartialTicks());
    }

    public void oldHC() {

        float targetDown = 0.0f;
        float targetUp = 0.0f;

        double dist = 0.0f;
        double forwardNess = 2.0;
        Vec3d sDown = new Vec3d(-0.5, 0.0, forwardNess).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        Vec3d eDown = new Vec3d(-0.5, -10, forwardNess).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        RayTraceResult rayDown = world.rayTraceBlocks(sDown, eDown);
        if (rayDown != null) {
            dist = rayDown.hitVec.subtract(sDown).length();
            targetDown = (float) -Math.toDegrees(Math.atan(dist / (2.5)));

        }

        Vec3d start = new Vec3d(-0.5, 0.0, 0.0).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        Vec3d end = new Vec3d(-0.5, 0.0, 5.75).rotateYaw((float) Math.toRadians(-rotationYaw))
                .rotateYaw((float) -solver.getSideSlipAngle()).add(getPositionVector());
        RayTraceResult ray = world.rayTraceBlocks(start, end);

        if (ray != null) {

            IBlockState b = this.world.getBlockState(ray.getBlockPos().up());

            if (b.causesSuffocation()) {
                return;
            }

            Vec3d hitVec = ray.hitVec;
            Vec3d ab = hitVec.subtract(getPositionVector());

            double distance = ab.lengthSquared();

            double upMag;

            if (distance > 15.5) {
                upMag = 0.25;

            } else if (distance > 1.0) {

                upMag = 0.5;

            } else {
                upMag = 1.5;

            }

            double liftPush = 0.0;

            IBlockState bL = this.world.getBlockState(ray.getBlockPos());
            if (!bL.isFullBlock()) {
                upMag /= 2;
                liftPush = 0.1;
            }

            //
            /*
             * Vec3d lift = new Vec3d(0.0, upMag, 0.5+liftPush).rotateYaw((float)
             * Math.toRadians(-rotationYaw)); this.move(MoverType.SELF, lift.x, lift.y,
             * lift.z);
             */

            BlockPos bTC = ray.getBlockPos();
            Vec3d sB = new Vec3d(bTC.getX(), bTC.getY() - 1.0, bTC.getZ());
            Vec3d eB = new Vec3d(bTC.getX(), bTC.getY(), bTC.getZ());

            RayTraceResult heightRay = this.world.rayTraceBlocks(sB, eB);

            double opp = 0.0;
            double adj = 0.0;

            if (heightRay != null) {

                getPositionVector();
                heightRay.hitVec.subtract(ray.hitVec).length();

            }

            //System.out.println("sped" + getSpeed());
            float t = 1.0f;
            float mu2 = (float) ((1 - Math.cos(t * Math.PI)) / 2f);
            Vec3d lift = new Vec3d(0.0, upMag + 0.2, 0.7 + liftPush).rotateYaw((float) Math.toRadians(-rotationYaw))
                    .scale(mu2);
            move(MoverType.SELF, lift.x, lift.y, lift.z);

            // test block behind & up
            /*
             * Vec3d blockV = new Vec3d(ray.getBlockPos().getX(), ray.getBlockPos().getY(),
             * ray.getBlockPos().getZ()); Vec3d abV =
             * blockV.subtract(getPositionVector()).scale(2.5).add(getPositionVector());
             * BlockPos pos = new BlockPos(abV.x, abV.y, abV.z);
             *
             * if(this.world.getBlockState(pos.up()).causesSuffocation()) {
             *
             * upMag += 0.5; }
             */

            targetUp = (float) Math.toDegrees(Math.atan(upMag / (2.5)));

            /*
             * double diff = Math.abs(Math.abs(rotationPitch)-Math.abs(newPitch)); //
             * System.out.println("diff: " + diff); if(diff > 6) { rotationPitch += (float)
             * diff/(diff/2.5f); } else { rotationPitch = newPitch; }
             */

            // System.out.println(rotationPitch);

        } else {
            // rotationPitch = 0;
        }

        /*
         * PITCH SMOOTHING
         */

        float adjT;
        if (targetDown == 0.0) {
            adjT = targetUp;
        } else if (targetUp == 0.0) {
            adjT = targetDown;
        } else {
            adjT = (targetDown + targetUp) / 2.0f;
        }

        // calculate difference from current pitch

        if (dist > 0.5) {
            if (adjT < rotationPitch) {
                rotationPitch -= Math.abs(adjT) * 0.05;
            } else {
                rotationPitch += Math.abs(adjT) * 0.3;
            }
        } else {

            if (adjT == 0.0) {
                adjT = -rotationPitch;
            }

            if (adjT < rotationPitch) {
                rotationPitch -= Math.abs(adjT) * 0.5;
            } else {
                rotationPitch += Math.abs(adjT) * 0.3;
            }

        }

        /*
         * double diff = Math.abs(Math.abs(rotationPitch)-Math.abs(adjT));
         *
         * if(diff > 10) { rotationPitch = adjT/1.75f; } else if(diff > 6) {
         * rotationPitch = adjT/1.25f; } else if(diff > 3) { rotationPitch = adjT/1.1f;
         * } else { rotationPitch += adjT; }
         */

        // System.out.println("CurrentPitch: " + rotationPitch + " | " + adjT);
        /*
         * double diff = Math.abs(Math.abs(rotationPitch)-Math.abs(adjT));
         *
         * if(diff > 10) { rotationPitch = adjT/1.75f; } else if(diff > 6) {
         * rotationPitch = adjT/1.25f; } else if(diff > 3) { rotationPitch = adjT/1.1f;
         * } else { rotationPitch += adjT; }
         */

        /*
         * World world = this.world; RayTraceResult ray = world.rayTraceBlocks(start,
         * end); if(ray != null) { this.move(MoverType.SELF, 0.0, 0.6, 0.0);
         *
         * }
         */

        /*
         * Vec3d rearTestingPoint = new Vec3d(-0.5, 0.5, -2.75).rotateYaw((float)
         * Math.toRadians(-rotationYaw)).add(getPositionVector()); Vec3d
         * frontTestingPoint = new Vec3d(-0.5, 0.5, 4.75).rotateYaw((float)
         * Math.toRadians(-rotationYaw)).add(getPositionVector());
         *
         *
         * RayTraceResult rRay = world.rayTraceBlocks(rearTestingPoint,
         * rearTestingPoint.subtract(0.0, 2.0, 0.0)); RayTraceResult fRay =
         * world.rayTraceBlocks(frontTestingPoint, frontTestingPoint.subtract(0.0, 4.0,
         * 0.0));
         *
         *
         * if(rRay != null && fRay != null) {
         *
         * float heightDiff = (float) (fRay.hitVec.y - rRay.hitVec.y);
         *
         * if(heightDiff == 0) { heightDiff = fRay.getBlockPos().getY() -
         * rRay.getBlockPos().getY(); }
         *
         *
         *
         * float angle = (float) Math.atan(heightDiff/(3.5)); rotationPitch = (float)
         * Math.toDegrees(angle); //System.out.println(rotationPitch);
         *
         *
         * }
         */

        // rotationPitch = 0;

    }

    @Override
    public void applyEntityCollision(Entity entityIn) {

        Vec3d speed = getSolver().velocity.scale(0.5);

        entityIn.addVelocity(speed.x, speed.y + 1.0, speed.z);
        entityIn.attackEntityFrom(DamageSource.ANVIL, (float) speed.lengthSquared());


        super.applyEntityCollision(entityIn);
    }

    @Override
    public boolean shouldRenderInPass(int pass) {
        // System.out.println("AC360 " + super.shouldRenderInPass(pass) + " " + pass);
        return true;
    }

    public void handleHillClimbing() {

        //	if(1+1==2) return;
        /*
         * if(liftOffset == 0 && ticksExisted % 3 == 0) { prevLiftOffset = liftOffset; }
         * else { prevLiftOffset = liftOffset; }
         *
         * if(prevLiftOffset == liftOffset) liftOffset = 0;
         */


        if (this.world.getBlockState(getPosition().up()).getMaterial().isLiquid()) {
            vehicleIsRunning = false;
            CustomGui.vehicleGUIOverlay.keyAnimator.removeKey();
        }

        double wheelbase = 2.85;

        // IF WE ARE BRAKING, WE DO NOT
        // HAVE ANY INTENT TO GO UP A HILL.

        /*
         * ROLL HANDLER
         */

        double sideScan = 1.0;
        Vec3d rollSA = new Vec3d(sideScan, 2.0, 0.0).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        Vec3d rollEA = new Vec3d(sideScan, -10, 0.0).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        RayTraceResult rollRA = world.rayTraceBlocks(rollSA, rollEA, false, true, false);

        Vec3d rollSB = new Vec3d(-sideScan, 2.0, 0.0).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        Vec3d rollEB = new Vec3d(-sideScan, -10, 0.0).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        RayTraceResult rollRB = world.rayTraceBlocks(rollSB, rollEB, false, true, false);

        double rollHA;
        double rollHB;

        if (rollRA == null) {
            rollHA = 5;
        } else {
            rollHA = rollRA.hitVec.subtract(rollSA).length();
        }
        if (rollRB == null) {
            rollHB = 5;
        } else {
            rollHB = rollRB.hitVec.subtract(rollSB).length();
        }

        double sideWidth = 1.847;

        double ang = Math.asin((rollHB - rollHA) / sideWidth);
        double rollTarget = (float) Math.toDegrees(-ang);

        if (Double.isNaN(rollTarget)) {
            rollTarget = 0.0;
        }

        double rollDist = Math.abs(rotationRollH) - Math.abs(rollTarget);

        if (rollDist > 0.5) {

            // rollTarget = -rotationRollH;

            /*
             * if(Math.abs(rollTarget-rotationRollH) < 2) {
             *
             * } else
             */
            if (rollTarget < rotationRollH) {
                // System.out.println("BRUH: " + rotationRollH + " | " + rollDist) ;
                rotationRollH -= (float) (Math.abs(rollDist) * 0.68);

            } else {

                // System.out.println("DECRERASING " + (rollTarget+rotationRollH));
                double bruh = rotationRollH + rollTarget;

                rotationRollH += (float) (Math.abs(rollTarget + rotationRollH) * 0.9);
            }
        } else {

            if (rollTarget == 0.0) {

                rollTarget = -rotationRollH;
            }
            // System.out.println(rollTarget + " | " + rotationRollH);

            /*
             * if(Math.abs(rollTarget)- Math.abs(rotationRollH) < 0.01) {
             *
             * }else
             */
            if (rollTarget < rotationRollH) {
                // System.out.println("main");

                rotationRollH -= (float) (Math.abs(rollTarget) * 0.03);
            } else {

                // System.out.println("Adjustment: " + bruh + " | " + rollTarget);
                rotationRollH += (float) (Math.abs(rollTarget) * 0.08);
            }
        }


        /*
         * END ROLL HANDLER
         */

        float targetDown = 0.0f;
        float targetUp = 0.0f;

        /*
         * DOWNWARDS HILL HANDLING
         */

        /*
         * double dist = 0.0f; double forwardNess = 2.0; Vec3d sDown = new Vec3d(-0.5,
         * 0.0, forwardNess).rotateYaw((float)
         * Math.toRadians(-rotationYaw)).add(getPositionVector()); Vec3d eDown = new
         * Vec3d(-0.5, -10, forwardNess).rotateYaw((float)
         * Math.toRadians(-rotationYaw)).add(getPositionVector()); RayTraceResult
         * rayDown = world.rayTraceBlocks(sDown, eDown, false, true, false); if(rayDown
         * != null) { dist = rayDown.hitVec.subtract(sDown).length(); float
         * newPitch = (float) -Math.toDegrees(Math.atan(dist/(2.5))); targetDown =
         * newPitch; }
         */

        // roll

        double dist = 0.0f;
        double forwardNess = 2.0;
        Vec3d sDown = new Vec3d(-0.5, 0.0, forwardNess).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        Vec3d eDown = new Vec3d(-0.5, -10, forwardNess).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());

        RayTraceResult rayDown = world.rayTraceBlocks(sDown, eDown, false, true, false);

        Vec3d sDown2 = new Vec3d(-0.5, 0.0, -forwardNess + 0.5).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        Vec3d eDown2 = new Vec3d(-0.5, -10, -forwardNess + 0.5).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        RayTraceResult rayDown2 = world.rayTraceBlocks(sDown2, eDown2, false, true, false);


        double hF = 0.0;
        double hB = 0.0;


        if (rayDown2 == null) {
            //	System.out.println("In Freefall");
            rotationPitch *= 1.2;
            rotationRoll *= 1.2F;
        } else {
            hB = rayDown2.hitVec.subtract(sDown2).length();
        }

        if (rayDown != null) {
            hF = rayDown.hitVec.subtract(sDown).length();
        }


        // System.out.println("front vector: " + hF);

        double hillAngle = Math.toDegrees(Math.asin((hF - hB) / wheelbase));
        if (hillAngle != 0.0)
            // System.out.println("Hill Angle: " + hillAngle);

            /*
             * if(hF-hB != 0.0) { System.out.println("FE: " + hF + " | RE: " + hB +
             * " | DIFF: " + (hF-hB)); }
             */ {
            if (rayDown != null && (hF - hB) >= 0) {
                dist = rayDown.hitVec.subtract(sDown).length();

                getSolver().velocity = getSolver().getVelocityVector().scale(1.005);
                targetDown = (float) -Math.toDegrees(Math.atan(dist / (wheelbase)));
            }
        }

        double SSAng = Math.abs(Math.toDegrees(getSolver().getSideSlipAngle()));
        double mult = 1.0 - (0.3 * Math.min(SSAng / 30.0, 1.0));

        if (rotationPitch < 3) {
            mult *= 0.5;
        }

        // NOMINAL REACH: 8.75, MODIFIED FOR SMOOTHNESS TO 10.75

        // new was 5.75
        double baseReach = 14.75 * (Math.min(getRealSpeed() / 25.0, 1.0)) * mult;
        // System.out.println(baseReach);

        if (!onGround || rotationPitch > 5) {
            baseReach += 3;
        }

        boolean flagOne = isBraking || getSolver().getVelocityVector().length() < 0.3
                || (throttle == 0 && getSolver().getVelocityVector().length() < 25);
        //System.out.println(flagOne);


        Vec3d start = new Vec3d(-0.5, 0.1, 0.0).rotateYaw((float) Math.toRadians(-rotationYaw))
                .add(getPositionVector());
        Vec3d end = new Vec3d(-0.5, 0.1, baseReach).rotateYaw((float) Math.toRadians(-rotationYaw))
                .rotateYaw((float) -solver.getSideSlipAngle()).add(getPositionVector());
        RayTraceResult ray = world.rayTraceBlocks(start, end, false, true, false);
        if (ray != null && !flagOne) {


            /*
             * CHECK IF VEHICLE IS ABOVE RAY
             */
            // System.out.println( + " | " + posY);

            IBlockState below = this.world.getBlockState(getPosition().down());
            IBlockState bOfCar = this.world.getBlockState(getPosition());

            IBlockState b = this.world.getBlockState(ray.getBlockPos().up());


            double upMag;
			
			/*
			if (b.getBlock() instanceof BlockSnow) {

				if (b.getValue(BlockSnow.LAYERS).intValue() > 2)
					return;
				upMag += 0.5;
			} else*/
            if (/*b.causesSuffocation() ||*/ b.getBlock() instanceof BlockPane || b.getBlock() instanceof BlockSlab || b.getBlock() instanceof BlockGlass) {
                return;
            }
            Vec3d hitVec = ray.hitVec;
            Vec3d ab = hitVec.subtract(getPositionVector());
            double distance = ab.lengthSquared();

            if (distance > 15.5) {
                upMag = 0.25;
            } else if (distance > 1.0) {
                upMag = 0.5;
            } else {
                upMag = 1.5;

            }
            double liftPush = 0.0;
            IBlockState bL = this.world.getBlockState(ray.getBlockPos());
            //System.out.println(bL.getBlock());

            if (bL.getBlock() instanceof BlockFence || bL.getBlock() instanceof BlockWall) {
                return;
            }

            boolean snowFlag = false;
            int layers = 0;
            if (bL.getBlock() instanceof BlockSnow) {
                snowFlag = true;

                layers = bL.getValue(BlockSnow.LAYERS).intValue();
            }

            AxisAlignedBB ablf = bL.getCollisionBoundingBox(world, ray.getBlockPos());
            double blockHeight = (ablf.maxY - ablf.minY);



            /*
             * if(!bL.isFullBlock()) { upMag = blockHeight+0.01; liftPush =
             * Math.sqrt((blockHeight*blockHeight));
             *
             *
             *
             * }
             */

            BlockPos bTC = ray.getBlockPos();
            Vec3d sB = new Vec3d(bTC.getX(), bTC.getY() - 1.0, bTC.getZ());
            Vec3d eB = new Vec3d(bTC.getX(), bTC.getY(), bTC.getZ());

            RayTraceResult heightRay = this.world.rayTraceBlocks(sB, eB, false, true, false);

            double opp = 0.0;
            double adj = 0.0;

            if (heightRay != null) {
                getPositionVector();
                heightRay.hitVec.subtract(ray.hitVec).length();
            }
            float t = 1.0f;
            float mu2 = (float) ((1 - Math.cos(t * Math.PI)) / 2f);

            Vec3d lift = new Vec3d(0.0, upMag + 0.55, 0.05 + liftPush).rotateYaw((float) Math.toRadians(-rotationYaw))
                    .scale(mu2);

            getSolver().velocity = getSolver().getVelocityVector().scale(0.95);

            // System.out.println("lifting");
            // DEBUG //

            // liftOffset += (float) lift.y/2;

            double targetTopHeight = ray.getBlockPos().getY() + 1.0;
            if (snowFlag) {
                if (layers == 0) {
                    targetTopHeight = ray.getBlockPos().getY() + 0.3;
                } else {
                    targetTopHeight = ray.getBlockPos().getY() + 0.7;
                }

            }
            double heightDifference = (lift.y + getPositionVector().y) - targetTopHeight;
            if (heightDifference > 0) {
                double correction = lift.y - heightDifference;

                lift = new Vec3d(lift.x, correction, lift.z);
                // double hd2 = (correction + getPositionVector().y)-targetTopHeight;
                // System.out.println("Height Difference: " + heightDifference + " | Corrected
                // Difference: " + hd2);

            }

            float newPitch = (float) Math.toDegrees(Math.atan(upMag / (wheelbase)));


            if (rotationPitch < 55f) {
                move(MoverType.SELF, lift.x, lift.y, lift.z);

                // DEBUG //
                newPitch -= hillAngle;
                //newPitch /= 2;

                // snow
                if (snowFlag) {
                    newPitch *= 0.2F;
                }


                targetUp = newPitch;
            }


        }

        /*
         * Calculates the pitch target by blending the up & down targets
         */

        float adjT;
        if (targetDown == 0.0) {
            adjT = targetUp;
        } else if (targetUp == 0.0) {
            adjT = targetDown;
        } else {
            adjT = (targetDown + targetUp) / 2.0f;
        }

        /*
         * This code actually applies pitch, it ensures the "momentum" of the rotation
         * is actually kept.
         */

        if (dist > 0.5) {

            // DOWN PITCHING //

            if (Math.abs(adjT - rotationPitch) < 0.55) {

            } else if (adjT < rotationPitch) {

                rotationPitch -= Math.abs(adjT) * 0.05;
            } else {

                rotationPitch += Math.abs(adjT) * 0.5;
            }
        } else {

            // UP PITCHING //

            if (adjT == 0.0) {
                adjT = -rotationPitch;
            }
            if (adjT < rotationPitch) {
                // System.out.println("force adj.");
                rotationPitch -= Math.abs(adjT) * 0.3;
            } else {
                rotationPitch += Math.abs(adjT) * 0.1;
            }

        }

        /*
         * if(this.rotationPitch < 0) { Vec3d pitching =
         * getSolver().getOreintationVector().scale(-1); this.move(MoverType.SELF,
         * pitching.x, pitching.y, pitching.z); }
         */

        doBlockCollisions();

    }

    public RayTraceResult castFromEntity(Vec3d direction) {
        Vec3d start = getPositionVector();
        Vec3d end = direction.normalize().add(start);
        return world.rayTraceBlocks(start, end, false, true, false);
    }

    public void stabilizeRotation() {
        double mag = 2.5;

        double boost = 0.25;


        if (getRealSpeed() * 3.6 > 30) {
            boost = 0.35;
        }
        RayTraceResult r1 = castFromEntity(new Vec3d(1 * mag, 0, 1 * mag));
        RayTraceResult r2 = castFromEntity(new Vec3d(-1 * mag, 0, -1 * mag));
        RayTraceResult r3 = castFromEntity(new Vec3d(-1 * mag, 0, 1 * mag));
        RayTraceResult r4 = castFromEntity(new Vec3d(1 * mag, 0, -1 * mag));
        RayTraceResult r5 = null;

        // r5 = castFromEntity(new Vec3d(0, -1*mag, 0));

        if (r1 != null || r2 != null || r3 != null || r4 != null) {


            getSolver().frontAxel.applyBrakingForce(1.0);
            getSolver().rearAxel.applyBrakingForce(1.0);

            if (r1 != null) {

                if (getBlockAt(r1.getBlockPos()) instanceof BlockCarpet) {
                    return;
                }
                move(MoverType.SELF, -1 * boost, 0.0, -1 * boost);
            }

            if (r2 != null) {
                if (getBlockAt(r2.getBlockPos()) instanceof BlockCarpet) {
                    return;
                }
                move(MoverType.SELF, 1 * boost, 0.0, 1 * boost);
            }

            if (r3 != null) {
                if (getBlockAt(r3.getBlockPos()) instanceof BlockCarpet) {
                    return;
                }
                move(MoverType.SELF, 1 * boost, 0.0, -1.0 * boost);
            }

            if (r4 != null) {
                if (getBlockAt(r4.getBlockPos()) instanceof BlockCarpet) {
                    return;
                }
                move(MoverType.SELF, -1 * boost, 0.0, boost);
            }

        }

        /*
         * if(1+1==2) return; Quat4d bruh = QuatUtil.rotate(Math.toRadians(rotationYaw),
         * Math.toRadians(rotationPitch), Math.toRadians(rotationRoll));
         * bruh.normalize(); Vec3d v = QuatUtil.set(bruh, 0.0, 0.0, 0.0);
         *
         * rotationYaw = (float) Math.toDegrees(v.x); rotationPitch =
         * (float)Math.toDegrees(v.y); rotationRoll = (float) Math.toDegrees(v.z);
         */

    }

    public Block getBlockAt(BlockPos pos) {
        return this.world.getBlockState(pos).getBlock();
    }

    public Vec3d[] calculateTerrainPlane() {
        Vec3d one = getWheelPlanePoint(new Vec3d(-1.7, 0.0, 1.75));
        Vec3d two = getWheelPlanePoint(new Vec3d(0.5, 0.0, 1.75));
        Vec3d three = getWheelPlanePoint(new Vec3d(-1.7, 0.0, -1.75));
        Vec3d four = getWheelPlanePoint(new Vec3d(0.5, 0.0, -1.75));
        return new Vec3d[]{one, two, three, four};
    }

    public Vec3d getWheelPlanePoint(Vec3d wheelPos) {
        Vec3d realPos = wheelPos.rotateYaw((float) Math.toRadians(-rotationYaw)).add(getPositionVector());
        Vec3d endVec = realPos.subtract(0.0, 2.5, 0.0);

        RayTraceResult result = this.world.rayTraceBlocks(realPos, endVec, false, true, false);
        if (result != null) {
            return result.hitVec.subtract(getPositionVector());
        }
        return null;
    }

    /*
     * PARTICLES
     */
    @SideOnly(Side.CLIENT)
    public void handleDriveParticles() {

        boolean b = world.getBlockState(getPosition()).getMaterial().isLiquid();


        if (!this.world.getBlockState(getPosition().up()).getMaterial().isLiquid() && b) {
            for (int x = 0; x < 60; ++x) {
                Vec3d pos = getPositionVector();

                this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, pos.x + rand.nextGaussian(), pos.y + 1.0 + rand.nextGaussian() / 2, pos.z + rand.nextGaussian(),
                        0, 0.3, 0.0,
                        Block.getStateId(world.getBlockState(getPosition())));

                this.world.spawnParticle(EnumParticleTypes.BLOCK_DUST, pos.x + rand.nextGaussian(), pos.y + 1.0 + rand.nextGaussian() / 2, pos.z + rand.nextGaussian(),
                        0, 0.3, 0.0,
                        Block.getStateId(world.getBlockState(getPosition())));
            }
        }


        if (isVehicleRunning()) {
            doExhaustParticles(true, new Vec3d(0.25, 0.5, -3.25), 0.5);
            doExhaustParticles(true, new Vec3d(-1.45, 0.5, -3.25), 0.5);

        }

        for (WheelSolver w : getSolver().wheels) {
            doWheelParticles(w);
        }

    }

    double prevDist = 0.0;
    double dist = 0.0;

    public double getRealSpeed() {


        return dist * 20.0;
    }

    @SideOnly(Side.CLIENT)
    public void doExhaustParticles(boolean spitFire, Vec3d exhaustPosition, double exhaustWidth) {
        // exhaust particles

        Vec3d posExhaust = exhaustPosition.rotatePitch((float) Math.toRadians(rotationPitch))
                .rotateYaw((float) Math.toRadians(-rotationYaw)).add(getPositionVector());
        Vec3d partDirExhaust = new Vec3d(0.0, 0.3, -1).rotateYaw((float) Math.toRadians(-rotationYaw))
                .rotatePitch((float) Math.toRadians(rotationPitch)).scale(0.1);

        for (int x = 0; x < 2 + (solver.synthAccelFor / 2); ++x) {
            MC.effectRenderer.addEffect(new ExhaustParticle(this.world, posExhaust.x,
                    posExhaust.y, posExhaust.z, partDirExhaust.x, partDirExhaust.y, partDirExhaust.z, 2));

        }

        int max = 1000;
        int min = 0;

        int mult = 20;
        Vec3d partDirExhaust2 = new Vec3d(0.0, 0.3, -1).rotateYaw((float) Math.toRadians(-rotationYaw))
                .rotatePitch((float) Math.toRadians(rotationPitch)).scale(2.0);
        int ran = (int) Math.floor(Math.random() * (max - min + 1) + min);
        if (ran < 1) {

            PositionedSound ps = new PositionedSoundRecord(getConfiguration().getBackfireSound(), SoundCategory.MASTER, 1.5f, 1.0f, (float) posX, (float) posY, (float) posZ);
            MC.getSoundHandler().playSound(ps);

            for (int x = 0; x < 20 + (solver.synthAccelFor); ++x) {
                MC.effectRenderer.addEffect(new VehicleExhaustFlameParticle(this.world, posExhaust.x, posExhaust.y, posExhaust.z, partDirExhaust2.x * mult, 0, partDirExhaust2.z * mult));

            }
        }

        // PAPAPPAPA
    }

    @SideOnly(Side.CLIENT)
    public void doWheelParticles(WheelSolver wSolve) {

        Vec3d wheelPosition = wSolve.relativePosition;
        boolean isDriveWheel = wSolve.isDriveWheel();
        float wheelAngle = (float) wSolve.wheelAngle;

        Vec3d realPos = wheelPosition.rotateYaw((float) Math.toRadians(-rotationYaw)).add(getPositionVector());
        Vec3d direction = new Vec3d(0.0, 0.3, -1.0).rotateYaw(-wheelAngle)
                .rotateYaw((float) Math.toRadians(-rotationYaw)).scale(0.1);
        double variation = 5;

        double reducer = 1;
        if (!isDriveWheel) {
        }

        int amount = (int) Math.min((wSolve.wheelAngularVelocity * wSolve.getRadius()) / 8, 8);
        //System.out.println(amount);

        for (int x = 0; x < amount; ++x) {
            this.world.spawnParticle(EnumParticleTypes.BLOCK_DUST, realPos.x + rand.nextGaussian() / (variation * 12),
                    realPos.y + rand.nextGaussian() / variation, realPos.z + rand.nextGaussian() / variation,
                    direction.x, direction.y + 0.1, direction.z,
                    Block.getStateId(world.getBlockState(getPosition().down())));
        }


        if (wSolve.isDriveWheel()) {
            if (Math.abs(Math.toDegrees(getSolver().getSideSlipAngle())) > 3) {
                MC.effectRenderer.addEffect(new TireTracks(MC.getTextureManager(),
                        this.world, realPos.x, realPos.y + 0.001, realPos.z, -rotationYaw + Math.toDegrees(getSolver().getSideSlipAngle())));

            }
        }


        if (!isDriveWheel) {
            return;
        }
        // System.out.println(solver.getSideSlipAngle());

        if (/* solver.rearAxel.isHandbraking */ Math.abs(solver.getSideSlipAngle()) > 0.1) {
            Random rand = new Random();
            for (int x = 0; x < (4 + ((int) Math.floor(Math.abs(solver.getSideSlipAngle()) * 4))); ++x) {
                double gaus = rand.nextGaussian() / 2;

                int id = 2;
                if (getSolver().materialBelow != Material.ROCK) {
                    id = 1;
                }
                if (getSolver().materialBelow == Material.SAND) {
                    id = 4;
                }
                MC.effectRenderer.addEffect(new DriftCloudParticle(this.world, realPos.x + gaus,
                        realPos.y + gaus + 0.2, realPos.z + gaus, direction.x, direction.y, direction.z, id));

            }
        }

    }

    /**
     * Easier to run, lighter load on computer.
     */
    @SideOnly(Side.CLIENT)
    public void doGeneralParticles() {
        Vec3d partDir = new Vec3d(-steerangle * 20, 0.3, -1).rotateYaw((float) Math.toRadians(-rotationYaw)).scale(0.1);
        Vec3d posDir = new Vec3d(0, 0, -1).rotateYaw((float) Math.toRadians(-rotationYaw)).add(getPositionVector());
        // drift particles
        if (solver.rearAxel.isHandbraking) {
            Random rand = new Random();
            for (int x = 0; x < 4; ++x) {
                double gaus = rand.nextGaussian() / 2;
                MC.effectRenderer.addEffect(new DriftSmokeFX(this.world, posDir.x + gaus,
                        posDir.y + gaus, posDir.z + gaus, partDir.x, partDir.y, partDir.z));

            }
        }

        // drive dust
        for (int x = 0; x < ((int) solver.synthAccelFor); ++x) {
            this.world.spawnParticle(EnumParticleTypes.BLOCK_DUST, posDir.x + rand.nextGaussian() / 2,
                    posDir.y + rand.nextGaussian() / 15, posDir.z + rand.nextGaussian() / 2, partDir.x, partDir.y + 0.1,
                    partDir.z, Block.getStateId(world.getBlockState(getPosition().down())));
        }
    }

    public boolean isShifting = false;
    public int tickShiftAnim = 0;

    public void notifyOfShift(int toGear) {
        this.motionX = 0.0;
        isShifting = true;
        tickShiftAnim = 0;
        // setState(VehicleState.SHIFTING);
    }

    public boolean isInShift() {
        return isShifting;
    }

    public void tickShiftAnim() {
        tickShiftAnim += 1;
    }

    public RigidBody body;

    public void updateSuspension(WheelSolver solver) {
        Vec3d realPos = solver.relativePosition.rotatePitch((float) Math.toRadians(rotationPitch))
                .rotateYaw((float) Math.toRadians(-rotationYaw)).add(getPositionVector())
                .add(0.0, rideOffset, 0.0);
        RayTraceResult result = world.rayTraceBlocks(realPos.add(0.0, 3.0, 0.0), realPos.subtract(0.0, 8.0, 0.0));
        // System.out.println(result.hitVec);

        if (result != null) {

            double h = Math.min(Math.abs((realPos.y - result.hitVec.y)) - solver.getRadius() + 0.4, 1);

            // h = -0.2;
            if (solver.actualRideHeight == 0.0) {
                solver.actualRideHeight = h;
            } else {
                solver.rideHeight = h;
            }

        }

    }

    public double tV;
    public double prevtV;

    @Override
    public boolean isInRangeToRenderDist(double distance) {
        // TODO Auto-generated method stub
        return true;
    }


    @Override
    protected boolean pushOutOfBlocks(double x, double y, double z) {
        System.out.println("FUICK?");
        return super.pushOutOfBlocks(x, y, z);
    }

    /**
     * onUpdate handles the following: physics, control events, syncing, and overall
     * is the 'nucleus' of the vehicle class. (this is my favorite method!)
     */
    @Override
    public void onUpdate() {

        this.stepHeight = 0.3f;
        //System.out.println("fuck");


        try {


            prevRotationRoll = rotationRoll;
            prevRotationRollH = rotationRollH;


            updateOBB();

            oldCollisions();
            //doOBBCollision();


            if (this.world.isRemote) {
                /*
                 * CLIENT SIDE
                 */


                //this.oreintedBoundingBox.previousEuler = this.oreintedBoundingBox.matrixToEuler(this.oreintedBoundingBox.axis);


                for (WheelSolver ws : getSolver().wheels) {
                    ws.prevWheelRot = ws.wheelRot;
                }


                // get the controlling passenger
                if (!isBeingRidden()) {
                    return;
                }
                if (!(getControllingPassenger() instanceof EntityPlayer)) {
                    return;
                }
                EntityPlayer player = (EntityPlayer) getControllingPassenger();
                if (player == null) {
                    return;
                }

                handleGeneralSound();

                // do particles
                handleDriveParticles();


                if (MC.player == player) {
                    /*
                     * DRIVER SIDE
                     */

                    GearShiftPattern pattern = getSolver().getPhysConf().getShiftPattern();

                    if (!(getState() == VehicleState.STARTING_TO_SHIFT || getState() == VehicleState.SHIFTING || getState() == VehicleState.FINISHING_SHIFT)) {
                        if (smoothShift.get().length() != 0.0) {
                            smoothShift.set(pattern.quickDoAnimation(getSolver().transmission).scale(0.3));
                        }
                        smoothShift.updatePrev();


                    }


                    doOBBCollision();

                    // update steering
                    // updateSteering((EntityPlayer) player);
                    keyBasedSteering();

                    // update controls
                    updateControls();



                    /*
                     * this.rotationYaw += driftTuner/10; if(Keyboard.isKeyDown(Keyboard.KEY_W)) {
                     * Vec3d v = new Vec3d(0, 0, 3.0).rotateYaw((float)
                     * Math.toRadians(-rotationYaw)); this.move(MoverType.SELF, v.x, v.y, v.z); }
                     */

                    // run block collisions
                    tickLerp();
                    super.onUpdate();
                    //doBlockCollisions();

                    drivingAspect.onUpdate(this);
                    getSuspensionStrategy().update(getSpeed(), lastYawDelta);

                    if (isEntityInsideOpaqueBlock()) {
                        System.out.println("REPORT!");
                    }

                    // isCollidedVertically);

                    //doBlockCollisions();

                    getSolver().activate(this);

                    // run the physics solver
                    Vec3d oldPos = getPositionVector();

                    // for interpolation purposes
                    solver.engineSolver.previousRPM = solver.getCurrentRPM();
                    try {
                        for (int x = 0; x < 50; ++x) {
                            getSolver().updatePhysics();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    getSolver().resetStep();

                    //doBlockCollisions();

                    Vec3d newPos = getPositionVector();

                    prevDist = dist;


                    dist = newPos.subtract(oldPos).length();


                    prevtV = tV;
                    tV = ((dist * 20) - (prevtV * 20)) / 20;
                    //System.out.println(this.dist*20);

                    //	getSolver().accelerationValue = ((dist*20)-(prevDist*20))/2.0;
                    // hil
                    handleHillClimbing();

                    CHANNEL.sendToServer(new VehicleControlMessage(new VehicleDataContainer(this)));

                    // doNetworking(false);

                    stabilizeRotation();

                } else {


                    // USE SMOOTHSHELL!
                    smoothShell.update();

                }

            } else {
                // doNetworking(true);
            }

            if (this.world.isRemote) {

                if (this.motionX <= 2.0) {
                    this.motionX += 1.0;
                } else {
                    this.motionX = 0;
                }

                drivingAspect = new VehicleDrivingAspect();

                if (this.motionX == 3.0) {
                    if (isShifting) {
                        isShifting = false;
                    }
                }

            }

            // this.vehicleState = VehicleState.SHIFTING;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Material current;
    public Supplier<Integer> currentMaterial = () -> {

        if (current == Material.GRASS || current == Material.GROUND || current == Material.CLAY || current == Material.SAND) {
            return Integer.valueOf(0);
        }
        return Integer.valueOf(1);

    };

    @SideOnly(Side.CLIENT)
    public void handleGeneralSound() {
        Material mat = this.world.getBlockState(getPosition().down()).getMaterial();


        // PLAY SHIFTING SOUND
        if (isInShift()) {
            PositionedSound ps = new PositionedSoundRecord(getConfiguration().getShiftSound(), SoundCategory.MASTER, 1.5f, 1.0f, (float) posX, (float) posY, (float) posZ);
            MC.getSoundHandler().playSound(ps);
        }


        // NULLIFY SOUNDS IF THEY ARE DONE
        if (drivingSound != null) {
            if (drivingSound.isDonePlaying() || !isVehicleRunning()) {
                drivingSound = null;
            }
        }
        if (driftingSound != null) {
            if (driftingSound.isDonePlaying()) {
                driftingSound = null;
            }
        }
        if (current != mat) {
            driftingSound = null;
        }


        // INITIATE A DRIVING SOUND
        if (drivingSound == null && isVehicleRunning()) {

            drivingSound = new EngineMovingSound(getConfiguration().getRunSound(), soundPositionProvider, donePlayingSoundProvider, this, false);

            MC.getSoundHandler().playSound(drivingSound);
        }


        // INITIATE A DRIFTING SOUND

    }
    // Anata no haka ni kansei dorifuto

    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {

    }

    @Override
    public <E extends ExtendedState<VehicleState>> void prepareTransaction(E finallyUpdateToState) {
        // TODO Auto-generated method stub

    }

    /*
     * Non Binary Tag Compound Read & Writing
     */

    @Override
    protected void readEntityFromNBT(NBTTagCompound compound) {
        // TODO Auto-generated method stub

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound compound) {
        // TODO Auto-generated method stub

    }

    /**
     * The holiest method which allows client comput'rs to abs'rb the holy knowledge
     * of the vehicle simulation did create on the mast'r comput'r. Unf'rtunately,
     * th're art so many issues in h're, despite me being a cryptology fanatic! how
     * ironic!
     *
     */
    public void doNetworking(boolean slave) {
        try {
            if (!slave) {
                // master's work uwu :3

                VehiclePhysicsSolver s = getSolver();

                getDataManager().get(VEHICLE_DAT).setData(getPositionVector(), throttle, driftTuner, isBraking,
                        forwardLean, sideLean, wheelRotationAngle, steerangle);
                getDataManager().get(SOLVER_DAT).setData(s.synthAccelFor, s.synthAccelSide, s.velocity);

                getDataManager().setDirty(VEHICLE_DAT);
                getDataManager().setDirty(SOLVER_DAT);
            } else {

                // System.out.println("je suis le slave! " + this.world.isRemote);

                // master please update me
                getDataManager().get(VEHICLE_DAT).updateVehicle(this);
                getDataManager().get(SOLVER_DAT).updateSolver(solver);

            }
        } catch (Exception ignored) {
        }

    }

    @Override
    public void setContext(ModContext modContext) {
        context = modContext;

    }

    @Override
    public boolean attackEntityFrom(DamageSource source, float amount) {

        if (source.isCreativePlayer()) {
            solver = null;

            setDead();

        }
        return super.attackEntityFrom(source, amount);
    }
}
