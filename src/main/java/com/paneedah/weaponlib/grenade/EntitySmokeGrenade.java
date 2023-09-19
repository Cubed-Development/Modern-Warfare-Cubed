package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.ModContext;
import com.paneedah.mwc.network.messages.SpawnParticleMessage;
import com.paneedah.mwc.network.messages.SpawnParticleMessage.ParticleType;
import io.netty.buffer.ByteBuf;
import dev.redstudio.redcore.vectors.Vector3F;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import static com.paneedah.mwc.MWC.CHANNEL;

public class EntitySmokeGrenade extends AbstractEntityGrenade {

    private long activationDelay;
    private long activationTimestamp;

    private float smokeAmount;
    private long activeDuration;

    public static class Builder {

        private long activationDelay;
        private long activationTimestamp;
        private long activeDuration;
        private float smokeAmount;
        private EntityLivingBase thrower;
        private ItemGrenade itemGrenade;
        private float velocity = ItemGrenade.DEFAULT_VELOCITY;
        private float gravityVelocity = ItemGrenade.DEFAULT_GRAVITY_VELOCITY;
        private float rotationSlowdownFactor = ItemGrenade.DEFAULT_ROTATION_SLOWDOWN_FACTOR;

        public Builder withActivationTimestamp(long activationTimestamp) {
            this.activationTimestamp = activationTimestamp;
            return this;
        }

        public Builder withActivationDelay(long activationDelay) {
            this.activationDelay = activationDelay;
            return this;
        }

        public Builder withThrower(EntityLivingBase thrower) {
            this.thrower = thrower;
            return this;
        }

        public Builder withSmokeAmount(float smokeAmount) {
            this.smokeAmount = smokeAmount;
            return this;
        }

        public Builder withGrenade(ItemGrenade itemGrenade) {
            this.itemGrenade = itemGrenade;
            return this;
        }

        public Builder withVelocity(float velocity) {
            this.velocity = velocity;
            return this;
        }

        public Builder withGravityVelocity(float gravityVelocity) {
            this.gravityVelocity = gravityVelocity;
            return this;
        }

        public Builder withRotationSlowdownFactor(float rotationSlowdownFactor) {
            this.rotationSlowdownFactor = rotationSlowdownFactor;
            return this;
        }

        public Builder withActiveDuration(long activeDuration) {
            this.activeDuration = activeDuration;
            return this;
        }

        public EntitySmokeGrenade build(ModContext modContext) {
            EntitySmokeGrenade entityGrenade = new EntitySmokeGrenade(modContext, itemGrenade, thrower, velocity,
                    gravityVelocity, rotationSlowdownFactor);
            entityGrenade.activationTimestamp = activationTimestamp;
            entityGrenade.activationDelay = activationDelay;
            entityGrenade.smokeAmount = smokeAmount;
            entityGrenade.activeDuration = activeDuration;
            return entityGrenade;
        }
    }

    private EntitySmokeGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, itemGrenade, thrower, velocity, gravityVelocity, rotationSlowdownFactor);
    }

    public EntitySmokeGrenade(World world) {
        super(world);
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeLong(activationTimestamp);
        buffer.writeLong(activationDelay);
        buffer.writeLong(activeDuration);
        buffer.writeFloat(smokeAmount);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        activationTimestamp = buffer.readLong();
        activationDelay = buffer.readLong();
        activeDuration = buffer.readLong();
        smokeAmount = buffer.readFloat();
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setLong("activationTimestamp", activationTimestamp);
        tagCompound.setLong("activationDelay", activationDelay);
        tagCompound.setLong("activeDuration", activeDuration);
        tagCompound.setFloat("smokeAmount", smokeAmount);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        activationTimestamp = tagCompound.getLong("activationTimestamp");
        activationDelay = tagCompound.getLong("activationDelay");
        activeDuration = tagCompound.getLong("activeDuration");
        smokeAmount = tagCompound.getFloat("smokeAmount");
    }

    @Override
    public void onGrenadeUpdate() {
        if(modContext == null) {
            return;
        }
        long timeRemaining = activationTimestamp + activationDelay + activeDuration - System.currentTimeMillis();
        if(activationDelay == ItemGrenade.EXPLODE_ON_IMPACT) {
            // Do nothing
        } else if (timeRemaining < 0) {
            setDead();
        } else if(!world.isRemote && timeRemaining <= activeDuration ) {

            double f = 0.4 + Math.sin(Math.PI * (1 - (double)timeRemaining / activeDuration)) * 0.3;
            if(rand.nextDouble() <= f) {
                for (Object o : world.playerEntities) {
                    EntityPlayer player = (EntityPlayer) o;
                    if (player.getDistanceSq(posX, posY, posZ) < 4096.0D) {
                        ParticleType particleType = ParticleType.SMOKE_GRENADE_SMOKE;
                        double movement = bounceCount > 0 ? 0.1 : 0.005;
                        CHANNEL.sendTo(new SpawnParticleMessage(particleType, 2, new Vector3F((float) (posX + rand.nextGaussian() / 7), (float) (posY + rand.nextGaussian() / 10), (float) (posZ + rand.nextGaussian() / 7)), new Vector3F((float) (rand.nextGaussian() * movement), (float) (rand.nextGaussian() * movement / 4), (float) (rand.nextGaussian() * movement))), (EntityPlayerMP) player);
                    }
                }
            }
        }
    }

    @Override
    public void onBounce(RayTraceResult movingobjectposition) {
        if(activationDelay == ItemGrenade.EXPLODE_ON_IMPACT) {
            activationDelay = 0;
            activationTimestamp = System.currentTimeMillis();
        } else {
            super.onBounce(movingobjectposition);
        }
    }

    @Override
    public void onStop() {
        if(!world.isRemote && itemGrenade != null) {
            world.playSound(null, posX, posY, posZ, itemGrenade.getStopAfterThrowingSound(), SoundCategory.BLOCKS, 2f,
                    (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7f);
        }

    }
}
