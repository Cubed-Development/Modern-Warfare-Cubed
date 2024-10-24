package com.paneedah.weaponlib;

import com.paneedah.mwc.network.messages.BlockHitMessage;
import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.config.ModernConfigManager;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import io.redstudioragnarok.redcore.vectors.Vector3F;
import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

import java.util.List;

import static com.paneedah.mwc.MWC.CHANNEL;

public abstract class EntityProjectile extends Entity implements IProjectile, IEntityAdditionalSpawnData {

    private static final String TAG_GRAVITY_VELOCITY = "gravityVelocity";

    private static final int MAX_TICKS = 200;

    private static final int DEFAULT_MAX_LIFETIME = 5000;

    private int xTile = -1;
    private int yTile = -1;
    private int zTile = -1;
    //private IBlockState field_145785_f;
    protected boolean inGround;
    public int throwableShake;

    protected EntityLivingBase thrower;
    private String throwerName;
    //private int ticksInGround;
    private int ticksInAir;

    protected float gravityVelocity;
    protected float velocity;
    protected float inaccuracy;

    private long timestamp;

    @Getter
    private double aimTan;

    protected long maxLifetime = DEFAULT_MAX_LIFETIME;

    public EntityProjectile(World world) {
        super(world);
        setSize(0.25F, 0.25F);
        timestamp = System.currentTimeMillis();
    }

    public EntityProjectile(World world, EntityLivingBase thrower, float velocity, float gravityVelocity, float inaccuracy) {
        this(world);

        this.thrower = thrower;
        this.velocity = velocity;
        this.gravityVelocity = gravityVelocity;
        this.inaccuracy = inaccuracy;

    }

    public void setPositionAndDirection(boolean isAiming) {
        double x = thrower.posX;
        double y = thrower.posY + thrower.getEyeHeight();
        double z = thrower.posZ;

        x -= Math.cos(thrower.rotationYaw / 180 * Math.PI) * (isAiming ? 0 : 0.16);
        y -= (isAiming ? 0 : 0.1);
        z -= Math.sin(thrower.rotationYaw / 180 * Math.PI) * (isAiming ? 0 : 0.16);

        setPositionAndRotation(x, y, z, thrower.rotationYaw, thrower.rotationPitch);

        motionX = -Math.sin(rotationYaw / 180 * Math.PI) * Math.cos(rotationPitch / 180 * Math.PI);
        motionY = -Math.sin(rotationPitch / 180 * Math.PI);
        motionZ = Math.cos(rotationYaw / 180 * Math.PI) * Math.cos(rotationPitch / 180 * Math.PI);

        setThrowableHeading(motionX, motionY, motionZ, velocity, inaccuracy);
    }

