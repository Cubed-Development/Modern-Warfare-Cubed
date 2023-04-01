package com.paneedah.weaponlib.electronics;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleRayTraceResult;
import com.paneedah.weaponlib.compatibility.CompatibleThrowableEntity;
import com.paneedah.weaponlib.tracking.PlayerEntityTracker;
import com.paneedah.weaponlib.tracking.SyncPlayerEntityTrackerMessage;
import com.paneedah.weaponlib.tracking.TrackableEntity;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityWirelessCamera extends CompatibleThrowableEntity {

    private ModContext modContext;
    private ItemWirelessCamera itemWirelessCamera;
    private long timestamp;
    private long duration;

    public EntityWirelessCamera(ModContext modContext, World world, EntityPlayer player,
            ItemWirelessCamera itemWirelessCamera, long duration) {
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

    protected void onImpact(CompatibleRayTraceResult rayTraceResult) {
        Entity entityHit = rayTraceResult.getEntityHit();
        log.debug("Player {} hit entity {}", getThrower(), rayTraceResult.getEntityHit());

        boolean hit = false;
        if (entityHit != null && getThrower() instanceof EntityPlayer) {
            String displayName = "";
            if(entityHit instanceof EntityPlayer) {
                displayName = compatibility.getDisplayName((EntityPlayer)entityHit);
            } else if(entityHit instanceof EntityLivingBase) {
                displayName = EntityList.getEntityString(entityHit);
            }

            if (!compatibility.world(this).isRemote) {
                log.debug("Server hit entity uuid {}", rayTraceResult.getEntityHit().getPersistentID());
                PlayerEntityTracker tracker = PlayerEntityTracker.getTracker((EntityPlayer) getThrower());
                if(tracker != null) {
                    hit = true;
                    tracker.addTrackableEntity(new TrackableEntity(entityHit, timestamp,
                            duration));
                    modContext.getChannel().getChannel().sendTo(new SyncPlayerEntityTrackerMessage(tracker,
                            "Tracking " + displayName),
                            (EntityPlayerMP)getThrower());
                }
                entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, getThrower()), 0.001f);
            }
        }

        if (!compatibility.world(this).isRemote) {
            if(!hit) {
                dropItem(itemWirelessCamera, 1);
            }
            this.setDead();
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
//        if(timestamp + duration < System.currentTimeMillis()) {
//            this.setDead();
//        }
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

    @Override
    protected void setCompatibleThrowableHeading(double motionX, double motionY, double motionZ, float velocity,
            float inaccuracy) {
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

    @Override
    protected float getInaccuracy() {
        return 0;
    }

    @Override
    protected float getVelocity() {
        return 0.5f;
    }

    public ItemWirelessCamera getItem() {
        return itemWirelessCamera;
    }
}
