package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.jim.util.HitUtil;
import com.paneedah.weaponlib.network.packets.BloodPacketClient;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import javax.annotation.Nonnull;
import java.util.List;

import static com.paneedah.mwc.utils.ModReference.LOG;

public class WeaponSpawnEntity extends EntityProjectile {

    private static final String TAG_ENTITY_ITEM = "entityItem";
    private static final String TAG_DAMAGE = "damage";
    private static final String TAG_EXPLOSION_RADIUS = "explosionRadius";
    private static final String TAG_EXPLOSION_IS_DESTROYING_BLOCKS = "destroyBlocks";
    private static final String TAG_IS_SPAWN_ROCKET_PARTICLES = "rocketParticles";
    private static final String TAG_EXPLOSION_PARTICLE_AGE_COEFFICIENT = "epac";
    private static final String TAG_SMOKE_PARTICLE_AGE_COEFFICIENT = "spac";
    private static final String TAG_EXPLOSION_PARTICLE_SCALE_COEFFICIENT = "epsc";
    private static final String TAG_SMOKE_PARTICLE_SCALE_COEFFICIENT = "spsc";
    private static final String TAG_EXPLOSION_PARTICLE_TEXTURE_ID = "epti";
    private static final String TAG_SMOKE_PARTICLE_TEXTURE_ID = "spti";

    private boolean isDestroyingBlocks;
    public boolean spawnRocketParticles;

    private int explosionParticleTextureId;
    private int smokeParticleTextureId;

    private float explosionRadius;
    private float damage = 6F;
    private float explosionParticleAgeCoefficient;
    private float smokeParticleAgeCoefficient;
    private float explosionParticleScaleCoefficient;
    private float smokeParticleScaleCoefficient;

    private Weapon weapon;

    public WeaponSpawnEntity(final World world) {
        super(world);
    }

    public WeaponSpawnEntity(final Weapon weapon, final World world, final EntityLivingBase player, final float speed, final float gravityVelocity, final float inaccuracy, final float damage, final float explosionRadius, final boolean isDestroyingBlocks, final boolean spawnRocketParticles, final float explosionParticleAgeCoefficient, final float smokeParticleAgeCoefficient, final float explosionParticleScaleCoefficient, final float smokeParticleScaleCoefficient, final int explosionParticleTextureId, final int smokeParticleTextureId) {
        super(world, player, speed, gravityVelocity, inaccuracy);

        this.weapon = weapon;
        this.damage = damage;
        this.explosionRadius = explosionRadius;
        this.isDestroyingBlocks = isDestroyingBlocks;
        this.explosionParticleAgeCoefficient = explosionParticleAgeCoefficient;
        this.smokeParticleAgeCoefficient = smokeParticleAgeCoefficient;
        this.explosionParticleScaleCoefficient = explosionParticleScaleCoefficient;
        this.smokeParticleScaleCoefficient = smokeParticleScaleCoefficient;
        this.explosionParticleTextureId = explosionParticleTextureId;
        this.smokeParticleTextureId = smokeParticleTextureId;
        this.spawnRocketParticles = spawnRocketParticles;

        this.setSize(0.30F, 0.30F);
    }

    @Override
    protected void onImpact(final RayTraceResult position) {
        if (world.isRemote || weapon == null)
            return;

        if (explosionRadius > 0) {
            //PostProcessPipeline.createDistortionPoint((float) position.hitVec.x,(float)  position.hitVec.y, (float) position.hitVec.z, 2f, 3000);
            Explosion.createServerSideExplosion(weapon.getModContext(), world, this.getThrower(), this, position.hitVec.x, position.hitVec.y, position.hitVec.z, explosionRadius, false, true, isDestroyingBlocks, explosionParticleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, weapon.getModContext().getRegisteredTexture(explosionParticleTextureId), weapon.getModContext().getRegisteredTexture(smokeParticleTextureId), weapon.getModContext().getExplosionSound());
        } else if (position.entityHit != null) {
            if (this.getThrower() != null)
                position.entityHit.attackEntityFrom(new ProjectileDamageSource(this, this.getThrower()), damage);
            else
                position.entityHit.attackEntityFrom(new DamageSource("arrow"), damage);

            position.entityHit.hurtResistantTime = 0;
            position.entityHit.prevRotationYaw -= 0.3F;

            LOG.debug("Hit entity {}", position.entityHit);

            NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(position.entityHit.dimension, this.posX, this.posY, this.posZ, 100);

            final double bleedingCoefficient = weapon.getBleedingCoefficient() * ModernConfigManager.enableBleedingOnHit;

            if (bleedingCoefficient > 0) {
                final RayTraceResult rayTraceResult = HitUtil.traceProjectilehit(this, position.entityHit);

                if (rayTraceResult != null && rayTraceResult.typeOfHit == Type.BLOCK)
                    weapon.getModContext().getChannel().sendToAllAround(new BloodPacketClient(rayTraceResult.hitVec.x, rayTraceResult.hitVec.y, rayTraceResult.hitVec.z, motionX, motionY, motionZ), point);
            }
        } else if (position.typeOfHit == RayTraceResult.Type.BLOCK)
            weapon.onSpawnEntityBlockImpact(world, null, this, position);

        this.setDead();
    }

