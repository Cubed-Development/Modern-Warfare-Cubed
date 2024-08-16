package com.paneedah.weaponlib.animation.gui;

public interface IElement {

    boolean cancelGrab(int mouseX, int mouseY);

    void render(double panelX, double panelY, int mouseX, int mouseY);

    void push(double vertical);

    double getPush();
}
