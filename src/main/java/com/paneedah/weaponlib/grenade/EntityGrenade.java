package com.paneedah.weaponlib.grenade;

import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.weaponlib.Explosion;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleRayTracing;
import com.paneedah.weaponlib.config.ModernConfigManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.BiPredicate;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class EntityGrenade extends AbstractEntityGrenade {

    private long explosionTimeout;
    private float explosionStrength;
    private boolean destroyBlocks;
    private long activationTimestamp;

    public static class Builder {

        private long explosionTimeout;
        private float explosionStrength;
        private boolean isDestroyingBlocks = true;
        private long activationTimestamp;
        private EntityLivingBase thrower;
        private ItemGrenade itemGrenade;
        private float velocity = ItemGrenade.DEFAULT_VELOCITY;
        private float gravityVelocity = ItemGrenade.DEFAULT_GRAVITY_VELOCITY;
        private float rotationSlowdownFactor = ItemGrenade.DEFAULT_ROTATION_SLOWDOWN_FACTOR;

        public Builder withActivationTimestamp(long activationTimestamp) {
            this.activationTimestamp = activationTimestamp;
            return this;
        }

        public Builder withExplosionTimeout(long explosionTimeout) {
            this.explosionTimeout = explosionTimeout;
            return this;
        }

        public Builder withThrower(EntityLivingBase thrower) {
            this.thrower = thrower;
            return this;
        }

        public Builder withExplosionStrength(float explosionStrength) {
            this.explosionStrength = explosionStrength;
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
        
        public Builder withDestroyingBlocks(boolean isDestroyingBlocks) {
            this.isDestroyingBlocks = isDestroyingBlocks;
            return this;
        }

        public EntityGrenade build(ModContext modContext) {
            EntityGrenade entityGrenade = new EntityGrenade(modContext, itemGrenade, thrower, velocity,
                    gravityVelocity, rotationSlowdownFactor);
            entityGrenade.activationTimestamp = activationTimestamp;
            entityGrenade.explosionTimeout = explosionTimeout;
            entityGrenade.explosionStrength = explosionStrength;
            entityGrenade.itemGrenade = itemGrenade;
            entityGrenade.destroyBlocks = isDestroyingBlocks;

            return entityGrenade;
        }

    }

    private EntityGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, itemGrenade, thrower, velocity, gravityVelocity, rotationSlowdownFactor);
        
    }

    public EntityGrenade(World world) {
        super(world);
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeLong(activationTimestamp);
        buffer.writeLong(explosionTimeout);
        buffer.writeFloat(explosionStrength);
        buffer.writeBoolean(destroyBlocks);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        activationTimestamp = buffer.readLong();
        explosionTimeout = buffer.readLong();
        explosionStrength = buffer.readFloat();
        destroyBlocks = buffer.readBoolean();
    }

    @Override
    public void onGrenadeUpdate() {
    	  
        if (!world.isRemote && explosionTimeout > 0
                && System.currentTimeMillis() > activationTimestamp + explosionTimeout) {
        
          explode();
            return;
        }
    }

    @Override
    public void onBounce(RayTraceResult movingobjectposition) {
        if(explosionTimeout == ItemGrenade.EXPLODE_ON_IMPACT && !world.isRemote) {
            explode();
        } else {
            super.onBounce(movingobjectposition);
        }
    }

    private void explode() {
        log.debug("Exploding {}", this);

        Explosion.createServerSideExplosion(modContext, world, this,
                this.posX, this.posY, this.posZ, explosionStrength, false, true, destroyBlocks, 1f, 1f, 1.5f, 1f, null, null, 
                modContext.getExplosionSound());
        
        List<?> nearbyEntities = world.getEntitiesWithinAABBExcludingEntity(this,
                this.getEntityBoundingBox().expand(5, 5, 5));

        float damageCoefficient = (float)ModernConfigManager.explosionDamage;
        float effectiveRadius = itemGrenade.getEffectiveRadius() * damageCoefficient; // 5 block sphere with this entity as a center
        float fragmentDamage = itemGrenade.getFragmentDamage();

        float configuredFragmentCount = itemGrenade.getFragmentCount() * damageCoefficient;
        for(int i = 0; i < configuredFragmentCount; i++) {
            double x = (rand.nextDouble() - 0.5) * 2;
            double y = (rand.nextDouble() - 0.5) * 2;
            double z = (rand.nextDouble() - 0.5) * 2;
            
            double d2 = x * x + y * y + z * z;
            if(d2 == 0) {
                log.debug("Ignoring zero distance index {}", i);
                continue;
            }
            double k = Math.sqrt(effectiveRadius * effectiveRadius  / d2);

            double k2 = 0.1;
            final Vector3D cvec1 = new Vector3D(this.posX + x * k2, this.posY + y * k2, this.posZ + z * k2);

            // Vectors are mutable, need to create a copy to preserve the original
            final Vector3D cvec10 = new Vector3D(this.posX + x * k2, this.posY + y * k2, this.posZ + z * k2);

            Vector3D cvec2 = new Vector3D(this.posX + x * k, this.posY + y * k, this.posZ + z * k);

            BiPredicate<Block, IBlockState> isCollidable = (block, blockMetadata) -> block.canCollideCheck(blockMetadata, false);
            RayTraceResult rayTraceResult = CompatibleRayTracing.rayTraceBlocks(world, cvec1, cvec2, isCollidable);

            if(rayTraceResult != null) {
                cvec2 = new Vector3D(rayTraceResult.hitVec);
            }

            for(Object nearbyEntityObject: nearbyEntities) {
                Entity nearbyEntity = (Entity)nearbyEntityObject;
                if (nearbyEntity.canBeCollidedWith()) {
                    float f = 0.5f;
                    AxisAlignedBB axisalignedbb = nearbyEntity.getEntityBoundingBox().expand((double) f, (double) f, (double) f);
                    RayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(cvec10.toVec3d(), cvec2.toVec3d());

                    if (movingobjectposition1 != null) {

                        double distanceToEntity = cvec10.distanceTo(new Vector3D(movingobjectposition1.hitVec));
                        float damageDistanceReductionFactor = (float)Math.abs(1 - distanceToEntity / effectiveRadius);

                        log.trace("Hit entity {} at distance {}, damage reduction {}", nearbyEntity, distanceToEntity,
                                damageDistanceReductionFactor);

                        nearbyEntity.attackEntityFrom(
                                DamageSource.causeThrownDamage(this, this.getThrower()),
                                Math.max(0.1f, rand.nextFloat()) * fragmentDamage * damageDistanceReductionFactor);
                    }
                }
            }
        }

        this.setDead();
    }

    public ItemGrenade getItemGrenade() {
        return itemGrenade;
    }
}
