package com.piko.engine;

import java.awt.Canvas;

import javax.swing.JFrame;

import com.piko.SimpleApplication;

public class SwingEngine extends AbstractEngine {
    private boolean running = true;
    private JFrame frame;
    private Canvas canvas;
    private String title = "piko-8";
	
    Thread thread;
    public SwingEngine(SimpleApplication simpleApplication) {
        super(simpleApplication);
        frame = new JFrame();
		frame.setDefaultCloseOperation(0);


		thread = new Thread(this, title);
		run();
    }

@Override
public void run() {
    // TODO Auto-generated method stub
    long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		final double ns = 1000000000.0 / 60.0;
		double delta = 0;
		int frames = 0;
		int updates = 0;
		// requestFocus();
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				update();
				updates++;
				delta--;
			}
			render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println(updates + " ups, " + frames + " fps");
				frame.setTitle(title + "  |  " + updates + " ups, " + frames + " fps");
				updates = 0;
				frames = 0;
			}
		}
		stop();
}

@Override
protected void setSize() {
    // TODO Auto-generated method stub
    
}

@Override
protected void save() {
    // TODO Auto-generated method stub
    
}

@Override
protected void getWindowWidth() {
    // TODO Auto-generated method stub
    
}

@Override
protected void getWindowHeight() {
    // TODO Auto-generated method stub
    
}

@Override
public void start() {
    // TODO Auto-generated method stub
    
}

@Override
public void stop() {
    // TODO Auto-generated method stub
    
}

@Override
public void onEvent() {
    // TODO Auto-generated method stub
    
}

@Override
public void update() {
    simpleApplication.update();
    
}

@Override
public void render() {
    simpleApplication.draw();
    
}


    
}
