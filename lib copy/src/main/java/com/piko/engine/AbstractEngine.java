package com.piko.engine;

import com.piko.SimpleApplication;

public abstract class AbstractEngine implements Runnable{
    SimpleApplication simpleApplication; 

    protected AbstractEngine(SimpleApplication simpleApplication) {
        this.simpleApplication = simpleApplication;
    }

    protected abstract void setSize();
    protected abstract void save();
    protected abstract void getWindowWidth();
    protected abstract void getWindowHeight();

    public abstract void start();
    public abstract void stop();
    
    public abstract void onEvent();

    public abstract void update();
    public abstract void render();
}