    /**
     * Similar to setArrowHeading, it's point the throwable entity to a x, y, z
     * direction.
     */
    public void setThrowableHeading(double x, double y, double z, float velocity, float inaccuracy) {
        float f2 = MathHelper.sqrt(x * x + y * y + z * z);
        x /= f2;
        y /= f2;
        z /= f2;
        x += rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        y += rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        z += rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        x *= velocity;
        y *= velocity;
        z *= velocity;
        motionX = x;
        motionY = y;
        motionZ = z;
        float f3 = MathHelper.sqrt(x * x + z * z);
        prevRotationYaw = rotationYaw = (float) (Math.atan2(x, z) * 180.0D / Math.PI);
        prevRotationPitch = rotationPitch = (float) (Math.atan2(y, f3) * 180.0D / Math.PI);
        //this.ticksInGround = 0;
    }

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    // @SideOnly(Side.CLIENT)
    public void setVelocity(double mX, double mY, double mZ) {
        motionX = mX;
        motionY = mY;
        motionZ = mZ;

        if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F) {
            float f = MathHelper.sqrt(mX * mX + mZ * mZ);
            prevRotationYaw = rotationYaw = (float) (Math.atan2(mX, mZ) * 180.0D / Math.PI);
            prevRotationPitch = rotationPitch = (float) (Math.atan2(mY, f) * 180.0D
                    / Math.PI);
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate() {
        if (ticksExisted > MAX_TICKS) {
            return;
        }

        lastTickPosX = posX;
        lastTickPosY = posY;
        lastTickPosZ = posZ;
        super.onUpdate();

        if (throwableShake > 0) {
            --throwableShake;
        }

        if (inGround) {

            inGround = false;
            motionX *= rand.nextFloat() * 0.2F;
            motionY *= rand.nextFloat() * 0.2F;
            motionZ *= rand.nextFloat() * 0.2F;
            //this.ticksInGround = 0;
            ticksInAir = 0;

        } else {
            ++ticksInAir;
        }

        Vector3D vec3 = new Vector3D(posX, posY, posZ);
        Vector3D vec31 = new Vector3D(posX + motionX, posY + motionY, posZ + motionZ);

        //List<BlockPos> possibleCollisions = new ArrayList<>();

        // Check what is at the projectile current position, null if air
        RayTraceResult movingobjectposition = MWCUtil.rayTraceBlocks(world, vec3, vec31, (block, blockMetadata) -> canCollideWithBlock(null, block, null, blockMetadata));

        /*
         *  GLASS BREAK CHECK
         */

        if (ModernConfigManager.bulletBreakGlass && !world.isRemote) {
            Vec3d motion = new Vec3d(motionX, motionY, motionZ);
            Vec3d start = new Vec3d(prevPosX, prevPosY, prevPosZ);
            Vec3d end = new Vec3d(posX, posY, posZ).add(motion);

            RayTraceResult rtr = world.rayTraceBlocks(start, end, false, true, false);
            if (rtr != null) {
                IBlockState state = world.getBlockState(rtr.getBlockPos());
                if (state.getMaterial() == Material.GLASS) {
                    if (ModernConfigManager.bulletBreakGlass) {
                        world.destroyBlock(rtr.getBlockPos(), true);
                    }

                    CHANNEL.sendToAllAround(new BlockHitMessage(rtr.getBlockPos(), new Vector3F(rtr.hitVec), rtr.sideHit), new NetworkRegistry.TargetPoint(dimension, posX, posY, posZ, 20.0));
                }
            }
        }

        vec3 = new Vector3D(posX, posY, posZ);
        vec31 = new Vector3D(posX + motionX, posY + motionY, posZ + motionZ);

        if (movingobjectposition != null) {
            vec31 = new Vector3D(movingobjectposition.hitVec);
        }

        if (!world.isRemote) {
            Entity entity = getRayTraceEntities(vec3, vec31);

            if (entity != null) {
                movingobjectposition = new RayTraceResult(entity);
            }
        }

        if (movingobjectposition != null) {
            onImpact(movingobjectposition);
        }

        posX += motionX;
        posY += motionY;
        posZ += motionZ;
        float f1 = MathHelper.sqrt(motionX * motionX + motionZ * motionZ);
        rotationYaw = (float) (Math.atan2(motionX, motionZ) * 180.0D / Math.PI);

        for (rotationPitch = (float) (Math.atan2(motionY, f1) * 180.0D / Math.PI);
             rotationPitch - prevRotationPitch < -180.0F; prevRotationPitch -= 360.0F)
            ;

        while (rotationPitch - prevRotationPitch >= 180.0F) {
            prevRotationPitch += 360.0F;
        }

        while (rotationYaw - prevRotationYaw < -180.0F) {
            prevRotationYaw -= 360.0F;
        }

        while (rotationYaw - prevRotationYaw >= 180.0F) {
            prevRotationYaw += 360.0F;
        }

        rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;
        rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;
        float f2 = 0.99F;
        float f3 = gravityVelocity; //this.getGravityVelocity();

        if (isInWater()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25F;
                EnumParticleTypes particleType = EnumParticleTypes.getByName("bubble");
                if (particleType != null) {
                    world.spawnParticle(particleType, posX - motionX * (double) f4, posY - motionY * (double) f4, posZ - motionZ * (double) f4, motionX, motionY, motionZ);
                }
            }

            f2 = 0.8F;
        }

        motionX *= f2;
        motionY *= f2;
        motionZ *= f2;
        motionY -= f3;
        setPosition(posX, posY, posZ);
    }

