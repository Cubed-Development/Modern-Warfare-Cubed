package com.paneedah.weaponlib;

import com.paneedah.weaponlib.Weapon.ShellCasingEjectDirection;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class EntityShellCasing extends EntityProjectile {

    private static final String TAG_ENTITY_ITEM = "entity_item";

    static final float DEFAULT_INACCURACY = 1f;

    private final Random random = new Random();

    private Weapon weapon;
    private PlayerWeaponInstance weaponInstance;

    @Getter
    private float initialYaw;
    @Getter
    private float initialPitch;
    private float xRotation;
    private float yRotation;
    private float zRotation;
    private float xRotationChange;
    private float yRotationChange;
    private float zRotationChange;

    public EntityShellCasing(World world) {
        super(world);
        setRotations();
    }

    public EntityShellCasing(PlayerWeaponInstance weaponInstance, World world, EntityLivingBase player, float velocity,
                             float gravityVelocity, float inaccuracy) {
        super(world, player, velocity, gravityVelocity, inaccuracy);

        weapon = weaponInstance.getWeapon();
        this.weaponInstance = weaponInstance;
    }

    @Override
    public void setPositionAndDirection(boolean isAiming) {
        setSize(0.001f, 0.001f);
        float forwardOffset = 0.1F + weapon.getShellCasingForwardOffset(); // 0.1f;

        float sideOffset;
        if (weapon.getShellCasingEjectDirection() == ShellCasingEjectDirection.RIGHT) {
            sideOffset = weaponInstance.isAimed() ? weapon.getShellCasingSideOffsetAimed() : weapon.getShellCasingSideOffset();
        } else {
            sideOffset = weaponInstance.isAimed() ? -0.1f : 0f;
        }

        float yOffset = weapon.getShellCasingVerticalOffset();
        if (thrower.isSneaking()) {
            yOffset -= 0.1f;
        } else if (thrower instanceof EntityPlayer) {
            yOffset -= 0.0f;
        }

        setLocationAndAngles(thrower.posX, thrower.posY + (double) thrower.getEyeHeight() + yOffset, thrower.posZ, thrower.rotationYaw, thrower.rotationPitch);

        posX -= (double) (MathHelper.cos(rotationYaw / 180.0F * (float) Math.PI) * sideOffset) + MathHelper.sin(rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F * (float) Math.PI) * forwardOffset;

        // float verticalOffset = ;
        posY += -MathHelper.sin((rotationPitch) / 180.0F * (float) Math.PI) * forwardOffset;

        posZ -= (double) (MathHelper.sin(rotationYaw / 180.0F * (float) Math.PI) * sideOffset) - MathHelper.cos(rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(rotationPitch / 180.0F * (float) Math.PI) * forwardOffset;

        setPosition(posX, posY, posZ);

        float f = velocity;

        float adjustedRotationYaw;
        if (weapon.getShellCasingEjectDirection() == ShellCasingEjectDirection.RIGHT) {
            adjustedRotationYaw = rotationYaw + (weaponInstance.isAimed() ? -10f : -30f);
        } else {
            adjustedRotationYaw = rotationYaw + 0f;
        }

        int directionSignum = weapon.getShellCasingEjectDirection() == ShellCasingEjectDirection.RIGHT ? 1 : -1;

        motionX = directionSignum
                * -(double) (MathHelper.cos(adjustedRotationYaw / 180.0F * (float) Math.PI) * f);

        motionZ = directionSignum
                * (double) (-MathHelper.sin(adjustedRotationYaw / 180.0F * (float) Math.PI) * f);

        motionY = 0;

        motionX *= 0.1;
        motionY *= 0.1;
        motionZ *= 0.1;

        initialYaw = rotationYaw;
        initialPitch = rotationPitch;
        setThrowableHeading(motionX, motionY, motionZ, velocity, inaccuracy);
    }

    private void setRotations() {
        float maxRotationChange = 30f;
        xRotationChange = maxRotationChange * (float) random.nextGaussian();
        yRotationChange = maxRotationChange * (float) random.nextGaussian();
        zRotationChange = maxRotationChange * (float) random.nextGaussian();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        // /*
        // log.trace("Before {} {} {}, velocity: {}, {}, {}, gravity: {}",
        // this.posX, this.posY, this.posZ,
        // this.motionX, this.motionY, this.motionZ, this.gravityVelocity);
        // */

        xRotation += xRotationChange;
        yRotation += yRotationChange;
        zRotation += zRotationChange;

        float rotationSlowdownFactor = 0.95f;
        xRotationChange *= rotationSlowdownFactor;
        yRotationChange *= rotationSlowdownFactor;
        zRotationChange *= rotationSlowdownFactor;

        // /*
        //
        // log.debug("After {} {} {}, velocity: {}, {}, {}, gravity: {}",
        // this.posX, this.posY, this.posZ,
        // this.motionX, this.motionY, this.motionZ, this.gravityVelocity);
        // */
    }

    /**
     */
    @Override
    protected void onImpact(RayTraceResult position) {
        if (!world.isRemote) {
            setDead();
        }
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeInt(Item.getIdFromItem(weapon));
        buffer.writeFloat(initialYaw);
        buffer.writeFloat(initialPitch);
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        weapon = (Weapon) Item.getItemById(buffer.readInt());
        initialYaw = buffer.readFloat();
        initialPitch = buffer.readFloat();
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        Item item = Item.getItemById(tagCompound.getInteger(TAG_ENTITY_ITEM));
        if (item instanceof Weapon) {
            weapon = (Weapon) item;
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setInteger(TAG_ENTITY_ITEM, Item.getIdFromItem(weapon));
    }

    Weapon getWeapon() {
        return weapon;
    }

    boolean isDamageableEntity(Entity entity) {
        return false;
    }

    public float getXRotation() {
        return initialPitch - xRotation;
    }

    public float getYRotation() {
        return yRotation - initialYaw - 90f;
    }

    public float getZRotation() {
        return zRotation;
    }

    @Override
    public void setDead() {
        super.setDead();
        // log.debug("{} despawned", this);
    }

    // Todo: Remove this method and make this class abstract, making it abstract will break stuff but is probably better
    @Override
    public void shoot(double x, double y, double z, float velocity, float inaccuracy) {}
}
