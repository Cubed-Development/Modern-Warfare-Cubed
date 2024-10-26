package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.EntityBounceable;
import com.paneedah.weaponlib.ModContext;
import io.netty.buffer.ByteBuf;
import lombok.Getter;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

@Getter
public abstract class AbstractEntityGrenade extends EntityBounceable {

    private static final String TAG_ENTITY_ITEM = "entity_item";

    protected ItemGrenade itemGrenade;

    protected AbstractEntityGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, thrower.world, thrower, velocity, gravityVelocity, rotationSlowdownFactor);
        this.itemGrenade = itemGrenade;
    }

    public AbstractEntityGrenade(World world) {
        super(world);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        Item item = Item.getItemById(tagCompound.getInteger(TAG_ENTITY_ITEM));
        if (item instanceof ItemGrenade) {
            itemGrenade = (ItemGrenade) item;
        }
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound tagCompound) {
        super.writeEntityToNBT(tagCompound);
        tagCompound.setInteger(TAG_ENTITY_ITEM, Item.getIdFromItem(itemGrenade));
    }

    @Override
    public void writeSpawnData(ByteBuf buffer) {
        super.writeSpawnData(buffer);
        buffer.writeInt(Item.getIdFromItem(itemGrenade));
    }

    @Override
    public void readSpawnData(ByteBuf buffer) {
        super.readSpawnData(buffer);
        Item item = Item.getItemById(buffer.readInt());
        if (item instanceof ItemGrenade) {
            itemGrenade = (ItemGrenade) item;
        }
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        onGrenadeUpdate();
    }

    protected abstract void onGrenadeUpdate();

    @Override
    public void onBounce(RayTraceResult movingobjectposition) {

        if (movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK && itemGrenade != null) {
            SoundEvent bounceHardSound = itemGrenade.getBounceHardSound();
            if (bounceHardSound != null) {
                IBlockState iBlockState = world.getBlockState(new BlockPos(movingobjectposition.getBlockPos().getX(), movingobjectposition.getBlockPos().getY(), movingobjectposition.getBlockPos().getZ()));
                Material material = iBlockState.getMaterial();

                if (material == Material.ROCK || material == Material.IRON || material == Material.ICE || material == Material.WOOD) {
                    playSound(bounceHardSound, 2.0f / (bounceCount + 1f), 1.0f);
                }
            }

            SoundEvent bounceSoftSound = itemGrenade.getBounceSoftSound();
            if (bounceSoftSound != null) {
                IBlockState iBlockState = world.getBlockState(new BlockPos(movingobjectposition.getBlockPos().getX(), movingobjectposition.getBlockPos().getY(), movingobjectposition.getBlockPos().getZ()));
                Material material = iBlockState.getMaterial();

                if (material == Material.ROCK || material == Material.IRON || material == Material.ICE || material == Material.WOOD) {
                    playSound(bounceHardSound, 1.0f / (bounceCount + 1f), 1.0f);
                }
            }
        }
    }

}