    @Override
    public void readSpawnData(final ByteBuf buffer) {
        super.readSpawnData(buffer);

        weapon = (Weapon) Item.getItemById(buffer.readInt());
        damage = buffer.readFloat();
        explosionRadius = buffer.readFloat();
        isDestroyingBlocks = buffer.readBoolean();
        spawnRocketParticles = buffer.readBoolean();
        explosionParticleAgeCoefficient = buffer.readFloat();
        smokeParticleAgeCoefficient = buffer.readFloat();
        explosionParticleScaleCoefficient = buffer.readFloat();
        smokeParticleScaleCoefficient = buffer.readFloat();
    }

    @Override
    public void readEntityFromNBT(final NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);

        weapon = (Weapon) Item.getItemById(tagCompound.getInteger(TAG_ENTITY_ITEM));
        damage = tagCompound.getFloat(TAG_DAMAGE);
        explosionRadius = tagCompound.getFloat(TAG_EXPLOSION_RADIUS);
        isDestroyingBlocks = tagCompound.getBoolean(TAG_EXPLOSION_IS_DESTROYING_BLOCKS);
        spawnRocketParticles = tagCompound.getBoolean(TAG_IS_SPAWN_ROCKET_PARTICLES);
        explosionParticleAgeCoefficient = tagCompound.getFloat(TAG_EXPLOSION_PARTICLE_AGE_COEFFICIENT);
        smokeParticleAgeCoefficient = tagCompound.getFloat(TAG_SMOKE_PARTICLE_AGE_COEFFICIENT);
        explosionParticleScaleCoefficient = tagCompound.getFloat(TAG_EXPLOSION_PARTICLE_SCALE_COEFFICIENT);
        smokeParticleScaleCoefficient = tagCompound.getFloat(TAG_SMOKE_PARTICLE_SCALE_COEFFICIENT);
        explosionParticleTextureId = tagCompound.getInteger(TAG_EXPLOSION_PARTICLE_TEXTURE_ID);
        smokeParticleTextureId = tagCompound.getInteger(TAG_SMOKE_PARTICLE_TEXTURE_ID);
    }

    @Override
    public void writeSpawnData(final ByteBuf buffer) {
        super.writeSpawnData(buffer);

        buffer.writeInt(Item.getIdFromItem(weapon));
        buffer.writeFloat(damage);
        buffer.writeFloat(explosionRadius);
        buffer.writeBoolean(isDestroyingBlocks);
        buffer.writeBoolean(spawnRocketParticles);
        buffer.writeFloat(explosionParticleAgeCoefficient);
        buffer.writeFloat(smokeParticleAgeCoefficient);
        buffer.writeFloat(explosionParticleScaleCoefficient);
        buffer.writeFloat(smokeParticleScaleCoefficient);
    }

    @Override
    public void writeEntityToNBT(final NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);

        tagCompound.setInteger(TAG_ENTITY_ITEM, Item.getIdFromItem(weapon));
        tagCompound.setFloat(TAG_DAMAGE, damage);
        tagCompound.setFloat(TAG_EXPLOSION_RADIUS, explosionRadius);
        tagCompound.setBoolean(TAG_EXPLOSION_IS_DESTROYING_BLOCKS, isDestroyingBlocks);
        tagCompound.setBoolean(TAG_IS_SPAWN_ROCKET_PARTICLES, spawnRocketParticles);
        tagCompound.setFloat(TAG_EXPLOSION_PARTICLE_AGE_COEFFICIENT, explosionParticleAgeCoefficient);
        tagCompound.setFloat(TAG_SMOKE_PARTICLE_AGE_COEFFICIENT, smokeParticleAgeCoefficient);
        tagCompound.setFloat(TAG_EXPLOSION_PARTICLE_SCALE_COEFFICIENT, explosionParticleScaleCoefficient);
        tagCompound.setFloat(TAG_SMOKE_PARTICLE_SCALE_COEFFICIENT, smokeParticleScaleCoefficient);
        tagCompound.setInteger(TAG_EXPLOSION_PARTICLE_TEXTURE_ID, explosionParticleTextureId);
        tagCompound.setInteger(TAG_SMOKE_PARTICLE_TEXTURE_ID, smokeParticleTextureId);
    }

    @Override
    public boolean canCollideWithBlock(final List<BlockPos> violators, final Block block, final BlockPos pos, final IBlockState iBlockState) {
        return !MWCUtil.isPenetrableByBullets(iBlockState) && super.canCollideWithBlock(violators, block, pos, iBlockState);
    }

    @Override
    public void shoot(final double x, final double y, final double z, final float velocity, final float inaccuracy) {
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public static class ProjectileDamageSource extends EntityDamageSourceIndirect {
        public ProjectileDamageSource(Entity projectile, @Nonnull Entity shooter) {
            super("arrow", projectile, shooter);
            this.setProjectile();
        }

        @Override
        public ITextComponent getDeathMessage(EntityLivingBase entityLivingBaseIn) {
            ITextComponent itextcomponent = getTrueSource().getDisplayName();
            ItemStack itemstack = getTrueSource() instanceof EntityLivingBase ? ((EntityLivingBase) getTrueSource()).getHeldItemMainhand() : ItemStack.EMPTY;
            String s1 = "death.attack." + this.damageType + ".item";
            return new TextComponentTranslation(s1, entityLivingBaseIn.getDisplayName(), itextcomponent, itemstack.getTextComponent());
        }
    }
}
