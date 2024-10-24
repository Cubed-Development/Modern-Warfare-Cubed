package com.paneedah.weaponlib;

import com.paneedah.weaponlib.animation.Transition;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.GlStateManager;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class TransitionContainer {

    @Setter
    private LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom = new LinkedHashMap<>();
    @Setter
    private List<Transition<RenderContext<RenderableState>>> firstPerson;
    @Setter
    private List<Transition<RenderContext<RenderableState>>> leftHand;
    @Setter
    private List<Transition<RenderContext<RenderableState>>> rightHand;

    private long duration;

    public TransitionContainer() {}

    public TransitionContainer(LinkedHashMap<Part, List<Transition<RenderContext<RenderableState>>>> custom,
                               List<Transition<RenderContext<RenderableState>>> fps, List<Transition<RenderContext<RenderableState>>> left,
                               List<Transition<RenderContext<RenderableState>>> right) {
        this.custom = custom;
        firstPerson = fps;
        leftHand = left;
        rightHand = right;

    }

    public void build(WeaponRenderer.Builder wr) {

        // Null check for main
        if (firstPerson == null) {
            firstPerson = Collections.singletonList(new Transition<>(
                    wr.firstPersonPositioning, WeaponRenderer.DEFAULT_ANIMATION_DURATION));
        }

        // Define duration

        //duration += t.getDuration();
        //	duration += 0;


        GlStateManager.pushMatrix();
        // Build left hand
        if (leftHand == null) {
            leftHand = firstPerson.stream().map(t -> new Transition<RenderContext<RenderableState>>(c -> {

                wr.firstPersonLeftHandTransform.doGLDirect();

            }, 0)).collect(Collectors.toList());
        }
        GlStateManager.popMatrix();

        // Build right hand
        GlStateManager.pushMatrix();
        if (rightHand == null) {
            rightHand = firstPerson.stream().map(t -> new Transition<RenderContext<RenderableState>>(c -> {

                wr.firstPersonRightHandTransform.doGLDirect();

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

    public void setDuration() {
        duration = 0;
        for (Transition<RenderContext<RenderableState>> t : firstPerson) {
            duration += t.getDuration();
        }

        //this.duration = duration;
    }

}
