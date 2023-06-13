package com.paneedah.weaponlib;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import io.redstudioragnarok.redcore.vectors.Vector3D;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentProtection;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import static com.paneedah.weaponlib.config.ModernConfigManager.explosionBreak;
import static com.paneedah.weaponlib.config.ModernConfigManager.explosionDamage;

public class Explosion {

    private static final ResourceLocation SMOKE_TEXTURE = new ResourceLocation("weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png");
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
    private final double explosionX;
    private final double explosionY;
    private final double explosionZ;
    private final Entity exploder;
    private final float explosionSize;
    private final List<BlockPos> affectedBlockPositions;
    private final Map<EntityPlayer, Vector3D> playerKnockbackMap;
    private final Vector3D position;
    private final float smokeParticleAgeCoefficient;
    private final float smokeParticleScaleCoefficient;
    private final String smokeParticleTextureName;
    private final SoundEvent explosionSound;
    private ModContext modContext;

    // @SideOnly(Side.CLIENT)
    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, List<BlockPos> affectedPositions, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, SoundEvent explosionSound) {
        this(modContext, worldIn, entityIn, x, y, z, size, false, true, affectedPositions, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);
    }

    // @SideOnly(Side.CLIENT)
    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, boolean flaming, boolean smoking, List<BlockPos> affectedPositions, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, SoundEvent explosionSound) {
        this(modContext, worldIn, entityIn, x, y, z, size, flaming, smoking, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);
        this.affectedBlockPositions.addAll(affectedPositions);
    }

    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, boolean flaming, boolean smoking, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, SoundEvent explosionSound) {
        this.modContext = modContext;
        this.explosionRNG = new Random();
        this.affectedBlockPositions = Lists.<BlockPos>newArrayList();
        this.playerKnockbackMap = Maps.<EntityPlayer, Vector3D>newHashMap();
        this.world = worldIn;
        this.exploder = entityIn;
        this.explosionSize = size;
        this.explosionX = x;
        this.explosionY = y;
        this.explosionZ = z;
        this.isFlaming = flaming;
        this.isSmoking = smoking;
        this.position = new Vector3D(explosionX, explosionY, explosionZ);
        this.smokeParticleAgeCoefficient = smokeParticleAgeCoefficient;
        this.smokeParticleScaleCoefficient = smokeParticleScaleCoefficient;
        this.smokeParticleTextureName = smokeParticleTextureName;
        this.explosionSound = explosionSound;
    }

    public static void createServerSideExplosion(ModContext modContext, World world, EntityLivingBase thrower, Entity entity, double posX, double posY, double posZ, float explosionStrength, boolean isFlaming, boolean isSmoking, boolean isDestroyingBlocks, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, SoundEvent explosionSound) {

        world.createExplosion(thrower, entity.posX, entity.posY + 1.0f, entity.posZ, (float) explosionDamage, explosionBreak);

        /*
        explosionStrength *= ModernConfigManager.explosionDamage;

        Explosion explosion = new Explosion(modContext, world, entity, posX, posY, posZ, explosionStrength, isFlaming,
                isSmoking, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient,
                explosionParticleTextureName, smokeParticleTextureName, explosionSound);

        isDestroyingBlocks = true;
        explosion.doExplosionA();
        explosion.doExplosionB(false, isDestroyingBlocks);

        if (!isSmoking) {
            explosion.clearAffectedBlockPositions();
        }

        for (Object o : world.playerEntities)
        {
            EntityPlayer player = (EntityPlayer) o;
            if (player.getDistanceSq(posX, posY, posZ) < 4096.0D) {
                modContext.getChannel().sendTo(new ExplosionMessage(posX, posY, posZ, explosionStrength,
                        isDestroyingBlocks,
                        explosion.getAffectedBlockPositions(), explosion.getPlayerKnockbackMap().get(player),
                        particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient,
                        smokeParticleScaleCoefficient,
                        modContext.getRegisteredTextureId(explosionParticleTextureName),
                        modContext.getRegisteredTextureId(smokeParticleTextureName)),
                        (EntityPlayerMP) player);
            }
        }*/
    }

    public double getExplosionX() {
        return explosionX;
    }

    public double getExplosionY() {
        return explosionY;
    }

    public double getExplosionZ() {
        return explosionZ;
    }

    public World getWorld() {
        return world;
    }

    public Entity getExploder() {
        return exploder;
    }

    public float getExplosionSize() {
        return explosionSize;
    }

    /**
     * Does the first part of the explosion (destroy blocks)
     */
    public void doExplosionA() {


        Set<BlockPos> set = Sets.<BlockPos>newHashSet();

        for (int j = 0; j < 16; ++j) {
            for (int k = 0; k < 16; ++k) {
                for (int l = 0; l < 16; ++l) {
                    if (j == 0 || j == 15 || k == 0 || k == 15 || l == 0 || l == 15) {
                        double d0 = (double) ((float) j / 15.0F * 2.0F - 1.0F);
                        double d1 = (double) ((float) k / 15.0F * 2.0F - 1.0F);
                        double d2 = (double) ((float) l / 15.0F * 2.0F - 1.0F);
                        double d3 = Math.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
                        d0 = d0 / d3;
                        d1 = d1 / d3;
                        d2 = d2 / d3;
                        float f = this.explosionSize * (0.7F + this.world.rand.nextFloat() * 0.6F);
                        double d4 = this.explosionX;
                        double d6 = this.explosionY;
                        double d8 = this.explosionZ;

                        for (/* f1* = 0.3F */; f > 0.0F; f -= 0.22500001F) {
                            BlockPos blockpos = new BlockPos((int) d4, (int) d6, (int) d8);
                            // IBlockState iblockstate =
                            // this.worldObj.getBlockState(blockpos);
                            IBlockState iBlockState = world.getBlockState(blockpos);

                            if (!(MWCUtil.isPenetrableByBullets(iBlockState))) {
                                float f2 = this.exploder != null ? exploder.getExplosionResistance(new net.minecraft.world.Explosion(this.getWorld(), this.getExploder(), this.getExplosionX(), this.getExplosionY(), this.getExplosionZ(), this.getExplosionSize(), false, true), this.world, blockpos, iBlockState) : iBlockState.getBlock().getExplosionResistance((Entity) null); // (this.world, this.exploder, this, blockpos, iBlockState) : compatibility.getExplosionResistance(world, iBlockState, blockpos, (Entity) null, this);
                                f -= (f2 + 0.3F) * 0.3F;
                            }

                            if (f > 0.0F && (this.exploder == null || exploder.canExplosionDestroyBlock(new net.minecraft.world.Explosion(this.getWorld(), this.getExploder(), this.getExplosionX(), this.getExplosionY(), this.getExplosionZ(), this.getExplosionSize(), false, true), this.world, blockpos, iBlockState, f))) { // compatibility.verifyExplosion(this.world, this.exploder, this, blockpos, iBlockState, f))) {
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

        this.affectedBlockPositions.addAll(set);
        float f3 = this.explosionSize * 4.0F;
        int k1 = MathHelper.floor(this.explosionX - (double) f3 - 1.0D);
        int l1 = MathHelper.floor(this.explosionX + (double) f3 + 1.0D);
        int i2 = MathHelper.floor(this.explosionY - (double) f3 - 1.0D);
        int i1 = MathHelper.floor(this.explosionY + (double) f3 + 1.0D);
        int j2 = MathHelper.floor(this.explosionZ - (double) f3 - 1.0D);
        int j1 = MathHelper.floor(this.explosionZ + (double) f3 + 1.0D);
        List<Entity> list = world.getEntitiesWithinAABBExcludingEntity(this.exploder, new AxisAlignedBB((double) k1, (double) i2, (double) j2, (double) l1, (double) i1, (double) j1));

        // net.minecraftforge.event.ForgeEventFactory.onExplosionDetonate(this.worldObj, this, list, f3);
        Vector3D vec3d = new Vector3D(this.explosionX, this.explosionY, this.explosionZ);

        for (int k2 = 0; k2 < list.size(); ++k2) {
            Entity entity = (Entity) list.get(k2);

            if (!entity.isImmuneToExplosions()) {
                double d12 = entity.getDistance(this.explosionX, this.explosionY, this.explosionZ) / (double) f3;

                if (d12 <= 1.0D) {
                    double d5 = entity.posX - this.explosionX;
                    double d7 = entity.posY + (double) entity.getEyeHeight() - this.explosionY;
                    double d9 = entity.posZ - this.explosionZ;
                    double d13 = (double) MathHelper.sqrt(d5 * d5 + d7 * d7 + d9 * d9);

                    if (d13 != 0.0D) {
                        d5 = d5 / d13;
                        d7 = d7 / d13;
                        d9 = d9 / d13;
                        double d14;

                        final AxisAlignedBB boundingBox = entity.getEntityBoundingBox();

                        double deltaX = 1 / ((boundingBox.maxX - boundingBox.minX) * 2 + 1);
                        double deltaY = 1 / ((boundingBox.maxY - boundingBox.minY) * 2 + 1);
                        double deltaZ = 1 / ((boundingBox.maxZ - boundingBox.minZ) * 2 + 1);

                        if (deltaX < 0 || deltaY < 0 || deltaZ < 0)
                            d14 = 0;

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

                                    if (MWCUtil.rayTraceBlocks(world, sampledVec, vec3d, this::canCollideWithBlock) == null)
                                        collidableCount++;

                                    totalSampleCount++;
                                }
                            }
                        }

                        d14 = (float) collidableCount / totalSampleCount;

                        double d10 = (1.0D - d12) * d14;
                        double d11 = 1.0D;

                        if (entity instanceof EntityLivingBase) {
                            d11 = EnchantmentProtection.getBlastDamageReduction((EntityLivingBase) entity, d10);
                        }

                        entity.motionX += d5 * d11;
                        entity.motionY += d7 * d11;
                        entity.motionZ += d9 * d11;

                        if (entity instanceof EntityPlayer) {
                            EntityPlayer entityplayer = (EntityPlayer) entity;

                            if (!entityplayer.isSpectator() && (!entityplayer.isCreative() || !entityplayer.capabilities.isFlying)) {
                                this.playerKnockbackMap.put(entityplayer, new Vector3D(d5 * d10, d7 * d10, d9 * d10));
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
            world.playSound(null, explosionX, explosionY, explosionZ, explosionSound, SoundCategory.BLOCKS,4f, (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7f);
        }


        if (this.isSmoking) {
            int counter = 0;
            for (BlockPos blockpos : this.affectedBlockPositions) {

                if (counter++ % 2 != 0) {
                    continue;
                }

                IBlockState blockState = world.getBlockState(blockpos);


//                if (spawnParticles) {
//                    for(int i = 0; i < 1; i++) {
//                        double d0 = (double) ((float) blockpos.getBlockPosX() + this.world.rand.nextFloat());
//                        double d1 = (double) ((float) blockpos.getBlockPosY() + this.world.rand.nextFloat());
//                        double d2 = (double) ((float) blockpos.getBlockPosZ() + this.world.rand.nextFloat());
//                        double d3 = d0 - this.explosionX;
//                        double d4 = d1 - this.explosionY;
//                        double d5 = d2 - this.explosionZ;
//                        double d6 = (double) MathHelper.sqrt_double(d3 * d3 + d4 * d4 + d5 * d5);
//                        d3 = d3 / d6;
//                        d4 = d4 / d6;
//                        d5 = d5 / d6;
//                        double d7 = 4D /*0.5D*/ / (d6 / (double) this.explosionSize + 0.1D);
//                        d7 = d7 * (double) (this.world.rand.nextFloat() * this.world.rand.nextFloat() + 0.3F);
//                        d3 = d3 * d7;
//                        d4 = d4 * d7;
//                        d5 = d5 * d7;
//
//
//                        /*
//                        if(blockState.getBlockState().getBlock() != Blocks.AIR) {
//                        	Vec3d posVect = new Vec3d((d0 + this.explosionX) / 2.0D,
//                                    (d1 + this.explosionY) / 2.0D,
//                                    (d2 + this.explosionZ) / 2.0D);
//
//                            Vec3d directionVector = posVect.subtract(new Vec3d(this.explosionX, this.explosionY, this.explosionZ)).normalize();
//
//
//                            for(int n = 0; n < 5; ++n) {
//                            	double spread = 0.1;
//                            	new Vec3d(RandomUtil.getRandomWithNegatives(spread), RandomUtil.getRandomDoubleInclusive(0.0, spread), RandomUtil.getRandomWithNegatives(spread)).add(directionVector);
//
//                        		//cdp.setBlockPos(blockpos.getBlockPos());
//                        	//	mc.effectRenderer.addEffect(cdp);
//                            }
//
//
//                        }
//						*/
//
//
//                        /*
//                        modContext.getEffectManager().spawnExplosionParticle(
//                                (d0 + this.explosionX) / 2.0D,
//                                (d1 + this.explosionY) / 2.0D,
//                                (d2 + this.explosionZ) / 2.0D,
//                                d3 / 2, d4 * 2, d5 / 2,
//                                explosionParticleScaleCoefficient * world.rand.nextFloat(),
//                                (int)((15 + (int)(world.rand.nextFloat() * 10)) * explosionParticleAgeCoefficient),
//                                explosionParticleTextureName);
//                        */
//                    }
//
//                }

                if (destroyBlocks && !(blockState.getBlock() == Blocks.AIR)) {
                    if (blockState.getBlock().canDropFromExplosion(new net.minecraft.world.Explosion(this.getWorld(), this.getExploder(), this.getExplosionX(), this.getExplosionY(), this.getExplosionZ(), this.getExplosionSize(), false, true)))
                        blockState.getBlock().dropBlockAsItemWithChance(this.world, blockpos, blockState, (float) ModernConfigManager.explodedBlockDropChance * (1.0F / this.explosionSize), 0);

                    blockState.getBlock().onBlockExploded(this.world, blockpos, new net.minecraft.world.Explosion(this.getWorld(), this.getExploder(), this.getExplosionX(), this.getExplosionY(), this.getExplosionZ(), this.getExplosionSize(), false, true));
                }
            }

            if (spawnParticles) {
                for (int i = 0; i < 15; i++) {
                    double pX = explosionX + world.rand.nextGaussian() * 0.8;
                    double pY = explosionY + world.rand.nextGaussian() * 0.9;
                    double pZ = explosionZ + world.rand.nextGaussian() * 0.8;

                    double motionX = world.rand.nextGaussian() * 0.001;
                    double motionY = world.rand.nextGaussian() * 0.0001;
                    double motionZ = world.rand.nextGaussian() * 0.001;

                    modContext.getEffectManager().spawnExplosionSmoke(
                            pX, pY, pZ, motionX, motionY, motionZ,
                            smokeParticleScaleCoefficient,
                            (int) ((250 + (int) (world.rand.nextFloat() * 30)) * smokeParticleAgeCoefficient),
                            ExplosionSmokeFX.Behavior.EXPLOSION,
                            smokeParticleTextureName);
                }
            }
        }

        if (this.isFlaming && destroyBlocks) {
            for (BlockPos blockpos1 : this.affectedBlockPositions) {
                if (world.isAirBlock(blockpos1) && world.getBlockState(blockpos1.down()).isFullBlock() && this.explosionRNG.nextInt(3) == 0) {
                    world.setBlockState(blockpos1, Blocks.FIRE.getDefaultState());
                }
            }
        }
    }

    public Map<EntityPlayer, Vector3D> getPlayerKnockbackMap() {
        return this.playerKnockbackMap;
    }

    /**
     * Returns either the entity that placed the explosive block, the entity
     * that caused the explosion or null.
     */
    public EntityLivingBase getExplosivePlacedBy() {
        return this.exploder == null ? null : (this.exploder instanceof EntityTNTPrimed ? ((EntityTNTPrimed) this.exploder).getTntPlacedBy() : (this.exploder instanceof EntityLivingBase ? (EntityLivingBase) this.exploder : null));
    }

    public void clearAffectedBlockPositions() {
        this.affectedBlockPositions.clear();
    }

    public List<BlockPos> getAffectedBlockPositions() {
        return this.affectedBlockPositions;
    }

    public Vector3D getPosition() {
        return this.position;
    }
}
