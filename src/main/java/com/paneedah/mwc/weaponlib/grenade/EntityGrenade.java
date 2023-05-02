package com.paneedah.mwc.weaponlib.grenade;

import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.mwc.weaponlib.Explosion;
import com.paneedah.mwc.weaponlib.ModContext;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleAxisAlignedBB;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleBlockState;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleRayTraceResult;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleRayTracing;
import com.paneedah.mwc.weaponlib.config.ModernConfigManager;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.BiPredicate;

import static com.paneedah.mwc.utils.ModReference.log;
import static com.paneedah.mwc.weaponlib.compatibility.CompatibilityProvider.compatibility;

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
    	  
        if (!compatibility.world(this).isRemote && explosionTimeout > 0
                && System.currentTimeMillis() > activationTimestamp + explosionTimeout) {
        
          explode();
            return;
        }
    }

    @Override
    public void onBounce(CompatibleRayTraceResult movingobjectposition) {
        if(explosionTimeout == ItemGrenade.EXPLODE_ON_IMPACT && !compatibility.world(this).isRemote) {
            explode();
        } else {
            super.onBounce(movingobjectposition);
        }
    }

    private void explode() {
        log.debug("Exploding {}", this);

        Explosion.createServerSideExplosion(modContext, compatibility.world(this), this,
                this.posX, this.posY, this.posZ, explosionStrength, false, true, destroyBlocks, 1f, 1f, 1.5f, 1f, null, null, 
                modContext.getExplosionSound());
        
        List<?> nearbyEntities = compatibility.getEntitiesWithinAABBExcludingEntity(compatibility.world(this), this,
                compatibility.getBoundingBox(this).expand(5, 5, 5));

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

            BiPredicate<Block, CompatibleBlockState> isCollidable = (block, blockMetadata) -> compatibility.canCollideCheck(block, blockMetadata, false);
            CompatibleRayTraceResult rayTraceResult = CompatibleRayTracing.rayTraceBlocks(compatibility.world(this), cvec1, cvec2, isCollidable);

            if(rayTraceResult != null) {
                cvec2 = rayTraceResult.getHitVec();
            }

            for(Object nearbyEntityObject: nearbyEntities) {
                Entity nearbyEntity = (Entity)nearbyEntityObject;
                if (nearbyEntity.canBeCollidedWith()) {
                    float f = 0.5f;
                    CompatibleAxisAlignedBB axisalignedbb = compatibility.expandEntityBoundingBox(nearbyEntity, (double) f,
                            (double) f, (double) f);
                    CompatibleRayTraceResult movingobjectposition1 = axisalignedbb.calculateIntercept(cvec10, cvec2);

                    if (movingobjectposition1 != null) {

                        double distanceToEntity = cvec10.distanceTo(movingobjectposition1.getHitVec());
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
