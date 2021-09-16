package com.piko.util;

import java.awt.Graphics;

import com.piko.pipeline.Renderable;

public class Color extends java.awt.Color implements Renderable {

    public final static Color BLACK = new Color(0, 0, 0);
    public final static Color DARKBLUE = new Color(29, 43, 83);

    public static Color BROWN = new Color(171, 82, 54);
    public static Color DARKGREY = new Color(95, 87, 79);
    public static Color LIGHTGREY = new Color(194, 195, 199);
    public static Color WHITE = new Color(255, 241, 232);
    public static Color RED = new Color(255, 0, 77);
    public static Color ORANGE = new Color(255, 163, 0);
    public static Color YELLOW = new Color(255, 236, 39);

    public static final Color BLUE = new Color(21, 173, 255);
    public Color(int r, int g, int b) {
        super(r, g, b);
    }

    

    @Override
    public void draw(Graphics Graphics) {
        // TODO Auto-generated method stub
        
    }
    
}
