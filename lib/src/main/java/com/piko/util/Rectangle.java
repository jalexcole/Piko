package com.piko.util;

import java.awt.Graphics;

import com.piko.pipeline.Renderable;

public class Rectangle extends java.awt.Rectangle implements Renderable {
    
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(this.color);
        graphics.drawRect(this.x, this.y, this.width, this.height);
        
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
    
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(object instanceof Rectangle)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members
        Rectangle c = (Rectangle) object;
        

        if (this.x != c.x) {
            return false;
        } else if (this.y != c.y) {
            return false;
        } else if (this.width != c.width) {
            return false;
        } else if (this.height != c.height) {
            return false;
        } else {
            return true;
        }

        // return false;
    }
}
