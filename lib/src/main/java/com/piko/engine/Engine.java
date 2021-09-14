package com.piko.engine;

import java.awt.AWTEvent;

public interface Engine extends Runnable {
    
    public abstract void start();
    public abstract void stop();
    
    public abstract void onEvent(AWTEvent event);

    public abstract void update();
    public abstract void render();
}
