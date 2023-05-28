package com.paneedah.weaponlib.vehicle;


import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class TestMS extends MovingSound
{
    private final EntityPlayer player;
    private final EntityVehicle minecart;

    public TestMS(EntityPlayer playerRiding, EntityVehicle minecart)
    {
        super(minecart.getConfiguration().getRunSound(), SoundCategory.NEUTRAL);
        this.player = playerRiding;
        this.minecart = minecart;
       
        this.attenuationType = ISound.AttenuationType.NONE;
        this.repeat = true;
        this.repeatDelay = 0;
    }

    /**
     * Like the old updateEntity(), except more generic.
     */
    public void update()
    {
        if (!this.minecart.isDead && this.player.isRiding() && this.player.getRidingEntity() == this.minecart)
        {
            float f = MathHelper.sqrt(this.minecart.motionX * this.minecart.motionX + this.minecart.motionZ * this.minecart.motionZ);

            if ((double)f >= 0.01D)
            {
                this.volume = 0.0F + MathHelper.clamp(f, 0.0F, 1.0F) * 0.75F;
            }
            else
            {
                this.volume = 0.0F;
            }
        }
        else
        {
            this.donePlaying = true;
        }
    }
}
