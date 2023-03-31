package com.paneedah.weaponlib;

import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.weaponlib.compatibility.*;
import com.paneedah.weaponlib.compatibility.CompatibleRayTraceResult.Type;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityBounceable extends Entity implements Contextual, CompatibleIEntityAdditionalSpawnData, CompatibleIThrowableEntity {

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
    private float maxRotationChange = 20f;

    protected boolean stopped;

    private Queue<Double> velocityHistory = new ArrayDeque<>(VELOCITY_HISTORY_SIZE);

    public EntityBounceable(ModContext modContext, World world, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(world);
        this.modContext = modContext;
        this.thrower = thrower;
        this.gravityVelocity = gravityVelocity;
        this.rotationSlowdownFactor = rotationSlowdownFactor;
        this.setSize(0.3F, 0.3F);
        this.setLocationAndAngles(thrower.posX, thrower.posY + (double)thrower.getEyeHeight(), thrower.posZ, 
                compatibility.getCompatibleAimingRotationYaw(thrower), thrower.rotationPitch);
        this.posX -= (double)(CompatibleMathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.posY -= 0.10000000149011612D;
        this.posZ -= (double)(CompatibleMathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.setPosition(this.posX, this.posY, this.posZ);
        //this.yOffset = 0.0F;
        float f = 0.4F;
        this.motionX = (double)(-CompatibleMathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * CompatibleMathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
        this.motionZ = (double)(CompatibleMathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * CompatibleMathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
        this.motionY = (double)(-CompatibleMathHelper.sin((this.rotationPitch + 0 /*this.func_70183_g()*/) / 180.0F * (float)Math.PI) * f);

        this.initialYaw = this.rotationYaw;
        this.initialPitch = this.rotationPitch;
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, velocity /*1.3f*/, 10.0F); // TODO: make inaccuracy configurable parameter

        log.debug("Throwing with position {}{}{}, rotation pitch {}, velocity {}, {}, {}",
                posX, posY, posZ,
                this.rotationPitch,
                this.motionX, this.motionY, this.motionZ);
    }

    public void setThrowableHeading(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        float f2 = CompatibleMathHelper.sqrt_double(motionX * motionX + motionY * motionY + motionZ * motionZ);
        motionX /= (double)f2;
        motionY /= (double)f2;
        motionZ /= (double)f2;
        motionX += this.rand.nextGaussian() * 0.007499999832361937D * (double)inaccuracy;
        motionY += this.rand.nextGaussian() * 0.007499999832361937D * (double)inaccuracy;
        motionZ += this.rand.nextGaussian() * 0.007499999832361937D * (double)inaccuracy;
        motionX *= (double)velocity;
        motionY *= (double)velocity;
        motionZ *= (double)velocity;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        float f3 = CompatibleMathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
        this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(motionX, motionZ) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(motionY, (double)f3) * 180.0D / Math.PI);
    }

    public EntityBounceable(World world) {
        super(world);
        setRotations();
    }

    private void setRotations() {
        xRotationChange = maxRotationChange * (float)rand.nextGaussian();
        yRotationChange = maxRotationChange * (float)rand.nextGaussian();
        zRotationChange = maxRotationChange * (float)rand.nextGaussian();
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

        if (!compatibility.world(this).isRemote && ticksExisted > MAX_TICKS) {
            this.setDead();
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

        ++this.ticksInAir;

        if(stopped) {
            return;
        }

        Vector3D vec3 = new Vector3D(this.posX, this.posY, this.posZ);
        Vector3D vec31 = new Vector3D(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        CompatibleRayTraceResult movingobjectposition = CompatibleRayTracing.rayTraceBlocks(compatibility.world(this), vec3, vec31, (block, blockMetadata) -> canCollideWithBlock(block, blockMetadata));

        vec3 = new Vector3D(this.posX, this.posY, this.posZ);
        vec31 = new Vector3D(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (movingobjectposition != null) {
            vec31.copy(movingobjectposition.getHitVec());
        }

        if (thrower != null) { //if(!this.worldObj.isRemote)
            Entity entity = null;
            List<?> list = compatibility.getEntitiesWithinAABBExcludingEntity(compatibility.world(this), this,
                    compatibility.getBoundingBox(this).addCoord(this.motionX, this.motionY, this.motionZ)
                    .expand(1.0D, 1.0D, 1.0D));
            double d0 = 0.0D;
            EntityLivingBase entitylivingbase = this.getThrower();

            CompatibleRayTraceResult entityMovingObjectPosition = null;
            for (int j = 0; j < list.size(); ++j) {
                Entity entity1 = (Entity)list.get(j);

                if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || this.ticksInAir >= 5)) {
                    float f = 0.3F;
                    CompatibleAxisAlignedBB axisalignedbb = compatibility.expandEntityBoundingBox(entity1, f, f, f);
                    CompatibleRayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

                    if (movingobjectposition1 != null) {
                        double d1 = vec3.distanceTo(movingobjectposition1.getHitVec()); //hitVec

                        if (d1 < d0 || d0 == 0.0D) {
                            entity = entity1;
                            entityMovingObjectPosition = movingobjectposition1;
                            d0 = d1;
                        }
                    }
                }
            }

            if (entity != null) {
                movingobjectposition = new CompatibleRayTraceResult(entity);
                movingobjectposition.setSideHit(entityMovingObjectPosition.getSideHit());
                movingobjectposition.setHitVec(entityMovingObjectPosition.getHitVec());
            }
        }

        log.trace("Ori position to {}, {}, {}, motion {} {} {} ", this.posX, this.posY, this.posZ,
                motionX, motionY, motionZ);

        if(movingobjectposition != null && (movingobjectposition.getTypeOfHit() == Type.BLOCK
                    || (movingobjectposition.getTypeOfHit() == Type.ENTITY))) {

            //TODO: remove logging since it's creating wrapper objects
            log.trace("Hit {}, vec set to {}, {}, {}", movingobjectposition.getTypeOfHit(),
                    movingobjectposition.getHitVec().x,
                    movingobjectposition.getHitVec().y,
                    movingobjectposition.getHitVec().z);

            log.trace("Before bouncing {}, side {}, motion set to {}, {}, {}", bounceCount,
                    movingobjectposition.getSideHit(),
                    motionX, motionY, motionZ);

            this.posX = movingobjectposition.getHitVec().x;
            this.posY = movingobjectposition.getHitVec().y;
            this.posZ = movingobjectposition.getHitVec().z;

            switch(movingobjectposition.getSideHit()) {
            case DOWN:
                this.motionY = -this.motionY;
                this.posY += motionY;
                break;
            case UP:
                this.motionY = -this.motionY;
//                if(this.motionY - gravityVelocity < 0.05) {
//                    log.debug("Force stopping entity");
//                    gravityVelocity = (float) this.motionY;
//                    forcedStop = true;
//                }
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
            if(movingobjectposition.getTypeOfHit() == Type.ENTITY) {
                avoidEntityCollisionAfterBounce(movingobjectposition);
            } else if(movingobjectposition.getTypeOfHit() == Type.BLOCK) {
                avoidBlockCollisionAfterBounce(movingobjectposition);
            }

            log.trace("After bouncing {}  motion set to {}, {}, {}", bounceCount, motionX, motionY, motionZ);
            onBounce(movingobjectposition);
            bounceCount++;
            if(this.isDead) {
                return;
            }
        } else {
            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
        }

        setPosition(this.posX, this.posY, this.posZ);

        float motionSquared = CompatibleMathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);

        this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

        for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)motionSquared) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
        {
            ;
        }

        while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
        {
            this.prevRotationPitch += 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw < -180.0F)
        {
            this.prevRotationYaw -= 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
        {
            this.prevRotationYaw += 360.0F;
        }

        this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
        this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
        float f2 = 0.99F;
        float currentGravityVelocity = this.getGravityVelocity();

        if (this.isInWater()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25F;
                compatibility.spawnParticle(compatibility.world(this),
                        "bubble", this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ);
            }

            f2 = 0.8F;
        }

        if(movingobjectposition != null &&
                (movingobjectposition.getTypeOfHit() == Type.BLOCK || movingobjectposition.getTypeOfHit() == Type.ENTITY)) {
            f2 = slowdownFactor;
            rotationSlowdownFactor = rotationSlowdownFactor * (slowdownFactor * 1.5f);
        }

        this.motionX *= (double)f2;
        this.motionY *= (double)f2;
        this.motionZ *= (double)f2;

        recordVelocityHistory();

        if(!velocityHistory.stream().anyMatch(v -> v > STOP_THRESHOLD)) {
            motionX = motionY = motionZ = 0.0;
            stopped = true;
            log.trace("Stopping {}", this);
            onStop();
        } else {
            this.motionY -=  (double)currentGravityVelocity;
        }

        log.trace("Set position to {}, {}, {}, motion {} {} {} ", this.posX, this.posY, this.posZ,
                motionX, motionY, motionZ);
    }

    public  void onStop() {}

    public void onBounce(CompatibleRayTraceResult movingobjectposition) {}

    private void avoidBlockCollisionAfterBounce(CompatibleRayTraceResult movingobjectposition) {
       
    	
    	if(movingobjectposition.getTypeOfHit() != Type.BLOCK) {
            return;
        }

        double dX = Math.signum(motionX) * 0.01;
        double dY = Math.signum(motionY) * 0.01;
        double dZ = Math.signum(motionZ) * 0.01;

        for(int i = 0; i < 10; i++) {

            double projectedXPos = this.posX + dX * i;
            double projectedYPos = this.posY + dY * i;
            double projectedZPos = this.posZ + dZ * i;

            Vector3D projectedPos = new Vector3D(projectedXPos, projectedYPos, projectedZPos);

            CompatibleBlockPos blockPos = new CompatibleBlockPos(projectedPos);

            CompatibleAxisAlignedBB projectedEntityBoundingBox = compatibility.getBoundingBox(this)
                    .offset(dX * i, dY * i, dZ * i);

            if(compatibility.isAirBlock(compatibility.world(this), blockPos) ||
                    !new CompatibleAxisAlignedBB(blockPos).intersectsWith(projectedEntityBoundingBox) ) {
                this.posX = projectedXPos;
                this.posY = projectedYPos;
                this.posZ = projectedZPos;
                log.trace("Found non-intercepting post-bounce position on iteration {}", i);
                break;
            }
        }
    }

    private void avoidEntityCollisionAfterBounce(CompatibleRayTraceResult movingobjectposition) {

    	
        if(movingobjectposition.getEntityHit() == null) {
            return;
        }

        slowdownFactor = 0.01f;
        double dX = Math.signum(motionX) * 0.01;
        double dY = Math.signum(motionY) * 0.01;
        double dZ = Math.signum(motionZ) * 0.01;

        float f = 0.3F;
        CompatibleAxisAlignedBB axisalignedbb = compatibility.getBoundingBox(movingobjectposition.getEntityHit())
                .expand((double)f, (double)f, (double)f);
        CompatibleRayTraceResult intercept = movingobjectposition;
        for(int i = 0; i < 10; i++) {
            Vector3D currentPos = new Vector3D(this.posX + dX * i, this.posY + dY * i, this.posZ + dY * i);
            Vector3D projectedPos = new Vector3D(this.posX + dX * (i + 1), this.posY + dY * (i + 1), this.posZ + dZ * (i + 1));
            intercept = axisalignedbb.calculateIntercept(currentPos, projectedPos);
            if(intercept == null) {
                //log.debug("Found no-intercept after bounce with offsets {}, {}, {}", dX, dY, dZ);

                IBlockState iBlockState;

                CompatibleBlockPos blockPos = new CompatibleBlockPos(projectedPos);
                if((iBlockState = compatibility.getBlockAtPosition(compatibility.world(this), blockPos)) != null
                        && !compatibility.isAirBlock(iBlockState)) {
                    log.debug("Found non-intercept position colliding with block {}", iBlockState);
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

        if(intercept != null) {
            log.debug("Could not find non-intercept position after bounce");
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
        if(thrower == null && entityId >= 0) {
            Entity entity = compatibility.world(this).getEntityByID(entityId);
            if(entity instanceof EntityLivingBase) {
                this.thrower = (EntityPlayer) entity;
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

        log.debug("Restoring with position {}{}{}, rotation pitch {}, velocity {}, {}, {}",
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
        return compatibility.canCollideCheck(block, iBlockState, false);
    }

    private void recordVelocityHistory() {
        double velocity = motionX * motionX + motionY * motionY + motionZ * motionZ;
        velocityHistory.add(velocity);
        if(velocityHistory.size() > VELOCITY_HISTORY_SIZE) {
            velocityHistory.poll();
        }
    }

    @Override
    public void setContext(ModContext modContext) {
        if(this.modContext == null) {
            this.modContext = modContext;
        }
    }

}
