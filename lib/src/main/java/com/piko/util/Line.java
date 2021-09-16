package com.piko.util;

import java.awt.Graphics;

import com.piko.pipeline.Renderable;

public class Line implements Renderable {
    private int x0;
    private int x1;
    private int y0;
    private int y1;
    private Color color = Color.WHITE;

    public Line(int x0, int y0, int x1, int y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
    }

    public Line(int x0, int y0, int x1, int y1, Color color) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.color = color;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(color);
        graphics.drawLine(x0, y0, x1, y1);        
    }
    
}
