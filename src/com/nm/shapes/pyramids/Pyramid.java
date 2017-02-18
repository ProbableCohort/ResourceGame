package com.nm.shapes.pyramids;

import com.nm.shapes.Shape;
import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Pyramid extends Shape {

    public Pyramid() {
        super(ShapeType.PYRAMID);
    }

    public Pyramid(double base) {
        this(base, base);
    }

    public Pyramid(double base, double height) {
        this(base, base, height);
    }

    public Pyramid(double length, double width, double height) {
        super(ShapeType.PYRAMID, length, width, height);
    }

}
