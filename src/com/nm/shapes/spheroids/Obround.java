package com.nm.shapes.spheroids;

/**
 * Created by brent on 2/18/17.
 */
public class Obround extends Spheroid {

  private SpheroidOperations spheroidService = new SpheroidService();

  public Obround() {
    super();
  }

  public Obround(double radius, double length) {
    super();
    this.radius = radius;
    this.length = length;
    this.volume = spheroidService.getVolume(this);
  }
}
