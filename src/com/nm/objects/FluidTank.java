package com.nm.objects;

import com.nm.resources.Resource;
import com.nm.shapes.spheroids.Obround;

/**
 * Created by brent on 2/18/17.
 */
public class FluidTank<T extends Resource> extends Container {

  private T type;

  public FluidTank() {
    super(new Obround());
  }

  public FluidTank(T type) {
    this();
    this.type = type;
  }

  public FluidTank(double radius, double length) {
    super(new Obround(radius, length));
  }

  public void add(T type, double amount) {
      this.type = type;
      super.add(amount);
  }

}
