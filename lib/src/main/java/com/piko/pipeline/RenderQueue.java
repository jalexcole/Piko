package com.piko.pipeline;


import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;



public class RenderQueue {
    
    private Queue queue= new ArrayBlockingQueue<Renderable>(256);
    
    private static RenderQueue renderQueue;

    public static RenderQueue getInstance() {
        if (renderQueue != null) {
            return renderQueue;
        }
            renderQueue = new RenderQueue();
            return renderQueue;
    }

    private RenderQueue() {

    }

    public static void clearRenderQueue() {

    }

    public void add(Renderable renderable) {
        queue.add(renderable);
    }
}
