package com.paneedah.weaponlib.animation.gui;

import com.paneedah.weaponlib.animation.MatrixHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import org.lwjgl.input.Mouse;

import java.awt.Color;

import static com.paneedah.mwc.proxies.ClientProxy.mc;

public class Slider implements IElement{

	private String name;
	
	private double mapStart;
	private double mapEnd;
	private boolean centered;
	private double progress;
	
	private double verticalOffset = 0;
	

	
	private boolean hovered;
	private boolean grabbingSlider;
	
	public Slider(String name, boolean centered, double start, double end) {
		
		this.name = name;
		this.mapStart = start;
		this.mapEnd = end;
		
		this.centered = centered;
		
		if(centered) {
			progress = 0.5;
		}
		
	}
	
	@Override
	public void push(double vertical) {
		verticalOffset += vertical;
		
	}
	
	@Override
	public double getPush() {
		return verticalOffset;
	}
	
	
	@Override
	public void render(double panelX, double panelY, int mouseX, int mouseY) {
		
		
	
		
		double offsetX = 5 + panelX;
		double offsetY = 20 + panelY + verticalOffset;
		double width = 80;
		double sliderBarOffset = width*progress;
		
		hovered = AnimationGUI.getInstance().checkIn2DBox(mouseX, mouseY, offsetX+sliderBarOffset, offsetY-1.75, 2.5, 5.0);
		
		if(hovered && Mouse.isButtonDown(0)) {
			grabbingSlider = true;
		}
		
		if(!Mouse.isButtonDown(0)) {
			grabbingSlider = false;
		}
		

		if(grabbingSlider) {
			progress = (mouseX-offsetX)/width;
			
			// Ensure progress remains within bounds
			progress = MathHelper.clamp(progress, 0, 1.0);
		}
		
		
		
		
			
		
		AnimationGUI.renderRect(Color.yellow, offsetX, offsetY, width, 1.5);
		
		if(!centered) {
			AnimationGUI.renderRect(Color.green, offsetX, offsetY, width*progress, 1.5);

		} else {
			AnimationGUI.renderRect(Color.green, offsetX+(width*0.5), offsetY, width*(progress-0.5), 1.5);

		}
		
		
		Color sliderColor = Color.white;
		if(hovered) {
			sliderColor = sliderColor.darker();
		}
		
		
		AnimationGUI.renderRect(sliderColor, offsetX+sliderBarOffset, offsetY-1.75, 2.5, 5);
		
	
		double cleanValue = getValue()*Math.pow(10, 2);
		cleanValue = Math.floor(cleanValue);
		cleanValue = cleanValue/Math.pow(10, 2);
		//System.out.println("post clean: " + cleanValue);
		String proText = TextFormatting.GOLD + "" + cleanValue;
		
		GlStateManager.enableTexture2D();
		AnimationGUI.renderScaledString(name, offsetX, offsetY-6, 0.5);
		AnimationGUI.renderScaledString(proText, offsetX+width-mc.fontRenderer.getStringWidth(proText)*0.5, offsetY-6, 0.5);
		GlStateManager.disableTexture2D();
	}

	
	public double getValue() {
		if(centered) {
			return MatrixHelper.solveLerp(mapStart, mapEnd, progress-0.5);
		}
		return MatrixHelper.solveLerp(mapStart, mapEnd, progress);
	}
	
	public void setProgress(double progress) {
		this.progress = progress;
	}

	public void setValue(double value) {
		this.progress = value/(mapEnd-mapStart);
		
	}
	
	public double getProgress() {
		return this.progress;
	}
	
	@Override
	public boolean cancelGrab(int mouseX, int mouseY) {
		return hovered || grabbingSlider;
	}
	


}
