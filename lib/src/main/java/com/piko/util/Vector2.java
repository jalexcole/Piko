package com.piko.util;

public class Vector2 {
    public float x = 0f;
    public float y = 0f;

    public Vector2() {

    }

    public Vector2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void add(Vector2 vector2) {
        this.x += vector2.x;
        this.y += vector2.y;
    }

    public void multiply(float constant) {
        this.x *= constant;
        this.y *= constant;
    }

    public void normal() {
        float length = (float) Math.sqrt(x * x + y * y);
        x = x / length;
        y = y / length;
    }

}
