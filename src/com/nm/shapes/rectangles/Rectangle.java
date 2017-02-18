package com.nm.shapes.rectangles;

import com.nm.shapes.Shape;
import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Rectangle extends Shape {

  public Rectangle() {
    super(ShapeType.RECTANGLE);
  }

  public Rectangle(double length, double width) {
    super(ShapeType.RECTANGLE, length, width);
  }
}
