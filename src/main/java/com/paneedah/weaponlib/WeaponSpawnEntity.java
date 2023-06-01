package com.paneedah.weaponlib;

import com.paneedah.mwc.utils.MWCUtil;
import com.paneedah.weaponlib.config.ModernConfigManager;
import com.paneedah.weaponlib.jim.util.HitUtil;
import com.paneedah.weaponlib.network.packets.BloodPacketClient;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.util.List;

import static com.paneedah.mwc.utils.ModReference.log;

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

	private float explosionRadius;
	private float damage = 6f;
	private boolean isDestroyingBlocks;
	private float explosionParticleAgeCoefficient;
	private float smokeParticleAgeCoefficient;
	private float explosionParticleScaleCoefficient;
	private float smokeParticleScaleCoefficient;
	private Weapon weapon;
	private int explosionParticleTextureId;
	private int smokeParticleTextureId;
	public long birthStamp;

	
	public boolean spawnRocketParticles;
	public WeaponSpawnEntity(World world) {
		super(world);
	}

	public WeaponSpawnEntity(
			Weapon weapon,
			World world,
			EntityLivingBase player,
			float speed,
			float gravityVelocity,
			float inaccuracy,
			float damage,
			float explosionRadius,
			boolean isDestroyingBlocks,
			boolean spawnRocketParticles,
			float explosionParticleAgeCoefficient,
			float smokeParticleAgeCoefficient,
			float explosionParticleScaleCoefficient,
			float smokeParticleScaleCoefficient,
			int explosionParticleTextureId,
			int smokeParticleTextureId,
			Material...damageableBlockMaterials)
	{
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
		
		this.birthStamp = System.currentTimeMillis();
		
		this.setSize(0.30F, 0.30F);
	}

	@Override
	public void onUpdate() {
	    super.onUpdate();

	    /*
	    if(System.currentTimeMillis() - birthStamp > 1500) { 
	    	//System.out.println("Killed rogue bullet");
	    	setDead();
	    }
	    */

	}
	

	
	

	/**
	 * see net.minecraft.entity.projectile.EntityThrowable#onImpact(net.minecraft.util.MovingObjectPosition)
	 */
	@Override
	protected void onImpact(RayTraceResult position) {
	    if (world.isRemote) {
			//mc.player.playSound(UniversalSoundLookup.lookupSound("headshotsfx"), 10, 1);
			return;
	    }

	    if (weapon == null)
	        return;

	    if(explosionRadius > 0) {

	    	//PostProcessPipeline.createDistortionPoint((float) position.hitVec.getXCoord(),(float)  position.hitVec.getYCoord(), (float) position.hitVec.getZCoord(), 2f, 3000);
	        Explosion.createServerSideExplosion(weapon.getModContext(), world, this,
	                position.hitVec.x, position.hitVec.y, position.hitVec.z,
	                explosionRadius, false, true, isDestroyingBlocks, explosionParticleAgeCoefficient,
	                smokeParticleAgeCoefficient, explosionParticleScaleCoefficient, smokeParticleScaleCoefficient,
	                weapon.getModContext().getRegisteredTexture(explosionParticleTextureId), 
	                weapon.getModContext().getRegisteredTexture(smokeParticleTextureId), 
	                weapon.getModContext().getExplosionSound());
	    } else if(position.entityHit != null) {

            //Projectiles projectilesConfig = weapon.getModContext().getConfigurationManager().getProjectiles();

            if(this.getThrower() != null) {
                position.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), damage);
            } else {
                position.entityHit.attackEntityFrom(new DamageSource("thrown"), damage);
            }

            position.entityHit.hurtResistantTime = 0;
            position.entityHit.prevRotationYaw -= 0.3D;

            log.debug("Hit entity {}", position.entityHit);

            NetworkRegistry.TargetPoint point = new NetworkRegistry.TargetPoint(position.entityHit.dimension, this.posX, this.posY, this.posZ, 100);

            //double magnitude = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ) + 1;
            
            double bleedingCoefficient = weapon.getBleedingCoefficient() * ModernConfigManager.enableBleedingOnHit;
            
            if(bleedingCoefficient > 0.0f) {
                int count = (int)(getParticleCount (damage) * bleedingCoefficient);
                log.debug("Generating {} particle(s) per damage {}", count, damage);
                /*
                weapon.getModContext().getChannel().sendToAllAround(new SpawnParticleMessage(
                        SpawnParticleMessage.ParticleType.BLOOD,
                        count,
                        position.entityHit.posX - motionX / magnitude,
                        position.entityHit.posY - motionY / magnitude,
                        position.entityHit.posZ - motionZ / magnitude),
                        point);
                        
                */
                
                RayTraceResult rtr = HitUtil.traceProjectilehit(this, position.entityHit);
                if(rtr != null && rtr.typeOfHit == Type.BLOCK) {
                	weapon.getModContext().getChannel().sendToAllAround(new BloodPacketClient(
                    		rtr.hitVec.x,
                    		rtr.hitVec.y,
                    		rtr.hitVec.z, motionX, motionY, motionZ), point);
                }
                
                
            }

	    } else if(position.typeOfHit == RayTraceResult.Type.BLOCK) {
	        weapon.onSpawnEntityBlockImpact(world, null, this, position);
        }

	    this.setDead();
	}

	@Override
	public void writeSpawnData(ByteBuf buffer) {
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
	public void readSpawnData(ByteBuf buffer) {
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
    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        Item item = Item.getItemById(tagCompound.getInteger(TAG_ENTITY_ITEM));
        if(item instanceof Weapon) {
            weapon = (Weapon) item;
        }
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
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
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

	Weapon getWeapon() {
		return weapon;
	}

	boolean isDamageableEntity(Entity entity) {
		return false;
	}

	int getParticleCount(float damage) {
        return (int) (damage - 1);
    }
	
	@Override
	public boolean canCollideWithBlock(List<BlockPos> violators, Block block, BlockPos pos, IBlockState iBlockState) {
		// TODO Auto-generated method stub
		return !MWCUtil.isPenetrableByBullets(iBlockState) && super.canCollideWithBlock(violators, block, pos, iBlockState);
	}

	
    public Item getSpawnedItem() {
        // TODO Auto-generated method stub
        return null;
    }

	// Todo: Remove this method and make this class abstract, making it abstract will break stuff but is probably better
	@Override
	public void shoot(double x, double y, double z, float velocity, float inaccuracy) {}
}
