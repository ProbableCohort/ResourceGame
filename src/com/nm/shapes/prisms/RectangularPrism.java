package com.nm.shapes.prisms;

import com.nm.shapes.ShapeType;

/**
 * Created by brent on 2/18/17.
 */
public class RectangularPrism extends Prism {

  public RectangularPrism() {
    super(ShapeType.RECTANGLE);
  }

  public RectangularPrism(double length, double width, double height) {
    super(ShapeType.RECTANGLE, length, width, height);
  }
}
