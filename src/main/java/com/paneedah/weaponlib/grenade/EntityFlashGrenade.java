package com.paneedah.weaponlib.grenade;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.Explosion;
import com.paneedah.weaponlib.LightExposure;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleExposureCapability;
import io.netty.buffer.ByteBuf;
import io.redstudioragnarok.redcore.utils.MathUtil;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.BiPredicate;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class EntityFlashGrenade extends AbstractEntityGrenade {


    public static int MAX_EFFECTIVE_DISTANCE = 15;
    private long explosionTimeout;
    private float explosionStrength;
    private boolean destroyBlocks;
    private long activationTimestamp;

    public int effectiveDistance;

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
        private int effectiveDistance = MAX_EFFECTIVE_DISTANCE;

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

        public Builder withEffectiveDistance(int effectiveDistance) {
            this.effectiveDistance = effectiveDistance > MAX_EFFECTIVE_DISTANCE ? MAX_EFFECTIVE_DISTANCE : effectiveDistance;
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

        public EntityFlashGrenade build(ModContext modContext) {
            EntityFlashGrenade entityGrenade = new EntityFlashGrenade(modContext, itemGrenade, thrower, velocity,
                    gravityVelocity, rotationSlowdownFactor);
            entityGrenade.activationTimestamp = activationTimestamp;
            entityGrenade.explosionTimeout = explosionTimeout;
            entityGrenade.explosionStrength = explosionStrength;
            entityGrenade.itemGrenade = itemGrenade;
            entityGrenade.destroyBlocks = isDestroyingBlocks;
            entityGrenade.effectiveDistance = effectiveDistance;

            return entityGrenade;
        }

    }

    private EntityFlashGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, itemGrenade, thrower, velocity, gravityVelocity, rotationSlowdownFactor);
    }

    public EntityFlashGrenade(World world) {
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
        if (!world.isRemote && explosionTimeout > 0 && System.currentTimeMillis() > activationTimestamp + explosionTimeout) {
            explode();
            return;
        }
    }

    @Override
    public void onBounce(RayTraceResult movingobjectposition) {
//        System.out.println("Bounce");
        if (explosionTimeout == ItemGrenade.EXPLODE_ON_IMPACT && !world.isRemote) {
            explode();
        } else {
            super.onBounce(movingobjectposition);
        }
    }

    private void explode() {
        LOG.debug("Exploding flashbang {}", this);

        explosionStrength = 0.3F;

        Explosion.createOldServerSideExplosion(world, getThrower(), this, new Vector3D(posX, posY, posZ), explosionStrength, false, true, false, 1F, 0.75F, 1.5F, 0.3F, null, null, modContext.getFlashExplosionSound());

        final List<Entity> nearbyEntities = world.getEntitiesWithinAABBExcludingEntity(this, getEntityBoundingBox().expand(effectiveDistance, effectiveDistance, effectiveDistance).expand(-effectiveDistance, -effectiveDistance, -effectiveDistance));
        for (Entity nearbyEntity : nearbyEntities) {
            if (!(nearbyEntity instanceof  EntityPlayer))
                continue;

            final RayTraceResult rayTraceResult = getEntityBoundingBox().calculateIntercept(getPositionVector().add(0, 0.5, 0), nearbyEntity.getPositionVector());

            if (rayTraceResult != null)
                continue;

            final float dose = MathUtil.clampMinFirst(getMaxDose(nearbyEntity), 0, 1);

            LightExposure exposure = CompatibleExposureCapability.getExposure(nearbyEntity, LightExposure.class);

            if (exposure == null) {
                LOG.debug("Entity {} exposed to light dose {}", nearbyEntity, dose);

                exposure = new LightExposure(nearbyEntity.world.getTotalWorldTime(), 4000, dose, 0.99f);
            } else {
                final float totalDose = MathUtil.clampMaxFirst(exposure.getTotalDose() + dose, 0, 1);

                LOG.debug("Entity {} exposed to light dose {}", nearbyEntity, totalDose);

                exposure.setTotalDose(totalDose);
            }

            CompatibleExposureCapability.updateExposure(nearbyEntity, exposure);
        }

        setDead();
    }

    float offset = 0.3f;
    float[][] offsets = new float[][]{
            {0, 0, 0},
            {offset, 0, 0},
            {-offset, 0, 0},
            {0, offset, 0},
            {0, -offset, 0},
            {0, 0, offset},
            {0, 0, -offset},
    };

    private float getMaxDose(Entity nearbyEntity) {
        float dose = 0f;
        for (int i = 0; i < offsets.length; i++) {
            float offsetDose = getDoseWithOffset(nearbyEntity, offsets[i][0], offsets[i][1], offsets[i][2]);
            float coefficient = (offset * 3f - Math.abs(offsets[i][0]) - Math.abs(offsets[i][1]) - Math.abs(offsets[i][2])) / (offset * 3f);
            offsetDose *= coefficient;
            if (offsetDose > dose) {
                dose = offsetDose;
            }
            if (dose > 0.97f) {
                break;
            }
        }
        return dose;
    }

    private float getDoseWithOffset(Entity nearbyEntity, double xOffset, double yOffset, double zOffset) {
        double posX = this.posX + xOffset;
        double posY = this.posY + yOffset;
        double posZ = this.posZ + zOffset;
        final Vector3D grenadePos = new Vector3D(posX, posY, posZ);
//        BiPredicate<Block, IBlockState> isCollidable = (block, blockMetadata) -> block != Blocks.GLASS && block != Blocks.GLASS_PANE && compatibility.canCollideCheck(block, blockMetadata, false);

        BiPredicate<Block, IBlockState> isCollidable = (block, blockMetadata) -> !isTransparentBlock(block) && block.canCollideCheck(blockMetadata, false);
        ;

        EntityPlayer player = (EntityPlayer) nearbyEntity;
        Vec3d playerLookVec = player.getLook(1f);
        Vec3d playerEyePosition = player.getPositionEyes(1f);
        Vec3d playerGrenadeVector = playerEyePosition.subtractReverse(new Vec3d(posX, posY, posZ));

        double dotProduct = playerLookVec.dotProduct(playerGrenadeVector);
        double cos = dotProduct / (MathHelper.sqrt(playerLookVec.lengthSquared()) * MathHelper.sqrt(playerGrenadeVector.lengthSquared()));

        float exposureFactor = (float) ((cos + 1f) / 2f);
        exposureFactor *= exposureFactor;

        final Vector3D compatiblePlayerEyePos = new Vector3D(playerEyePosition.x, playerEyePosition.y, playerEyePosition.z);
        RayTraceResult rayTraceResult = MWCUtil.rayTraceBlocks(world, grenadePos, compatiblePlayerEyePos, isCollidable);

        float dose = 0f;
        if (rayTraceResult == null) {
            dose = exposureFactor * (1f - (float) playerGrenadeVector.lengthSquared() / (effectiveDistance * effectiveDistance));
        }

        return dose;
    }

    public ItemGrenade getItemGrenade() {
        return itemGrenade;
    }

    private boolean isTransparentBlock(Block block) {
        return block == Blocks.SAPLING
                || block == Blocks.LEAVES
                || block == Blocks.LEAVES2
                || block == Blocks.GLASS
                || block == Blocks.BED
                || block == Blocks.GOLDEN_RAIL
                || block == Blocks.DETECTOR_RAIL
                || block == Blocks.WEB
                || block == Blocks.TALLGRASS
                || block == Blocks.DEADBUSH
                || block == Blocks.PISTON_HEAD
                || block == Blocks.PISTON_EXTENSION
                || block == Blocks.YELLOW_FLOWER
                || block == Blocks.RED_FLOWER
                || block == Blocks.BROWN_MUSHROOM
                || block == Blocks.RED_MUSHROOM
                || block == Blocks.STONE_SLAB
                || block == Blocks.TORCH
                || block == Blocks.FIRE
                || block == Blocks.MOB_SPAWNER
                || block == Blocks.OAK_STAIRS
                || block == Blocks.REDSTONE_WIRE
                || block == Blocks.WHEAT
                || block == Blocks.STANDING_SIGN
                || block == Blocks.LADDER
                || block == Blocks.RAIL
                || block == Blocks.STONE_STAIRS
                || block == Blocks.WALL_SIGN
                || block == Blocks.LEVER
                || block == Blocks.STONE_PRESSURE_PLATE
                || block == Blocks.WOODEN_PRESSURE_PLATE
                || block == Blocks.UNLIT_REDSTONE_TORCH
                || block == Blocks.REDSTONE_TORCH
                || block == Blocks.STONE_BUTTON
                || block == Blocks.SNOW_LAYER
                || block == Blocks.REEDS
                || block == Blocks.OAK_FENCE
                || block == Blocks.SPRUCE_FENCE
                || block == Blocks.BIRCH_FENCE
                || block == Blocks.JUNGLE_FENCE
                || block == Blocks.DARK_OAK_FENCE
                || block == Blocks.ACACIA_FENCE
                || block == Blocks.PORTAL
                || block == Blocks.CAKE
                || block == Blocks.UNPOWERED_REPEATER
                || block == Blocks.POWERED_REPEATER
                || block == Blocks.MONSTER_EGG
                || block == Blocks.IRON_BARS
                || block == Blocks.GLASS_PANE
                || block == Blocks.PUMPKIN_STEM
                || block == Blocks.MELON_STEM
                || block == Blocks.VINE
                || block == Blocks.OAK_FENCE_GATE
                || block == Blocks.SPRUCE_FENCE_GATE
                || block == Blocks.BIRCH_FENCE_GATE
                || block == Blocks.JUNGLE_FENCE_GATE
                || block == Blocks.DARK_OAK_FENCE_GATE
                || block == Blocks.ACACIA_FENCE_GATE
                || block == Blocks.BRICK_STAIRS
                || block == Blocks.STONE_BRICK_STAIRS
                || block == Blocks.WATERLILY
                || block == Blocks.NETHER_BRICK_FENCE
                || block == Blocks.NETHER_BRICK_STAIRS
                || block == Blocks.NETHER_WART
                || block == Blocks.ENCHANTING_TABLE
                || block == Blocks.BREWING_STAND
                || block == Blocks.DRAGON_EGG
                || block == Blocks.REDSTONE_LAMP
                || block == Blocks.LIT_REDSTONE_LAMP
                || block == Blocks.WOODEN_SLAB
                || block == Blocks.COCOA
                || block == Blocks.SANDSTONE_STAIRS
                || block == Blocks.TRIPWIRE_HOOK
                || block == Blocks.TRIPWIRE
                || block == Blocks.SPRUCE_STAIRS
                || block == Blocks.BIRCH_STAIRS
                || block == Blocks.JUNGLE_STAIRS
                || block == Blocks.FLOWER_POT
                || block == Blocks.CARROTS
                || block == Blocks.POTATOES
                || block == Blocks.WOODEN_BUTTON
                || block == Blocks.SKULL
                || block == Blocks.ANVIL
                || block == Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE
                || block == Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE
                || block == Blocks.UNPOWERED_COMPARATOR
                || block == Blocks.POWERED_COMPARATOR
                || block == Blocks.DAYLIGHT_DETECTOR
                || block == Blocks.DAYLIGHT_DETECTOR_INVERTED
                || block == Blocks.HOPPER
                || block == Blocks.QUARTZ_STAIRS
                || block == Blocks.ACTIVATOR_RAIL
                || block == Blocks.DROPPER
                || block == Blocks.BARRIER
                || block == Blocks.CARPET
                || block == Blocks.ACACIA_STAIRS
                || block == Blocks.DARK_OAK_STAIRS
                || block == Blocks.DOUBLE_PLANT
                || block == Blocks.STAINED_GLASS
                || block == Blocks.STAINED_GLASS_PANE
                || block == Blocks.STANDING_BANNER
                || block == Blocks.WALL_BANNER
                || block == Blocks.RED_SANDSTONE_STAIRS
                || block == Blocks.STONE_SLAB2
                || block == Blocks.END_ROD
                || block == Blocks.BEETROOTS
                || block == Blocks.STRUCTURE_VOID
                || block == Blocks.STRUCTURE_BLOCK;
    }
}
