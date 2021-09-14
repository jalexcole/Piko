package com.piko.engine;

import com.piko.SimpleApplication;
import com.piko.util.Color;

public abstract class AbstractEngine implements Runnable, Engine{
    
    protected Color backGroundColor = Color.BLACK;
    protected SimpleApplication simpleApplication; 

    protected AbstractEngine(SimpleApplication simpleApplication) {
        this.simpleApplication = simpleApplication;
    }

    protected abstract void setSize();
    protected abstract void save();
    protected abstract void getWindowWidth();
    protected abstract void getWindowHeight();

    
    public abstract void onEvent();

}
