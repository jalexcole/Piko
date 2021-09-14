package com.piko.util;

import com.piko.pipeline.Renderable;

public class Rectangle extends java.awt.Rectangle implements Renderable {
    
    private Color color;

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color.WHITE;
    }

    Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        
    }
}
