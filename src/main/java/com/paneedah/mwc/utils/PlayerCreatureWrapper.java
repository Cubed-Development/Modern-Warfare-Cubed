package com.paneedah.mwc.utils;

import lombok.Getter;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.util.RecipeBookClient;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@Getter
@SideOnly(Side.CLIENT)
public class PlayerCreatureWrapper extends EntityPlayerSP {

    private EntityLivingBase entityLiving;

    public PlayerCreatureWrapper (World world) {
        super(MC, world, MC.getConnection(), new StatisticsManager(), new RecipeBookClient());
    }

    public void setEntityLiving(EntityLivingBase entityLiving) {
        this.entityLiving = entityLiving;
        if(entityLiving != null) {
            updateCoordinates();
        }
    }

    public void updateCoordinates() {
        this.posX = entityLiving.posX;
        this.posY = entityLiving.posY;
        this.posZ = entityLiving.posZ;

        this.lastTickPosX = entityLiving.lastTickPosX;
        this.lastTickPosY = entityLiving.lastTickPosY;
        this.lastTickPosZ = entityLiving.lastTickPosZ;

        this.height = entityLiving.height;

        this.cameraYaw = entityLiving.rotationYaw;
        this.cameraPitch = entityLiving.cameraPitch;

        this.rotationYaw = entityLiving.rotationYaw;
        this.rotationPitch = entityLiving.rotationPitch;
        this.rotationYawHead = entityLiving.rotationYawHead;

        this.motionX = entityLiving.motionX;
        this.motionY = entityLiving.motionY;
        this.motionZ = entityLiving.motionZ;

        this.chunkCoordX = entityLiving.chunkCoordX;
        this.chunkCoordY = entityLiving.chunkCoordY;
        this.chunkCoordZ = entityLiving.chunkCoordZ;

        this.addedToChunk = entityLiving.addedToChunk;
        this.arrowHitTimer = entityLiving.arrowHitTimer;
        this.attackedAtYaw = entityLiving.attackedAtYaw;

        this.dimension = entityLiving.dimension;
        this.entityUniqueID = entityLiving.getUniqueID();
        this.limbSwing = entityLiving.limbSwing;
        this.limbSwingAmount = entityLiving.limbSwingAmount;
        this.height = entityLiving.height;
        this.moveForward = entityLiving.moveForward;
        this.ticksExisted = entityLiving.ticksExisted;
    }

    @Override
    public float getFovModifier() {
        return 0.5F;
    }

    public boolean isUser() {
        return false; // Ugly hack to allow user self rendering in remote perspective
    }
}
