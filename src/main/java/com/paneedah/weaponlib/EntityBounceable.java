package com.paneedah.weaponlib;

import com.paneedah.mwc.ProjectConstants;
import com.paneedah.mwc.utils.MWCUtil;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.jafama.FastMath;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.common.registry.IThrowableEntity;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class EntityBounceable extends Entity implements Contextual, IThrowableEntity, IEntityAdditionalSpawnData {

    private static final int VELOCITY_HISTORY_SIZE = 10;

    private static final double STOP_THRESHOLD = 0.001;

    private static final int MAX_TICKS = 2000;

    protected ModContext modContext;

    private float gravityVelocity;

    private float slowdownFactor = 0.5f;
    private int ticksInAir;

    private EntityLivingBase thrower;
    protected int bounceCount;

    private float initialYaw;
    private float initialPitch;
    private float xRotation;
    private float yRotation;
    private float zRotation;
    private float xRotationChange;
    private float yRotationChange;
    private float zRotationChange;

    private float rotationSlowdownFactor = 0.99f;

    protected boolean stopped;

    private final Queue<Double> velocityHistory = new ArrayDeque<>(VELOCITY_HISTORY_SIZE);

    public EntityBounceable(ModContext modContext, World world, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(world);
        this.modContext = modContext;
        this.thrower = thrower;
        this.gravityVelocity = gravityVelocity;
        this.rotationSlowdownFactor = rotationSlowdownFactor;
        setSize(0.3F, 0.3F);
        setLocationAndAngles(thrower.posX, thrower.posY + (double) thrower.getEyeHeight(), thrower.posZ,
                thrower.rotationYaw, thrower.rotationPitch);
        this.posX -= FastMath.cos(this.rotationYaw / 180.0F * (float) Math.PI) * 0.16F;
        this.posY -= 0.10000000149011612D;
        this.posZ -= FastMath.sin(this.rotationYaw / 180.0F * (float) Math.PI) * 0.16F;
        setPosition(this.posX, this.posY, this.posZ);
        //this.yOffset = 0.0F;
        float f = 0.4F;
        this.motionX = -MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI) * f;
        this.motionZ = MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI) * f;
        this.motionY = -MathHelper.sin((this.rotationPitch + 0 /*this.func_70183_g()*/) / 180.0F * (float) Math.PI) * f;

        initialYaw = this.rotationYaw;
        initialPitch = this.rotationPitch;
        setThrowableHeading(this.motionX, this.motionY, this.motionZ, velocity /*1.3f*/, 10.0F); // TODO: make inaccuracy configurable parameter

        ProjectConstants.LOGGER.debug("Throwing with position {}{}{}, rotation pitch {}, velocity {}, {}, {}",
                posX, posY, posZ,
                this.rotationPitch,
                this.motionX, this.motionY, this.motionZ);
    }

    public void setThrowableHeading(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        float f2 = MathHelper.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
        motionX /= f2;
        motionY /= f2;
        motionZ /= f2;
        motionX += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionY += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionZ += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionX *= velocity;
        motionY *= velocity;
        motionZ *= velocity;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        float f3 = MathHelper.sqrt(motionX * motionX + motionZ * motionZ);
        this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(motionX, motionZ) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(motionY, f3) * 180.0D / Math.PI);
    }

    public EntityBounceable(World world) {
        super(world);
        setRotations();
    }

    private void setRotations() {
        float maxRotationChange = 20f;
        xRotationChange = maxRotationChange * (float) rand.nextGaussian();
        yRotationChange = maxRotationChange * (float) rand.nextGaussian();
        zRotationChange = maxRotationChange * (float) rand.nextGaussian();
    }

    @Override
    public EntityLivingBase getThrower() {
        return thrower;
    }

    @Override
    public void setThrower(Entity thrower) {
        this.thrower = (EntityLivingBase) thrower;
    }

    @Override
    public void onUpdate() {

        if (!world.isRemote && ticksExisted > MAX_TICKS) {
            setDead();
            return;
        }

        xRotation += xRotationChange;
        yRotation += yRotationChange;
        zRotation += zRotationChange;

        xRotationChange *= rotationSlowdownFactor;
        yRotationChange *= rotationSlowdownFactor;
        zRotationChange *= rotationSlowdownFactor;

        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();

        ++ticksInAir;

        if (stopped) {
            return;
        }

        Vector3D vec3 = new Vector3D(this.posX, this.posY, this.posZ);
        Vector3D vec31 = new Vector3D(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        RayTraceResult movingobjectposition = MWCUtil.rayTraceBlocks(world, vec3, vec31, (block, blockMetadata) -> canCollideWithBlock(block, blockMetadata));

        vec3 = new Vector3D(this.posX, this.posY, this.posZ);
        vec31 = new Vector3D(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (movingobjectposition != null) {
            vec31.copy(new Vector3D(movingobjectposition.hitVec));
        }

        if (thrower != null) { //if(!this.worldObj.isRemote)
            Entity entity = null;
            List<?> list = world.getEntitiesWithinAABBExcludingEntity(null, getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D)); // compatibility.getEntitiesWithinAABBExcludingEntity(world, this, this.getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double d0 = 0.0D;
            EntityLivingBase entitylivingbase = getThrower();

            RayTraceResult entityMovingObjectPosition = null;
            for (int j = 0; j < list.size(); ++j) {
                Entity entity1 = (Entity) list.get(j);

                if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || ticksInAir >= 5)) {
                    float f = 0.3F;
                    AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand(f, f, f);
                    RayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(vec3.toVec3d(), vec31.toVec3d());

                    if (movingobjectposition1 != null) {
                        double d1 = vec3.distanceTo(new Vector3D(movingobjectposition1.hitVec)); //hitVec

                        if (d1 < d0 || d0 == 0.0D) {
                            entity = entity1;
                            entityMovingObjectPosition = movingobjectposition1;
                            d0 = d1;
                        }
                    }
                }
            }

            if (entity != null) {
                movingobjectposition = new RayTraceResult(entity);
                movingobjectposition.sideHit = entityMovingObjectPosition.sideHit;
                movingobjectposition.hitVec = entityMovingObjectPosition.hitVec;
            }
        }

        ProjectConstants.LOGGER.trace("Ori position to {}, {}, {}, motion {} {} {} ", this.posX, this.posY, this.posZ,
                motionX, motionY, motionZ);

        if (movingobjectposition != null && (movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK || (movingobjectposition.typeOfHit == RayTraceResult.Type.ENTITY))) {

            //TODO: remove logging since it's creating wrapper objects
            ProjectConstants.LOGGER.trace("Hit {}, vec set to {}, {}, {}", movingobjectposition.typeOfHit,
                    movingobjectposition.hitVec.x,
                    movingobjectposition.hitVec.y,
                    movingobjectposition.hitVec.z);

            ProjectConstants.LOGGER.trace("Before bouncing {}, side {}, motion set to {}, {}, {}", bounceCount,
                    movingobjectposition.sideHit,
                    motionX, motionY, motionZ);

            this.posX = movingobjectposition.hitVec.x;
            this.posY = movingobjectposition.hitVec.y;
            this.posZ = movingobjectposition.hitVec.z;

            switch (movingobjectposition.sideHit) {
                case DOWN:
                    this.motionY = -this.motionY;
                    this.posY += motionY;
                    break;
                case UP:
                    this.motionY = -this.motionY;
                    break;
                case NORTH:
                    this.motionZ = -this.motionZ;
                    this.posZ += motionZ;
                    break;
                case SOUTH:
                    this.motionZ = -this.motionZ;
                    break;
                case WEST:
                    this.motionX = -this.motionX;
                    this.posX += motionX;
                    break;
                case EAST:
                    this.motionX = -this.motionX;
                    break;
            }

            setPosition(posX, posY, posZ);
            if (movingobjectposition.typeOfHit == RayTraceResult.Type.ENTITY) {
                avoidEntityCollisionAfterBounce(movingobjectposition);
            } else if (movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK) {
                avoidBlockCollisionAfterBounce(movingobjectposition);
            }

            ProjectConstants.LOGGER.trace("After bouncing {}  motion set to {}, {}, {}", bounceCount, motionX, motionY, motionZ);
            onBounce(movingobjectposition);
            bounceCount++;
            if (this.isDead) {
                return;
            }
        } else {
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
        }

        setPosition(this.posX, this.posY, this.posZ);

        float motionSquared = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);

        this.rotationYaw = (float) (Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

        for (this.rotationPitch = (float) (Math.atan2(this.motionY, motionSquared) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F) {
        }

        while (this.rotationPitch - this.prevRotationPitch >= 180.0F) {
            this.prevRotationPitch += 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw < -180.0F) {
            this.prevRotationYaw -= 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw >= 180.0F) {
            this.prevRotationYaw += 360.0F;
        }

        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
        float f2 = 0.99F;
        float currentGravityVelocity = getGravityVelocity();

        if (isInWater()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25F;
                EnumParticleTypes particleType = EnumParticleTypes.getByName("bubble");
                if (particleType != null) {
                    world.spawnParticle(particleType, this.posX - this.motionX * (double) f4, this.posY - this.motionY * (double) f4, this.posZ - this.motionZ * (double) f4, this.motionX, this.motionY, this.motionZ);
                }
            }

            f2 = 0.8F;
        }

        if (movingobjectposition != null &&
                (movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK || movingobjectposition.typeOfHit == RayTraceResult.Type.ENTITY)) {
            f2 = slowdownFactor;
            rotationSlowdownFactor = rotationSlowdownFactor * (slowdownFactor * 1.5f);
        }

        this.motionX *= f2;
        this.motionY *= f2;
        this.motionZ *= f2;

        recordVelocityHistory();

        if (velocityHistory.stream().noneMatch(v -> v.doubleValue() > STOP_THRESHOLD)) {
            motionX = motionY = motionZ = 0.0;
            stopped = true;
            ProjectConstants.LOGGER.trace("Stopping {}", this);
            onStop();
        } else {
            this.motionY -= currentGravityVelocity;
        }

        ProjectConstants.LOGGER.trace("Set position to {}, {}, {}, motion {} {} {} ", this.posX, this.posY, this.posZ,
                motionX, motionY, motionZ);
    }

    public void onStop() {}

    public void onBounce(RayTraceResult movingobjectposition) {}

    private void avoidBlockCollisionAfterBounce(RayTraceResult movingobjectposition) {


        if (movingobjectposition.typeOfHit != RayTraceResult.Type.BLOCK) {
            return;
        }

        double dX = Math.signum(motionX) * 0.01;
        double dY = Math.signum(motionY) * 0.01;
        double dZ = Math.signum(motionZ) * 0.01;

        for (int i = 0; i < 10; i++) {

            double projectedXPos = this.posX + dX * i;
            double projectedYPos = this.posY + dY * i;
            double projectedZPos = this.posZ + dZ * i;

            Vector3D projectedPos = new Vector3D(projectedXPos, projectedYPos, projectedZPos);

            BlockPos blockPos = new BlockPos(projectedPos.x, projectedPos.y, projectedPos.z);

            AxisAlignedBB projectedEntityBoundingBox = getEntityBoundingBox().offset(dX * i, dY * i, dZ * i);

            if (world.isAirBlock(blockPos) || !new AxisAlignedBB(blockPos).intersects(projectedEntityBoundingBox)) {
                this.posX = projectedXPos;
                this.posY = projectedYPos;
                this.posZ = projectedZPos;
                ProjectConstants.LOGGER.trace("Found non-intercepting post-bounce position on iteration {}", i);
                break;
            }
        }
    }

    private void avoidEntityCollisionAfterBounce(RayTraceResult movingobjectposition) {


        if (movingobjectposition.entityHit == null) {
            return;
        }

        slowdownFactor = 0.01f;
        double dX = Math.signum(motionX) * 0.01;
        double dY = Math.signum(motionY) * 0.01;
        double dZ = Math.signum(motionZ) * 0.01;

        float f = 0.3F;
        AxisAlignedBB axisalignedbb = movingobjectposition.entityHit.getEntityBoundingBox().expand(f, f, f);
        RayTraceResult intercept = movingobjectposition;
        for (int i = 0; i < 10; i++) {
            Vector3D currentPos = new Vector3D(this.posX + dX * i, this.posY + dY * i, this.posZ + dY * i);
            Vector3D projectedPos = new Vector3D(this.posX + dX * (i + 1), this.posY + dY * (i + 1), this.posZ + dZ * (i + 1));
            intercept = axisalignedbb.calculateIntercept(currentPos.toVec3d(), projectedPos.toVec3d());
            if (intercept == null) {
                //log.debug("Found no-intercept after bounce with offsets {}, {}, {}", dX, dY, dZ);

                IBlockState iBlockState;

                BlockPos blockPos = new BlockPos(projectedPos.x, projectedPos.y, projectedPos.z);
                if ((iBlockState = world.getBlockState(blockPos)) != null && !(iBlockState.getBlock() == Blocks.AIR)) {
                    ProjectConstants.LOGGER.debug("Found non-intercept position colliding with block {}", iBlockState);
                    intercept = movingobjectposition;
                } else {

                    this.posX = projectedPos.x;
                    this.posY = projectedPos.y;
                    this.posZ = projectedPos.z;

                }

                break;
            }

            //log.debug("Still intercepting after bounce, adjusting offsets to {}, {}, {}", dX, dY, dZ);
        }

        if (intercept != null) {
            ProjectConstants.LOGGER.debug("Could not find non-intercept position after bounce");
        }
    }

    //@Override
    protected float getGravityVelocity() {
        return gravityVelocity;
    }

    @Override
    protected void entityInit() {
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound tagCompound) {

    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound tagCompound) {
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeInt(thrower != null ? thrower.getEntityId() : -1);
        buffer.writeDouble(posX);
        buffer.writeDouble(posY);
        buffer.writeDouble(posZ);
        buffer.writeDouble(motionX);
        buffer.writeDouble(motionY);
        buffer.writeDouble(motionZ);
        buffer.writeFloat(gravityVelocity);
        buffer.writeFloat(rotationSlowdownFactor);
        buffer.writeFloat(initialYaw);
        buffer.writeFloat(initialPitch);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        int entityId = buffer.readInt();
        if (thrower == null && entityId >= 0) {
            Entity entity = world.getEntityByID(entityId);
            if (entity instanceof EntityLivingBase) {
                thrower = (EntityPlayer) entity;
            }
        }
        posX = buffer.readDouble();
        posY = buffer.readDouble();
        posZ = buffer.readDouble();
        motionX = buffer.readDouble();
        motionY = buffer.readDouble();
        motionZ = buffer.readDouble();
        gravityVelocity = buffer.readFloat();
        rotationSlowdownFactor = buffer.readFloat();
        initialYaw = buffer.readFloat();
        initialPitch = buffer.readFloat();

        setPosition(posX, posY, posZ);

        ProjectConstants.LOGGER.debug("Restoring with position {}{}{}, rotation pitch {}, velocity {}, {}, {}",
                posX, posY, posZ,
                this.rotationPitch,
                this.motionX, this.motionY, this.motionZ);
    }

    public float getXRotation() {
        return xRotation;
    }

    public float getYRotation() {
        return yRotation - initialYaw - 90f;
    }

    public float getZRotation() {
        return zRotation;
    }

    public boolean canCollideWithBlock(Block block, IBlockState iBlockState) {
        return iBlockState.getMaterial().blocksMovement();
    }

    private void recordVelocityHistory() {
        double velocity = motionX * motionX + motionY * motionY + motionZ * motionZ;
        velocityHistory.add(Double.valueOf(velocity));
        if (velocityHistory.size() > VELOCITY_HISTORY_SIZE) {
            velocityHistory.poll();
        }
    }

    @Override
    public void setContext(ModContext modContext) {
        if (this.modContext == null) {
            this.modContext = modContext;
        }
    }

}
