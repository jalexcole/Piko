package com.piko.math;

import com.gdx.math.Vector2;

public class Transform2D {
    
    Vector2 x;
    Vector2 y;
    Vector2 origin;

    Transform2D() {

    }

    public void setX(Vector2 x) {
        this.x = x;
    }

    public void setY(Vector2 y) {
        this.y = y;
    }

    public void setOrigin(Vector2 origin) {
        this.origin = origin;
    }
}
