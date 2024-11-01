package com.paneedah.weaponlib;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.paneedah.mwc.MWC;
import com.paneedah.mwc.network.messages.ExplosionMessage;
import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import lombok.Getter;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import static com.paneedah.mwc.MWC.CHANNEL;
import static com.paneedah.weaponlib.config.ModernConfigManager.explosionBreak;
import static com.paneedah.weaponlib.config.ModernConfigManager.explosionDamage;

public class Explosion {

    /**
     * whether the explosion sets fire to blocks around it
     */
    private final boolean isFlaming;
    /**
     * whether this explosion spawns smoke particles
     */
    private final boolean isSmoking;
    private final Random explosionRNG;
    private final World world;
    private final Vector3D position;
    private final Entity exploder;
    private final float explosionStrength;
    private final List<BlockPos> affectedBlockPositions;
    @Getter private final Map<EntityPlayer, Vector3D> playerKnockbackMap;
    private final float smokeParticleAgeCoefficient;
    private final float smokeParticleScaleCoefficient;
    private final String smokeParticleTextureName;
    private final SoundEvent explosionSound;

    public Explosion(World worldIn, Entity entityIn, Vector3D position, float explosionStrength, boolean flaming, boolean smoking, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, SoundEvent explosionSound) {
        explosionRNG = new Random();
        affectedBlockPositions = Lists.newArrayList();
        playerKnockbackMap = Maps.newHashMap();
        world = worldIn;
        exploder = entityIn;
        this.explosionStrength = explosionStrength;
        this.position = position;
        isFlaming = flaming;
        isSmoking = smoking;
        this.smokeParticleAgeCoefficient = smokeParticleAgeCoefficient;
        this.smokeParticleScaleCoefficient = smokeParticleScaleCoefficient;
        this.smokeParticleTextureName = smokeParticleTextureName;
        this.explosionSound = explosionSound;
    }

    public static void createOldServerSideExplosion(World world, EntityLivingBase thrower, Entity entity, Vector3D position, float explosionStrength, boolean isFlaming, boolean isSmoking, boolean isDestroyingBlocks, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, SoundEvent explosionSound) {
        explosionStrength *= (float) ModernConfigManager.explosionDamage;

        final Explosion explosion = new Explosion(world, entity, position, explosionStrength, isFlaming, isSmoking, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);

        explosion.doExplosionA();
        explosion.doExplosionB(true, isDestroyingBlocks);

        if (!isSmoking) {
            explosion.affectedBlockPositions.clear();
        }

        for (EntityPlayer currentPlayer : world.playerEntities) {
            if (currentPlayer == null) {
                return;
            }

            if (currentPlayer.getDistanceSq(position.x, position.y, position.z) < 4096) {
                final Vector3D velocity = explosion.getPlayerKnockbackMap().get(currentPlayer);

                if (velocity == null) {
                    continue;
                }

                CHANNEL.sendTo(new ExplosionMessage(velocity, explosionStrength), (EntityPlayerMP) currentPlayer);
            }
        }
    }

    public static void createServerSideExplosion(World world, EntityLivingBase thrower, Entity entity, double posX, double posY, double posZ, float explosionStrength, boolean isFlaming, boolean isSmoking, boolean isDestroyingBlocks, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, SoundEvent explosionSound) {
        world.createExplosion(thrower, entity.posX, entity.posY + 1.0f, entity.posZ, (float) explosionDamage, explosionBreak);
    }

