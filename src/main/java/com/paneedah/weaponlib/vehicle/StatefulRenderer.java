package com.paneedah.weaponlib.vehicle;

public interface StatefulRenderer<State> {

    void render(PartRenderContext<State> context);
}
