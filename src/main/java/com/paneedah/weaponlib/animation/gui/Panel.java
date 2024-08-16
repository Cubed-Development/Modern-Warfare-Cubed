package com.paneedah.weaponlib.animation.gui;

import com.paneedah.weaponlib.animation.AnimationModeProcessor;
import io.redstudioragnarok.redcore.vectors.Vector2D;
import net.minecraft.client.renderer.GlStateManager;

import java.awt.*;
import java.util.ArrayList;

public class Panel {


    private static final int BUFFER = 5;

    private ArrayList<Button> buttonList = new ArrayList<>();

    private final ArrayList<IElement> elements = new ArrayList<>();

    private final String title;
    private AnimationGUI gui;

    private double positionX;
    private double positionY;
    private double width;
    private double height;
    private double actualHeight;
    private double buttonSize;

    private boolean grabbed = false;
    private Vector2D originalMouseCoords;
    private Vector2D originalPanelCoords;

    private boolean closed = false;

    public Panel(AnimationGUI gui, String title, double x, double y, double buttonSize) {
        this.title = title;
        this.gui = gui;
        this.positionX = x;
        this.positionY = y;
        this.buttonSize = buttonSize;
    }

    public boolean isClosed() {
        return this.closed;
    }

    public void setClosed(boolean bool) {
        this.closed = bool;
    }


    public void handleButtonClicks(int mouseX, int mouseY) {

        if (mouseX >= this.positionX && mouseX <= this.positionX + this.width && mouseY >= this.positionY && mouseY <= this.positionY + height) {
            this.gui.guiHoverStatus = true;
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

            if (this.gui.checkIn2DBox(mouseX, mouseY, this.positionX + 2, this.positionY + 2, 6, 6)) {

                if (!closed) {
                    closed = true;
                    height = 10;
                } else {
                    closed = false;
                    height = actualHeight;
                }
            } else if (mouseX >= this.positionX && mouseX <= this.positionX + this.width && mouseY >= this.positionY && mouseY <= this.positionY + height) {
                AnimationModeProcessor.getInstance().permissionToDrag = false;
                AnimationModeProcessor.getInstance().leftLock = true;
                this.grabbed = true;


                this.originalMouseCoords = new Vector2D(mouseX, mouseY);
                this.originalPanelCoords = new Vector2D(positionX, positionY);
            }
        }


    }

    public void onMouseReleased(int mouseX, int mouseY) {
        if (this.grabbed) {


            grabbed = false;
        }

    }

    public void addButtons(Button... buttons) {
        for (Button b : buttons) {
            if (b.size > this.height) {
                this.height = b.size + BUFFER * 3;
            }

            this.width += b.size + BUFFER;

            addButton(b);
        }
        this.width += BUFFER;


        this.actualHeight = this.height;
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

        if (this.grabbed) {

            positionX = originalPanelCoords.x - (originalMouseCoords.x - mouseX);
            positionY = originalPanelCoords.y - (originalMouseCoords.y - mouseY);

        }


        if (!this.closed) {
            AnimationGUI.renderRect(new Color(0x222f3e).darker(), this.positionX, this.positionY, this.width, this.height);

        } else {
            AnimationGUI.renderRect(new Color(0x222f3e).darker(), this.positionX, this.positionY, this.width, 10);

        }

        Color button = new Color(0x222f3e).darker().darker();

        if (this.gui.checkIn2DBox(mouseX, mouseY, this.positionX + 2, this.positionY + 2, 6, 6)) {
            button = button.darker();
        }

        AnimationGUI.renderRect(button, this.positionX + 2, this.positionY + 2, 6, 6);


        if (!this.closed) {
            for (Button b : buttonList) {

                b.x = (this.positionX + buttonList.indexOf(b) * 25 + BUFFER);
                b.y = (this.positionY + BUFFER * 2);
                b.renderButton(mouseX, mouseY);
            }

            for (IElement e : elements) {
                e.render(this.positionX, this.positionY, mouseX, mouseY);
            }
        }


        // Render title
        GlStateManager.enableTexture2D();
        AnimationGUI.renderScaledString(this.title, this.positionX + 10, this.positionY + 2, 0.75);
        GlStateManager.disableTexture2D();

    }


    public String getTitle() {
        return this.title;
    }

    public ArrayList<Button> getButtonList() {
        return buttonList;
    }


    public void setButtonList(ArrayList<Button> buttonList) {
        this.buttonList = buttonList;
    }


    public AnimationGUI getGui() {
        return gui;
    }


    public void setGui(AnimationGUI gui) {
        this.gui = gui;
    }


    public double getPositionX() {
        return positionX;
    }


    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }


    public double getPositionY() {
        return positionY;
    }


    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }


    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        actualHeight = height;
        this.height = height;
    }


    public double getButtonSize() {
        return buttonSize;
    }


    public void setButtonSize(double buttonSize) {
        this.buttonSize = buttonSize;
    }


    public boolean isGrabbed() {
        return grabbed;
    }


    public void setGrabbed(boolean grabbed) {
        this.grabbed = grabbed;
    }


    public Vector2D getOriginalMouseCoords() {
        return originalMouseCoords;
    }


    public void setOriginalMouseCoords(Vector2D originalMouseCoords) {
        this.originalMouseCoords = originalMouseCoords;
    }


    public Vector2D getOriginalPanelCoords() {
        return originalPanelCoords;
    }


    public void setOriginalPanelCoords(Vector2D originalPanelCoords) {
        this.originalPanelCoords = originalPanelCoords;
    }


    public static int getBuffer() {
        return BUFFER;
    }


}
