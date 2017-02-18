package com.nm.shapes.pyramids;

import com.nm.shapes.Shape;
import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Pyramid extends Shape {
    private double height;
    private double length;
    private double width;

    public Pyramid() {
        this.name = ShapeType.PYRAMID.getName();
    }

    public Pyramid(double base) {
        this(base, base);
    }

    public Pyramid(double base, double height) {
        this(base, base, height);
    }

    public Pyramid(double length, double width, double height) {
        this.name = ShapeType.PYRAMID.getName();
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
