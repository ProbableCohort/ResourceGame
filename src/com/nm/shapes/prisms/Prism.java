package com.nm.shapes.prisms;

import com.nm.shapes.Shape;
import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Prism extends Shape {
  public Prism(ShapeType type) {
    super(type);
  }

  public Prism(ShapeType type, double length, double width, double height) {
    super(type, length, width, height);
  }
}
