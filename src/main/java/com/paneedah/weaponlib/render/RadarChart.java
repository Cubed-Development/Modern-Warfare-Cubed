package com.paneedah.weaponlib.render;

import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GL11;

import java.util.LinkedList;

import static com.paneedah.mwc.proxies.ClientProxy.MC;
import static com.paneedah.weaponlib.render.gui.ColorPalette.WHITE;

/**
 * Radar Chart UI for visualising gun stats
 */
public class RadarChart {

    private static final double TRANSITION_TIME = 200;
    private static final double TYPE_TIME = 100;

    private static final double TWO_PI = 2 * Math.PI;

    private final String name;

    private String[] titleList;

    private final float[] color;
    private final float radius;

    private final int sides;
    private final double increment;
    private final double rotation;


    private long textTypeTimestamp = System.currentTimeMillis();
    private boolean textLock = false;

    private long lastStateStamp = System.nanoTime();
    private final LinkedList<float[]> states = new LinkedList<>();
    private double transitionProgress = 1.0;

    public RadarChart(String name, int chartColor, float chartAlpha, float radius, int sides) {
        this.name = name;

        float r = (float) (((chartColor & 0xFF0000) >> 16) / 255.0);
        float g = (float) (((chartColor & 0xFF00)
                >> 8) / 255.0);
        float b = (float) ((chartColor & 0xFF) / 255.0);

        color = new float[]{r, g, b, chartAlpha};

        this.radius = radius;
        this.sides = sides;
        increment = TWO_PI / (double) sides;
        rotation = increment * (1.0 / 4.0);
    }

    /**
     * Sets the names for the Radar chart
     */
    public RadarChart withTitles(String[] list) {
        this.titleList = list;
        return this;
    }

    /**
     * Updates the radar chart's stats. Data positions correlate with the names set in {@link RadarChart#withTitles}
     */
    public void updateSet(float[] set) {
        if (states.size() == 1) {
            lastStateStamp = System.currentTimeMillis();
        }
        if (states.size() > 2) {
            states.removeLast();
        }

        states.add(set);
    }

    public void randomizeData() {
        updateSet(new float[]{(float) Math.random(), (float) Math.random(), (float) Math.random(), (float) Math.random(), (float) Math.random()});
    }


    public double getPointRadius(double angle) {
        if (states.isEmpty()) {
            return 0.0;
        }
        int index;
        if (angle == 0) {
            index = 0;
        } else {
            index = (int) Math.floor(angle / increment);
        }

        float value = 0f;
        if (states.size() > 1) {
            float current = states.get(1)[index];
            float previous = states.peek()[index];

            float alpha = (float) ((transitionProgress  * transitionProgress ) * (3 - 2 * transitionProgress ));

            value = previous + (current - previous) * alpha;

        } else {
            value = states.peek()[index];
        }


        return value;

    }


    public void render(double x, double y, int mouseX, int mouseY, double scale) {

        // Update chart
        if (states.size() > 1) {

            transitionProgress  = (System.currentTimeMillis() - lastStateStamp) / TRANSITION_TIME;
            if (transitionProgress  >= 1) {
                lastStateStamp = System.currentTimeMillis();
                states.pop();
                transitionProgress  = 0;
            }
        } else {
            transitionProgress  = 1.0;
        }

        GlStateManager.pushMatrix();
        GlStateManager.translate(x, y, 0);
        GlStateManager.rotate((float) -Math.toDegrees(2 * Math.PI / (5 * 4)), 0, 0, 1);


        Tessellator tessellator = Tessellator.getInstance();
        BufferBuilder bufferBuilder = tessellator.getBuffer();


        // Draw hexagonal grid pattern
        GlStateManager.glLineWidth(1.0f);
        bufferBuilder.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
        for (double m = 0; m <= 1; m += 0.2) {
            for (double a = 0; a <= 2 * Math.PI; a += increment) {
                bufferBuilder.pos(Math.cos(a) * radius * m, Math.sin(a) * radius * m, 0).color(1, 1, 1, color[3]).endVertex();
            }
        }
        tessellator.draw();

        GlStateManager.glLineWidth(1.0f);
        bufferBuilder.begin(GL11.GL_LINES, DefaultVertexFormats.POSITION_COLOR);
        for (double a = 0; a <= 2 * Math.PI; a += increment) {
            bufferBuilder.pos(0, 0, 0).color(1, 1, 1, color[3]).endVertex();
            bufferBuilder.pos(Math.cos(a) * radius, Math.sin(a) * radius, 0).color(1, 1, 1, color[3]).endVertex();
        }
        tessellator.draw();


        GlStateManager.enableBlend();
        GlStateManager.disableTexture2D();
        bufferBuilder.begin(GL11.GL_TRIANGLE_FAN, DefaultVertexFormats.POSITION_COLOR);
        bufferBuilder.pos(0, 0, 0).color(color[0], color[1], color[2], color[3]).endVertex();
        for (double a = 0; a < 2 * Math.PI; a += increment) {
            double point = getPointRadius(a);
            bufferBuilder.pos(Math.cos(a) * radius * point, Math.sin(a) * radius * point, 0).color(color[0], color[1], color[2], color[3]).endVertex();
        }
        bufferBuilder.pos(radius * getPointRadius(0), 0, 0).color(color[0], color[1], color[2], color[3]).endVertex();

        tessellator.draw();


        // Render background grid lines
        GlStateManager.glLineWidth(3.0f);
        bufferBuilder.begin(GL11.GL_LINE_STRIP, DefaultVertexFormats.POSITION_COLOR);
        for (double a = 0; a < TWO_PI; a += increment) {
            double point = getPointRadius(a);
            bufferBuilder.pos(Math.cos(a) * radius * point, Math.sin(a) * radius * point, 0).color(color[0], color[1], color[2], color[3]).endVertex();
        }
        double point = getPointRadius(0);
        bufferBuilder.pos(radius * point, 0, 0).color(color[0], color[1], color[2], color[3]).endVertex();
        tessellator.draw();


        GlStateManager.popMatrix();

        GlStateManager.enableTexture2D();
        double textRadius = radius * 1.1;
        for (double a = 0; a < TWO_PI; a += increment) {


            String text = titleList[(int) Math.floor(a / increment)];

            double d1 = mouseX - x * scale;
            double d2 = mouseY - y * scale;
            double distance = Math.sqrt(d1 * d1 + d2 * d2);

            try {
                if (distance < radius) {
                    double diff = System.currentTimeMillis() - textTypeTimestamp;
                    if (diff > TYPE_TIME && !textLock) {
                        textLock = true;
                        textTypeTimestamp = System.currentTimeMillis();
                    }
                    if (diff < TYPE_TIME) {
                        text = text.substring(1, (int) Math.max(Math.floor((text.length() - 1) * (diff / TYPE_TIME)), 1));

                    }


                } else {
                    textLock = false;
                    text = text.charAt(0) + "";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //text = text.charAt(0) + "";


            double angle = a - rotation;
            double textCenter = (double) MC.fontRenderer.getStringWidth(text) / 2;
            double centerHeight = MC.fontRenderer.FONT_HEIGHT / 2.0;
            MC.fontRenderer.drawStringWithShadow(text, (float) (Math.cos(angle) * textRadius + x - textCenter), (float) (Math.sin(angle) * textRadius + y - centerHeight), WHITE);
        }


    }

}
