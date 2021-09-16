package com.piko.engine;

import java.awt.AWTEvent;
import java.awt.Canvas;
import java.awt.Graphics;

import javax.swing.JFrame;

import com.piko.SimpleApplication;
import com.piko.pipeline.Renderable;
import com.piko.pipeline.RenderQueue;

import com.piko.util.Color;
import com.piko.util.Rectangle;

import java.util.Iterator;

public class CanvasEngine extends Canvas implements Runnable, Engine{
    private SimpleApplication simpleApplication;
    private RenderQueue renderQueue = RenderQueue.getInstance();
    private Thread thread;
    private Color backgroundColor = Color.BLACK;
    private JFrame frame;
    public CanvasEngine(SimpleApplication simpleApplication) {
        super();
        this.simpleApplication = simpleApplication;
        frame = new JFrame();

        thread = new Thread(this, "Piko - 8");

        frame.add(this);
        frame.setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        Iterator<Renderable> iterator = renderQueue.iterator();
        graphics.setColor(backgroundColor);
        while(iterator.hasNext()) {
            
            Renderable item = iterator.next();
            item.draw(graphics);
        }

        renderQueue.clear();
    }

    @Override
    public void start() {
        
    }

    @Override
    public void stop() {
        
    }

    @Override
    public void onEvent(AWTEvent event) {
        
    }

    @Override
    public void update(float delta) {
        simpleApplication.update(delta);
    }

    @Override
    public void render() {
        simpleApplication.draw();
    }

    @Override
    public void setBackgroundColor(Color color) {
        backgroundColor = color;
    }

    @Override
    public void drawRect(Rectangle rectangle) {
        throw(new UnsupportedOperationException());
    }

    @Override
    public void run() {
        
    }
}
