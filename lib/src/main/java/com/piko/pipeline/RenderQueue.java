package com.piko.pipeline;


import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;



public class RenderQueue implements Queue<Renderable> {
    
    private Queue<Renderable> queue = new ArrayBlockingQueue<>(256);
    
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

    

    @Override
    public boolean addAll(Collection arg0) {
        return queue.addAll(arg0);
    }

    @Override
    public void clear() {
        queue.clear();
        
    }

    @Override
    public boolean contains(Object arg0) {
        return queue.contains(arg0);
    }

    @Override
    public boolean containsAll(Collection arg0) {
        return (queue.containsAll(arg0));
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public Iterator<Renderable> iterator() {
        return queue.iterator();
    }

    @Override
    public boolean remove(Object arg0) {
        return queue.remove(arg0);
    }

    @Override
    public boolean removeAll(Collection arg0) {
        return queue.removeAll(arg0);
    }

    @Override
    public boolean retainAll(Collection arg0) {
        return queue.retainAll(arg0);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public Object[] toArray() {
        return queue.toArray();
    }

    @Override
    public Object[] toArray(Object[] arg0) {
        return queue.toArray(arg0);
    }

    @Override
    public boolean add(Renderable arg0) {
        return queue.add(arg0);
    }

    @Override
    public Renderable element() {
        return queue.element();
    }

    @Override
    public boolean offer(Renderable arg0) {
        return queue.offer(arg0);
    }

    @Override
    public Renderable peek() {
        return queue.peek();
    }

    @Override
    public Renderable poll() {
        return queue.poll();
    }

    @Override
    public Renderable remove() {
        return queue.remove();
    }

    
}
