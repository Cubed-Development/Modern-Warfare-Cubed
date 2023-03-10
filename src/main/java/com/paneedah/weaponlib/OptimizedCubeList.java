package com.paneedah.weaponlib;

import net.minecraft.client.model.ModelBox;

import java.util.ArrayList;

public class OptimizedCubeList extends ArrayList<ModelBox> {
    
    private static final long serialVersionUID = 1L;
    private float maxVol;
    
    public static OptimizedCubeList newList() {
        return new OptimizedCubeList();
    }

    @Override
    public boolean add(ModelBox cube) {
        float vol = Math.abs((cube.posX2 - cube.posX1) *  (cube.posY2 - cube.posY1) *  (cube.posZ2 - cube.posZ1));
        if(vol > maxVol) {
            maxVol = vol;
        }
        return super.add(cube);
    }
    
    public float getMaxVol() {
        return maxVol;
    }
    
}
