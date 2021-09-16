package com.piko.engine;

import java.awt.AWTEvent;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

import com.piko.util.Color;
import com.piko.util.Rectangle;
import com.piko.SimpleApplication;
import com.piko.pipeline.RenderQueue;

public class SwingEngine extends AbstractEngine {
    private boolean running = true;
    private JFrame frame;
    private Canvas canvas;
    private String title = "piko-8";
	private Graphics graphics;
	private int screenWidth = 160;
	private int screenHeight = 144;
	
	private int scale = 3;

	private int[] pixels = new int[screenHeight * screenWidth];


	private Color backgroundColor = Color.BLACK;
    private Thread thread;
	private RenderQueue renderQueue = RenderQueue.getInstance();

    public SwingEngine(SimpleApplication simpleApplication) {
        super(simpleApplication);
        frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		canvas = new Canvas();
		frame.add(canvas);
		
		frame.setResizable(false);
		canvas.setSize(screenWidth * scale, screenHeight * scale);
		thread = new Thread(this, title);
		graphics = canvas.getGraphics();
		// canvas.paint(graphics);
		frame.pack();
		frame.setVisible(true);
		thread.start();
    }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		long lastTime = System.nanoTime();
		long timer = System.currentTimeMillis();
		final double ns = 1000000000.0 / 60.0;
		float delta = 0f;
		int frames = 0;
		int updates = 0;
		// requestFocus();
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				update(delta);
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
public void update(float delta) {
    simpleApplication.update(delta);
    
}

@Override
public void render() {
	// canvas.
	canvas.setBackground(this.backGroundColor);
    simpleApplication.draw();
    
}

@Override
public void onEvent(AWTEvent event) {
	// TODO Auto-generated method stub
	
}

@Override
public void setBackgroundColor(Color color) {
	graphics.setColor(color);
	this.backGroundColor = color;
}

@Override
public void drawRect(Rectangle rectangle) {
	// TODO Auto-generated method stub
	// graphics.drawRect(rectangle.x,
	// 				  rectangle.y, 
	// 				  rectangle.width, 
	// 				  rectangle.height);
	
}


    
}
