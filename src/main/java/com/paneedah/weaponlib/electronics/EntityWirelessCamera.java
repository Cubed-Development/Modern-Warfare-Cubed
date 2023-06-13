package com.paneedah.weaponlib.electronics;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import com.paneedah.weaponlib.tracking.TrackableEntity;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;

import java.util.List;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class EntityWirelessCamera extends EntityThrowable implements IEntityAdditionalSpawnData {

    static final float DEFAULT_INACCURACY = 1f;
    private int ticksInAir;

    private ModContext modContext;
    private ItemWirelessCamera itemWirelessCamera;
    private long timestamp;
    private long duration;

    public EntityWirelessCamera(ModContext modContext, World world, EntityPlayer player, ItemWirelessCamera itemWirelessCamera, long duration) {
        super(world, player);
        this.timestamp = world.getWorldTime(); //System.currentTimeMillis();
        this.duration = (long)((float)duration / 50f);
        this.modContext = modContext;
        this.itemWirelessCamera = itemWirelessCamera;

        this.setSize(0.25F, 0.25F);
        this.setLocationAndAngles(player.posX, player.posY + (double)player.getEyeHeight(), player.posZ, player.rotationYaw, player.rotationPitch);
        this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.posY -= 0.10000000149011612D;
        this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
        this.setPosition(this.posX, this.posY, this.posZ);
        float f = 0.4F;
        this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
        this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
        float pitchOffset = 0f;
        this.motionY = (double)(-MathHelper.sin((this.rotationPitch + pitchOffset) / 180.0F * (float)Math.PI) * f);
        this.shoot(this.motionX, this.motionY, this.motionZ, 1.5f, 0);

    }

    public EntityWirelessCamera(World world, EntityLivingBase player) {
        super(world, player);
    }

    public EntityWirelessCamera(World world) {
        super(world);
    }

    @Override
    protected void onImpact(RayTraceResult rayTraceResult) {
        Entity entityHit = rayTraceResult.entityHit;
        LOG.debug("Player {} hit entity {}", getThrower(), rayTraceResult.entityHit);

        boolean hit = false;
        if (entityHit != null && getThrower() instanceof EntityPlayer) {
            String displayName = "";
            if(entityHit instanceof EntityPlayer) {
                displayName = ((EntityPlayer) entityHit).getDisplayNameString();
            } else if(entityHit instanceof EntityLivingBase) {
                displayName = EntityList.getEntityString(entityHit);
            }

            if (!world.isRemote) {
                LOG.debug("Server hit entity uuid {}", rayTraceResult.entityHit.getPersistentID());
                PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) getThrower());
                if(tracker != null) {
                    hit = true;
                    tracker.addTrackableEntity(new TrackableEntity(entityHit, timestamp,
                            duration));
                    modContext.getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker,
                            "Tracking " + displayName),
                            (EntityPlayerMP)getThrower());
                }
                entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), 0.001f);
            }
        }

        if (!world.isRemote) {
            if(!hit) {
                dropItem(itemWirelessCamera, 1);
            }
            this.setDead();
        }
    }

    @Override
    public final void shoot(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        setThrowableHeading(motionX, motionY, motionZ, velocity, inaccuracy);
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        buffer.writeInt(Item.getIdFromItem(itemWirelessCamera));
        buffer.writeLong(timestamp);
        buffer.writeLong(duration);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        Item item = Item.getItemById(buffer.readInt());
        if(item instanceof ItemWirelessCamera) {
            itemWirelessCamera = (ItemWirelessCamera) item;
        }
        timestamp = buffer.readLong();
        duration = buffer.readLong();
    }

    protected void setThrowableHeading(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        float f2 = MathHelper.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
        motionX /= (double) f2;
        motionY /= (double) f2;
        motionZ /= (double) f2;
        motionX += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionY += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionZ += this.rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionX *= (double) velocity;
        motionY *= (double) velocity;
        motionZ *= (double) velocity;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        float f3 = MathHelper.sqrt(motionX * motionX + motionZ * motionZ);
        this.prevRotationYaw = this.rotationYaw = (float) (Math.atan2(motionX, motionZ) * 180.0D / Math.PI);
        this.prevRotationPitch = this.rotationPitch = (float) (Math.atan2(motionY, (double) f3) * 180.0D / Math.PI);

    }

    public ItemWirelessCamera getItem() {
        return itemWirelessCamera;
    }

    @Override
    public void onUpdate() {
        this.lastTickPosX = this.posX;
        this.lastTickPosY = this.posY;
        this.lastTickPosZ = this.posZ;

        if (this.throwableShake > 0)
        {
            --this.throwableShake;
        }

        if (this.inGround)
        {
            /*if (this.world.getBlockState(new BlockPos(this.xTile, this.yTile, this.zTile)).getBlock() == this.inTile)
            {
                ++this.ticksInGround;

                if (this.ticksInGround == 1200)
                {
                    this.setDead();
                }

                return;
            }

            this.inGround = false;
            this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
            this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
            this.ticksInGround = 0;
            this.ticksInAir = 0;*/
        }
        else
        {
            ++this.ticksInAir;
        }

        Vec3d vec3 = new Vec3d(this.posX, this.posY, this.posZ);
        Vec3d vec31 = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
        RayTraceResult movingobjectposition = this.world.rayTraceBlocks(vec3, vec31);
        vec3 = new Vec3d(this.posX, this.posY, this.posZ);
        vec31 = new Vec3d(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

        if (movingobjectposition != null)
        {
            vec31 = new Vec3d(movingobjectposition.hitVec.x, movingobjectposition.hitVec.y, movingobjectposition.hitVec.z);
        }

        if (!this.world.isRemote)
        {
            Entity entity = null;
            List<Entity> list = this.world.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox()
                    .expand(this.motionX, this.motionY, this.motionZ).grow(1.0D));
            double d0 = 0.0D;
            EntityLivingBase entitylivingbase = this.getThrower();

            for (int j = 0; j < list.size(); ++j)
            {
                Entity entity1 = (Entity)list.get(j);

                if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || this.ticksInAir >= 5))
                {
                    float f = 0.3F;
                    net.minecraft.util.math.AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand((double)f, (double)f, (double)f);
                    RayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

                    if (movingobjectposition1 != null)
                    {
                        double d1 = vec3.squareDistanceTo(movingobjectposition1.hitVec);

                        if (d1 < d0 || d0 == 0.0D)
                        {
                            entity = entity1;
                            d0 = d1;
                        }
                    } /*else {
                    	System.out.println("Vector " + vec3 + " " + vec31 + " does not intercept with " + entity1);
                    }*/
                }
            }

            if (entity != null)
            {
                movingobjectposition = new RayTraceResult(entity);
            }
        }

        if (movingobjectposition != null)
        {
            if (movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK && this.world.getBlockState(movingobjectposition.getBlockPos()).getBlock() == Blocks.PORTAL)
            {
                this.setPortal(movingobjectposition.getBlockPos());
            }
            else
            {
                this.onImpact(movingobjectposition);
            }
        }

        this.posX += this.motionX;
        this.posY += this.motionY;
        this.posZ += this.motionZ;
        float f1 = MathHelper.sqrt(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(MathHelper.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

        for (this.rotationPitch = (float)(MathHelper.atan2(this.motionY, (double)f1) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
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
        float f3 = this.getGravityVelocity();

        if (this.isInWater())
        {
            for (int i = 0; i < 4; ++i)
            {
                float f4 = 0.25F;
                this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ, new int[0]);
            }

            f2 = 0.8F;
        }

        this.motionX *= (double)f2;
        this.motionY *= (double)f2;
        this.motionZ *= (double)f2;
        this.motionY -= (double)f3;
        this.setPosition(this.posX, this.posY, this.posZ);
    }
}
