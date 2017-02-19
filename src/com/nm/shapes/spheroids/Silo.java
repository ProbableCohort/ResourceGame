package com.nm.shapes.spheroids;

/**
 * @author brent
 * @since 2/19/17.
 */
public class Silo extends Spheroid {

  private SpheroidOperations spheroidService = new SpheroidService();

  public Silo() {
    super();
  }

  public Silo(double radius, double length) {
    super();
    this.radius = radius;
    this.length = length;
    this.volume = spheroidService.getVolume(this);
  }
}
