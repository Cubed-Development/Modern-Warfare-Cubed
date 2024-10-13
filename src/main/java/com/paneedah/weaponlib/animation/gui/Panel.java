package com.paneedah.weaponlib.animation.gui;

import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import io.redstudioragnarok.redcore.vectors.Vector2D;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.renderer.GlStateManager;

import java.awt.*;
import java.util.ArrayList;

public class Panel {


    private static final int BUFFER = 5;

    @Getter
    @Setter
    private ArrayList<Button> buttonList = new ArrayList<>();

    private final ArrayList<IElement> elements = new ArrayList<>();

    @Getter
    private final String title;
    @Getter
    @Setter
    private AnimationGUI gui;

    @Getter
    @Setter
    private double positionX;
    @Getter
    @Setter
    private double positionY;
    @Getter
    @Setter
    private double width;
    @Getter
    private double height;
    private double actualHeight;
    @Getter
    @Setter
    private double buttonSize;

    @Getter
    @Setter
    private boolean grabbed = false;
    @Getter
    @Setter
    private Vector2D originalMouseCoords;
    @Getter
    @Setter
    private Vector2D originalPanelCoords;

    @Getter
    @Setter
    private boolean closed = false;

    public Panel(AnimationGUI gui, String title, double x, double y, double buttonSize) {
        this.title = title;
        this.gui = gui;
        positionX = x;
        positionY = y;
        this.buttonSize = buttonSize;
    }


    public void handleButtonClicks(int mouseX, int mouseY) {

        if (mouseX >= positionX && mouseX <= positionX + width && mouseY >= positionY && mouseY <= positionY + height) {
            gui.guiHoverStatus = true;
        }

        boolean clickedButton = false;
        if (!closed) {
            for (Button b : buttonList) {
                if (b.isMouseOver(mouseX, mouseY)) {
                    clickedButton = true;
                    b.onMouseClick();
                    gui.onAction(b);
                }
            }
        }

        for (IElement e : elements) {
            if (e.cancelGrab(mouseX, mouseY)) {
                clickedButton = true;
            }
        }


        if (!clickedButton) {

            if (gui.checkIn2DBox(mouseX, mouseY, positionX + 2, positionY + 2, 6, 6)) {

                if (!closed) {
                    closed = true;
                    height = 10;
                } else {
                    closed = false;
                    height = actualHeight;
                }
            } else if (mouseX >= positionX && mouseX <= positionX + width && mouseY >= positionY && mouseY <= positionY + height) {
                AnimationModeProcessor.getInstance().permissionToDrag = false;
                AnimationModeProcessor.getInstance().leftLock = true;
                grabbed = true;


                originalMouseCoords = new Vector2D(mouseX, mouseY);
                originalPanelCoords = new Vector2D(positionX, positionY);
            }
        }


    }

    public void onMouseReleased(int mouseX, int mouseY) {
        if (grabbed) {


            grabbed = false;
        }

    }

    public void addButtons(Button... buttons) {
        for (Button b : buttons) {
            if (b.size > height) {
                height = b.size + BUFFER * 3;
            }

            width += b.size + BUFFER;

            addButton(b);
        }
        width += BUFFER;


        actualHeight = height;
    }

    public void addButton(Button b) {
        b.id = buttonList.size();
        buttonList.add(b);
    }

    public void addElement(IElement e) {
        if (!elements.isEmpty()) {
            e.push(elements.get(elements.size() - 1).getPush() + 15);
        }
        elements.add(e);
    }

    public void render(int mouseX, int mouseY) {

        if (grabbed) {

            positionX = originalPanelCoords.x - (originalMouseCoords.x - mouseX);
            positionY = originalPanelCoords.y - (originalMouseCoords.y - mouseY);

        }


        if (!closed) {
            AnimationGUI.renderRect(new Color(0x222f3e).darker(), positionX, positionY, width, height);

        } else {
            AnimationGUI.renderRect(new Color(0x222f3e).darker(), positionX, positionY, width, 10);

        }

        Color button = new Color(0x222f3e).darker().darker();

        if (gui.checkIn2DBox(mouseX, mouseY, positionX + 2, positionY + 2, 6, 6)) {
            button = button.darker();
        }

        AnimationGUI.renderRect(button, positionX + 2, positionY + 2, 6, 6);


        if (!closed) {
            for (Button b : buttonList) {

                b.x = (positionX + buttonList.indexOf(b) * 25 + BUFFER);
                b.y = (positionY + BUFFER * 2);
                b.renderButton(mouseX, mouseY);
            }

            for (IElement e : elements) {
                e.render(positionX, positionY, mouseX, mouseY);
            }
        }


        // Render title
        GlStateManager.enableTexture2D();
        AnimationGUI.renderScaledString(title, positionX + 10, positionY + 2, 0.75);
        GlStateManager.disableTexture2D();

    }


    public void setHeight(double height) {
        actualHeight = height;
        this.height = height;
    }


    public static int getBuffer() {
        return BUFFER;
    }


}
