package com.paneedah.mwc.utils;

import lombok.Getter;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.util.RecipeBookClient;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.stats.StatisticsManager;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

import static com.paneedah.mwc.proxies.ClientProxy.MC;

@Getter
@SideOnly(Side.CLIENT)
public class PlayerCreatureWrapper extends EntityPlayerSP {

    private EntityLivingBase entityLiving;

    public PlayerCreatureWrapper(World world) {
        super(MC, world, Objects.requireNonNull(MC.getConnection()), new StatisticsManager(), new RecipeBookClient());
    }

    public void setEntityLiving(EntityLivingBase entityLiving) {
        this.entityLiving = entityLiving;
        if (entityLiving != null) {
            updateCoordinates();
        }
    }

    public void updateCoordinates() {
        posX = entityLiving.posX;
        posY = entityLiving.posY;
        posZ = entityLiving.posZ;

        lastTickPosX = entityLiving.lastTickPosX;
        lastTickPosY = entityLiving.lastTickPosY;
        lastTickPosZ = entityLiving.lastTickPosZ;

        height = entityLiving.height;

        cameraYaw = entityLiving.rotationYaw;
        cameraPitch = entityLiving.cameraPitch;

        rotationYaw = entityLiving.rotationYaw;
        rotationPitch = entityLiving.rotationPitch;
        rotationYawHead = entityLiving.rotationYawHead;

        motionX = entityLiving.motionX;
        motionY = entityLiving.motionY;
        motionZ = entityLiving.motionZ;

        chunkCoordX = entityLiving.chunkCoordX;
        chunkCoordY = entityLiving.chunkCoordY;
        chunkCoordZ = entityLiving.chunkCoordZ;

        addedToChunk = entityLiving.addedToChunk;
        arrowHitTimer = entityLiving.arrowHitTimer;
        attackedAtYaw = entityLiving.attackedAtYaw;

        dimension = entityLiving.dimension;
        entityUniqueID = entityLiving.getUniqueID();
        limbSwing = entityLiving.limbSwing;
        limbSwingAmount = entityLiving.limbSwingAmount;
        height = entityLiving.height;
        moveForward = entityLiving.moveForward;
        ticksExisted = entityLiving.ticksExisted;
    }

    @Override
    public float getFovModifier() {
        return 0.5f;
    }

    public boolean isUser() {
        return false; // Ugly huck to allow user self rendering in remote perspective
    }
}
