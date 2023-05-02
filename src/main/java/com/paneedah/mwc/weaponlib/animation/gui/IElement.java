package com.paneedah.mwc.weaponlib.animation.gui;

public interface IElement {

	public boolean cancelGrab(int mouseX, int mouseY);
	public void render(double panelX, double panelY, int mouseX, int mouseY);
	public void push(double vertical);
	public double getPush();
}