    /**
     * Does the first part of the explosion (destroy blocks)
     */
    public void doExplosionA() {
        Set<BlockPos> set = Sets.newHashSet();

        for (int j = 0; j < 16; ++j) {
            for (int k = 0; k < 16; ++k) {
                for (int l = 0; l < 16; ++l) {
                    if (j == 0 || j == 15 || k == 0 || k == 15 || l == 0 || l == 15) {
                        double d0 = (j / 15.0F * 2.0F - 1.0F);
                        double d1 = (k / 15.0F * 2.0F - 1.0F);
                        double d2 = (l / 15.0F * 2.0F - 1.0F);
                        double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                        d0 = d0 / d3;
                        d1 = d1 / d3;
                        d2 = d2 / d3;
                        float f = explosionStrength * (0.7F + world.rand.nextFloat() * 0.6F);
                        double d4 = position.x;
                        double d6 = position.y;
                        double d8 = position.z;

                        for (/* f1* = 0.3F */; f > 0.0F; f -= 0.22500001F) {
                            BlockPos blockpos = new BlockPos((int) d4, (int) d6, (int) d8);
                            IBlockState iBlockState = world.getBlockState(blockpos);

                            if (!(MWCUtil.isPenetrableByBullets(iBlockState))) {
                                float f2 = exploder != null ? exploder.getExplosionResistance(new net.minecraft.world.Explosion(world, exploder, position.x, position.y, position.z, explosionStrength, false, true), world, blockpos, iBlockState) : iBlockState.getBlock().getExplosionResistance(null); // (this.world, this.exploder, this, blockpos, iBlockState) : compatibility.getExplosionResistance(world, iBlockState, blockpos, (Entity) null, this);
                                f -= (f2 + 0.3F) * 0.3F;
                            }

                            if (f > 0.0F && (exploder == null || exploder.canExplosionDestroyBlock(new net.minecraft.world.Explosion(world, exploder, position.x, position.y, position.z, explosionStrength, false, true), world, blockpos, iBlockState, f))) { // compatibility.verifyExplosion(this.world, this.exploder, this, blockpos, iBlockState, f))) {
                                set.add(blockpos);
                            }

                            d4 += d0 * 0.30000001192092896D;
                            d6 += d1 * 0.30000001192092896D;
                            d8 += d2 * 0.30000001192092896D;
                        }
                    }
                }
            }
        }

        affectedBlockPositions.addAll(set);

        // net.minecraftforge.event.ForgeEventFactory.onExplosionDetonate(this.worldObj, this, list, knockbackRange);
        Vector3D vec3d = new Vector3D(position.x, position.y, position.z);

        final float knockbackRange = explosionStrength * 2;
        assert exploder != null;
        final List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(exploder, exploder.getEntityBoundingBox().expand(knockbackRange, knockbackRange, knockbackRange).expand(-knockbackRange, -knockbackRange, -knockbackRange));
        for (Entity entity : list) {
            if (!entity.isImmuneToExplosions()) {
                double d12 = entity.getDistance(position.x, position.y, position.z) / (double) knockbackRange;

                if (d12 <= 1) {
                    double d5 = entity.posX - position.x;
                    double d7 = entity.posY + (double) entity.getEyeHeight() - position.y;
                    double d9 = entity.posZ - position.z;
                    double d13 = MathHelper.sqrt(d5 * d5 + d7 * d7 + d9 * d9);

                    if (d13 != 0) {
                        d5 = d5 / d13;
                        d7 = d7 / d13;
                        d9 = d9 / d13;
                        double d14;

                        final AxisAlignedBB boundingBox = entity.getEntityBoundingBox();

                        double deltaX = 1 / ((boundingBox.maxX - boundingBox.minX) * 2 + 1);
                        double deltaY = 1 / ((boundingBox.maxY - boundingBox.minY) * 2 + 1);
                        double deltaZ = 1 / ((boundingBox.maxZ - boundingBox.minZ) * 2 + 1);

                        double offsetX = (1 - Math.floor(1 / deltaX) * deltaX) / 2;
                        double offsetZ = (1 - Math.floor(1 / deltaZ) * deltaZ) / 2;
                        int collidableCount = 0;
                        int totalSampleCount = 0;

                        for (double x = 0; x <= 1; x += deltaX) {
                            for (double y = 0; y <= 1; y += deltaY) {
                                for (double z = 0; z <= 1; z += deltaZ) {
                                    double posX = boundingBox.minX + (boundingBox.maxX - boundingBox.minX) * x;
                                    double posY = boundingBox.minY + (boundingBox.maxY - boundingBox.minY) * y;
                                    double posZ = boundingBox.minZ + (boundingBox.maxZ - boundingBox.minZ) * z;

                                    Vector3D sampledVec = new Vector3D(posX + offsetX, posY, posZ + offsetZ);

                                    if (MWCUtil.rayTraceBlocks(world, sampledVec, vec3d, this::canCollideWithBlock) == null) {
                                        collidableCount++;
                                    }

                                    totalSampleCount++;
                                }
                            }
                        }

                        d14 = (float) collidableCount / totalSampleCount;

                        double d10 = ((1 - d12) * d14) * (explosionStrength / 4);

                        if (entity instanceof EntityPlayer) {
                            EntityPlayer entityplayer = (EntityPlayer) entity;

                            if (!entityplayer.isSpectator()) {
                                playerKnockbackMap.put(entityplayer, new Vector3D(d5 * d10, d7 * d10, d9 * d10));
                            }
                        }
                    }
                }
            }
        }
    }

