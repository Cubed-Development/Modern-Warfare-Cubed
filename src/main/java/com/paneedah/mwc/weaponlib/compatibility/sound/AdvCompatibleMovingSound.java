package com.paneedah.mwc.weaponlib.compatibility.sound;

import com.paneedah.mwc.vectors.Vector3D;
import com.paneedah.mwc.weaponlib.compatibility.CompatibleSound;
import net.minecraft.client.audio.MovingSound;
import net.minecraft.util.SoundCategory;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.function.Supplier;

@SideOnly(Side.CLIENT)
public class AdvCompatibleMovingSound extends MovingSound {
    private Supplier<Vector3D> positionProvider;
    private Supplier<Boolean> donePlayingProvider;
   
    

    public boolean shouldFade;
    
    private int type = -1;
    
    private int fadeOutTime = 40;
    private int fadeInTime = 40;
    
    private int fadeTimer = 0;
    private boolean isFadeIn = false;
    private boolean isFade = false;

    public AdvCompatibleMovingSound(CompatibleSound sound, Supplier<Vector3D> positionProvider, Supplier<Boolean> donePlayingProvider, boolean fade) {
        super(sound.getSound(), SoundCategory.BLOCKS);
        this.repeat = true;
        this.volume = 1.5F;
        
       this.shouldFade = fade;
        
        this.positionProvider = positionProvider;
        this.donePlayingProvider = donePlayingProvider;
        //fadeIn();
        
    }
    
    public void fadeIn() {
    	this.volume = 0.0F;
    	fadeTimer = 0;
    	isFadeIn = true;
    	isFade = true;
    }
    
    public void fadeOut() {
    
    	fadeTimer = 0;
    	isFadeIn = false;
    	isFade = true;
    }
    
    public void updateFade() {
    	if(!isFade) return;
    	
    	
    	
    	
    	if(isFadeIn) {
    		
    		++fadeTimer;
    		
    		this.volume = (float) (((double) fadeTimer / (double) fadeInTime))*1.5F;
    		
    		if(fadeTimer >= fadeInTime) {
    			isFade = false;
    			fadeTimer = 0;
    			isFadeIn = false;
    		}
    		/*
    		if(fadeTimer >= fadeInTime) {
    			isFade = false;
    			fadeTimer = 0;
    		}
    		*/
    		
    	} else {
    		
    		++fadeTimer;
    		this.volume = 1.5F - ((float) (((double) fadeTimer / (double) fadeOutTime))*1.5F);
    		
    		if(fadeTimer >= fadeOutTime) {
    			
    			donePlaying = true;
    		}
    	}
    }
    
    
    
    @Override
    public boolean canRepeat() {
    	
    	return true;
    }
    

    public void update() {
    	if(isDonePlaying()) return;
    	
    	
    	if(shouldFade) {
    		if(type == -1) {
        		type = 1;
        		fadeIn();
        	}
        	updateFade();
        	if(!isFade) {
        		if(donePlayingProvider.get()) {
        			this.fadeOutTime = 20;
        			fadeOut();
        		}
        	}
    	}
    	
    	
       
        
        if (!donePlaying) {
			Vector3D position = positionProvider.get();
            this.xPosF = (float) position.x;
            this.yPosF = (float) position.y;
            this.zPosF = (float) position.z;
           
           
            //this.volume = (float) (vehicle.solver.currentRPM/24000.0F);
           
            
            
           // this.pitch = 1.0F + ((float) (vehicle.solver.currentRPM/7000.0F)*0.1F);

            //this.pitch = 1 + this.volume * this.volume;
        }
    }
}
