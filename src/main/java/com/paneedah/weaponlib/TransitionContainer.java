package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.Transition;
import net.minecraft.client.renderer.GlStateManager;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TransitionContainer {

	private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom = new LinkedHashMap<>();
	private List<Transition<RenderContext<RenderableState>>> firstPerson;
	private List<Transition<RenderContext<RenderableState>>> leftHand;
	private List<Transition<RenderContext<RenderableState>>> rightHand;

	private long duration;

	public TransitionContainer() {}
	
	public TransitionContainer(LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom,
			List<Transition<RenderContext<RenderableState>>> fps, List<Transition<RenderContext<RenderableState>>> left,
			List<Transition<RenderContext<RenderableState>>> right) {
		this.custom = custom;
		this.firstPerson = fps;
		this.leftHand = left;
		this.rightHand = right;

	}

	public void build(WeaponRenderer.Builder wr) {

		// Null check for main
		if (firstPerson == null) {
			firstPerson = Collections.singletonList(new Transition<>(
					wr.firstPersonPositioning, WeaponRenderer.DEFAULT_ANIMATION_DURATION));
		}

		// Define duration
		
		for (Transition<RenderContext<RenderableState>> t : firstPerson) {
			//duration += t.getDuration();
		//	duration += 0;
		}
		
		

		GlStateManager.pushMatrix();
		// Build left hand
		if (leftHand == null) {
			leftHand = firstPerson.stream().map(t -> new Transition<RenderContext<RenderableState>>(c -> {
				
				wr.firstPersonLeftHandTransform.applyTransformations();
				
			}, 0)).collect(Collectors.toList());
		}
		GlStateManager.popMatrix();

		// Build right hand
		GlStateManager.pushMatrix();
		if (rightHand == null) {
			rightHand = firstPerson.stream().map(t -> new Transition<RenderContext<RenderableState>>(c -> {
				
				wr.firstPersonRightHandTransform.applyTransformations();
				
			}, 0)).collect(Collectors.toList());
		}
		GlStateManager.popMatrix();

		// build custom
		custom.forEach((p, t) -> {
			if (t.size() != firstPerson.size()) {
				throw new IllegalStateException("Custom reloading transition number mismatch. Expected "
						+ firstPerson.size() + ", actual: " + t.size());
			}
		});

	}

	public LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> getCustom() {
		return custom;
	}

	public void setCustom(LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom) {
		this.custom = custom;
	}

	public List<Transition<RenderContext<RenderableState>>> getFirstPerson() {
		return firstPerson;
	}

	public void setFirstPerson(List<Transition<RenderContext<RenderableState>>> firstPerson) {
		this.firstPerson = firstPerson;
	}

	public List<Transition<RenderContext<RenderableState>>> getLeftHand() {
		return leftHand;
	}

	public void setLeftHand(List<Transition<RenderContext<RenderableState>>> leftHand) {
		this.leftHand = leftHand;
	}

	public List<Transition<RenderContext<RenderableState>>> getRightHand() {
		return rightHand;
	}

	public void setRightHand(List<Transition<RenderContext<RenderableState>>> rightHand) {
		this.rightHand = rightHand;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration() {
		this.duration = 0;
		for(Transition<RenderContext<RenderableState>> t : this.firstPerson) {
			this.duration += t.getDuration();
		}
		
		//this.duration = duration;
	}

}