    public boolean canCollideWithBlock(Block block, IBlockState iBlockState) {
        return !MWCUtil.isPenetrableByBullets(iBlockState) && block.canCollideCheck(iBlockState, false);
    }

    /**
     * Does the second part of the explosion (sound, particles, drop spawn)
     */
    public void doExplosionB(boolean spawnParticles, boolean destroyBlocks) {
        if (!world.isRemote && explosionSound != null) {
            world.playSound(null, position.x, position.y, position.z, explosionSound, SoundCategory.BLOCKS, 4f, (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7f);
        }

        if (isSmoking) {
            int counter = 0;
            for (BlockPos blockpos : affectedBlockPositions) {

                if (counter++ % 2 != 0) {
                    continue;
                }

                IBlockState blockState = world.getBlockState(blockpos);

                if (destroyBlocks && blockState.getBlock() != Blocks.AIR) {
                    if (blockState.getBlock().canDropFromExplosion(new net.minecraft.world.Explosion(world, exploder, position.x, position.y, position.z, explosionStrength, false, true))) {
                        blockState.getBlock().dropBlockAsItemWithChance(world, blockpos, blockState, (float) ModernConfigManager.explodedBlockDropChance * (1.0F / explosionStrength), 0);
                    }

                    blockState.getBlock().onBlockExploded(world, blockpos, new net.minecraft.world.Explosion(world, exploder, position.x, position.y, position.z, explosionStrength, false, true));
                }
            }

            if (spawnParticles && FMLCommonHandler.instance().getSide().isClient()) {
                for (int i = 0; i < 15; i++) {
                    double pX = position.x + world.rand.nextGaussian() * 0.8 * smokeParticleScaleCoefficient;
                    double pY = position.y + world.rand.nextGaussian() * 0.9 * smokeParticleScaleCoefficient;
                    double pZ = position.z + world.rand.nextGaussian() * 0.8 * smokeParticleScaleCoefficient;

                    double motionX = world.rand.nextGaussian() * 0.001 * explosionStrength;
                    double motionY = world.rand.nextGaussian() * 0.0001 * explosionStrength;
                    double motionZ = world.rand.nextGaussian() * 0.001 * explosionStrength;

                    MWC.modContext.getEffectManager().spawnExplosionSmoke(pX, pY, pZ, motionX, motionY, motionZ, smokeParticleScaleCoefficient, (int) ((250 + (int) (world.rand.nextFloat() * 30)) * smokeParticleAgeCoefficient), ExplosionSmokeFX.Behavior.EXPLOSION, smokeParticleTextureName);
                }
            }
        }

        if (isFlaming && destroyBlocks) {
            for (BlockPos blockpos1 : affectedBlockPositions)
                if (world.isAirBlock(blockpos1) && world.getBlockState(blockpos1.down()).isFullBlock() && explosionRNG.nextInt(3) == 0) {
                    world.setBlockState(blockpos1, Blocks.FIRE.getDefaultState());
                }
        }
    }
}
