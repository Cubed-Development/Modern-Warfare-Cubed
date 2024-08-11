package com.paneedah.weaponlib.vehicle;

public interface StatefulRenderer<State> {

    public void render(PartRenderContext<State> context);
}
