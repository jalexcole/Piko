package com.piko;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import com.piko.engine.*;
import com.piko.engine.SwingEngine;
import com.piko.util.*;
public abstract class SimpleApplication {

    private Engine engine = new SwingEngine(this);
    private Queue renderQueue = new LinkedBlockingQueue<Rectangle>();
    public SimpleApplication() {

    }

    public abstract void init();
    public abstract void update(float delta);
    public abstract void draw();
    

    protected void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void rect(int x0, int y0, int x1, int y1, Color color) {
        
    }

    public final void clearRenderQueue() {
        renderQueue = new LinkedBlockingQueue<Rectangle>();
    }

    public void map(int x, int y) {

    }

}