    private Entity getRayTraceEntities(Vector3D vec3, Vector3D vec31) {
        Entity entity = null;
        List<?> list = world.getEntitiesWithinAABBExcludingEntity(null, getEntityBoundingBox().expand(motionX, motionY, motionZ).expand(1.0D, 1.0D, 1.0D));//compatibility.getEntitiesWithinAABBExcludingEntity(world, this, this.getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
        double d0 = 0.0D;
        EntityLivingBase entitylivingbase = getThrower();

        for (Object o : list) {
            Entity entity1 = (Entity) o;

            // Fix for issue in the mod where a dying entity could
            // block bullets.
            boolean flag = true;
            if (entity1 instanceof EntityLivingBase) {
                EntityLivingBase elb = (EntityLivingBase) entity1;
                flag = elb.deathTime == 0;
            }

            if (flag && entity1.canBeCollidedWith() && (entity1 != entitylivingbase || ticksInAir >= 5)) {
                float f1 = 0.15F, f2 = -0.15f;
                AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand(f1, f1, f1);
                RayTraceResult movingobjectposition = axisalignedbb.calculateIntercept(vec3.toVec3d(), vec31.toVec3d());
                AxisAlignedBB axisalignedbb1 = entity1.getEntityBoundingBox().expand(f2, f2, f2);
                RayTraceResult movingobjectposition1 = axisalignedbb1.calculateIntercept(vec3.toVec3d(), vec31.toVec3d());

                if (movingobjectposition != null) {
                    double d1 = vec3.distanceTo(new Vector3D(movingobjectposition.hitVec));

                    if (d1 < d0 || d0 == 0.0D) {
                        entity = entity1;
                        d0 = d1;
                    }
                } else if (movingobjectposition1 != null) {
                    double d1 = vec3.distanceTo(new Vector3D(movingobjectposition1.hitVec));

                    if (d1 < d0 || d0 == 0.0D) {
                        entity = entity1;
                        d0 = d1;
                    }
                }
            }
        }
        return entity;
    }

    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected abstract void onImpact(RayTraceResult p_70184_1_);

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        tagCompound.setLong("timestamp", timestamp);
        tagCompound.setShort("xTile", (short) xTile);
        tagCompound.setShort("yTile", (short) yTile);
        tagCompound.setShort("zTile", (short) zTile);
        //tagCompound.setByte("inTile", (byte) Block.getIdFromBlock(this.field_145785_f));
        tagCompound.setByte("shake", (byte) throwableShake);
        tagCompound.setByte("inGround", (byte) (inGround ? 1 : 0));

        if ((throwerName == null || throwerName.isEmpty()) && thrower != null
                && thrower instanceof EntityPlayer) {
            throwerName = thrower.getName();
        }

        tagCompound.setString("ownerName", throwerName == null ? "" : throwerName);
        tagCompound.setFloat(TAG_GRAVITY_VELOCITY, gravityVelocity);
        tagCompound.setDouble("aimTan", aimTan);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound tagCompound) {

        xTile = tagCompound.getShort("xTile");
        yTile = tagCompound.getShort("yTile");
        zTile = tagCompound.getShort("zTile");
        //this.field_145785_f = Block.getBlockById(tagCompound.getByte("inTile") & 255);
        throwableShake = tagCompound.getByte("shake") & 255;
        inGround = tagCompound.getByte("inGround") == 1;
        throwerName = tagCompound.getString("ownerName");

        if (throwerName.isEmpty()) {
            throwerName = null;
        }
        gravityVelocity = tagCompound.getFloat(TAG_GRAVITY_VELOCITY);
        timestamp = tagCompound.getLong("timestamp");
        aimTan = tagCompound.getDouble("aimTan");

        if (System.currentTimeMillis() > timestamp + maxLifetime) {
            setDead();
        }
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeFloat(gravityVelocity);
        buffer.writeDouble(aimTan);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        gravityVelocity = buffer.readFloat();
        aimTan = buffer.readDouble();
    }

    // @SideOnly(Side.CLIENT)
    public float getShadowSize() {
        return 0.0F;
    }

    public EntityLivingBase getThrower() {
        if (thrower == null && throwerName != null && !throwerName.isEmpty()) {
            thrower = world.getPlayerEntityByName(throwerName);
        }

        return thrower;
    }


    protected void entityInit() {
    }

    /**
     * Checks if the entity is in range to renderer by using the past in distance
     * and comparing it to its average edge length * 64 * renderDistanceWeight
     * Args: distance
     */
    // @SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double p_70112_1_) {
        double d1 = getEntityBoundingBox().getAverageEdgeLength() * 4.0D;
        d1 *= 64.0D;
        return p_70112_1_ < d1 * d1;
    }

    public boolean canCollideWithBlock(List<BlockPos> violators, Block block, BlockPos pos, IBlockState iBlockState) {
        return block.canCollideCheck(iBlockState, false);
    }
}
