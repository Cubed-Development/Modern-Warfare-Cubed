package com.paneedah.weaponlib.electronics;

import com.paneedah.mwc.ProjectConstants;
import com.paneedah.mwc.network.messages.LivingEntityTrackerMessage;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.tracking.LivingEntityTracker;
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

import static com.paneedah.mwc.MWC.CHANNEL;

public class EntityWirelessCamera extends EntityThrowable implements IEntityAdditionalSpawnData {

    static final float DEFAULT_INACCURACY = 1f;
    private int ticksInAir;

    private ItemWirelessCamera itemWirelessCamera;
    private long timestamp;
    private long duration;

    public EntityWirelessCamera(ModContext modContext, World world, EntityPlayer player, ItemWirelessCamera itemWirelessCamera, long duration) {
        super(world, player);
        timestamp = world.getWorldTime(); //System.currentTimeMillis();
        this.duration = (long) ((float) duration / 50f);
        this.itemWirelessCamera = itemWirelessCamera;

        setSize(0.25F, 0.25F);
        setLocationAndAngles(player.posX, player.posY + (double) player.getEyeHeight(), player.posZ, player.rotationYaw, player.rotationPitch);
        posX -= MathHelper.cos(rotationYaw / 180.0F * (float) Math.PI) * 0.16F;
        posY -= 0.10000000149011612D;
        posZ -= MathHelper.sin(rotationYaw / 180.0F * (float) Math.PI) * 0.16F;
        setPosition(posX, posY, posZ);
        float f = 0.4F;
        motionX = -MathHelper.sin(rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F * (float) Math.PI) * f;
        motionZ = MathHelper.cos(rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F * (float) Math.PI) * f;
        float pitchOffset = 0f;
        motionY = -MathHelper.sin((rotationPitch + pitchOffset) / 180.0F * (float) Math.PI) * f;
        shoot(motionX, motionY, motionZ, 1.5f, 0);

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
        ProjectConstants.LOGGER.debug("Player {} hit entity {}", getThrower(), rayTraceResult.entityHit);

        boolean hit = false;
        if (entityHit != null && getThrower() instanceof EntityPlayer) {
            String displayName = "";
            if (entityHit instanceof EntityPlayer) {
                displayName = ((EntityPlayer) entityHit).getDisplayNameString();
            } else if (entityHit instanceof EntityLivingBase) {
                displayName = EntityList.getEntityString(entityHit);
            }

            if (!world.isRemote) {
                ProjectConstants.LOGGER.debug("Server hit entity uuid {}", rayTraceResult.entityHit.getPersistentID());
                LivingEntityTracker tracker = LivingEntityTracker.getTracker(getThrower());
                if (tracker != null) {
                    hit = true;
                    tracker.addTrackableEntity(new TrackableEntity(entityHit, timestamp, duration));
                    CHANNEL.sendTo(new LivingEntityTrackerMessage(tracker, "Tracking " + displayName), (EntityPlayerMP) getThrower());
                }
                entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), 0.001f);
            }
        }

        if (!world.isRemote) {
            if (!hit && (thrower instanceof EntityPlayer && !((EntityPlayer) thrower).isCreative())) {
                dropItem(itemWirelessCamera, 1);
            }

            setDead();
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
        if (item instanceof ItemWirelessCamera) {
            itemWirelessCamera = (ItemWirelessCamera) item;
        }
        timestamp = buffer.readLong();
        duration = buffer.readLong();
    }

    protected void setThrowableHeading(double motionX, double motionY, double motionZ, float velocity, float inaccuracy) {
        float f2 = MathHelper.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
        motionX /= f2;
        motionY /= f2;
        motionZ /= f2;
        motionX += rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionY += rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionZ += rand.nextGaussian() * 0.007499999832361937D * (double) inaccuracy;
        motionX *= velocity;
        motionY *= velocity;
        motionZ *= velocity;
        this.motionX = motionX;
        this.motionY = motionY;
        this.motionZ = motionZ;
        float f3 = MathHelper.sqrt(motionX * motionX + motionZ * motionZ);
        prevRotationYaw = rotationYaw = (float) (Math.atan2(motionX, motionZ) * 180.0D / Math.PI);
        prevRotationPitch = rotationPitch = (float) (Math.atan2(motionY, f3) * 180.0D / Math.PI);

    }

    public ItemWirelessCamera getItem() {
        return itemWirelessCamera;
    }

    @Override
    public void onUpdate() {
        lastTickPosX = posX;
        lastTickPosY = posY;
        lastTickPosZ = posZ;

        if (throwableShake > 0) {
            --throwableShake;
        }

        if (inGround) {
        } else {
            ++ticksInAir;
        }

        Vec3d vec3 = new Vec3d(posX, posY, posZ);
        Vec3d vec31 = new Vec3d(posX + motionX, posY + motionY, posZ + motionZ);
        RayTraceResult movingobjectposition = world.rayTraceBlocks(vec3, vec31);
        vec3 = new Vec3d(posX, posY, posZ);
        vec31 = new Vec3d(posX + motionX, posY + motionY, posZ + motionZ);

        if (movingobjectposition != null) {
            vec31 = new Vec3d(movingobjectposition.hitVec.x, movingobjectposition.hitVec.y, movingobjectposition.hitVec.z);
        }

        if (!world.isRemote) {
            Entity entity = null;
            List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(this, getEntityBoundingBox()
                    .expand(motionX, motionY, motionZ).grow(1.0D));
            double d0 = 0.0D;
            EntityLivingBase entitylivingbase = getThrower();

            for (int j = 0; j < list.size(); ++j) {
                Entity entity1 = list.get(j);

                if (entity1.canBeCollidedWith() && (entity1 != entitylivingbase || ticksInAir >= 5)) {
                    float f = 0.3F;
                    net.minecraft.util.math.AxisAlignedBB axisalignedbb = entity1.getEntityBoundingBox().expand(f, f, f);
                    RayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(vec3, vec31);

                    if (movingobjectposition1 != null) {
                        double d1 = vec3.squareDistanceTo(movingobjectposition1.hitVec);

                        if (d1 < d0 || d0 == 0.0D) {
                            entity = entity1;
                            d0 = d1;
                        }
                    } /*else {
                    	System.out.println("Vector " + vec3 + " " + vec31 + " does not intercept with " + entity1);
                    }*/
                }
            }

            if (entity != null) {
                movingobjectposition = new RayTraceResult(entity);
            }
        }

        if (movingobjectposition != null) {
            if (movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK && world.getBlockState(movingobjectposition.getBlockPos()).getBlock() == Blocks.PORTAL) {
                setPortal(movingobjectposition.getBlockPos());
            } else {
                onImpact(movingobjectposition);
            }
        }

        posX += motionX;
        posY += motionY;
        posZ += motionZ;
        float f1 = MathHelper.sqrt(motionX * motionX + motionZ * motionZ);
        rotationYaw = (float) (MathHelper.atan2(motionX, motionZ) * 180.0D / Math.PI);

        for (rotationPitch = (float) (MathHelper.atan2(motionY, f1) * 180.0D / Math.PI); rotationPitch - prevRotationPitch < -180.0F; prevRotationPitch -= 360.0F) {
        }

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
        float f3 = getGravityVelocity();

        if (isInWater()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25F;
                world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, posX - motionX * (double) f4, posY - motionY * (double) f4, posZ - motionZ * (double) f4, motionX, motionY, motionZ);
            }

            f2 = 0.8F;
        }

        motionX *= f2;
        motionY *= f2;
        motionZ *= f2;
        motionY -= f3;
        setPosition(posX, posY, posZ);
    }
}
