package com.paneedah.weaponlib;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.paneedah.weaponlib.compatibility.*;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.particle.ExplosionSmokeFX;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public class Explosion {
    
    private static final ResourceLocation SMOKE_TEXTURE = new ResourceLocation("weaponlib:/com/paneedah/weaponlib/resources/large-smoke.png");

    private final ModContext modContext;
    /** whether the explosion sets fire to blocks around it */
    private final boolean isFlaming;
    /** whether this explosion spawns smoke particles */
    private final boolean isSmoking;
    private final Random explosionRNG;
    private final World world;
    private final double explosionX;
    private final double explosionY;
    private final double explosionZ;
    private final Entity exploder;
    private final float explosionSize;
    private final List<CompatibleBlockPos> affectedBlockPositions;
    private final Map<EntityPlayer, CompatibleVec3> playerKnockbackMap;
    private final CompatibleVec3 position;
    private final float smokeParticleAgeCoefficient;
    private final float smokeParticleScaleCoefficient;
    private final String smokeParticleTextureName;
    private final CompatibleSound explosionSound;

    public static void createServerSideExplosion(ModContext modContext, World world, Entity entity, double posX, double posY, double posZ, float explosionStrength, boolean isFlaming, boolean isSmoking, boolean isDestroyingBlocks, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        world.createExplosion(entity, entity.posX, entity.posY + 1.0f, entity.posZ, 4.0F, true);
        
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
                modContext.getChannel().getChannel().sendTo(new ExplosionMessage(posX, posY, posZ, explosionStrength,
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

    // @SideOnly(Side.CLIENT)
    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, List<CompatibleBlockPos> affectedPositions, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        this(modContext, worldIn, entityIn, x, y, z, size, false, true, affectedPositions, particleAgeCoefficient, smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);
    }

    // @SideOnly(Side.CLIENT)
    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, boolean flaming, boolean smoking, List<CompatibleBlockPos> affectedPositions, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        this(modContext, worldIn, entityIn, x, y, z, size, flaming, smoking, particleAgeCoefficient, smokeParticleAgeCoefficient,
        explosionParticleScaleCoefficient, smokeParticleScaleCoefficient, explosionParticleTextureName, smokeParticleTextureName, explosionSound);
        this.affectedBlockPositions.addAll(affectedPositions);
    }

    public Explosion(ModContext modContext, World worldIn, Entity entityIn, double x, double y, double z, float size, boolean flaming, boolean smoking, float particleAgeCoefficient, float smokeParticleAgeCoefficient, float explosionParticleScaleCoefficient, float smokeParticleScaleCoefficient, String explosionParticleTextureName, String smokeParticleTextureName, CompatibleSound explosionSound) {
        this.modContext = modContext;
        this.explosionRNG = new Random();
        this.affectedBlockPositions = Lists.<CompatibleBlockPos>newArrayList();
        this.playerKnockbackMap = Maps.<EntityPlayer, CompatibleVec3>newHashMap();
        this.world = worldIn;
        this.exploder = entityIn;
        this.explosionSize = size;
        this.explosionX = x;
        this.explosionY = y;
        this.explosionZ = z;
        this.isFlaming = flaming;
        this.isSmoking = smoking;
        this.position = new CompatibleVec3(explosionX, explosionY, explosionZ);
        this.smokeParticleAgeCoefficient = smokeParticleAgeCoefficient;
        this.smokeParticleScaleCoefficient = smokeParticleScaleCoefficient;
        this.smokeParticleTextureName = smokeParticleTextureName;
        this.explosionSound = explosionSound;
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
        Set<CompatibleBlockPos> set = Sets.<CompatibleBlockPos>newHashSet();

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
                            CompatibleBlockPos blockpos = new CompatibleBlockPos((int) d4, (int) d6, (int) d8);
                            // CompatibleBlockState iblockstate =
                            // this.worldObj.getBlockState(blockpos);
                            CompatibleBlockState blockState = compatibility.getBlockAtPosition(world, blockpos);

                            if (!(compatibility.isAirBlock(blockState) || compatibility.isBlockPenetratableByBullets(blockState))) {
                                float f2 = this.exploder != null ? compatibility.getExplosionResistance(this.world, this.exploder, this, blockpos, blockState) : compatibility.getExplosionResistance(world, blockState, blockpos, (Entity) null, this);
                                f -= (f2 + 0.3F) * 0.3F;
                            }

                            if (f > 0.0F && (this.exploder == null || compatibility.verifyExplosion(this.world, this.exploder, this, blockpos, blockState, f)))
                                set.add(blockpos);

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
        int k1 = CompatibleMathHelper.floor_double(this.explosionX - (double) f3 - 1.0D);
        int l1 = CompatibleMathHelper.floor_double(this.explosionX + (double) f3 + 1.0D);
        int i2 = CompatibleMathHelper.floor_double(this.explosionY - (double) f3 - 1.0D);
        int i1 = CompatibleMathHelper.floor_double(this.explosionY + (double) f3 + 1.0D);
        int j2 = CompatibleMathHelper.floor_double(this.explosionZ - (double) f3 - 1.0D);
        int j1 = CompatibleMathHelper.floor_double(this.explosionZ + (double) f3 + 1.0D);
        List<Entity> list = compatibility.getEntitiesWithinAABBExcludingEntity(world, this.exploder, new CompatibleAxisAlignedBB((double) k1, (double) i2, (double) j2, (double) l1, (double) i1, (double) j1));

        // net.minecraftforge.event.ForgeEventFactory.onExplosionDetonate(this.worldObj,this, list, f3);
        CompatibleVec3 vec3d = new CompatibleVec3(this.explosionX, this.explosionY, this.explosionZ);

        for (Entity value : list) {
            if (compatibility.isImmuneToExplosions((Entity) value))
                continue;

            double d12 = ((Entity) value).getDistance(this.explosionX, this.explosionY, this.explosionZ) / (double) f3;
            if (d12 > 1.0D)
                continue;

            double d5 = ((Entity) value).posX - this.explosionX;
            double d7 = ((Entity) value).posY + (double) ((Entity) value).getEyeHeight() - this.explosionY;
            double d9 = ((Entity) value).posZ - this.explosionZ;
            double d13 = (double) CompatibleMathHelper.sqrt_double(d5 * d5 + d7 * d7 + d9 * d9);

            if (d13 == 0.0D)
                continue;

            d5 = d5 / d13;
            d7 = d7 / d13;
            d9 = d9 / d13;

            double d14 = (double) compatibility.getBlockDensity(world, vec3d, compatibility.getBoundingBox((Entity) value), this::canCollideWithBlock);
            double d10 = (1.0D - d12) * d14;

            //  entity.attackEntityFrom(compatibility.getDamageSource(this),
            //        (float) ((int) ((d10 * d10 + d10) / 2.0D * 7.0D * (double) f3 + 1.0D)));

            double d11 = 1.0D;
            if ((Entity) value instanceof EntityLivingBase)
                d11 = compatibility.getBlastDamageReduction((EntityLivingBase) (Entity) value, d10);

            ((Entity) value).motionX += d5 * d11;
            ((Entity) value).motionY += d7 * d11;
            ((Entity) value).motionZ += d9 * d11;

            if (!((Entity) value instanceof EntityPlayer))
                continue;

            EntityPlayer entityplayer = (EntityPlayer) (Entity) value;
            if (!compatibility.isSpectator(entityplayer) && (!compatibility.isCreative(entityplayer) || !entityplayer.capabilities.isFlying))
                this.playerKnockbackMap.put(entityplayer, new CompatibleVec3(d5 * d10, d7 * d10, d9 * d10));
        }
    }
    
    public boolean canCollideWithBlock(Block block, CompatibleBlockState metadata) {
        return !compatibility.isBlockPenetratableByBullets(block) && compatibility.canCollideCheck(block, metadata, false);
    }

    /**
     * Does the second part of the explosion (sound, particles, drop spawn)
     */
    public void doExplosionB(boolean spawnParticles, boolean destroyBlocks) {
        if(!world.isRemote && explosionSound != null)
            compatibility.playSound(world, explosionX, explosionY, explosionZ, explosionSound, 4f, (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7f);

        if (this.isSmoking) {
            int counter = 0;
            for (CompatibleBlockPos blockpos : this.affectedBlockPositions) {
                if(counter++ % 2 != 0)
                    continue;

                CompatibleBlockState blockState = compatibility.getBlockAtPosition(world, blockpos);

//                if (spawnParticles) {
//                    for(int i = 0; i < 1; i++) {
//                        double d0 = (double) ((float) blockpos.getBlockPosX() + this.world.rand.nextFloat());
//                        double d1 = (double) ((float) blockpos.getBlockPosY() + this.world.rand.nextFloat());
//                        double d2 = (double) ((float) blockpos.getBlockPosZ() + this.world.rand.nextFloat());
//                        double d3 = d0 - this.explosionX;
//                        double d4 = d1 - this.explosionY;
//                        double d5 = d2 - this.explosionZ;
//                        double d6 = (double) CompatibleMathHelper.sqrt_double(d3 * d3 + d4 * d4 + d5 * d5);
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

                if (destroyBlocks && !compatibility.isAirBlock(blockState)) {
                    if (compatibility.canDropBlockFromExplosion(blockState, this))
                        compatibility.dropBlockAsItemWithChance(this.world, blockState, blockpos, (float)ModernConfigManager.explodedBlockDropChance * (1.0F / this.explosionSize), 0);

                    compatibility.onBlockExploded(world, blockState, blockpos, this);
                }
            }

            if(spawnParticles) {
                for(int i = 0; i < 15; i++) {
                    double pX = explosionX + world.rand.nextGaussian() * 0.8;
                    double pY = explosionY + world.rand.nextGaussian() * 0.9;
                    double pZ = explosionZ + world.rand.nextGaussian() * 0.8;

                    double motionX = world.rand.nextGaussian() * 0.001;
                    double motionY = world.rand.nextGaussian() * 0.0001;
                    double motionZ = world.rand.nextGaussian() * 0.001;

                    modContext.getEffectManager().spawnExplosionSmoke(pX, pY, pZ, motionX, motionY, motionZ, smokeParticleScaleCoefficient, (int)((250 + (int)(world.rand.nextFloat() * 30)) * smokeParticleAgeCoefficient), ExplosionSmokeFX.Behavior.EXPLOSION, smokeParticleTextureName);
                }
            }
        }

        if (!this.isFlaming || !destroyBlocks)
            return;

        for (CompatibleBlockPos blockpos1 : this.affectedBlockPositions) {
            if (compatibility.isAirBlock(world, blockpos1) && compatibility.isFullBlock(compatibility.getBlockBelow(world, blockpos1)) && this.explosionRNG.nextInt(3) == 0)
                compatibility.setBlockToFire(world, blockpos1);
        }
    }

    public Map<EntityPlayer, CompatibleVec3> getPlayerKnockbackMap() {
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

    public List<CompatibleBlockPos> getAffectedBlockPositions() {
        return this.affectedBlockPositions;
    }

    public CompatibleVec3 getPosition() {
        return this.position;
    }
}
