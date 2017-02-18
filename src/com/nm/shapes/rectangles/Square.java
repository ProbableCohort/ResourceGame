package com.nm.shapes.rectangles;

import com.nm.shapes.Shape;
import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Square extends Shape {

  public Square() {
    super(ShapeType.SQUARE);
  }

  public Square(double length) {
    super(ShapeType.SQUARE, length, length);
  }
}
