package com.nm.shapes.spheroids;

/**
 * Created by brent on 2/18/17.
 */
public class Obround extends Spheroid {

  public Obround() {
    super();
  }

  public Obround(double radius, double length) {
    super();
    this.radius = radius;
    this.length = length;
    double sphereVolume = (4/3) * Math.PI * Math.pow(radius, 3);
    double cylinderVolume = Math.PI * Math.pow(radius, 2) * length;
    this.volume = sphereVolume + cylinderVolume;
  }
}
