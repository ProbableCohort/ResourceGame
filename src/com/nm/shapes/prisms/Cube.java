package com.nm.shapes.prisms;

import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class Cube extends Prism {

  public Cube() {
    super(ShapeType.SQUARE);
  }

  public Cube(double length) {
    super(ShapeType.SQUARE, length, length, length);
  }
}
