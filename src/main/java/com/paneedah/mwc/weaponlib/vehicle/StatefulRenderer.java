package com.paneedah.mwc.weaponlib.vehicle;

public interface StatefulRenderer<State> {
    
    public void render(PartRenderContext<State> context);
}
