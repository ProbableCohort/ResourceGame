package com.nm.shapes.spheroids;

import com.nm.shapes.Shape;
import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Spheroid extends Shape {

  private SpheroidOperations spheroidService = new SpheroidService();

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

  public double getDiameter() {
    return diameter;
  }

  public void setDiameter(double diameter) {
    this.diameter = diameter;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}
