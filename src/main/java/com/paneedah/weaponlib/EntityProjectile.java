package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.config.ModernConfigManager;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.vectors.Vector3D;
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

    private double aimTan;

    public Vec3d origin;

    protected long maxLifetime = DEFAULT_MAX_LIFETIME;

    public EntityProjectile(World world) {
        super(world);
        this.setSize(0.25F, 0.25F);
        this.timestamp = System.currentTimeMillis();
    }

    public EntityProjectile(World world, EntityLivingBase thrower, float velocity, float gravityVelocity, float inaccuracy) {
        this(world);

        this.thrower = thrower;
        this.velocity = velocity;
        this.gravityVelocity = gravityVelocity;
        this.inaccuracy = inaccuracy;

//        if(thrower != null) {
//            RayTraceResult rayTraceResult = thrower.rayTrace(50, 0);
//            if(rayTraceResult != null && rayTraceResult.hitVec != null) {
//                double dx = mc.player.posX - rayTraceResult.hitVec.x;
//                double dy = mc.player.posY - rayTraceResult.hitVec.y;
//                double dz = mc.player.posZ - rayTraceResult.hitVec.z;
//                double distance = Math.sqrt(dx * dx + dy * dy + dz * dz);
//                this.aimTan = 0.4 / distance;
//            }
//        }
    }

    public void setPositionAndDirection(boolean isAim) {
        this.setLocationAndAngles(thrower.posX, thrower.posY + (double) thrower.getEyeHeight(), thrower.posZ, thrower.rotationYaw, thrower.rotationPitch);
        
        this.posX -= (double) (MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * (isAim ? 0F : 0.16F));
        this.posY -= (isAim ? 0D : 0.10000000149011612D);
        this.posZ -= (double) (MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * (isAim ? 0F : 0.16F));
        this.setPosition(this.posX, this.posY, this.posZ);


        this.origin = new Vec3d(this.posX, this.posY, this.posZ);

        //this.yOffset = 0.0F; TODO: verify how this works in 1.7.10
        float f = velocity; //0.4F;
        this.motionX = (double) (-MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI) * f);
        this.motionZ = (double) (MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI) * f);
        this.motionY = (double) (-MathHelper.sin((this.rotationPitch + this.getPitchOffset()) / 180.0F * (float) Math.PI) * f);
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, velocity, inaccuracy);
    }

    public void setPositionAndDirection(double x, double y, double z, float rotationYaw, float rotationPitch) {

        this.setLocationAndAngles(x, y + (double) thrower.getEyeHeight(), z, rotationYaw, rotationPitch);

        this.posX -= (double) (MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * 0.16F);
        this.posY -= 0.10000000149011612D;
        this.posZ -= (double) (MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * 0.16F);
        this.setPosition(this.posX, this.posY, this.posZ);

        //this.yOffset = 0.0F; TODO: verify how this works in 1.7.10
        float f = velocity; //0.4F;
        this.motionX = (double) (-MathHelper.sin(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI) * f);
        this.motionZ = (double) (MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float) Math.PI) * f);
        this.motionY = (double) (-MathHelper.sin((this.rotationPitch + this.getPitchOffset()) / 180.0F * (float) Math.PI) * f);
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, velocity, inaccuracy);
    }

    public EntityProjectile(World world, double posX, double posY, double posZ) {
        super(world);
        //this.ticksInGround = 0;
        this.setSize(0.25F, 0.25F);
        this.setPosition(posX, posY, posZ);
        //this.yOffset = 0.0F; // TODO: verify how it works in 1.7.10
    }

    protected float getPitchOffset() {
        return 0.0F;
    }

    /**
     * Similar to setArrowHeading, it's point the throwable entity to a x, y, z
     * direction.
     */
    public void setThrowableHeading(double x, double y, double z, float velocity, float inaccuracy) {
        float f2 = MathHelper.sqrt(x * x + y * y + z * z);
        x /= (double) f2;
        y /= (double) f2;
        z /= (double) f2;
        x += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        y += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        z += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        x *= (double) velocity;
        y *= (double) velocity;
        z *= (double) velocity;
        this.motionX = x;
        this.motionY = y;
        this.motionZ = z;
        float f3 = MathHelper.sqrt(x * x + z * z);
        this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(x, z) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(y, (double) f3) * 180.0D / Math.PI);
        //this.ticksInGround = 0;
    }

    /**
     * Sets the velocity to the args. Args: x, y, z
     */
    // @SideOnly(Side.CLIENT)
    public void setVelocity(double mX, double mY, double mZ) {
        this.motionX = mX;
        this.motionY = mY;
        this.motionZ = mZ;

        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F) {
            float f = MathHelper.sqrt(mX * mX + mZ * mZ);
            this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(mX, mZ) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(mY, (double) f) * 180.0D
                    / Math.PI);
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate() {
        if(ticksExisted > MAX_TICKS)
            return;

        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;
        super.onUpdate();

        if (this.throwableShake > 0) {
            --this.throwableShake;
        }

        if (this.inGround) {
            /*
            BlockPos p = new BlockPos(this.xTile, this.yTile, this.zTile);
            if (compatibility.getBlockAtPosition(world, p) == this.field_145785_f) {
                ++this.ticksInGround;

                if (this.ticksInGround == 1200) {
                    this.setDead();
                }

                return;
            }
            */

            this.inGround = false;
            this.motionX *= (double) (this.rand.nextFloat() * 0.2F);
            this.motionY *= (double) (this.rand.nextFloat() * 0.2F);
            this.motionZ *= (double) (this.rand.nextFloat() * 0.2F);
            //this.ticksInGround = 0;
            this.ticksInAir = 0;

        } else {
            ++this.ticksInAir;
        }

        Vector3D vec3 = new Vector3D(this.posX, this.posY, this.posZ);
        Vector3D vec31 = new Vector3D(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        //List<BlockPos> possibleCollisions = new ArrayList<>();

        // Check what is at the projectile current position, null if air
        RayTraceResult movingobjectposition = MWCUtil.rayTraceBlocks(world, vec3, vec31, (block, blockMetadata) -> canCollideWithBlock(null, block, null, blockMetadata));

        /*
         *  GLASS BREAK CHECK
         */

        if(ModernConfigManager.bulletBreakGlass && !world.isRemote) {
        	 Vec3d motion = new Vec3d(this.motionX, this.motionY, this.motionZ);
             Vec3d start = new Vec3d(this.prevPosX, this.prevPosY, this.prevPosZ);
             Vec3d end = new Vec3d(this.posX, this.posY, this.posZ).add(motion);

             RayTraceResult rtr = world.rayTraceBlocks(start, end, false, true, false);
             if(rtr != null) {
                 IBlockState state = world.getBlockState(rtr.getBlockPos());
                 if(state.getMaterial() == Material.GLASS) {
                     if(ModernConfigManager.bulletBreakGlass)
                         this.world.destroyBlock(rtr.getBlockPos(), true);


                     ModContext context = CommonModContext.getContext();
                     if (context == null)
                         return;

                     context.getChannel().sendToAllAround(new BlockHitMessage(rtr.getBlockPos(), rtr.hitVec.x, rtr.hitVec.y, rtr.hitVec.z, rtr.sideHit), new NetworkRegistry.TargetPoint(this.dimension, this.posX, this.posY, this.posZ, 20.0));
                 }
            }
        }

        vec3 = new Vector3D(this.posX, this.posY, this.posZ);
        vec31 = new Vector3D(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (movingobjectposition != null)
            vec31 = new Vector3D(movingobjectposition.hitVec);

        if (!world.isRemote) {
            Entity entity = getRayTraceEntities(vec3, vec31);

            if (entity != null)
               movingobjectposition = new RayTraceResult(entity);
        }

        if (movingobjectposition != null)
            this.onImpact(movingobjectposition);

        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
        float f1 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float) (Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

        for (this.rotationPitch = (float) (Math.atan2(this.motionY, (double) f1) * 180.0D / Math.PI);
             this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F);

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
        float f3 = gravityVelocity; //this.getGravityVelocity();

        if (this.isInWater()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25F;
                EnumParticleTypes particleType = EnumParticleTypes.getByName("bubble");
                if (particleType != null)
                    world.spawnParticle(particleType, this.posX - this.motionX * (double) f4, this.posY - this.motionY * (double) f4, this.posZ - this.motionZ * (double) f4, this.motionX, this.motionY, this.motionZ);
            }

            f2 = 0.8F;
        }

        this.motionX *= (double) f2;
        this.motionY *= (double) f2;
        this.motionZ *= (double) f2;
        this.motionY -= (double) f3;
        this.setPosition(this.posX, this.posY, this.posZ);
    }

    private Entity getRayTraceEntities(Vector3D vec3, Vector3D vec31) {
        Entity entity = null;
        List<?> list = world.getEntitiesWithinAABBExcludingEntity(entity, this.getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));//compatibility.getEntitiesWithinAABBExcludingEntity(world, this, this.getEntityBoundingBox().expand(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
        double d0 = 0.0D;
        EntityLivingBase entitylivingbase = this.getThrower();

        for (Object o : list) {
            Entity entity1 = (Entity) o;

            // Fix for issue in the mod where a dying entity could
            // block bullets.
            boolean flag = true;
            if (entity1 instanceof EntityLivingBase) {
                EntityLivingBase elb = (EntityLivingBase) entity1;
                flag = elb.deathTime == 0;
            }

            if (flag && entity1.canBeCollidedWith() && (entity1 != entitylivingbase || this.ticksInAir >= 5)) {
                float f1 = 0.15F, f2 = -0.15f;
                AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand((double) f1, (double) f1, (double) f1);
                RayTraceResult movingobjectposition = axisalignedbb.calculateIntercept(vec3.toVec3d(), vec31.toVec3d());
                AxisAlignedBB axisalignedbb1 = entity1.getEntityBoundingBox().expand((double) f2, (double) f2, (double) f2);
                RayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(vec3.toVec3d(), vec31.toVec3d());

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
        tagCompound.setShort("xTile", (short) this.xTile);
        tagCompound.setShort("yTile", (short) this.yTile);
        tagCompound.setShort("zTile", (short) this.zTile);
        //tagCompound.setByte("inTile", (byte) Block.getIdFromBlock(this.field_145785_f));
        tagCompound.setByte("shake", (byte) this.throwableShake);
        tagCompound.setByte("inGround", (byte) (this.inGround ? 1 : 0));

        if ((this.throwerName == null || this.throwerName.length() == 0) && this.thrower != null
                && this.thrower instanceof EntityPlayer) {
            this.throwerName = ((EntityPlayer)this.thrower).getName();
        }

        tagCompound.setString("ownerName", this.throwerName == null ? "" : this.throwerName);
        tagCompound.setFloat(TAG_GRAVITY_VELOCITY, gravityVelocity);
        tagCompound.setDouble("aimTan", this.aimTan);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound tagCompound) {

        this.xTile = tagCompound.getShort("xTile");
        this.yTile = tagCompound.getShort("yTile");
        this.zTile = tagCompound.getShort("zTile");
        //this.field_145785_f = Block.getBlockById(tagCompound.getByte("inTile") & 255);
        this.throwableShake = tagCompound.getByte("shake") & 255;
        this.inGround = tagCompound.getByte("inGround") == 1;
        this.throwerName = tagCompound.getString("ownerName");

        if (this.throwerName != null && this.throwerName.length() == 0) {
            this.throwerName = null;
        }
        this.gravityVelocity = tagCompound.getFloat(TAG_GRAVITY_VELOCITY);
        this.timestamp = tagCompound.getLong("timestamp");
        this.aimTan = tagCompound.getDouble("aimTan");

        if(System.currentTimeMillis() > timestamp + maxLifetime) {
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

    public double getAimTan() {
        return aimTan;
    }

    public EntityLivingBase getThrower() {
        if (this.thrower == null && this.throwerName != null && this.throwerName.length() > 0) {
            this.thrower = world.getPlayerEntityByName(this.throwerName);
        }

        return this.thrower;
    }


    protected void entityInit() {
    }

    /**
     * Checks if the entity is in range to render by using the past in distance
     * and comparing it to its average edge length * 64 * renderDistanceWeight
     * Args: distance
     */
    // @SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double p_70112_1_) {
        double d1 = this.getEntityBoundingBox().getAverageEdgeLength() * 4.0D;
        d1 *= 64.0D;
        return p_70112_1_ < d1 * d1;
    }

    public boolean canCollideWithBlock(List<BlockPos> violators, Block block, BlockPos pos, IBlockState iBlockState) {
        return block.canCollideCheck(iBlockState, false);
    }
}
