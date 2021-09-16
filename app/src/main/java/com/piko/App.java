package com.piko;

import com.piko.util.Color;
import com.piko.util.Rectangle;

public class App extends SimpleApplication {
    public static void main(String[] args) {
        App app = new App();
        
    }
    
    @Override
    public void init() {
        setBackgroundColor(Color.BLUE);
        
    }

    @Override
    public void update(float deltaTime) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        rect(new Rectangle(10, 20, 10, 50, Color.WHITE));
    }
}
