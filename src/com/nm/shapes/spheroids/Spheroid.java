package com.nm.shapes.spheroids;

import com.nm.shapes.Shape;
import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Spheroid extends Shape {

  protected double diameter;
  protected double radius;

  public Spheroid() {
    super(ShapeType.SPHEROID);
  }

  public Spheroid(double diameter) {
    this.name = ShapeType.SPHEROID.getName();
    this.diameter = diameter;
    this.radius = diameter / 2;
  }
}
