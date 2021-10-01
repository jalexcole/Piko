package com.piko.nodes;

import com.gdx.math.*;
import com.piko.math.Transform2D;

public class Node2D extends CanvasItem {
    Vector2 globalPosition;
    float globalRotation;
    float globalRotationDegrees;
    Vector2 globalScale;
    Transform2D globalTransform;
    Vector2 position = Vector2.ZERO;
    float rotation = 0f;
    float rotationDegrees = 0f;
    Vector2 scale = Vector2.ONE;
    Transform2D transform;
    boolean zAsRelative = true;
    int zIndex = 0;
}
