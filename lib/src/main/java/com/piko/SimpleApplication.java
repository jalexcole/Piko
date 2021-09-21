package com.piko;

import com.piko.engine.*;
import com.piko.engine.SwingEngine;
import com.piko.pipeline.RenderQueue;
import com.piko.util.*;
import com.piko.util.Rectangle;
public abstract class SimpleApplication {

    private Engine engine = new SwingEngine(this);
    
    private RenderQueue renderQueue = RenderQueue.getInstance();

    protected SimpleApplication() {

    }

    public abstract void init();
    public abstract void update(float delta);
    public abstract void draw();
    

    protected final void setEngine(Engine engine) {
        this.engine = engine;
    }

    public final void setBackgroundColor(Color color) {
        engine.setBackgroundColor(color);
    }

    public final void rect(int x0, int y0, int x1, int y1, Color color) {
        
    }

    public final void rect(Rectangle rectangle) {
        renderQueue.add(rectangle);
    }

    public final void clearRenderQueue() {
        renderQueue.clear();
    }

    public void map(int x, int y) {

    }

}