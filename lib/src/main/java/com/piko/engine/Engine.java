package com.piko.engine;

import java.awt.AWTEvent;

import com.piko.util.Color;
import com.piko.util.Rectangle;

public interface Engine extends Runnable {
    
    public abstract void start();
    public abstract void stop();
    
    public abstract void onEvent(AWTEvent event);

    public abstract void update(float delta);
    public abstract void render();

    public abstract void setBackgroundColor(Color color);
    public abstract void drawRect(Rectangle rectangle);
}
