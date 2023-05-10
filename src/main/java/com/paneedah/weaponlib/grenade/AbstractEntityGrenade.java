package com.paneedah.weaponlib.grenade;

import com.paneedah.weaponlib.EntityBounceable;
import com.paneedah.weaponlib.ModContext;
import com.paneedah.weaponlib.compatibility.CompatibleSound;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import static com.paneedah.weaponlib.compatibility.CompatibilityProvider.compatibility;

public abstract class AbstractEntityGrenade extends EntityBounceable {

    private static final String TAG_ENTITY_ITEM = "entity_item";

    protected ItemGrenade itemGrenade;

    protected AbstractEntityGrenade(ModContext modContext, ItemGrenade itemGrenade, EntityLivingBase thrower, float velocity, float gravityVelocity, float rotationSlowdownFactor) {
        super(modContext, compatibility.world(thrower), thrower, velocity, gravityVelocity, rotationSlowdownFactor);
        this.itemGrenade = itemGrenade;
    }

    public AbstractEntityGrenade(World world) {
        super(world);
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound tagCompound) {
        super.readEntityFromNBT(tagCompound);
        Item item = Item.getItemById(tagCompound.getInteger(TAG_ENTITY_ITEM));
        if(item instanceof ItemGrenade) {
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
        if(item instanceof ItemGrenade) {
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
    	
        if(movingobjectposition.typeOfHit == RayTraceResult.Type.BLOCK && itemGrenade != null) {
            CompatibleSound bounceHardSound = itemGrenade.getBounceHardSound();
            if(bounceHardSound != null) {
                IBlockState iBlockState = compatibility.getBlockAtPosition(compatibility.world(this), movingobjectposition);
                if(compatibility.madeFromHardMaterial(iBlockState)) {
                    compatibility.playSoundAtEntity(this, bounceHardSound, 2.0f / (bounceCount + 1f), 1.0f);
                }
            }

            CompatibleSound bounceSoftSound = itemGrenade.getBounceSoftSound();
            if(bounceSoftSound != null) {
                IBlockState iBlockState = compatibility.getBlockAtPosition(compatibility.world(this), movingobjectposition);
                if(!compatibility.madeFromHardMaterial(iBlockState)) {
                    compatibility.playSoundAtEntity(this, bounceSoftSound, 1.0f / (bounceCount + 1f), 1.0f);
                }
            }
        }
    }

    public ItemGrenade getItemGrenade() {
        return itemGrenade;
    }

    @Override
    public boolean canCollideWithBlock(Block block, IBlockState iBlockState) {
        return !compatibility.isBlockPenetratableByGrenades(block) && super.canCollideWithBlock(block, iBlockState);
    }
}
