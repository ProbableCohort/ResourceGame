package com.nm.shapes;

/**
 * Created by brent on 2/18/17.
 */
public abstract class Shape {
  protected String name;
  protected double height;
  protected double length;
  protected double width;
  protected double volume;
  private boolean is3D = false;

  public Shape() {

  }

  public Shape(ShapeType type) {
    this.name = type.getName();
  }

  public Shape(ShapeType type, double length, double width) {
    this.name = type.getName();
    this.length = length;
    this.width = width;
    this.height = 0d;
    this.is3D = false;
  }

  public Shape(ShapeType type, double length, double width, double height) {
    this.name = type.getName();
    this.height = height;
    this.length = length;
    this.width = width;
    this.is3D = true;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (is3D) {
      this.height = height;
    } else {
      System.out.println("Cannot set the height of a 2D object");
    }
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

  public double getVolume() {
    return volume;
  }
}
